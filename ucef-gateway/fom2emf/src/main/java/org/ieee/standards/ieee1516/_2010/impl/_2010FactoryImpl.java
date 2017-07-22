/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.Diagnostician;

import org.eclipse.emf.ecore.xml.type.XMLTypeFactory;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.ieee.standards.ieee1516._2010.AbortFederationRestoreType;
import org.ieee.standards.ieee1516._2010.AbortFederationSaveType;
import org.ieee.standards.ieee1516._2010.AlternativeType;
import org.ieee.standards.ieee1516._2010.AnnounceSynchronizationPointType;
import org.ieee.standards.ieee1516._2010.ApplicationDomainEnumerations;
import org.ieee.standards.ieee1516._2010.ApplicationDomainType;
import org.ieee.standards.ieee1516._2010.ArrayDataType;
import org.ieee.standards.ieee1516._2010.ArrayDataType1;
import org.ieee.standards.ieee1516._2010.ArrayDataTypesType;
import org.ieee.standards.ieee1516._2010.ArrayDataTypesType1;
import org.ieee.standards.ieee1516._2010.ArrayDatatypeEncodingType;
import org.ieee.standards.ieee1516._2010.AssociateRegionsForUpdatesType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipReleaseDeniedType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipUnavailableType;
import org.ieee.standards.ieee1516._2010.AttributeType;
import org.ieee.standards.ieee1516._2010.AttributeType1;
import org.ieee.standards.ieee1516._2010.AttributesInScopeType;
import org.ieee.standards.ieee1516._2010.AttributesOutOfScopeType;
import org.ieee.standards.ieee1516._2010.BasicDataRepresentationsType;
import org.ieee.standards.ieee1516._2010.BasicDataType;
import org.ieee.standards.ieee1516._2010.BasicDataType1;
import org.ieee.standards.ieee1516._2010.CancelAttributeOwnershipAcquisitionType;
import org.ieee.standards.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType;
import org.ieee.standards.ieee1516._2010.CapabilityEnumerations;
import org.ieee.standards.ieee1516._2010.CapabilityType;
import org.ieee.standards.ieee1516._2010.CardinalityType;
import org.ieee.standards.ieee1516._2010.ChangeAttributeOrderTypeType;
import org.ieee.standards.ieee1516._2010.ChangeInteractionOrderTypeType;
import org.ieee.standards.ieee1516._2010.CommitRegionModificationsType;
import org.ieee.standards.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType;
import org.ieee.standards.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType;
import org.ieee.standards.ieee1516._2010.ConfirmDivestitureType;
import org.ieee.standards.ieee1516._2010.ConfirmFederationRestorationRequestType;
import org.ieee.standards.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType;
import org.ieee.standards.ieee1516._2010.ConfirmSynchronizationPointRegistrationType;
import org.ieee.standards.ieee1516._2010.ConnectType;
import org.ieee.standards.ieee1516._2010.ConnectionLostType;
import org.ieee.standards.ieee1516._2010.CreateFederationExecutionType;
import org.ieee.standards.ieee1516._2010.CreateRegionType;
import org.ieee.standards.ieee1516._2010.DataTypesType;
import org.ieee.standards.ieee1516._2010.DeleteObjectInstanceType;
import org.ieee.standards.ieee1516._2010.DeleteRegionType;
import org.ieee.standards.ieee1516._2010.DestroyFederationExecutionType;
import org.ieee.standards.ieee1516._2010.DimensionType;
import org.ieee.standards.ieee1516._2010.DimensionType1;
import org.ieee.standards.ieee1516._2010.DimensionsType;
import org.ieee.standards.ieee1516._2010.DimensionsType1;
import org.ieee.standards.ieee1516._2010.DimensionsType2;
import org.ieee.standards.ieee1516._2010.DisableAsynchronousDeliveryType;
import org.ieee.standards.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.DisableCallbacksType;
import org.ieee.standards.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.DisableTimeConstrainedType;
import org.ieee.standards.ieee1516._2010.DisableTimeRegulationType;
import org.ieee.standards.ieee1516._2010.DisconnectType;
import org.ieee.standards.ieee1516._2010.DiscoverObjectInstanceType;
import org.ieee.standards.ieee1516._2010.DocumentRoot;
import org.ieee.standards.ieee1516._2010.EnableAsynchronousDeliveryType;
import org.ieee.standards.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableCallbacksType;
import org.ieee.standards.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableTimeConstrainedType;
import org.ieee.standards.ieee1516._2010.EnableTimeRegulationType;
import org.ieee.standards.ieee1516._2010.EndianEnumerations;
import org.ieee.standards.ieee1516._2010.EndianType;
import org.ieee.standards.ieee1516._2010.EnumeratedDataType;
import org.ieee.standards.ieee1516._2010.EnumeratedDataType1;
import org.ieee.standards.ieee1516._2010.EnumeratedDataTypesType;
import org.ieee.standards.ieee1516._2010.EnumeratorType;
import org.ieee.standards.ieee1516._2010.EvokeCallbackType;
import org.ieee.standards.ieee1516._2010.EvokeMultipleCallbacksType;
import org.ieee.standards.ieee1516._2010.FederateRestoreCompleteType;
import org.ieee.standards.ieee1516._2010.FederateSaveBegunType;
import org.ieee.standards.ieee1516._2010.FederateSaveCompleteType;
import org.ieee.standards.ieee1516._2010.FederationRestoreBegunType;
import org.ieee.standards.ieee1516._2010.FederationRestoreStatusResponseType;
import org.ieee.standards.ieee1516._2010.FederationRestoredType;
import org.ieee.standards.ieee1516._2010.FederationSaveStatusResponseType;
import org.ieee.standards.ieee1516._2010.FederationSavedType;
import org.ieee.standards.ieee1516._2010.FederationSynchronizedType;
import org.ieee.standards.ieee1516._2010.FieldType;
import org.ieee.standards.ieee1516._2010.FixedRecordDataType;
import org.ieee.standards.ieee1516._2010.FixedRecordDataType1;
import org.ieee.standards.ieee1516._2010.FixedRecordDataTypesType;
import org.ieee.standards.ieee1516._2010.FixedRecordEncodingEnumeration;
import org.ieee.standards.ieee1516._2010.FixedRecordEncodingType;
import org.ieee.standards.ieee1516._2010.FlushQueueRequestType;
import org.ieee.standards.ieee1516._2010.GetAttributeHandleType;
import org.ieee.standards.ieee1516._2010.GetAttributeNameType;
import org.ieee.standards.ieee1516._2010.GetAutomaticResignDirectiveType;
import org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForClassAttributeType;
import org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForInteractionClassType;
import org.ieee.standards.ieee1516._2010.GetDimensionHandleSetType;
import org.ieee.standards.ieee1516._2010.GetDimensionHandleType;
import org.ieee.standards.ieee1516._2010.GetDimensionNameType;
import org.ieee.standards.ieee1516._2010.GetDimensionUpperBoundType;
import org.ieee.standards.ieee1516._2010.GetFederateHandleType;
import org.ieee.standards.ieee1516._2010.GetFederateNameType;
import org.ieee.standards.ieee1516._2010.GetInteractionClassHandleType;
import org.ieee.standards.ieee1516._2010.GetInteractionClassNameType;
import org.ieee.standards.ieee1516._2010.GetKnownObjectClassHandleType;
import org.ieee.standards.ieee1516._2010.GetObjectClassHandleType;
import org.ieee.standards.ieee1516._2010.GetObjectClassNameType;
import org.ieee.standards.ieee1516._2010.GetObjectInstanceHandleType;
import org.ieee.standards.ieee1516._2010.GetObjectInstanceNameType;
import org.ieee.standards.ieee1516._2010.GetOrderNameType;
import org.ieee.standards.ieee1516._2010.GetOrderTypeType;
import org.ieee.standards.ieee1516._2010.GetParameterHandleType;
import org.ieee.standards.ieee1516._2010.GetParameterNameType;
import org.ieee.standards.ieee1516._2010.GetRangeBoundsType;
import org.ieee.standards.ieee1516._2010.GetTransportationTypeHandleType;
import org.ieee.standards.ieee1516._2010.GetTransportationTypeNameType;
import org.ieee.standards.ieee1516._2010.GetUpdateRateValueForAttributeType;
import org.ieee.standards.ieee1516._2010.GetUpdateRateValueType;
import org.ieee.standards.ieee1516._2010.GlyphType;
import org.ieee.standards.ieee1516._2010.GlyphType1;
import org.ieee.standards.ieee1516._2010.GlyphTypeEnumerations;
import org.ieee.standards.ieee1516._2010.IdReferenceType;
import org.ieee.standards.ieee1516._2010.IdentificationType;
import org.ieee.standards.ieee1516._2010.IdentifierType;
import org.ieee.standards.ieee1516._2010.InformAttributeOwnershipType;
import org.ieee.standards.ieee1516._2010.InitiateFederateRestoreType;
import org.ieee.standards.ieee1516._2010.InitiateFederateSaveType;
import org.ieee.standards.ieee1516._2010.InteractionClassType;
import org.ieee.standards.ieee1516._2010.InteractionClassType1;
import org.ieee.standards.ieee1516._2010.InteractionsType;
import org.ieee.standards.ieee1516._2010.IsAttributeOwnedByFederateType;
import org.ieee.standards.ieee1516._2010.JoinFederationExecutionType;
import org.ieee.standards.ieee1516._2010.KeywordType;
import org.ieee.standards.ieee1516._2010.ListFederationExecutionsType;
import org.ieee.standards.ieee1516._2010.LocalDeleteObjectInstanceType;
import org.ieee.standards.ieee1516._2010.LookaheadType;
import org.ieee.standards.ieee1516._2010.ModelIdentificationType;
import org.ieee.standards.ieee1516._2010.ModelType;
import org.ieee.standards.ieee1516._2010.ModificationDateType;
import org.ieee.standards.ieee1516._2010.ModifyLookaheadType;
import org.ieee.standards.ieee1516._2010.MultipleObjectInstanceNamesReservedType;
import org.ieee.standards.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType;
import org.ieee.standards.ieee1516._2010.NextMessageRequestAvailableType;
import org.ieee.standards.ieee1516._2010.NextMessageRequestType;
import org.ieee.standards.ieee1516._2010.NonEmptyString1;
import org.ieee.standards.ieee1516._2010.NormalizeFederateHandleType;
import org.ieee.standards.ieee1516._2010.NormalizeServiceGroupType;
import org.ieee.standards.ieee1516._2010.NoteType;
import org.ieee.standards.ieee1516._2010.NotesType;
import org.ieee.standards.ieee1516._2010.OMTypeEnumerations;
import org.ieee.standards.ieee1516._2010.ObjectClassType;
import org.ieee.standards.ieee1516._2010.ObjectClassType1;
import org.ieee.standards.ieee1516._2010.ObjectInstanceNameReservedType;
import org.ieee.standards.ieee1516._2010.ObjectModelType;
import org.ieee.standards.ieee1516._2010.ObjectsType;
import org.ieee.standards.ieee1516._2010.OrderEnumerations;
import org.ieee.standards.ieee1516._2010.OrderType;
import org.ieee.standards.ieee1516._2010.OwnershipEnumerations;
import org.ieee.standards.ieee1516._2010.OwnershipType;
import org.ieee.standards.ieee1516._2010.POCTypeEnumeration;
import org.ieee.standards.ieee1516._2010.ParameterType;
import org.ieee.standards.ieee1516._2010.ParameterType1;
import org.ieee.standards.ieee1516._2010.PocType;
import org.ieee.standards.ieee1516._2010.PocType1;
import org.ieee.standards.ieee1516._2010.PocTypeType;
import org.ieee.standards.ieee1516._2010.ProvideAttributeValueUpdateType;
import org.ieee.standards.ieee1516._2010.PublishInteractionClassType;
import org.ieee.standards.ieee1516._2010.PublishObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.QueryAttributeOwnershipType;
import org.ieee.standards.ieee1516._2010.QueryAttributeTransportationTypeType;
import org.ieee.standards.ieee1516._2010.QueryFederationRestoreStatusType;
import org.ieee.standards.ieee1516._2010.QueryFederationSaveStatusType;
import org.ieee.standards.ieee1516._2010.QueryGALTType;
import org.ieee.standards.ieee1516._2010.QueryInteractionTransportationTypeType;
import org.ieee.standards.ieee1516._2010.QueryLITSType;
import org.ieee.standards.ieee1516._2010.QueryLogicalTimeType;
import org.ieee.standards.ieee1516._2010.QueryLookaheadType;
import org.ieee.standards.ieee1516._2010.RateType;
import org.ieee.standards.ieee1516._2010.ReceiveInteractionType;
import org.ieee.standards.ieee1516._2010.ReferenceType;
import org.ieee.standards.ieee1516._2010.ReflectAttributeValuesType;
import org.ieee.standards.ieee1516._2010.RegisterFederationSynchronizationPointType;
import org.ieee.standards.ieee1516._2010.RegisterObjectInstanceType;
import org.ieee.standards.ieee1516._2010.RegisterObjectInstanceWithRegionsType;
import org.ieee.standards.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType;
import org.ieee.standards.ieee1516._2010.ReleaseObjectInstanceNameType;
import org.ieee.standards.ieee1516._2010.ReliableEnumerations;
import org.ieee.standards.ieee1516._2010.ReliableType;
import org.ieee.standards.ieee1516._2010.RemoveobjectinstanceType;
import org.ieee.standards.ieee1516._2010.ReportAttributeTransportationTypeType;
import org.ieee.standards.ieee1516._2010.ReportFederationExecutionsType;
import org.ieee.standards.ieee1516._2010.ReportInteractionTransportationTypeType;
import org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipAssumptionType;
import org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipReleaseType;
import org.ieee.standards.ieee1516._2010.RequestAttributeTransportationTypeChangeType;
import org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateType;
import org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType;
import org.ieee.standards.ieee1516._2010.RequestDivestitureConfirmationType;
import org.ieee.standards.ieee1516._2010.RequestFederationRestoreType;
import org.ieee.standards.ieee1516._2010.RequestFederationSaveType;
import org.ieee.standards.ieee1516._2010.RequestInteractionTransportationTypeChangeType;
import org.ieee.standards.ieee1516._2010.RequestRetractionType;
import org.ieee.standards.ieee1516._2010.ReserveMultipleObjectInstanceNamesType;
import org.ieee.standards.ieee1516._2010.ReserveObjectInstanceNameType;
import org.ieee.standards.ieee1516._2010.ResignActionType;
import org.ieee.standards.ieee1516._2010.ResignFederationExecutionType;
import org.ieee.standards.ieee1516._2010.ResignSwitchType;
import org.ieee.standards.ieee1516._2010.RetractType;
import org.ieee.standards.ieee1516._2010.SecurityClassificationEnumeration;
import org.ieee.standards.ieee1516._2010.SecurityClassificationType;
import org.ieee.standards.ieee1516._2010.SendInteractionType;
import org.ieee.standards.ieee1516._2010.SendInteractionWithRegionsType;
import org.ieee.standards.ieee1516._2010.ServiceUtilizationType;
import org.ieee.standards.ieee1516._2010.SetAutomaticResignDirectiveType;
import org.ieee.standards.ieee1516._2010.SetRangeBoundsType;
import org.ieee.standards.ieee1516._2010.SharingEnumerations;
import org.ieee.standards.ieee1516._2010.SharingType;
import org.ieee.standards.ieee1516._2010.SimpleDataType;
import org.ieee.standards.ieee1516._2010.SimpleDataType1;
import org.ieee.standards.ieee1516._2010.SimpleDataTypesType;
import org.ieee.standards.ieee1516._2010.Size;
import org.ieee.standards.ieee1516._2010.StartRegistrationForObjectClassType;
import org.ieee.standards.ieee1516._2010.StopRegistrationForObjectClassType;
import org.ieee.standards.ieee1516._2010.SubscribeInteractionClassType;
import org.ieee.standards.ieee1516._2010.SubscribeInteractionClassWithRegionsType;
import org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType;
import org.ieee.standards.ieee1516._2010.SwitchType;
import org.ieee.standards.ieee1516._2010.SwitchesType;
import org.ieee.standards.ieee1516._2010.SynchronizationPointAchievedType;
import org.ieee.standards.ieee1516._2010.SynchronizationPointType;
import org.ieee.standards.ieee1516._2010.SynchronizationPointType1;
import org.ieee.standards.ieee1516._2010.SynchronizationsType;
import org.ieee.standards.ieee1516._2010.TagType;
import org.ieee.standards.ieee1516._2010.TagsType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceGrantType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceRequestAvailableType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceRequestType;
import org.ieee.standards.ieee1516._2010.TimeConstrainedEnabledType;
import org.ieee.standards.ieee1516._2010.TimeRegulationEnabledType;
import org.ieee.standards.ieee1516._2010.TimeStampType;
import org.ieee.standards.ieee1516._2010.TimeType;
import org.ieee.standards.ieee1516._2010.TransportationType;
import org.ieee.standards.ieee1516._2010.TransportationType1;
import org.ieee.standards.ieee1516._2010.TransportationsType;
import org.ieee.standards.ieee1516._2010.TurnInteractionsOffType;
import org.ieee.standards.ieee1516._2010.TurnInteractionsOnType;
import org.ieee.standards.ieee1516._2010.TurnUpdatesOffForObjectInstanceType;
import org.ieee.standards.ieee1516._2010.TurnUpdatesOnForObjectInstanceType;
import org.ieee.standards.ieee1516._2010.TypeType;
import org.ieee.standards.ieee1516._2010.UnassociateRegionsForUpdatesType;
import org.ieee.standards.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType;
import org.ieee.standards.ieee1516._2010.UnpublishInteractionClassType;
import org.ieee.standards.ieee1516._2010.UnpublishObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassType;
import org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType;
import org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType;
import org.ieee.standards.ieee1516._2010.UpdateAttributeValuesType;
import org.ieee.standards.ieee1516._2010.UpdateEnumerations;
import org.ieee.standards.ieee1516._2010.UpdateRateType;
import org.ieee.standards.ieee1516._2010.UpdateRatesType;
import org.ieee.standards.ieee1516._2010.UpdateType;
import org.ieee.standards.ieee1516._2010.UpperBoundType;
import org.ieee.standards.ieee1516._2010.ValueType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataType1;
import org.ieee.standards.ieee1516._2010.VariantRecordDataTypesType;
import org.ieee.standards.ieee1516._2010.VariantRecordEncodingEnumerator;
import org.ieee.standards.ieee1516._2010.VariantRecordEncodingType;
import org.ieee.standards.ieee1516._2010._2010Factory;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class _2010FactoryImpl extends EFactoryImpl implements _2010Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static _2010Factory init() {
		try {
			_2010Factory the_2010Factory = (_2010Factory)EPackage.Registry.INSTANCE.getEFactory(_2010Package.eNS_URI);
			if (the_2010Factory != null) {
				return the_2010Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new _2010FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case _2010Package.ABORT_FEDERATION_RESTORE_TYPE: return createAbortFederationRestoreType();
			case _2010Package.ABORT_FEDERATION_SAVE_TYPE: return createAbortFederationSaveType();
			case _2010Package.ALTERNATIVE_TYPE: return createAlternativeType();
			case _2010Package.ANNOUNCE_SYNCHRONIZATION_POINT_TYPE: return createAnnounceSynchronizationPointType();
			case _2010Package.APPLICATION_DOMAIN_TYPE: return createApplicationDomainType();
			case _2010Package.ARRAY_DATA_TYPE: return createArrayDataType();
			case _2010Package.ARRAY_DATA_TYPE1: return createArrayDataType1();
			case _2010Package.ARRAY_DATATYPE_ENCODING_TYPE: return createArrayDatatypeEncodingType();
			case _2010Package.ARRAY_DATA_TYPES_TYPE: return createArrayDataTypesType();
			case _2010Package.ARRAY_DATA_TYPES_TYPE1: return createArrayDataTypesType1();
			case _2010Package.ASSOCIATE_REGIONS_FOR_UPDATES_TYPE: return createAssociateRegionsForUpdatesType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE_TYPE: return createAttributeOwnershipAcquisitionIfAvailableType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION_TYPE: return createAttributeOwnershipAcquisitionNotificationType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: return createAttributeOwnershipAcquisitionType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED_TYPE: return createAttributeOwnershipDivestitureIfWantedType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_RELEASE_DENIED_TYPE: return createAttributeOwnershipReleaseDeniedType();
			case _2010Package.ATTRIBUTE_OWNERSHIP_UNAVAILABLE_TYPE: return createAttributeOwnershipUnavailableType();
			case _2010Package.ATTRIBUTES_IN_SCOPE_TYPE: return createAttributesInScopeType();
			case _2010Package.ATTRIBUTES_OUT_OF_SCOPE_TYPE: return createAttributesOutOfScopeType();
			case _2010Package.ATTRIBUTE_TYPE: return createAttributeType();
			case _2010Package.ATTRIBUTE_TYPE1: return createAttributeType1();
			case _2010Package.BASIC_DATA_REPRESENTATIONS_TYPE: return createBasicDataRepresentationsType();
			case _2010Package.BASIC_DATA_TYPE: return createBasicDataType();
			case _2010Package.BASIC_DATA_TYPE1: return createBasicDataType1();
			case _2010Package.CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION_TYPE: return createCancelAttributeOwnershipAcquisitionType();
			case _2010Package.CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createCancelNegotiatedAttributeOwnershipDivestitureType();
			case _2010Package.CAPABILITY_TYPE: return createCapabilityType();
			case _2010Package.CARDINALITY_TYPE: return createCardinalityType();
			case _2010Package.CHANGE_ATTRIBUTE_ORDER_TYPE_TYPE: return createChangeAttributeOrderTypeType();
			case _2010Package.CHANGE_INTERACTION_ORDER_TYPE_TYPE: return createChangeInteractionOrderTypeType();
			case _2010Package.COMMIT_REGION_MODIFICATIONS_TYPE: return createCommitRegionModificationsType();
			case _2010Package.CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION_TYPE: return createConfirmAttributeOwnershipAcquisitionCancellationType();
			case _2010Package.CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: return createConfirmAttributeTransportationTypeChangeType();
			case _2010Package.CONFIRM_DIVESTITURE_TYPE: return createConfirmDivestitureType();
			case _2010Package.CONFIRM_FEDERATION_RESTORATION_REQUEST_TYPE: return createConfirmFederationRestorationRequestType();
			case _2010Package.CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: return createConfirmInteractionTransportationTypeChangeType();
			case _2010Package.CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION_TYPE: return createConfirmSynchronizationPointRegistrationType();
			case _2010Package.CONNECTION_LOST_TYPE: return createConnectionLostType();
			case _2010Package.CONNECT_TYPE: return createConnectType();
			case _2010Package.CREATE_FEDERATION_EXECUTION_TYPE: return createCreateFederationExecutionType();
			case _2010Package.CREATE_REGION_TYPE: return createCreateRegionType();
			case _2010Package.DATA_TYPES_TYPE: return createDataTypesType();
			case _2010Package.DELETE_OBJECT_INSTANCE_TYPE: return createDeleteObjectInstanceType();
			case _2010Package.DELETE_REGION_TYPE: return createDeleteRegionType();
			case _2010Package.DESTROY_FEDERATION_EXECUTION_TYPE: return createDestroyFederationExecutionType();
			case _2010Package.DIMENSIONS_TYPE: return createDimensionsType();
			case _2010Package.DIMENSIONS_TYPE1: return createDimensionsType1();
			case _2010Package.DIMENSIONS_TYPE2: return createDimensionsType2();
			case _2010Package.DIMENSION_TYPE: return createDimensionType();
			case _2010Package.DIMENSION_TYPE1: return createDimensionType1();
			case _2010Package.DISABLE_ASYNCHRONOUS_DELIVERY_TYPE: return createDisableAsynchronousDeliveryType();
			case _2010Package.DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableAttributeRelevanceAdvisorySwitchType();
			case _2010Package.DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: return createDisableAttributeScopeAdvisorySwitchType();
			case _2010Package.DISABLE_CALLBACKS_TYPE: return createDisableCallbacksType();
			case _2010Package.DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableInteractionRelevanceAdvisorySwitchType();
			case _2010Package.DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: return createDisableObjectClassRelevanceAdvisorySwitchType();
			case _2010Package.DISABLE_TIME_CONSTRAINED_TYPE: return createDisableTimeConstrainedType();
			case _2010Package.DISABLE_TIME_REGULATION_TYPE: return createDisableTimeRegulationType();
			case _2010Package.DISCONNECT_TYPE: return createDisconnectType();
			case _2010Package.DISCOVER_OBJECT_INSTANCE_TYPE: return createDiscoverObjectInstanceType();
			case _2010Package.DOCUMENT_ROOT: return createDocumentRoot();
			case _2010Package.ENABLE_ASYNCHRONOUS_DELIVERY_TYPE: return createEnableAsynchronousDeliveryType();
			case _2010Package.ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableAttributeRelevanceAdvisorySwitchType();
			case _2010Package.ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH_TYPE: return createEnableAttributeScopeAdvisorySwitchType();
			case _2010Package.ENABLE_CALLBACKS_TYPE: return createEnableCallbacksType();
			case _2010Package.ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableInteractionRelevanceAdvisorySwitchType();
			case _2010Package.ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH_TYPE: return createEnableObjectClassRelevanceAdvisorySwitchType();
			case _2010Package.ENABLE_TIME_CONSTRAINED_TYPE: return createEnableTimeConstrainedType();
			case _2010Package.ENABLE_TIME_REGULATION_TYPE: return createEnableTimeRegulationType();
			case _2010Package.ENDIAN_TYPE: return createEndianType();
			case _2010Package.ENUMERATED_DATA_TYPE: return createEnumeratedDataType();
			case _2010Package.ENUMERATED_DATA_TYPE1: return createEnumeratedDataType1();
			case _2010Package.ENUMERATED_DATA_TYPES_TYPE: return createEnumeratedDataTypesType();
			case _2010Package.ENUMERATOR_TYPE: return createEnumeratorType();
			case _2010Package.EVOKE_CALLBACK_TYPE: return createEvokeCallbackType();
			case _2010Package.EVOKE_MULTIPLE_CALLBACKS_TYPE: return createEvokeMultipleCallbacksType();
			case _2010Package.FEDERATE_RESTORE_COMPLETE_TYPE: return createFederateRestoreCompleteType();
			case _2010Package.FEDERATE_SAVE_BEGUN_TYPE: return createFederateSaveBegunType();
			case _2010Package.FEDERATE_SAVE_COMPLETE_TYPE: return createFederateSaveCompleteType();
			case _2010Package.FEDERATION_RESTORE_BEGUN_TYPE: return createFederationRestoreBegunType();
			case _2010Package.FEDERATION_RESTORED_TYPE: return createFederationRestoredType();
			case _2010Package.FEDERATION_RESTORE_STATUS_RESPONSE_TYPE: return createFederationRestoreStatusResponseType();
			case _2010Package.FEDERATION_SAVED_TYPE: return createFederationSavedType();
			case _2010Package.FEDERATION_SAVE_STATUS_RESPONSE_TYPE: return createFederationSaveStatusResponseType();
			case _2010Package.FEDERATION_SYNCHRONIZED_TYPE: return createFederationSynchronizedType();
			case _2010Package.FIELD_TYPE: return createFieldType();
			case _2010Package.FIXED_RECORD_DATA_TYPE: return createFixedRecordDataType();
			case _2010Package.FIXED_RECORD_DATA_TYPE1: return createFixedRecordDataType1();
			case _2010Package.FIXED_RECORD_DATA_TYPES_TYPE: return createFixedRecordDataTypesType();
			case _2010Package.FIXED_RECORD_ENCODING_TYPE: return createFixedRecordEncodingType();
			case _2010Package.FLUSH_QUEUE_REQUEST_TYPE: return createFlushQueueRequestType();
			case _2010Package.GET_ATTRIBUTE_HANDLE_TYPE: return createGetAttributeHandleType();
			case _2010Package.GET_ATTRIBUTE_NAME_TYPE: return createGetAttributeNameType();
			case _2010Package.GET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: return createGetAutomaticResignDirectiveType();
			case _2010Package.GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE_TYPE: return createGetAvailableDimensionsForClassAttributeType();
			case _2010Package.GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS_TYPE: return createGetAvailableDimensionsForInteractionClassType();
			case _2010Package.GET_DIMENSION_HANDLE_SET_TYPE: return createGetDimensionHandleSetType();
			case _2010Package.GET_DIMENSION_HANDLE_TYPE: return createGetDimensionHandleType();
			case _2010Package.GET_DIMENSION_NAME_TYPE: return createGetDimensionNameType();
			case _2010Package.GET_DIMENSION_UPPER_BOUND_TYPE: return createGetDimensionUpperBoundType();
			case _2010Package.GET_FEDERATE_HANDLE_TYPE: return createGetFederateHandleType();
			case _2010Package.GET_FEDERATE_NAME_TYPE: return createGetFederateNameType();
			case _2010Package.GET_INTERACTION_CLASS_HANDLE_TYPE: return createGetInteractionClassHandleType();
			case _2010Package.GET_INTERACTION_CLASS_NAME_TYPE: return createGetInteractionClassNameType();
			case _2010Package.GET_KNOWN_OBJECT_CLASS_HANDLE_TYPE: return createGetKnownObjectClassHandleType();
			case _2010Package.GET_OBJECT_CLASS_HANDLE_TYPE: return createGetObjectClassHandleType();
			case _2010Package.GET_OBJECT_CLASS_NAME_TYPE: return createGetObjectClassNameType();
			case _2010Package.GET_OBJECT_INSTANCE_HANDLE_TYPE: return createGetObjectInstanceHandleType();
			case _2010Package.GET_OBJECT_INSTANCE_NAME_TYPE: return createGetObjectInstanceNameType();
			case _2010Package.GET_ORDER_NAME_TYPE: return createGetOrderNameType();
			case _2010Package.GET_ORDER_TYPE_TYPE: return createGetOrderTypeType();
			case _2010Package.GET_PARAMETER_HANDLE_TYPE: return createGetParameterHandleType();
			case _2010Package.GET_PARAMETER_NAME_TYPE: return createGetParameterNameType();
			case _2010Package.GET_RANGE_BOUNDS_TYPE: return createGetRangeBoundsType();
			case _2010Package.GET_TRANSPORTATION_TYPE_HANDLE_TYPE: return createGetTransportationTypeHandleType();
			case _2010Package.GET_TRANSPORTATION_TYPE_NAME_TYPE: return createGetTransportationTypeNameType();
			case _2010Package.GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE_TYPE: return createGetUpdateRateValueForAttributeType();
			case _2010Package.GET_UPDATE_RATE_VALUE_TYPE: return createGetUpdateRateValueType();
			case _2010Package.GLYPH_TYPE: return createGlyphType();
			case _2010Package.GLYPH_TYPE1: return createGlyphType1();
			case _2010Package.IDENTIFICATION_TYPE: return createIdentificationType();
			case _2010Package.IDENTIFIER_TYPE: return createIdentifierType();
			case _2010Package.ID_REFERENCE_TYPE: return createIdReferenceType();
			case _2010Package.INFORM_ATTRIBUTE_OWNERSHIP_TYPE: return createInformAttributeOwnershipType();
			case _2010Package.INITIATE_FEDERATE_RESTORE_TYPE: return createInitiateFederateRestoreType();
			case _2010Package.INITIATE_FEDERATE_SAVE_TYPE: return createInitiateFederateSaveType();
			case _2010Package.INTERACTION_CLASS_TYPE: return createInteractionClassType();
			case _2010Package.INTERACTION_CLASS_TYPE1: return createInteractionClassType1();
			case _2010Package.INTERACTIONS_TYPE: return createInteractionsType();
			case _2010Package.IS_ATTRIBUTE_OWNED_BY_FEDERATE_TYPE: return createIsAttributeOwnedByFederateType();
			case _2010Package.JOIN_FEDERATION_EXECUTION_TYPE: return createJoinFederationExecutionType();
			case _2010Package.KEYWORD_TYPE: return createKeywordType();
			case _2010Package.LIST_FEDERATION_EXECUTIONS_TYPE: return createListFederationExecutionsType();
			case _2010Package.LOCAL_DELETE_OBJECT_INSTANCE_TYPE: return createLocalDeleteObjectInstanceType();
			case _2010Package.LOOKAHEAD_TYPE: return createLookaheadType();
			case _2010Package.MODEL_IDENTIFICATION_TYPE: return createModelIdentificationType();
			case _2010Package.MODEL_TYPE: return createModelType();
			case _2010Package.MODIFICATION_DATE_TYPE: return createModificationDateType();
			case _2010Package.MODIFY_LOOKAHEAD_TYPE: return createModifyLookaheadType();
			case _2010Package.MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED_TYPE: return createMultipleObjectInstanceNamesReservedType();
			case _2010Package.NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createNegotiatedAttributeOwnershipDivestitureType();
			case _2010Package.NEXT_MESSAGE_REQUEST_AVAILABLE_TYPE: return createNextMessageRequestAvailableType();
			case _2010Package.NEXT_MESSAGE_REQUEST_TYPE: return createNextMessageRequestType();
			case _2010Package.NON_EMPTY_STRING1: return createNonEmptyString1();
			case _2010Package.NORMALIZE_FEDERATE_HANDLE_TYPE: return createNormalizeFederateHandleType();
			case _2010Package.NORMALIZE_SERVICE_GROUP_TYPE: return createNormalizeServiceGroupType();
			case _2010Package.NOTES_TYPE: return createNotesType();
			case _2010Package.NOTE_TYPE: return createNoteType();
			case _2010Package.OBJECT_CLASS_TYPE: return createObjectClassType();
			case _2010Package.OBJECT_CLASS_TYPE1: return createObjectClassType1();
			case _2010Package.OBJECT_INSTANCE_NAME_RESERVED_TYPE: return createObjectInstanceNameReservedType();
			case _2010Package.OBJECT_MODEL_TYPE: return createObjectModelType();
			case _2010Package.OBJECTS_TYPE: return createObjectsType();
			case _2010Package.ORDER_TYPE: return createOrderType();
			case _2010Package.OWNERSHIP_TYPE: return createOwnershipType();
			case _2010Package.PARAMETER_TYPE: return createParameterType();
			case _2010Package.PARAMETER_TYPE1: return createParameterType1();
			case _2010Package.POC_TYPE: return createPocType();
			case _2010Package.POC_TYPE1: return createPocType1();
			case _2010Package.POC_TYPE_TYPE: return createPocTypeType();
			case _2010Package.PROVIDE_ATTRIBUTE_VALUE_UPDATE_TYPE: return createProvideAttributeValueUpdateType();
			case _2010Package.PUBLISH_INTERACTION_CLASS_TYPE: return createPublishInteractionClassType();
			case _2010Package.PUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: return createPublishObjectClassAttributesType();
			case _2010Package.QUERY_ATTRIBUTE_OWNERSHIP_TYPE: return createQueryAttributeOwnershipType();
			case _2010Package.QUERY_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: return createQueryAttributeTransportationTypeType();
			case _2010Package.QUERY_FEDERATION_RESTORE_STATUS_TYPE: return createQueryFederationRestoreStatusType();
			case _2010Package.QUERY_FEDERATION_SAVE_STATUS_TYPE: return createQueryFederationSaveStatusType();
			case _2010Package.QUERY_GALT_TYPE: return createQueryGALTType();
			case _2010Package.QUERY_INTERACTION_TRANSPORTATION_TYPE_TYPE: return createQueryInteractionTransportationTypeType();
			case _2010Package.QUERY_LITS_TYPE: return createQueryLITSType();
			case _2010Package.QUERY_LOGICAL_TIME_TYPE: return createQueryLogicalTimeType();
			case _2010Package.QUERY_LOOKAHEAD_TYPE: return createQueryLookaheadType();
			case _2010Package.RATE_TYPE: return createRateType();
			case _2010Package.RECEIVE_INTERACTION_TYPE: return createReceiveInteractionType();
			case _2010Package.REFERENCE_TYPE: return createReferenceType();
			case _2010Package.REFLECT_ATTRIBUTE_VALUES_TYPE: return createReflectAttributeValuesType();
			case _2010Package.REGISTER_FEDERATION_SYNCHRONIZATION_POINT_TYPE: return createRegisterFederationSynchronizationPointType();
			case _2010Package.REGISTER_OBJECT_INSTANCE_TYPE: return createRegisterObjectInstanceType();
			case _2010Package.REGISTER_OBJECT_INSTANCE_WITH_REGIONS_TYPE: return createRegisterObjectInstanceWithRegionsType();
			case _2010Package.RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: return createReleaseMultipleObjectInstanceNamesType();
			case _2010Package.RELEASE_OBJECT_INSTANCE_NAME_TYPE: return createReleaseObjectInstanceNameType();
			case _2010Package.RELIABLE_TYPE: return createReliableType();
			case _2010Package.REMOVEOBJECTINSTANCE_TYPE: return createRemoveobjectinstanceType();
			case _2010Package.REPORT_ATTRIBUTE_TRANSPORTATION_TYPE_TYPE: return createReportAttributeTransportationTypeType();
			case _2010Package.REPORT_FEDERATION_EXECUTIONS_TYPE: return createReportFederationExecutionsType();
			case _2010Package.REPORT_INTERACTION_TRANSPORTATION_TYPE_TYPE: return createReportInteractionTransportationTypeType();
			case _2010Package.REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION_TYPE: return createRequestAttributeOwnershipAssumptionType();
			case _2010Package.REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE_TYPE: return createRequestAttributeOwnershipReleaseType();
			case _2010Package.REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE_TYPE: return createRequestAttributeTransportationTypeChangeType();
			case _2010Package.REQUEST_ATTRIBUTE_VALUE_UPDATE_TYPE: return createRequestAttributeValueUpdateType();
			case _2010Package.REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS_TYPE: return createRequestAttributeValueUpdateWithRegionsType();
			case _2010Package.REQUEST_DIVESTITURE_CONFIRMATION_TYPE: return createRequestDivestitureConfirmationType();
			case _2010Package.REQUEST_FEDERATION_RESTORE_TYPE: return createRequestFederationRestoreType();
			case _2010Package.REQUEST_FEDERATION_SAVE_TYPE: return createRequestFederationSaveType();
			case _2010Package.REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE_TYPE: return createRequestInteractionTransportationTypeChangeType();
			case _2010Package.REQUEST_RETRACTION_TYPE: return createRequestRetractionType();
			case _2010Package.RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES_TYPE: return createReserveMultipleObjectInstanceNamesType();
			case _2010Package.RESERVE_OBJECT_INSTANCE_NAME_TYPE: return createReserveObjectInstanceNameType();
			case _2010Package.RESIGN_FEDERATION_EXECUTION_TYPE: return createResignFederationExecutionType();
			case _2010Package.RESIGN_SWITCH_TYPE: return createResignSwitchType();
			case _2010Package.RETRACT_TYPE: return createRetractType();
			case _2010Package.SECURITY_CLASSIFICATION_TYPE: return createSecurityClassificationType();
			case _2010Package.SEND_INTERACTION_TYPE: return createSendInteractionType();
			case _2010Package.SEND_INTERACTION_WITH_REGIONS_TYPE: return createSendInteractionWithRegionsType();
			case _2010Package.SERVICE_UTILIZATION_TYPE: return createServiceUtilizationType();
			case _2010Package.SET_AUTOMATIC_RESIGN_DIRECTIVE_TYPE: return createSetAutomaticResignDirectiveType();
			case _2010Package.SET_RANGE_BOUNDS_TYPE: return createSetRangeBoundsType();
			case _2010Package.SHARING_TYPE: return createSharingType();
			case _2010Package.SIMPLE_DATA_TYPE: return createSimpleDataType();
			case _2010Package.SIMPLE_DATA_TYPE1: return createSimpleDataType1();
			case _2010Package.SIMPLE_DATA_TYPES_TYPE: return createSimpleDataTypesType();
			case _2010Package.SIZE: return createSize();
			case _2010Package.START_REGISTRATION_FOR_OBJECT_CLASS_TYPE: return createStartRegistrationForObjectClassType();
			case _2010Package.STOP_REGISTRATION_FOR_OBJECT_CLASS_TYPE: return createStopRegistrationForObjectClassType();
			case _2010Package.STRING: return createString();
			case _2010Package.SUBSCRIBE_INTERACTION_CLASS_TYPE: return createSubscribeInteractionClassType();
			case _2010Package.SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: return createSubscribeInteractionClassWithRegionsType();
			case _2010Package.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: return createSubscribeObjectClassAttributesType();
			case _2010Package.SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: return createSubscribeObjectClassAttributesWithRegionsType();
			case _2010Package.SWITCHES_TYPE: return createSwitchesType();
			case _2010Package.SWITCH_TYPE: return createSwitchType();
			case _2010Package.SYNCHRONIZATION_POINT_ACHIEVED_TYPE: return createSynchronizationPointAchievedType();
			case _2010Package.SYNCHRONIZATION_POINT_TYPE: return createSynchronizationPointType();
			case _2010Package.SYNCHRONIZATION_POINT_TYPE1: return createSynchronizationPointType1();
			case _2010Package.SYNCHRONIZATIONS_TYPE: return createSynchronizationsType();
			case _2010Package.TAGS_TYPE: return createTagsType();
			case _2010Package.TAG_TYPE: return createTagType();
			case _2010Package.TIME_ADVANCE_GRANT_TYPE: return createTimeAdvanceGrantType();
			case _2010Package.TIME_ADVANCE_REQUEST_AVAILABLE_TYPE: return createTimeAdvanceRequestAvailableType();
			case _2010Package.TIME_ADVANCE_REQUEST_TYPE: return createTimeAdvanceRequestType();
			case _2010Package.TIME_CONSTRAINED_ENABLED_TYPE: return createTimeConstrainedEnabledType();
			case _2010Package.TIME_REGULATION_ENABLED_TYPE: return createTimeRegulationEnabledType();
			case _2010Package.TIME_STAMP_TYPE: return createTimeStampType();
			case _2010Package.TIME_TYPE: return createTimeType();
			case _2010Package.TRANSPORTATIONS_TYPE: return createTransportationsType();
			case _2010Package.TRANSPORTATION_TYPE: return createTransportationType();
			case _2010Package.TRANSPORTATION_TYPE1: return createTransportationType1();
			case _2010Package.TURN_INTERACTIONS_OFF_TYPE: return createTurnInteractionsOffType();
			case _2010Package.TURN_INTERACTIONS_ON_TYPE: return createTurnInteractionsOnType();
			case _2010Package.TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE_TYPE: return createTurnUpdatesOffForObjectInstanceType();
			case _2010Package.TURN_UPDATES_ON_FOR_OBJECT_INSTANCE_TYPE: return createTurnUpdatesOnForObjectInstanceType();
			case _2010Package.TYPE_TYPE: return createTypeType();
			case _2010Package.UNASSOCIATE_REGIONS_FOR_UPDATES_TYPE: return createUnassociateRegionsForUpdatesType();
			case _2010Package.UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE_TYPE: return createUnconditionalAttributeOwnershipDivestitureType();
			case _2010Package.UNPUBLISH_INTERACTION_CLASS_TYPE: return createUnpublishInteractionClassType();
			case _2010Package.UNPUBLISH_OBJECT_CLASS_ATTRIBUTES_TYPE: return createUnpublishObjectClassAttributesType();
			case _2010Package.UNSUBSCRIBE_INTERACTION_CLASS_TYPE: return createUnsubscribeInteractionClassType();
			case _2010Package.UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS_TYPE: return createUnsubscribeInteractionClassWithRegionsType();
			case _2010Package.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_TYPE: return createUnsubscribeObjectClassAttributesType();
			case _2010Package.UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS_TYPE: return createUnsubscribeObjectClassAttributesWithRegionsType();
			case _2010Package.UPDATE_ATTRIBUTE_VALUES_TYPE: return createUpdateAttributeValuesType();
			case _2010Package.UPDATE_RATES_TYPE: return createUpdateRatesType();
			case _2010Package.UPDATE_RATE_TYPE: return createUpdateRateType();
			case _2010Package.UPDATE_TYPE: return createUpdateType();
			case _2010Package.UPPER_BOUND_TYPE: return createUpperBoundType();
			case _2010Package.VALUE_TYPE: return createValueType();
			case _2010Package.VARIANT_RECORD_DATA_TYPE: return createVariantRecordDataType();
			case _2010Package.VARIANT_RECORD_DATA_TYPE1: return createVariantRecordDataType1();
			case _2010Package.VARIANT_RECORD_DATA_TYPES_TYPE: return createVariantRecordDataTypesType();
			case _2010Package.VARIANT_RECORD_ENCODING_TYPE: return createVariantRecordEncodingType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case _2010Package.APPLICATION_DOMAIN_ENUMERATIONS:
				return createApplicationDomainEnumerationsFromString(eDataType, initialValue);
			case _2010Package.CAPABILITY_ENUMERATIONS:
				return createCapabilityEnumerationsFromString(eDataType, initialValue);
			case _2010Package.ENDIAN_ENUMERATIONS:
				return createEndianEnumerationsFromString(eDataType, initialValue);
			case _2010Package.FIXED_RECORD_ENCODING_ENUMERATION:
				return createFixedRecordEncodingEnumerationFromString(eDataType, initialValue);
			case _2010Package.GLYPH_TYPE_ENUMERATIONS:
				return createGlyphTypeEnumerationsFromString(eDataType, initialValue);
			case _2010Package.OM_TYPE_ENUMERATIONS:
				return createOMTypeEnumerationsFromString(eDataType, initialValue);
			case _2010Package.ORDER_ENUMERATIONS:
				return createOrderEnumerationsFromString(eDataType, initialValue);
			case _2010Package.OWNERSHIP_ENUMERATIONS:
				return createOwnershipEnumerationsFromString(eDataType, initialValue);
			case _2010Package.POC_TYPE_ENUMERATION:
				return createPOCTypeEnumerationFromString(eDataType, initialValue);
			case _2010Package.RELIABLE_ENUMERATIONS:
				return createReliableEnumerationsFromString(eDataType, initialValue);
			case _2010Package.RESIGN_ACTION_TYPE:
				return createResignActionTypeFromString(eDataType, initialValue);
			case _2010Package.SECURITY_CLASSIFICATION_ENUMERATION:
				return createSecurityClassificationEnumerationFromString(eDataType, initialValue);
			case _2010Package.SHARING_ENUMERATIONS:
				return createSharingEnumerationsFromString(eDataType, initialValue);
			case _2010Package.UPDATE_ENUMERATIONS:
				return createUpdateEnumerationsFromString(eDataType, initialValue);
			case _2010Package.VARIANT_RECORD_ENCODING_ENUMERATOR:
				return createVariantRecordEncodingEnumeratorFromString(eDataType, initialValue);
			case _2010Package.APPLICATION_DOMAIN_ENUMERATIONS_OBJECT:
				return createApplicationDomainEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.APPLICATION_DOMAIN_UNION:
				return createApplicationDomainUnionFromString(eDataType, initialValue);
			case _2010Package.ARRAY_DATATYPE_ENCODING_ENUM:
				return createArrayDatatypeEncodingEnumFromString(eDataType, initialValue);
			case _2010Package.ARRAY_DATATYPE_ENCODING_UNION:
				return createArrayDatatypeEncodingUnionFromString(eDataType, initialValue);
			case _2010Package.CAPABILITY_ENUMERATIONS_OBJECT:
				return createCapabilityEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.CARDINALITY_PATTERN:
				return createCardinalityPatternFromString(eDataType, initialValue);
			case _2010Package.DIMENSION_VALUE_PATTERN:
				return createDimensionValuePatternFromString(eDataType, initialValue);
			case _2010Package.ENDIAN_ENUMERATIONS_OBJECT:
				return createEndianEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.FIXED_RECORD_ENCODING_ENUMERATION_OBJECT:
				return createFixedRecordEncodingEnumerationObjectFromString(eDataType, initialValue);
			case _2010Package.FIXED_RECORD_ENCODING_UNION:
				return createFixedRecordEncodingUnionFromString(eDataType, initialValue);
			case _2010Package.GLYPH_TYPE_ENUMERATIONS_OBJECT:
				return createGlyphTypeEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.GLYPH_TYPE_UNION:
				return createGlyphTypeUnionFromString(eDataType, initialValue);
			case _2010Package.NON_EMPTY_STRING:
				return createNonEmptyStringFromString(eDataType, initialValue);
			case _2010Package.OM_TYPE_ENUMERATIONS_OBJECT:
				return createOMTypeEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.OM_TYPE_UNION:
				return createOMTypeUnionFromString(eDataType, initialValue);
			case _2010Package.ORDER_ENUMERATIONS_OBJECT:
				return createOrderEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.OWNERSHIP_ENUMERATIONS_OBJECT:
				return createOwnershipEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.POC_TYPE_ENUMERATION_OBJECT:
				return createPOCTypeEnumerationObjectFromString(eDataType, initialValue);
			case _2010Package.POC_TYPE_UNION:
				return createPOCTypeUnionFromString(eDataType, initialValue);
			case _2010Package.RELIABLE_ENUMERATIONS_OBJECT:
				return createReliableEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.RESIGN_ACTION_TYPE_OBJECT:
				return createResignActionTypeObjectFromString(eDataType, initialValue);
			case _2010Package.SECURITY_CLASSIFICATION_ENUMERATION_OBJECT:
				return createSecurityClassificationEnumerationObjectFromString(eDataType, initialValue);
			case _2010Package.SECURITY_CLASSIFICATION_UNION:
				return createSecurityClassificationUnionFromString(eDataType, initialValue);
			case _2010Package.SHARING_ENUMERATIONS_OBJECT:
				return createSharingEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.UPDATE_ENUMERATIONS_OBJECT:
				return createUpdateEnumerationsObjectFromString(eDataType, initialValue);
			case _2010Package.VARIANT_RECORD_ENCODING_ENUMERATOR_OBJECT:
				return createVariantRecordEncodingEnumeratorObjectFromString(eDataType, initialValue);
			case _2010Package.VARIANT_RECORD_ENCODING_UNION:
				return createVariantRecordEncodingUnionFromString(eDataType, initialValue);
			case _2010Package.VARIANT_RECORD_ENUMERATOR_PATTERN:
				return createVariantRecordEnumeratorPatternFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case _2010Package.APPLICATION_DOMAIN_ENUMERATIONS:
				return convertApplicationDomainEnumerationsToString(eDataType, instanceValue);
			case _2010Package.CAPABILITY_ENUMERATIONS:
				return convertCapabilityEnumerationsToString(eDataType, instanceValue);
			case _2010Package.ENDIAN_ENUMERATIONS:
				return convertEndianEnumerationsToString(eDataType, instanceValue);
			case _2010Package.FIXED_RECORD_ENCODING_ENUMERATION:
				return convertFixedRecordEncodingEnumerationToString(eDataType, instanceValue);
			case _2010Package.GLYPH_TYPE_ENUMERATIONS:
				return convertGlyphTypeEnumerationsToString(eDataType, instanceValue);
			case _2010Package.OM_TYPE_ENUMERATIONS:
				return convertOMTypeEnumerationsToString(eDataType, instanceValue);
			case _2010Package.ORDER_ENUMERATIONS:
				return convertOrderEnumerationsToString(eDataType, instanceValue);
			case _2010Package.OWNERSHIP_ENUMERATIONS:
				return convertOwnershipEnumerationsToString(eDataType, instanceValue);
			case _2010Package.POC_TYPE_ENUMERATION:
				return convertPOCTypeEnumerationToString(eDataType, instanceValue);
			case _2010Package.RELIABLE_ENUMERATIONS:
				return convertReliableEnumerationsToString(eDataType, instanceValue);
			case _2010Package.RESIGN_ACTION_TYPE:
				return convertResignActionTypeToString(eDataType, instanceValue);
			case _2010Package.SECURITY_CLASSIFICATION_ENUMERATION:
				return convertSecurityClassificationEnumerationToString(eDataType, instanceValue);
			case _2010Package.SHARING_ENUMERATIONS:
				return convertSharingEnumerationsToString(eDataType, instanceValue);
			case _2010Package.UPDATE_ENUMERATIONS:
				return convertUpdateEnumerationsToString(eDataType, instanceValue);
			case _2010Package.VARIANT_RECORD_ENCODING_ENUMERATOR:
				return convertVariantRecordEncodingEnumeratorToString(eDataType, instanceValue);
			case _2010Package.APPLICATION_DOMAIN_ENUMERATIONS_OBJECT:
				return convertApplicationDomainEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.APPLICATION_DOMAIN_UNION:
				return convertApplicationDomainUnionToString(eDataType, instanceValue);
			case _2010Package.ARRAY_DATATYPE_ENCODING_ENUM:
				return convertArrayDatatypeEncodingEnumToString(eDataType, instanceValue);
			case _2010Package.ARRAY_DATATYPE_ENCODING_UNION:
				return convertArrayDatatypeEncodingUnionToString(eDataType, instanceValue);
			case _2010Package.CAPABILITY_ENUMERATIONS_OBJECT:
				return convertCapabilityEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.CARDINALITY_PATTERN:
				return convertCardinalityPatternToString(eDataType, instanceValue);
			case _2010Package.DIMENSION_VALUE_PATTERN:
				return convertDimensionValuePatternToString(eDataType, instanceValue);
			case _2010Package.ENDIAN_ENUMERATIONS_OBJECT:
				return convertEndianEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.FIXED_RECORD_ENCODING_ENUMERATION_OBJECT:
				return convertFixedRecordEncodingEnumerationObjectToString(eDataType, instanceValue);
			case _2010Package.FIXED_RECORD_ENCODING_UNION:
				return convertFixedRecordEncodingUnionToString(eDataType, instanceValue);
			case _2010Package.GLYPH_TYPE_ENUMERATIONS_OBJECT:
				return convertGlyphTypeEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.GLYPH_TYPE_UNION:
				return convertGlyphTypeUnionToString(eDataType, instanceValue);
			case _2010Package.NON_EMPTY_STRING:
				return convertNonEmptyStringToString(eDataType, instanceValue);
			case _2010Package.OM_TYPE_ENUMERATIONS_OBJECT:
				return convertOMTypeEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.OM_TYPE_UNION:
				return convertOMTypeUnionToString(eDataType, instanceValue);
			case _2010Package.ORDER_ENUMERATIONS_OBJECT:
				return convertOrderEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.OWNERSHIP_ENUMERATIONS_OBJECT:
				return convertOwnershipEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.POC_TYPE_ENUMERATION_OBJECT:
				return convertPOCTypeEnumerationObjectToString(eDataType, instanceValue);
			case _2010Package.POC_TYPE_UNION:
				return convertPOCTypeUnionToString(eDataType, instanceValue);
			case _2010Package.RELIABLE_ENUMERATIONS_OBJECT:
				return convertReliableEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.RESIGN_ACTION_TYPE_OBJECT:
				return convertResignActionTypeObjectToString(eDataType, instanceValue);
			case _2010Package.SECURITY_CLASSIFICATION_ENUMERATION_OBJECT:
				return convertSecurityClassificationEnumerationObjectToString(eDataType, instanceValue);
			case _2010Package.SECURITY_CLASSIFICATION_UNION:
				return convertSecurityClassificationUnionToString(eDataType, instanceValue);
			case _2010Package.SHARING_ENUMERATIONS_OBJECT:
				return convertSharingEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.UPDATE_ENUMERATIONS_OBJECT:
				return convertUpdateEnumerationsObjectToString(eDataType, instanceValue);
			case _2010Package.VARIANT_RECORD_ENCODING_ENUMERATOR_OBJECT:
				return convertVariantRecordEncodingEnumeratorObjectToString(eDataType, instanceValue);
			case _2010Package.VARIANT_RECORD_ENCODING_UNION:
				return convertVariantRecordEncodingUnionToString(eDataType, instanceValue);
			case _2010Package.VARIANT_RECORD_ENUMERATOR_PATTERN:
				return convertVariantRecordEnumeratorPatternToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationRestoreType createAbortFederationRestoreType() {
		AbortFederationRestoreTypeImpl abortFederationRestoreType = new AbortFederationRestoreTypeImpl();
		return abortFederationRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationSaveType createAbortFederationSaveType() {
		AbortFederationSaveTypeImpl abortFederationSaveType = new AbortFederationSaveTypeImpl();
		return abortFederationSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AlternativeType createAlternativeType() {
		AlternativeTypeImpl alternativeType = new AlternativeTypeImpl();
		return alternativeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnounceSynchronizationPointType createAnnounceSynchronizationPointType() {
		AnnounceSynchronizationPointTypeImpl announceSynchronizationPointType = new AnnounceSynchronizationPointTypeImpl();
		return announceSynchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainType createApplicationDomainType() {
		ApplicationDomainTypeImpl applicationDomainType = new ApplicationDomainTypeImpl();
		return applicationDomainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataType createArrayDataType() {
		ArrayDataTypeImpl arrayDataType = new ArrayDataTypeImpl();
		return arrayDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataType1 createArrayDataType1() {
		ArrayDataType1Impl arrayDataType1 = new ArrayDataType1Impl();
		return arrayDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDatatypeEncodingType createArrayDatatypeEncodingType() {
		ArrayDatatypeEncodingTypeImpl arrayDatatypeEncodingType = new ArrayDatatypeEncodingTypeImpl();
		return arrayDatatypeEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataTypesType createArrayDataTypesType() {
		ArrayDataTypesTypeImpl arrayDataTypesType = new ArrayDataTypesTypeImpl();
		return arrayDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArrayDataTypesType1 createArrayDataTypesType1() {
		ArrayDataTypesType1Impl arrayDataTypesType1 = new ArrayDataTypesType1Impl();
		return arrayDataTypesType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociateRegionsForUpdatesType createAssociateRegionsForUpdatesType() {
		AssociateRegionsForUpdatesTypeImpl associateRegionsForUpdatesType = new AssociateRegionsForUpdatesTypeImpl();
		return associateRegionsForUpdatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionIfAvailableType createAttributeOwnershipAcquisitionIfAvailableType() {
		AttributeOwnershipAcquisitionIfAvailableTypeImpl attributeOwnershipAcquisitionIfAvailableType = new AttributeOwnershipAcquisitionIfAvailableTypeImpl();
		return attributeOwnershipAcquisitionIfAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionNotificationType createAttributeOwnershipAcquisitionNotificationType() {
		AttributeOwnershipAcquisitionNotificationTypeImpl attributeOwnershipAcquisitionNotificationType = new AttributeOwnershipAcquisitionNotificationTypeImpl();
		return attributeOwnershipAcquisitionNotificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionType createAttributeOwnershipAcquisitionType() {
		AttributeOwnershipAcquisitionTypeImpl attributeOwnershipAcquisitionType = new AttributeOwnershipAcquisitionTypeImpl();
		return attributeOwnershipAcquisitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipDivestitureIfWantedType createAttributeOwnershipDivestitureIfWantedType() {
		AttributeOwnershipDivestitureIfWantedTypeImpl attributeOwnershipDivestitureIfWantedType = new AttributeOwnershipDivestitureIfWantedTypeImpl();
		return attributeOwnershipDivestitureIfWantedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipReleaseDeniedType createAttributeOwnershipReleaseDeniedType() {
		AttributeOwnershipReleaseDeniedTypeImpl attributeOwnershipReleaseDeniedType = new AttributeOwnershipReleaseDeniedTypeImpl();
		return attributeOwnershipReleaseDeniedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipUnavailableType createAttributeOwnershipUnavailableType() {
		AttributeOwnershipUnavailableTypeImpl attributeOwnershipUnavailableType = new AttributeOwnershipUnavailableTypeImpl();
		return attributeOwnershipUnavailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesInScopeType createAttributesInScopeType() {
		AttributesInScopeTypeImpl attributesInScopeType = new AttributesInScopeTypeImpl();
		return attributesInScopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesOutOfScopeType createAttributesOutOfScopeType() {
		AttributesOutOfScopeTypeImpl attributesOutOfScopeType = new AttributesOutOfScopeTypeImpl();
		return attributesOutOfScopeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType createAttributeType() {
		AttributeTypeImpl attributeType = new AttributeTypeImpl();
		return attributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeType1 createAttributeType1() {
		AttributeType1Impl attributeType1 = new AttributeType1Impl();
		return attributeType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataRepresentationsType createBasicDataRepresentationsType() {
		BasicDataRepresentationsTypeImpl basicDataRepresentationsType = new BasicDataRepresentationsTypeImpl();
		return basicDataRepresentationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType createBasicDataType() {
		BasicDataTypeImpl basicDataType = new BasicDataTypeImpl();
		return basicDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasicDataType1 createBasicDataType1() {
		BasicDataType1Impl basicDataType1 = new BasicDataType1Impl();
		return basicDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelAttributeOwnershipAcquisitionType createCancelAttributeOwnershipAcquisitionType() {
		CancelAttributeOwnershipAcquisitionTypeImpl cancelAttributeOwnershipAcquisitionType = new CancelAttributeOwnershipAcquisitionTypeImpl();
		return cancelAttributeOwnershipAcquisitionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelNegotiatedAttributeOwnershipDivestitureType createCancelNegotiatedAttributeOwnershipDivestitureType() {
		CancelNegotiatedAttributeOwnershipDivestitureTypeImpl cancelNegotiatedAttributeOwnershipDivestitureType = new CancelNegotiatedAttributeOwnershipDivestitureTypeImpl();
		return cancelNegotiatedAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityType createCapabilityType() {
		CapabilityTypeImpl capabilityType = new CapabilityTypeImpl();
		return capabilityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CardinalityType createCardinalityType() {
		CardinalityTypeImpl cardinalityType = new CardinalityTypeImpl();
		return cardinalityType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeOrderTypeType createChangeAttributeOrderTypeType() {
		ChangeAttributeOrderTypeTypeImpl changeAttributeOrderTypeType = new ChangeAttributeOrderTypeTypeImpl();
		return changeAttributeOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInteractionOrderTypeType createChangeInteractionOrderTypeType() {
		ChangeInteractionOrderTypeTypeImpl changeInteractionOrderTypeType = new ChangeInteractionOrderTypeTypeImpl();
		return changeInteractionOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitRegionModificationsType createCommitRegionModificationsType() {
		CommitRegionModificationsTypeImpl commitRegionModificationsType = new CommitRegionModificationsTypeImpl();
		return commitRegionModificationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeOwnershipAcquisitionCancellationType createConfirmAttributeOwnershipAcquisitionCancellationType() {
		ConfirmAttributeOwnershipAcquisitionCancellationTypeImpl confirmAttributeOwnershipAcquisitionCancellationType = new ConfirmAttributeOwnershipAcquisitionCancellationTypeImpl();
		return confirmAttributeOwnershipAcquisitionCancellationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeTransportationTypeChangeType createConfirmAttributeTransportationTypeChangeType() {
		ConfirmAttributeTransportationTypeChangeTypeImpl confirmAttributeTransportationTypeChangeType = new ConfirmAttributeTransportationTypeChangeTypeImpl();
		return confirmAttributeTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmDivestitureType createConfirmDivestitureType() {
		ConfirmDivestitureTypeImpl confirmDivestitureType = new ConfirmDivestitureTypeImpl();
		return confirmDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmFederationRestorationRequestType createConfirmFederationRestorationRequestType() {
		ConfirmFederationRestorationRequestTypeImpl confirmFederationRestorationRequestType = new ConfirmFederationRestorationRequestTypeImpl();
		return confirmFederationRestorationRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmInteractionTransportationTypeChangeType createConfirmInteractionTransportationTypeChangeType() {
		ConfirmInteractionTransportationTypeChangeTypeImpl confirmInteractionTransportationTypeChangeType = new ConfirmInteractionTransportationTypeChangeTypeImpl();
		return confirmInteractionTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmSynchronizationPointRegistrationType createConfirmSynchronizationPointRegistrationType() {
		ConfirmSynchronizationPointRegistrationTypeImpl confirmSynchronizationPointRegistrationType = new ConfirmSynchronizationPointRegistrationTypeImpl();
		return confirmSynchronizationPointRegistrationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLostType createConnectionLostType() {
		ConnectionLostTypeImpl connectionLostType = new ConnectionLostTypeImpl();
		return connectionLostType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectType createConnectType() {
		ConnectTypeImpl connectType = new ConnectTypeImpl();
		return connectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateFederationExecutionType createCreateFederationExecutionType() {
		CreateFederationExecutionTypeImpl createFederationExecutionType = new CreateFederationExecutionTypeImpl();
		return createFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateRegionType createCreateRegionType() {
		CreateRegionTypeImpl createRegionType = new CreateRegionTypeImpl();
		return createRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataTypesType createDataTypesType() {
		DataTypesTypeImpl dataTypesType = new DataTypesTypeImpl();
		return dataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteObjectInstanceType createDeleteObjectInstanceType() {
		DeleteObjectInstanceTypeImpl deleteObjectInstanceType = new DeleteObjectInstanceTypeImpl();
		return deleteObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRegionType createDeleteRegionType() {
		DeleteRegionTypeImpl deleteRegionType = new DeleteRegionTypeImpl();
		return deleteRegionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyFederationExecutionType createDestroyFederationExecutionType() {
		DestroyFederationExecutionTypeImpl destroyFederationExecutionType = new DestroyFederationExecutionTypeImpl();
		return destroyFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType createDimensionsType() {
		DimensionsTypeImpl dimensionsType = new DimensionsTypeImpl();
		return dimensionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType1 createDimensionsType1() {
		DimensionsType1Impl dimensionsType1 = new DimensionsType1Impl();
		return dimensionsType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionsType2 createDimensionsType2() {
		DimensionsType2Impl dimensionsType2 = new DimensionsType2Impl();
		return dimensionsType2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType createDimensionType() {
		DimensionTypeImpl dimensionType = new DimensionTypeImpl();
		return dimensionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DimensionType1 createDimensionType1() {
		DimensionType1Impl dimensionType1 = new DimensionType1Impl();
		return dimensionType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAsynchronousDeliveryType createDisableAsynchronousDeliveryType() {
		DisableAsynchronousDeliveryTypeImpl disableAsynchronousDeliveryType = new DisableAsynchronousDeliveryTypeImpl();
		return disableAsynchronousDeliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeRelevanceAdvisorySwitchType createDisableAttributeRelevanceAdvisorySwitchType() {
		DisableAttributeRelevanceAdvisorySwitchTypeImpl disableAttributeRelevanceAdvisorySwitchType = new DisableAttributeRelevanceAdvisorySwitchTypeImpl();
		return disableAttributeRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeScopeAdvisorySwitchType createDisableAttributeScopeAdvisorySwitchType() {
		DisableAttributeScopeAdvisorySwitchTypeImpl disableAttributeScopeAdvisorySwitchType = new DisableAttributeScopeAdvisorySwitchTypeImpl();
		return disableAttributeScopeAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableCallbacksType createDisableCallbacksType() {
		DisableCallbacksTypeImpl disableCallbacksType = new DisableCallbacksTypeImpl();
		return disableCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableInteractionRelevanceAdvisorySwitchType createDisableInteractionRelevanceAdvisorySwitchType() {
		DisableInteractionRelevanceAdvisorySwitchTypeImpl disableInteractionRelevanceAdvisorySwitchType = new DisableInteractionRelevanceAdvisorySwitchTypeImpl();
		return disableInteractionRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableObjectClassRelevanceAdvisorySwitchType createDisableObjectClassRelevanceAdvisorySwitchType() {
		DisableObjectClassRelevanceAdvisorySwitchTypeImpl disableObjectClassRelevanceAdvisorySwitchType = new DisableObjectClassRelevanceAdvisorySwitchTypeImpl();
		return disableObjectClassRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeConstrainedType createDisableTimeConstrainedType() {
		DisableTimeConstrainedTypeImpl disableTimeConstrainedType = new DisableTimeConstrainedTypeImpl();
		return disableTimeConstrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeRegulationType createDisableTimeRegulationType() {
		DisableTimeRegulationTypeImpl disableTimeRegulationType = new DisableTimeRegulationTypeImpl();
		return disableTimeRegulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectType createDisconnectType() {
		DisconnectTypeImpl disconnectType = new DisconnectTypeImpl();
		return disconnectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverObjectInstanceType createDiscoverObjectInstanceType() {
		DiscoverObjectInstanceTypeImpl discoverObjectInstanceType = new DiscoverObjectInstanceTypeImpl();
		return discoverObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAsynchronousDeliveryType createEnableAsynchronousDeliveryType() {
		EnableAsynchronousDeliveryTypeImpl enableAsynchronousDeliveryType = new EnableAsynchronousDeliveryTypeImpl();
		return enableAsynchronousDeliveryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeRelevanceAdvisorySwitchType createEnableAttributeRelevanceAdvisorySwitchType() {
		EnableAttributeRelevanceAdvisorySwitchTypeImpl enableAttributeRelevanceAdvisorySwitchType = new EnableAttributeRelevanceAdvisorySwitchTypeImpl();
		return enableAttributeRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeScopeAdvisorySwitchType createEnableAttributeScopeAdvisorySwitchType() {
		EnableAttributeScopeAdvisorySwitchTypeImpl enableAttributeScopeAdvisorySwitchType = new EnableAttributeScopeAdvisorySwitchTypeImpl();
		return enableAttributeScopeAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCallbacksType createEnableCallbacksType() {
		EnableCallbacksTypeImpl enableCallbacksType = new EnableCallbacksTypeImpl();
		return enableCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableInteractionRelevanceAdvisorySwitchType createEnableInteractionRelevanceAdvisorySwitchType() {
		EnableInteractionRelevanceAdvisorySwitchTypeImpl enableInteractionRelevanceAdvisorySwitchType = new EnableInteractionRelevanceAdvisorySwitchTypeImpl();
		return enableInteractionRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableObjectClassRelevanceAdvisorySwitchType createEnableObjectClassRelevanceAdvisorySwitchType() {
		EnableObjectClassRelevanceAdvisorySwitchTypeImpl enableObjectClassRelevanceAdvisorySwitchType = new EnableObjectClassRelevanceAdvisorySwitchTypeImpl();
		return enableObjectClassRelevanceAdvisorySwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeConstrainedType createEnableTimeConstrainedType() {
		EnableTimeConstrainedTypeImpl enableTimeConstrainedType = new EnableTimeConstrainedTypeImpl();
		return enableTimeConstrainedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeRegulationType createEnableTimeRegulationType() {
		EnableTimeRegulationTypeImpl enableTimeRegulationType = new EnableTimeRegulationTypeImpl();
		return enableTimeRegulationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianType createEndianType() {
		EndianTypeImpl endianType = new EndianTypeImpl();
		return endianType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataType createEnumeratedDataType() {
		EnumeratedDataTypeImpl enumeratedDataType = new EnumeratedDataTypeImpl();
		return enumeratedDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataType1 createEnumeratedDataType1() {
		EnumeratedDataType1Impl enumeratedDataType1 = new EnumeratedDataType1Impl();
		return enumeratedDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratedDataTypesType createEnumeratedDataTypesType() {
		EnumeratedDataTypesTypeImpl enumeratedDataTypesType = new EnumeratedDataTypesTypeImpl();
		return enumeratedDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnumeratorType createEnumeratorType() {
		EnumeratorTypeImpl enumeratorType = new EnumeratorTypeImpl();
		return enumeratorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeCallbackType createEvokeCallbackType() {
		EvokeCallbackTypeImpl evokeCallbackType = new EvokeCallbackTypeImpl();
		return evokeCallbackType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeMultipleCallbacksType createEvokeMultipleCallbacksType() {
		EvokeMultipleCallbacksTypeImpl evokeMultipleCallbacksType = new EvokeMultipleCallbacksTypeImpl();
		return evokeMultipleCallbacksType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateRestoreCompleteType createFederateRestoreCompleteType() {
		FederateRestoreCompleteTypeImpl federateRestoreCompleteType = new FederateRestoreCompleteTypeImpl();
		return federateRestoreCompleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveBegunType createFederateSaveBegunType() {
		FederateSaveBegunTypeImpl federateSaveBegunType = new FederateSaveBegunTypeImpl();
		return federateSaveBegunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveCompleteType createFederateSaveCompleteType() {
		FederateSaveCompleteTypeImpl federateSaveCompleteType = new FederateSaveCompleteTypeImpl();
		return federateSaveCompleteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreBegunType createFederationRestoreBegunType() {
		FederationRestoreBegunTypeImpl federationRestoreBegunType = new FederationRestoreBegunTypeImpl();
		return federationRestoreBegunType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoredType createFederationRestoredType() {
		FederationRestoredTypeImpl federationRestoredType = new FederationRestoredTypeImpl();
		return federationRestoredType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreStatusResponseType createFederationRestoreStatusResponseType() {
		FederationRestoreStatusResponseTypeImpl federationRestoreStatusResponseType = new FederationRestoreStatusResponseTypeImpl();
		return federationRestoreStatusResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSavedType createFederationSavedType() {
		FederationSavedTypeImpl federationSavedType = new FederationSavedTypeImpl();
		return federationSavedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSaveStatusResponseType createFederationSaveStatusResponseType() {
		FederationSaveStatusResponseTypeImpl federationSaveStatusResponseType = new FederationSaveStatusResponseTypeImpl();
		return federationSaveStatusResponseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSynchronizedType createFederationSynchronizedType() {
		FederationSynchronizedTypeImpl federationSynchronizedType = new FederationSynchronizedTypeImpl();
		return federationSynchronizedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FieldType createFieldType() {
		FieldTypeImpl fieldType = new FieldTypeImpl();
		return fieldType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataType createFixedRecordDataType() {
		FixedRecordDataTypeImpl fixedRecordDataType = new FixedRecordDataTypeImpl();
		return fixedRecordDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataType1 createFixedRecordDataType1() {
		FixedRecordDataType1Impl fixedRecordDataType1 = new FixedRecordDataType1Impl();
		return fixedRecordDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordDataTypesType createFixedRecordDataTypesType() {
		FixedRecordDataTypesTypeImpl fixedRecordDataTypesType = new FixedRecordDataTypesTypeImpl();
		return fixedRecordDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingType createFixedRecordEncodingType() {
		FixedRecordEncodingTypeImpl fixedRecordEncodingType = new FixedRecordEncodingTypeImpl();
		return fixedRecordEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushQueueRequestType createFlushQueueRequestType() {
		FlushQueueRequestTypeImpl flushQueueRequestType = new FlushQueueRequestTypeImpl();
		return flushQueueRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeHandleType createGetAttributeHandleType() {
		GetAttributeHandleTypeImpl getAttributeHandleType = new GetAttributeHandleTypeImpl();
		return getAttributeHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeNameType createGetAttributeNameType() {
		GetAttributeNameTypeImpl getAttributeNameType = new GetAttributeNameTypeImpl();
		return getAttributeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAutomaticResignDirectiveType createGetAutomaticResignDirectiveType() {
		GetAutomaticResignDirectiveTypeImpl getAutomaticResignDirectiveType = new GetAutomaticResignDirectiveTypeImpl();
		return getAutomaticResignDirectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForClassAttributeType createGetAvailableDimensionsForClassAttributeType() {
		GetAvailableDimensionsForClassAttributeTypeImpl getAvailableDimensionsForClassAttributeType = new GetAvailableDimensionsForClassAttributeTypeImpl();
		return getAvailableDimensionsForClassAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForInteractionClassType createGetAvailableDimensionsForInteractionClassType() {
		GetAvailableDimensionsForInteractionClassTypeImpl getAvailableDimensionsForInteractionClassType = new GetAvailableDimensionsForInteractionClassTypeImpl();
		return getAvailableDimensionsForInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleSetType createGetDimensionHandleSetType() {
		GetDimensionHandleSetTypeImpl getDimensionHandleSetType = new GetDimensionHandleSetTypeImpl();
		return getDimensionHandleSetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleType createGetDimensionHandleType() {
		GetDimensionHandleTypeImpl getDimensionHandleType = new GetDimensionHandleTypeImpl();
		return getDimensionHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionNameType createGetDimensionNameType() {
		GetDimensionNameTypeImpl getDimensionNameType = new GetDimensionNameTypeImpl();
		return getDimensionNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionUpperBoundType createGetDimensionUpperBoundType() {
		GetDimensionUpperBoundTypeImpl getDimensionUpperBoundType = new GetDimensionUpperBoundTypeImpl();
		return getDimensionUpperBoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateHandleType createGetFederateHandleType() {
		GetFederateHandleTypeImpl getFederateHandleType = new GetFederateHandleTypeImpl();
		return getFederateHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateNameType createGetFederateNameType() {
		GetFederateNameTypeImpl getFederateNameType = new GetFederateNameTypeImpl();
		return getFederateNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassHandleType createGetInteractionClassHandleType() {
		GetInteractionClassHandleTypeImpl getInteractionClassHandleType = new GetInteractionClassHandleTypeImpl();
		return getInteractionClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassNameType createGetInteractionClassNameType() {
		GetInteractionClassNameTypeImpl getInteractionClassNameType = new GetInteractionClassNameTypeImpl();
		return getInteractionClassNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetKnownObjectClassHandleType createGetKnownObjectClassHandleType() {
		GetKnownObjectClassHandleTypeImpl getKnownObjectClassHandleType = new GetKnownObjectClassHandleTypeImpl();
		return getKnownObjectClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassHandleType createGetObjectClassHandleType() {
		GetObjectClassHandleTypeImpl getObjectClassHandleType = new GetObjectClassHandleTypeImpl();
		return getObjectClassHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassNameType createGetObjectClassNameType() {
		GetObjectClassNameTypeImpl getObjectClassNameType = new GetObjectClassNameTypeImpl();
		return getObjectClassNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceHandleType createGetObjectInstanceHandleType() {
		GetObjectInstanceHandleTypeImpl getObjectInstanceHandleType = new GetObjectInstanceHandleTypeImpl();
		return getObjectInstanceHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceNameType createGetObjectInstanceNameType() {
		GetObjectInstanceNameTypeImpl getObjectInstanceNameType = new GetObjectInstanceNameTypeImpl();
		return getObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderNameType createGetOrderNameType() {
		GetOrderNameTypeImpl getOrderNameType = new GetOrderNameTypeImpl();
		return getOrderNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderTypeType createGetOrderTypeType() {
		GetOrderTypeTypeImpl getOrderTypeType = new GetOrderTypeTypeImpl();
		return getOrderTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterHandleType createGetParameterHandleType() {
		GetParameterHandleTypeImpl getParameterHandleType = new GetParameterHandleTypeImpl();
		return getParameterHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterNameType createGetParameterNameType() {
		GetParameterNameTypeImpl getParameterNameType = new GetParameterNameTypeImpl();
		return getParameterNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRangeBoundsType createGetRangeBoundsType() {
		GetRangeBoundsTypeImpl getRangeBoundsType = new GetRangeBoundsTypeImpl();
		return getRangeBoundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeHandleType createGetTransportationTypeHandleType() {
		GetTransportationTypeHandleTypeImpl getTransportationTypeHandleType = new GetTransportationTypeHandleTypeImpl();
		return getTransportationTypeHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeNameType createGetTransportationTypeNameType() {
		GetTransportationTypeNameTypeImpl getTransportationTypeNameType = new GetTransportationTypeNameTypeImpl();
		return getTransportationTypeNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueForAttributeType createGetUpdateRateValueForAttributeType() {
		GetUpdateRateValueForAttributeTypeImpl getUpdateRateValueForAttributeType = new GetUpdateRateValueForAttributeTypeImpl();
		return getUpdateRateValueForAttributeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueType createGetUpdateRateValueType() {
		GetUpdateRateValueTypeImpl getUpdateRateValueType = new GetUpdateRateValueTypeImpl();
		return getUpdateRateValueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphType createGlyphType() {
		GlyphTypeImpl glyphType = new GlyphTypeImpl();
		return glyphType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphType1 createGlyphType1() {
		GlyphType1Impl glyphType1 = new GlyphType1Impl();
		return glyphType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentificationType createIdentificationType() {
		IdentificationTypeImpl identificationType = new IdentificationTypeImpl();
		return identificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifierType createIdentifierType() {
		IdentifierTypeImpl identifierType = new IdentifierTypeImpl();
		return identifierType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdReferenceType createIdReferenceType() {
		IdReferenceTypeImpl idReferenceType = new IdReferenceTypeImpl();
		return idReferenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformAttributeOwnershipType createInformAttributeOwnershipType() {
		InformAttributeOwnershipTypeImpl informAttributeOwnershipType = new InformAttributeOwnershipTypeImpl();
		return informAttributeOwnershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateRestoreType createInitiateFederateRestoreType() {
		InitiateFederateRestoreTypeImpl initiateFederateRestoreType = new InitiateFederateRestoreTypeImpl();
		return initiateFederateRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateSaveType createInitiateFederateSaveType() {
		InitiateFederateSaveTypeImpl initiateFederateSaveType = new InitiateFederateSaveTypeImpl();
		return initiateFederateSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionClassType createInteractionClassType() {
		InteractionClassTypeImpl interactionClassType = new InteractionClassTypeImpl();
		return interactionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionClassType1 createInteractionClassType1() {
		InteractionClassType1Impl interactionClassType1 = new InteractionClassType1Impl();
		return interactionClassType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InteractionsType createInteractionsType() {
		InteractionsTypeImpl interactionsType = new InteractionsTypeImpl();
		return interactionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttributeOwnedByFederateType createIsAttributeOwnedByFederateType() {
		IsAttributeOwnedByFederateTypeImpl isAttributeOwnedByFederateType = new IsAttributeOwnedByFederateTypeImpl();
		return isAttributeOwnedByFederateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinFederationExecutionType createJoinFederationExecutionType() {
		JoinFederationExecutionTypeImpl joinFederationExecutionType = new JoinFederationExecutionTypeImpl();
		return joinFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordType createKeywordType() {
		KeywordTypeImpl keywordType = new KeywordTypeImpl();
		return keywordType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFederationExecutionsType createListFederationExecutionsType() {
		ListFederationExecutionsTypeImpl listFederationExecutionsType = new ListFederationExecutionsTypeImpl();
		return listFederationExecutionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeleteObjectInstanceType createLocalDeleteObjectInstanceType() {
		LocalDeleteObjectInstanceTypeImpl localDeleteObjectInstanceType = new LocalDeleteObjectInstanceTypeImpl();
		return localDeleteObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LookaheadType createLookaheadType() {
		LookaheadTypeImpl lookaheadType = new LookaheadTypeImpl();
		return lookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelIdentificationType createModelIdentificationType() {
		ModelIdentificationTypeImpl modelIdentificationType = new ModelIdentificationTypeImpl();
		return modelIdentificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelType createModelType() {
		ModelTypeImpl modelType = new ModelTypeImpl();
		return modelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModificationDateType createModificationDateType() {
		ModificationDateTypeImpl modificationDateType = new ModificationDateTypeImpl();
		return modificationDateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyLookaheadType createModifyLookaheadType() {
		ModifyLookaheadTypeImpl modifyLookaheadType = new ModifyLookaheadTypeImpl();
		return modifyLookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleObjectInstanceNamesReservedType createMultipleObjectInstanceNamesReservedType() {
		MultipleObjectInstanceNamesReservedTypeImpl multipleObjectInstanceNamesReservedType = new MultipleObjectInstanceNamesReservedTypeImpl();
		return multipleObjectInstanceNamesReservedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiatedAttributeOwnershipDivestitureType createNegotiatedAttributeOwnershipDivestitureType() {
		NegotiatedAttributeOwnershipDivestitureTypeImpl negotiatedAttributeOwnershipDivestitureType = new NegotiatedAttributeOwnershipDivestitureTypeImpl();
		return negotiatedAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestAvailableType createNextMessageRequestAvailableType() {
		NextMessageRequestAvailableTypeImpl nextMessageRequestAvailableType = new NextMessageRequestAvailableTypeImpl();
		return nextMessageRequestAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestType createNextMessageRequestType() {
		NextMessageRequestTypeImpl nextMessageRequestType = new NextMessageRequestTypeImpl();
		return nextMessageRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonEmptyString1 createNonEmptyString1() {
		NonEmptyString1Impl nonEmptyString1 = new NonEmptyString1Impl();
		return nonEmptyString1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeFederateHandleType createNormalizeFederateHandleType() {
		NormalizeFederateHandleTypeImpl normalizeFederateHandleType = new NormalizeFederateHandleTypeImpl();
		return normalizeFederateHandleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeServiceGroupType createNormalizeServiceGroupType() {
		NormalizeServiceGroupTypeImpl normalizeServiceGroupType = new NormalizeServiceGroupTypeImpl();
		return normalizeServiceGroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotesType createNotesType() {
		NotesTypeImpl notesType = new NotesTypeImpl();
		return notesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType createObjectClassType() {
		ObjectClassTypeImpl objectClassType = new ObjectClassTypeImpl();
		return objectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectClassType1 createObjectClassType1() {
		ObjectClassType1Impl objectClassType1 = new ObjectClassType1Impl();
		return objectClassType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstanceNameReservedType createObjectInstanceNameReservedType() {
		ObjectInstanceNameReservedTypeImpl objectInstanceNameReservedType = new ObjectInstanceNameReservedTypeImpl();
		return objectInstanceNameReservedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectModelType createObjectModelType() {
		ObjectModelTypeImpl objectModelType = new ObjectModelTypeImpl();
		return objectModelType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectsType createObjectsType() {
		ObjectsTypeImpl objectsType = new ObjectsTypeImpl();
		return objectsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderType createOrderType() {
		OrderTypeImpl orderType = new OrderTypeImpl();
		return orderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipType createOwnershipType() {
		OwnershipTypeImpl ownershipType = new OwnershipTypeImpl();
		return ownershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType1 createParameterType1() {
		ParameterType1Impl parameterType1 = new ParameterType1Impl();
		return parameterType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocType createPocType() {
		PocTypeImpl pocType = new PocTypeImpl();
		return pocType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocType1 createPocType1() {
		PocType1Impl pocType1 = new PocType1Impl();
		return pocType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PocTypeType createPocTypeType() {
		PocTypeTypeImpl pocTypeType = new PocTypeTypeImpl();
		return pocTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvideAttributeValueUpdateType createProvideAttributeValueUpdateType() {
		ProvideAttributeValueUpdateTypeImpl provideAttributeValueUpdateType = new ProvideAttributeValueUpdateTypeImpl();
		return provideAttributeValueUpdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishInteractionClassType createPublishInteractionClassType() {
		PublishInteractionClassTypeImpl publishInteractionClassType = new PublishInteractionClassTypeImpl();
		return publishInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishObjectClassAttributesType createPublishObjectClassAttributesType() {
		PublishObjectClassAttributesTypeImpl publishObjectClassAttributesType = new PublishObjectClassAttributesTypeImpl();
		return publishObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeOwnershipType createQueryAttributeOwnershipType() {
		QueryAttributeOwnershipTypeImpl queryAttributeOwnershipType = new QueryAttributeOwnershipTypeImpl();
		return queryAttributeOwnershipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeTransportationTypeType createQueryAttributeTransportationTypeType() {
		QueryAttributeTransportationTypeTypeImpl queryAttributeTransportationTypeType = new QueryAttributeTransportationTypeTypeImpl();
		return queryAttributeTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationRestoreStatusType createQueryFederationRestoreStatusType() {
		QueryFederationRestoreStatusTypeImpl queryFederationRestoreStatusType = new QueryFederationRestoreStatusTypeImpl();
		return queryFederationRestoreStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationSaveStatusType createQueryFederationSaveStatusType() {
		QueryFederationSaveStatusTypeImpl queryFederationSaveStatusType = new QueryFederationSaveStatusTypeImpl();
		return queryFederationSaveStatusType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGALTType createQueryGALTType() {
		QueryGALTTypeImpl queryGALTType = new QueryGALTTypeImpl();
		return queryGALTType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInteractionTransportationTypeType createQueryInteractionTransportationTypeType() {
		QueryInteractionTransportationTypeTypeImpl queryInteractionTransportationTypeType = new QueryInteractionTransportationTypeTypeImpl();
		return queryInteractionTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLITSType createQueryLITSType() {
		QueryLITSTypeImpl queryLITSType = new QueryLITSTypeImpl();
		return queryLITSType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLogicalTimeType createQueryLogicalTimeType() {
		QueryLogicalTimeTypeImpl queryLogicalTimeType = new QueryLogicalTimeTypeImpl();
		return queryLogicalTimeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLookaheadType createQueryLookaheadType() {
		QueryLookaheadTypeImpl queryLookaheadType = new QueryLookaheadTypeImpl();
		return queryLookaheadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateType createRateType() {
		RateTypeImpl rateType = new RateTypeImpl();
		return rateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteractionType createReceiveInteractionType() {
		ReceiveInteractionTypeImpl receiveInteractionType = new ReceiveInteractionTypeImpl();
		return receiveInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectAttributeValuesType createReflectAttributeValuesType() {
		ReflectAttributeValuesTypeImpl reflectAttributeValuesType = new ReflectAttributeValuesTypeImpl();
		return reflectAttributeValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFederationSynchronizationPointType createRegisterFederationSynchronizationPointType() {
		RegisterFederationSynchronizationPointTypeImpl registerFederationSynchronizationPointType = new RegisterFederationSynchronizationPointTypeImpl();
		return registerFederationSynchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceType createRegisterObjectInstanceType() {
		RegisterObjectInstanceTypeImpl registerObjectInstanceType = new RegisterObjectInstanceTypeImpl();
		return registerObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceWithRegionsType createRegisterObjectInstanceWithRegionsType() {
		RegisterObjectInstanceWithRegionsTypeImpl registerObjectInstanceWithRegionsType = new RegisterObjectInstanceWithRegionsTypeImpl();
		return registerObjectInstanceWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseMultipleObjectInstanceNamesType createReleaseMultipleObjectInstanceNamesType() {
		ReleaseMultipleObjectInstanceNamesTypeImpl releaseMultipleObjectInstanceNamesType = new ReleaseMultipleObjectInstanceNamesTypeImpl();
		return releaseMultipleObjectInstanceNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseObjectInstanceNameType createReleaseObjectInstanceNameType() {
		ReleaseObjectInstanceNameTypeImpl releaseObjectInstanceNameType = new ReleaseObjectInstanceNameTypeImpl();
		return releaseObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableType createReliableType() {
		ReliableTypeImpl reliableType = new ReliableTypeImpl();
		return reliableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveobjectinstanceType createRemoveobjectinstanceType() {
		RemoveobjectinstanceTypeImpl removeobjectinstanceType = new RemoveobjectinstanceTypeImpl();
		return removeobjectinstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportAttributeTransportationTypeType createReportAttributeTransportationTypeType() {
		ReportAttributeTransportationTypeTypeImpl reportAttributeTransportationTypeType = new ReportAttributeTransportationTypeTypeImpl();
		return reportAttributeTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFederationExecutionsType createReportFederationExecutionsType() {
		ReportFederationExecutionsTypeImpl reportFederationExecutionsType = new ReportFederationExecutionsTypeImpl();
		return reportFederationExecutionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportInteractionTransportationTypeType createReportInteractionTransportationTypeType() {
		ReportInteractionTransportationTypeTypeImpl reportInteractionTransportationTypeType = new ReportInteractionTransportationTypeTypeImpl();
		return reportInteractionTransportationTypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipAssumptionType createRequestAttributeOwnershipAssumptionType() {
		RequestAttributeOwnershipAssumptionTypeImpl requestAttributeOwnershipAssumptionType = new RequestAttributeOwnershipAssumptionTypeImpl();
		return requestAttributeOwnershipAssumptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipReleaseType createRequestAttributeOwnershipReleaseType() {
		RequestAttributeOwnershipReleaseTypeImpl requestAttributeOwnershipReleaseType = new RequestAttributeOwnershipReleaseTypeImpl();
		return requestAttributeOwnershipReleaseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeTransportationTypeChangeType createRequestAttributeTransportationTypeChangeType() {
		RequestAttributeTransportationTypeChangeTypeImpl requestAttributeTransportationTypeChangeType = new RequestAttributeTransportationTypeChangeTypeImpl();
		return requestAttributeTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateType createRequestAttributeValueUpdateType() {
		RequestAttributeValueUpdateTypeImpl requestAttributeValueUpdateType = new RequestAttributeValueUpdateTypeImpl();
		return requestAttributeValueUpdateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateWithRegionsType createRequestAttributeValueUpdateWithRegionsType() {
		RequestAttributeValueUpdateWithRegionsTypeImpl requestAttributeValueUpdateWithRegionsType = new RequestAttributeValueUpdateWithRegionsTypeImpl();
		return requestAttributeValueUpdateWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestDivestitureConfirmationType createRequestDivestitureConfirmationType() {
		RequestDivestitureConfirmationTypeImpl requestDivestitureConfirmationType = new RequestDivestitureConfirmationTypeImpl();
		return requestDivestitureConfirmationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationRestoreType createRequestFederationRestoreType() {
		RequestFederationRestoreTypeImpl requestFederationRestoreType = new RequestFederationRestoreTypeImpl();
		return requestFederationRestoreType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationSaveType createRequestFederationSaveType() {
		RequestFederationSaveTypeImpl requestFederationSaveType = new RequestFederationSaveTypeImpl();
		return requestFederationSaveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestInteractionTransportationTypeChangeType createRequestInteractionTransportationTypeChangeType() {
		RequestInteractionTransportationTypeChangeTypeImpl requestInteractionTransportationTypeChangeType = new RequestInteractionTransportationTypeChangeTypeImpl();
		return requestInteractionTransportationTypeChangeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestRetractionType createRequestRetractionType() {
		RequestRetractionTypeImpl requestRetractionType = new RequestRetractionTypeImpl();
		return requestRetractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveMultipleObjectInstanceNamesType createReserveMultipleObjectInstanceNamesType() {
		ReserveMultipleObjectInstanceNamesTypeImpl reserveMultipleObjectInstanceNamesType = new ReserveMultipleObjectInstanceNamesTypeImpl();
		return reserveMultipleObjectInstanceNamesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveObjectInstanceNameType createReserveObjectInstanceNameType() {
		ReserveObjectInstanceNameTypeImpl reserveObjectInstanceNameType = new ReserveObjectInstanceNameTypeImpl();
		return reserveObjectInstanceNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignFederationExecutionType createResignFederationExecutionType() {
		ResignFederationExecutionTypeImpl resignFederationExecutionType = new ResignFederationExecutionTypeImpl();
		return resignFederationExecutionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignSwitchType createResignSwitchType() {
		ResignSwitchTypeImpl resignSwitchType = new ResignSwitchTypeImpl();
		return resignSwitchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetractType createRetractType() {
		RetractTypeImpl retractType = new RetractTypeImpl();
		return retractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationType createSecurityClassificationType() {
		SecurityClassificationTypeImpl securityClassificationType = new SecurityClassificationTypeImpl();
		return securityClassificationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionType createSendInteractionType() {
		SendInteractionTypeImpl sendInteractionType = new SendInteractionTypeImpl();
		return sendInteractionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionWithRegionsType createSendInteractionWithRegionsType() {
		SendInteractionWithRegionsTypeImpl sendInteractionWithRegionsType = new SendInteractionWithRegionsTypeImpl();
		return sendInteractionWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceUtilizationType createServiceUtilizationType() {
		ServiceUtilizationTypeImpl serviceUtilizationType = new ServiceUtilizationTypeImpl();
		return serviceUtilizationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAutomaticResignDirectiveType createSetAutomaticResignDirectiveType() {
		SetAutomaticResignDirectiveTypeImpl setAutomaticResignDirectiveType = new SetAutomaticResignDirectiveTypeImpl();
		return setAutomaticResignDirectiveType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetRangeBoundsType createSetRangeBoundsType() {
		SetRangeBoundsTypeImpl setRangeBoundsType = new SetRangeBoundsTypeImpl();
		return setRangeBoundsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingType createSharingType() {
		SharingTypeImpl sharingType = new SharingTypeImpl();
		return sharingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType createSimpleDataType() {
		SimpleDataTypeImpl simpleDataType = new SimpleDataTypeImpl();
		return simpleDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataType1 createSimpleDataType1() {
		SimpleDataType1Impl simpleDataType1 = new SimpleDataType1Impl();
		return simpleDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleDataTypesType createSimpleDataTypesType() {
		SimpleDataTypesTypeImpl simpleDataTypesType = new SimpleDataTypesTypeImpl();
		return simpleDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Size createSize() {
		SizeImpl size = new SizeImpl();
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRegistrationForObjectClassType createStartRegistrationForObjectClassType() {
		StartRegistrationForObjectClassTypeImpl startRegistrationForObjectClassType = new StartRegistrationForObjectClassTypeImpl();
		return startRegistrationForObjectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopRegistrationForObjectClassType createStopRegistrationForObjectClassType() {
		StopRegistrationForObjectClassTypeImpl stopRegistrationForObjectClassType = new StopRegistrationForObjectClassTypeImpl();
		return stopRegistrationForObjectClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.ieee.standards.ieee1516._2010.String createString() {
		StringImpl string = new StringImpl();
		return string;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassType createSubscribeInteractionClassType() {
		SubscribeInteractionClassTypeImpl subscribeInteractionClassType = new SubscribeInteractionClassTypeImpl();
		return subscribeInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassWithRegionsType createSubscribeInteractionClassWithRegionsType() {
		SubscribeInteractionClassWithRegionsTypeImpl subscribeInteractionClassWithRegionsType = new SubscribeInteractionClassWithRegionsTypeImpl();
		return subscribeInteractionClassWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesType createSubscribeObjectClassAttributesType() {
		SubscribeObjectClassAttributesTypeImpl subscribeObjectClassAttributesType = new SubscribeObjectClassAttributesTypeImpl();
		return subscribeObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesWithRegionsType createSubscribeObjectClassAttributesWithRegionsType() {
		SubscribeObjectClassAttributesWithRegionsTypeImpl subscribeObjectClassAttributesWithRegionsType = new SubscribeObjectClassAttributesWithRegionsTypeImpl();
		return subscribeObjectClassAttributesWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchesType createSwitchesType() {
		SwitchesTypeImpl switchesType = new SwitchesTypeImpl();
		return switchesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SwitchType createSwitchType() {
		SwitchTypeImpl switchType = new SwitchTypeImpl();
		return switchType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointAchievedType createSynchronizationPointAchievedType() {
		SynchronizationPointAchievedTypeImpl synchronizationPointAchievedType = new SynchronizationPointAchievedTypeImpl();
		return synchronizationPointAchievedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointType createSynchronizationPointType() {
		SynchronizationPointTypeImpl synchronizationPointType = new SynchronizationPointTypeImpl();
		return synchronizationPointType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointType1 createSynchronizationPointType1() {
		SynchronizationPointType1Impl synchronizationPointType1 = new SynchronizationPointType1Impl();
		return synchronizationPointType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationsType createSynchronizationsType() {
		SynchronizationsTypeImpl synchronizationsType = new SynchronizationsTypeImpl();
		return synchronizationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagsType createTagsType() {
		TagsTypeImpl tagsType = new TagsTypeImpl();
		return tagsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TagType createTagType() {
		TagTypeImpl tagType = new TagTypeImpl();
		return tagType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceGrantType createTimeAdvanceGrantType() {
		TimeAdvanceGrantTypeImpl timeAdvanceGrantType = new TimeAdvanceGrantTypeImpl();
		return timeAdvanceGrantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestAvailableType createTimeAdvanceRequestAvailableType() {
		TimeAdvanceRequestAvailableTypeImpl timeAdvanceRequestAvailableType = new TimeAdvanceRequestAvailableTypeImpl();
		return timeAdvanceRequestAvailableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestType createTimeAdvanceRequestType() {
		TimeAdvanceRequestTypeImpl timeAdvanceRequestType = new TimeAdvanceRequestTypeImpl();
		return timeAdvanceRequestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstrainedEnabledType createTimeConstrainedEnabledType() {
		TimeConstrainedEnabledTypeImpl timeConstrainedEnabledType = new TimeConstrainedEnabledTypeImpl();
		return timeConstrainedEnabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRegulationEnabledType createTimeRegulationEnabledType() {
		TimeRegulationEnabledTypeImpl timeRegulationEnabledType = new TimeRegulationEnabledTypeImpl();
		return timeRegulationEnabledType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeStampType createTimeStampType() {
		TimeStampTypeImpl timeStampType = new TimeStampTypeImpl();
		return timeStampType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeType createTimeType() {
		TimeTypeImpl timeType = new TimeTypeImpl();
		return timeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationsType createTransportationsType() {
		TransportationsTypeImpl transportationsType = new TransportationsTypeImpl();
		return transportationsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationType createTransportationType() {
		TransportationTypeImpl transportationType = new TransportationTypeImpl();
		return transportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransportationType1 createTransportationType1() {
		TransportationType1Impl transportationType1 = new TransportationType1Impl();
		return transportationType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOffType createTurnInteractionsOffType() {
		TurnInteractionsOffTypeImpl turnInteractionsOffType = new TurnInteractionsOffTypeImpl();
		return turnInteractionsOffType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOnType createTurnInteractionsOnType() {
		TurnInteractionsOnTypeImpl turnInteractionsOnType = new TurnInteractionsOnTypeImpl();
		return turnInteractionsOnType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOffForObjectInstanceType createTurnUpdatesOffForObjectInstanceType() {
		TurnUpdatesOffForObjectInstanceTypeImpl turnUpdatesOffForObjectInstanceType = new TurnUpdatesOffForObjectInstanceTypeImpl();
		return turnUpdatesOffForObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOnForObjectInstanceType createTurnUpdatesOnForObjectInstanceType() {
		TurnUpdatesOnForObjectInstanceTypeImpl turnUpdatesOnForObjectInstanceType = new TurnUpdatesOnForObjectInstanceTypeImpl();
		return turnUpdatesOnForObjectInstanceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeType createTypeType() {
		TypeTypeImpl typeType = new TypeTypeImpl();
		return typeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnassociateRegionsForUpdatesType createUnassociateRegionsForUpdatesType() {
		UnassociateRegionsForUpdatesTypeImpl unassociateRegionsForUpdatesType = new UnassociateRegionsForUpdatesTypeImpl();
		return unassociateRegionsForUpdatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalAttributeOwnershipDivestitureType createUnconditionalAttributeOwnershipDivestitureType() {
		UnconditionalAttributeOwnershipDivestitureTypeImpl unconditionalAttributeOwnershipDivestitureType = new UnconditionalAttributeOwnershipDivestitureTypeImpl();
		return unconditionalAttributeOwnershipDivestitureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishInteractionClassType createUnpublishInteractionClassType() {
		UnpublishInteractionClassTypeImpl unpublishInteractionClassType = new UnpublishInteractionClassTypeImpl();
		return unpublishInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishObjectClassAttributesType createUnpublishObjectClassAttributesType() {
		UnpublishObjectClassAttributesTypeImpl unpublishObjectClassAttributesType = new UnpublishObjectClassAttributesTypeImpl();
		return unpublishObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassType createUnsubscribeInteractionClassType() {
		UnsubscribeInteractionClassTypeImpl unsubscribeInteractionClassType = new UnsubscribeInteractionClassTypeImpl();
		return unsubscribeInteractionClassType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassWithRegionsType createUnsubscribeInteractionClassWithRegionsType() {
		UnsubscribeInteractionClassWithRegionsTypeImpl unsubscribeInteractionClassWithRegionsType = new UnsubscribeInteractionClassWithRegionsTypeImpl();
		return unsubscribeInteractionClassWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesType createUnsubscribeObjectClassAttributesType() {
		UnsubscribeObjectClassAttributesTypeImpl unsubscribeObjectClassAttributesType = new UnsubscribeObjectClassAttributesTypeImpl();
		return unsubscribeObjectClassAttributesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesWithRegionsType createUnsubscribeObjectClassAttributesWithRegionsType() {
		UnsubscribeObjectClassAttributesWithRegionsTypeImpl unsubscribeObjectClassAttributesWithRegionsType = new UnsubscribeObjectClassAttributesWithRegionsTypeImpl();
		return unsubscribeObjectClassAttributesWithRegionsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttributeValuesType createUpdateAttributeValuesType() {
		UpdateAttributeValuesTypeImpl updateAttributeValuesType = new UpdateAttributeValuesTypeImpl();
		return updateAttributeValuesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRatesType createUpdateRatesType() {
		UpdateRatesTypeImpl updateRatesType = new UpdateRatesTypeImpl();
		return updateRatesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateRateType createUpdateRateType() {
		UpdateRateTypeImpl updateRateType = new UpdateRateTypeImpl();
		return updateRateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateType createUpdateType() {
		UpdateTypeImpl updateType = new UpdateTypeImpl();
		return updateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpperBoundType createUpperBoundType() {
		UpperBoundTypeImpl upperBoundType = new UpperBoundTypeImpl();
		return upperBoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueType createValueType() {
		ValueTypeImpl valueType = new ValueTypeImpl();
		return valueType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataType createVariantRecordDataType() {
		VariantRecordDataTypeImpl variantRecordDataType = new VariantRecordDataTypeImpl();
		return variantRecordDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataType1 createVariantRecordDataType1() {
		VariantRecordDataType1Impl variantRecordDataType1 = new VariantRecordDataType1Impl();
		return variantRecordDataType1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordDataTypesType createVariantRecordDataTypesType() {
		VariantRecordDataTypesTypeImpl variantRecordDataTypesType = new VariantRecordDataTypesTypeImpl();
		return variantRecordDataTypesType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingType createVariantRecordEncodingType() {
		VariantRecordEncodingTypeImpl variantRecordEncodingType = new VariantRecordEncodingTypeImpl();
		return variantRecordEncodingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainEnumerations createApplicationDomainEnumerationsFromString(EDataType eDataType, String initialValue) {
		ApplicationDomainEnumerations result = ApplicationDomainEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityEnumerations createCapabilityEnumerationsFromString(EDataType eDataType, String initialValue) {
		CapabilityEnumerations result = CapabilityEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianEnumerations createEndianEnumerationsFromString(EDataType eDataType, String initialValue) {
		EndianEnumerations result = EndianEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingEnumeration createFixedRecordEncodingEnumerationFromString(EDataType eDataType, String initialValue) {
		FixedRecordEncodingEnumeration result = FixedRecordEncodingEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphTypeEnumerations createGlyphTypeEnumerationsFromString(EDataType eDataType, String initialValue) {
		GlyphTypeEnumerations result = GlyphTypeEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTypeEnumerations createOMTypeEnumerationsFromString(EDataType eDataType, String initialValue) {
		OMTypeEnumerations result = OMTypeEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEnumerations createOrderEnumerationsFromString(EDataType eDataType, String initialValue) {
		OrderEnumerations result = OrderEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipEnumerations createOwnershipEnumerationsFromString(EDataType eDataType, String initialValue) {
		OwnershipEnumerations result = OwnershipEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POCTypeEnumeration createPOCTypeEnumerationFromString(EDataType eDataType, String initialValue) {
		POCTypeEnumeration result = POCTypeEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableEnumerations createReliableEnumerationsFromString(EDataType eDataType, String initialValue) {
		ReliableEnumerations result = ReliableEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliableEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignActionType createResignActionTypeFromString(EDataType eDataType, String initialValue) {
		ResignActionType result = ResignActionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResignActionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationEnumeration createSecurityClassificationEnumerationFromString(EDataType eDataType, String initialValue) {
		SecurityClassificationEnumeration result = SecurityClassificationEnumeration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationEnumerationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingEnumerations createSharingEnumerationsFromString(EDataType eDataType, String initialValue) {
		SharingEnumerations result = SharingEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSharingEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEnumerations createUpdateEnumerationsFromString(EDataType eDataType, String initialValue) {
		UpdateEnumerations result = UpdateEnumerations.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateEnumerationsToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingEnumerator createVariantRecordEncodingEnumeratorFromString(EDataType eDataType, String initialValue) {
		VariantRecordEncodingEnumerator result = VariantRecordEncodingEnumerator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingEnumeratorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDomainEnumerations createApplicationDomainEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createApplicationDomainEnumerationsFromString(_2010Package.eINSTANCE.getApplicationDomainEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertApplicationDomainEnumerationsToString(_2010Package.eINSTANCE.getApplicationDomainEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createApplicationDomainUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createApplicationDomainEnumerationsFromString(_2010Package.eINSTANCE.getApplicationDomainEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApplicationDomainUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getApplicationDomainEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertApplicationDomainEnumerationsToString(_2010Package.eINSTANCE.getApplicationDomainEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArrayDatatypeEncodingEnumFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayDatatypeEncodingEnumToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createArrayDatatypeEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		String result = null;
		RuntimeException exception = null;
		try {
			result = createArrayDatatypeEncodingEnumFromString(_2010Package.eINSTANCE.getArrayDatatypeEncodingEnum(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertArrayDatatypeEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getArrayDatatypeEncodingEnum().isInstance(instanceValue)) {
			try {
				String value = convertArrayDatatypeEncodingEnumToString(_2010Package.eINSTANCE.getArrayDatatypeEncodingEnum(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CapabilityEnumerations createCapabilityEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createCapabilityEnumerationsFromString(_2010Package.eINSTANCE.getCapabilityEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCapabilityEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertCapabilityEnumerationsToString(_2010Package.eINSTANCE.getCapabilityEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createCardinalityPatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCardinalityPatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createDimensionValuePatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDimensionValuePatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EndianEnumerations createEndianEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createEndianEnumerationsFromString(_2010Package.eINSTANCE.getEndianEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEndianEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertEndianEnumerationsToString(_2010Package.eINSTANCE.getEndianEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FixedRecordEncodingEnumeration createFixedRecordEncodingEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createFixedRecordEncodingEnumerationFromString(_2010Package.eINSTANCE.getFixedRecordEncodingEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertFixedRecordEncodingEnumerationToString(_2010Package.eINSTANCE.getFixedRecordEncodingEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createFixedRecordEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createFixedRecordEncodingEnumerationFromString(_2010Package.eINSTANCE.getFixedRecordEncodingEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFixedRecordEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getFixedRecordEncodingEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertFixedRecordEncodingEnumerationToString(_2010Package.eINSTANCE.getFixedRecordEncodingEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlyphTypeEnumerations createGlyphTypeEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createGlyphTypeEnumerationsFromString(_2010Package.eINSTANCE.getGlyphTypeEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertGlyphTypeEnumerationsToString(_2010Package.eINSTANCE.getGlyphTypeEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createGlyphTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createGlyphTypeEnumerationsFromString(_2010Package.eINSTANCE.getGlyphTypeEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGlyphTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getGlyphTypeEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertGlyphTypeEnumerationsToString(_2010Package.eINSTANCE.getGlyphTypeEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (XMLTypePackage.Literals.STRING.isInstance(instanceValue)) {
			try {
				String value = XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNonEmptyStringFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.STRING, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonEmptyStringToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.STRING, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OMTypeEnumerations createOMTypeEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOMTypeEnumerationsFromString(_2010Package.eINSTANCE.getOMTypeEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOMTypeEnumerationsToString(_2010Package.eINSTANCE.getOMTypeEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createOMTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createOMTypeEnumerationsFromString(_2010Package.eINSTANCE.getOMTypeEnumerations(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOMTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getOMTypeEnumerations().isInstance(instanceValue)) {
			try {
				String value = convertOMTypeEnumerationsToString(_2010Package.eINSTANCE.getOMTypeEnumerations(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderEnumerations createOrderEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOrderEnumerationsFromString(_2010Package.eINSTANCE.getOrderEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOrderEnumerationsToString(_2010Package.eINSTANCE.getOrderEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwnershipEnumerations createOwnershipEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createOwnershipEnumerationsFromString(_2010Package.eINSTANCE.getOwnershipEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOwnershipEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertOwnershipEnumerationsToString(_2010Package.eINSTANCE.getOwnershipEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POCTypeEnumeration createPOCTypeEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createPOCTypeEnumerationFromString(_2010Package.eINSTANCE.getPOCTypeEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertPOCTypeEnumerationToString(_2010Package.eINSTANCE.getPOCTypeEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createPOCTypeUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createPOCTypeEnumerationFromString(_2010Package.eINSTANCE.getPOCTypeEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPOCTypeUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getPOCTypeEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertPOCTypeEnumerationToString(_2010Package.eINSTANCE.getPOCTypeEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReliableEnumerations createReliableEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createReliableEnumerationsFromString(_2010Package.eINSTANCE.getReliableEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReliableEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertReliableEnumerationsToString(_2010Package.eINSTANCE.getReliableEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignActionType createResignActionTypeObjectFromString(EDataType eDataType, String initialValue) {
		return createResignActionTypeFromString(_2010Package.eINSTANCE.getResignActionType(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResignActionTypeObjectToString(EDataType eDataType, Object instanceValue) {
		return convertResignActionTypeToString(_2010Package.eINSTANCE.getResignActionType(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SecurityClassificationEnumeration createSecurityClassificationEnumerationObjectFromString(EDataType eDataType, String initialValue) {
		return createSecurityClassificationEnumerationFromString(_2010Package.eINSTANCE.getSecurityClassificationEnumeration(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationEnumerationObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSecurityClassificationEnumerationToString(_2010Package.eINSTANCE.getSecurityClassificationEnumeration(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createSecurityClassificationUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createSecurityClassificationEnumerationFromString(_2010Package.eINSTANCE.getSecurityClassificationEnumeration(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSecurityClassificationUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getSecurityClassificationEnumeration().isInstance(instanceValue)) {
			try {
				String value = convertSecurityClassificationEnumerationToString(_2010Package.eINSTANCE.getSecurityClassificationEnumeration(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SharingEnumerations createSharingEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createSharingEnumerationsFromString(_2010Package.eINSTANCE.getSharingEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSharingEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertSharingEnumerationsToString(_2010Package.eINSTANCE.getSharingEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateEnumerations createUpdateEnumerationsObjectFromString(EDataType eDataType, String initialValue) {
		return createUpdateEnumerationsFromString(_2010Package.eINSTANCE.getUpdateEnumerations(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUpdateEnumerationsObjectToString(EDataType eDataType, Object instanceValue) {
		return convertUpdateEnumerationsToString(_2010Package.eINSTANCE.getUpdateEnumerations(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariantRecordEncodingEnumerator createVariantRecordEncodingEnumeratorObjectFromString(EDataType eDataType, String initialValue) {
		return createVariantRecordEncodingEnumeratorFromString(_2010Package.eINSTANCE.getVariantRecordEncodingEnumerator(), initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingEnumeratorObjectToString(EDataType eDataType, Object instanceValue) {
		return convertVariantRecordEncodingEnumeratorToString(_2010Package.eINSTANCE.getVariantRecordEncodingEnumerator(), instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createVariantRecordEncodingUnionFromString(EDataType eDataType, String initialValue) {
		if (initialValue == null) return null;
		Object result = null;
		RuntimeException exception = null;
		try {
			result = createVariantRecordEncodingEnumeratorFromString(_2010Package.eINSTANCE.getVariantRecordEncodingEnumerator(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		try {
			result = createNonEmptyStringFromString(_2010Package.eINSTANCE.getNonEmptyString(), initialValue);
			if (result != null && Diagnostician.INSTANCE.validate(eDataType, result, null, null)) {
				return result;
			}
		}
		catch (RuntimeException e) {
			exception = e;
		}
		if (result != null || exception == null) return result;
    
		throw exception;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEncodingUnionToString(EDataType eDataType, Object instanceValue) {
		if (instanceValue == null) return null;
		if (_2010Package.eINSTANCE.getVariantRecordEncodingEnumerator().isInstance(instanceValue)) {
			try {
				String value = convertVariantRecordEncodingEnumeratorToString(_2010Package.eINSTANCE.getVariantRecordEncodingEnumerator(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		if (_2010Package.eINSTANCE.getNonEmptyString().isInstance(instanceValue)) {
			try {
				String value = convertNonEmptyStringToString(_2010Package.eINSTANCE.getNonEmptyString(), instanceValue);
				if (value != null) return value;
			}
			catch (Exception e) {
				// Keep trying other member types until all have failed.
			}
		}
		throw new IllegalArgumentException("Invalid value: '"+instanceValue+"' for datatype :"+eDataType.getName());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createVariantRecordEnumeratorPatternFromString(EDataType eDataType, String initialValue) {
		return (String)XMLTypeFactory.eINSTANCE.createFromString(XMLTypePackage.Literals.NC_NAME, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariantRecordEnumeratorPatternToString(EDataType eDataType, Object instanceValue) {
		return XMLTypeFactory.eINSTANCE.convertToString(XMLTypePackage.Literals.NC_NAME, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010Package get_2010Package() {
		return (_2010Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static _2010Package getPackage() {
		return _2010Package.eINSTANCE;
	}

} //_2010FactoryImpl
