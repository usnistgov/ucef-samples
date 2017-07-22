/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.AttributeType1;
import org.ieee.standards.ieee1516._2010.DocumentRoot;
import org.ieee.standards.ieee1516._2010.InteractionClassType1;
import org.ieee.standards.ieee1516._2010.ObjectClassType1;
import org.ieee.standards.ieee1516._2010.ObjectModelType;
import org.ieee.standards.ieee1516._2010.ParameterType1;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getInteractionClass <em>Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.DocumentRootImpl#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DocumentRootImpl extends MinimalEObjectImpl.Container implements DocumentRoot {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getXMLNSPrefixMap() <em>XMLNS Prefix Map</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXMLNSPrefixMap()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xMLNSPrefixMap;

	/**
	 * The cached value of the '{@link #getXSISchemaLocation() <em>XSI Schema Location</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSISchemaLocation()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> xSISchemaLocation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getDocumentRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, _2010Package.DOCUMENT_ROOT__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXMLNSPrefixMap() {
		if (xMLNSPrefixMap == null) {
			xMLNSPrefixMap = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		}
		return xMLNSPrefixMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getXSISchemaLocation() {
		if (xSISchemaLocation == null) {
			xSISchemaLocation = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		}
		return xSISchemaLocation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType1 getAttribute() {
		return (AttributeType1)getMixed().get(_2010Package.eINSTANCE.getDocumentRoot_Attribute(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttribute(AttributeType1 newAttribute, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2010Package.eINSTANCE.getDocumentRoot_Attribute(), newAttribute, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttribute(AttributeType1 newAttribute) {
		((FeatureMap.Internal)getMixed()).set(_2010Package.eINSTANCE.getDocumentRoot_Attribute(), newAttribute);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionClassType1 getInteractionClass() {
		return (InteractionClassType1)getMixed().get(_2010Package.eINSTANCE.getDocumentRoot_InteractionClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInteractionClass(InteractionClassType1 newInteractionClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2010Package.eINSTANCE.getDocumentRoot_InteractionClass(), newInteractionClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInteractionClass(InteractionClassType1 newInteractionClass) {
		((FeatureMap.Internal)getMixed()).set(_2010Package.eINSTANCE.getDocumentRoot_InteractionClass(), newInteractionClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType1 getObjectClass() {
		return (ObjectClassType1)getMixed().get(_2010Package.eINSTANCE.getDocumentRoot_ObjectClass(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectClass(ObjectClassType1 newObjectClass, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2010Package.eINSTANCE.getDocumentRoot_ObjectClass(), newObjectClass, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectClass(ObjectClassType1 newObjectClass) {
		((FeatureMap.Internal)getMixed()).set(_2010Package.eINSTANCE.getDocumentRoot_ObjectClass(), newObjectClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelType getObjectModel() {
		return (ObjectModelType)getMixed().get(_2010Package.eINSTANCE.getDocumentRoot_ObjectModel(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectModel(ObjectModelType newObjectModel, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2010Package.eINSTANCE.getDocumentRoot_ObjectModel(), newObjectModel, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectModel(ObjectModelType newObjectModel) {
		((FeatureMap.Internal)getMixed()).set(_2010Package.eINSTANCE.getDocumentRoot_ObjectModel(), newObjectModel);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType1 getParameter() {
		return (ParameterType1)getMixed().get(_2010Package.eINSTANCE.getDocumentRoot_Parameter(), true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParameter(ParameterType1 newParameter, NotificationChain msgs) {
		return ((FeatureMap.Internal)getMixed()).basicAdd(_2010Package.eINSTANCE.getDocumentRoot_Parameter(), newParameter, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParameter(ParameterType1 newParameter) {
		((FeatureMap.Internal)getMixed()).set(_2010Package.eINSTANCE.getDocumentRoot_Parameter(), newParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case _2010Package.DOCUMENT_ROOT__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return ((InternalEList<?>)getXMLNSPrefixMap()).basicRemove(otherEnd, msgs);
			case _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return ((InternalEList<?>)getXSISchemaLocation()).basicRemove(otherEnd, msgs);
			case _2010Package.DOCUMENT_ROOT__ATTRIBUTE:
				return basicSetAttribute(null, msgs);
			case _2010Package.DOCUMENT_ROOT__INTERACTION_CLASS:
				return basicSetInteractionClass(null, msgs);
			case _2010Package.DOCUMENT_ROOT__OBJECT_CLASS:
				return basicSetObjectClass(null, msgs);
			case _2010Package.DOCUMENT_ROOT__OBJECT_MODEL:
				return basicSetObjectModel(null, msgs);
			case _2010Package.DOCUMENT_ROOT__PARAMETER:
				return basicSetParameter(null, msgs);
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
			case _2010Package.DOCUMENT_ROOT__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				if (coreType) return getXMLNSPrefixMap();
				else return getXMLNSPrefixMap().map();
			case _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				if (coreType) return getXSISchemaLocation();
				else return getXSISchemaLocation().map();
			case _2010Package.DOCUMENT_ROOT__ATTRIBUTE:
				return getAttribute();
			case _2010Package.DOCUMENT_ROOT__INTERACTION_CLASS:
				return getInteractionClass();
			case _2010Package.DOCUMENT_ROOT__OBJECT_CLASS:
				return getObjectClass();
			case _2010Package.DOCUMENT_ROOT__OBJECT_MODEL:
				return getObjectModel();
			case _2010Package.DOCUMENT_ROOT__PARAMETER:
				return getParameter();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case _2010Package.DOCUMENT_ROOT__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				((EStructuralFeature.Setting)getXMLNSPrefixMap()).set(newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				((EStructuralFeature.Setting)getXSISchemaLocation()).set(newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__ATTRIBUTE:
				setAttribute((AttributeType1)newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__INTERACTION_CLASS:
				setInteractionClass((InteractionClassType1)newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__OBJECT_CLASS:
				setObjectClass((ObjectClassType1)newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__OBJECT_MODEL:
				setObjectModel((ObjectModelType)newValue);
				return;
			case _2010Package.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType1)newValue);
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
			case _2010Package.DOCUMENT_ROOT__MIXED:
				getMixed().clear();
				return;
			case _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				getXMLNSPrefixMap().clear();
				return;
			case _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				getXSISchemaLocation().clear();
				return;
			case _2010Package.DOCUMENT_ROOT__ATTRIBUTE:
				setAttribute((AttributeType1)null);
				return;
			case _2010Package.DOCUMENT_ROOT__INTERACTION_CLASS:
				setInteractionClass((InteractionClassType1)null);
				return;
			case _2010Package.DOCUMENT_ROOT__OBJECT_CLASS:
				setObjectClass((ObjectClassType1)null);
				return;
			case _2010Package.DOCUMENT_ROOT__OBJECT_MODEL:
				setObjectModel((ObjectModelType)null);
				return;
			case _2010Package.DOCUMENT_ROOT__PARAMETER:
				setParameter((ParameterType1)null);
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
			case _2010Package.DOCUMENT_ROOT__MIXED:
				return mixed != null && !mixed.isEmpty();
			case _2010Package.DOCUMENT_ROOT__XMLNS_PREFIX_MAP:
				return xMLNSPrefixMap != null && !xMLNSPrefixMap.isEmpty();
			case _2010Package.DOCUMENT_ROOT__XSI_SCHEMA_LOCATION:
				return xSISchemaLocation != null && !xSISchemaLocation.isEmpty();
			case _2010Package.DOCUMENT_ROOT__ATTRIBUTE:
				return getAttribute() != null;
			case _2010Package.DOCUMENT_ROOT__INTERACTION_CLASS:
				return getInteractionClass() != null;
			case _2010Package.DOCUMENT_ROOT__OBJECT_CLASS:
				return getObjectClass() != null;
			case _2010Package.DOCUMENT_ROOT__OBJECT_MODEL:
				return getObjectModel() != null;
			case _2010Package.DOCUMENT_ROOT__PARAMETER:
				return getParameter() != null;
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
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //DocumentRootImpl
