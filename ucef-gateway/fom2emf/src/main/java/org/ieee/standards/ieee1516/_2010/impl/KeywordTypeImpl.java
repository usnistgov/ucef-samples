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

import org.ieee.standards.ieee1516._2010.KeywordType;
import org.ieee.standards.ieee1516._2010.NonEmptyString1;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Keyword Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.KeywordTypeImpl#getTaxonomy <em>Taxonomy</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.KeywordTypeImpl#getKeywordValue <em>Keyword Value</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.KeywordTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.KeywordTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.KeywordTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KeywordTypeImpl extends MinimalEObjectImpl.Container implements KeywordType {
	/**
	 * The cached value of the '{@link #getTaxonomy() <em>Taxonomy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxonomy()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String taxonomy;

	/**
	 * The cached value of the '{@link #getKeywordValue() <em>Keyword Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeywordValue()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 keywordValue;

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
	protected KeywordTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getKeywordType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getTaxonomy() {
		return taxonomy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTaxonomy(org.ieee.standards.ieee1516._2010.String newTaxonomy, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldTaxonomy = taxonomy;
		taxonomy = newTaxonomy;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__TAXONOMY, oldTaxonomy, newTaxonomy);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTaxonomy(org.ieee.standards.ieee1516._2010.String newTaxonomy) {
		if (newTaxonomy != taxonomy) {
			NotificationChain msgs = null;
			if (taxonomy != null)
				msgs = ((InternalEObject)taxonomy).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.KEYWORD_TYPE__TAXONOMY, null, msgs);
			if (newTaxonomy != null)
				msgs = ((InternalEObject)newTaxonomy).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.KEYWORD_TYPE__TAXONOMY, null, msgs);
			msgs = basicSetTaxonomy(newTaxonomy, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__TAXONOMY, newTaxonomy, newTaxonomy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getKeywordValue() {
		return keywordValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetKeywordValue(NonEmptyString1 newKeywordValue, NotificationChain msgs) {
		NonEmptyString1 oldKeywordValue = keywordValue;
		keywordValue = newKeywordValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__KEYWORD_VALUE, oldKeywordValue, newKeywordValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setKeywordValue(NonEmptyString1 newKeywordValue) {
		if (newKeywordValue != keywordValue) {
			NotificationChain msgs = null;
			if (keywordValue != null)
				msgs = ((InternalEObject)keywordValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.KEYWORD_TYPE__KEYWORD_VALUE, null, msgs);
			if (newKeywordValue != null)
				msgs = ((InternalEObject)newKeywordValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.KEYWORD_TYPE__KEYWORD_VALUE, null, msgs);
			msgs = basicSetKeywordValue(newKeywordValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__KEYWORD_VALUE, newKeywordValue, newKeywordValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.KEYWORD_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.KEYWORD_TYPE__TAXONOMY:
				return basicSetTaxonomy(null, msgs);
			case _2010Package.KEYWORD_TYPE__KEYWORD_VALUE:
				return basicSetKeywordValue(null, msgs);
			case _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.KEYWORD_TYPE__TAXONOMY:
				return getTaxonomy();
			case _2010Package.KEYWORD_TYPE__KEYWORD_VALUE:
				return getKeywordValue();
			case _2010Package.KEYWORD_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.KEYWORD_TYPE__NOTES:
				return getNotes();
			case _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.KEYWORD_TYPE__TAXONOMY:
				setTaxonomy((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.KEYWORD_TYPE__KEYWORD_VALUE:
				setKeywordValue((NonEmptyString1)newValue);
				return;
			case _2010Package.KEYWORD_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.KEYWORD_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.KEYWORD_TYPE__TAXONOMY:
				setTaxonomy((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.KEYWORD_TYPE__KEYWORD_VALUE:
				setKeywordValue((NonEmptyString1)null);
				return;
			case _2010Package.KEYWORD_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.KEYWORD_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.KEYWORD_TYPE__TAXONOMY:
				return taxonomy != null;
			case _2010Package.KEYWORD_TYPE__KEYWORD_VALUE:
				return keywordValue != null;
			case _2010Package.KEYWORD_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.KEYWORD_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.KEYWORD_TYPE__ANY_ATTRIBUTE:
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
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //KeywordTypeImpl
