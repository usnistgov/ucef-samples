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

import org.ieee.standards.ieee1516._2010.AttributeType;
import org.ieee.standards.ieee1516._2010.DimensionsType2;
import org.ieee.standards.ieee1516._2010.IdentifierType;
import org.ieee.standards.ieee1516._2010.OrderType;
import org.ieee.standards.ieee1516._2010.OwnershipType;
import org.ieee.standards.ieee1516._2010.ReferenceType;
import org.ieee.standards.ieee1516._2010.SharingType;
import org.ieee.standards.ieee1516._2010.UpdateType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getUpdateType <em>Update Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getUpdateCondition <em>Update Condition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getSharing <em>Sharing</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getTransportation <em>Transportation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getOrder <em>Order</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.AttributeTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeTypeImpl extends MinimalEObjectImpl.Container implements AttributeType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected IdentifierType name;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType dataType;

	/**
	 * The cached value of the '{@link #getUpdateType() <em>Update Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateType()
	 * @generated
	 * @ordered
	 */
	protected UpdateType updateType;

	/**
	 * The cached value of the '{@link #getUpdateCondition() <em>Update Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateCondition()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String updateCondition;

	/**
	 * The cached value of the '{@link #getOwnership() <em>Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnership()
	 * @generated
	 * @ordered
	 */
	protected OwnershipType ownership;

	/**
	 * The cached value of the '{@link #getSharing() <em>Sharing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSharing()
	 * @generated
	 * @ordered
	 */
	protected SharingType sharing;

	/**
	 * The cached value of the '{@link #getDimensions() <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDimensions()
	 * @generated
	 * @ordered
	 */
	protected DimensionsType2 dimensions;

	/**
	 * The cached value of the '{@link #getTransportation() <em>Transportation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransportation()
	 * @generated
	 * @ordered
	 */
	protected ReferenceType transportation;

	/**
	 * The cached value of the '{@link #getOrder() <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrder()
	 * @generated
	 * @ordered
	 */
	protected OrderType order;

	/**
	 * The cached value of the '{@link #getSemantics() <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemantics()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String semantics;

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
	protected AttributeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getAttributeType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(IdentifierType newName, NotificationChain msgs) {
		IdentifierType oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(IdentifierType newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDataType(ReferenceType newDataType, NotificationChain msgs) {
		ReferenceType oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__DATA_TYPE, oldDataType, newDataType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(ReferenceType newDataType) {
		if (newDataType != dataType) {
			NotificationChain msgs = null;
			if (dataType != null)
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType getUpdateType() {
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateType(UpdateType newUpdateType, NotificationChain msgs) {
		UpdateType oldUpdateType = updateType;
		updateType = newUpdateType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE, oldUpdateType, newUpdateType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateType(UpdateType newUpdateType) {
		if (newUpdateType != updateType) {
			NotificationChain msgs = null;
			if (updateType != null)
				msgs = ((InternalEObject)updateType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE, null, msgs);
			if (newUpdateType != null)
				msgs = ((InternalEObject)newUpdateType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE, null, msgs);
			msgs = basicSetUpdateType(newUpdateType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE, newUpdateType, newUpdateType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getUpdateCondition() {
		return updateCondition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateCondition(org.ieee.standards.ieee1516._2010.String newUpdateCondition, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldUpdateCondition = updateCondition;
		updateCondition = newUpdateCondition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION, oldUpdateCondition, newUpdateCondition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateCondition(org.ieee.standards.ieee1516._2010.String newUpdateCondition) {
		if (newUpdateCondition != updateCondition) {
			NotificationChain msgs = null;
			if (updateCondition != null)
				msgs = ((InternalEObject)updateCondition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION, null, msgs);
			if (newUpdateCondition != null)
				msgs = ((InternalEObject)newUpdateCondition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION, null, msgs);
			msgs = basicSetUpdateCondition(newUpdateCondition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION, newUpdateCondition, newUpdateCondition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipType getOwnership() {
		return ownership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnership(OwnershipType newOwnership, NotificationChain msgs) {
		OwnershipType oldOwnership = ownership;
		ownership = newOwnership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__OWNERSHIP, oldOwnership, newOwnership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnership(OwnershipType newOwnership) {
		if (newOwnership != ownership) {
			NotificationChain msgs = null;
			if (ownership != null)
				msgs = ((InternalEObject)ownership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__OWNERSHIP, null, msgs);
			if (newOwnership != null)
				msgs = ((InternalEObject)newOwnership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__OWNERSHIP, null, msgs);
			msgs = basicSetOwnership(newOwnership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__OWNERSHIP, newOwnership, newOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingType getSharing() {
		return sharing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSharing(SharingType newSharing, NotificationChain msgs) {
		SharingType oldSharing = sharing;
		sharing = newSharing;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__SHARING, oldSharing, newSharing);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSharing(SharingType newSharing) {
		if (newSharing != sharing) {
			NotificationChain msgs = null;
			if (sharing != null)
				msgs = ((InternalEObject)sharing).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__SHARING, null, msgs);
			if (newSharing != null)
				msgs = ((InternalEObject)newSharing).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__SHARING, null, msgs);
			msgs = basicSetSharing(newSharing, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__SHARING, newSharing, newSharing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType2 getDimensions() {
		return dimensions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDimensions(DimensionsType2 newDimensions, NotificationChain msgs) {
		DimensionsType2 oldDimensions = dimensions;
		dimensions = newDimensions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__DIMENSIONS, oldDimensions, newDimensions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDimensions(DimensionsType2 newDimensions) {
		if (newDimensions != dimensions) {
			NotificationChain msgs = null;
			if (dimensions != null)
				msgs = ((InternalEObject)dimensions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__DIMENSIONS, null, msgs);
			if (newDimensions != null)
				msgs = ((InternalEObject)newDimensions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__DIMENSIONS, null, msgs);
			msgs = basicSetDimensions(newDimensions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__DIMENSIONS, newDimensions, newDimensions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType getTransportation() {
		return transportation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransportation(ReferenceType newTransportation, NotificationChain msgs) {
		ReferenceType oldTransportation = transportation;
		transportation = newTransportation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION, oldTransportation, newTransportation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportation(ReferenceType newTransportation) {
		if (newTransportation != transportation) {
			NotificationChain msgs = null;
			if (transportation != null)
				msgs = ((InternalEObject)transportation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION, null, msgs);
			if (newTransportation != null)
				msgs = ((InternalEObject)newTransportation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION, null, msgs);
			msgs = basicSetTransportation(newTransportation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION, newTransportation, newTransportation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType getOrder() {
		return order;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOrder(OrderType newOrder, NotificationChain msgs) {
		OrderType oldOrder = order;
		order = newOrder;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__ORDER, oldOrder, newOrder);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrder(OrderType newOrder) {
		if (newOrder != order) {
			NotificationChain msgs = null;
			if (order != null)
				msgs = ((InternalEObject)order).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__ORDER, null, msgs);
			if (newOrder != null)
				msgs = ((InternalEObject)newOrder).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__ORDER, null, msgs);
			msgs = basicSetOrder(newOrder, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__ORDER, newOrder, newOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getSemantics() {
		return semantics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSemantics(org.ieee.standards.ieee1516._2010.String newSemantics, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldSemantics = semantics;
		semantics = newSemantics;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__SEMANTICS, oldSemantics, newSemantics);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemantics(org.ieee.standards.ieee1516._2010.String newSemantics) {
		if (newSemantics != semantics) {
			NotificationChain msgs = null;
			if (semantics != null)
				msgs = ((InternalEObject)semantics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject)newSemantics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.ATTRIBUTE_TYPE__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.ATTRIBUTE_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.ATTRIBUTE_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.ATTRIBUTE_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE:
				return basicSetUpdateType(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION:
				return basicSetUpdateCondition(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__OWNERSHIP:
				return basicSetOwnership(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__SHARING:
				return basicSetSharing(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__DIMENSIONS:
				return basicSetDimensions(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION:
				return basicSetTransportation(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__ORDER:
				return basicSetOrder(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__SEMANTICS:
				return basicSetSemantics(null, msgs);
			case _2010Package.ATTRIBUTE_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.ATTRIBUTE_TYPE__NAME:
				return getName();
			case _2010Package.ATTRIBUTE_TYPE__DATA_TYPE:
				return getDataType();
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE:
				return getUpdateType();
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION:
				return getUpdateCondition();
			case _2010Package.ATTRIBUTE_TYPE__OWNERSHIP:
				return getOwnership();
			case _2010Package.ATTRIBUTE_TYPE__SHARING:
				return getSharing();
			case _2010Package.ATTRIBUTE_TYPE__DIMENSIONS:
				return getDimensions();
			case _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION:
				return getTransportation();
			case _2010Package.ATTRIBUTE_TYPE__ORDER:
				return getOrder();
			case _2010Package.ATTRIBUTE_TYPE__SEMANTICS:
				return getSemantics();
			case _2010Package.ATTRIBUTE_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.ATTRIBUTE_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.ATTRIBUTE_TYPE__NOTES:
				return getNotes();
			case _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.ATTRIBUTE_TYPE__NAME:
				setName((IdentifierType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((ReferenceType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE:
				setUpdateType((UpdateType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION:
				setUpdateCondition((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__OWNERSHIP:
				setOwnership((OwnershipType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__SHARING:
				setSharing((SharingType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__DIMENSIONS:
				setDimensions((DimensionsType2)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION:
				setTransportation((ReferenceType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ORDER:
				setOrder((OrderType)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__SEMANTICS:
				setSemantics((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.ATTRIBUTE_TYPE__NAME:
				setName((IdentifierType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__DATA_TYPE:
				setDataType((ReferenceType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE:
				setUpdateType((UpdateType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION:
				setUpdateCondition((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__OWNERSHIP:
				setOwnership((OwnershipType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__SHARING:
				setSharing((SharingType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__DIMENSIONS:
				setDimensions((DimensionsType2)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION:
				setTransportation((ReferenceType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ORDER:
				setOrder((OrderType)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__SEMANTICS:
				setSemantics((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.ATTRIBUTE_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.ATTRIBUTE_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.ATTRIBUTE_TYPE__NAME:
				return name != null;
			case _2010Package.ATTRIBUTE_TYPE__DATA_TYPE:
				return dataType != null;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_TYPE:
				return updateType != null;
			case _2010Package.ATTRIBUTE_TYPE__UPDATE_CONDITION:
				return updateCondition != null;
			case _2010Package.ATTRIBUTE_TYPE__OWNERSHIP:
				return ownership != null;
			case _2010Package.ATTRIBUTE_TYPE__SHARING:
				return sharing != null;
			case _2010Package.ATTRIBUTE_TYPE__DIMENSIONS:
				return dimensions != null;
			case _2010Package.ATTRIBUTE_TYPE__TRANSPORTATION:
				return transportation != null;
			case _2010Package.ATTRIBUTE_TYPE__ORDER:
				return order != null;
			case _2010Package.ATTRIBUTE_TYPE__SEMANTICS:
				return semantics != null;
			case _2010Package.ATTRIBUTE_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.ATTRIBUTE_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.ATTRIBUTE_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.ATTRIBUTE_TYPE__ANY_ATTRIBUTE:
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

} //AttributeTypeImpl
