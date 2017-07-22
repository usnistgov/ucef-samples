/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getDataType <em>Data Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getUpdateType <em>Update Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getUpdateCondition <em>Update Condition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getOwnership <em>Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getSharing <em>Sharing</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getTransportation <em>Transportation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.AttributeType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType()
 * @model extendedMetaData="name='attributeType' kind='elementOnly'"
 * @generated
 */
public interface AttributeType extends EObject {
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the datatype of the attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Type</em>' containment reference.
	 * @see #setDataType(ReferenceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_DataType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getDataType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getDataType <em>Data Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' containment reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Update Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * records the policy for updating an instance of the class attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Type</em>' containment reference.
	 * @see #setUpdateType(UpdateType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_UpdateType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateType' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateType getUpdateType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getUpdateType <em>Update Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Type</em>' containment reference.
	 * @see #getUpdateType()
	 * @generated
	 */
	void setUpdateType(UpdateType value);

	/**
	 * Returns the value of the '<em><b>Update Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * expands and explains the policies for updating an instance of the class attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Update Condition</em>' containment reference.
	 * @see #setUpdateCondition(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_UpdateCondition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateCondition' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getUpdateCondition();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getUpdateCondition <em>Update Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Condition</em>' containment reference.
	 * @see #getUpdateCondition()
	 * @generated
	 */
	void setUpdateCondition(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Ownership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * indicates whether ownership of an instance of the class attribute can be divested and/or acquired
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Ownership</em>' containment reference.
	 * @see #setOwnership(OwnershipType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Ownership()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='ownership' namespace='##targetNamespace'"
	 * @generated
	 */
	OwnershipType getOwnership();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getOwnership <em>Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ownership</em>' containment reference.
	 * @see #getOwnership()
	 * @generated
	 */
	void setOwnership(OwnershipType value);

	/**
	 * Returns the value of the '<em><b>Sharing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * identifies the capabilities of a federate or federation with respect to class attribute publishing and subscribing
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing</em>' containment reference.
	 * @see #setSharing(SharingType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Sharing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sharing' namespace='##targetNamespace'"
	 * @generated
	 */
	SharingType getSharing();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getSharing <em>Sharing</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sharing</em>' containment reference.
	 * @see #getSharing()
	 * @generated
	 */
	void setSharing(SharingType value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * records the association of the class attribute with a set of dimensions if a federate or federation is using DDM services for this attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType2)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionsType2 getDimensions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType2 value);

	/**
	 * Returns the value of the '<em><b>Transportation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the type of transportation used with this attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportation</em>' containment reference.
	 * @see #setTransportation(ReferenceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Transportation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transportation' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getTransportation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getTransportation <em>Transportation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportation</em>' containment reference.
	 * @see #getTransportation()
	 * @generated
	 */
	void setTransportation(ReferenceType value);

	/**
	 * Returns the value of the '<em><b>Order</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the order of delivery used with instances of this class attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(OrderType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getOrder <em>Order</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order</em>' containment reference.
	 * @see #getOrder()
	 * @generated
	 */
	void setOrder(OrderType value);

	/**
	 * Returns the value of the '<em><b>Semantics</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * lexicon entry for this attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Semantics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semantics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getSemantics();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getSemantics <em>Semantics</em>}' containment reference.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':10' processing='strict'"
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.AttributeType#getNotes <em>Notes</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getAttributeType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':13' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // AttributeType
