package gov.nist.hla;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import gov.nist.hla.gateway.GatewayCallback;
import gov.nist.hla.gateway.GatewayFederate;
import gov.nist.hla.gateway.GatewayFederateConfig;

public class CommonFederate {
    private static final Logger log = LogManager.getLogger();
    
    public static void main(String[] args)
            throws IOException, InterruptedException {
        if (args.length != 2) {
            log.error("missing command line arguments for JSON configuration files");
            return;
        }

        // start the Federate A thread using the 1st config
        GatewayFederateConfig configA = GatewayFederate.readConfiguration(args[0]);
        FederateA federateA = new FederateA(configA);
        Thread threadA = new Thread(federateA);
        threadA.start();

        // start the Federate B thread using the 2nd config
        GatewayFederateConfig configB = GatewayFederate.readConfiguration(args[1]);
        FederateB federateB = new FederateB(configB);
        Thread threadB = new Thread(federateB);
        threadB.start();

        // wait for Federate A and Federate B to be at initializeWithPeers()
        while (!federateA.isReadyToInteract() || !federateB.isReadyToInteract()) {
            Thread.sleep(200);
        }

        // initialize both federates before starting time progression
        double timeA = federateA.getLogicalTime();
        double timeB = federateB.getLogicalTime();
        federateA.setRange(federateB.getMin(), federateB.getMax());
        federateA.requestTimeAdvance();
        federateB.requestTimeAdvance();


        // initialize data structures for the while loop
        List<Integer> numbers = new ArrayList<Integer>(); // received from Federation A
        int min, max;

        while(true) {
            // wait for both federates to be at doTimeStep()
            while (!federateA.isReadyToInteract() || !federateB.isReadyToInteract()) {
                Thread.sleep(200);
            }

            // determine if Federate A has advanced time (since the last iteration)
            if (timeA < federateA.getLogicalTime()) {
                log.info("A advanced {} -> {}", timeA, federateA.getLogicalTime());
                timeA = federateA.getLogicalTime();

                // NOTE: this is where we can receive new data from A
                int nextNumber = federateA.getCurrentNumber();
                log.info("A returned the value {}", nextNumber);
                numbers.add(nextNumber);
            }

            // determine if Federate B has advanced time (since the last iteration)
            if (timeB < federateB.getLogicalTime()) {
                log.info("B advanced {} -> {}", timeB, federateB.getLogicalTime());
                timeB = federateB.getLogicalTime();

                // NOTE: this is where we can receive new data from B
                min = federateB.getMin();
                max = federateB.getMax();
                log.info("B returned the range ({}, {})", min, max);

                federateA.setRange(min, max);
            }

            // determine whether to advance the slow federation
            if (((int) timeA) % 10 == 0 && timeA > 0) { // step when A is at 10, 20, 30, ... (0 skipped)
                double average = 0;
                for (int number : numbers) {
                    average += number;
                }
                average /= numbers.size();
                numbers.clear();

                log.info("computed average={}", average);
                
                federateB.setAverage(average);
                federateB.requestTimeAdvance();
            }            
            federateA.requestTimeAdvance();
        }
    }
}
