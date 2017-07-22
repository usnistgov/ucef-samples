/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.DataTypesType;
import org.ieee.standards.ieee1516._2010.DimensionsType1;
import org.ieee.standards.ieee1516._2010.InteractionsType;
import org.ieee.standards.ieee1516._2010.ModelIdentificationType;
import org.ieee.standards.ieee1516._2010.NotesType;
import org.ieee.standards.ieee1516._2010.ObjectModelType;
import org.ieee.standards.ieee1516._2010.ObjectsType;
import org.ieee.standards.ieee1516._2010.ServiceUtilizationType;
import org.ieee.standards.ieee1516._2010.SwitchesType;
import org.ieee.standards.ieee1516._2010.SynchronizationsType;
import org.ieee.standards.ieee1516._2010.TagsType;
import org.ieee.standards.ieee1516._2010.TimeType;
import org.ieee.standards.ieee1516._2010.TransportationsType;
import org.ieee.standards.ieee1516._2010.UpdateRatesType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Model Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getModelIdentification <em>Model Identification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getServiceUtilization <em>Service Utilization</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getTime <em>Time</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getTransportations <em>Transportations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getUpdateRates <em>Update Rates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getNotes1 <em>Notes1</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ObjectModelTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectModelTypeImpl extends MinimalEObjectImpl.Container implements ObjectModelType {
	/**
	 * The cached value of the '{@link #getModelIdentification() <em>Model Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelIdentification()
	 * @generated
	 * @ordered
	 */
	protected ModelIdentificationType modelIdentification;

	/**
	 * The cached value of the '{@link #getServiceUtilization() <em>Service Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceUtilization()
	 * @generated
	 * @ordered
	 */
	protected ServiceUtilizationType serviceUtilization;

	/**
	 * The cached value of the '{@link #getObjects() <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjects()
	 * @generated
	 * @ordered
	 */
	protected ObjectsType objects;

	/**
	 * The cached value of the '{@link #getInteractions() <em>Interactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractions()
	 * @generated
	 * @ordered
	 */
	protected InteractionsType interactions;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType1 dimensions;

	/**
	 * The cached value of the '{@link #getTime() <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTime()
	 * @generated
	 * @ordered
	 */
	protected TimeType time;

	/**
	 * The cached value of the '{@link #getTags() <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags()
	 * @generated
	 * @ordered
	 */
	protected TagsType tags;

	/**
	 * The cached value of the '{@link #getSynchronizations() <em>Synchronizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizations()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationsType synchronizations;

	/**
	 * The cached value of the '{@link #getTransportations() <em>Transportations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportations()
	 * @generated
	 * @ordered
	 */
	protected TransportationsType transportations;

	/**
	 * The cached value of the '{@link #getSwitches() <em>Switches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSwitches()
	 * @generated
	 * @ordered
	 */
	protected SwitchesType switches;

	/**
	 * The cached value of the '{@link #getUpdateRates() <em>Update Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateRates()
	 * @generated
	 * @ordered
	 */
	protected UpdateRatesType updateRates;

	/**
	 * The cached value of the '{@link #getDataTypes() <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataTypes()
	 * @generated
	 * @ordered
	 */
	protected DataTypesType dataTypes;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected NotesType notes;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

	/**
	 * The default value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected static final String IDTAG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdtag() <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdtag()
	 * @generated
	 * @ordered
	 */
	protected String idtag = IDTAG_EDEFAULT;

	/**
	 * The default value of the '{@link #getNotes1() <em>Notes1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes1()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NOTES1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes1() <em>Notes1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes1()
	 * @generated
	 * @ordered
	 */
	protected List<String> notes1 = NOTES1_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnyAttribute() <em>Any Attribute</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnyAttribute()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap anyAttribute;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectModelTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getObjectModelType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelIdentificationType getModelIdentification() {
		return modelIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelIdentification(ModelIdentificationType newModelIdentification, NotificationChain msgs) {
		ModelIdentificationType oldModelIdentification = modelIdentification;
		modelIdentification = newModelIdentification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION, oldModelIdentification, newModelIdentification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModelIdentification(ModelIdentificationType newModelIdentification) {
		if (newModelIdentification != modelIdentification) {
			NotificationChain msgs = null;
			if (modelIdentification != null)
				msgs = ((InternalEObject)modelIdentification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION, null, msgs);
			if (newModelIdentification != null)
				msgs = ((InternalEObject)newModelIdentification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION, null, msgs);
			msgs = basicSetModelIdentification(newModelIdentification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION, newModelIdentification, newModelIdentification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUtilizationType getServiceUtilization() {
		return serviceUtilization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceUtilization(ServiceUtilizationType newServiceUtilization, NotificationChain msgs) {
		ServiceUtilizationType oldServiceUtilization = serviceUtilization;
		serviceUtilization = newServiceUtilization;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION, oldServiceUtilization, newServiceUtilization);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceUtilization(ServiceUtilizationType newServiceUtilization) {
		if (newServiceUtilization != serviceUtilization) {
			NotificationChain msgs = null;
			if (serviceUtilization != null)
				msgs = ((InternalEObject)serviceUtilization).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION, null, msgs);
			if (newServiceUtilization != null)
				msgs = ((InternalEObject)newServiceUtilization).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION, null, msgs);
			msgs = basicSetServiceUtilization(newServiceUtilization, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION, newServiceUtilization, newServiceUtilization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectsType getObjects() {
		return objects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjects(ObjectsType newObjects, NotificationChain msgs) {
		ObjectsType oldObjects = objects;
		objects = newObjects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__OBJECTS, oldObjects, newObjects);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjects(ObjectsType newObjects) {
		if (newObjects != objects) {
			NotificationChain msgs = null;
			if (objects != null)
				msgs = ((InternalEObject)objects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__OBJECTS, null, msgs);
			if (newObjects != null)
				msgs = ((InternalEObject)newObjects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__OBJECTS, null, msgs);
			msgs = basicSetObjects(newObjects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__OBJECTS, newObjects, newObjects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsType getInteractions() {
		return interactions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractions(InteractionsType newInteractions, NotificationChain msgs) {
		InteractionsType oldInteractions = interactions;
		interactions = newInteractions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS, oldInteractions, newInteractions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractions(InteractionsType newInteractions) {
		if (newInteractions != interactions) {
			NotificationChain msgs = null;
			if (interactions != null)
				msgs = ((InternalEObject)interactions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS, null, msgs);
			if (newInteractions != null)
				msgs = ((InternalEObject)newInteractions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS, null, msgs);
			msgs = basicSetInteractions(newInteractions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS, newInteractions, newInteractions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType1 getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType1 newDimensions, NotificationChain msgs) {
		DimensionsType1 oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType1 newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType getTime() {
		return time;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTime(TimeType newTime, NotificationChain msgs) {
		TimeType oldTime = time;
		time = newTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TIME, oldTime, newTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTime(TimeType newTime) {
		if (newTime != time) {
			NotificationChain msgs = null;
			if (time != null)
				msgs = ((InternalEObject)time).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TIME, null, msgs);
			if (newTime != null)
				msgs = ((InternalEObject)newTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TIME, null, msgs);
			msgs = basicSetTime(newTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TIME, newTime, newTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsType getTags() {
		return tags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags(TagsType newTags, NotificationChain msgs) {
		TagsType oldTags = tags;
		tags = newTags;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TAGS, oldTags, newTags);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTags(TagsType newTags) {
		if (newTags != tags) {
			NotificationChain msgs = null;
			if (tags != null)
				msgs = ((InternalEObject)tags).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TAGS, null, msgs);
			if (newTags != null)
				msgs = ((InternalEObject)newTags).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TAGS, null, msgs);
			msgs = basicSetTags(newTags, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TAGS, newTags, newTags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationsType getSynchronizations() {
		return synchronizations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizations(SynchronizationsType newSynchronizations, NotificationChain msgs) {
		SynchronizationsType oldSynchronizations = synchronizations;
		synchronizations = newSynchronizations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS, oldSynchronizations, newSynchronizations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizations(SynchronizationsType newSynchronizations) {
		if (newSynchronizations != synchronizations) {
			NotificationChain msgs = null;
			if (synchronizations != null)
				msgs = ((InternalEObject)synchronizations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS, null, msgs);
			if (newSynchronizations != null)
				msgs = ((InternalEObject)newSynchronizations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS, null, msgs);
			msgs = basicSetSynchronizations(newSynchronizations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS, newSynchronizations, newSynchronizations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationsType getTransportations() {
		return transportations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportations(TransportationsType newTransportations, NotificationChain msgs) {
		TransportationsType oldTransportations = transportations;
		transportations = newTransportations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS, oldTransportations, newTransportations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportations(TransportationsType newTransportations) {
		if (newTransportations != transportations) {
			NotificationChain msgs = null;
			if (transportations != null)
				msgs = ((InternalEObject)transportations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS, null, msgs);
			if (newTransportations != null)
				msgs = ((InternalEObject)newTransportations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS, null, msgs);
			msgs = basicSetTransportations(newTransportations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS, newTransportations, newTransportations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchesType getSwitches() {
		return switches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSwitches(SwitchesType newSwitches, NotificationChain msgs) {
		SwitchesType oldSwitches = switches;
		switches = newSwitches;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SWITCHES, oldSwitches, newSwitches);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSwitches(SwitchesType newSwitches) {
		if (newSwitches != switches) {
			NotificationChain msgs = null;
			if (switches != null)
				msgs = ((InternalEObject)switches).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SWITCHES, null, msgs);
			if (newSwitches != null)
				msgs = ((InternalEObject)newSwitches).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__SWITCHES, null, msgs);
			msgs = basicSetSwitches(newSwitches, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__SWITCHES, newSwitches, newSwitches));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRatesType getUpdateRates() {
		return updateRates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateRates(UpdateRatesType newUpdateRates, NotificationChain msgs) {
		UpdateRatesType oldUpdateRates = updateRates;
		updateRates = newUpdateRates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES, oldUpdateRates, newUpdateRates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateRates(UpdateRatesType newUpdateRates) {
		if (newUpdateRates != updateRates) {
			NotificationChain msgs = null;
			if (updateRates != null)
				msgs = ((InternalEObject)updateRates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES, null, msgs);
			if (newUpdateRates != null)
				msgs = ((InternalEObject)newUpdateRates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES, null, msgs);
			msgs = basicSetUpdateRates(newUpdateRates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES, newUpdateRates, newUpdateRates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType getDataTypes() {
		return dataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataTypes(DataTypesType newDataTypes, NotificationChain msgs) {
		DataTypesType oldDataTypes = dataTypes;
		dataTypes = newDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES, oldDataTypes, newDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataTypes(DataTypesType newDataTypes) {
		if (newDataTypes != dataTypes) {
			NotificationChain msgs = null;
			if (dataTypes != null)
				msgs = ((InternalEObject)dataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES, null, msgs);
			if (newDataTypes != null)
				msgs = ((InternalEObject)newDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES, null, msgs);
			msgs = basicSetDataTypes(newDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES, newDataTypes, newDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNotes(NotesType newNotes, NotificationChain msgs) {
		NotesType oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__NOTES, oldNotes, newNotes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(NotesType newNotes) {
		if (newNotes != notes) {
			NotificationChain msgs = null;
			if (notes != null)
				msgs = ((InternalEObject)notes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__NOTES, null, msgs);
			if (newNotes != null)
				msgs = ((InternalEObject)newNotes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.OBJECT_MODEL_TYPE__NOTES, null, msgs);
			msgs = basicSetNotes(newNotes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__NOTES, newNotes, newNotes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.OBJECT_MODEL_TYPE__ANY);
		}
		return any;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdtag() {
		return idtag;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdtag(String newIdtag) {
		String oldIdtag = idtag;
		idtag = newIdtag;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNotes1() {
		return notes1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes1(List<String> newNotes1) {
		List<String> oldNotes1 = notes1;
		notes1 = newNotes1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.OBJECT_MODEL_TYPE__NOTES1, oldNotes1, notes1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE);
		}
		return anyAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
				return basicSetModelIdentification(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
				return basicSetServiceUtilization(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
				return basicSetObjects(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
				return basicSetInteractions(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
				return basicSetTime(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
				return basicSetTags(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
				return basicSetSynchronizations(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
				return basicSetTransportations(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
				return basicSetSwitches(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
				return basicSetUpdateRates(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
				return basicSetDataTypes(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
				return basicSetNotes(null, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				return ((InternalEList<?>)getAnyAttribute()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
				return getModelIdentification();
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
				return getServiceUtilization();
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
				return getObjects();
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
				return getInteractions();
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
				return getDimensions();
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
				return getTime();
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
				return getTags();
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
				return getSynchronizations();
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
				return getTransportations();
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
				return getSwitches();
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
				return getUpdateRates();
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
				return getDataTypes();
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
				return getNotes();
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.OBJECT_MODEL_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.OBJECT_MODEL_TYPE__NOTES1:
				return getNotes1();
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				if (coreType) return getAnyAttribute();
				return ((FeatureMap.Internal)getAnyAttribute()).getWrapper();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
				setModelIdentification((ModelIdentificationType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
				setServiceUtilization((ServiceUtilizationType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
				setObjects((ObjectsType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
				setInteractions((InteractionsType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
				setDimensions((DimensionsType1)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
				setTime((TimeType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
				setTags((TagsType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
				setSynchronizations((SynchronizationsType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
				setTransportations((TransportationsType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
				setSwitches((SwitchesType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
				setUpdateRates((UpdateRatesType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
				setNotes((NotesType)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__NOTES1:
				setNotes1((List<String>)newValue);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				((FeatureMap.Internal)getAnyAttribute()).set(newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
				setModelIdentification((ModelIdentificationType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
				setServiceUtilization((ServiceUtilizationType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
				setObjects((ObjectsType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
				setInteractions((InteractionsType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
				setDimensions((DimensionsType1)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
				setTime((TimeType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
				setTags((TagsType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
				setSynchronizations((SynchronizationsType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
				setTransportations((TransportationsType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
				setSwitches((SwitchesType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
				setUpdateRates((UpdateRatesType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
				setDataTypes((DataTypesType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
				setNotes((NotesType)null);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.OBJECT_MODEL_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__NOTES1:
				setNotes1(NOTES1_EDEFAULT);
				return;
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				getAnyAttribute().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case _2010Package.OBJECT_MODEL_TYPE__MODEL_IDENTIFICATION:
				return modelIdentification != null;
			case _2010Package.OBJECT_MODEL_TYPE__SERVICE_UTILIZATION:
				return serviceUtilization != null;
			case _2010Package.OBJECT_MODEL_TYPE__OBJECTS:
				return objects != null;
			case _2010Package.OBJECT_MODEL_TYPE__INTERACTIONS:
				return interactions != null;
			case _2010Package.OBJECT_MODEL_TYPE__DIMENSIONS:
				return dimensions != null;
			case _2010Package.OBJECT_MODEL_TYPE__TIME:
				return time != null;
			case _2010Package.OBJECT_MODEL_TYPE__TAGS:
				return tags != null;
			case _2010Package.OBJECT_MODEL_TYPE__SYNCHRONIZATIONS:
				return synchronizations != null;
			case _2010Package.OBJECT_MODEL_TYPE__TRANSPORTATIONS:
				return transportations != null;
			case _2010Package.OBJECT_MODEL_TYPE__SWITCHES:
				return switches != null;
			case _2010Package.OBJECT_MODEL_TYPE__UPDATE_RATES:
				return updateRates != null;
			case _2010Package.OBJECT_MODEL_TYPE__DATA_TYPES:
				return dataTypes != null;
			case _2010Package.OBJECT_MODEL_TYPE__NOTES:
				return notes != null;
			case _2010Package.OBJECT_MODEL_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.OBJECT_MODEL_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.OBJECT_MODEL_TYPE__NOTES1:
				return NOTES1_EDEFAULT == null ? notes1 != null : !NOTES1_EDEFAULT.equals(notes1);
			case _2010Package.OBJECT_MODEL_TYPE__ANY_ATTRIBUTE:
				return anyAttribute != null && !anyAttribute.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (any: ");
		result.append(any);
		result.append(", idtag: ");
		result.append(idtag);
		result.append(", notes1: ");
		result.append(notes1);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ObjectModelTypeImpl
