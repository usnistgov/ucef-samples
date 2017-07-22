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
 * A representation of the model object '<em><b>Model Identification Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getType <em>Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getSecurityClassification <em>Security Classification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getReleaseRestriction <em>Release Restriction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getApplicationDomain <em>Application Domain</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getUseLimitation <em>Use Limitation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getUseHistory <em>Use History</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getPoc <em>Poc</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getReference <em>Reference</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getOther <em>Other</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getGlyph <em>Glyph</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType()
 * @model extendedMetaData="name='modelIdentificationType' kind='elementOnly'"
 * @generated
 */
public interface ModelIdentificationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the name assigned to the object model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Name()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='name' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specify the type of model that is represented
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(ModelType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Type()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='type' namespace='##targetNamespace'"
	 * @generated
	 */
	ModelType getType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(ModelType value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the version identification assigned to the object model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Version()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='version' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getVersion();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Modification Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the latest date on which this version of the object model was created or modified. The modification date shall be specified in the format "YYYY-MM-DD"
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Modification Date</em>' containment reference.
	 * @see #setModificationDate(ModificationDateType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_ModificationDate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modificationDate' namespace='##targetNamespace'"
	 * @generated
	 */
	ModificationDateType getModificationDate();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getModificationDate <em>Modification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modification Date</em>' containment reference.
	 * @see #getModificationDate()
	 * @generated
	 */
	void setModificationDate(ModificationDateType value);

	/**
	 * Returns the value of the '<em><b>Security Classification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the security classification of the object model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Security Classification</em>' containment reference.
	 * @see #setSecurityClassification(SecurityClassificationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_SecurityClassification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='securityClassification' namespace='##targetNamespace'"
	 * @generated
	 */
	SecurityClassificationType getSecurityClassification();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getSecurityClassification <em>Security Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Security Classification</em>' containment reference.
	 * @see #getSecurityClassification()
	 * @generated
	 */
	void setSecurityClassification(SecurityClassificationType value);

	/**
	 * Returns the value of the '<em><b>Release Restriction</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies any restrictions on the release of the object models to specific organizations or individuals
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Release Restriction</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_ReleaseRestriction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseRestriction' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.ieee.standards.ieee1516._2010.String> getReleaseRestriction();

	/**
	 * Returns the value of the '<em><b>Purpose</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the purpose for which the federate or federation was developed
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Purpose</em>' containment reference.
	 * @see #setPurpose(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Purpose()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='purpose' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getPurpose();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getPurpose <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Purpose</em>' containment reference.
	 * @see #getPurpose()
	 * @generated
	 */
	void setPurpose(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Application Domain</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies the type or class of application to which the federate or federation applies
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Application Domain</em>' containment reference.
	 * @see #setApplicationDomain(ApplicationDomainType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_ApplicationDomain()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='applicationDomain' namespace='##targetNamespace'"
	 * @generated
	 */
	ApplicationDomainType getApplicationDomain();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getApplicationDomain <em>Application Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Application Domain</em>' containment reference.
	 * @see #getApplicationDomain()
	 * @generated
	 */
	void setApplicationDomain(ApplicationDomainType value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' containment reference.
	 * @see #setDescription(NonEmptyString1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Description()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='description' namespace='##targetNamespace'"
	 * @generated
	 */
	NonEmptyString1 getDescription();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getDescription <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' containment reference.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(NonEmptyString1 value);

	/**
	 * Returns the value of the '<em><b>Use Limitation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies any known applications for which this model has been found not to be appropriate
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Limitation</em>' containment reference.
	 * @see #setUseLimitation(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_UseLimitation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useLimitation' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getUseLimitation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getUseLimitation <em>Use Limitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Limitation</em>' containment reference.
	 * @see #getUseLimitation()
	 * @generated
	 */
	void setUseLimitation(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Use History</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies a description of where this model has been used
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use History</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_UseHistory()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='useHistory' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<org.ieee.standards.ieee1516._2010.String> getUseHistory();

	/**
	 * Returns the value of the '<em><b>Keyword</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.KeywordType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies keywords that characterize the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Keyword</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Keyword()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='keyword' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<KeywordType> getKeyword();

	/**
	 * Returns the value of the '<em><b>Poc</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.PocType1}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specify an organization or a person who has a particular role with respect to the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Poc</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Poc()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='poc' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<PocType1> getPoc();

	/**
	 * Returns the value of the '<em><b>Reference</b></em>' containment reference list.
	 * The list contents are of type {@link org.ieee.standards.ieee1516._2010.IdReferenceType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies a pointer to additional sources of information
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reference</em>' containment reference list.
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Reference()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reference' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<IdReferenceType> getReference();

	/**
	 * Returns the value of the '<em><b>Other</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies other data deemed relevant by the author of the object model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Other</em>' containment reference.
	 * @see #setOther(org.ieee.standards.ieee1516._2010.String)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Other()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='other' namespace='##targetNamespace'"
	 * @generated
	 */
	org.ieee.standards.ieee1516._2010.String getOther();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getOther <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Other</em>' containment reference.
	 * @see #getOther()
	 * @generated
	 */
	void setOther(org.ieee.standards.ieee1516._2010.String value);

	/**
	 * Returns the value of the '<em><b>Glyph</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * specifies a glyph to visually represent the model
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Glyph</em>' containment reference.
	 * @see #setGlyph(GlyphType1)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Glyph()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='glyph' namespace='##targetNamespace'"
	 * @generated
	 */
	GlyphType1 getGlyph();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getGlyph <em>Glyph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Glyph</em>' containment reference.
	 * @see #getGlyph()
	 * @generated
	 */
	void setGlyph(GlyphType1 value);

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Any()
	 * @model dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="false"
	 *        extendedMetaData="kind='elementWildcard' wildcards='##other' name=':16' processing='strict'"
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType#getNotes <em>Notes</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getModelIdentificationType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':19' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ModelIdentificationType
