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

import org.ieee.standards.ieee1516._2010.ResignSwitchType;
import org.ieee.standards.ieee1516._2010.SwitchType;
import org.ieee.standards.ieee1516._2010.SwitchesType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switches Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAutoProvide <em>Auto Provide</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getConveyRegionDesignatorSets <em>Convey Region Designator Sets</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getConveyProducingFederate <em>Convey Producing Federate</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAttributeScopeAdvisory <em>Attribute Scope Advisory</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAttributeRelevanceAdvisory <em>Attribute Relevance Advisory</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getObjectClassRelevanceAdvisory <em>Object Class Relevance Advisory</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getInteractionRelevanceAdvisory <em>Interaction Relevance Advisory</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getServiceReporting <em>Service Reporting</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getExceptionReporting <em>Exception Reporting</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getDelaySubscriptionEvaluation <em>Delay Subscription Evaluation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAutomaticResignAction <em>Automatic Resign Action</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.SwitchesTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchesTypeImpl extends MinimalEObjectImpl.Container implements SwitchesType {
	/**
	 * The cached value of the '{@link #getAutoProvide() <em>Auto Provide</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutoProvide()
	 * @generated
	 * @ordered
	 */
	protected SwitchType autoProvide;

	/**
	 * The cached value of the '{@link #getConveyRegionDesignatorSets() <em>Convey Region Designator Sets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyRegionDesignatorSets()
	 * @generated
	 * @ordered
	 */
	protected SwitchType conveyRegionDesignatorSets;

	/**
	 * The cached value of the '{@link #getConveyProducingFederate() <em>Convey Producing Federate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConveyProducingFederate()
	 * @generated
	 * @ordered
	 */
	protected SwitchType conveyProducingFederate;

	/**
	 * The cached value of the '{@link #getAttributeScopeAdvisory() <em>Attribute Scope Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeScopeAdvisory()
	 * @generated
	 * @ordered
	 */
	protected SwitchType attributeScopeAdvisory;

	/**
	 * The cached value of the '{@link #getAttributeRelevanceAdvisory() <em>Attribute Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeRelevanceAdvisory()
	 * @generated
	 * @ordered
	 */
	protected SwitchType attributeRelevanceAdvisory;

	/**
	 * The cached value of the '{@link #getObjectClassRelevanceAdvisory() <em>Object Class Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectClassRelevanceAdvisory()
	 * @generated
	 * @ordered
	 */
	protected SwitchType objectClassRelevanceAdvisory;

	/**
	 * The cached value of the '{@link #getInteractionRelevanceAdvisory() <em>Interaction Relevance Advisory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionRelevanceAdvisory()
	 * @generated
	 * @ordered
	 */
	protected SwitchType interactionRelevanceAdvisory;

	/**
	 * The cached value of the '{@link #getServiceReporting() <em>Service Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceReporting()
	 * @generated
	 * @ordered
	 */
	protected SwitchType serviceReporting;

	/**
	 * The cached value of the '{@link #getExceptionReporting() <em>Exception Reporting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExceptionReporting()
	 * @generated
	 * @ordered
	 */
	protected SwitchType exceptionReporting;

	/**
	 * The cached value of the '{@link #getDelaySubscriptionEvaluation() <em>Delay Subscription Evaluation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelaySubscriptionEvaluation()
	 * @generated
	 * @ordered
	 */
	protected SwitchType delaySubscriptionEvaluation;

	/**
	 * The cached value of the '{@link #getAutomaticResignAction() <em>Automatic Resign Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutomaticResignAction()
	 * @generated
	 * @ordered
	 */
	protected ResignSwitchType automaticResignAction;

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
	 * The default value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected static final List<String> NOTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotes()
	 * @generated
	 * @ordered
	 */
	protected List<String> notes = NOTES_EDEFAULT;

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
	protected SwitchesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getSwitchesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getAutoProvide() {
		return autoProvide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutoProvide(SwitchType newAutoProvide, NotificationChain msgs) {
		SwitchType oldAutoProvide = autoProvide;
		autoProvide = newAutoProvide;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__AUTO_PROVIDE, oldAutoProvide, newAutoProvide);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutoProvide(SwitchType newAutoProvide) {
		if (newAutoProvide != autoProvide) {
			NotificationChain msgs = null;
			if (autoProvide != null)
				msgs = ((InternalEObject)autoProvide).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__AUTO_PROVIDE, null, msgs);
			if (newAutoProvide != null)
				msgs = ((InternalEObject)newAutoProvide).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__AUTO_PROVIDE, null, msgs);
			msgs = basicSetAutoProvide(newAutoProvide, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__AUTO_PROVIDE, newAutoProvide, newAutoProvide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getConveyRegionDesignatorSets() {
		return conveyRegionDesignatorSets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConveyRegionDesignatorSets(SwitchType newConveyRegionDesignatorSets, NotificationChain msgs) {
		SwitchType oldConveyRegionDesignatorSets = conveyRegionDesignatorSets;
		conveyRegionDesignatorSets = newConveyRegionDesignatorSets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS, oldConveyRegionDesignatorSets, newConveyRegionDesignatorSets);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConveyRegionDesignatorSets(SwitchType newConveyRegionDesignatorSets) {
		if (newConveyRegionDesignatorSets != conveyRegionDesignatorSets) {
			NotificationChain msgs = null;
			if (conveyRegionDesignatorSets != null)
				msgs = ((InternalEObject)conveyRegionDesignatorSets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS, null, msgs);
			if (newConveyRegionDesignatorSets != null)
				msgs = ((InternalEObject)newConveyRegionDesignatorSets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS, null, msgs);
			msgs = basicSetConveyRegionDesignatorSets(newConveyRegionDesignatorSets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS, newConveyRegionDesignatorSets, newConveyRegionDesignatorSets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getConveyProducingFederate() {
		return conveyProducingFederate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConveyProducingFederate(SwitchType newConveyProducingFederate, NotificationChain msgs) {
		SwitchType oldConveyProducingFederate = conveyProducingFederate;
		conveyProducingFederate = newConveyProducingFederate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE, oldConveyProducingFederate, newConveyProducingFederate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConveyProducingFederate(SwitchType newConveyProducingFederate) {
		if (newConveyProducingFederate != conveyProducingFederate) {
			NotificationChain msgs = null;
			if (conveyProducingFederate != null)
				msgs = ((InternalEObject)conveyProducingFederate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE, null, msgs);
			if (newConveyProducingFederate != null)
				msgs = ((InternalEObject)newConveyProducingFederate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE, null, msgs);
			msgs = basicSetConveyProducingFederate(newConveyProducingFederate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE, newConveyProducingFederate, newConveyProducingFederate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getAttributeScopeAdvisory() {
		return attributeScopeAdvisory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeScopeAdvisory(SwitchType newAttributeScopeAdvisory, NotificationChain msgs) {
		SwitchType oldAttributeScopeAdvisory = attributeScopeAdvisory;
		attributeScopeAdvisory = newAttributeScopeAdvisory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY, oldAttributeScopeAdvisory, newAttributeScopeAdvisory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeScopeAdvisory(SwitchType newAttributeScopeAdvisory) {
		if (newAttributeScopeAdvisory != attributeScopeAdvisory) {
			NotificationChain msgs = null;
			if (attributeScopeAdvisory != null)
				msgs = ((InternalEObject)attributeScopeAdvisory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY, null, msgs);
			if (newAttributeScopeAdvisory != null)
				msgs = ((InternalEObject)newAttributeScopeAdvisory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY, null, msgs);
			msgs = basicSetAttributeScopeAdvisory(newAttributeScopeAdvisory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY, newAttributeScopeAdvisory, newAttributeScopeAdvisory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getAttributeRelevanceAdvisory() {
		return attributeRelevanceAdvisory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeRelevanceAdvisory(SwitchType newAttributeRelevanceAdvisory, NotificationChain msgs) {
		SwitchType oldAttributeRelevanceAdvisory = attributeRelevanceAdvisory;
		attributeRelevanceAdvisory = newAttributeRelevanceAdvisory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY, oldAttributeRelevanceAdvisory, newAttributeRelevanceAdvisory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeRelevanceAdvisory(SwitchType newAttributeRelevanceAdvisory) {
		if (newAttributeRelevanceAdvisory != attributeRelevanceAdvisory) {
			NotificationChain msgs = null;
			if (attributeRelevanceAdvisory != null)
				msgs = ((InternalEObject)attributeRelevanceAdvisory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY, null, msgs);
			if (newAttributeRelevanceAdvisory != null)
				msgs = ((InternalEObject)newAttributeRelevanceAdvisory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY, null, msgs);
			msgs = basicSetAttributeRelevanceAdvisory(newAttributeRelevanceAdvisory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY, newAttributeRelevanceAdvisory, newAttributeRelevanceAdvisory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getObjectClassRelevanceAdvisory() {
		return objectClassRelevanceAdvisory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectClassRelevanceAdvisory(SwitchType newObjectClassRelevanceAdvisory, NotificationChain msgs) {
		SwitchType oldObjectClassRelevanceAdvisory = objectClassRelevanceAdvisory;
		objectClassRelevanceAdvisory = newObjectClassRelevanceAdvisory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY, oldObjectClassRelevanceAdvisory, newObjectClassRelevanceAdvisory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClassRelevanceAdvisory(SwitchType newObjectClassRelevanceAdvisory) {
		if (newObjectClassRelevanceAdvisory != objectClassRelevanceAdvisory) {
			NotificationChain msgs = null;
			if (objectClassRelevanceAdvisory != null)
				msgs = ((InternalEObject)objectClassRelevanceAdvisory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY, null, msgs);
			if (newObjectClassRelevanceAdvisory != null)
				msgs = ((InternalEObject)newObjectClassRelevanceAdvisory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY, null, msgs);
			msgs = basicSetObjectClassRelevanceAdvisory(newObjectClassRelevanceAdvisory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY, newObjectClassRelevanceAdvisory, newObjectClassRelevanceAdvisory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getInteractionRelevanceAdvisory() {
		return interactionRelevanceAdvisory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionRelevanceAdvisory(SwitchType newInteractionRelevanceAdvisory, NotificationChain msgs) {
		SwitchType oldInteractionRelevanceAdvisory = interactionRelevanceAdvisory;
		interactionRelevanceAdvisory = newInteractionRelevanceAdvisory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY, oldInteractionRelevanceAdvisory, newInteractionRelevanceAdvisory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionRelevanceAdvisory(SwitchType newInteractionRelevanceAdvisory) {
		if (newInteractionRelevanceAdvisory != interactionRelevanceAdvisory) {
			NotificationChain msgs = null;
			if (interactionRelevanceAdvisory != null)
				msgs = ((InternalEObject)interactionRelevanceAdvisory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY, null, msgs);
			if (newInteractionRelevanceAdvisory != null)
				msgs = ((InternalEObject)newInteractionRelevanceAdvisory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY, null, msgs);
			msgs = basicSetInteractionRelevanceAdvisory(newInteractionRelevanceAdvisory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY, newInteractionRelevanceAdvisory, newInteractionRelevanceAdvisory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getServiceReporting() {
		return serviceReporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceReporting(SwitchType newServiceReporting, NotificationChain msgs) {
		SwitchType oldServiceReporting = serviceReporting;
		serviceReporting = newServiceReporting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__SERVICE_REPORTING, oldServiceReporting, newServiceReporting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceReporting(SwitchType newServiceReporting) {
		if (newServiceReporting != serviceReporting) {
			NotificationChain msgs = null;
			if (serviceReporting != null)
				msgs = ((InternalEObject)serviceReporting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__SERVICE_REPORTING, null, msgs);
			if (newServiceReporting != null)
				msgs = ((InternalEObject)newServiceReporting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__SERVICE_REPORTING, null, msgs);
			msgs = basicSetServiceReporting(newServiceReporting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__SERVICE_REPORTING, newServiceReporting, newServiceReporting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getExceptionReporting() {
		return exceptionReporting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetExceptionReporting(SwitchType newExceptionReporting, NotificationChain msgs) {
		SwitchType oldExceptionReporting = exceptionReporting;
		exceptionReporting = newExceptionReporting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING, oldExceptionReporting, newExceptionReporting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExceptionReporting(SwitchType newExceptionReporting) {
		if (newExceptionReporting != exceptionReporting) {
			NotificationChain msgs = null;
			if (exceptionReporting != null)
				msgs = ((InternalEObject)exceptionReporting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING, null, msgs);
			if (newExceptionReporting != null)
				msgs = ((InternalEObject)newExceptionReporting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING, null, msgs);
			msgs = basicSetExceptionReporting(newExceptionReporting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING, newExceptionReporting, newExceptionReporting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType getDelaySubscriptionEvaluation() {
		return delaySubscriptionEvaluation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDelaySubscriptionEvaluation(SwitchType newDelaySubscriptionEvaluation, NotificationChain msgs) {
		SwitchType oldDelaySubscriptionEvaluation = delaySubscriptionEvaluation;
		delaySubscriptionEvaluation = newDelaySubscriptionEvaluation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION, oldDelaySubscriptionEvaluation, newDelaySubscriptionEvaluation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelaySubscriptionEvaluation(SwitchType newDelaySubscriptionEvaluation) {
		if (newDelaySubscriptionEvaluation != delaySubscriptionEvaluation) {
			NotificationChain msgs = null;
			if (delaySubscriptionEvaluation != null)
				msgs = ((InternalEObject)delaySubscriptionEvaluation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION, null, msgs);
			if (newDelaySubscriptionEvaluation != null)
				msgs = ((InternalEObject)newDelaySubscriptionEvaluation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION, null, msgs);
			msgs = basicSetDelaySubscriptionEvaluation(newDelaySubscriptionEvaluation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION, newDelaySubscriptionEvaluation, newDelaySubscriptionEvaluation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignSwitchType getAutomaticResignAction() {
		return automaticResignAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAutomaticResignAction(ResignSwitchType newAutomaticResignAction, NotificationChain msgs) {
		ResignSwitchType oldAutomaticResignAction = automaticResignAction;
		automaticResignAction = newAutomaticResignAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION, oldAutomaticResignAction, newAutomaticResignAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAutomaticResignAction(ResignSwitchType newAutomaticResignAction) {
		if (newAutomaticResignAction != automaticResignAction) {
			NotificationChain msgs = null;
			if (automaticResignAction != null)
				msgs = ((InternalEObject)automaticResignAction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION, null, msgs);
			if (newAutomaticResignAction != null)
				msgs = ((InternalEObject)newAutomaticResignAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION, null, msgs);
			msgs = basicSetAutomaticResignAction(newAutomaticResignAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION, newAutomaticResignAction, newAutomaticResignAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.SWITCHES_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public List<String> getNotes() {
		return notes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotes(List<String> newNotes) {
		List<String> oldNotes = notes;
		notes = newNotes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SWITCHES_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
				return basicSetAutoProvide(null, msgs);
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
				return basicSetConveyRegionDesignatorSets(null, msgs);
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
				return basicSetConveyProducingFederate(null, msgs);
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
				return basicSetAttributeScopeAdvisory(null, msgs);
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
				return basicSetAttributeRelevanceAdvisory(null, msgs);
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
				return basicSetObjectClassRelevanceAdvisory(null, msgs);
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
				return basicSetInteractionRelevanceAdvisory(null, msgs);
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
				return basicSetServiceReporting(null, msgs);
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
				return basicSetExceptionReporting(null, msgs);
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
				return basicSetDelaySubscriptionEvaluation(null, msgs);
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
				return basicSetAutomaticResignAction(null, msgs);
			case _2010Package.SWITCHES_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
				return getAutoProvide();
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
				return getConveyRegionDesignatorSets();
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
				return getConveyProducingFederate();
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
				return getAttributeScopeAdvisory();
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
				return getAttributeRelevanceAdvisory();
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
				return getObjectClassRelevanceAdvisory();
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
				return getInteractionRelevanceAdvisory();
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
				return getServiceReporting();
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
				return getExceptionReporting();
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
				return getDelaySubscriptionEvaluation();
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
				return getAutomaticResignAction();
			case _2010Package.SWITCHES_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.SWITCHES_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.SWITCHES_TYPE__NOTES:
				return getNotes();
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
				setAutoProvide((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
				setConveyRegionDesignatorSets((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
				setConveyProducingFederate((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
				setAttributeScopeAdvisory((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
				setAttributeRelevanceAdvisory((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
				setObjectClassRelevanceAdvisory((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
				setInteractionRelevanceAdvisory((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
				setServiceReporting((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
				setExceptionReporting((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
				setDelaySubscriptionEvaluation((SwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
				setAutomaticResignAction((ResignSwitchType)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.SWITCHES_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
				setAutoProvide((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
				setConveyRegionDesignatorSets((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
				setConveyProducingFederate((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
				setAttributeScopeAdvisory((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
				setAttributeRelevanceAdvisory((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
				setObjectClassRelevanceAdvisory((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
				setInteractionRelevanceAdvisory((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
				setServiceReporting((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
				setExceptionReporting((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
				setDelaySubscriptionEvaluation((SwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
				setAutomaticResignAction((ResignSwitchType)null);
				return;
			case _2010Package.SWITCHES_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.SWITCHES_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.SWITCHES_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SWITCHES_TYPE__AUTO_PROVIDE:
				return autoProvide != null;
			case _2010Package.SWITCHES_TYPE__CONVEY_REGION_DESIGNATOR_SETS:
				return conveyRegionDesignatorSets != null;
			case _2010Package.SWITCHES_TYPE__CONVEY_PRODUCING_FEDERATE:
				return conveyProducingFederate != null;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_SCOPE_ADVISORY:
				return attributeScopeAdvisory != null;
			case _2010Package.SWITCHES_TYPE__ATTRIBUTE_RELEVANCE_ADVISORY:
				return attributeRelevanceAdvisory != null;
			case _2010Package.SWITCHES_TYPE__OBJECT_CLASS_RELEVANCE_ADVISORY:
				return objectClassRelevanceAdvisory != null;
			case _2010Package.SWITCHES_TYPE__INTERACTION_RELEVANCE_ADVISORY:
				return interactionRelevanceAdvisory != null;
			case _2010Package.SWITCHES_TYPE__SERVICE_REPORTING:
				return serviceReporting != null;
			case _2010Package.SWITCHES_TYPE__EXCEPTION_REPORTING:
				return exceptionReporting != null;
			case _2010Package.SWITCHES_TYPE__DELAY_SUBSCRIPTION_EVALUATION:
				return delaySubscriptionEvaluation != null;
			case _2010Package.SWITCHES_TYPE__AUTOMATIC_RESIGN_ACTION:
				return automaticResignAction != null;
			case _2010Package.SWITCHES_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.SWITCHES_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.SWITCHES_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.SWITCHES_TYPE__ANY_ATTRIBUTE:
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
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //SwitchesTypeImpl
