/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.ieee.standards.ieee1516._2010._2010Factory;
import org.ieee.standards.ieee1516._2010._2010Package;

import org.ieee.standards.ieee1516._2010.util._2010Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2010PackageImpl extends EPackageImpl implements _2010Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "_2010.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortFederationRestoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abortFederationSaveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass alternativeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass announceSynchronizationPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDomainTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDatatypeEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arrayDataTypesType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass associateRegionsForUpdatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipAcquisitionIfAvailableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipAcquisitionNotificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipAcquisitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipDivestitureIfWantedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipReleaseDeniedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeOwnershipUnavailableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesInScopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributesOutOfScopeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataRepresentationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basicDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelAttributeOwnershipAcquisitionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelNegotiatedAttributeOwnershipDivestitureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capabilityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cardinalityTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeAttributeOrderTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass changeInteractionOrderTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commitRegionModificationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmAttributeOwnershipAcquisitionCancellationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmAttributeTransportationTypeChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmDivestitureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmFederationRestorationRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmInteractionTransportationTypeChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confirmSynchronizationPointRegistrationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectionLostTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass connectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createFederationExecutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass createRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deleteRegionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass destroyFederationExecutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionsType2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dimensionType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableAsynchronousDeliveryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableAttributeRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableAttributeScopeAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableCallbacksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableInteractionRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableObjectClassRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableTimeConstrainedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disableTimeRegulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass disconnectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discoverObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableAsynchronousDeliveryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableAttributeRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableAttributeScopeAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableCallbacksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableInteractionRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableObjectClassRelevanceAdvisorySwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableTimeConstrainedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enableTimeRegulationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endianTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratedDataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass enumeratorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evokeCallbackTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass evokeMultipleCallbacksTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federateRestoreCompleteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federateSaveBegunTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federateSaveCompleteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationRestoreBegunTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationRestoredTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationRestoreStatusResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationSavedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationSaveStatusResponseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass federationSynchronizedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedRecordDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedRecordDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedRecordDataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fixedRecordEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flushQueueRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAttributeHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAttributeNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAutomaticResignDirectiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAvailableDimensionsForClassAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getAvailableDimensionsForInteractionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDimensionHandleSetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDimensionHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDimensionNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getDimensionUpperBoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getFederateHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getFederateNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getInteractionClassHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getInteractionClassNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getKnownObjectClassHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectClassHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectClassNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectInstanceHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getObjectInstanceNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getOrderNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getOrderTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getParameterHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getParameterNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getRangeBoundsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTransportationTypeHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTransportationTypeNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getUpdateRateValueForAttributeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getUpdateRateValueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glyphTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass glyphType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifierTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass idReferenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informAttributeOwnershipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiateFederateRestoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass initiateFederateSaveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionClassType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass isAttributeOwnedByFederateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass joinFederationExecutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listFederationExecutionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass localDeleteObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lookaheadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelIdentificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationDateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modifyLookaheadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multipleObjectInstanceNamesReservedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass negotiatedAttributeOwnershipDivestitureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextMessageRequestAvailableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nextMessageRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonEmptyString1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizeFederateHandleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalizeServiceGroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass notesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectClassType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectInstanceNameReservedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectModelTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass objectsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ownershipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pocTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pocType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pocTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass provideAttributeValueUpdateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishInteractionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publishObjectClassAttributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryAttributeOwnershipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryAttributeTransportationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryFederationRestoreStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryFederationSaveStatusTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryGALTTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryInteractionTransportationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryLITSTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryLogicalTimeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass queryLookaheadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveInteractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reflectAttributeValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerFederationSynchronizationPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registerObjectInstanceWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseMultipleObjectInstanceNamesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass releaseObjectInstanceNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reliableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass removeobjectinstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportAttributeTransportationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportFederationExecutionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reportInteractionTransportationTypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAttributeOwnershipAssumptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAttributeOwnershipReleaseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAttributeTransportationTypeChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAttributeValueUpdateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestAttributeValueUpdateWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestDivestitureConfirmationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestFederationRestoreTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestFederationSaveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestInteractionTransportationTypeChangeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requestRetractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveMultipleObjectInstanceNamesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reserveObjectInstanceNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resignFederationExecutionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resignSwitchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass retractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass securityClassificationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendInteractionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendInteractionWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceUtilizationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setAutomaticResignDirectiveTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setRangeBoundsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sharingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleDataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sizeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startRegistrationForObjectClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopRegistrationForObjectClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeInteractionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeInteractionClassWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeObjectClassAttributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subscribeObjectClassAttributesWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass switchTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationPointAchievedTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationPointTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationPointType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass synchronizationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tagTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAdvanceGrantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAdvanceRequestAvailableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeAdvanceRequestTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeConstrainedEnabledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeRegulationEnabledTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeStampTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transportationType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnInteractionsOffTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnInteractionsOnTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnUpdatesOffForObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass turnUpdatesOnForObjectInstanceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unassociateRegionsForUpdatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unconditionalAttributeOwnershipDivestitureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unpublishInteractionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unpublishObjectClassAttributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeInteractionClassTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeInteractionClassWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeObjectClassAttributesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unsubscribeObjectClassAttributesWithRegionsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateAttributeValuesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateRatesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateRateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass updateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass upperBoundTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass valueTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantRecordDataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantRecordDataType1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantRecordDataTypesTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variantRecordEncodingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum applicationDomainEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum capabilityEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum endianEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fixedRecordEncodingEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum glyphTypeEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum omTypeEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum orderEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ownershipEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pocTypeEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reliableEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resignActionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum securityClassificationEnumerationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sharingEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum updateEnumerationsEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variantRecordEncodingEnumeratorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationDomainEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType applicationDomainUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayDatatypeEncodingEnumEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType arrayDatatypeEncodingUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType capabilityEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType cardinalityPatternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType dimensionValuePatternEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType endianEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fixedRecordEncodingEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType fixedRecordEncodingUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glyphTypeEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType glyphTypeUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nonEmptyStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType omTypeEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType omTypeUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType ownershipEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pocTypeEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType pocTypeUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType reliableEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType resignActionTypeObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityClassificationEnumerationObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType securityClassificationUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType sharingEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType updateEnumerationsObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variantRecordEncodingEnumeratorObjectEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variantRecordEncodingUnionEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType variantRecordEnumeratorPatternEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ieee.standards.ieee1516._2010._2010Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private _2010PackageImpl() {
		super(eNS_URI, _2010Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link _2010Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static _2010Package init() {
		if (isInited) return (_2010Package)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI);

		// Obtain or create and register package
		_2010PackageImpl the_2010Package = (_2010PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof _2010PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new _2010PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Load packages
		the_2010Package.loadPackage();

		// Fix loaded packages
		the_2010Package.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(the_2010Package, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return _2010Validator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		the_2010Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(_2010Package.eNS_URI, the_2010Package);
		return the_2010Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbortFederationRestoreType() {
		if (abortFederationRestoreTypeEClass == null) {
			abortFederationRestoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(0);
		}
		return abortFederationRestoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_Idtag() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_IsCallback() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_IsUsed() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_Notes() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_Section() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationRestoreType_AnyAttribute() {
        return (EAttribute)getAbortFederationRestoreType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbortFederationSaveType() {
		if (abortFederationSaveTypeEClass == null) {
			abortFederationSaveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(1);
		}
		return abortFederationSaveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_Idtag() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_IsCallback() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_IsUsed() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_Notes() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_Section() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAbortFederationSaveType_AnyAttribute() {
        return (EAttribute)getAbortFederationSaveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAlternativeType() {
		if (alternativeTypeEClass == null) {
			alternativeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(2);
		}
		return alternativeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeType_Enumerator() {
        return (EReference)getAlternativeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeType_Name() {
        return (EReference)getAlternativeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeType_DataType() {
        return (EReference)getAlternativeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAlternativeType_Semantics() {
        return (EReference)getAlternativeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternativeType_Any() {
        return (EAttribute)getAlternativeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternativeType_Idtag() {
        return (EAttribute)getAlternativeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternativeType_Notes() {
        return (EAttribute)getAlternativeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAlternativeType_AnyAttribute() {
        return (EAttribute)getAlternativeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAnnounceSynchronizationPointType() {
		if (announceSynchronizationPointTypeEClass == null) {
			announceSynchronizationPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(3);
		}
		return announceSynchronizationPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_Idtag() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_IsCallback() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_IsUsed() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_Notes() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_Section() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAnnounceSynchronizationPointType_AnyAttribute() {
        return (EAttribute)getAnnounceSynchronizationPointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDomainType() {
		if (applicationDomainTypeEClass == null) {
			applicationDomainTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(6);
		}
		return applicationDomainTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDomainType_Value() {
        return (EAttribute)getApplicationDomainType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDomainType_Idtag() {
        return (EAttribute)getApplicationDomainType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDomainType_Notes() {
        return (EAttribute)getApplicationDomainType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getApplicationDomainType_AnyAttribute() {
        return (EAttribute)getApplicationDomainType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDataType() {
		if (arrayDataTypeEClass == null) {
			arrayDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(8);
		}
		return arrayDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Name() {
        return (EReference)getArrayDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_DataType() {
        return (EReference)getArrayDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Cardinality() {
        return (EReference)getArrayDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Encoding() {
        return (EReference)getArrayDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataType_Semantics() {
        return (EReference)getArrayDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataType_Any() {
        return (EAttribute)getArrayDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataType_Idtag() {
        return (EAttribute)getArrayDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataType_Notes() {
        return (EAttribute)getArrayDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataType_AnyAttribute() {
        return (EAttribute)getArrayDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDataType1() {
		if (arrayDataType1EClass == null) {
			arrayDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(9);
		}
		return arrayDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDatatypeEncodingType() {
		if (arrayDatatypeEncodingTypeEClass == null) {
			arrayDatatypeEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(11);
		}
		return arrayDatatypeEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatypeEncodingType_Value() {
        return (EAttribute)getArrayDatatypeEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatypeEncodingType_Idtag() {
        return (EAttribute)getArrayDatatypeEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatypeEncodingType_Notes() {
        return (EAttribute)getArrayDatatypeEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDatatypeEncodingType_AnyAttribute() {
        return (EAttribute)getArrayDatatypeEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDataTypesType() {
		if (arrayDataTypesTypeEClass == null) {
			arrayDataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(13);
		}
		return arrayDataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArrayDataTypesType_ArrayData() {
        return (EReference)getArrayDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataTypesType_Any() {
        return (EAttribute)getArrayDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataTypesType_Idtag() {
        return (EAttribute)getArrayDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataTypesType_Notes() {
        return (EAttribute)getArrayDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArrayDataTypesType_AnyAttribute() {
        return (EAttribute)getArrayDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArrayDataTypesType1() {
		if (arrayDataTypesType1EClass == null) {
			arrayDataTypesType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(14);
		}
		return arrayDataTypesType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssociateRegionsForUpdatesType() {
		if (associateRegionsForUpdatesTypeEClass == null) {
			associateRegionsForUpdatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(15);
		}
		return associateRegionsForUpdatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_Idtag() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_IsCallback() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_IsUsed() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_Notes() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_Section() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAssociateRegionsForUpdatesType_AnyAttribute() {
        return (EAttribute)getAssociateRegionsForUpdatesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipAcquisitionIfAvailableType() {
		if (attributeOwnershipAcquisitionIfAvailableTypeEClass == null) {
			attributeOwnershipAcquisitionIfAvailableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(16);
		}
		return attributeOwnershipAcquisitionIfAvailableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_Idtag() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_IsCallback() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_IsUsed() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_Notes() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_Section() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionIfAvailableType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipAcquisitionIfAvailableType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipAcquisitionNotificationType() {
		if (attributeOwnershipAcquisitionNotificationTypeEClass == null) {
			attributeOwnershipAcquisitionNotificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(17);
		}
		return attributeOwnershipAcquisitionNotificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_Idtag() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_IsCallback() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_IsUsed() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_Notes() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_Section() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionNotificationType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipAcquisitionNotificationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipAcquisitionType() {
		if (attributeOwnershipAcquisitionTypeEClass == null) {
			attributeOwnershipAcquisitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(18);
		}
		return attributeOwnershipAcquisitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_Idtag() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_IsCallback() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_IsUsed() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_Notes() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_Section() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipAcquisitionType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipDivestitureIfWantedType() {
		if (attributeOwnershipDivestitureIfWantedTypeEClass == null) {
			attributeOwnershipDivestitureIfWantedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(19);
		}
		return attributeOwnershipDivestitureIfWantedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_Idtag() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_IsCallback() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_IsUsed() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_Notes() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_Section() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipDivestitureIfWantedType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipDivestitureIfWantedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipReleaseDeniedType() {
		if (attributeOwnershipReleaseDeniedTypeEClass == null) {
			attributeOwnershipReleaseDeniedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(20);
		}
		return attributeOwnershipReleaseDeniedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_Idtag() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_IsCallback() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_IsUsed() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_Notes() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_Section() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipReleaseDeniedType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipReleaseDeniedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeOwnershipUnavailableType() {
		if (attributeOwnershipUnavailableTypeEClass == null) {
			attributeOwnershipUnavailableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(21);
		}
		return attributeOwnershipUnavailableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_Idtag() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_IsCallback() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_IsUsed() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_Notes() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_Section() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeOwnershipUnavailableType_AnyAttribute() {
        return (EAttribute)getAttributeOwnershipUnavailableType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributesInScopeType() {
		if (attributesInScopeTypeEClass == null) {
			attributesInScopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(22);
		}
		return attributesInScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_Idtag() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_IsCallback() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_IsUsed() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_Notes() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_Section() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesInScopeType_AnyAttribute() {
        return (EAttribute)getAttributesInScopeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributesOutOfScopeType() {
		if (attributesOutOfScopeTypeEClass == null) {
			attributesOutOfScopeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(23);
		}
		return attributesOutOfScopeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_Idtag() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_IsCallback() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_IsUsed() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_Notes() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_Section() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributesOutOfScopeType_AnyAttribute() {
        return (EAttribute)getAttributesOutOfScopeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType() {
		if (attributeTypeEClass == null) {
			attributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(24);
		}
		return attributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Name() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_DataType() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_UpdateType() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_UpdateCondition() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Ownership() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Sharing() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Dimensions() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Transportation() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Order() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAttributeType_Semantics() {
        return (EReference)getAttributeType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Any() {
        return (EAttribute)getAttributeType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Idtag() {
        return (EAttribute)getAttributeType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_Notes() {
        return (EAttribute)getAttributeType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAttributeType_AnyAttribute() {
        return (EAttribute)getAttributeType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAttributeType1() {
		if (attributeType1EClass == null) {
			attributeType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(25);
		}
		return attributeType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicDataRepresentationsType() {
		if (basicDataRepresentationsTypeEClass == null) {
			basicDataRepresentationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(26);
		}
		return basicDataRepresentationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataRepresentationsType_BasicData() {
        return (EReference)getBasicDataRepresentationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataRepresentationsType_Any() {
        return (EAttribute)getBasicDataRepresentationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataRepresentationsType_Idtag() {
        return (EAttribute)getBasicDataRepresentationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataRepresentationsType_Notes() {
        return (EAttribute)getBasicDataRepresentationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataRepresentationsType_AnyAttribute() {
        return (EAttribute)getBasicDataRepresentationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicDataType() {
		if (basicDataTypeEClass == null) {
			basicDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(27);
		}
		return basicDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataType_Name() {
        return (EReference)getBasicDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataType_Size() {
        return (EReference)getBasicDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataType_Interpretation() {
        return (EReference)getBasicDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataType_Endian() {
        return (EReference)getBasicDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasicDataType_Encoding() {
        return (EReference)getBasicDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataType_Any() {
        return (EAttribute)getBasicDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataType_Idtag() {
        return (EAttribute)getBasicDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataType_Notes() {
        return (EAttribute)getBasicDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasicDataType_AnyAttribute() {
        return (EAttribute)getBasicDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasicDataType1() {
		if (basicDataType1EClass == null) {
			basicDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(28);
		}
		return basicDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelAttributeOwnershipAcquisitionType() {
		if (cancelAttributeOwnershipAcquisitionTypeEClass == null) {
			cancelAttributeOwnershipAcquisitionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(29);
		}
		return cancelAttributeOwnershipAcquisitionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_Idtag() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_IsCallback() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_IsUsed() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_Notes() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_Section() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelAttributeOwnershipAcquisitionType_AnyAttribute() {
        return (EAttribute)getCancelAttributeOwnershipAcquisitionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelNegotiatedAttributeOwnershipDivestitureType() {
		if (cancelNegotiatedAttributeOwnershipDivestitureTypeEClass == null) {
			cancelNegotiatedAttributeOwnershipDivestitureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(30);
		}
		return cancelNegotiatedAttributeOwnershipDivestitureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_Idtag() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_IsCallback() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_IsUsed() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_Notes() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_Section() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCancelNegotiatedAttributeOwnershipDivestitureType_AnyAttribute() {
        return (EAttribute)getCancelNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapabilityType() {
		if (capabilityTypeEClass == null) {
			capabilityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(33);
		}
		return capabilityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityType_Value() {
        return (EAttribute)getCapabilityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityType_Idtag() {
        return (EAttribute)getCapabilityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityType_Notes() {
        return (EAttribute)getCapabilityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapabilityType_AnyAttribute() {
        return (EAttribute)getCapabilityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCardinalityType() {
		if (cardinalityTypeEClass == null) {
			cardinalityTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(35);
		}
		return cardinalityTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityType_Value() {
        return (EAttribute)getCardinalityType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityType_Idtag() {
        return (EAttribute)getCardinalityType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityType_Notes() {
        return (EAttribute)getCardinalityType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCardinalityType_AnyAttribute() {
        return (EAttribute)getCardinalityType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeAttributeOrderTypeType() {
		if (changeAttributeOrderTypeTypeEClass == null) {
			changeAttributeOrderTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(36);
		}
		return changeAttributeOrderTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_Idtag() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_IsCallback() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_IsUsed() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_Notes() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_Section() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeAttributeOrderTypeType_AnyAttribute() {
        return (EAttribute)getChangeAttributeOrderTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChangeInteractionOrderTypeType() {
		if (changeInteractionOrderTypeTypeEClass == null) {
			changeInteractionOrderTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(37);
		}
		return changeInteractionOrderTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_Idtag() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_IsCallback() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_IsUsed() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_Notes() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_Section() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChangeInteractionOrderTypeType_AnyAttribute() {
        return (EAttribute)getChangeInteractionOrderTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommitRegionModificationsType() {
		if (commitRegionModificationsTypeEClass == null) {
			commitRegionModificationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(38);
		}
		return commitRegionModificationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_Idtag() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_IsCallback() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_IsUsed() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_Notes() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_Section() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommitRegionModificationsType_AnyAttribute() {
        return (EAttribute)getCommitRegionModificationsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmAttributeOwnershipAcquisitionCancellationType() {
		if (confirmAttributeOwnershipAcquisitionCancellationTypeEClass == null) {
			confirmAttributeOwnershipAcquisitionCancellationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(39);
		}
		return confirmAttributeOwnershipAcquisitionCancellationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_Idtag() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_IsCallback() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_IsUsed() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_Notes() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_Section() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeOwnershipAcquisitionCancellationType_AnyAttribute() {
        return (EAttribute)getConfirmAttributeOwnershipAcquisitionCancellationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmAttributeTransportationTypeChangeType() {
		if (confirmAttributeTransportationTypeChangeTypeEClass == null) {
			confirmAttributeTransportationTypeChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(40);
		}
		return confirmAttributeTransportationTypeChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_Idtag() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_IsCallback() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_IsUsed() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_Notes() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_Section() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmAttributeTransportationTypeChangeType_AnyAttribute() {
        return (EAttribute)getConfirmAttributeTransportationTypeChangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmDivestitureType() {
		if (confirmDivestitureTypeEClass == null) {
			confirmDivestitureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(41);
		}
		return confirmDivestitureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_Idtag() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_IsCallback() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_IsUsed() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_Notes() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_Section() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmDivestitureType_AnyAttribute() {
        return (EAttribute)getConfirmDivestitureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmFederationRestorationRequestType() {
		if (confirmFederationRestorationRequestTypeEClass == null) {
			confirmFederationRestorationRequestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(42);
		}
		return confirmFederationRestorationRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_Idtag() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_IsCallback() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_IsUsed() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_Notes() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_Section() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmFederationRestorationRequestType_AnyAttribute() {
        return (EAttribute)getConfirmFederationRestorationRequestType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmInteractionTransportationTypeChangeType() {
		if (confirmInteractionTransportationTypeChangeTypeEClass == null) {
			confirmInteractionTransportationTypeChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(43);
		}
		return confirmInteractionTransportationTypeChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_Idtag() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_IsCallback() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_IsUsed() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_Notes() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_Section() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmInteractionTransportationTypeChangeType_AnyAttribute() {
        return (EAttribute)getConfirmInteractionTransportationTypeChangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfirmSynchronizationPointRegistrationType() {
		if (confirmSynchronizationPointRegistrationTypeEClass == null) {
			confirmSynchronizationPointRegistrationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(44);
		}
		return confirmSynchronizationPointRegistrationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_Idtag() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_IsCallback() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_IsUsed() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_Notes() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_Section() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfirmSynchronizationPointRegistrationType_AnyAttribute() {
        return (EAttribute)getConfirmSynchronizationPointRegistrationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectionLostType() {
		if (connectionLostTypeEClass == null) {
			connectionLostTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(45);
		}
		return connectionLostTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_Idtag() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_IsCallback() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_IsUsed() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_Notes() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_Section() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectionLostType_AnyAttribute() {
        return (EAttribute)getConnectionLostType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConnectType() {
		if (connectTypeEClass == null) {
			connectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(46);
		}
		return connectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_Idtag() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_IsCallback() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_IsUsed() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_Notes() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_Section() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConnectType_AnyAttribute() {
        return (EAttribute)getConnectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateFederationExecutionType() {
		if (createFederationExecutionTypeEClass == null) {
			createFederationExecutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(47);
		}
		return createFederationExecutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_Idtag() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_IsCallback() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_IsUsed() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_Notes() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_Section() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateFederationExecutionType_AnyAttribute() {
        return (EAttribute)getCreateFederationExecutionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCreateRegionType() {
		if (createRegionTypeEClass == null) {
			createRegionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(48);
		}
		return createRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_Idtag() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_IsCallback() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_IsUsed() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_Notes() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_Section() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCreateRegionType_AnyAttribute() {
        return (EAttribute)getCreateRegionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataTypesType() {
		if (dataTypesTypeEClass == null) {
			dataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(49);
		}
		return dataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_BasicDataRepresentations() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_SimpleDataTypes() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_EnumeratedDataTypes() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_ArrayDataTypes() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_FixedRecordDataTypes() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataTypesType_VariantRecordDataTypes() {
        return (EReference)getDataTypesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesType_Any() {
        return (EAttribute)getDataTypesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesType_Idtag() {
        return (EAttribute)getDataTypesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesType_Notes() {
        return (EAttribute)getDataTypesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataTypesType_AnyAttribute() {
        return (EAttribute)getDataTypesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteObjectInstanceType() {
		if (deleteObjectInstanceTypeEClass == null) {
			deleteObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(50);
		}
		return deleteObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_Idtag() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_IsCallback() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_IsUsed() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_Notes() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_Section() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteObjectInstanceType_AnyAttribute() {
        return (EAttribute)getDeleteObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDeleteRegionType() {
		if (deleteRegionTypeEClass == null) {
			deleteRegionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(51);
		}
		return deleteRegionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_Idtag() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_IsCallback() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_IsUsed() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_Notes() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_Section() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDeleteRegionType_AnyAttribute() {
        return (EAttribute)getDeleteRegionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDestroyFederationExecutionType() {
		if (destroyFederationExecutionTypeEClass == null) {
			destroyFederationExecutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(52);
		}
		return destroyFederationExecutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_Idtag() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_IsCallback() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_IsUsed() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_Notes() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_Section() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDestroyFederationExecutionType_AnyAttribute() {
        return (EAttribute)getDestroyFederationExecutionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionsType() {
		if (dimensionsTypeEClass == null) {
			dimensionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(53);
		}
		return dimensionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionsType_Dimension() {
        return (EReference)getDimensionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType_Any() {
        return (EAttribute)getDimensionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType_Idtag() {
        return (EAttribute)getDimensionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType_Notes() {
        return (EAttribute)getDimensionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType_AnyAttribute() {
        return (EAttribute)getDimensionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionsType1() {
		if (dimensionsType1EClass == null) {
			dimensionsType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(54);
		}
		return dimensionsType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionsType1_Dimension() {
        return (EReference)getDimensionsType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType1_Any() {
        return (EAttribute)getDimensionsType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType1_Idtag() {
        return (EAttribute)getDimensionsType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType1_Notes() {
        return (EAttribute)getDimensionsType1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType1_AnyAttribute() {
        return (EAttribute)getDimensionsType1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionsType2() {
		if (dimensionsType2EClass == null) {
			dimensionsType2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(55);
		}
		return dimensionsType2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionsType2_Dimension() {
        return (EReference)getDimensionsType2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType2_Any() {
        return (EAttribute)getDimensionsType2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType2_Idtag() {
        return (EAttribute)getDimensionsType2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType2_Notes() {
        return (EAttribute)getDimensionsType2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionsType2_AnyAttribute() {
        return (EAttribute)getDimensionsType2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionType() {
		if (dimensionTypeEClass == null) {
			dimensionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(56);
		}
		return dimensionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_Name() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_DataType() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_UpperBound() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_Normalization() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDimensionType_Value() {
        return (EReference)getDimensionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionType_Any() {
        return (EAttribute)getDimensionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionType_Idtag() {
        return (EAttribute)getDimensionType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionType_Notes() {
        return (EAttribute)getDimensionType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDimensionType_AnyAttribute() {
        return (EAttribute)getDimensionType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDimensionType1() {
		if (dimensionType1EClass == null) {
			dimensionType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(57);
		}
		return dimensionType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableAsynchronousDeliveryType() {
		if (disableAsynchronousDeliveryTypeEClass == null) {
			disableAsynchronousDeliveryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(59);
		}
		return disableAsynchronousDeliveryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_Idtag() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_IsCallback() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_IsUsed() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_Notes() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_Section() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAsynchronousDeliveryType_AnyAttribute() {
        return (EAttribute)getDisableAsynchronousDeliveryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableAttributeRelevanceAdvisorySwitchType() {
		if (disableAttributeRelevanceAdvisorySwitchTypeEClass == null) {
			disableAttributeRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(60);
		}
		return disableAttributeRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getDisableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableAttributeScopeAdvisorySwitchType() {
		if (disableAttributeScopeAdvisorySwitchTypeEClass == null) {
			disableAttributeScopeAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(61);
		}
		return disableAttributeScopeAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_Idtag() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_IsCallback() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_IsUsed() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_Notes() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_Section() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableAttributeScopeAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getDisableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableCallbacksType() {
		if (disableCallbacksTypeEClass == null) {
			disableCallbacksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(62);
		}
		return disableCallbacksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_Idtag() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_IsCallback() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_IsUsed() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_Notes() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_Section() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableCallbacksType_AnyAttribute() {
        return (EAttribute)getDisableCallbacksType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableInteractionRelevanceAdvisorySwitchType() {
		if (disableInteractionRelevanceAdvisorySwitchTypeEClass == null) {
			disableInteractionRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(63);
		}
		return disableInteractionRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableInteractionRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getDisableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableObjectClassRelevanceAdvisorySwitchType() {
		if (disableObjectClassRelevanceAdvisorySwitchTypeEClass == null) {
			disableObjectClassRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(64);
		}
		return disableObjectClassRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableObjectClassRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getDisableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableTimeConstrainedType() {
		if (disableTimeConstrainedTypeEClass == null) {
			disableTimeConstrainedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(65);
		}
		return disableTimeConstrainedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_Idtag() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_IsCallback() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_IsUsed() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_Notes() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_Section() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeConstrainedType_AnyAttribute() {
        return (EAttribute)getDisableTimeConstrainedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisableTimeRegulationType() {
		if (disableTimeRegulationTypeEClass == null) {
			disableTimeRegulationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(66);
		}
		return disableTimeRegulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_Idtag() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_IsCallback() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_IsUsed() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_Notes() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_Section() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisableTimeRegulationType_AnyAttribute() {
        return (EAttribute)getDisableTimeRegulationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDisconnectType() {
		if (disconnectTypeEClass == null) {
			disconnectTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(67);
		}
		return disconnectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_Idtag() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_IsCallback() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_IsUsed() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_Notes() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_Section() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDisconnectType_AnyAttribute() {
        return (EAttribute)getDisconnectType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscoverObjectInstanceType() {
		if (discoverObjectInstanceTypeEClass == null) {
			discoverObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(68);
		}
		return discoverObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_Idtag() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_IsCallback() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_IsUsed() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_Notes() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_Section() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDiscoverObjectInstanceType_AnyAttribute() {
        return (EAttribute)getDiscoverObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		if (documentRootEClass == null) {
			documentRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(69);
		}
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
        return (EAttribute)getDocumentRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Attribute() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_InteractionClass() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectClass() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_ObjectModel() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Parameter() {
        return (EReference)getDocumentRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableAsynchronousDeliveryType() {
		if (enableAsynchronousDeliveryTypeEClass == null) {
			enableAsynchronousDeliveryTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(70);
		}
		return enableAsynchronousDeliveryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_Idtag() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_IsCallback() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_IsUsed() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_Notes() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_Section() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAsynchronousDeliveryType_AnyAttribute() {
        return (EAttribute)getEnableAsynchronousDeliveryType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableAttributeRelevanceAdvisorySwitchType() {
		if (enableAttributeRelevanceAdvisorySwitchTypeEClass == null) {
			enableAttributeRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(71);
		}
		return enableAttributeRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getEnableAttributeRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableAttributeScopeAdvisorySwitchType() {
		if (enableAttributeScopeAdvisorySwitchTypeEClass == null) {
			enableAttributeScopeAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(72);
		}
		return enableAttributeScopeAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_Idtag() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_IsCallback() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_IsUsed() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_Notes() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_Section() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableAttributeScopeAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getEnableAttributeScopeAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableCallbacksType() {
		if (enableCallbacksTypeEClass == null) {
			enableCallbacksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(73);
		}
		return enableCallbacksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_Idtag() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_IsCallback() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_IsUsed() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_Notes() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_Section() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableCallbacksType_AnyAttribute() {
        return (EAttribute)getEnableCallbacksType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableInteractionRelevanceAdvisorySwitchType() {
		if (enableInteractionRelevanceAdvisorySwitchTypeEClass == null) {
			enableInteractionRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(74);
		}
		return enableInteractionRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableInteractionRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getEnableInteractionRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableObjectClassRelevanceAdvisorySwitchType() {
		if (enableObjectClassRelevanceAdvisorySwitchTypeEClass == null) {
			enableObjectClassRelevanceAdvisorySwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(75);
		}
		return enableObjectClassRelevanceAdvisorySwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_Idtag() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_IsCallback() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_IsUsed() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_Notes() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_Section() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableObjectClassRelevanceAdvisorySwitchType_AnyAttribute() {
        return (EAttribute)getEnableObjectClassRelevanceAdvisorySwitchType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableTimeConstrainedType() {
		if (enableTimeConstrainedTypeEClass == null) {
			enableTimeConstrainedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(76);
		}
		return enableTimeConstrainedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_Idtag() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_IsCallback() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_IsUsed() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_Notes() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_Section() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeConstrainedType_AnyAttribute() {
        return (EAttribute)getEnableTimeConstrainedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnableTimeRegulationType() {
		if (enableTimeRegulationTypeEClass == null) {
			enableTimeRegulationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(77);
		}
		return enableTimeRegulationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_Idtag() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_IsCallback() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_IsUsed() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_Notes() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_Section() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnableTimeRegulationType_AnyAttribute() {
        return (EAttribute)getEnableTimeRegulationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndianType() {
		if (endianTypeEClass == null) {
			endianTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(80);
		}
		return endianTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndianType_Value() {
        return (EAttribute)getEndianType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndianType_Idtag() {
        return (EAttribute)getEndianType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndianType_Notes() {
        return (EAttribute)getEndianType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEndianType_AnyAttribute() {
        return (EAttribute)getEndianType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedDataType() {
		if (enumeratedDataTypeEClass == null) {
			enumeratedDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(81);
		}
		return enumeratedDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataType_Name() {
        return (EReference)getEnumeratedDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataType_Representation() {
        return (EReference)getEnumeratedDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataType_Semantics() {
        return (EReference)getEnumeratedDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataType_Enumerator() {
        return (EReference)getEnumeratedDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataType_Any() {
        return (EAttribute)getEnumeratedDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataType_Idtag() {
        return (EAttribute)getEnumeratedDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataType_Notes() {
        return (EAttribute)getEnumeratedDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataType_AnyAttribute() {
        return (EAttribute)getEnumeratedDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedDataType1() {
		if (enumeratedDataType1EClass == null) {
			enumeratedDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(82);
		}
		return enumeratedDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratedDataTypesType() {
		if (enumeratedDataTypesTypeEClass == null) {
			enumeratedDataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(83);
		}
		return enumeratedDataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratedDataTypesType_EnumeratedData() {
        return (EReference)getEnumeratedDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataTypesType_Any() {
        return (EAttribute)getEnumeratedDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataTypesType_Idtag() {
        return (EAttribute)getEnumeratedDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataTypesType_Notes() {
        return (EAttribute)getEnumeratedDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratedDataTypesType_AnyAttribute() {
        return (EAttribute)getEnumeratedDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnumeratorType() {
		if (enumeratorTypeEClass == null) {
			enumeratorTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(84);
		}
		return enumeratorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratorType_Name() {
        return (EReference)getEnumeratorType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnumeratorType_Value() {
        return (EReference)getEnumeratorType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratorType_Any() {
        return (EAttribute)getEnumeratorType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratorType_Idtag() {
        return (EAttribute)getEnumeratorType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratorType_Notes() {
        return (EAttribute)getEnumeratorType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnumeratorType_AnyAttribute() {
        return (EAttribute)getEnumeratorType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvokeCallbackType() {
		if (evokeCallbackTypeEClass == null) {
			evokeCallbackTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(85);
		}
		return evokeCallbackTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_Idtag() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_IsCallback() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_IsUsed() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_Notes() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_Section() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeCallbackType_AnyAttribute() {
        return (EAttribute)getEvokeCallbackType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEvokeMultipleCallbacksType() {
		if (evokeMultipleCallbacksTypeEClass == null) {
			evokeMultipleCallbacksTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(86);
		}
		return evokeMultipleCallbacksTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_Idtag() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_IsCallback() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_IsUsed() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_Notes() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_Section() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEvokeMultipleCallbacksType_AnyAttribute() {
        return (EAttribute)getEvokeMultipleCallbacksType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederateRestoreCompleteType() {
		if (federateRestoreCompleteTypeEClass == null) {
			federateRestoreCompleteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(87);
		}
		return federateRestoreCompleteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_Idtag() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_IsCallback() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_IsUsed() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_Notes() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_Section() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateRestoreCompleteType_AnyAttribute() {
        return (EAttribute)getFederateRestoreCompleteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederateSaveBegunType() {
		if (federateSaveBegunTypeEClass == null) {
			federateSaveBegunTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(88);
		}
		return federateSaveBegunTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_Idtag() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_IsCallback() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_IsUsed() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_Notes() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_Section() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveBegunType_AnyAttribute() {
        return (EAttribute)getFederateSaveBegunType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederateSaveCompleteType() {
		if (federateSaveCompleteTypeEClass == null) {
			federateSaveCompleteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(89);
		}
		return federateSaveCompleteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_Idtag() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_IsCallback() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_IsUsed() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_Notes() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_Section() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederateSaveCompleteType_AnyAttribute() {
        return (EAttribute)getFederateSaveCompleteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationRestoreBegunType() {
		if (federationRestoreBegunTypeEClass == null) {
			federationRestoreBegunTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(90);
		}
		return federationRestoreBegunTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_Idtag() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_IsCallback() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_IsUsed() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_Notes() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_Section() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreBegunType_AnyAttribute() {
        return (EAttribute)getFederationRestoreBegunType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationRestoredType() {
		if (federationRestoredTypeEClass == null) {
			federationRestoredTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(91);
		}
		return federationRestoredTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_Idtag() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_IsCallback() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_IsUsed() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_Notes() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_Section() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoredType_AnyAttribute() {
        return (EAttribute)getFederationRestoredType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationRestoreStatusResponseType() {
		if (federationRestoreStatusResponseTypeEClass == null) {
			federationRestoreStatusResponseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(92);
		}
		return federationRestoreStatusResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_Idtag() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_IsCallback() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_IsUsed() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_Notes() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_Section() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationRestoreStatusResponseType_AnyAttribute() {
        return (EAttribute)getFederationRestoreStatusResponseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationSavedType() {
		if (federationSavedTypeEClass == null) {
			federationSavedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(93);
		}
		return federationSavedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_Idtag() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_IsCallback() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_IsUsed() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_Notes() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_Section() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSavedType_AnyAttribute() {
        return (EAttribute)getFederationSavedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationSaveStatusResponseType() {
		if (federationSaveStatusResponseTypeEClass == null) {
			federationSaveStatusResponseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(94);
		}
		return federationSaveStatusResponseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_Idtag() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_IsCallback() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_IsUsed() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_Notes() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_Section() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSaveStatusResponseType_AnyAttribute() {
        return (EAttribute)getFederationSaveStatusResponseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFederationSynchronizedType() {
		if (federationSynchronizedTypeEClass == null) {
			federationSynchronizedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(95);
		}
		return federationSynchronizedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_Idtag() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_IsCallback() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_IsUsed() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_Notes() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_Section() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFederationSynchronizedType_AnyAttribute() {
        return (EAttribute)getFederationSynchronizedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFieldType() {
		if (fieldTypeEClass == null) {
			fieldTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(96);
		}
		return fieldTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_Name() {
        return (EReference)getFieldType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_DataType() {
        return (EReference)getFieldType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFieldType_Semantics() {
        return (EReference)getFieldType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Any() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Idtag() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_Notes() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFieldType_AnyAttribute() {
        return (EAttribute)getFieldType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedRecordDataType() {
		if (fixedRecordDataTypeEClass == null) {
			fixedRecordDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(97);
		}
		return fixedRecordDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedRecordDataType_Name() {
        return (EReference)getFixedRecordDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedRecordDataType_Encoding() {
        return (EReference)getFixedRecordDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedRecordDataType_Semantics() {
        return (EReference)getFixedRecordDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedRecordDataType_Field() {
        return (EReference)getFixedRecordDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataType_Any() {
        return (EAttribute)getFixedRecordDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataType_Idtag() {
        return (EAttribute)getFixedRecordDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataType_Notes() {
        return (EAttribute)getFixedRecordDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataType_AnyAttribute() {
        return (EAttribute)getFixedRecordDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedRecordDataType1() {
		if (fixedRecordDataType1EClass == null) {
			fixedRecordDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(98);
		}
		return fixedRecordDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedRecordDataTypesType() {
		if (fixedRecordDataTypesTypeEClass == null) {
			fixedRecordDataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(99);
		}
		return fixedRecordDataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFixedRecordDataTypesType_FixedRecordData() {
        return (EReference)getFixedRecordDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataTypesType_Any() {
        return (EAttribute)getFixedRecordDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataTypesType_Idtag() {
        return (EAttribute)getFixedRecordDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataTypesType_Notes() {
        return (EAttribute)getFixedRecordDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordDataTypesType_AnyAttribute() {
        return (EAttribute)getFixedRecordDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFixedRecordEncodingType() {
		if (fixedRecordEncodingTypeEClass == null) {
			fixedRecordEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(102);
		}
		return fixedRecordEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordEncodingType_Value() {
        return (EAttribute)getFixedRecordEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordEncodingType_Idtag() {
        return (EAttribute)getFixedRecordEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordEncodingType_Notes() {
        return (EAttribute)getFixedRecordEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFixedRecordEncodingType_AnyAttribute() {
        return (EAttribute)getFixedRecordEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlushQueueRequestType() {
		if (flushQueueRequestTypeEClass == null) {
			flushQueueRequestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(104);
		}
		return flushQueueRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_Idtag() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_IsCallback() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_IsUsed() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_Notes() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_Section() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFlushQueueRequestType_AnyAttribute() {
        return (EAttribute)getFlushQueueRequestType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAttributeHandleType() {
		if (getAttributeHandleTypeEClass == null) {
			getAttributeHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(105);
		}
		return getAttributeHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_Idtag() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_IsCallback() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_IsUsed() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_Notes() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_Section() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeHandleType_AnyAttribute() {
        return (EAttribute)getGetAttributeHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAttributeNameType() {
		if (getAttributeNameTypeEClass == null) {
			getAttributeNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(106);
		}
		return getAttributeNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_Idtag() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_IsCallback() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_IsUsed() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_Notes() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_Section() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAttributeNameType_AnyAttribute() {
        return (EAttribute)getGetAttributeNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAutomaticResignDirectiveType() {
		if (getAutomaticResignDirectiveTypeEClass == null) {
			getAutomaticResignDirectiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(107);
		}
		return getAutomaticResignDirectiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_Idtag() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_IsCallback() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_IsUsed() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_Notes() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_Section() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAutomaticResignDirectiveType_AnyAttribute() {
        return (EAttribute)getGetAutomaticResignDirectiveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAvailableDimensionsForClassAttributeType() {
		if (getAvailableDimensionsForClassAttributeTypeEClass == null) {
			getAvailableDimensionsForClassAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(108);
		}
		return getAvailableDimensionsForClassAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_Idtag() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_IsCallback() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_IsUsed() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_Notes() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_Section() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForClassAttributeType_AnyAttribute() {
        return (EAttribute)getGetAvailableDimensionsForClassAttributeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetAvailableDimensionsForInteractionClassType() {
		if (getAvailableDimensionsForInteractionClassTypeEClass == null) {
			getAvailableDimensionsForInteractionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(109);
		}
		return getAvailableDimensionsForInteractionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_Idtag() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_IsCallback() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_IsUsed() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_Notes() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_Section() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetAvailableDimensionsForInteractionClassType_AnyAttribute() {
        return (EAttribute)getGetAvailableDimensionsForInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDimensionHandleSetType() {
		if (getDimensionHandleSetTypeEClass == null) {
			getDimensionHandleSetTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(110);
		}
		return getDimensionHandleSetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_Idtag() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_IsCallback() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_IsUsed() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_Notes() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_Section() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleSetType_AnyAttribute() {
        return (EAttribute)getGetDimensionHandleSetType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDimensionHandleType() {
		if (getDimensionHandleTypeEClass == null) {
			getDimensionHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(111);
		}
		return getDimensionHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_Idtag() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_IsCallback() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_IsUsed() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_Notes() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_Section() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionHandleType_AnyAttribute() {
        return (EAttribute)getGetDimensionHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDimensionNameType() {
		if (getDimensionNameTypeEClass == null) {
			getDimensionNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(112);
		}
		return getDimensionNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_Idtag() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_IsCallback() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_IsUsed() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_Notes() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_Section() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionNameType_AnyAttribute() {
        return (EAttribute)getGetDimensionNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetDimensionUpperBoundType() {
		if (getDimensionUpperBoundTypeEClass == null) {
			getDimensionUpperBoundTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(113);
		}
		return getDimensionUpperBoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_Idtag() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_IsCallback() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_IsUsed() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_Notes() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_Section() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetDimensionUpperBoundType_AnyAttribute() {
        return (EAttribute)getGetDimensionUpperBoundType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetFederateHandleType() {
		if (getFederateHandleTypeEClass == null) {
			getFederateHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(114);
		}
		return getFederateHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_Idtag() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_IsCallback() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_IsUsed() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_Notes() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_Section() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateHandleType_AnyAttribute() {
        return (EAttribute)getGetFederateHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetFederateNameType() {
		if (getFederateNameTypeEClass == null) {
			getFederateNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(115);
		}
		return getFederateNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_Idtag() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_IsCallback() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_IsUsed() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_Notes() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_Section() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetFederateNameType_AnyAttribute() {
        return (EAttribute)getGetFederateNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetInteractionClassHandleType() {
		if (getInteractionClassHandleTypeEClass == null) {
			getInteractionClassHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(116);
		}
		return getInteractionClassHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_Idtag() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_IsCallback() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_IsUsed() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_Notes() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_Section() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassHandleType_AnyAttribute() {
        return (EAttribute)getGetInteractionClassHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetInteractionClassNameType() {
		if (getInteractionClassNameTypeEClass == null) {
			getInteractionClassNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(117);
		}
		return getInteractionClassNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_Idtag() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_IsCallback() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_IsUsed() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_Notes() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_Section() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetInteractionClassNameType_AnyAttribute() {
        return (EAttribute)getGetInteractionClassNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetKnownObjectClassHandleType() {
		if (getKnownObjectClassHandleTypeEClass == null) {
			getKnownObjectClassHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(118);
		}
		return getKnownObjectClassHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_Idtag() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_IsCallback() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_IsUsed() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_Notes() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_Section() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetKnownObjectClassHandleType_AnyAttribute() {
        return (EAttribute)getGetKnownObjectClassHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetObjectClassHandleType() {
		if (getObjectClassHandleTypeEClass == null) {
			getObjectClassHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(119);
		}
		return getObjectClassHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_Idtag() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_IsCallback() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_IsUsed() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_Notes() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_Section() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassHandleType_AnyAttribute() {
        return (EAttribute)getGetObjectClassHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetObjectClassNameType() {
		if (getObjectClassNameTypeEClass == null) {
			getObjectClassNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(120);
		}
		return getObjectClassNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_Idtag() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_IsCallback() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_IsUsed() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_Notes() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_Section() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectClassNameType_AnyAttribute() {
        return (EAttribute)getGetObjectClassNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetObjectInstanceHandleType() {
		if (getObjectInstanceHandleTypeEClass == null) {
			getObjectInstanceHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(121);
		}
		return getObjectInstanceHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_Idtag() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_IsCallback() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_IsUsed() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_Notes() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_Section() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceHandleType_AnyAttribute() {
        return (EAttribute)getGetObjectInstanceHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetObjectInstanceNameType() {
		if (getObjectInstanceNameTypeEClass == null) {
			getObjectInstanceNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(122);
		}
		return getObjectInstanceNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_Idtag() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_IsCallback() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_IsUsed() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_Notes() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_Section() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetObjectInstanceNameType_AnyAttribute() {
        return (EAttribute)getGetObjectInstanceNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetOrderNameType() {
		if (getOrderNameTypeEClass == null) {
			getOrderNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(123);
		}
		return getOrderNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_Idtag() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_IsCallback() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_IsUsed() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_Notes() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_Section() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderNameType_AnyAttribute() {
        return (EAttribute)getGetOrderNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetOrderTypeType() {
		if (getOrderTypeTypeEClass == null) {
			getOrderTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(124);
		}
		return getOrderTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_Idtag() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_IsCallback() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_IsUsed() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_Notes() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_Section() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetOrderTypeType_AnyAttribute() {
        return (EAttribute)getGetOrderTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetParameterHandleType() {
		if (getParameterHandleTypeEClass == null) {
			getParameterHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(125);
		}
		return getParameterHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_Idtag() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_IsCallback() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_IsUsed() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_Notes() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_Section() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterHandleType_AnyAttribute() {
        return (EAttribute)getGetParameterHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetParameterNameType() {
		if (getParameterNameTypeEClass == null) {
			getParameterNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(126);
		}
		return getParameterNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_Idtag() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_IsCallback() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_IsUsed() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_Notes() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_Section() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetParameterNameType_AnyAttribute() {
        return (EAttribute)getGetParameterNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetRangeBoundsType() {
		if (getRangeBoundsTypeEClass == null) {
			getRangeBoundsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(127);
		}
		return getRangeBoundsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_Idtag() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_IsCallback() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_IsUsed() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_Notes() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_Section() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetRangeBoundsType_AnyAttribute() {
        return (EAttribute)getGetRangeBoundsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTransportationTypeHandleType() {
		if (getTransportationTypeHandleTypeEClass == null) {
			getTransportationTypeHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(128);
		}
		return getTransportationTypeHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_Idtag() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_IsCallback() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_IsUsed() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_Notes() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_Section() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeHandleType_AnyAttribute() {
        return (EAttribute)getGetTransportationTypeHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTransportationTypeNameType() {
		if (getTransportationTypeNameTypeEClass == null) {
			getTransportationTypeNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(129);
		}
		return getTransportationTypeNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_Idtag() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_IsCallback() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_IsUsed() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_Notes() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_Section() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetTransportationTypeNameType_AnyAttribute() {
        return (EAttribute)getGetTransportationTypeNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetUpdateRateValueForAttributeType() {
		if (getUpdateRateValueForAttributeTypeEClass == null) {
			getUpdateRateValueForAttributeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(130);
		}
		return getUpdateRateValueForAttributeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_Idtag() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_IsCallback() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_IsUsed() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_Notes() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_Section() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueForAttributeType_AnyAttribute() {
        return (EAttribute)getGetUpdateRateValueForAttributeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetUpdateRateValueType() {
		if (getUpdateRateValueTypeEClass == null) {
			getUpdateRateValueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(131);
		}
		return getUpdateRateValueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_Idtag() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_IsCallback() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_IsUsed() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_Notes() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_Section() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGetUpdateRateValueType_AnyAttribute() {
        return (EAttribute)getGetUpdateRateValueType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlyphType() {
		if (glyphTypeEClass == null) {
			glyphTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(132);
		}
		return glyphTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Value() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Alt() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Height() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Href() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Idtag() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Notes() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Type() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_Width() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlyphType_AnyAttribute() {
        return (EAttribute)getGlyphType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlyphType1() {
		if (glyphType1EClass == null) {
			glyphType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(133);
		}
		return glyphType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentificationType() {
		if (identificationTypeEClass == null) {
			identificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(137);
		}
		return identificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_Value() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_Idtag() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_Notes() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentificationType_AnyAttribute() {
        return (EAttribute)getIdentificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdentifierType() {
		if (identifierTypeEClass == null) {
			identifierTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(138);
		}
		return identifierTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierType_Value() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierType_Idtag() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierType_Notes() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdentifierType_AnyAttribute() {
        return (EAttribute)getIdentifierType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIdReferenceType() {
		if (idReferenceTypeEClass == null) {
			idReferenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(139);
		}
		return idReferenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdReferenceType_Type() {
        return (EReference)getIdReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIdReferenceType_Identification() {
        return (EReference)getIdReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdReferenceType_Idtag() {
        return (EAttribute)getIdReferenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdReferenceType_Notes() {
        return (EAttribute)getIdReferenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIdReferenceType_AnyAttribute() {
        return (EAttribute)getIdReferenceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformAttributeOwnershipType() {
		if (informAttributeOwnershipTypeEClass == null) {
			informAttributeOwnershipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(140);
		}
		return informAttributeOwnershipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_Idtag() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_IsCallback() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_IsUsed() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_Notes() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_Section() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInformAttributeOwnershipType_AnyAttribute() {
        return (EAttribute)getInformAttributeOwnershipType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiateFederateRestoreType() {
		if (initiateFederateRestoreTypeEClass == null) {
			initiateFederateRestoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(141);
		}
		return initiateFederateRestoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_Idtag() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_IsCallback() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_IsUsed() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_Notes() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_Section() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateRestoreType_AnyAttribute() {
        return (EAttribute)getInitiateFederateRestoreType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInitiateFederateSaveType() {
		if (initiateFederateSaveTypeEClass == null) {
			initiateFederateSaveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(142);
		}
		return initiateFederateSaveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_Idtag() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_IsCallback() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_IsUsed() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_Notes() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_Section() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInitiateFederateSaveType_AnyAttribute() {
        return (EAttribute)getInitiateFederateSaveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionClassType() {
		if (interactionClassTypeEClass == null) {
			interactionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(143);
		}
		return interactionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Name() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Sharing() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Dimensions() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Transportation() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Order() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Semantics() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_Parameter() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionClassType_InteractionClass() {
        return (EReference)getInteractionClassType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionClassType_Any() {
        return (EAttribute)getInteractionClassType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionClassType_Idtag() {
        return (EAttribute)getInteractionClassType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionClassType_Notes() {
        return (EAttribute)getInteractionClassType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionClassType_AnyAttribute() {
        return (EAttribute)getInteractionClassType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionClassType1() {
		if (interactionClassType1EClass == null) {
			interactionClassType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(144);
		}
		return interactionClassType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionsType() {
		if (interactionsTypeEClass == null) {
			interactionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(145);
		}
		return interactionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionsType_InteractionClass() {
        return (EReference)getInteractionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionsType_Any() {
        return (EAttribute)getInteractionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionsType_Idtag() {
        return (EAttribute)getInteractionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionsType_Notes() {
        return (EAttribute)getInteractionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInteractionsType_AnyAttribute() {
        return (EAttribute)getInteractionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIsAttributeOwnedByFederateType() {
		if (isAttributeOwnedByFederateTypeEClass == null) {
			isAttributeOwnedByFederateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(146);
		}
		return isAttributeOwnedByFederateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_Idtag() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_IsCallback() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_IsUsed() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_Notes() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_Section() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getIsAttributeOwnedByFederateType_AnyAttribute() {
        return (EAttribute)getIsAttributeOwnedByFederateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getJoinFederationExecutionType() {
		if (joinFederationExecutionTypeEClass == null) {
			joinFederationExecutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(147);
		}
		return joinFederationExecutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_Idtag() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_IsCallback() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_IsUsed() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_Notes() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_Section() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getJoinFederationExecutionType_AnyAttribute() {
        return (EAttribute)getJoinFederationExecutionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordType() {
		if (keywordTypeEClass == null) {
			keywordTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(148);
		}
		return keywordTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeywordType_Taxonomy() {
        return (EReference)getKeywordType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getKeywordType_KeywordValue() {
        return (EReference)getKeywordType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordType_Idtag() {
        return (EAttribute)getKeywordType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordType_Notes() {
        return (EAttribute)getKeywordType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordType_AnyAttribute() {
        return (EAttribute)getKeywordType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListFederationExecutionsType() {
		if (listFederationExecutionsTypeEClass == null) {
			listFederationExecutionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(149);
		}
		return listFederationExecutionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_Idtag() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_IsCallback() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_IsUsed() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_Notes() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_Section() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getListFederationExecutionsType_AnyAttribute() {
        return (EAttribute)getListFederationExecutionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLocalDeleteObjectInstanceType() {
		if (localDeleteObjectInstanceTypeEClass == null) {
			localDeleteObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(150);
		}
		return localDeleteObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_Idtag() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_IsCallback() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_IsUsed() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_Notes() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_Section() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLocalDeleteObjectInstanceType_AnyAttribute() {
        return (EAttribute)getLocalDeleteObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLookaheadType() {
		if (lookaheadTypeEClass == null) {
			lookaheadTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(151);
		}
		return lookaheadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookaheadType_DataType() {
        return (EReference)getLookaheadType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLookaheadType_Semantics() {
        return (EReference)getLookaheadType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookaheadType_Any() {
        return (EAttribute)getLookaheadType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookaheadType_Idtag() {
        return (EAttribute)getLookaheadType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookaheadType_Notes() {
        return (EAttribute)getLookaheadType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLookaheadType_AnyAttribute() {
        return (EAttribute)getLookaheadType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelIdentificationType() {
		if (modelIdentificationTypeEClass == null) {
			modelIdentificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(152);
		}
		return modelIdentificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Name() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Type() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Version() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_ModificationDate() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_SecurityClassification() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_ReleaseRestriction() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Purpose() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_ApplicationDomain() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Description() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_UseLimitation() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_UseHistory() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Keyword() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Poc() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Reference() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Other() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModelIdentificationType_Glyph() {
        return (EReference)getModelIdentificationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelIdentificationType_Any() {
        return (EAttribute)getModelIdentificationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelIdentificationType_Idtag() {
        return (EAttribute)getModelIdentificationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelIdentificationType_Notes() {
        return (EAttribute)getModelIdentificationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelIdentificationType_AnyAttribute() {
        return (EAttribute)getModelIdentificationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModelType() {
		if (modelTypeEClass == null) {
			modelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(153);
		}
		return modelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Value() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Idtag() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_Notes() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModelType_AnyAttribute() {
        return (EAttribute)getModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModificationDateType() {
		if (modificationDateTypeEClass == null) {
			modificationDateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(154);
		}
		return modificationDateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_Value() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_Idtag() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_Notes() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModificationDateType_AnyAttribute() {
        return (EAttribute)getModificationDateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModifyLookaheadType() {
		if (modifyLookaheadTypeEClass == null) {
			modifyLookaheadTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(155);
		}
		return modifyLookaheadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_Idtag() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_IsCallback() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_IsUsed() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_Notes() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_Section() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getModifyLookaheadType_AnyAttribute() {
        return (EAttribute)getModifyLookaheadType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultipleObjectInstanceNamesReservedType() {
		if (multipleObjectInstanceNamesReservedTypeEClass == null) {
			multipleObjectInstanceNamesReservedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(156);
		}
		return multipleObjectInstanceNamesReservedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_Idtag() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_IsCallback() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_IsUsed() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_Notes() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_Section() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultipleObjectInstanceNamesReservedType_AnyAttribute() {
        return (EAttribute)getMultipleObjectInstanceNamesReservedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNegotiatedAttributeOwnershipDivestitureType() {
		if (negotiatedAttributeOwnershipDivestitureTypeEClass == null) {
			negotiatedAttributeOwnershipDivestitureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(157);
		}
		return negotiatedAttributeOwnershipDivestitureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_Idtag() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_IsCallback() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_IsUsed() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_Notes() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_Section() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNegotiatedAttributeOwnershipDivestitureType_AnyAttribute() {
        return (EAttribute)getNegotiatedAttributeOwnershipDivestitureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextMessageRequestAvailableType() {
		if (nextMessageRequestAvailableTypeEClass == null) {
			nextMessageRequestAvailableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(158);
		}
		return nextMessageRequestAvailableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_Idtag() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_IsCallback() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_IsUsed() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_Notes() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_Section() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestAvailableType_AnyAttribute() {
        return (EAttribute)getNextMessageRequestAvailableType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNextMessageRequestType() {
		if (nextMessageRequestTypeEClass == null) {
			nextMessageRequestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(159);
		}
		return nextMessageRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_Idtag() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_IsCallback() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_IsUsed() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_Notes() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_Section() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNextMessageRequestType_AnyAttribute() {
        return (EAttribute)getNextMessageRequestType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonEmptyString1() {
		if (nonEmptyString1EClass == null) {
			nonEmptyString1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(161);
		}
		return nonEmptyString1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonEmptyString1_Value() {
        return (EAttribute)getNonEmptyString1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonEmptyString1_Idtag() {
        return (EAttribute)getNonEmptyString1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonEmptyString1_Notes() {
        return (EAttribute)getNonEmptyString1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNonEmptyString1_AnyAttribute() {
        return (EAttribute)getNonEmptyString1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizeFederateHandleType() {
		if (normalizeFederateHandleTypeEClass == null) {
			normalizeFederateHandleTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(162);
		}
		return normalizeFederateHandleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_Idtag() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_IsCallback() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_IsUsed() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_Notes() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_Section() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeFederateHandleType_AnyAttribute() {
        return (EAttribute)getNormalizeFederateHandleType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNormalizeServiceGroupType() {
		if (normalizeServiceGroupTypeEClass == null) {
			normalizeServiceGroupTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(163);
		}
		return normalizeServiceGroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_Idtag() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_IsCallback() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_IsUsed() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_Notes() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_Section() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNormalizeServiceGroupType_AnyAttribute() {
        return (EAttribute)getNormalizeServiceGroupType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNotesType() {
		if (notesTypeEClass == null) {
			notesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(164);
		}
		return notesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNotesType_Note() {
        return (EReference)getNotesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_Any() {
        return (EAttribute)getNotesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_Idtag() {
        return (EAttribute)getNotesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_Notes() {
        return (EAttribute)getNotesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNotesType_AnyAttribute() {
        return (EAttribute)getNotesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		if (noteTypeEClass == null) {
			noteTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(165);
		}
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Label() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_Semantics() {
        return (EReference)getNoteType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Any() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Idtag() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Notes() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_AnyAttribute() {
        return (EAttribute)getNoteType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassType() {
		if (objectClassTypeEClass == null) {
			objectClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(166);
		}
		return objectClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassType_Name() {
        return (EReference)getObjectClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassType_Sharing() {
        return (EReference)getObjectClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassType_Semantics() {
        return (EReference)getObjectClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassType_Attribute() {
        return (EReference)getObjectClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectClassType_ObjectClass() {
        return (EReference)getObjectClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectClassType_Any() {
        return (EAttribute)getObjectClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectClassType_Idtag() {
        return (EAttribute)getObjectClassType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectClassType_Notes() {
        return (EAttribute)getObjectClassType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectClassType_AnyAttribute() {
        return (EAttribute)getObjectClassType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectClassType1() {
		if (objectClassType1EClass == null) {
			objectClassType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(167);
		}
		return objectClassType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectInstanceNameReservedType() {
		if (objectInstanceNameReservedTypeEClass == null) {
			objectInstanceNameReservedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(168);
		}
		return objectInstanceNameReservedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_Idtag() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_IsCallback() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_IsUsed() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_Notes() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_Section() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectInstanceNameReservedType_AnyAttribute() {
        return (EAttribute)getObjectInstanceNameReservedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectModelType() {
		if (objectModelTypeEClass == null) {
			objectModelTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(169);
		}
		return objectModelTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_ModelIdentification() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_ServiceUtilization() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Objects() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Interactions() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Dimensions() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Time() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Tags() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Synchronizations() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Transportations() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Switches() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_UpdateRates() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_DataTypes() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectModelType_Notes() {
        return (EReference)getObjectModelType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModelType_Any() {
        return (EAttribute)getObjectModelType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModelType_Idtag() {
        return (EAttribute)getObjectModelType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModelType_Notes1() {
        return (EAttribute)getObjectModelType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectModelType_AnyAttribute() {
        return (EAttribute)getObjectModelType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObjectsType() {
		if (objectsTypeEClass == null) {
			objectsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(170);
		}
		return objectsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getObjectsType_ObjectClass() {
        return (EReference)getObjectsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsType_Any() {
        return (EAttribute)getObjectsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsType_Idtag() {
        return (EAttribute)getObjectsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsType_Notes() {
        return (EAttribute)getObjectsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getObjectsType_AnyAttribute() {
        return (EAttribute)getObjectsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderType() {
		if (orderTypeEClass == null) {
			orderTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(176);
		}
		return orderTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderType_Value() {
        return (EAttribute)getOrderType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderType_Idtag() {
        return (EAttribute)getOrderType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderType_Notes() {
        return (EAttribute)getOrderType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderType_AnyAttribute() {
        return (EAttribute)getOrderType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOwnershipType() {
		if (ownershipTypeEClass == null) {
			ownershipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(179);
		}
		return ownershipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnershipType_Value() {
        return (EAttribute)getOwnershipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnershipType_Idtag() {
        return (EAttribute)getOwnershipType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnershipType_Notes() {
        return (EAttribute)getOwnershipType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOwnershipType_AnyAttribute() {
        return (EAttribute)getOwnershipType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		if (parameterTypeEClass == null) {
			parameterTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(180);
		}
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Name() {
        return (EReference)getParameterType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_DataType() {
        return (EReference)getParameterType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParameterType_Semantics() {
        return (EReference)getParameterType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Any() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Idtag() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Notes() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_AnyAttribute() {
        return (EAttribute)getParameterType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType1() {
		if (parameterType1EClass == null) {
			parameterType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(181);
		}
		return parameterType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPocType() {
		if (pocTypeEClass == null) {
			pocTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(182);
		}
		return pocTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPocType_PocType() {
        return (EReference)getPocType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPocType_PocName() {
        return (EReference)getPocType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPocType_PocOrg() {
        return (EReference)getPocType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPocType_PocTelephone() {
        return (EReference)getPocType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPocType_PocEmail() {
        return (EReference)getPocType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPocType1() {
		if (pocType1EClass == null) {
			pocType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(183);
		}
		return pocType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocType1_Idtag() {
        return (EAttribute)getPocType1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocType1_Notes() {
        return (EAttribute)getPocType1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocType1_AnyAttribute() {
        return (EAttribute)getPocType1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPocTypeType() {
		if (pocTypeTypeEClass == null) {
			pocTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(186);
		}
		return pocTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocTypeType_Value() {
        return (EAttribute)getPocTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocTypeType_Idtag() {
        return (EAttribute)getPocTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocTypeType_Notes() {
        return (EAttribute)getPocTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPocTypeType_AnyAttribute() {
        return (EAttribute)getPocTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvideAttributeValueUpdateType() {
		if (provideAttributeValueUpdateTypeEClass == null) {
			provideAttributeValueUpdateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(188);
		}
		return provideAttributeValueUpdateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_Idtag() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_IsCallback() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_IsUsed() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_Notes() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_Section() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProvideAttributeValueUpdateType_AnyAttribute() {
        return (EAttribute)getProvideAttributeValueUpdateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishInteractionClassType() {
		if (publishInteractionClassTypeEClass == null) {
			publishInteractionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(189);
		}
		return publishInteractionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_Idtag() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_IsCallback() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_IsUsed() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_Notes() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_Section() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishInteractionClassType_AnyAttribute() {
        return (EAttribute)getPublishInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublishObjectClassAttributesType() {
		if (publishObjectClassAttributesTypeEClass == null) {
			publishObjectClassAttributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(190);
		}
		return publishObjectClassAttributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_Idtag() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_IsCallback() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_IsUsed() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_Notes() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_Section() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublishObjectClassAttributesType_AnyAttribute() {
        return (EAttribute)getPublishObjectClassAttributesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryAttributeOwnershipType() {
		if (queryAttributeOwnershipTypeEClass == null) {
			queryAttributeOwnershipTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(191);
		}
		return queryAttributeOwnershipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_Idtag() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_IsCallback() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_IsUsed() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_Notes() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_Section() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeOwnershipType_AnyAttribute() {
        return (EAttribute)getQueryAttributeOwnershipType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryAttributeTransportationTypeType() {
		if (queryAttributeTransportationTypeTypeEClass == null) {
			queryAttributeTransportationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(192);
		}
		return queryAttributeTransportationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_Idtag() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_IsCallback() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_IsUsed() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_Notes() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_Section() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryAttributeTransportationTypeType_AnyAttribute() {
        return (EAttribute)getQueryAttributeTransportationTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryFederationRestoreStatusType() {
		if (queryFederationRestoreStatusTypeEClass == null) {
			queryFederationRestoreStatusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(193);
		}
		return queryFederationRestoreStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_Idtag() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_IsCallback() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_IsUsed() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_Notes() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_Section() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationRestoreStatusType_AnyAttribute() {
        return (EAttribute)getQueryFederationRestoreStatusType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryFederationSaveStatusType() {
		if (queryFederationSaveStatusTypeEClass == null) {
			queryFederationSaveStatusTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(194);
		}
		return queryFederationSaveStatusTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_Idtag() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_IsCallback() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_IsUsed() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_Notes() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_Section() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryFederationSaveStatusType_AnyAttribute() {
        return (EAttribute)getQueryFederationSaveStatusType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryGALTType() {
		if (queryGALTTypeEClass == null) {
			queryGALTTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(195);
		}
		return queryGALTTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_Idtag() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_IsCallback() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_IsUsed() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_Notes() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_Section() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryGALTType_AnyAttribute() {
        return (EAttribute)getQueryGALTType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryInteractionTransportationTypeType() {
		if (queryInteractionTransportationTypeTypeEClass == null) {
			queryInteractionTransportationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(196);
		}
		return queryInteractionTransportationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_Idtag() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_IsCallback() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_IsUsed() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_Notes() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_Section() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryInteractionTransportationTypeType_AnyAttribute() {
        return (EAttribute)getQueryInteractionTransportationTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryLITSType() {
		if (queryLITSTypeEClass == null) {
			queryLITSTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(197);
		}
		return queryLITSTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_Idtag() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_IsCallback() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_IsUsed() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_Notes() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_Section() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLITSType_AnyAttribute() {
        return (EAttribute)getQueryLITSType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryLogicalTimeType() {
		if (queryLogicalTimeTypeEClass == null) {
			queryLogicalTimeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(198);
		}
		return queryLogicalTimeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_Idtag() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_IsCallback() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_IsUsed() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_Notes() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_Section() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLogicalTimeType_AnyAttribute() {
        return (EAttribute)getQueryLogicalTimeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getQueryLookaheadType() {
		if (queryLookaheadTypeEClass == null) {
			queryLookaheadTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(199);
		}
		return queryLookaheadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_Idtag() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_IsCallback() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_IsUsed() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_Notes() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_Section() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getQueryLookaheadType_AnyAttribute() {
        return (EAttribute)getQueryLookaheadType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRateType() {
		if (rateTypeEClass == null) {
			rateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(200);
		}
		return rateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_Value() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_Idtag() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_Notes() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRateType_AnyAttribute() {
        return (EAttribute)getRateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveInteractionType() {
		if (receiveInteractionTypeEClass == null) {
			receiveInteractionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(201);
		}
		return receiveInteractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_Idtag() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_IsCallback() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_IsUsed() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_Notes() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_Section() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveInteractionType_AnyAttribute() {
        return (EAttribute)getReceiveInteractionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		if (referenceTypeEClass == null) {
			referenceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(202);
		}
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Value() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Idtag() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Notes() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_AnyAttribute() {
        return (EAttribute)getReferenceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReflectAttributeValuesType() {
		if (reflectAttributeValuesTypeEClass == null) {
			reflectAttributeValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(203);
		}
		return reflectAttributeValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_Idtag() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_IsCallback() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_IsUsed() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_Notes() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_Section() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReflectAttributeValuesType_AnyAttribute() {
        return (EAttribute)getReflectAttributeValuesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterFederationSynchronizationPointType() {
		if (registerFederationSynchronizationPointTypeEClass == null) {
			registerFederationSynchronizationPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(204);
		}
		return registerFederationSynchronizationPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_Idtag() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_IsCallback() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_IsUsed() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_Notes() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_Section() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterFederationSynchronizationPointType_AnyAttribute() {
        return (EAttribute)getRegisterFederationSynchronizationPointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterObjectInstanceType() {
		if (registerObjectInstanceTypeEClass == null) {
			registerObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(205);
		}
		return registerObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_Idtag() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_IsCallback() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_IsUsed() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_Notes() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_Section() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceType_AnyAttribute() {
        return (EAttribute)getRegisterObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisterObjectInstanceWithRegionsType() {
		if (registerObjectInstanceWithRegionsTypeEClass == null) {
			registerObjectInstanceWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(206);
		}
		return registerObjectInstanceWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_Idtag() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_IsCallback() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_IsUsed() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_Notes() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_Section() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisterObjectInstanceWithRegionsType_AnyAttribute() {
        return (EAttribute)getRegisterObjectInstanceWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseMultipleObjectInstanceNamesType() {
		if (releaseMultipleObjectInstanceNamesTypeEClass == null) {
			releaseMultipleObjectInstanceNamesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(207);
		}
		return releaseMultipleObjectInstanceNamesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_Idtag() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_IsCallback() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_IsUsed() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_Notes() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_Section() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseMultipleObjectInstanceNamesType_AnyAttribute() {
        return (EAttribute)getReleaseMultipleObjectInstanceNamesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReleaseObjectInstanceNameType() {
		if (releaseObjectInstanceNameTypeEClass == null) {
			releaseObjectInstanceNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(208);
		}
		return releaseObjectInstanceNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_Idtag() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_IsCallback() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_IsUsed() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_Notes() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_Section() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReleaseObjectInstanceNameType_AnyAttribute() {
        return (EAttribute)getReleaseObjectInstanceNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReliableType() {
		if (reliableTypeEClass == null) {
			reliableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(211);
		}
		return reliableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableType_Value() {
        return (EAttribute)getReliableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableType_Idtag() {
        return (EAttribute)getReliableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableType_Notes() {
        return (EAttribute)getReliableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReliableType_AnyAttribute() {
        return (EAttribute)getReliableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRemoveobjectinstanceType() {
		if (removeobjectinstanceTypeEClass == null) {
			removeobjectinstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(212);
		}
		return removeobjectinstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_Idtag() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_IsCallback() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_IsUsed() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_Notes() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_Section() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRemoveobjectinstanceType_AnyAttribute() {
        return (EAttribute)getRemoveobjectinstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportAttributeTransportationTypeType() {
		if (reportAttributeTransportationTypeTypeEClass == null) {
			reportAttributeTransportationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(213);
		}
		return reportAttributeTransportationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_Idtag() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_IsCallback() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_IsUsed() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_Notes() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_Section() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportAttributeTransportationTypeType_AnyAttribute() {
        return (EAttribute)getReportAttributeTransportationTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportFederationExecutionsType() {
		if (reportFederationExecutionsTypeEClass == null) {
			reportFederationExecutionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(214);
		}
		return reportFederationExecutionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_Idtag() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_IsCallback() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_IsUsed() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_Notes() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_Section() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportFederationExecutionsType_AnyAttribute() {
        return (EAttribute)getReportFederationExecutionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReportInteractionTransportationTypeType() {
		if (reportInteractionTransportationTypeTypeEClass == null) {
			reportInteractionTransportationTypeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(215);
		}
		return reportInteractionTransportationTypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_Idtag() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_IsCallback() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_IsUsed() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_Notes() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_Section() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReportInteractionTransportationTypeType_AnyAttribute() {
        return (EAttribute)getReportInteractionTransportationTypeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAttributeOwnershipAssumptionType() {
		if (requestAttributeOwnershipAssumptionTypeEClass == null) {
			requestAttributeOwnershipAssumptionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(216);
		}
		return requestAttributeOwnershipAssumptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_Idtag() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_IsCallback() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_IsUsed() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_Notes() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_Section() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipAssumptionType_AnyAttribute() {
        return (EAttribute)getRequestAttributeOwnershipAssumptionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAttributeOwnershipReleaseType() {
		if (requestAttributeOwnershipReleaseTypeEClass == null) {
			requestAttributeOwnershipReleaseTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(217);
		}
		return requestAttributeOwnershipReleaseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_Idtag() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_IsCallback() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_IsUsed() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_Notes() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_Section() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeOwnershipReleaseType_AnyAttribute() {
        return (EAttribute)getRequestAttributeOwnershipReleaseType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAttributeTransportationTypeChangeType() {
		if (requestAttributeTransportationTypeChangeTypeEClass == null) {
			requestAttributeTransportationTypeChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(218);
		}
		return requestAttributeTransportationTypeChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_Idtag() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_IsCallback() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_IsUsed() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_Notes() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_Section() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeTransportationTypeChangeType_AnyAttribute() {
        return (EAttribute)getRequestAttributeTransportationTypeChangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAttributeValueUpdateType() {
		if (requestAttributeValueUpdateTypeEClass == null) {
			requestAttributeValueUpdateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(219);
		}
		return requestAttributeValueUpdateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_Idtag() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_IsCallback() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_IsUsed() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_Notes() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_Section() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateType_AnyAttribute() {
        return (EAttribute)getRequestAttributeValueUpdateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestAttributeValueUpdateWithRegionsType() {
		if (requestAttributeValueUpdateWithRegionsTypeEClass == null) {
			requestAttributeValueUpdateWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(220);
		}
		return requestAttributeValueUpdateWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_Idtag() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_IsCallback() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_IsUsed() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_Notes() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_Section() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestAttributeValueUpdateWithRegionsType_AnyAttribute() {
        return (EAttribute)getRequestAttributeValueUpdateWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestDivestitureConfirmationType() {
		if (requestDivestitureConfirmationTypeEClass == null) {
			requestDivestitureConfirmationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(221);
		}
		return requestDivestitureConfirmationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_Idtag() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_IsCallback() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_IsUsed() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_Notes() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_Section() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestDivestitureConfirmationType_AnyAttribute() {
        return (EAttribute)getRequestDivestitureConfirmationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestFederationRestoreType() {
		if (requestFederationRestoreTypeEClass == null) {
			requestFederationRestoreTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(222);
		}
		return requestFederationRestoreTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_Idtag() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_IsCallback() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_IsUsed() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_Notes() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_Section() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationRestoreType_AnyAttribute() {
        return (EAttribute)getRequestFederationRestoreType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestFederationSaveType() {
		if (requestFederationSaveTypeEClass == null) {
			requestFederationSaveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(223);
		}
		return requestFederationSaveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_Idtag() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_IsCallback() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_IsUsed() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_Notes() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_Section() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestFederationSaveType_AnyAttribute() {
        return (EAttribute)getRequestFederationSaveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestInteractionTransportationTypeChangeType() {
		if (requestInteractionTransportationTypeChangeTypeEClass == null) {
			requestInteractionTransportationTypeChangeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(224);
		}
		return requestInteractionTransportationTypeChangeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_Idtag() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_IsCallback() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_IsUsed() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_Notes() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_Section() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestInteractionTransportationTypeChangeType_AnyAttribute() {
        return (EAttribute)getRequestInteractionTransportationTypeChangeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequestRetractionType() {
		if (requestRetractionTypeEClass == null) {
			requestRetractionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(225);
		}
		return requestRetractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_Idtag() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_IsCallback() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_IsUsed() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_Notes() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_Section() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRequestRetractionType_AnyAttribute() {
        return (EAttribute)getRequestRetractionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReserveMultipleObjectInstanceNamesType() {
		if (reserveMultipleObjectInstanceNamesTypeEClass == null) {
			reserveMultipleObjectInstanceNamesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(226);
		}
		return reserveMultipleObjectInstanceNamesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_Idtag() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_IsCallback() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_IsUsed() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_Notes() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_Section() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveMultipleObjectInstanceNamesType_AnyAttribute() {
        return (EAttribute)getReserveMultipleObjectInstanceNamesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReserveObjectInstanceNameType() {
		if (reserveObjectInstanceNameTypeEClass == null) {
			reserveObjectInstanceNameTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(227);
		}
		return reserveObjectInstanceNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_Idtag() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_IsCallback() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_IsUsed() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_Notes() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_Section() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReserveObjectInstanceNameType_AnyAttribute() {
        return (EAttribute)getReserveObjectInstanceNameType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResignFederationExecutionType() {
		if (resignFederationExecutionTypeEClass == null) {
			resignFederationExecutionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(230);
		}
		return resignFederationExecutionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_Idtag() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_IsCallback() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_IsUsed() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_Notes() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_Section() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignFederationExecutionType_AnyAttribute() {
        return (EAttribute)getResignFederationExecutionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResignSwitchType() {
		if (resignSwitchTypeEClass == null) {
			resignSwitchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(231);
		}
		return resignSwitchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignSwitchType_Idtag() {
        return (EAttribute)getResignSwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignSwitchType_Notes() {
        return (EAttribute)getResignSwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignSwitchType_ResignAction() {
        return (EAttribute)getResignSwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResignSwitchType_AnyAttribute() {
        return (EAttribute)getResignSwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRetractType() {
		if (retractTypeEClass == null) {
			retractTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(232);
		}
		return retractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_Idtag() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_IsCallback() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_IsUsed() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_Notes() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_Section() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRetractType_AnyAttribute() {
        return (EAttribute)getRetractType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSecurityClassificationType() {
		if (securityClassificationTypeEClass == null) {
			securityClassificationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(235);
		}
		return securityClassificationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityClassificationType_Value() {
        return (EAttribute)getSecurityClassificationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityClassificationType_Idtag() {
        return (EAttribute)getSecurityClassificationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityClassificationType_Notes() {
        return (EAttribute)getSecurityClassificationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSecurityClassificationType_AnyAttribute() {
        return (EAttribute)getSecurityClassificationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendInteractionType() {
		if (sendInteractionTypeEClass == null) {
			sendInteractionTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(237);
		}
		return sendInteractionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_Idtag() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_IsCallback() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_IsUsed() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_Notes() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_Section() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionType_AnyAttribute() {
        return (EAttribute)getSendInteractionType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendInteractionWithRegionsType() {
		if (sendInteractionWithRegionsTypeEClass == null) {
			sendInteractionWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(238);
		}
		return sendInteractionWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_Idtag() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_IsCallback() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_IsUsed() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_Notes() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_Section() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendInteractionWithRegionsType_AnyAttribute() {
        return (EAttribute)getSendInteractionWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceUtilizationType() {
		if (serviceUtilizationTypeEClass == null) {
			serviceUtilizationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(239);
		}
		return serviceUtilizationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_Connect() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_Disconnect() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConnectionLost() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_CreateFederationExecution() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DestroyFederationExecution() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ListFederationExecutions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReportFederationExecutions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_JoinFederationExecution() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ResignFederationExecution() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RegisterFederationSynchronizationPoint() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmSynchronizationPointRegistration() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AnnounceSynchronizationPoint() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SynchronizationPointAchieved() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationSynchronized() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestFederationSave() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_InitiateFederateSave() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederateSaveBegun() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederateSaveComplete() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationSaved() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AbortFederationSave() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryFederationSaveStatus() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationSaveStatusResponse() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestFederationRestore() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmFederationRestorationRequest() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationRestoreBegun() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_InitiateFederateRestore() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederateRestoreComplete() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationRestored() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AbortFederationRestore() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryFederationRestoreStatus() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FederationRestoreStatusResponse() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_PublishObjectClassAttributes() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnpublishObjectClassAttributes() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_PublishInteractionClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnpublishInteractionClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SubscribeObjectClassAttributes() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnsubscribeObjectClassAttributes() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SubscribeInteractionClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnsubscribeInteractionClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_StartRegistrationForObjectClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_StopRegistrationForObjectClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TurnInteractionsOn() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TurnInteractionsOff() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReserveObjectInstanceName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ObjectInstanceNameReserved() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReleaseObjectInstanceName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReserveMultipleObjectInstanceNames() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_MultipleObjectInstanceNamesReserved() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReleaseMultipleObjectInstanceNames() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RegisterObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DiscoverObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UpdateAttributeValues() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReflectAttributeValues() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SendInteraction() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReceiveInteraction() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DeleteObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_Removeobjectinstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(56);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_LocalDeleteObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(57);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributesInScope() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(58);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributesOutOfScope() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(59);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestAttributeValueUpdate() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(60);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ProvideAttributeValueUpdate() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(61);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TurnUpdatesOnForObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(62);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TurnUpdatesOffForObjectInstance() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(63);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestAttributeTransportationTypeChange() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(64);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmAttributeTransportationTypeChange() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(65);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryAttributeTransportationType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(66);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReportAttributeTransportationType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(67);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestInteractionTransportationTypeChange() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(68);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmInteractionTransportationTypeChange() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(69);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryInteractionTransportationType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(70);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ReportInteractionTransportationType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(71);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(72);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(73);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestAttributeOwnershipAssumption() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(74);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestDivestitureConfirmation() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(75);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmDivestiture() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(76);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipAcquisitionNotification() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(77);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipAcquisition() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(78);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(79);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipUnavailable() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(80);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestAttributeOwnershipRelease() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(81);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipReleaseDenied() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(82);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(83);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(84);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_CancelAttributeOwnershipAcquisition() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(85);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(86);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryAttributeOwnership() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(87);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_InformAttributeOwnership() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(88);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_IsAttributeOwnedByFederate() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(89);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableTimeRegulation() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(90);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TimeRegulationEnabled() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(91);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableTimeRegulation() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(92);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableTimeConstrained() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(93);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TimeConstrainedEnabled() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(94);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableTimeConstrained() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(95);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TimeAdvanceRequest() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(96);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TimeAdvanceRequestAvailable() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(97);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_NextMessageRequest() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(98);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_NextMessageRequestAvailable() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(99);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_FlushQueueRequest() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(100);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_TimeAdvanceGrant() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(101);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableAsynchronousDelivery() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(102);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableAsynchronousDelivery() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(103);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryGALT() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(104);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryLogicalTime() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(105);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryLITS() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(106);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ModifyLookahead() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(107);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_QueryLookahead() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(108);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_Retract() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(109);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestRetraction() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(110);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ChangeAttributeOrderType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(111);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_ChangeInteractionOrderType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(112);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_CreateRegion() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(113);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_CommitRegionModifications() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(114);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DeleteRegion() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(115);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RegisterObjectInstanceWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(116);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_AssociateRegionsForUpdates() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(117);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnassociateRegionsForUpdates() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(118);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(119);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(120);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SubscribeInteractionClassWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(121);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_UnsubscribeInteractionClassWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(122);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SendInteractionWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(123);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_RequestAttributeValueUpdateWithRegions() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(124);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetAutomaticResignDirective() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(125);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SetAutomaticResignDirective() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(126);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetFederateHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(127);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetFederateName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(128);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetObjectClassHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(129);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetObjectClassName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(130);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetKnownObjectClassHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(131);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetObjectInstanceHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(132);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetObjectInstanceName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(133);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetAttributeHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(134);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetAttributeName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(135);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetUpdateRateValue() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(136);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetUpdateRateValueForAttribute() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(137);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetInteractionClassHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(138);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetInteractionClassName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(139);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetParameterHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(140);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetParameterName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(141);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetOrderType() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(142);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetOrderName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(143);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetTransportationTypeHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(144);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetTransportationTypeName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(145);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetAvailableDimensionsForClassAttribute() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(146);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetAvailableDimensionsForInteractionClass() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(147);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetDimensionHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(148);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetDimensionName() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(149);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetDimensionUpperBound() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(150);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetDimensionHandleSet() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(151);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_GetRangeBounds() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(152);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_SetRangeBounds() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(153);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_NormalizeFederateHandle() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(154);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_NormalizeServiceGroup() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(155);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(156);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(157);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(158);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(159);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(160);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(161);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(162);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(163);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EvokeCallback() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(164);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EvokeMultipleCallbacks() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(165);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_EnableCallbacks() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(166);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceUtilizationType_DisableCallbacks() {
        return (EReference)getServiceUtilizationType().getEStructuralFeatures().get(167);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceUtilizationType_Idtag() {
        return (EAttribute)getServiceUtilizationType().getEStructuralFeatures().get(168);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceUtilizationType_Notes() {
        return (EAttribute)getServiceUtilizationType().getEStructuralFeatures().get(169);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceUtilizationType_AnyAttribute() {
        return (EAttribute)getServiceUtilizationType().getEStructuralFeatures().get(170);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetAutomaticResignDirectiveType() {
		if (setAutomaticResignDirectiveTypeEClass == null) {
			setAutomaticResignDirectiveTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(240);
		}
		return setAutomaticResignDirectiveTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_Idtag() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_IsCallback() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_IsUsed() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_Notes() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_Section() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetAutomaticResignDirectiveType_AnyAttribute() {
        return (EAttribute)getSetAutomaticResignDirectiveType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetRangeBoundsType() {
		if (setRangeBoundsTypeEClass == null) {
			setRangeBoundsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(241);
		}
		return setRangeBoundsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_Idtag() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_IsCallback() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_IsUsed() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_Notes() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_Section() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSetRangeBoundsType_AnyAttribute() {
        return (EAttribute)getSetRangeBoundsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSharingType() {
		if (sharingTypeEClass == null) {
			sharingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(244);
		}
		return sharingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharingType_Value() {
        return (EAttribute)getSharingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharingType_Idtag() {
        return (EAttribute)getSharingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharingType_Notes() {
        return (EAttribute)getSharingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSharingType_AnyAttribute() {
        return (EAttribute)getSharingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDataType() {
		if (simpleDataTypeEClass == null) {
			simpleDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(245);
		}
		return simpleDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Name() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Representation() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Units() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Resolution() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Accuracy() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataType_Semantics() {
        return (EReference)getSimpleDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataType_Any() {
        return (EAttribute)getSimpleDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataType_Idtag() {
        return (EAttribute)getSimpleDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataType_Notes() {
        return (EAttribute)getSimpleDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataType_AnyAttribute() {
        return (EAttribute)getSimpleDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDataType1() {
		if (simpleDataType1EClass == null) {
			simpleDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(246);
		}
		return simpleDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleDataTypesType() {
		if (simpleDataTypesTypeEClass == null) {
			simpleDataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(247);
		}
		return simpleDataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSimpleDataTypesType_SimpleData() {
        return (EReference)getSimpleDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataTypesType_Any() {
        return (EAttribute)getSimpleDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataTypesType_Idtag() {
        return (EAttribute)getSimpleDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataTypesType_Notes() {
        return (EAttribute)getSimpleDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSimpleDataTypesType_AnyAttribute() {
        return (EAttribute)getSimpleDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSize() {
		if (sizeEClass == null) {
			sizeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(248);
		}
		return sizeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Value() {
        return (EAttribute)getSize().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Idtag() {
        return (EAttribute)getSize().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_Notes() {
        return (EAttribute)getSize().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSize_AnyAttribute() {
        return (EAttribute)getSize().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartRegistrationForObjectClassType() {
		if (startRegistrationForObjectClassTypeEClass == null) {
			startRegistrationForObjectClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(249);
		}
		return startRegistrationForObjectClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_Idtag() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_IsCallback() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_IsUsed() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_Notes() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_Section() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartRegistrationForObjectClassType_AnyAttribute() {
        return (EAttribute)getStartRegistrationForObjectClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopRegistrationForObjectClassType() {
		if (stopRegistrationForObjectClassTypeEClass == null) {
			stopRegistrationForObjectClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(250);
		}
		return stopRegistrationForObjectClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_Idtag() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_IsCallback() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_IsUsed() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_Notes() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_Section() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStopRegistrationForObjectClassType_AnyAttribute() {
        return (EAttribute)getStopRegistrationForObjectClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getString() {
		if (stringEClass == null) {
			stringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(251);
		}
		return stringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Value() {
        return (EAttribute)getString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Idtag() {
        return (EAttribute)getString().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_Notes() {
        return (EAttribute)getString().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getString_AnyAttribute() {
        return (EAttribute)getString().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribeInteractionClassType() {
		if (subscribeInteractionClassTypeEClass == null) {
			subscribeInteractionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(252);
		}
		return subscribeInteractionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_Idtag() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_IsCallback() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_IsUsed() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_Notes() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_Section() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassType_AnyAttribute() {
        return (EAttribute)getSubscribeInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribeInteractionClassWithRegionsType() {
		if (subscribeInteractionClassWithRegionsTypeEClass == null) {
			subscribeInteractionClassWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(253);
		}
		return subscribeInteractionClassWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_Idtag() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_IsCallback() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_IsUsed() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_Notes() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_Section() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeInteractionClassWithRegionsType_AnyAttribute() {
        return (EAttribute)getSubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribeObjectClassAttributesType() {
		if (subscribeObjectClassAttributesTypeEClass == null) {
			subscribeObjectClassAttributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(254);
		}
		return subscribeObjectClassAttributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_Idtag() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_IsCallback() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_IsUsed() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_Notes() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_Section() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesType_AnyAttribute() {
        return (EAttribute)getSubscribeObjectClassAttributesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubscribeObjectClassAttributesWithRegionsType() {
		if (subscribeObjectClassAttributesWithRegionsTypeEClass == null) {
			subscribeObjectClassAttributesWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(255);
		}
		return subscribeObjectClassAttributesWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_Idtag() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_IsCallback() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_IsUsed() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_Notes() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_Section() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubscribeObjectClassAttributesWithRegionsType_AnyAttribute() {
        return (EAttribute)getSubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchesType() {
		if (switchesTypeEClass == null) {
			switchesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(256);
		}
		return switchesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_AutoProvide() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_ConveyRegionDesignatorSets() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_ConveyProducingFederate() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_AttributeScopeAdvisory() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_AttributeRelevanceAdvisory() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_ObjectClassRelevanceAdvisory() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_InteractionRelevanceAdvisory() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_ServiceReporting() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_ExceptionReporting() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_DelaySubscriptionEvaluation() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSwitchesType_AutomaticResignAction() {
        return (EReference)getSwitchesType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchesType_Any() {
        return (EAttribute)getSwitchesType().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchesType_Idtag() {
        return (EAttribute)getSwitchesType().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchesType_Notes() {
        return (EAttribute)getSwitchesType().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchesType_AnyAttribute() {
        return (EAttribute)getSwitchesType().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSwitchType() {
		if (switchTypeEClass == null) {
			switchTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(257);
		}
		return switchTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchType_Idtag() {
        return (EAttribute)getSwitchType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchType_IsEnabled() {
        return (EAttribute)getSwitchType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchType_Notes() {
        return (EAttribute)getSwitchType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSwitchType_AnyAttribute() {
        return (EAttribute)getSwitchType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationPointAchievedType() {
		if (synchronizationPointAchievedTypeEClass == null) {
			synchronizationPointAchievedTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(258);
		}
		return synchronizationPointAchievedTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_Idtag() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_IsCallback() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_IsUsed() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_Notes() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_Section() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointAchievedType_AnyAttribute() {
        return (EAttribute)getSynchronizationPointAchievedType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationPointType() {
		if (synchronizationPointTypeEClass == null) {
			synchronizationPointTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(259);
		}
		return synchronizationPointTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationPointType_Label() {
        return (EReference)getSynchronizationPointType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationPointType_DataType() {
        return (EReference)getSynchronizationPointType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationPointType_Capability() {
        return (EReference)getSynchronizationPointType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationPointType_Semantics() {
        return (EReference)getSynchronizationPointType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointType_Any() {
        return (EAttribute)getSynchronizationPointType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointType_Idtag() {
        return (EAttribute)getSynchronizationPointType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointType_Notes() {
        return (EAttribute)getSynchronizationPointType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationPointType_AnyAttribute() {
        return (EAttribute)getSynchronizationPointType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationPointType1() {
		if (synchronizationPointType1EClass == null) {
			synchronizationPointType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(260);
		}
		return synchronizationPointType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSynchronizationsType() {
		if (synchronizationsTypeEClass == null) {
			synchronizationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(261);
		}
		return synchronizationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSynchronizationsType_SynchronizationPoint() {
        return (EReference)getSynchronizationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationsType_Any() {
        return (EAttribute)getSynchronizationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationsType_Idtag() {
        return (EAttribute)getSynchronizationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationsType_Notes() {
        return (EAttribute)getSynchronizationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSynchronizationsType_AnyAttribute() {
        return (EAttribute)getSynchronizationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagsType() {
		if (tagsTypeEClass == null) {
			tagsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(262);
		}
		return tagsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_UpdateReflectTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_SendReceiveTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_DeleteRemoveTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_DivestitureRequestTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_DivestitureCompletionTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_AcquisitionRequestTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagsType_RequestUpdateTag() {
        return (EReference)getTagsType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsType_Any() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsType_Idtag() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsType_Notes() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagsType_AnyAttribute() {
        return (EAttribute)getTagsType().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTagType() {
		if (tagTypeEClass == null) {
			tagTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(263);
		}
		return tagTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagType_DataType() {
        return (EReference)getTagType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTagType_Semantics() {
        return (EReference)getTagType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagType_Any() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagType_Idtag() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagType_Notes() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTagType_AnyAttribute() {
        return (EAttribute)getTagType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAdvanceGrantType() {
		if (timeAdvanceGrantTypeEClass == null) {
			timeAdvanceGrantTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(264);
		}
		return timeAdvanceGrantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_Idtag() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_IsCallback() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_IsUsed() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_Notes() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_Section() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceGrantType_AnyAttribute() {
        return (EAttribute)getTimeAdvanceGrantType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAdvanceRequestAvailableType() {
		if (timeAdvanceRequestAvailableTypeEClass == null) {
			timeAdvanceRequestAvailableTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(265);
		}
		return timeAdvanceRequestAvailableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_Idtag() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_IsCallback() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_IsUsed() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_Notes() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_Section() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestAvailableType_AnyAttribute() {
        return (EAttribute)getTimeAdvanceRequestAvailableType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeAdvanceRequestType() {
		if (timeAdvanceRequestTypeEClass == null) {
			timeAdvanceRequestTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(266);
		}
		return timeAdvanceRequestTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_Idtag() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_IsCallback() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_IsUsed() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_Notes() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_Section() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeAdvanceRequestType_AnyAttribute() {
        return (EAttribute)getTimeAdvanceRequestType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeConstrainedEnabledType() {
		if (timeConstrainedEnabledTypeEClass == null) {
			timeConstrainedEnabledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(267);
		}
		return timeConstrainedEnabledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_Idtag() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_IsCallback() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_IsUsed() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_Notes() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_Section() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeConstrainedEnabledType_AnyAttribute() {
        return (EAttribute)getTimeConstrainedEnabledType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeRegulationEnabledType() {
		if (timeRegulationEnabledTypeEClass == null) {
			timeRegulationEnabledTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(268);
		}
		return timeRegulationEnabledTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_Idtag() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_IsCallback() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_IsUsed() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_Notes() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_Section() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeRegulationEnabledType_AnyAttribute() {
        return (EAttribute)getTimeRegulationEnabledType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeStampType() {
		if (timeStampTypeEClass == null) {
			timeStampTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(269);
		}
		return timeStampTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStampType_DataType() {
        return (EReference)getTimeStampType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeStampType_Semantics() {
        return (EReference)getTimeStampType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampType_Any() {
        return (EAttribute)getTimeStampType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampType_Idtag() {
        return (EAttribute)getTimeStampType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampType_Notes() {
        return (EAttribute)getTimeStampType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeStampType_AnyAttribute() {
        return (EAttribute)getTimeStampType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeType() {
		if (timeTypeEClass == null) {
			timeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(270);
		}
		return timeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeType_TimeStamp() {
        return (EReference)getTimeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeType_Lookahead() {
        return (EReference)getTimeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Any() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Idtag() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_Notes() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimeType_AnyAttribute() {
        return (EAttribute)getTimeType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportationsType() {
		if (transportationsTypeEClass == null) {
			transportationsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(271);
		}
		return transportationsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationsType_Transportation() {
        return (EReference)getTransportationsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationsType_Any() {
        return (EAttribute)getTransportationsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationsType_Idtag() {
        return (EAttribute)getTransportationsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationsType_Notes() {
        return (EAttribute)getTransportationsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationsType_AnyAttribute() {
        return (EAttribute)getTransportationsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportationType() {
		if (transportationTypeEClass == null) {
			transportationTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(272);
		}
		return transportationTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationType_Name() {
        return (EReference)getTransportationType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationType_Reliable() {
        return (EReference)getTransportationType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransportationType_Semantics() {
        return (EReference)getTransportationType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationType_Any() {
        return (EAttribute)getTransportationType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationType_Idtag() {
        return (EAttribute)getTransportationType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationType_Notes() {
        return (EAttribute)getTransportationType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransportationType_AnyAttribute() {
        return (EAttribute)getTransportationType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransportationType1() {
		if (transportationType1EClass == null) {
			transportationType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(273);
		}
		return transportationType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnInteractionsOffType() {
		if (turnInteractionsOffTypeEClass == null) {
			turnInteractionsOffTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(274);
		}
		return turnInteractionsOffTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_Idtag() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_IsCallback() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_IsUsed() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_Notes() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_Section() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOffType_AnyAttribute() {
        return (EAttribute)getTurnInteractionsOffType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnInteractionsOnType() {
		if (turnInteractionsOnTypeEClass == null) {
			turnInteractionsOnTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(275);
		}
		return turnInteractionsOnTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_Idtag() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_IsCallback() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_IsUsed() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_Notes() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_Section() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnInteractionsOnType_AnyAttribute() {
        return (EAttribute)getTurnInteractionsOnType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnUpdatesOffForObjectInstanceType() {
		if (turnUpdatesOffForObjectInstanceTypeEClass == null) {
			turnUpdatesOffForObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(276);
		}
		return turnUpdatesOffForObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_Idtag() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_IsCallback() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_IsUsed() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_Notes() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_Section() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOffForObjectInstanceType_AnyAttribute() {
        return (EAttribute)getTurnUpdatesOffForObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTurnUpdatesOnForObjectInstanceType() {
		if (turnUpdatesOnForObjectInstanceTypeEClass == null) {
			turnUpdatesOnForObjectInstanceTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(277);
		}
		return turnUpdatesOnForObjectInstanceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_Idtag() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_IsCallback() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_IsUsed() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_Notes() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_Section() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTurnUpdatesOnForObjectInstanceType_AnyAttribute() {
        return (EAttribute)getTurnUpdatesOnForObjectInstanceType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTypeType() {
		if (typeTypeEClass == null) {
			typeTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(278);
		}
		return typeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_Value() {
        return (EAttribute)getTypeType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_Idtag() {
        return (EAttribute)getTypeType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_Notes() {
        return (EAttribute)getTypeType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTypeType_AnyAttribute() {
        return (EAttribute)getTypeType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnassociateRegionsForUpdatesType() {
		if (unassociateRegionsForUpdatesTypeEClass == null) {
			unassociateRegionsForUpdatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(279);
		}
		return unassociateRegionsForUpdatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_Idtag() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_IsCallback() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_IsUsed() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_Notes() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_Section() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnassociateRegionsForUpdatesType_AnyAttribute() {
        return (EAttribute)getUnassociateRegionsForUpdatesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnconditionalAttributeOwnershipDivestitureType() {
		if (unconditionalAttributeOwnershipDivestitureTypeEClass == null) {
			unconditionalAttributeOwnershipDivestitureTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(280);
		}
		return unconditionalAttributeOwnershipDivestitureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_Idtag() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_IsCallback() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_IsUsed() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_Notes() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_Section() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnconditionalAttributeOwnershipDivestitureType_AnyAttribute() {
        return (EAttribute)getUnconditionalAttributeOwnershipDivestitureType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnpublishInteractionClassType() {
		if (unpublishInteractionClassTypeEClass == null) {
			unpublishInteractionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(281);
		}
		return unpublishInteractionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_Idtag() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_IsCallback() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_IsUsed() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_Notes() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_Section() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishInteractionClassType_AnyAttribute() {
        return (EAttribute)getUnpublishInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnpublishObjectClassAttributesType() {
		if (unpublishObjectClassAttributesTypeEClass == null) {
			unpublishObjectClassAttributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(282);
		}
		return unpublishObjectClassAttributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_Idtag() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_IsCallback() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_IsUsed() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_Notes() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_Section() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnpublishObjectClassAttributesType_AnyAttribute() {
        return (EAttribute)getUnpublishObjectClassAttributesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsubscribeInteractionClassType() {
		if (unsubscribeInteractionClassTypeEClass == null) {
			unsubscribeInteractionClassTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(283);
		}
		return unsubscribeInteractionClassTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_Idtag() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_IsCallback() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_IsUsed() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_Notes() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_Section() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassType_AnyAttribute() {
        return (EAttribute)getUnsubscribeInteractionClassType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsubscribeInteractionClassWithRegionsType() {
		if (unsubscribeInteractionClassWithRegionsTypeEClass == null) {
			unsubscribeInteractionClassWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(284);
		}
		return unsubscribeInteractionClassWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_Idtag() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_IsCallback() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_IsUsed() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_Notes() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_Section() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeInteractionClassWithRegionsType_AnyAttribute() {
        return (EAttribute)getUnsubscribeInteractionClassWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsubscribeObjectClassAttributesType() {
		if (unsubscribeObjectClassAttributesTypeEClass == null) {
			unsubscribeObjectClassAttributesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(285);
		}
		return unsubscribeObjectClassAttributesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_Idtag() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_IsCallback() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_IsUsed() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_Notes() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_Section() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesType_AnyAttribute() {
        return (EAttribute)getUnsubscribeObjectClassAttributesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnsubscribeObjectClassAttributesWithRegionsType() {
		if (unsubscribeObjectClassAttributesWithRegionsTypeEClass == null) {
			unsubscribeObjectClassAttributesWithRegionsTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(286);
		}
		return unsubscribeObjectClassAttributesWithRegionsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_Idtag() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_IsCallback() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_IsUsed() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_Notes() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_Section() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnsubscribeObjectClassAttributesWithRegionsType_AnyAttribute() {
        return (EAttribute)getUnsubscribeObjectClassAttributesWithRegionsType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateAttributeValuesType() {
		if (updateAttributeValuesTypeEClass == null) {
			updateAttributeValuesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(287);
		}
		return updateAttributeValuesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_Idtag() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_IsCallback() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_IsUsed() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_Notes() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_Section() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateAttributeValuesType_AnyAttribute() {
        return (EAttribute)getUpdateAttributeValuesType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateRatesType() {
		if (updateRatesTypeEClass == null) {
			updateRatesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(290);
		}
		return updateRatesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRatesType_UpdateRate() {
        return (EReference)getUpdateRatesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRatesType_Any() {
        return (EAttribute)getUpdateRatesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRatesType_Idtag() {
        return (EAttribute)getUpdateRatesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRatesType_Notes() {
        return (EAttribute)getUpdateRatesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRatesType_AnyAttribute() {
        return (EAttribute)getUpdateRatesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateRateType() {
		if (updateRateTypeEClass == null) {
			updateRateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(291);
		}
		return updateRateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRateType_Name() {
        return (EReference)getUpdateRateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRateType_Rate() {
        return (EReference)getUpdateRateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUpdateRateType_Semantics() {
        return (EReference)getUpdateRateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRateType_Any() {
        return (EAttribute)getUpdateRateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRateType_Idtag() {
        return (EAttribute)getUpdateRateType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRateType_Notes() {
        return (EAttribute)getUpdateRateType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateRateType_AnyAttribute() {
        return (EAttribute)getUpdateRateType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpdateType() {
		if (updateTypeEClass == null) {
			updateTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(292);
		}
		return updateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_Value() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_Idtag() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_Notes() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpdateType_AnyAttribute() {
        return (EAttribute)getUpdateType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUpperBoundType() {
		if (upperBoundTypeEClass == null) {
			upperBoundTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(293);
		}
		return upperBoundTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpperBoundType_Value() {
        return (EAttribute)getUpperBoundType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpperBoundType_Idtag() {
        return (EAttribute)getUpperBoundType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpperBoundType_Notes() {
        return (EAttribute)getUpperBoundType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUpperBoundType_AnyAttribute() {
        return (EAttribute)getUpperBoundType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValueType() {
		if (valueTypeEClass == null) {
			valueTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(294);
		}
		return valueTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Value() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Idtag() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_Notes() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getValueType_AnyAttribute() {
        return (EAttribute)getValueType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantRecordDataType() {
		if (variantRecordDataTypeEClass == null) {
			variantRecordDataTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(295);
		}
		return variantRecordDataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_Name() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_Discriminant() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_DataType() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_Alternative() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_Encoding() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataType_Semantics() {
        return (EReference)getVariantRecordDataType().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataType_Any() {
        return (EAttribute)getVariantRecordDataType().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataType_Idtag() {
        return (EAttribute)getVariantRecordDataType().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataType_Notes() {
        return (EAttribute)getVariantRecordDataType().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataType_AnyAttribute() {
        return (EAttribute)getVariantRecordDataType().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantRecordDataType1() {
		if (variantRecordDataType1EClass == null) {
			variantRecordDataType1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(296);
		}
		return variantRecordDataType1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantRecordDataTypesType() {
		if (variantRecordDataTypesTypeEClass == null) {
			variantRecordDataTypesTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(297);
		}
		return variantRecordDataTypesTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariantRecordDataTypesType_VariantRecordData() {
        return (EReference)getVariantRecordDataTypesType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataTypesType_Any() {
        return (EAttribute)getVariantRecordDataTypesType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataTypesType_Idtag() {
        return (EAttribute)getVariantRecordDataTypesType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataTypesType_Notes() {
        return (EAttribute)getVariantRecordDataTypesType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordDataTypesType_AnyAttribute() {
        return (EAttribute)getVariantRecordDataTypesType().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariantRecordEncodingType() {
		if (variantRecordEncodingTypeEClass == null) {
			variantRecordEncodingTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(300);
		}
		return variantRecordEncodingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordEncodingType_Value() {
        return (EAttribute)getVariantRecordEncodingType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordEncodingType_Idtag() {
        return (EAttribute)getVariantRecordEncodingType().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordEncodingType_Notes() {
        return (EAttribute)getVariantRecordEncodingType().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariantRecordEncodingType_AnyAttribute() {
        return (EAttribute)getVariantRecordEncodingType().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApplicationDomainEnumerations() {
		if (applicationDomainEnumerationsEEnum == null) {
			applicationDomainEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(4);
		}
		return applicationDomainEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCapabilityEnumerations() {
		if (capabilityEnumerationsEEnum == null) {
			capabilityEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(31);
		}
		return capabilityEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEndianEnumerations() {
		if (endianEnumerationsEEnum == null) {
			endianEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(78);
		}
		return endianEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFixedRecordEncodingEnumeration() {
		if (fixedRecordEncodingEnumerationEEnum == null) {
			fixedRecordEncodingEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(100);
		}
		return fixedRecordEncodingEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGlyphTypeEnumerations() {
		if (glyphTypeEnumerationsEEnum == null) {
			glyphTypeEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(134);
		}
		return glyphTypeEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOMTypeEnumerations() {
		if (omTypeEnumerationsEEnum == null) {
			omTypeEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(171);
		}
		return omTypeEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOrderEnumerations() {
		if (orderEnumerationsEEnum == null) {
			orderEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(174);
		}
		return orderEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOwnershipEnumerations() {
		if (ownershipEnumerationsEEnum == null) {
			ownershipEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(177);
		}
		return ownershipEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPOCTypeEnumeration() {
		if (pocTypeEnumerationEEnum == null) {
			pocTypeEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(184);
		}
		return pocTypeEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReliableEnumerations() {
		if (reliableEnumerationsEEnum == null) {
			reliableEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(209);
		}
		return reliableEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResignActionType() {
		if (resignActionTypeEEnum == null) {
			resignActionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(228);
		}
		return resignActionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSecurityClassificationEnumeration() {
		if (securityClassificationEnumerationEEnum == null) {
			securityClassificationEnumerationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(233);
		}
		return securityClassificationEnumerationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSharingEnumerations() {
		if (sharingEnumerationsEEnum == null) {
			sharingEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(242);
		}
		return sharingEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUpdateEnumerations() {
		if (updateEnumerationsEEnum == null) {
			updateEnumerationsEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(288);
		}
		return updateEnumerationsEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariantRecordEncodingEnumerator() {
		if (variantRecordEncodingEnumeratorEEnum == null) {
			variantRecordEncodingEnumeratorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(298);
		}
		return variantRecordEncodingEnumeratorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationDomainEnumerationsObject() {
		if (applicationDomainEnumerationsObjectEDataType == null) {
			applicationDomainEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(5);
		}
		return applicationDomainEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getApplicationDomainUnion() {
		if (applicationDomainUnionEDataType == null) {
			applicationDomainUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(7);
		}
		return applicationDomainUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayDatatypeEncodingEnum() {
		if (arrayDatatypeEncodingEnumEDataType == null) {
			arrayDatatypeEncodingEnumEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(10);
		}
		return arrayDatatypeEncodingEnumEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getArrayDatatypeEncodingUnion() {
		if (arrayDatatypeEncodingUnionEDataType == null) {
			arrayDatatypeEncodingUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(12);
		}
		return arrayDatatypeEncodingUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCapabilityEnumerationsObject() {
		if (capabilityEnumerationsObjectEDataType == null) {
			capabilityEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(32);
		}
		return capabilityEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCardinalityPattern() {
		if (cardinalityPatternEDataType == null) {
			cardinalityPatternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(34);
		}
		return cardinalityPatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDimensionValuePattern() {
		if (dimensionValuePatternEDataType == null) {
			dimensionValuePatternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(58);
		}
		return dimensionValuePatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getEndianEnumerationsObject() {
		if (endianEnumerationsObjectEDataType == null) {
			endianEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(79);
		}
		return endianEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFixedRecordEncodingEnumerationObject() {
		if (fixedRecordEncodingEnumerationObjectEDataType == null) {
			fixedRecordEncodingEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(101);
		}
		return fixedRecordEncodingEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getFixedRecordEncodingUnion() {
		if (fixedRecordEncodingUnionEDataType == null) {
			fixedRecordEncodingUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(103);
		}
		return fixedRecordEncodingUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlyphTypeEnumerationsObject() {
		if (glyphTypeEnumerationsObjectEDataType == null) {
			glyphTypeEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(135);
		}
		return glyphTypeEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getGlyphTypeUnion() {
		if (glyphTypeUnionEDataType == null) {
			glyphTypeUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(136);
		}
		return glyphTypeUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getNonEmptyString() {
		if (nonEmptyStringEDataType == null) {
			nonEmptyStringEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(160);
		}
		return nonEmptyStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOMTypeEnumerationsObject() {
		if (omTypeEnumerationsObjectEDataType == null) {
			omTypeEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(172);
		}
		return omTypeEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOMTypeUnion() {
		if (omTypeUnionEDataType == null) {
			omTypeUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(173);
		}
		return omTypeUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOrderEnumerationsObject() {
		if (orderEnumerationsObjectEDataType == null) {
			orderEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(175);
		}
		return orderEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getOwnershipEnumerationsObject() {
		if (ownershipEnumerationsObjectEDataType == null) {
			ownershipEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(178);
		}
		return ownershipEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPOCTypeEnumerationObject() {
		if (pocTypeEnumerationObjectEDataType == null) {
			pocTypeEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(185);
		}
		return pocTypeEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getPOCTypeUnion() {
		if (pocTypeUnionEDataType == null) {
			pocTypeUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(187);
		}
		return pocTypeUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getReliableEnumerationsObject() {
		if (reliableEnumerationsObjectEDataType == null) {
			reliableEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(210);
		}
		return reliableEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getResignActionTypeObject() {
		if (resignActionTypeObjectEDataType == null) {
			resignActionTypeObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(229);
		}
		return resignActionTypeObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSecurityClassificationEnumerationObject() {
		if (securityClassificationEnumerationObjectEDataType == null) {
			securityClassificationEnumerationObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(234);
		}
		return securityClassificationEnumerationObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSecurityClassificationUnion() {
		if (securityClassificationUnionEDataType == null) {
			securityClassificationUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(236);
		}
		return securityClassificationUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getSharingEnumerationsObject() {
		if (sharingEnumerationsObjectEDataType == null) {
			sharingEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(243);
		}
		return sharingEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getUpdateEnumerationsObject() {
		if (updateEnumerationsObjectEDataType == null) {
			updateEnumerationsObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(289);
		}
		return updateEnumerationsObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariantRecordEncodingEnumeratorObject() {
		if (variantRecordEncodingEnumeratorObjectEDataType == null) {
			variantRecordEncodingEnumeratorObjectEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(299);
		}
		return variantRecordEncodingEnumeratorObjectEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariantRecordEncodingUnion() {
		if (variantRecordEncodingUnionEDataType == null) {
			variantRecordEncodingUnionEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(301);
		}
		return variantRecordEncodingUnionEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVariantRecordEnumeratorPattern() {
		if (variantRecordEnumeratorPatternEDataType == null) {
			variantRecordEnumeratorPatternEDataType = (EDataType)EPackage.Registry.INSTANCE.getEPackage(_2010Package.eNS_URI).getEClassifiers().get(302);
		}
		return variantRecordEnumeratorPatternEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010Factory get_2010Factory() {
		return (_2010Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.ieee.standards.ieee1516._2010." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //_2010PackageImpl
