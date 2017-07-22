package gov.nist.hla.ii;

import hla.rti.FederateNotExecutionMember;
import hla.rti.NameNotFound;
import hla.rti.ObjectNotKnown;
import hla.rti.RTIinternalError;

import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class InterObjInjectionImpl implements InterObjInjection {

	private static final long serialVersionUID = -3409552497539566001L;

	private static final Logger log = LogManager
			.getLogger(InterObjInjectionImpl.class);

	protected Queue<InterObjDef> publications = new ConcurrentLinkedQueue<InterObjDef>();

	public InterObjInjectionImpl() {
		super();
	}

	@Override
	public abstract Queue<InterObjDef> getPreSynchInteractions();

	@Override
	public abstract Queue<InterObjDef> getPublications(Double logicalTime);
	
	@Override
	public void addInteraction(String interactionName, Map<String, String> parameters) {
		InterObjDef def = new InterObjDef(interactionName, parameters, InterObjDef.TYPE.INTERACTION);
		addInterObj(def);
		log.trace("addInteraction=" + def);
	}
	
	@Override
	public void addObject(String objectName, Map<String, String> attributes) throws NameNotFound, FederateNotExecutionMember, RTIinternalError, ObjectNotKnown {
		InterObjDef def = new InterObjDef(objectName, attributes, InterObjDef.TYPE.OBJECT);
		addInterObj(def);
		log.trace("addObject=" + def);
	}
	
	private void addInterObj(InterObjDef def) {
		publications.add(def);
	}
}
