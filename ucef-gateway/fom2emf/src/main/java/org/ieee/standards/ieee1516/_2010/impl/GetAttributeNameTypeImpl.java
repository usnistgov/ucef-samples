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

import org.ieee.standards.ieee1516._2010.GetAttributeNameType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Get Attribute Name Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#getIsCallback <em>Is Callback</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#isIsUsed <em>Is Used</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#getSection <em>Section</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.GetAttributeNameTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GetAttributeNameTypeImpl extends MinimalEObjectImpl.Container implements GetAttributeNameType {
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
	 * The default value of the '{@link #getIsCallback() <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCallback()
	 * @generated
	 * @ordered
	 */
	protected static final Object IS_CALLBACK_EDEFAULT = "false";

	/**
	 * The cached value of the '{@link #getIsCallback() <em>Is Callback</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsCallback()
	 * @generated
	 * @ordered
	 */
	protected Object isCallback = IS_CALLBACK_EDEFAULT;

	/**
	 * This is true if the Is Callback attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isCallbackESet;

	/**
	 * The default value of the '{@link #isIsUsed() <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUsed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_USED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsUsed() <em>Is Used</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsUsed()
	 * @generated
	 * @ordered
	 */
	protected boolean isUsed = IS_USED_EDEFAULT;

	/**
	 * This is true if the Is Used attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean isUsedESet;

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
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final Object SECTION_EDEFAULT = "10.12";

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected Object section = SECTION_EDEFAULT;

	/**
	 * This is true if the Section attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sectionESet;

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
	protected GetAttributeNameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getGetAttributeNameType();
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__IDTAG, oldIdtag, idtag));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getIsCallback() {
		return isCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCallback(Object newIsCallback) {
		Object oldIsCallback = isCallback;
		isCallback = newIsCallback;
		boolean oldIsCallbackESet = isCallbackESet;
		isCallbackESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK, oldIsCallback, isCallback, !oldIsCallbackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsCallback() {
		Object oldIsCallback = isCallback;
		boolean oldIsCallbackESet = isCallbackESet;
		isCallback = IS_CALLBACK_EDEFAULT;
		isCallbackESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK, oldIsCallback, IS_CALLBACK_EDEFAULT, oldIsCallbackESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsCallback() {
		return isCallbackESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsUsed() {
		return isUsed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsUsed(boolean newIsUsed) {
		boolean oldIsUsed = isUsed;
		isUsed = newIsUsed;
		boolean oldIsUsedESet = isUsedESet;
		isUsedESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED, oldIsUsed, isUsed, !oldIsUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetIsUsed() {
		boolean oldIsUsed = isUsed;
		boolean oldIsUsedESet = isUsedESet;
		isUsed = IS_USED_EDEFAULT;
		isUsedESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED, oldIsUsed, IS_USED_EDEFAULT, oldIsUsedESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetIsUsed() {
		return isUsedESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(Object newSection) {
		Object oldSection = section;
		section = newSection;
		boolean oldSectionESet = sectionESet;
		sectionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION, oldSection, section, !oldSectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSection() {
		Object oldSection = section;
		boolean oldSectionESet = sectionESet;
		section = SECTION_EDEFAULT;
		sectionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION, oldSection, SECTION_EDEFAULT, oldSectionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSection() {
		return sectionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK:
				return getIsCallback();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED:
				return isIsUsed();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__NOTES:
				return getNotes();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION:
				return getSection();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK:
				setIsCallback(newValue);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED:
				setIsUsed((Boolean)newValue);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION:
				setSection(newValue);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK:
				unsetIsCallback();
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED:
				unsetIsUsed();
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION:
				unsetSection();
				return;
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_CALLBACK:
				return isSetIsCallback();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__IS_USED:
				return isSetIsUsed();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__SECTION:
				return isSetSection();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (idtag: ");
		result.append(idtag);
		result.append(", isCallback: ");
		if (isCallbackESet) result.append(isCallback); else result.append("<unset>");
		result.append(", isUsed: ");
		if (isUsedESet) result.append(isUsed); else result.append("<unset>");
		result.append(", notes: ");
		result.append(notes);
		result.append(", section: ");
		if (sectionESet) result.append(section); else result.append("<unset>");
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //GetAttributeNameTypeImpl
