/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getInteractionClass <em>Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getObjectClass <em>Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getObjectModel <em>Object Model</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getParameter <em>Parameter</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot()
 * @model extendedMetaData="name='' kind='mixed'"
 * @generated
 */
public interface DocumentRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XMLNS Prefix Map</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XMLNS Prefix Map</em>' map.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_XMLNSPrefixMap()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xmlns:prefix'"
	 * @generated
	 */
	EMap<String, String> getXMLNSPrefixMap();

	/**
	 * Returns the value of the '<em><b>XSI Schema Location</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>XSI Schema Location</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>XSI Schema Location</em>' map.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_XSISchemaLocation()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>" transient="true"
	 *        extendedMetaData="kind='attribute' name='xsi:schemaLocation'"
	 * @generated
	 */
	EMap<String, String> getXSISchemaLocation();

	/**
	 * Returns the value of the '<em><b>Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute</em>' containment reference.
	 * @see #setAttribute(AttributeType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_Attribute()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='attribute' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeType1 getAttribute();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getAttribute <em>Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute</em>' containment reference.
	 * @see #getAttribute()
	 * @generated
	 */
	void setAttribute(AttributeType1 value);

	/**
	 * Returns the value of the '<em><b>Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Class</em>' containment reference.
	 * @see #setInteractionClass(InteractionClassType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_InteractionClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='interactionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionClassType1 getInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getInteractionClass <em>Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interaction Class</em>' containment reference.
	 * @see #getInteractionClass()
	 * @generated
	 */
	void setInteractionClass(InteractionClassType1 value);

	/**
	 * Returns the value of the '<em><b>Object Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Class</em>' containment reference.
	 * @see #setObjectClass(ObjectClassType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_ObjectClass()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='objectClass' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectClassType1 getObjectClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getObjectClass <em>Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Class</em>' containment reference.
	 * @see #getObjectClass()
	 * @generated
	 */
	void setObjectClass(ObjectClassType1 value);

	/**
	 * Returns the value of the '<em><b>Object Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Model</em>' containment reference.
	 * @see #setObjectModel(ObjectModelType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_ObjectModel()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='objectModel' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectModelType getObjectModel();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getObjectModel <em>Object Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Model</em>' containment reference.
	 * @see #getObjectModel()
	 * @generated
	 */
	void setObjectModel(ObjectModelType value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference.
	 * @see #setParameter(ParameterType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDocumentRoot_Parameter()
	 * @model containment="true" upper="-2" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	ParameterType1 getParameter();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DocumentRoot#getParameter <em>Parameter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parameter</em>' containment reference.
	 * @see #getParameter()
	 * @generated
	 */
	void setParameter(ParameterType1 value);

} // DocumentRoot
