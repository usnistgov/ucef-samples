/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data Types Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getBasicDataRepresentations <em>Basic Data Representations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getSimpleDataTypes <em>Simple Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getEnumeratedDataTypes <em>Enumerated Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getArrayDataTypes <em>Array Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getFixedRecordDataTypes <em>Fixed Record Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getVariantRecordDataTypes <em>Variant Record Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.DataTypesType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType()
 * @model extendedMetaData="name='dataTypesType' kind='elementOnly'"
 * @generated
 */
public interface DataTypesType extends EObject {
	/**
	 * Returns the value of the '<em><b>Basic Data Representations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Basic data representation is the underpinning of all OMT datatypes. Although it is not used as a datatype, it forms the basis of the datatypes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Basic Data Representations</em>' containment reference.
	 * @see #setBasicDataRepresentations(BasicDataRepresentationsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_BasicDataRepresentations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='basicDataRepresentations' namespace='##targetNamespace'"
	 * @generated
	 */
	BasicDataRepresentationsType getBasicDataRepresentations();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getBasicDataRepresentations <em>Basic Data Representations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basic Data Representations</em>' containment reference.
	 * @see #getBasicDataRepresentations()
	 * @generated
	 */
	void setBasicDataRepresentations(BasicDataRepresentationsType value);

	/**
	 * Returns the value of the '<em><b>Simple Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The simple datatypes describes simple, scalar data items.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Simple Data Types</em>' containment reference.
	 * @see #setSimpleDataTypes(SimpleDataTypesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_SimpleDataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='simpleDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	SimpleDataTypesType getSimpleDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getSimpleDataTypes <em>Simple Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simple Data Types</em>' containment reference.
	 * @see #getSimpleDataTypes()
	 * @generated
	 */
	void setSimpleDataTypes(SimpleDataTypesType value);

	/**
	 * Returns the value of the '<em><b>Enumerated Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The enumerated datatypes describes data elements that can take on a finite discrete set of possible values.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enumerated Data Types</em>' containment reference.
	 * @see #setEnumeratedDataTypes(EnumeratedDataTypesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_EnumeratedDataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enumeratedDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	EnumeratedDataTypesType getEnumeratedDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getEnumeratedDataTypes <em>Enumerated Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerated Data Types</em>' containment reference.
	 * @see #getEnumeratedDataTypes()
	 * @generated
	 */
	void setEnumeratedDataTypes(EnumeratedDataTypesType value);

	/**
	 * Returns the value of the '<em><b>Array Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The array datatypes describes indexed homogenous collections of datatypes; also known as arrays or sequences.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Array Data Types</em>' containment reference.
	 * @see #setArrayDataTypes(ArrayDataTypesType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_ArrayDataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='arrayDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	ArrayDataTypesType1 getArrayDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getArrayDataTypes <em>Array Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Array Data Types</em>' containment reference.
	 * @see #getArrayDataTypes()
	 * @generated
	 */
	void setArrayDataTypes(ArrayDataTypesType1 value);

	/**
	 * Returns the value of the '<em><b>Fixed Record Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The fixed datatypes describes heterogeneous collections of types; also known as records or structures.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Fixed Record Data Types</em>' containment reference.
	 * @see #setFixedRecordDataTypes(FixedRecordDataTypesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_FixedRecordDataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='fixedRecordDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	FixedRecordDataTypesType getFixedRecordDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getFixedRecordDataTypes <em>Fixed Record Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fixed Record Data Types</em>' containment reference.
	 * @see #getFixedRecordDataTypes()
	 * @generated
	 */
	void setFixedRecordDataTypes(FixedRecordDataTypesType value);

	/**
	 * Returns the value of the '<em><b>Variant Record Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The variant record datatypes describes discriminated unions of types; also known as variant or choice records.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Variant Record Data Types</em>' containment reference.
	 * @see #setVariantRecordDataTypes(VariantRecordDataTypesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_VariantRecordDataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='variantRecordDataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	VariantRecordDataTypesType getVariantRecordDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getVariantRecordDataTypes <em>Variant Record Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variant Record Data Types</em>' containment reference.
	 * @see #getVariantRecordDataTypes()
	 * @generated
	 */
	void setVariantRecordDataTypes(VariantRecordDataTypesType value);

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_Any()
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.DataTypesType#getNotes <em>Notes</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getDataTypesType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':9' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // DataTypesType
