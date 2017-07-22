/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Data Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getRepresentation <em>Representation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getUnits <em>Units</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getResolution <em>Resolution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getAccuracy <em>Accuracy</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType()
 * @model extendedMetaData="name='simpleDataType' kind='elementOnly'"
 * @generated
 */
public interface SimpleDataType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(IdentifierType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Representation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the basic data representation of this datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Representation</em>' containment reference.
	 * @see #setRepresentation(ReferenceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Representation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='representation' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getRepresentation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getRepresentation <em>Representation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Representation</em>' containment reference.
	 * @see #getRepresentation()
	 * @generated
	 */
	void setRepresentation(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Units</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the units of measure (e.g., m, km, kg) for the datatype whenever such units exist. Any units entered in this column also specify the units of Resolution and Accuracy.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Units</em>' containment reference.
	 * @see #setUnits(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Units()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='units' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getUnits();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getUnits <em>Units</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Units</em>' containment reference.
	 * @see #getUnits()
	 * @generated
	 */
	void setUnits(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Resolution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes the precision of measure for the datatype
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resolution</em>' containment reference.
	 * @see #setResolution(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Resolution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resolution' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getResolution();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getResolution <em>Resolution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resolution</em>' containment reference.
	 * @see #getResolution()
	 * @generated
	 */
	void setResolution(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Accuracy</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * describes maximum deviation of the value from its intended value in the federate or federation
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Accuracy</em>' containment reference.
	 * @see #setAccuracy(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Accuracy()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='accuracy' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getAccuracy();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getAccuracy <em>Accuracy</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Accuracy</em>' containment reference.
	 * @see #getAccuracy()
	 * @generated
	 */
	void setAccuracy(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Semantics</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Semantics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semantics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getSemantics();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getSemantics <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' containment reference.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Any</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any</em>' attribute list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':6' processing='strict'"
	 * @generated
	 */
	FeatureMap getAny();

	/**
	 * Returns the value of the '<em><b>Idtag</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Idtag</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Idtag</em>' attribute.
	 * @see #setIdtag(String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes</em>' attribute.
	 * @see #setNotes(List)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.SimpleDataType#getNotes <em>Notes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' attribute.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(List<String> value);

	/**
	 * Returns the value of the '<em><b>Any Attribute</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Any Attribute</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Any Attribute</em>' attribute list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getSimpleDataType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // SimpleDataType
