package SimpleAdderObjects;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The InputSource type of federate for the federation designed in WebGME.
 *
 */
public class InputSource extends InputSourceBase {

    private final static Logger log = LogManager.getLogger(InputSource.class);
    
    private int maxValue;
    
    double currentTime = 0;

    ///////////////////////////////////////////////////////////////////////
    // TODO Instantiate objects that must be sent every logical time step
    //
    // Operand vOperand = new Operand();
    //
    ///////////////////////////////////////////////////////////////////////
    private List<Operand> operands = new LinkedList<Operand>();
    
    public InputSource(InputSourceConfig params) throws Exception {
        super(params);
        
        if (params.numOfInputs < 0) {
    		throw new RuntimeException("numOfInputs cannot be a negative integer");
    	}
        if (params.numOfInputs == 0) {
    		log.warn("numOfInputs configured to be 0; will not generate any inputs!");
    	}
        if (params.maxValue < 1) {
        	throw new RuntimeException("maxValue must be >= 1");
        }
        this.maxValue = params.maxValue;
    	
        ///////////////////////////////////////////////////////////////////////
        // TODO Must register object instances after super(args)
        //
        // vOperand.registerObject(getLRC());
        //
        ///////////////////////////////////////////////////////////////////////
        for (int i = 0; i < params.numOfInputs; i++) {
        	Operand nextOperand = new Operand();
        	nextOperand.registerObject(getLRC());
        	operands.add(nextOperand);
        }
        log.info("will generate " + operands.size() + " operands with a maximum value of " + this.maxValue);
    }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead() + CpswtDefaults.EPSILON;
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////
        Random rand = new Random();

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below //
        ///////////////////////////////////////////////////////////////////////

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

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO objects that must be sent every logical time step
            //
            //    vOperand.set_value(<YOUR VALUE HERE >);
            //    vOperand.updateAttributeValues(getLRC(), currentTime);
            //
            //////////////////////////////////////////////////////////////////////////////////////////
            log.info("t=" + currentTime);
            for (Operand nextOperand : operands) {
                int randomInteger = rand.nextInt(this.maxValue) + 1;
                nextOperand.set_value(randomInteger);
                nextOperand.updateAttributeValues(getLRC(), currentTime);
                log.info("\toperand=" + randomInteger);
            }

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

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            InputSourceConfig federateConfig = federateConfigParser.parseArgs(args, InputSourceConfig.class);
            InputSource federate = new InputSource(federateConfig);
            federate.execute();
        } catch (Exception e) {
            log.error("There was a problem executing the InputSource federate: {}", e.getMessage());
            log.error(e);
        }
    }
}
