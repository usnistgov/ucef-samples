/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Model Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getModelIdentification <em>Model Identification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getServiceUtilization <em>Service Utilization</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getObjects <em>Objects</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getInteractions <em>Interactions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getDimensions <em>Dimensions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTime <em>Time</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTags <em>Tags</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getSynchronizations <em>Synchronizations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTransportations <em>Transportations</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getSwitches <em>Switches</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getUpdateRates <em>Update Rates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getDataTypes <em>Data Types</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getNotes1 <em>Notes1</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType()
 * @model extendedMetaData="name='objectModelType' kind='elementOnly'"
 * @generated
 */
public interface ObjectModelType extends EObject {
	/**
	 * Returns the value of the '<em><b>Model Identification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * documents certain key identifying information within the object model description
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Model Identification</em>' containment reference.
	 * @see #setModelIdentification(ModelIdentificationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_ModelIdentification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modelIdentification' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelIdentificationType getModelIdentification();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getModelIdentification <em>Model Identification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Model Identification</em>' containment reference.
	 * @see #getModelIdentification()
	 * @generated
	 */
	void setModelIdentification(ModelIdentificationType value);

	/**
	 * Returns the value of the '<em><b>Service Utilization</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * RTI services used in the federation or by a federate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Service Utilization</em>' containment reference.
	 * @see #setServiceUtilization(ServiceUtilizationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_ServiceUtilization()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='serviceUtilization' namespace='##targetNamespace'"
	 * @generated
	 */
	ServiceUtilizationType getServiceUtilization();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getServiceUtilization <em>Service Utilization</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Utilization</em>' containment reference.
	 * @see #getServiceUtilization()
	 * @generated
	 */
	void setServiceUtilization(ServiceUtilizationType value);

	/**
	 * Returns the value of the '<em><b>Objects</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies classes of objects and their hierarchical relationships 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Objects</em>' containment reference.
	 * @see #setObjects(ObjectsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Objects()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='objects' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectsType getObjects();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getObjects <em>Objects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects</em>' containment reference.
	 * @see #getObjects()
	 * @generated
	 */
	void setObjects(ObjectsType value);

	/**
	 * Returns the value of the '<em><b>Interactions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies classes of interactions and their hierarchical relationships 
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interactions</em>' containment reference.
	 * @see #setInteractions(InteractionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Interactions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='interactions' namespace='##targetNamespace'"
	 * @generated
	 */
	InteractionsType getInteractions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getInteractions <em>Interactions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interactions</em>' containment reference.
	 * @see #getInteractions()
	 * @generated
	 */
	void setInteractions(InteractionsType value);

	/**
	 * Returns the value of the '<em><b>Dimensions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies dimensions associated with attribute types and interaction classes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Dimensions</em>' containment reference.
	 * @see #setDimensions(DimensionsType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Dimensions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dimensions' namespace='##targetNamespace'"
	 * @generated
	 */
	DimensionsType1 getDimensions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getDimensions <em>Dimensions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dimensions</em>' containment reference.
	 * @see #getDimensions()
	 * @generated
	 */
	void setDimensions(DimensionsType1 value);

	/**
	 * Returns the value of the '<em><b>Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies timestamp and lookahead datatypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Time</em>' containment reference.
	 * @see #setTime(TimeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Time()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='time' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeType getTime();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTime <em>Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time</em>' containment reference.
	 * @see #getTime()
	 * @generated
	 */
	void setTime(TimeType value);

	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the datatype of user-defined tags
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(TagsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Tags()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='tags' namespace='##targetNamespace'"
	 * @generated
	 */
	TagsType getTags();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(TagsType value);

	/**
	 * Returns the value of the '<em><b>Synchronizations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies federate and federation capabilities for synchronization-points
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Synchronizations</em>' containment reference.
	 * @see #setSynchronizations(SynchronizationsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Synchronizations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synchronizations' namespace='##targetNamespace'"
	 * @generated
	 */
	SynchronizationsType getSynchronizations();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getSynchronizations <em>Synchronizations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronizations</em>' containment reference.
	 * @see #getSynchronizations()
	 * @generated
	 */
	void setSynchronizations(SynchronizationsType value);

	/**
	 * Returns the value of the '<em><b>Transportations</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * documents transportation type support and agreements
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Transportations</em>' containment reference.
	 * @see #setTransportations(TransportationsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Transportations()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='transportations' namespace='##targetNamespace'"
	 * @generated
	 */
	TransportationsType getTransportations();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getTransportations <em>Transportations</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transportations</em>' containment reference.
	 * @see #getTransportations()
	 * @generated
	 */
	void setTransportations(TransportationsType value);

	/**
	 * Returns the value of the '<em><b>Switches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specification of the initial setting of RTI switches
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Switches</em>' containment reference.
	 * @see #setSwitches(SwitchesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Switches()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='switches' namespace='##targetNamespace'"
	 * @generated
	 */
	SwitchesType getSwitches();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getSwitches <em>Switches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Switches</em>' containment reference.
	 * @see #getSwitches()
	 * @generated
	 */
	void setSwitches(SwitchesType value);

	/**
	 * Returns the value of the '<em><b>Update Rates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Rates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Rates</em>' containment reference.
	 * @see #setUpdateRates(UpdateRatesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_UpdateRates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateRates' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateRatesType getUpdateRates();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getUpdateRates <em>Update Rates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Rates</em>' containment reference.
	 * @see #getUpdateRates()
	 * @generated
	 */
	void setUpdateRates(UpdateRatesType value);

	/**
	 * Returns the value of the '<em><b>Data Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies all referenced datatypes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Data Types</em>' containment reference.
	 * @see #setDataTypes(DataTypesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_DataTypes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='dataTypes' namespace='##targetNamespace'"
	 * @generated
	 */
	DataTypesType getDataTypes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getDataTypes <em>Data Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Types</em>' containment reference.
	 * @see #getDataTypes()
	 * @generated
	 */
	void setDataTypes(DataTypesType value);

	/**
	 * Returns the value of the '<em><b>Notes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies all referenced notes
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Notes</em>' containment reference.
	 * @see #setNotes(NotesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Notes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='notes' namespace='##targetNamespace'"
	 * @generated
	 */
	NotesType getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getNotes <em>Notes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes</em>' containment reference.
	 * @see #getNotes()
	 * @generated
	 */
	void setNotes(NotesType value);

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':13' processing='strict'"
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getIdtag <em>Idtag</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Idtag</em>' attribute.
	 * @see #getIdtag()
	 * @generated
	 */
	void setIdtag(String value);

	/**
	 * Returns the value of the '<em><b>Notes1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notes1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notes1</em>' attribute.
	 * @see #setNotes1(List)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_Notes1()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes1();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ObjectModelType#getNotes1 <em>Notes1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notes1</em>' attribute.
	 * @see #getNotes1()
	 * @generated
	 */
	void setNotes1(List<String> value);

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getObjectModelType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':16' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ObjectModelType
