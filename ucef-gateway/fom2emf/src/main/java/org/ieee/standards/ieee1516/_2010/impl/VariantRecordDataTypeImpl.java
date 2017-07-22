/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.AlternativeType;
import org.ieee.standards.ieee1516._2010.IdentifierType;
import org.ieee.standards.ieee1516._2010.ReferenceType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataType;
import org.ieee.standards.ieee1516._2010.VariantRecordEncodingType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variant Record Data Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getDiscriminant <em>Discriminant</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getAlternative <em>Alternative</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getEncoding <em>Encoding</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.VariantRecordDataTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VariantRecordDataTypeImpl extends MinimalEObjectImpl.Container implements VariantRecordDataType {
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
	 * The cached value of the '{@link #getDiscriminant() <em>Discriminant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscriminant()
	 * @generated
	 * @ordered
	 */
	protected IdentifierType discriminant;

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
	 * The cached value of the '{@link #getAlternative() <em>Alternative</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternative()
	 * @generated
	 * @ordered
	 */
	protected EList<AlternativeType> alternative;

	/**
	 * The cached value of the '{@link #getEncoding() <em>Encoding</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncoding()
	 * @generated
	 * @ordered
	 */
	protected VariantRecordEncodingType encoding;

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
	protected VariantRecordDataTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getVariantRecordDataType();
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__NAME, oldName, newName);
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
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType getDiscriminant() {
		return discriminant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscriminant(IdentifierType newDiscriminant, NotificationChain msgs) {
		IdentifierType oldDiscriminant = discriminant;
		discriminant = newDiscriminant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT, oldDiscriminant, newDiscriminant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscriminant(IdentifierType newDiscriminant) {
		if (newDiscriminant != discriminant) {
			NotificationChain msgs = null;
			if (discriminant != null)
				msgs = ((InternalEObject)discriminant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT, null, msgs);
			if (newDiscriminant != null)
				msgs = ((InternalEObject)newDiscriminant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT, null, msgs);
			msgs = basicSetDiscriminant(newDiscriminant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT, newDiscriminant, newDiscriminant));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE, oldDataType, newDataType);
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
				msgs = ((InternalEObject)dataType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE, null, msgs);
			if (newDataType != null)
				msgs = ((InternalEObject)newDataType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE, null, msgs);
			msgs = basicSetDataType(newDataType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE, newDataType, newDataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AlternativeType> getAlternative() {
		if (alternative == null) {
			alternative = new EObjectContainmentEList<AlternativeType>(AlternativeType.class, this, _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE);
		}
		return alternative;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingType getEncoding() {
		return encoding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEncoding(VariantRecordEncodingType newEncoding, NotificationChain msgs) {
		VariantRecordEncodingType oldEncoding = encoding;
		encoding = newEncoding;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING, oldEncoding, newEncoding);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncoding(VariantRecordEncodingType newEncoding) {
		if (newEncoding != encoding) {
			NotificationChain msgs = null;
			if (encoding != null)
				msgs = ((InternalEObject)encoding).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING, null, msgs);
			if (newEncoding != null)
				msgs = ((InternalEObject)newEncoding).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING, null, msgs);
			msgs = basicSetEncoding(newEncoding, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING, newEncoding, newEncoding));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS, oldSemantics, newSemantics);
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
				msgs = ((InternalEObject)semantics).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS, null, msgs);
			if (newSemantics != null)
				msgs = ((InternalEObject)newSemantics).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS, null, msgs);
			msgs = basicSetSemantics(newSemantics, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS, newSemantics, newSemantics));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.VARIANT_RECORD_DATA_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.VARIANT_RECORD_DATA_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT:
				return basicSetDiscriminant(null, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE:
				return basicSetDataType(null, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE:
				return ((InternalEList<?>)getAlternative()).basicRemove(otherEnd, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING:
				return basicSetEncoding(null, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS:
				return basicSetSemantics(null, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NAME:
				return getName();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT:
				return getDiscriminant();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE:
				return getDataType();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE:
				return getAlternative();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING:
				return getEncoding();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS:
				return getSemantics();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NOTES:
				return getNotes();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NAME:
				setName((IdentifierType)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT:
				setDiscriminant((IdentifierType)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE:
				setDataType((ReferenceType)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE:
				getAlternative().clear();
				getAlternative().addAll((Collection<? extends AlternativeType>)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING:
				setEncoding((VariantRecordEncodingType)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS:
				setSemantics((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NAME:
				setName((IdentifierType)null);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT:
				setDiscriminant((IdentifierType)null);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE:
				setDataType((ReferenceType)null);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE:
				getAlternative().clear();
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING:
				setEncoding((VariantRecordEncodingType)null);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS:
				setSemantics((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NAME:
				return name != null;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DISCRIMINANT:
				return discriminant != null;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__DATA_TYPE:
				return dataType != null;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ALTERNATIVE:
				return alternative != null && !alternative.isEmpty();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ENCODING:
				return encoding != null;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__SEMANTICS:
				return semantics != null;
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.VARIANT_RECORD_DATA_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.VARIANT_RECORD_DATA_TYPE__ANY_ATTRIBUTE:
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

} //VariantRecordDataTypeImpl
