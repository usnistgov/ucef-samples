package SimpleAdder;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * An input source federate that publishes a fixed number of operand objects that are updated each logical time step
 * with random values. This example federate demonstrates how to use a custom configuration file, and how to publish
 * an HLA object class.
 * 
 * See {@link InputSourceConfig} for how to use a custom configuration file.
 * 
 * See {@link InputSource#operands} for how to publish an object instance.
 */
public class InputSource extends InputSourceBase {
    private final static Logger log = LogManager.getLogger();

    private double currentTime = 0;

    /**
     * A list of the HLA operand objects that the input source publishes to the federation.
     * 
     * A federate must define a member variable for each object instance that it publishes. The InputSource federate
     * can publish multiple instances of the Operand object class, and so defines these member variables as a variable
     * length list. After declaration, the object instances must be registered with the federation before they can be
     * used to publish data: see {@link #registerOperandInstances(int)}. A registered object instance can then be used
     * to publish data to the federation: see {@link #updateOperandInstances()}.
     */
    private List<Operand> operands = new LinkedList<Operand>();

    /**
     * The maximum operand value the input source can generate.
     */
    private double maxValue;

    public InputSource(InputSourceConfig params) throws Exception {
        super(params);

        // parse the custom configuration options defined in InputSourceConfig
        if (params.maxValue < 0.0) { // we allow 0.0
            throw new RuntimeException("maxValue cannot be a negative number");
        }
        this.maxValue = params.maxValue;
        
        if (params.numberOfInputs < 0) {
            throw new RuntimeException("numberOfInputs cannot be a negative number");
        }
        if (params.numberOfInputs == 0) {
            throw new RuntimeException("numberOfInputs cannot be 0");
        }
        registerOperandInstances(params.numberOfInputs);
    }

    /**
     * This method registers the specified number of Operand object instances with the HLA federation.
     * 
     * @param numberOfInstances The number of Operand object instances to register with the federation.
     */
    private void registerOperandInstances(int numberOfInstances) {
        log.trace("registerOperandInstances {}", numberOfInstances);
        
        for (int i = 0; i < numberOfInstances; i++) {
            // 1. Create the object instance using the appropriate WebGME code generated Java class.
            Operand objectInstance = new Operand();
            // 2. Register the object instance with the HLA local runtime component (LRC).
            objectInstance.registerObject(getLRC());
            // 3. Keep a reference to the registered object instance within the federate class.
            operands.add(objectInstance);
        }
        log.info("will generate {} operands with a maximum value of {}", operands.size(), this.maxValue);
    }
    
    /**
     * This method publishes a new, random value for each registered Operand to the HLA federation.
     */
    private void updateOperandInstances() {
        log.trace("updateOperandInstances");
        
        for (Operand objectInstance : operands) {
            double randomValue = ThreadLocalRandom.current().nextInt((int)(10*maxValue))/10.0;
            
            // 1. Set the new attribute values in local memory using the WebGME code generated methods.
            objectInstance.set_value(randomValue); // this method will be generated as set_<attributeName>
            // 2. Publish the updates to HLA for the next logical time step (currentTime has already passed)
            objectInstance.updateAttributeValues(getLRC(), currentTime + this.getLookAhead());
            
            log.info("\toperand: {}", randomValue);
        }
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            log.info("turning off time regulation (late joiner)");
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            log.info("waiting on readyToPopulate...");
            readyToPopulate();
            log.info("...synchronized on readyToPopulate");
        }

        if(!super.isLateJoiner()) {
            log.info("waiting on readyToRun...");
            readyToRun();
            log.info("...synchronized on readyToRun");
        }

        startAdvanceTimeThread();
        log.info("started logical time progression");

        while (!exitCondition) {
            atr.requestSyncStart();
            enteredTimeGrantedState();

            log.info("t={}", this.getCurrentTime());
            updateOperandInstances();

            if (!exitCondition) {
                currentTime += super.getStepSize();
                AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
                putAdvanceTimeRequest(newATR);
                atr.requestSyncEnd();
                atr = newATR;
            }
        }

        // call exitGracefully to shut down federate
        exitGracefully();
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            // Replace FederateConfig in the generated code with the Java class for your custom configuration file:
            //  FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            InputSourceConfig federateConfig = federateConfigParser.parseArgs(args, InputSourceConfig.class);
            InputSource federate = new InputSource(federateConfig);
            federate.execute();
            log.info("Done.");
            System.exit(0);
        } catch (Exception e) {
            log.error(e);
            System.exit(1);
        }
    }
}
