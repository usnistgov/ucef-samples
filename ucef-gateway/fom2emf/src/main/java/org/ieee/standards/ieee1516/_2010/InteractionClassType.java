/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction Class Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getSharing <em>Sharing</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getTransportation <em>Transportation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getOrder <em>Order</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getSemantics <em>Semantics</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getInteractionClass <em>Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType()
 * @model extendedMetaData="name='interactionClassType' kind='elementOnly'"
 * @generated
 */
public interface InteractionClassType extends EObject {
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Name()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	IdentifierType getName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(IdentifierType value);

	/**
	 * Returns the value of the '<em><b>Sharing</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies publication and subscription capabilities of this interaction class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Sharing</em>' containment reference.
	 * @see #setSharing(SharingType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Sharing()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sharing' namespace='##targetNamespace'"
	 * @generated
	 */
	SharingType getSharing();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getSharing <em>Sharing</em>}' containment reference.
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
	 * records the association of the interaction class with a set of dimensions if a federate or federation is using DDM services for this attribute
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionsType getDimensions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType value);

	/**
	 * Returns the value of the '<em><b>Transportation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the type of transportation used with this interaction class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportation</em>' containment reference.
	 * @see #setTransportation(ReferenceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Transportation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transportation' namespace='##targetNamespace'"
	 * @generated
	 */
	ReferenceType getTransportation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getTransportation <em>Transportation</em>}' containment reference.
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
	 * specifies the order of delivery used with instances of this interaction class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Order</em>' containment reference.
	 * @see #setOrder(OrderType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Order()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='order' namespace='##targetNamespace'"
	 * @generated
	 */
	OrderType getOrder();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getOrder <em>Order</em>}' containment reference.
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
	 * lexicon entry for this interaction class
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Semantics</em>' containment reference.
	 * @see #setSemantics(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Semantics()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='semantics' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getSemantics();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getSemantics <em>Semantics</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semantics</em>' containment reference.
	 * @see #getSemantics()
	 * @generated
	 */
	void setSemantics(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.ParameterType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Parameter()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='parameter' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParameterType1> getParameter();

	/**
	 * Returns the value of the '<em><b>Interaction Class</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.InteractionClassType1}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interaction Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction Class</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_InteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<InteractionClassType1> getInteractionClass();

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':8' processing='strict'"
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.InteractionClassType#getNotes <em>Notes</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getInteractionClassType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':11' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // InteractionClassType
