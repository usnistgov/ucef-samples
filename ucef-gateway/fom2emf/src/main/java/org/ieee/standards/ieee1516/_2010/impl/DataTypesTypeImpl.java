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

import org.ieee.standards.ieee1516._2010.ArrayDataTypesType1;
import org.ieee.standards.ieee1516._2010.BasicDataRepresentationsType;
import org.ieee.standards.ieee1516._2010.DataTypesType;
import org.ieee.standards.ieee1516._2010.EnumeratedDataTypesType;
import org.ieee.standards.ieee1516._2010.FixedRecordDataTypesType;
import org.ieee.standards.ieee1516._2010.SimpleDataTypesType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataTypesType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Data Types Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getBasicDataRepresentations <em>Basic Data Representations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getSimpleDataTypes <em>Simple Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getEnumeratedDataTypes <em>Enumerated Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getArrayDataTypes <em>Array Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getFixedRecordDataTypes <em>Fixed Record Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getVariantRecordDataTypes <em>Variant Record Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DataTypesTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DataTypesTypeImpl extends MinimalEObjectImpl.Container implements DataTypesType {
	/**
	 * The cached value of the '{@link #getBasicDataRepresentations() <em>Basic Data Representations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasicDataRepresentations()
	 * @generated
	 * @ordered
	 */
	protected BasicDataRepresentationsType basicDataRepresentations;

	/**
	 * The cached value of the '{@link #getSimpleDataTypes() <em>Simple Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleDataTypes()
	 * @generated
	 * @ordered
	 */
	protected SimpleDataTypesType simpleDataTypes;

	/**
	 * The cached value of the '{@link #getEnumeratedDataTypes() <em>Enumerated Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumeratedDataTypes()
	 * @generated
	 * @ordered
	 */
	protected EnumeratedDataTypesType enumeratedDataTypes;

	/**
	 * The cached value of the '{@link #getArrayDataTypes() <em>Array Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArrayDataTypes()
	 * @generated
	 * @ordered
	 */
	protected ArrayDataTypesType1 arrayDataTypes;

	/**
	 * The cached value of the '{@link #getFixedRecordDataTypes() <em>Fixed Record Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFixedRecordDataTypes()
	 * @generated
	 * @ordered
	 */
	protected FixedRecordDataTypesType fixedRecordDataTypes;

	/**
	 * The cached value of the '{@link #getVariantRecordDataTypes() <em>Variant Record Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariantRecordDataTypes()
	 * @generated
	 * @ordered
	 */
	protected VariantRecordDataTypesType variantRecordDataTypes;

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
	protected DataTypesTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getDataTypesType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataRepresentationsType getBasicDataRepresentations() {
		return basicDataRepresentations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasicDataRepresentations(BasicDataRepresentationsType newBasicDataRepresentations, NotificationChain msgs) {
		BasicDataRepresentationsType oldBasicDataRepresentations = basicDataRepresentations;
		basicDataRepresentations = newBasicDataRepresentations;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS, oldBasicDataRepresentations, newBasicDataRepresentations);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasicDataRepresentations(BasicDataRepresentationsType newBasicDataRepresentations) {
		if (newBasicDataRepresentations != basicDataRepresentations) {
			NotificationChain msgs = null;
			if (basicDataRepresentations != null)
				msgs = ((InternalEObject)basicDataRepresentations).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS, null, msgs);
			if (newBasicDataRepresentations != null)
				msgs = ((InternalEObject)newBasicDataRepresentations).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS, null, msgs);
			msgs = basicSetBasicDataRepresentations(newBasicDataRepresentations, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS, newBasicDataRepresentations, newBasicDataRepresentations));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataTypesType getSimpleDataTypes() {
		return simpleDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSimpleDataTypes(SimpleDataTypesType newSimpleDataTypes, NotificationChain msgs) {
		SimpleDataTypesType oldSimpleDataTypes = simpleDataTypes;
		simpleDataTypes = newSimpleDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES, oldSimpleDataTypes, newSimpleDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleDataTypes(SimpleDataTypesType newSimpleDataTypes) {
		if (newSimpleDataTypes != simpleDataTypes) {
			NotificationChain msgs = null;
			if (simpleDataTypes != null)
				msgs = ((InternalEObject)simpleDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES, null, msgs);
			if (newSimpleDataTypes != null)
				msgs = ((InternalEObject)newSimpleDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES, null, msgs);
			msgs = basicSetSimpleDataTypes(newSimpleDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES, newSimpleDataTypes, newSimpleDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataTypesType getEnumeratedDataTypes() {
		return enumeratedDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnumeratedDataTypes(EnumeratedDataTypesType newEnumeratedDataTypes, NotificationChain msgs) {
		EnumeratedDataTypesType oldEnumeratedDataTypes = enumeratedDataTypes;
		enumeratedDataTypes = newEnumeratedDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES, oldEnumeratedDataTypes, newEnumeratedDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumeratedDataTypes(EnumeratedDataTypesType newEnumeratedDataTypes) {
		if (newEnumeratedDataTypes != enumeratedDataTypes) {
			NotificationChain msgs = null;
			if (enumeratedDataTypes != null)
				msgs = ((InternalEObject)enumeratedDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES, null, msgs);
			if (newEnumeratedDataTypes != null)
				msgs = ((InternalEObject)newEnumeratedDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES, null, msgs);
			msgs = basicSetEnumeratedDataTypes(newEnumeratedDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES, newEnumeratedDataTypes, newEnumeratedDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataTypesType1 getArrayDataTypes() {
		return arrayDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetArrayDataTypes(ArrayDataTypesType1 newArrayDataTypes, NotificationChain msgs) {
		ArrayDataTypesType1 oldArrayDataTypes = arrayDataTypes;
		arrayDataTypes = newArrayDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES, oldArrayDataTypes, newArrayDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArrayDataTypes(ArrayDataTypesType1 newArrayDataTypes) {
		if (newArrayDataTypes != arrayDataTypes) {
			NotificationChain msgs = null;
			if (arrayDataTypes != null)
				msgs = ((InternalEObject)arrayDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES, null, msgs);
			if (newArrayDataTypes != null)
				msgs = ((InternalEObject)newArrayDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES, null, msgs);
			msgs = basicSetArrayDataTypes(newArrayDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES, newArrayDataTypes, newArrayDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataTypesType getFixedRecordDataTypes() {
		return fixedRecordDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFixedRecordDataTypes(FixedRecordDataTypesType newFixedRecordDataTypes, NotificationChain msgs) {
		FixedRecordDataTypesType oldFixedRecordDataTypes = fixedRecordDataTypes;
		fixedRecordDataTypes = newFixedRecordDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES, oldFixedRecordDataTypes, newFixedRecordDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFixedRecordDataTypes(FixedRecordDataTypesType newFixedRecordDataTypes) {
		if (newFixedRecordDataTypes != fixedRecordDataTypes) {
			NotificationChain msgs = null;
			if (fixedRecordDataTypes != null)
				msgs = ((InternalEObject)fixedRecordDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES, null, msgs);
			if (newFixedRecordDataTypes != null)
				msgs = ((InternalEObject)newFixedRecordDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES, null, msgs);
			msgs = basicSetFixedRecordDataTypes(newFixedRecordDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES, newFixedRecordDataTypes, newFixedRecordDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataTypesType getVariantRecordDataTypes() {
		return variantRecordDataTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariantRecordDataTypes(VariantRecordDataTypesType newVariantRecordDataTypes, NotificationChain msgs) {
		VariantRecordDataTypesType oldVariantRecordDataTypes = variantRecordDataTypes;
		variantRecordDataTypes = newVariantRecordDataTypes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES, oldVariantRecordDataTypes, newVariantRecordDataTypes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariantRecordDataTypes(VariantRecordDataTypesType newVariantRecordDataTypes) {
		if (newVariantRecordDataTypes != variantRecordDataTypes) {
			NotificationChain msgs = null;
			if (variantRecordDataTypes != null)
				msgs = ((InternalEObject)variantRecordDataTypes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES, null, msgs);
			if (newVariantRecordDataTypes != null)
				msgs = ((InternalEObject)newVariantRecordDataTypes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES, null, msgs);
			msgs = basicSetVariantRecordDataTypes(newVariantRecordDataTypes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES, newVariantRecordDataTypes, newVariantRecordDataTypes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.DATA_TYPES_TYPE__ANY);
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.DATA_TYPES_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
				return basicSetBasicDataRepresentations(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
				return basicSetSimpleDataTypes(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
				return basicSetEnumeratedDataTypes(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
				return basicSetArrayDataTypes(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
				return basicSetFixedRecordDataTypes(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
				return basicSetVariantRecordDataTypes(null, msgs);
			case _2010Package.DATA_TYPES_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
				return getBasicDataRepresentations();
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
				return getSimpleDataTypes();
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
				return getEnumeratedDataTypes();
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
				return getArrayDataTypes();
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
				return getFixedRecordDataTypes();
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
				return getVariantRecordDataTypes();
			case _2010Package.DATA_TYPES_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.DATA_TYPES_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.DATA_TYPES_TYPE__NOTES:
				return getNotes();
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
				setBasicDataRepresentations((BasicDataRepresentationsType)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
				setSimpleDataTypes((SimpleDataTypesType)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
				setEnumeratedDataTypes((EnumeratedDataTypesType)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
				setArrayDataTypes((ArrayDataTypesType1)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
				setFixedRecordDataTypes((FixedRecordDataTypesType)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
				setVariantRecordDataTypes((VariantRecordDataTypesType)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
				setBasicDataRepresentations((BasicDataRepresentationsType)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
				setSimpleDataTypes((SimpleDataTypesType)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
				setEnumeratedDataTypes((EnumeratedDataTypesType)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
				setArrayDataTypes((ArrayDataTypesType1)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
				setFixedRecordDataTypes((FixedRecordDataTypesType)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
				setVariantRecordDataTypes((VariantRecordDataTypesType)null);
				return;
			case _2010Package.DATA_TYPES_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.DATA_TYPES_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.DATA_TYPES_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.DATA_TYPES_TYPE__BASIC_DATA_REPRESENTATIONS:
				return basicDataRepresentations != null;
			case _2010Package.DATA_TYPES_TYPE__SIMPLE_DATA_TYPES:
				return simpleDataTypes != null;
			case _2010Package.DATA_TYPES_TYPE__ENUMERATED_DATA_TYPES:
				return enumeratedDataTypes != null;
			case _2010Package.DATA_TYPES_TYPE__ARRAY_DATA_TYPES:
				return arrayDataTypes != null;
			case _2010Package.DATA_TYPES_TYPE__FIXED_RECORD_DATA_TYPES:
				return fixedRecordDataTypes != null;
			case _2010Package.DATA_TYPES_TYPE__VARIANT_RECORD_DATA_TYPES:
				return variantRecordDataTypes != null;
			case _2010Package.DATA_TYPES_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.DATA_TYPES_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.DATA_TYPES_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.DATA_TYPES_TYPE__ANY_ATTRIBUTE:
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

} //DataTypesTypeImpl
