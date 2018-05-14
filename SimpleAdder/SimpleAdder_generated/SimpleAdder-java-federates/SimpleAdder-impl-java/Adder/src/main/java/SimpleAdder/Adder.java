package SimpleAdder;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.ObjectReflector;
import org.cpswt.hla.ObjectRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * An adder federate that receives an unknown number of operands logical time step that are used to compute a sum. This
 * example federate demonstrates how to receive object updates, and how to publish an HLA interaction class.
 * 
 * See {@link #sendAdderOutput} for how to publish an interaction.
 * 
 * See {@link #handleObjectClass(Operand)} for how to receive an object reflection.
 */
public class Adder extends AdderBase {

    private final static Logger log = LogManager.getLogger(Adder.class);

    double currentTime = 0;
    
    /**
     * The sum of the operands received in the current logical time step.
     */
    private double sum = 0;

    public Adder(FederateConfig params) throws Exception {
        super(params);
    }

    private void CheckReceivedSubscriptions(String s) {

        ObjectReflector reflector = null;
        while ((reflector = getNextObjectReflectorNoWait()) != null) {
            reflector.reflect();
            ObjectRoot object = reflector.getObjectRoot();
            if (object instanceof Operand) {
                handleObjectClass((Operand) object);
            }
            log.info("Object received and handled: " + s);
        }
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        if(!super.isLateJoiner()) {
            readyToRun();
        }

        startAdvanceTimeThread();

        // this is the exit condition of the following while loop
        // it is used to break the loop so that latejoiner federates can
        // notify the federation manager that they left the federation
        boolean exitCondition = false;

        while (true) {
            currentTime += super.getStepSize();

            atr.requestSyncStart();
            enteredTimeGrantedState();
            
            log.info("t={}", this.getCurrentTime());
            sum = 0; // reset the sum before we check for received operands (next line)
            CheckReceivedSubscriptions("Main Loop");
            sendAdderOutput();

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;

            if(exitCondition) {
                break;
            }
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    /**
     * This method will be called by {@link #CheckReceivedSubscriptions(String)} when an object instance is updated by
     * another federate in the federation. It will not be invoked when a federate updates its own object instances. The
     * attributes of the object passed to this method may have been set in a prior logical time step; the passed object
     * represents the complete state of the object in the federation, not just the values received in the last update.
     * 
     * @param object The local state for an object that received an update this logical time step
     */
    private void handleObjectClass(Operand object) {
        log.trace("handleObjectClass {}", object.toString());
        
        // 1. Get attributes from the object using the WebGME generated methods get_<AttributeName>
        sum += object.get_value();
        log.info("\treceived operand: {}", object.get_value());
    }
    
    /**
     * This method publishes the computed sum to the rest of the federation.
     * 
     * @throws Exception An exception thrown when sendInteraction fails for any reason
     */
    private void sendAdderOutput()
            throws Exception {
        log.trace("sendAdderOutput");
        
        // 1. Create the interaction instance using the WebGME generated method create_<InteractionClassName>
        AdderOutput output = create_AdderOutput();
        // 2. Set the interaction parameters using the WebGME generated methods set_<ParameterName>
        output.set_sum(sum);
        // 3. Publish the interaction to HLA for the next logical time step (currentTime has already been incremented)
        output.sendInteraction(getLRC(), currentTime);
    }

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            Adder federate = new Adder(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Adder federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
