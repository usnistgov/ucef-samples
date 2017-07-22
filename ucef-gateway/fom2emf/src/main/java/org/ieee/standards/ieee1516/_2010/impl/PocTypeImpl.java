/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.PocType;
import org.ieee.standards.ieee1516._2010.PocTypeType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Poc Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.PocTypeImpl#getPocType <em>Poc Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.PocTypeImpl#getPocName <em>Poc Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.PocTypeImpl#getPocOrg <em>Poc Org</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.PocTypeImpl#getPocTelephone <em>Poc Telephone</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.PocTypeImpl#getPocEmail <em>Poc Email</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PocTypeImpl extends MinimalEObjectImpl.Container implements PocType {
	/**
	 * The cached value of the '{@link #getPocType() <em>Poc Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPocType()
	 * @generated
	 * @ordered
	 */
	protected PocTypeType pocType;

	/**
	 * The cached value of the '{@link #getPocName() <em>Poc Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPocName()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String pocName;

	/**
	 * The cached value of the '{@link #getPocOrg() <em>Poc Org</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPocOrg()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String pocOrg;

	/**
	 * The cached value of the '{@link #getPocTelephone() <em>Poc Telephone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPocTelephone()
	 * @generated
	 * @ordered
	 */
	protected EList<org.ieee.standards.ieee1516._2010.String> pocTelephone;

	/**
	 * The cached value of the '{@link #getPocEmail() <em>Poc Email</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPocEmail()
	 * @generated
	 * @ordered
	 */
	protected EList<org.ieee.standards.ieee1516._2010.String> pocEmail;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PocTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getPocType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocTypeType getPocType() {
		return pocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPocType(PocTypeType newPocType, NotificationChain msgs) {
		PocTypeType oldPocType = pocType;
		pocType = newPocType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_TYPE, oldPocType, newPocType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPocType(PocTypeType newPocType) {
		if (newPocType != pocType) {
			NotificationChain msgs = null;
			if (pocType != null)
				msgs = ((InternalEObject)pocType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_TYPE, null, msgs);
			if (newPocType != null)
				msgs = ((InternalEObject)newPocType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_TYPE, null, msgs);
			msgs = basicSetPocType(newPocType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_TYPE, newPocType, newPocType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getPocName() {
		return pocName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPocName(org.ieee.standards.ieee1516._2010.String newPocName, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldPocName = pocName;
		pocName = newPocName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_NAME, oldPocName, newPocName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPocName(org.ieee.standards.ieee1516._2010.String newPocName) {
		if (newPocName != pocName) {
			NotificationChain msgs = null;
			if (pocName != null)
				msgs = ((InternalEObject)pocName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_NAME, null, msgs);
			if (newPocName != null)
				msgs = ((InternalEObject)newPocName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_NAME, null, msgs);
			msgs = basicSetPocName(newPocName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_NAME, newPocName, newPocName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getPocOrg() {
		return pocOrg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPocOrg(org.ieee.standards.ieee1516._2010.String newPocOrg, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldPocOrg = pocOrg;
		pocOrg = newPocOrg;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_ORG, oldPocOrg, newPocOrg);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPocOrg(org.ieee.standards.ieee1516._2010.String newPocOrg) {
		if (newPocOrg != pocOrg) {
			NotificationChain msgs = null;
			if (pocOrg != null)
				msgs = ((InternalEObject)pocOrg).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_ORG, null, msgs);
			if (newPocOrg != null)
				msgs = ((InternalEObject)newPocOrg).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.POC_TYPE__POC_ORG, null, msgs);
			msgs = basicSetPocOrg(newPocOrg, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.POC_TYPE__POC_ORG, newPocOrg, newPocOrg));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.ieee.standards.ieee1516._2010.String> getPocTelephone() {
		if (pocTelephone == null) {
			pocTelephone = new EObjectContainmentEList<org.ieee.standards.ieee1516._2010.String>(org.ieee.standards.ieee1516._2010.String.class, this, _2010Package.POC_TYPE__POC_TELEPHONE);
		}
		return pocTelephone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.ieee.standards.ieee1516._2010.String> getPocEmail() {
		if (pocEmail == null) {
			pocEmail = new EObjectContainmentEList<org.ieee.standards.ieee1516._2010.String>(org.ieee.standards.ieee1516._2010.String.class, this, _2010Package.POC_TYPE__POC_EMAIL);
		}
		return pocEmail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2010Package.POC_TYPE__POC_TYPE:
				return basicSetPocType(null, msgs);
			case _2010Package.POC_TYPE__POC_NAME:
				return basicSetPocName(null, msgs);
			case _2010Package.POC_TYPE__POC_ORG:
				return basicSetPocOrg(null, msgs);
			case _2010Package.POC_TYPE__POC_TELEPHONE:
				return ((InternalEList<?>)getPocTelephone()).basicRemove(otherEnd, msgs);
			case _2010Package.POC_TYPE__POC_EMAIL:
				return ((InternalEList<?>)getPocEmail()).basicRemove(otherEnd, msgs);
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
			case _2010Package.POC_TYPE__POC_TYPE:
				return getPocType();
			case _2010Package.POC_TYPE__POC_NAME:
				return getPocName();
			case _2010Package.POC_TYPE__POC_ORG:
				return getPocOrg();
			case _2010Package.POC_TYPE__POC_TELEPHONE:
				return getPocTelephone();
			case _2010Package.POC_TYPE__POC_EMAIL:
				return getPocEmail();
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
			case _2010Package.POC_TYPE__POC_TYPE:
				setPocType((PocTypeType)newValue);
				return;
			case _2010Package.POC_TYPE__POC_NAME:
				setPocName((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.POC_TYPE__POC_ORG:
				setPocOrg((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.POC_TYPE__POC_TELEPHONE:
				getPocTelephone().clear();
				getPocTelephone().addAll((Collection<? extends org.ieee.standards.ieee1516._2010.String>)newValue);
				return;
			case _2010Package.POC_TYPE__POC_EMAIL:
				getPocEmail().clear();
				getPocEmail().addAll((Collection<? extends org.ieee.standards.ieee1516._2010.String>)newValue);
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
			case _2010Package.POC_TYPE__POC_TYPE:
				setPocType((PocTypeType)null);
				return;
			case _2010Package.POC_TYPE__POC_NAME:
				setPocName((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.POC_TYPE__POC_ORG:
				setPocOrg((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.POC_TYPE__POC_TELEPHONE:
				getPocTelephone().clear();
				return;
			case _2010Package.POC_TYPE__POC_EMAIL:
				getPocEmail().clear();
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
			case _2010Package.POC_TYPE__POC_TYPE:
				return pocType != null;
			case _2010Package.POC_TYPE__POC_NAME:
				return pocName != null;
			case _2010Package.POC_TYPE__POC_ORG:
				return pocOrg != null;
			case _2010Package.POC_TYPE__POC_TELEPHONE:
				return pocTelephone != null && !pocTelephone.isEmpty();
			case _2010Package.POC_TYPE__POC_EMAIL:
				return pocEmail != null && !pocEmail.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PocTypeImpl
