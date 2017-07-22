package gov.nist.hla.ii;

import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class InterObjReceptionImpl implements InterObjReception {

	private static final Logger log = LogManager
			.getLogger(InterObjReceptionImpl.class);

	@Override
	public abstract void receiveInteraction(Double timeStep, String interactionName,
			Map<String, String> parameters);

	@Override
	public abstract void receiveObject(Double timeStep, String objectClassName, String objectName,
			Map<String, String> attributes);
	
}
