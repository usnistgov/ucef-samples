/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.ApplicationDomainType;
import org.ieee.standards.ieee1516._2010.GlyphType1;
import org.ieee.standards.ieee1516._2010.IdReferenceType;
import org.ieee.standards.ieee1516._2010.KeywordType;
import org.ieee.standards.ieee1516._2010.ModelIdentificationType;
import org.ieee.standards.ieee1516._2010.ModelType;
import org.ieee.standards.ieee1516._2010.ModificationDateType;
import org.ieee.standards.ieee1516._2010.NonEmptyString1;
import org.ieee.standards.ieee1516._2010.PocType1;
import org.ieee.standards.ieee1516._2010.SecurityClassificationType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model Identification Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getModificationDate <em>Modification Date</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getSecurityClassification <em>Security Classification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getReleaseRestriction <em>Release Restriction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getPurpose <em>Purpose</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getApplicationDomain <em>Application Domain</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getUseLimitation <em>Use Limitation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getUseHistory <em>Use History</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getKeyword <em>Keyword</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getPoc <em>Poc</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getOther <em>Other</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getGlyph <em>Glyph</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getAny <em>Any</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ModelIdentificationTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelIdentificationTypeImpl extends MinimalEObjectImpl.Container implements ModelIdentificationType {
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 name;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected ModelType type;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 version;

	/**
	 * The cached value of the '{@link #getModificationDate() <em>Modification Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModificationDate()
	 * @generated
	 * @ordered
	 */
	protected ModificationDateType modificationDate;

	/**
	 * The cached value of the '{@link #getSecurityClassification() <em>Security Classification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurityClassification()
	 * @generated
	 * @ordered
	 */
	protected SecurityClassificationType securityClassification;

	/**
	 * The cached value of the '{@link #getReleaseRestriction() <em>Release Restriction</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseRestriction()
	 * @generated
	 * @ordered
	 */
	protected EList<org.ieee.standards.ieee1516._2010.String> releaseRestriction;

	/**
	 * The cached value of the '{@link #getPurpose() <em>Purpose</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPurpose()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String purpose;

	/**
	 * The cached value of the '{@link #getApplicationDomain() <em>Application Domain</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplicationDomain()
	 * @generated
	 * @ordered
	 */
	protected ApplicationDomainType applicationDomain;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected NonEmptyString1 description;

	/**
	 * The cached value of the '{@link #getUseLimitation() <em>Use Limitation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseLimitation()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String useLimitation;

	/**
	 * The cached value of the '{@link #getUseHistory() <em>Use History</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseHistory()
	 * @generated
	 * @ordered
	 */
	protected EList<org.ieee.standards.ieee1516._2010.String> useHistory;

	/**
	 * The cached value of the '{@link #getKeyword() <em>Keyword</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKeyword()
	 * @generated
	 * @ordered
	 */
	protected EList<KeywordType> keyword;

	/**
	 * The cached value of the '{@link #getPoc() <em>Poc</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPoc()
	 * @generated
	 * @ordered
	 */
	protected EList<PocType1> poc;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<IdReferenceType> reference;

	/**
	 * The cached value of the '{@link #getOther() <em>Other</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOther()
	 * @generated
	 * @ordered
	 */
	protected org.ieee.standards.ieee1516._2010.String other;

	/**
	 * The cached value of the '{@link #getGlyph() <em>Glyph</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGlyph()
	 * @generated
	 * @ordered
	 */
	protected GlyphType1 glyph;

	/**
	 * The cached value of the '{@link #getAny() <em>Any</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAny()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap any;

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
	protected ModelIdentificationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getModelIdentificationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(NonEmptyString1 newName, NotificationChain msgs) {
		NonEmptyString1 oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__NAME, oldName, newName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(NonEmptyString1 newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(ModelType newType, NotificationChain msgs) {
		ModelType oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE, oldType, newType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(ModelType newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(NonEmptyString1 newVersion, NotificationChain msgs) {
		NonEmptyString1 oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(NonEmptyString1 newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType getModificationDate() {
		return modificationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModificationDate(ModificationDateType newModificationDate, NotificationChain msgs) {
		ModificationDateType oldModificationDate = modificationDate;
		modificationDate = newModificationDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE, oldModificationDate, newModificationDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModificationDate(ModificationDateType newModificationDate) {
		if (newModificationDate != modificationDate) {
			NotificationChain msgs = null;
			if (modificationDate != null)
				msgs = ((InternalEObject)modificationDate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE, null, msgs);
			if (newModificationDate != null)
				msgs = ((InternalEObject)newModificationDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE, null, msgs);
			msgs = basicSetModificationDate(newModificationDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE, newModificationDate, newModificationDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationType getSecurityClassification() {
		return securityClassification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurityClassification(SecurityClassificationType newSecurityClassification, NotificationChain msgs) {
		SecurityClassificationType oldSecurityClassification = securityClassification;
		securityClassification = newSecurityClassification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION, oldSecurityClassification, newSecurityClassification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecurityClassification(SecurityClassificationType newSecurityClassification) {
		if (newSecurityClassification != securityClassification) {
			NotificationChain msgs = null;
			if (securityClassification != null)
				msgs = ((InternalEObject)securityClassification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION, null, msgs);
			if (newSecurityClassification != null)
				msgs = ((InternalEObject)newSecurityClassification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION, null, msgs);
			msgs = basicSetSecurityClassification(newSecurityClassification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION, newSecurityClassification, newSecurityClassification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.ieee.standards.ieee1516._2010.String> getReleaseRestriction() {
		if (releaseRestriction == null) {
			releaseRestriction = new EObjectContainmentEList<org.ieee.standards.ieee1516._2010.String>(org.ieee.standards.ieee1516._2010.String.class, this, _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION);
		}
		return releaseRestriction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getPurpose() {
		return purpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPurpose(org.ieee.standards.ieee1516._2010.String newPurpose, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldPurpose = purpose;
		purpose = newPurpose;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE, oldPurpose, newPurpose);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPurpose(org.ieee.standards.ieee1516._2010.String newPurpose) {
		if (newPurpose != purpose) {
			NotificationChain msgs = null;
			if (purpose != null)
				msgs = ((InternalEObject)purpose).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE, null, msgs);
			if (newPurpose != null)
				msgs = ((InternalEObject)newPurpose).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE, null, msgs);
			msgs = basicSetPurpose(newPurpose, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE, newPurpose, newPurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainType getApplicationDomain() {
		return applicationDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApplicationDomain(ApplicationDomainType newApplicationDomain, NotificationChain msgs) {
		ApplicationDomainType oldApplicationDomain = applicationDomain;
		applicationDomain = newApplicationDomain;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN, oldApplicationDomain, newApplicationDomain);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApplicationDomain(ApplicationDomainType newApplicationDomain) {
		if (newApplicationDomain != applicationDomain) {
			NotificationChain msgs = null;
			if (applicationDomain != null)
				msgs = ((InternalEObject)applicationDomain).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN, null, msgs);
			if (newApplicationDomain != null)
				msgs = ((InternalEObject)newApplicationDomain).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN, null, msgs);
			msgs = basicSetApplicationDomain(newApplicationDomain, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN, newApplicationDomain, newApplicationDomain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDescription(NonEmptyString1 newDescription, NotificationChain msgs) {
		NonEmptyString1 oldDescription = description;
		description = newDescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION, oldDescription, newDescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(NonEmptyString1 newDescription) {
		if (newDescription != description) {
			NotificationChain msgs = null;
			if (description != null)
				msgs = ((InternalEObject)description).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION, null, msgs);
			if (newDescription != null)
				msgs = ((InternalEObject)newDescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION, null, msgs);
			msgs = basicSetDescription(newDescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION, newDescription, newDescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getUseLimitation() {
		return useLimitation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseLimitation(org.ieee.standards.ieee1516._2010.String newUseLimitation, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldUseLimitation = useLimitation;
		useLimitation = newUseLimitation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION, oldUseLimitation, newUseLimitation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseLimitation(org.ieee.standards.ieee1516._2010.String newUseLimitation) {
		if (newUseLimitation != useLimitation) {
			NotificationChain msgs = null;
			if (useLimitation != null)
				msgs = ((InternalEObject)useLimitation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION, null, msgs);
			if (newUseLimitation != null)
				msgs = ((InternalEObject)newUseLimitation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION, null, msgs);
			msgs = basicSetUseLimitation(newUseLimitation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION, newUseLimitation, newUseLimitation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.ieee.standards.ieee1516._2010.String> getUseHistory() {
		if (useHistory == null) {
			useHistory = new EObjectContainmentEList<org.ieee.standards.ieee1516._2010.String>(org.ieee.standards.ieee1516._2010.String.class, this, _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY);
		}
		return useHistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordType> getKeyword() {
		if (keyword == null) {
			keyword = new EObjectContainmentEList<KeywordType>(KeywordType.class, this, _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD);
		}
		return keyword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PocType1> getPoc() {
		if (poc == null) {
			poc = new EObjectContainmentEList<PocType1>(PocType1.class, this, _2010Package.MODEL_IDENTIFICATION_TYPE__POC);
		}
		return poc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IdReferenceType> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<IdReferenceType>(IdReferenceType.class, this, _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String getOther() {
		return other;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOther(org.ieee.standards.ieee1516._2010.String newOther, NotificationChain msgs) {
		org.ieee.standards.ieee1516._2010.String oldOther = other;
		other = newOther;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER, oldOther, newOther);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOther(org.ieee.standards.ieee1516._2010.String newOther) {
		if (newOther != other) {
			NotificationChain msgs = null;
			if (other != null)
				msgs = ((InternalEObject)other).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER, null, msgs);
			if (newOther != null)
				msgs = ((InternalEObject)newOther).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER, null, msgs);
			msgs = basicSetOther(newOther, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER, newOther, newOther));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphType1 getGlyph() {
		return glyph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGlyph(GlyphType1 newGlyph, NotificationChain msgs) {
		GlyphType1 oldGlyph = glyph;
		glyph = newGlyph;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH, oldGlyph, newGlyph);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGlyph(GlyphType1 newGlyph) {
		if (newGlyph != glyph) {
			NotificationChain msgs = null;
			if (glyph != null)
				msgs = ((InternalEObject)glyph).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH, null, msgs);
			if (newGlyph != null)
				msgs = ((InternalEObject)newGlyph).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH, null, msgs);
			msgs = basicSetGlyph(newGlyph, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH, newGlyph, newGlyph));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAny() {
		if (any == null) {
			any = new BasicFeatureMap(this, _2010Package.MODEL_IDENTIFICATION_TYPE__ANY);
		}
		return any;
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
				return basicSetName(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
				return basicSetType(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
				return basicSetVersion(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
				return basicSetModificationDate(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
				return basicSetSecurityClassification(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
				return ((InternalEList<?>)getReleaseRestriction()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
				return basicSetPurpose(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
				return basicSetApplicationDomain(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
				return basicSetDescription(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
				return basicSetUseLimitation(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
				return ((InternalEList<?>)getUseHistory()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
				return ((InternalEList<?>)getKeyword()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
				return ((InternalEList<?>)getPoc()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
				return basicSetOther(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
				return basicSetGlyph(null, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
				return ((InternalEList<?>)getAny()).basicRemove(otherEnd, msgs);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
				return getName();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
				return getType();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
				return getVersion();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
				return getModificationDate();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
				return getSecurityClassification();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
				return getReleaseRestriction();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
				return getPurpose();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
				return getApplicationDomain();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
				return getDescription();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
				return getUseLimitation();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
				return getUseHistory();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
				return getKeyword();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
				return getPoc();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
				return getReference();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
				return getOther();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
				return getGlyph();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
				if (coreType) return getAny();
				return ((FeatureMap.Internal)getAny()).getWrapper();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES:
				return getNotes();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
				setName((NonEmptyString1)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
				setType((ModelType)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
				setVersion((NonEmptyString1)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
				setSecurityClassification((SecurityClassificationType)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
				getReleaseRestriction().clear();
				getReleaseRestriction().addAll((Collection<? extends org.ieee.standards.ieee1516._2010.String>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
				setPurpose((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
				setApplicationDomain((ApplicationDomainType)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
				setDescription((NonEmptyString1)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
				setUseLimitation((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
				getUseHistory().clear();
				getUseHistory().addAll((Collection<? extends org.ieee.standards.ieee1516._2010.String>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
				getKeyword().clear();
				getKeyword().addAll((Collection<? extends KeywordType>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
				getPoc().clear();
				getPoc().addAll((Collection<? extends PocType1>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends IdReferenceType>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
				setOther((org.ieee.standards.ieee1516._2010.String)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
				setGlyph((GlyphType1)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
				((FeatureMap.Internal)getAny()).set(newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
				setName((NonEmptyString1)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
				setType((ModelType)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
				setVersion((NonEmptyString1)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
				setModificationDate((ModificationDateType)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
				setSecurityClassification((SecurityClassificationType)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
				getReleaseRestriction().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
				setPurpose((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
				setApplicationDomain((ApplicationDomainType)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
				setDescription((NonEmptyString1)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
				setUseLimitation((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
				getUseHistory().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
				getKeyword().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
				getPoc().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
				getReference().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
				setOther((org.ieee.standards.ieee1516._2010.String)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
				setGlyph((GlyphType1)null);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
				getAny().clear();
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NAME:
				return name != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__TYPE:
				return type != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__VERSION:
				return version != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__MODIFICATION_DATE:
				return modificationDate != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__SECURITY_CLASSIFICATION:
				return securityClassification != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__RELEASE_RESTRICTION:
				return releaseRestriction != null && !releaseRestriction.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__PURPOSE:
				return purpose != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__APPLICATION_DOMAIN:
				return applicationDomain != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__DESCRIPTION:
				return description != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_LIMITATION:
				return useLimitation != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__USE_HISTORY:
				return useHistory != null && !useHistory.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__KEYWORD:
				return keyword != null && !keyword.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__POC:
				return poc != null && !poc.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__REFERENCE:
				return reference != null && !reference.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__OTHER:
				return other != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__GLYPH:
				return glyph != null;
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY:
				return any != null && !any.isEmpty();
			case _2010Package.MODEL_IDENTIFICATION_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.MODEL_IDENTIFICATION_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (any: ");
		result.append(any);
		result.append(", idtag: ");
		result.append(idtag);
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ModelIdentificationTypeImpl
