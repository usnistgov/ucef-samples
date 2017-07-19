package gov.nist.hla.ii;

import hla.rti.FederateNotExecutionMember;
import hla.rti.NameNotFound;
import hla.rti.ObjectNotKnown;
import hla.rti.RTIinternalError;

import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleInject extends InterObjInjectionImpl {

	private static final Logger log = LogManager.getLogger(ExampleInject.class);

	InjectionFederate federate;

	private boolean firsttime = true;

	public ExampleInject(InjectionFederate federate) {
		super();
		this.federate = federate;
	}

	@Override
	public Queue<InterObjDef> getPreSynchInteractions() {

		if (firsttime == true){
			firsttime = false;

			String interactionName = federate.formatInteractionName("SimTime");
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put("secondsPerLogicalTime", "6");
			parameters.put("startTime", "1243929600");
			parameters.put("stopTime", "0");
			parameters.put("ignoreTil", "1");
			addInteraction(interactionName, parameters);

		}

		return publications;
	}

	@Override
	public Queue<InterObjDef> getPublications(Double logicalTime) {
		log.trace("getInteractions==>");

		int t = (int) Math.round(logicalTime);
				
		// send out each 4 logical times for late joiners to catch on
		if ( ((t & 0x03) == 0) && (t>0)){
/*
			String interactionName = federate.formatInteractionName("SimTime");
			Map<String, String> parameters = new HashMap<String, String>();
			parameters.put("secondsPerLogicalTime", "6");
			parameters.put("startTime", "1243929600");
			parameters.put("stopTime", "0");
			parameters.put("ignoreTil", "1");
			addInteraction(interactionName, parameters);
*/
		}
		

		return publications;
	}
}
