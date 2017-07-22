package gov.nist.hla.ii;

import java.util.Map;

import hla.rti.RTIambassador;

public interface InterObjReception {

	void receiveInteraction(Double timeStep, String interactionName,
			Map<String, String> parameters);
	
	void receiveObject(Double timeStep, String objectClassName, String objectName,
			Map<String, String> attributes);
}
