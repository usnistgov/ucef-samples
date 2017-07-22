/**
 */
package org.ieee.standards.ieee1516._2010.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ieee.standards.ieee1516._2010.AbortFederationRestoreType;
import org.ieee.standards.ieee1516._2010.AbortFederationSaveType;
import org.ieee.standards.ieee1516._2010.AlternativeType;
import org.ieee.standards.ieee1516._2010.AnnounceSynchronizationPointType;
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
import org.ieee.standards.ieee1516._2010.ObjectClassType;
import org.ieee.standards.ieee1516._2010.ObjectClassType1;
import org.ieee.standards.ieee1516._2010.ObjectInstanceNameReservedType;
import org.ieee.standards.ieee1516._2010.ObjectModelType;
import org.ieee.standards.ieee1516._2010.ObjectsType;
import org.ieee.standards.ieee1516._2010.OrderType;
import org.ieee.standards.ieee1516._2010.OwnershipType;
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
import org.ieee.standards.ieee1516._2010.ResignFederationExecutionType;
import org.ieee.standards.ieee1516._2010.ResignSwitchType;
import org.ieee.standards.ieee1516._2010.RetractType;
import org.ieee.standards.ieee1516._2010.SecurityClassificationType;
import org.ieee.standards.ieee1516._2010.SendInteractionType;
import org.ieee.standards.ieee1516._2010.SendInteractionWithRegionsType;
import org.ieee.standards.ieee1516._2010.ServiceUtilizationType;
import org.ieee.standards.ieee1516._2010.SetAutomaticResignDirectiveType;
import org.ieee.standards.ieee1516._2010.SetRangeBoundsType;
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
import org.ieee.standards.ieee1516._2010.UpdateRateType;
import org.ieee.standards.ieee1516._2010.UpdateRatesType;
import org.ieee.standards.ieee1516._2010.UpdateType;
import org.ieee.standards.ieee1516._2010.UpperBoundType;
import org.ieee.standards.ieee1516._2010.ValueType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataType;
import org.ieee.standards.ieee1516._2010.VariantRecordDataType1;
import org.ieee.standards.ieee1516._2010.VariantRecordDataTypesType;
import org.ieee.standards.ieee1516._2010.VariantRecordEncodingType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ieee.standards.ieee1516._2010._2010Package
 * @generated
 */
public class _2010AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static _2010Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public _2010AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = _2010Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected _2010Switch<Adapter> modelSwitch =
		new _2010Switch<Adapter>() {
			@Override
			public Adapter caseAbortFederationRestoreType(AbortFederationRestoreType object) {
				return createAbortFederationRestoreTypeAdapter();
			}
			@Override
			public Adapter caseAbortFederationSaveType(AbortFederationSaveType object) {
				return createAbortFederationSaveTypeAdapter();
			}
			@Override
			public Adapter caseAlternativeType(AlternativeType object) {
				return createAlternativeTypeAdapter();
			}
			@Override
			public Adapter caseAnnounceSynchronizationPointType(AnnounceSynchronizationPointType object) {
				return createAnnounceSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseApplicationDomainType(ApplicationDomainType object) {
				return createApplicationDomainTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataType(ArrayDataType object) {
				return createArrayDataTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataType1(ArrayDataType1 object) {
				return createArrayDataType1Adapter();
			}
			@Override
			public Adapter caseArrayDatatypeEncodingType(ArrayDatatypeEncodingType object) {
				return createArrayDatatypeEncodingTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataTypesType(ArrayDataTypesType object) {
				return createArrayDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseArrayDataTypesType1(ArrayDataTypesType1 object) {
				return createArrayDataTypesType1Adapter();
			}
			@Override
			public Adapter caseAssociateRegionsForUpdatesType(AssociateRegionsForUpdatesType object) {
				return createAssociateRegionsForUpdatesTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionIfAvailableType(AttributeOwnershipAcquisitionIfAvailableType object) {
				return createAttributeOwnershipAcquisitionIfAvailableTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionNotificationType(AttributeOwnershipAcquisitionNotificationType object) {
				return createAttributeOwnershipAcquisitionNotificationTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipAcquisitionType(AttributeOwnershipAcquisitionType object) {
				return createAttributeOwnershipAcquisitionTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipDivestitureIfWantedType(AttributeOwnershipDivestitureIfWantedType object) {
				return createAttributeOwnershipDivestitureIfWantedTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipReleaseDeniedType(AttributeOwnershipReleaseDeniedType object) {
				return createAttributeOwnershipReleaseDeniedTypeAdapter();
			}
			@Override
			public Adapter caseAttributeOwnershipUnavailableType(AttributeOwnershipUnavailableType object) {
				return createAttributeOwnershipUnavailableTypeAdapter();
			}
			@Override
			public Adapter caseAttributesInScopeType(AttributesInScopeType object) {
				return createAttributesInScopeTypeAdapter();
			}
			@Override
			public Adapter caseAttributesOutOfScopeType(AttributesOutOfScopeType object) {
				return createAttributesOutOfScopeTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType(AttributeType object) {
				return createAttributeTypeAdapter();
			}
			@Override
			public Adapter caseAttributeType1(AttributeType1 object) {
				return createAttributeType1Adapter();
			}
			@Override
			public Adapter caseBasicDataRepresentationsType(BasicDataRepresentationsType object) {
				return createBasicDataRepresentationsTypeAdapter();
			}
			@Override
			public Adapter caseBasicDataType(BasicDataType object) {
				return createBasicDataTypeAdapter();
			}
			@Override
			public Adapter caseBasicDataType1(BasicDataType1 object) {
				return createBasicDataType1Adapter();
			}
			@Override
			public Adapter caseCancelAttributeOwnershipAcquisitionType(CancelAttributeOwnershipAcquisitionType object) {
				return createCancelAttributeOwnershipAcquisitionTypeAdapter();
			}
			@Override
			public Adapter caseCancelNegotiatedAttributeOwnershipDivestitureType(CancelNegotiatedAttributeOwnershipDivestitureType object) {
				return createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseCapabilityType(CapabilityType object) {
				return createCapabilityTypeAdapter();
			}
			@Override
			public Adapter caseCardinalityType(CardinalityType object) {
				return createCardinalityTypeAdapter();
			}
			@Override
			public Adapter caseChangeAttributeOrderTypeType(ChangeAttributeOrderTypeType object) {
				return createChangeAttributeOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseChangeInteractionOrderTypeType(ChangeInteractionOrderTypeType object) {
				return createChangeInteractionOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseCommitRegionModificationsType(CommitRegionModificationsType object) {
				return createCommitRegionModificationsTypeAdapter();
			}
			@Override
			public Adapter caseConfirmAttributeOwnershipAcquisitionCancellationType(ConfirmAttributeOwnershipAcquisitionCancellationType object) {
				return createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter();
			}
			@Override
			public Adapter caseConfirmAttributeTransportationTypeChangeType(ConfirmAttributeTransportationTypeChangeType object) {
				return createConfirmAttributeTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseConfirmDivestitureType(ConfirmDivestitureType object) {
				return createConfirmDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseConfirmFederationRestorationRequestType(ConfirmFederationRestorationRequestType object) {
				return createConfirmFederationRestorationRequestTypeAdapter();
			}
			@Override
			public Adapter caseConfirmInteractionTransportationTypeChangeType(ConfirmInteractionTransportationTypeChangeType object) {
				return createConfirmInteractionTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseConfirmSynchronizationPointRegistrationType(ConfirmSynchronizationPointRegistrationType object) {
				return createConfirmSynchronizationPointRegistrationTypeAdapter();
			}
			@Override
			public Adapter caseConnectionLostType(ConnectionLostType object) {
				return createConnectionLostTypeAdapter();
			}
			@Override
			public Adapter caseConnectType(ConnectType object) {
				return createConnectTypeAdapter();
			}
			@Override
			public Adapter caseCreateFederationExecutionType(CreateFederationExecutionType object) {
				return createCreateFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseCreateRegionType(CreateRegionType object) {
				return createCreateRegionTypeAdapter();
			}
			@Override
			public Adapter caseDataTypesType(DataTypesType object) {
				return createDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseDeleteObjectInstanceType(DeleteObjectInstanceType object) {
				return createDeleteObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDeleteRegionType(DeleteRegionType object) {
				return createDeleteRegionTypeAdapter();
			}
			@Override
			public Adapter caseDestroyFederationExecutionType(DestroyFederationExecutionType object) {
				return createDestroyFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseDimensionsType(DimensionsType object) {
				return createDimensionsTypeAdapter();
			}
			@Override
			public Adapter caseDimensionsType1(DimensionsType1 object) {
				return createDimensionsType1Adapter();
			}
			@Override
			public Adapter caseDimensionsType2(DimensionsType2 object) {
				return createDimensionsType2Adapter();
			}
			@Override
			public Adapter caseDimensionType(DimensionType object) {
				return createDimensionTypeAdapter();
			}
			@Override
			public Adapter caseDimensionType1(DimensionType1 object) {
				return createDimensionType1Adapter();
			}
			@Override
			public Adapter caseDisableAsynchronousDeliveryType(DisableAsynchronousDeliveryType object) {
				return createDisableAsynchronousDeliveryTypeAdapter();
			}
			@Override
			public Adapter caseDisableAttributeRelevanceAdvisorySwitchType(DisableAttributeRelevanceAdvisorySwitchType object) {
				return createDisableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableAttributeScopeAdvisorySwitchType(DisableAttributeScopeAdvisorySwitchType object) {
				return createDisableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableCallbacksType(DisableCallbacksType object) {
				return createDisableCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseDisableInteractionRelevanceAdvisorySwitchType(DisableInteractionRelevanceAdvisorySwitchType object) {
				return createDisableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableObjectClassRelevanceAdvisorySwitchType(DisableObjectClassRelevanceAdvisorySwitchType object) {
				return createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseDisableTimeConstrainedType(DisableTimeConstrainedType object) {
				return createDisableTimeConstrainedTypeAdapter();
			}
			@Override
			public Adapter caseDisableTimeRegulationType(DisableTimeRegulationType object) {
				return createDisableTimeRegulationTypeAdapter();
			}
			@Override
			public Adapter caseDisconnectType(DisconnectType object) {
				return createDisconnectTypeAdapter();
			}
			@Override
			public Adapter caseDiscoverObjectInstanceType(DiscoverObjectInstanceType object) {
				return createDiscoverObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseEnableAsynchronousDeliveryType(EnableAsynchronousDeliveryType object) {
				return createEnableAsynchronousDeliveryTypeAdapter();
			}
			@Override
			public Adapter caseEnableAttributeRelevanceAdvisorySwitchType(EnableAttributeRelevanceAdvisorySwitchType object) {
				return createEnableAttributeRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableAttributeScopeAdvisorySwitchType(EnableAttributeScopeAdvisorySwitchType object) {
				return createEnableAttributeScopeAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableCallbacksType(EnableCallbacksType object) {
				return createEnableCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseEnableInteractionRelevanceAdvisorySwitchType(EnableInteractionRelevanceAdvisorySwitchType object) {
				return createEnableInteractionRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableObjectClassRelevanceAdvisorySwitchType(EnableObjectClassRelevanceAdvisorySwitchType object) {
				return createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter();
			}
			@Override
			public Adapter caseEnableTimeConstrainedType(EnableTimeConstrainedType object) {
				return createEnableTimeConstrainedTypeAdapter();
			}
			@Override
			public Adapter caseEnableTimeRegulationType(EnableTimeRegulationType object) {
				return createEnableTimeRegulationTypeAdapter();
			}
			@Override
			public Adapter caseEndianType(EndianType object) {
				return createEndianTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedDataType(EnumeratedDataType object) {
				return createEnumeratedDataTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratedDataType1(EnumeratedDataType1 object) {
				return createEnumeratedDataType1Adapter();
			}
			@Override
			public Adapter caseEnumeratedDataTypesType(EnumeratedDataTypesType object) {
				return createEnumeratedDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseEnumeratorType(EnumeratorType object) {
				return createEnumeratorTypeAdapter();
			}
			@Override
			public Adapter caseEvokeCallbackType(EvokeCallbackType object) {
				return createEvokeCallbackTypeAdapter();
			}
			@Override
			public Adapter caseEvokeMultipleCallbacksType(EvokeMultipleCallbacksType object) {
				return createEvokeMultipleCallbacksTypeAdapter();
			}
			@Override
			public Adapter caseFederateRestoreCompleteType(FederateRestoreCompleteType object) {
				return createFederateRestoreCompleteTypeAdapter();
			}
			@Override
			public Adapter caseFederateSaveBegunType(FederateSaveBegunType object) {
				return createFederateSaveBegunTypeAdapter();
			}
			@Override
			public Adapter caseFederateSaveCompleteType(FederateSaveCompleteType object) {
				return createFederateSaveCompleteTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoreBegunType(FederationRestoreBegunType object) {
				return createFederationRestoreBegunTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoredType(FederationRestoredType object) {
				return createFederationRestoredTypeAdapter();
			}
			@Override
			public Adapter caseFederationRestoreStatusResponseType(FederationRestoreStatusResponseType object) {
				return createFederationRestoreStatusResponseTypeAdapter();
			}
			@Override
			public Adapter caseFederationSavedType(FederationSavedType object) {
				return createFederationSavedTypeAdapter();
			}
			@Override
			public Adapter caseFederationSaveStatusResponseType(FederationSaveStatusResponseType object) {
				return createFederationSaveStatusResponseTypeAdapter();
			}
			@Override
			public Adapter caseFederationSynchronizedType(FederationSynchronizedType object) {
				return createFederationSynchronizedTypeAdapter();
			}
			@Override
			public Adapter caseFieldType(FieldType object) {
				return createFieldTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordDataType(FixedRecordDataType object) {
				return createFixedRecordDataTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordDataType1(FixedRecordDataType1 object) {
				return createFixedRecordDataType1Adapter();
			}
			@Override
			public Adapter caseFixedRecordDataTypesType(FixedRecordDataTypesType object) {
				return createFixedRecordDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseFixedRecordEncodingType(FixedRecordEncodingType object) {
				return createFixedRecordEncodingTypeAdapter();
			}
			@Override
			public Adapter caseFlushQueueRequestType(FlushQueueRequestType object) {
				return createFlushQueueRequestTypeAdapter();
			}
			@Override
			public Adapter caseGetAttributeHandleType(GetAttributeHandleType object) {
				return createGetAttributeHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetAttributeNameType(GetAttributeNameType object) {
				return createGetAttributeNameTypeAdapter();
			}
			@Override
			public Adapter caseGetAutomaticResignDirectiveType(GetAutomaticResignDirectiveType object) {
				return createGetAutomaticResignDirectiveTypeAdapter();
			}
			@Override
			public Adapter caseGetAvailableDimensionsForClassAttributeType(GetAvailableDimensionsForClassAttributeType object) {
				return createGetAvailableDimensionsForClassAttributeTypeAdapter();
			}
			@Override
			public Adapter caseGetAvailableDimensionsForInteractionClassType(GetAvailableDimensionsForInteractionClassType object) {
				return createGetAvailableDimensionsForInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionHandleSetType(GetDimensionHandleSetType object) {
				return createGetDimensionHandleSetTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionHandleType(GetDimensionHandleType object) {
				return createGetDimensionHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionNameType(GetDimensionNameType object) {
				return createGetDimensionNameTypeAdapter();
			}
			@Override
			public Adapter caseGetDimensionUpperBoundType(GetDimensionUpperBoundType object) {
				return createGetDimensionUpperBoundTypeAdapter();
			}
			@Override
			public Adapter caseGetFederateHandleType(GetFederateHandleType object) {
				return createGetFederateHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetFederateNameType(GetFederateNameType object) {
				return createGetFederateNameTypeAdapter();
			}
			@Override
			public Adapter caseGetInteractionClassHandleType(GetInteractionClassHandleType object) {
				return createGetInteractionClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetInteractionClassNameType(GetInteractionClassNameType object) {
				return createGetInteractionClassNameTypeAdapter();
			}
			@Override
			public Adapter caseGetKnownObjectClassHandleType(GetKnownObjectClassHandleType object) {
				return createGetKnownObjectClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectClassHandleType(GetObjectClassHandleType object) {
				return createGetObjectClassHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectClassNameType(GetObjectClassNameType object) {
				return createGetObjectClassNameTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectInstanceHandleType(GetObjectInstanceHandleType object) {
				return createGetObjectInstanceHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetObjectInstanceNameType(GetObjectInstanceNameType object) {
				return createGetObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseGetOrderNameType(GetOrderNameType object) {
				return createGetOrderNameTypeAdapter();
			}
			@Override
			public Adapter caseGetOrderTypeType(GetOrderTypeType object) {
				return createGetOrderTypeTypeAdapter();
			}
			@Override
			public Adapter caseGetParameterHandleType(GetParameterHandleType object) {
				return createGetParameterHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetParameterNameType(GetParameterNameType object) {
				return createGetParameterNameTypeAdapter();
			}
			@Override
			public Adapter caseGetRangeBoundsType(GetRangeBoundsType object) {
				return createGetRangeBoundsTypeAdapter();
			}
			@Override
			public Adapter caseGetTransportationTypeHandleType(GetTransportationTypeHandleType object) {
				return createGetTransportationTypeHandleTypeAdapter();
			}
			@Override
			public Adapter caseGetTransportationTypeNameType(GetTransportationTypeNameType object) {
				return createGetTransportationTypeNameTypeAdapter();
			}
			@Override
			public Adapter caseGetUpdateRateValueForAttributeType(GetUpdateRateValueForAttributeType object) {
				return createGetUpdateRateValueForAttributeTypeAdapter();
			}
			@Override
			public Adapter caseGetUpdateRateValueType(GetUpdateRateValueType object) {
				return createGetUpdateRateValueTypeAdapter();
			}
			@Override
			public Adapter caseGlyphType(GlyphType object) {
				return createGlyphTypeAdapter();
			}
			@Override
			public Adapter caseGlyphType1(GlyphType1 object) {
				return createGlyphType1Adapter();
			}
			@Override
			public Adapter caseIdentificationType(IdentificationType object) {
				return createIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseIdentifierType(IdentifierType object) {
				return createIdentifierTypeAdapter();
			}
			@Override
			public Adapter caseIdReferenceType(IdReferenceType object) {
				return createIdReferenceTypeAdapter();
			}
			@Override
			public Adapter caseInformAttributeOwnershipType(InformAttributeOwnershipType object) {
				return createInformAttributeOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseInitiateFederateRestoreType(InitiateFederateRestoreType object) {
				return createInitiateFederateRestoreTypeAdapter();
			}
			@Override
			public Adapter caseInitiateFederateSaveType(InitiateFederateSaveType object) {
				return createInitiateFederateSaveTypeAdapter();
			}
			@Override
			public Adapter caseInteractionClassType(InteractionClassType object) {
				return createInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseInteractionClassType1(InteractionClassType1 object) {
				return createInteractionClassType1Adapter();
			}
			@Override
			public Adapter caseInteractionsType(InteractionsType object) {
				return createInteractionsTypeAdapter();
			}
			@Override
			public Adapter caseIsAttributeOwnedByFederateType(IsAttributeOwnedByFederateType object) {
				return createIsAttributeOwnedByFederateTypeAdapter();
			}
			@Override
			public Adapter caseJoinFederationExecutionType(JoinFederationExecutionType object) {
				return createJoinFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseKeywordType(KeywordType object) {
				return createKeywordTypeAdapter();
			}
			@Override
			public Adapter caseListFederationExecutionsType(ListFederationExecutionsType object) {
				return createListFederationExecutionsTypeAdapter();
			}
			@Override
			public Adapter caseLocalDeleteObjectInstanceType(LocalDeleteObjectInstanceType object) {
				return createLocalDeleteObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseLookaheadType(LookaheadType object) {
				return createLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseModelIdentificationType(ModelIdentificationType object) {
				return createModelIdentificationTypeAdapter();
			}
			@Override
			public Adapter caseModelType(ModelType object) {
				return createModelTypeAdapter();
			}
			@Override
			public Adapter caseModificationDateType(ModificationDateType object) {
				return createModificationDateTypeAdapter();
			}
			@Override
			public Adapter caseModifyLookaheadType(ModifyLookaheadType object) {
				return createModifyLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseMultipleObjectInstanceNamesReservedType(MultipleObjectInstanceNamesReservedType object) {
				return createMultipleObjectInstanceNamesReservedTypeAdapter();
			}
			@Override
			public Adapter caseNegotiatedAttributeOwnershipDivestitureType(NegotiatedAttributeOwnershipDivestitureType object) {
				return createNegotiatedAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseNextMessageRequestAvailableType(NextMessageRequestAvailableType object) {
				return createNextMessageRequestAvailableTypeAdapter();
			}
			@Override
			public Adapter caseNextMessageRequestType(NextMessageRequestType object) {
				return createNextMessageRequestTypeAdapter();
			}
			@Override
			public Adapter caseNonEmptyString1(NonEmptyString1 object) {
				return createNonEmptyString1Adapter();
			}
			@Override
			public Adapter caseNormalizeFederateHandleType(NormalizeFederateHandleType object) {
				return createNormalizeFederateHandleTypeAdapter();
			}
			@Override
			public Adapter caseNormalizeServiceGroupType(NormalizeServiceGroupType object) {
				return createNormalizeServiceGroupTypeAdapter();
			}
			@Override
			public Adapter caseNotesType(NotesType object) {
				return createNotesTypeAdapter();
			}
			@Override
			public Adapter caseNoteType(NoteType object) {
				return createNoteTypeAdapter();
			}
			@Override
			public Adapter caseObjectClassType(ObjectClassType object) {
				return createObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseObjectClassType1(ObjectClassType1 object) {
				return createObjectClassType1Adapter();
			}
			@Override
			public Adapter caseObjectInstanceNameReservedType(ObjectInstanceNameReservedType object) {
				return createObjectInstanceNameReservedTypeAdapter();
			}
			@Override
			public Adapter caseObjectModelType(ObjectModelType object) {
				return createObjectModelTypeAdapter();
			}
			@Override
			public Adapter caseObjectsType(ObjectsType object) {
				return createObjectsTypeAdapter();
			}
			@Override
			public Adapter caseOrderType(OrderType object) {
				return createOrderTypeAdapter();
			}
			@Override
			public Adapter caseOwnershipType(OwnershipType object) {
				return createOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseParameterType(ParameterType object) {
				return createParameterTypeAdapter();
			}
			@Override
			public Adapter caseParameterType1(ParameterType1 object) {
				return createParameterType1Adapter();
			}
			@Override
			public Adapter casePocType(PocType object) {
				return createPocTypeAdapter();
			}
			@Override
			public Adapter casePocType1(PocType1 object) {
				return createPocType1Adapter();
			}
			@Override
			public Adapter casePocTypeType(PocTypeType object) {
				return createPocTypeTypeAdapter();
			}
			@Override
			public Adapter caseProvideAttributeValueUpdateType(ProvideAttributeValueUpdateType object) {
				return createProvideAttributeValueUpdateTypeAdapter();
			}
			@Override
			public Adapter casePublishInteractionClassType(PublishInteractionClassType object) {
				return createPublishInteractionClassTypeAdapter();
			}
			@Override
			public Adapter casePublishObjectClassAttributesType(PublishObjectClassAttributesType object) {
				return createPublishObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseQueryAttributeOwnershipType(QueryAttributeOwnershipType object) {
				return createQueryAttributeOwnershipTypeAdapter();
			}
			@Override
			public Adapter caseQueryAttributeTransportationTypeType(QueryAttributeTransportationTypeType object) {
				return createQueryAttributeTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseQueryFederationRestoreStatusType(QueryFederationRestoreStatusType object) {
				return createQueryFederationRestoreStatusTypeAdapter();
			}
			@Override
			public Adapter caseQueryFederationSaveStatusType(QueryFederationSaveStatusType object) {
				return createQueryFederationSaveStatusTypeAdapter();
			}
			@Override
			public Adapter caseQueryGALTType(QueryGALTType object) {
				return createQueryGALTTypeAdapter();
			}
			@Override
			public Adapter caseQueryInteractionTransportationTypeType(QueryInteractionTransportationTypeType object) {
				return createQueryInteractionTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseQueryLITSType(QueryLITSType object) {
				return createQueryLITSTypeAdapter();
			}
			@Override
			public Adapter caseQueryLogicalTimeType(QueryLogicalTimeType object) {
				return createQueryLogicalTimeTypeAdapter();
			}
			@Override
			public Adapter caseQueryLookaheadType(QueryLookaheadType object) {
				return createQueryLookaheadTypeAdapter();
			}
			@Override
			public Adapter caseRateType(RateType object) {
				return createRateTypeAdapter();
			}
			@Override
			public Adapter caseReceiveInteractionType(ReceiveInteractionType object) {
				return createReceiveInteractionTypeAdapter();
			}
			@Override
			public Adapter caseReferenceType(ReferenceType object) {
				return createReferenceTypeAdapter();
			}
			@Override
			public Adapter caseReflectAttributeValuesType(ReflectAttributeValuesType object) {
				return createReflectAttributeValuesTypeAdapter();
			}
			@Override
			public Adapter caseRegisterFederationSynchronizationPointType(RegisterFederationSynchronizationPointType object) {
				return createRegisterFederationSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseRegisterObjectInstanceType(RegisterObjectInstanceType object) {
				return createRegisterObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseRegisterObjectInstanceWithRegionsType(RegisterObjectInstanceWithRegionsType object) {
				return createRegisterObjectInstanceWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseReleaseMultipleObjectInstanceNamesType(ReleaseMultipleObjectInstanceNamesType object) {
				return createReleaseMultipleObjectInstanceNamesTypeAdapter();
			}
			@Override
			public Adapter caseReleaseObjectInstanceNameType(ReleaseObjectInstanceNameType object) {
				return createReleaseObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseReliableType(ReliableType object) {
				return createReliableTypeAdapter();
			}
			@Override
			public Adapter caseRemoveobjectinstanceType(RemoveobjectinstanceType object) {
				return createRemoveobjectinstanceTypeAdapter();
			}
			@Override
			public Adapter caseReportAttributeTransportationTypeType(ReportAttributeTransportationTypeType object) {
				return createReportAttributeTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseReportFederationExecutionsType(ReportFederationExecutionsType object) {
				return createReportFederationExecutionsTypeAdapter();
			}
			@Override
			public Adapter caseReportInteractionTransportationTypeType(ReportInteractionTransportationTypeType object) {
				return createReportInteractionTransportationTypeTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeOwnershipAssumptionType(RequestAttributeOwnershipAssumptionType object) {
				return createRequestAttributeOwnershipAssumptionTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeOwnershipReleaseType(RequestAttributeOwnershipReleaseType object) {
				return createRequestAttributeOwnershipReleaseTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeTransportationTypeChangeType(RequestAttributeTransportationTypeChangeType object) {
				return createRequestAttributeTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeValueUpdateType(RequestAttributeValueUpdateType object) {
				return createRequestAttributeValueUpdateTypeAdapter();
			}
			@Override
			public Adapter caseRequestAttributeValueUpdateWithRegionsType(RequestAttributeValueUpdateWithRegionsType object) {
				return createRequestAttributeValueUpdateWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseRequestDivestitureConfirmationType(RequestDivestitureConfirmationType object) {
				return createRequestDivestitureConfirmationTypeAdapter();
			}
			@Override
			public Adapter caseRequestFederationRestoreType(RequestFederationRestoreType object) {
				return createRequestFederationRestoreTypeAdapter();
			}
			@Override
			public Adapter caseRequestFederationSaveType(RequestFederationSaveType object) {
				return createRequestFederationSaveTypeAdapter();
			}
			@Override
			public Adapter caseRequestInteractionTransportationTypeChangeType(RequestInteractionTransportationTypeChangeType object) {
				return createRequestInteractionTransportationTypeChangeTypeAdapter();
			}
			@Override
			public Adapter caseRequestRetractionType(RequestRetractionType object) {
				return createRequestRetractionTypeAdapter();
			}
			@Override
			public Adapter caseReserveMultipleObjectInstanceNamesType(ReserveMultipleObjectInstanceNamesType object) {
				return createReserveMultipleObjectInstanceNamesTypeAdapter();
			}
			@Override
			public Adapter caseReserveObjectInstanceNameType(ReserveObjectInstanceNameType object) {
				return createReserveObjectInstanceNameTypeAdapter();
			}
			@Override
			public Adapter caseResignFederationExecutionType(ResignFederationExecutionType object) {
				return createResignFederationExecutionTypeAdapter();
			}
			@Override
			public Adapter caseResignSwitchType(ResignSwitchType object) {
				return createResignSwitchTypeAdapter();
			}
			@Override
			public Adapter caseRetractType(RetractType object) {
				return createRetractTypeAdapter();
			}
			@Override
			public Adapter caseSecurityClassificationType(SecurityClassificationType object) {
				return createSecurityClassificationTypeAdapter();
			}
			@Override
			public Adapter caseSendInteractionType(SendInteractionType object) {
				return createSendInteractionTypeAdapter();
			}
			@Override
			public Adapter caseSendInteractionWithRegionsType(SendInteractionWithRegionsType object) {
				return createSendInteractionWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseServiceUtilizationType(ServiceUtilizationType object) {
				return createServiceUtilizationTypeAdapter();
			}
			@Override
			public Adapter caseSetAutomaticResignDirectiveType(SetAutomaticResignDirectiveType object) {
				return createSetAutomaticResignDirectiveTypeAdapter();
			}
			@Override
			public Adapter caseSetRangeBoundsType(SetRangeBoundsType object) {
				return createSetRangeBoundsTypeAdapter();
			}
			@Override
			public Adapter caseSharingType(SharingType object) {
				return createSharingTypeAdapter();
			}
			@Override
			public Adapter caseSimpleDataType(SimpleDataType object) {
				return createSimpleDataTypeAdapter();
			}
			@Override
			public Adapter caseSimpleDataType1(SimpleDataType1 object) {
				return createSimpleDataType1Adapter();
			}
			@Override
			public Adapter caseSimpleDataTypesType(SimpleDataTypesType object) {
				return createSimpleDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseSize(Size object) {
				return createSizeAdapter();
			}
			@Override
			public Adapter caseStartRegistrationForObjectClassType(StartRegistrationForObjectClassType object) {
				return createStartRegistrationForObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseStopRegistrationForObjectClassType(StopRegistrationForObjectClassType object) {
				return createStopRegistrationForObjectClassTypeAdapter();
			}
			@Override
			public Adapter caseString(org.ieee.standards.ieee1516._2010.String object) {
				return createStringAdapter();
			}
			@Override
			public Adapter caseSubscribeInteractionClassType(SubscribeInteractionClassType object) {
				return createSubscribeInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeInteractionClassWithRegionsType(SubscribeInteractionClassWithRegionsType object) {
				return createSubscribeInteractionClassWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeObjectClassAttributesType(SubscribeObjectClassAttributesType object) {
				return createSubscribeObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseSubscribeObjectClassAttributesWithRegionsType(SubscribeObjectClassAttributesWithRegionsType object) {
				return createSubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseSwitchesType(SwitchesType object) {
				return createSwitchesTypeAdapter();
			}
			@Override
			public Adapter caseSwitchType(SwitchType object) {
				return createSwitchTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointAchievedType(SynchronizationPointAchievedType object) {
				return createSynchronizationPointAchievedTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointType(SynchronizationPointType object) {
				return createSynchronizationPointTypeAdapter();
			}
			@Override
			public Adapter caseSynchronizationPointType1(SynchronizationPointType1 object) {
				return createSynchronizationPointType1Adapter();
			}
			@Override
			public Adapter caseSynchronizationsType(SynchronizationsType object) {
				return createSynchronizationsTypeAdapter();
			}
			@Override
			public Adapter caseTagsType(TagsType object) {
				return createTagsTypeAdapter();
			}
			@Override
			public Adapter caseTagType(TagType object) {
				return createTagTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceGrantType(TimeAdvanceGrantType object) {
				return createTimeAdvanceGrantTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceRequestAvailableType(TimeAdvanceRequestAvailableType object) {
				return createTimeAdvanceRequestAvailableTypeAdapter();
			}
			@Override
			public Adapter caseTimeAdvanceRequestType(TimeAdvanceRequestType object) {
				return createTimeAdvanceRequestTypeAdapter();
			}
			@Override
			public Adapter caseTimeConstrainedEnabledType(TimeConstrainedEnabledType object) {
				return createTimeConstrainedEnabledTypeAdapter();
			}
			@Override
			public Adapter caseTimeRegulationEnabledType(TimeRegulationEnabledType object) {
				return createTimeRegulationEnabledTypeAdapter();
			}
			@Override
			public Adapter caseTimeStampType(TimeStampType object) {
				return createTimeStampTypeAdapter();
			}
			@Override
			public Adapter caseTimeType(TimeType object) {
				return createTimeTypeAdapter();
			}
			@Override
			public Adapter caseTransportationsType(TransportationsType object) {
				return createTransportationsTypeAdapter();
			}
			@Override
			public Adapter caseTransportationType(TransportationType object) {
				return createTransportationTypeAdapter();
			}
			@Override
			public Adapter caseTransportationType1(TransportationType1 object) {
				return createTransportationType1Adapter();
			}
			@Override
			public Adapter caseTurnInteractionsOffType(TurnInteractionsOffType object) {
				return createTurnInteractionsOffTypeAdapter();
			}
			@Override
			public Adapter caseTurnInteractionsOnType(TurnInteractionsOnType object) {
				return createTurnInteractionsOnTypeAdapter();
			}
			@Override
			public Adapter caseTurnUpdatesOffForObjectInstanceType(TurnUpdatesOffForObjectInstanceType object) {
				return createTurnUpdatesOffForObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTurnUpdatesOnForObjectInstanceType(TurnUpdatesOnForObjectInstanceType object) {
				return createTurnUpdatesOnForObjectInstanceTypeAdapter();
			}
			@Override
			public Adapter caseTypeType(TypeType object) {
				return createTypeTypeAdapter();
			}
			@Override
			public Adapter caseUnassociateRegionsForUpdatesType(UnassociateRegionsForUpdatesType object) {
				return createUnassociateRegionsForUpdatesTypeAdapter();
			}
			@Override
			public Adapter caseUnconditionalAttributeOwnershipDivestitureType(UnconditionalAttributeOwnershipDivestitureType object) {
				return createUnconditionalAttributeOwnershipDivestitureTypeAdapter();
			}
			@Override
			public Adapter caseUnpublishInteractionClassType(UnpublishInteractionClassType object) {
				return createUnpublishInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseUnpublishObjectClassAttributesType(UnpublishObjectClassAttributesType object) {
				return createUnpublishObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeInteractionClassType(UnsubscribeInteractionClassType object) {
				return createUnsubscribeInteractionClassTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeInteractionClassWithRegionsType(UnsubscribeInteractionClassWithRegionsType object) {
				return createUnsubscribeInteractionClassWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeObjectClassAttributesType(UnsubscribeObjectClassAttributesType object) {
				return createUnsubscribeObjectClassAttributesTypeAdapter();
			}
			@Override
			public Adapter caseUnsubscribeObjectClassAttributesWithRegionsType(UnsubscribeObjectClassAttributesWithRegionsType object) {
				return createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter();
			}
			@Override
			public Adapter caseUpdateAttributeValuesType(UpdateAttributeValuesType object) {
				return createUpdateAttributeValuesTypeAdapter();
			}
			@Override
			public Adapter caseUpdateRatesType(UpdateRatesType object) {
				return createUpdateRatesTypeAdapter();
			}
			@Override
			public Adapter caseUpdateRateType(UpdateRateType object) {
				return createUpdateRateTypeAdapter();
			}
			@Override
			public Adapter caseUpdateType(UpdateType object) {
				return createUpdateTypeAdapter();
			}
			@Override
			public Adapter caseUpperBoundType(UpperBoundType object) {
				return createUpperBoundTypeAdapter();
			}
			@Override
			public Adapter caseValueType(ValueType object) {
				return createValueTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordDataType(VariantRecordDataType object) {
				return createVariantRecordDataTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordDataType1(VariantRecordDataType1 object) {
				return createVariantRecordDataType1Adapter();
			}
			@Override
			public Adapter caseVariantRecordDataTypesType(VariantRecordDataTypesType object) {
				return createVariantRecordDataTypesTypeAdapter();
			}
			@Override
			public Adapter caseVariantRecordEncodingType(VariantRecordEncodingType object) {
				return createVariantRecordEncodingTypeAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AbortFederationRestoreType <em>Abort Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AbortFederationRestoreType
	 * @generated
	 */
	public Adapter createAbortFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AbortFederationSaveType <em>Abort Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AbortFederationSaveType
	 * @generated
	 */
	public Adapter createAbortFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AlternativeType <em>Alternative Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AlternativeType
	 * @generated
	 */
	public Adapter createAlternativeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AnnounceSynchronizationPointType <em>Announce Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AnnounceSynchronizationPointType
	 * @generated
	 */
	public Adapter createAnnounceSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ApplicationDomainType <em>Application Domain Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ApplicationDomainType
	 * @generated
	 */
	public Adapter createApplicationDomainTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ArrayDataType <em>Array Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ArrayDataType
	 * @generated
	 */
	public Adapter createArrayDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ArrayDataType1 <em>Array Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ArrayDataType1
	 * @generated
	 */
	public Adapter createArrayDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ArrayDatatypeEncodingType <em>Array Datatype Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ArrayDatatypeEncodingType
	 * @generated
	 */
	public Adapter createArrayDatatypeEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ArrayDataTypesType <em>Array Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ArrayDataTypesType
	 * @generated
	 */
	public Adapter createArrayDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ArrayDataTypesType1 <em>Array Data Types Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ArrayDataTypesType1
	 * @generated
	 */
	public Adapter createArrayDataTypesType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AssociateRegionsForUpdatesType <em>Associate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AssociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createAssociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType <em>Attribute Ownership Acquisition If Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionIfAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType <em>Attribute Ownership Acquisition Notification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionNotificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionType <em>Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType <em>Attribute Ownership Divestiture If Wanted Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipDivestitureIfWantedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipReleaseDeniedType <em>Attribute Ownership Release Denied Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipReleaseDeniedType
	 * @generated
	 */
	public Adapter createAttributeOwnershipReleaseDeniedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeOwnershipUnavailableType <em>Attribute Ownership Unavailable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeOwnershipUnavailableType
	 * @generated
	 */
	public Adapter createAttributeOwnershipUnavailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributesInScopeType <em>Attributes In Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributesInScopeType
	 * @generated
	 */
	public Adapter createAttributesInScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributesOutOfScopeType <em>Attributes Out Of Scope Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributesOutOfScopeType
	 * @generated
	 */
	public Adapter createAttributesOutOfScopeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeType <em>Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeType
	 * @generated
	 */
	public Adapter createAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.AttributeType1 <em>Attribute Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.AttributeType1
	 * @generated
	 */
	public Adapter createAttributeType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.BasicDataRepresentationsType <em>Basic Data Representations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.BasicDataRepresentationsType
	 * @generated
	 */
	public Adapter createBasicDataRepresentationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.BasicDataType <em>Basic Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.BasicDataType
	 * @generated
	 */
	public Adapter createBasicDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.BasicDataType1 <em>Basic Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.BasicDataType1
	 * @generated
	 */
	public Adapter createBasicDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CancelAttributeOwnershipAcquisitionType <em>Cancel Attribute Ownership Acquisition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CancelAttributeOwnershipAcquisitionType
	 * @generated
	 */
	public Adapter createCancelAttributeOwnershipAcquisitionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType <em>Cancel Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createCancelNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CapabilityType <em>Capability Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CapabilityType
	 * @generated
	 */
	public Adapter createCapabilityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CardinalityType <em>Cardinality Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CardinalityType
	 * @generated
	 */
	public Adapter createCardinalityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ChangeAttributeOrderTypeType <em>Change Attribute Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ChangeAttributeOrderTypeType
	 * @generated
	 */
	public Adapter createChangeAttributeOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ChangeInteractionOrderTypeType <em>Change Interaction Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ChangeInteractionOrderTypeType
	 * @generated
	 */
	public Adapter createChangeInteractionOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CommitRegionModificationsType <em>Commit Region Modifications Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CommitRegionModificationsType
	 * @generated
	 */
	public Adapter createCommitRegionModificationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType <em>Confirm Attribute Ownership Acquisition Cancellation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmAttributeOwnershipAcquisitionCancellationType
	 * @generated
	 */
	public Adapter createConfirmAttributeOwnershipAcquisitionCancellationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType <em>Confirm Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmDivestitureType <em>Confirm Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmDivestitureType
	 * @generated
	 */
	public Adapter createConfirmDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmFederationRestorationRequestType <em>Confirm Federation Restoration Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmFederationRestorationRequestType
	 * @generated
	 */
	public Adapter createConfirmFederationRestorationRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType <em>Confirm Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createConfirmInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConfirmSynchronizationPointRegistrationType <em>Confirm Synchronization Point Registration Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConfirmSynchronizationPointRegistrationType
	 * @generated
	 */
	public Adapter createConfirmSynchronizationPointRegistrationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConnectionLostType <em>Connection Lost Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConnectionLostType
	 * @generated
	 */
	public Adapter createConnectionLostTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ConnectType <em>Connect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ConnectType
	 * @generated
	 */
	public Adapter createConnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CreateFederationExecutionType <em>Create Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CreateFederationExecutionType
	 * @generated
	 */
	public Adapter createCreateFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.CreateRegionType <em>Create Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.CreateRegionType
	 * @generated
	 */
	public Adapter createCreateRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DataTypesType <em>Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DataTypesType
	 * @generated
	 */
	public Adapter createDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DeleteObjectInstanceType <em>Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DeleteRegionType <em>Delete Region Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DeleteRegionType
	 * @generated
	 */
	public Adapter createDeleteRegionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DestroyFederationExecutionType <em>Destroy Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DestroyFederationExecutionType
	 * @generated
	 */
	public Adapter createDestroyFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DimensionsType <em>Dimensions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DimensionsType
	 * @generated
	 */
	public Adapter createDimensionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DimensionsType1 <em>Dimensions Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DimensionsType1
	 * @generated
	 */
	public Adapter createDimensionsType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DimensionsType2 <em>Dimensions Type2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DimensionsType2
	 * @generated
	 */
	public Adapter createDimensionsType2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DimensionType <em>Dimension Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DimensionType
	 * @generated
	 */
	public Adapter createDimensionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DimensionType1 <em>Dimension Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DimensionType1
	 * @generated
	 */
	public Adapter createDimensionType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableAsynchronousDeliveryType <em>Disable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createDisableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType <em>Disable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType <em>Disable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableCallbacksType <em>Disable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableCallbacksType
	 * @generated
	 */
	public Adapter createDisableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType <em>Disable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType <em>Disable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createDisableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableTimeConstrainedType <em>Disable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableTimeConstrainedType
	 * @generated
	 */
	public Adapter createDisableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisableTimeRegulationType <em>Disable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisableTimeRegulationType
	 * @generated
	 */
	public Adapter createDisableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DisconnectType <em>Disconnect Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DisconnectType
	 * @generated
	 */
	public Adapter createDisconnectTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DiscoverObjectInstanceType <em>Discover Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DiscoverObjectInstanceType
	 * @generated
	 */
	public Adapter createDiscoverObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableAsynchronousDeliveryType <em>Enable Asynchronous Delivery Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableAsynchronousDeliveryType
	 * @generated
	 */
	public Adapter createEnableAsynchronousDeliveryTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType <em>Enable Attribute Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType <em>Enable Attribute Scope Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableAttributeScopeAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableCallbacksType <em>Enable Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableCallbacksType
	 * @generated
	 */
	public Adapter createEnableCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType <em>Enable Interaction Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableInteractionRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType <em>Enable Object Class Relevance Advisory Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType
	 * @generated
	 */
	public Adapter createEnableObjectClassRelevanceAdvisorySwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableTimeConstrainedType <em>Enable Time Constrained Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableTimeConstrainedType
	 * @generated
	 */
	public Adapter createEnableTimeConstrainedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnableTimeRegulationType <em>Enable Time Regulation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnableTimeRegulationType
	 * @generated
	 */
	public Adapter createEnableTimeRegulationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EndianType <em>Endian Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EndianType
	 * @generated
	 */
	public Adapter createEndianTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnumeratedDataType <em>Enumerated Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnumeratedDataType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnumeratedDataType1 <em>Enumerated Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnumeratedDataType1
	 * @generated
	 */
	public Adapter createEnumeratedDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnumeratedDataTypesType <em>Enumerated Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnumeratedDataTypesType
	 * @generated
	 */
	public Adapter createEnumeratedDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EnumeratorType <em>Enumerator Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EnumeratorType
	 * @generated
	 */
	public Adapter createEnumeratorTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EvokeCallbackType <em>Evoke Callback Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EvokeCallbackType
	 * @generated
	 */
	public Adapter createEvokeCallbackTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.EvokeMultipleCallbacksType <em>Evoke Multiple Callbacks Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.EvokeMultipleCallbacksType
	 * @generated
	 */
	public Adapter createEvokeMultipleCallbacksTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederateRestoreCompleteType <em>Federate Restore Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederateRestoreCompleteType
	 * @generated
	 */
	public Adapter createFederateRestoreCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederateSaveBegunType <em>Federate Save Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederateSaveBegunType
	 * @generated
	 */
	public Adapter createFederateSaveBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederateSaveCompleteType <em>Federate Save Complete Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederateSaveCompleteType
	 * @generated
	 */
	public Adapter createFederateSaveCompleteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationRestoreBegunType <em>Federation Restore Begun Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationRestoreBegunType
	 * @generated
	 */
	public Adapter createFederationRestoreBegunTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationRestoredType <em>Federation Restored Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationRestoredType
	 * @generated
	 */
	public Adapter createFederationRestoredTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationRestoreStatusResponseType <em>Federation Restore Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationRestoreStatusResponseType
	 * @generated
	 */
	public Adapter createFederationRestoreStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationSavedType <em>Federation Saved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationSavedType
	 * @generated
	 */
	public Adapter createFederationSavedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationSaveStatusResponseType <em>Federation Save Status Response Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationSaveStatusResponseType
	 * @generated
	 */
	public Adapter createFederationSaveStatusResponseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FederationSynchronizedType <em>Federation Synchronized Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FederationSynchronizedType
	 * @generated
	 */
	public Adapter createFederationSynchronizedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FieldType <em>Field Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FieldType
	 * @generated
	 */
	public Adapter createFieldTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FixedRecordDataType <em>Fixed Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FixedRecordDataType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FixedRecordDataType1 <em>Fixed Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FixedRecordDataType1
	 * @generated
	 */
	public Adapter createFixedRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FixedRecordDataTypesType <em>Fixed Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FixedRecordDataTypesType
	 * @generated
	 */
	public Adapter createFixedRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FixedRecordEncodingType <em>Fixed Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FixedRecordEncodingType
	 * @generated
	 */
	public Adapter createFixedRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.FlushQueueRequestType <em>Flush Queue Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.FlushQueueRequestType
	 * @generated
	 */
	public Adapter createFlushQueueRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetAttributeHandleType <em>Get Attribute Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetAttributeHandleType
	 * @generated
	 */
	public Adapter createGetAttributeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetAttributeNameType <em>Get Attribute Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetAttributeNameType
	 * @generated
	 */
	public Adapter createGetAttributeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetAutomaticResignDirectiveType <em>Get Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createGetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForClassAttributeType <em>Get Available Dimensions For Class Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForClassAttributeType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForClassAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForInteractionClassType <em>Get Available Dimensions For Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetAvailableDimensionsForInteractionClassType
	 * @generated
	 */
	public Adapter createGetAvailableDimensionsForInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetDimensionHandleSetType <em>Get Dimension Handle Set Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetDimensionHandleSetType
	 * @generated
	 */
	public Adapter createGetDimensionHandleSetTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetDimensionHandleType <em>Get Dimension Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetDimensionHandleType
	 * @generated
	 */
	public Adapter createGetDimensionHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetDimensionNameType <em>Get Dimension Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetDimensionNameType
	 * @generated
	 */
	public Adapter createGetDimensionNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetDimensionUpperBoundType <em>Get Dimension Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetDimensionUpperBoundType
	 * @generated
	 */
	public Adapter createGetDimensionUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetFederateHandleType <em>Get Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetFederateHandleType
	 * @generated
	 */
	public Adapter createGetFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetFederateNameType <em>Get Federate Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetFederateNameType
	 * @generated
	 */
	public Adapter createGetFederateNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetInteractionClassHandleType <em>Get Interaction Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetInteractionClassHandleType
	 * @generated
	 */
	public Adapter createGetInteractionClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetInteractionClassNameType <em>Get Interaction Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetInteractionClassNameType
	 * @generated
	 */
	public Adapter createGetInteractionClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetKnownObjectClassHandleType <em>Get Known Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetKnownObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetKnownObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetObjectClassHandleType <em>Get Object Class Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetObjectClassHandleType
	 * @generated
	 */
	public Adapter createGetObjectClassHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetObjectClassNameType <em>Get Object Class Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetObjectClassNameType
	 * @generated
	 */
	public Adapter createGetObjectClassNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetObjectInstanceHandleType <em>Get Object Instance Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetObjectInstanceHandleType
	 * @generated
	 */
	public Adapter createGetObjectInstanceHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetObjectInstanceNameType <em>Get Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetObjectInstanceNameType
	 * @generated
	 */
	public Adapter createGetObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetOrderNameType <em>Get Order Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetOrderNameType
	 * @generated
	 */
	public Adapter createGetOrderNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetOrderTypeType <em>Get Order Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetOrderTypeType
	 * @generated
	 */
	public Adapter createGetOrderTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetParameterHandleType <em>Get Parameter Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetParameterHandleType
	 * @generated
	 */
	public Adapter createGetParameterHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetParameterNameType <em>Get Parameter Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetParameterNameType
	 * @generated
	 */
	public Adapter createGetParameterNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetRangeBoundsType <em>Get Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetRangeBoundsType
	 * @generated
	 */
	public Adapter createGetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetTransportationTypeHandleType <em>Get Transportation Type Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetTransportationTypeHandleType
	 * @generated
	 */
	public Adapter createGetTransportationTypeHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetTransportationTypeNameType <em>Get Transportation Type Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetTransportationTypeNameType
	 * @generated
	 */
	public Adapter createGetTransportationTypeNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetUpdateRateValueForAttributeType <em>Get Update Rate Value For Attribute Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetUpdateRateValueForAttributeType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueForAttributeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GetUpdateRateValueType <em>Get Update Rate Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GetUpdateRateValueType
	 * @generated
	 */
	public Adapter createGetUpdateRateValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GlyphType <em>Glyph Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GlyphType
	 * @generated
	 */
	public Adapter createGlyphTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.GlyphType1 <em>Glyph Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.GlyphType1
	 * @generated
	 */
	public Adapter createGlyphType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.IdentificationType <em>Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.IdentificationType
	 * @generated
	 */
	public Adapter createIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.IdentifierType <em>Identifier Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.IdentifierType
	 * @generated
	 */
	public Adapter createIdentifierTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.IdReferenceType <em>Id Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.IdReferenceType
	 * @generated
	 */
	public Adapter createIdReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InformAttributeOwnershipType <em>Inform Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InformAttributeOwnershipType
	 * @generated
	 */
	public Adapter createInformAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InitiateFederateRestoreType <em>Initiate Federate Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InitiateFederateRestoreType
	 * @generated
	 */
	public Adapter createInitiateFederateRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InitiateFederateSaveType <em>Initiate Federate Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InitiateFederateSaveType
	 * @generated
	 */
	public Adapter createInitiateFederateSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InteractionClassType <em>Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InteractionClassType
	 * @generated
	 */
	public Adapter createInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InteractionClassType1 <em>Interaction Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InteractionClassType1
	 * @generated
	 */
	public Adapter createInteractionClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.InteractionsType <em>Interactions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.InteractionsType
	 * @generated
	 */
	public Adapter createInteractionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.IsAttributeOwnedByFederateType <em>Is Attribute Owned By Federate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.IsAttributeOwnedByFederateType
	 * @generated
	 */
	public Adapter createIsAttributeOwnedByFederateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.JoinFederationExecutionType <em>Join Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.JoinFederationExecutionType
	 * @generated
	 */
	public Adapter createJoinFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.KeywordType <em>Keyword Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.KeywordType
	 * @generated
	 */
	public Adapter createKeywordTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ListFederationExecutionsType <em>List Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ListFederationExecutionsType
	 * @generated
	 */
	public Adapter createListFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.LocalDeleteObjectInstanceType <em>Local Delete Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.LocalDeleteObjectInstanceType
	 * @generated
	 */
	public Adapter createLocalDeleteObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.LookaheadType <em>Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.LookaheadType
	 * @generated
	 */
	public Adapter createLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ModelIdentificationType <em>Model Identification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ModelIdentificationType
	 * @generated
	 */
	public Adapter createModelIdentificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ModelType <em>Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ModelType
	 * @generated
	 */
	public Adapter createModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ModificationDateType <em>Modification Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ModificationDateType
	 * @generated
	 */
	public Adapter createModificationDateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ModifyLookaheadType <em>Modify Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ModifyLookaheadType
	 * @generated
	 */
	public Adapter createModifyLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.MultipleObjectInstanceNamesReservedType <em>Multiple Object Instance Names Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.MultipleObjectInstanceNamesReservedType
	 * @generated
	 */
	public Adapter createMultipleObjectInstanceNamesReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType <em>Negotiated Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createNegotiatedAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NextMessageRequestAvailableType <em>Next Message Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NextMessageRequestAvailableType
	 * @generated
	 */
	public Adapter createNextMessageRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NextMessageRequestType <em>Next Message Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NextMessageRequestType
	 * @generated
	 */
	public Adapter createNextMessageRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NonEmptyString1 <em>Non Empty String1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NonEmptyString1
	 * @generated
	 */
	public Adapter createNonEmptyString1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NormalizeFederateHandleType <em>Normalize Federate Handle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NormalizeFederateHandleType
	 * @generated
	 */
	public Adapter createNormalizeFederateHandleTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NormalizeServiceGroupType <em>Normalize Service Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NormalizeServiceGroupType
	 * @generated
	 */
	public Adapter createNormalizeServiceGroupTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NotesType <em>Notes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NotesType
	 * @generated
	 */
	public Adapter createNotesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.NoteType
	 * @generated
	 */
	public Adapter createNoteTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ObjectClassType <em>Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ObjectClassType
	 * @generated
	 */
	public Adapter createObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ObjectClassType1 <em>Object Class Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ObjectClassType1
	 * @generated
	 */
	public Adapter createObjectClassType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ObjectInstanceNameReservedType <em>Object Instance Name Reserved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ObjectInstanceNameReservedType
	 * @generated
	 */
	public Adapter createObjectInstanceNameReservedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ObjectModelType <em>Object Model Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ObjectModelType
	 * @generated
	 */
	public Adapter createObjectModelTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ObjectsType <em>Objects Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ObjectsType
	 * @generated
	 */
	public Adapter createObjectsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.OrderType <em>Order Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.OrderType
	 * @generated
	 */
	public Adapter createOrderTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.OwnershipType <em>Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.OwnershipType
	 * @generated
	 */
	public Adapter createOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ParameterType
	 * @generated
	 */
	public Adapter createParameterTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ParameterType1 <em>Parameter Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ParameterType1
	 * @generated
	 */
	public Adapter createParameterType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.PocType <em>Poc Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.PocType
	 * @generated
	 */
	public Adapter createPocTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.PocType1 <em>Poc Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.PocType1
	 * @generated
	 */
	public Adapter createPocType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.PocTypeType <em>Poc Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.PocTypeType
	 * @generated
	 */
	public Adapter createPocTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ProvideAttributeValueUpdateType <em>Provide Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ProvideAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createProvideAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.PublishInteractionClassType <em>Publish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.PublishInteractionClassType
	 * @generated
	 */
	public Adapter createPublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.PublishObjectClassAttributesType <em>Publish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.PublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createPublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryAttributeOwnershipType <em>Query Attribute Ownership Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryAttributeOwnershipType
	 * @generated
	 */
	public Adapter createQueryAttributeOwnershipTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryAttributeTransportationTypeType <em>Query Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryFederationRestoreStatusType <em>Query Federation Restore Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryFederationRestoreStatusType
	 * @generated
	 */
	public Adapter createQueryFederationRestoreStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryFederationSaveStatusType <em>Query Federation Save Status Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryFederationSaveStatusType
	 * @generated
	 */
	public Adapter createQueryFederationSaveStatusTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryGALTType <em>Query GALT Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryGALTType
	 * @generated
	 */
	public Adapter createQueryGALTTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryInteractionTransportationTypeType <em>Query Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createQueryInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryLITSType <em>Query LITS Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryLITSType
	 * @generated
	 */
	public Adapter createQueryLITSTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryLogicalTimeType <em>Query Logical Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryLogicalTimeType
	 * @generated
	 */
	public Adapter createQueryLogicalTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.QueryLookaheadType <em>Query Lookahead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.QueryLookaheadType
	 * @generated
	 */
	public Adapter createQueryLookaheadTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RateType <em>Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RateType
	 * @generated
	 */
	public Adapter createRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReceiveInteractionType <em>Receive Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReceiveInteractionType
	 * @generated
	 */
	public Adapter createReceiveInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReferenceType
	 * @generated
	 */
	public Adapter createReferenceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReflectAttributeValuesType <em>Reflect Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReflectAttributeValuesType
	 * @generated
	 */
	public Adapter createReflectAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RegisterFederationSynchronizationPointType <em>Register Federation Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RegisterFederationSynchronizationPointType
	 * @generated
	 */
	public Adapter createRegisterFederationSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RegisterObjectInstanceType <em>Register Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RegisterObjectInstanceType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RegisterObjectInstanceWithRegionsType <em>Register Object Instance With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RegisterObjectInstanceWithRegionsType
	 * @generated
	 */
	public Adapter createRegisterObjectInstanceWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType <em>Release Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReleaseMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReleaseObjectInstanceNameType <em>Release Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReleaseObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReleaseObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReliableType <em>Reliable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReliableType
	 * @generated
	 */
	public Adapter createReliableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RemoveobjectinstanceType <em>Removeobjectinstance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RemoveobjectinstanceType
	 * @generated
	 */
	public Adapter createRemoveobjectinstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReportAttributeTransportationTypeType <em>Report Attribute Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReportAttributeTransportationTypeType
	 * @generated
	 */
	public Adapter createReportAttributeTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReportFederationExecutionsType <em>Report Federation Executions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReportFederationExecutionsType
	 * @generated
	 */
	public Adapter createReportFederationExecutionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReportInteractionTransportationTypeType <em>Report Interaction Transportation Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReportInteractionTransportationTypeType
	 * @generated
	 */
	public Adapter createReportInteractionTransportationTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipAssumptionType <em>Request Attribute Ownership Assumption Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipAssumptionType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipAssumptionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipReleaseType <em>Request Attribute Ownership Release Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestAttributeOwnershipReleaseType
	 * @generated
	 */
	public Adapter createRequestAttributeOwnershipReleaseTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestAttributeTransportationTypeChangeType <em>Request Attribute Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestAttributeTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestAttributeTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateType <em>Request Attribute Value Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType <em>Request Attribute Value Update With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestAttributeValueUpdateWithRegionsType
	 * @generated
	 */
	public Adapter createRequestAttributeValueUpdateWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestDivestitureConfirmationType <em>Request Divestiture Confirmation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestDivestitureConfirmationType
	 * @generated
	 */
	public Adapter createRequestDivestitureConfirmationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestFederationRestoreType <em>Request Federation Restore Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestFederationRestoreType
	 * @generated
	 */
	public Adapter createRequestFederationRestoreTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestFederationSaveType <em>Request Federation Save Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestFederationSaveType
	 * @generated
	 */
	public Adapter createRequestFederationSaveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestInteractionTransportationTypeChangeType <em>Request Interaction Transportation Type Change Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestInteractionTransportationTypeChangeType
	 * @generated
	 */
	public Adapter createRequestInteractionTransportationTypeChangeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RequestRetractionType <em>Request Retraction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RequestRetractionType
	 * @generated
	 */
	public Adapter createRequestRetractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReserveMultipleObjectInstanceNamesType <em>Reserve Multiple Object Instance Names Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReserveMultipleObjectInstanceNamesType
	 * @generated
	 */
	public Adapter createReserveMultipleObjectInstanceNamesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ReserveObjectInstanceNameType <em>Reserve Object Instance Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ReserveObjectInstanceNameType
	 * @generated
	 */
	public Adapter createReserveObjectInstanceNameTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ResignFederationExecutionType <em>Resign Federation Execution Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ResignFederationExecutionType
	 * @generated
	 */
	public Adapter createResignFederationExecutionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ResignSwitchType <em>Resign Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ResignSwitchType
	 * @generated
	 */
	public Adapter createResignSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.RetractType <em>Retract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.RetractType
	 * @generated
	 */
	public Adapter createRetractTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SecurityClassificationType <em>Security Classification Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SecurityClassificationType
	 * @generated
	 */
	public Adapter createSecurityClassificationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SendInteractionType <em>Send Interaction Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SendInteractionType
	 * @generated
	 */
	public Adapter createSendInteractionTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SendInteractionWithRegionsType <em>Send Interaction With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SendInteractionWithRegionsType
	 * @generated
	 */
	public Adapter createSendInteractionWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType <em>Service Utilization Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ServiceUtilizationType
	 * @generated
	 */
	public Adapter createServiceUtilizationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SetAutomaticResignDirectiveType <em>Set Automatic Resign Directive Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SetAutomaticResignDirectiveType
	 * @generated
	 */
	public Adapter createSetAutomaticResignDirectiveTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SetRangeBoundsType <em>Set Range Bounds Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SetRangeBoundsType
	 * @generated
	 */
	public Adapter createSetRangeBoundsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SharingType <em>Sharing Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SharingType
	 * @generated
	 */
	public Adapter createSharingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SimpleDataType <em>Simple Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SimpleDataType
	 * @generated
	 */
	public Adapter createSimpleDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SimpleDataType1 <em>Simple Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SimpleDataType1
	 * @generated
	 */
	public Adapter createSimpleDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SimpleDataTypesType <em>Simple Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SimpleDataTypesType
	 * @generated
	 */
	public Adapter createSimpleDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.Size <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.Size
	 * @generated
	 */
	public Adapter createSizeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.StartRegistrationForObjectClassType <em>Start Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.StartRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStartRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.StopRegistrationForObjectClassType <em>Stop Registration For Object Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.StopRegistrationForObjectClassType
	 * @generated
	 */
	public Adapter createStopRegistrationForObjectClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.String <em>String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.String
	 * @generated
	 */
	public Adapter createStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SubscribeInteractionClassType <em>Subscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SubscribeInteractionClassWithRegionsType <em>Subscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesType <em>Subscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType <em>Subscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createSubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SwitchesType <em>Switches Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SwitchesType
	 * @generated
	 */
	public Adapter createSwitchesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SwitchType <em>Switch Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SwitchType
	 * @generated
	 */
	public Adapter createSwitchTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SynchronizationPointAchievedType <em>Synchronization Point Achieved Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SynchronizationPointAchievedType
	 * @generated
	 */
	public Adapter createSynchronizationPointAchievedTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SynchronizationPointType <em>Synchronization Point Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SynchronizationPointType
	 * @generated
	 */
	public Adapter createSynchronizationPointTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SynchronizationPointType1 <em>Synchronization Point Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SynchronizationPointType1
	 * @generated
	 */
	public Adapter createSynchronizationPointType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.SynchronizationsType <em>Synchronizations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.SynchronizationsType
	 * @generated
	 */
	public Adapter createSynchronizationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TagsType <em>Tags Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TagsType
	 * @generated
	 */
	public Adapter createTagsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TagType <em>Tag Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TagType
	 * @generated
	 */
	public Adapter createTagTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeAdvanceGrantType <em>Time Advance Grant Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeAdvanceGrantType
	 * @generated
	 */
	public Adapter createTimeAdvanceGrantTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeAdvanceRequestAvailableType <em>Time Advance Request Available Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeAdvanceRequestAvailableType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestAvailableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeAdvanceRequestType <em>Time Advance Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeAdvanceRequestType
	 * @generated
	 */
	public Adapter createTimeAdvanceRequestTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeConstrainedEnabledType <em>Time Constrained Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeConstrainedEnabledType
	 * @generated
	 */
	public Adapter createTimeConstrainedEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeRegulationEnabledType <em>Time Regulation Enabled Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeRegulationEnabledType
	 * @generated
	 */
	public Adapter createTimeRegulationEnabledTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeStampType <em>Time Stamp Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeStampType
	 * @generated
	 */
	public Adapter createTimeStampTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TimeType <em>Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TimeType
	 * @generated
	 */
	public Adapter createTimeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TransportationsType <em>Transportations Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TransportationsType
	 * @generated
	 */
	public Adapter createTransportationsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TransportationType <em>Transportation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TransportationType
	 * @generated
	 */
	public Adapter createTransportationTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TransportationType1 <em>Transportation Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TransportationType1
	 * @generated
	 */
	public Adapter createTransportationType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TurnInteractionsOffType <em>Turn Interactions Off Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TurnInteractionsOffType
	 * @generated
	 */
	public Adapter createTurnInteractionsOffTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TurnInteractionsOnType <em>Turn Interactions On Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TurnInteractionsOnType
	 * @generated
	 */
	public Adapter createTurnInteractionsOnTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TurnUpdatesOffForObjectInstanceType <em>Turn Updates Off For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TurnUpdatesOffForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOffForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TurnUpdatesOnForObjectInstanceType <em>Turn Updates On For Object Instance Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TurnUpdatesOnForObjectInstanceType
	 * @generated
	 */
	public Adapter createTurnUpdatesOnForObjectInstanceTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.TypeType <em>Type Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.TypeType
	 * @generated
	 */
	public Adapter createTypeTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnassociateRegionsForUpdatesType <em>Unassociate Regions For Updates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnassociateRegionsForUpdatesType
	 * @generated
	 */
	public Adapter createUnassociateRegionsForUpdatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType <em>Unconditional Attribute Ownership Divestiture Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType
	 * @generated
	 */
	public Adapter createUnconditionalAttributeOwnershipDivestitureTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnpublishInteractionClassType <em>Unpublish Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnpublishInteractionClassType
	 * @generated
	 */
	public Adapter createUnpublishInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnpublishObjectClassAttributesType <em>Unpublish Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnpublishObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnpublishObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassType <em>Unsubscribe Interaction Class Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType <em>Unsubscribe Interaction Class With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeInteractionClassWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesType <em>Unsubscribe Object Class Attributes Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType <em>Unsubscribe Object Class Attributes With Regions Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType
	 * @generated
	 */
	public Adapter createUnsubscribeObjectClassAttributesWithRegionsTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UpdateAttributeValuesType <em>Update Attribute Values Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UpdateAttributeValuesType
	 * @generated
	 */
	public Adapter createUpdateAttributeValuesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UpdateRatesType <em>Update Rates Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UpdateRatesType
	 * @generated
	 */
	public Adapter createUpdateRatesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UpdateRateType <em>Update Rate Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UpdateRateType
	 * @generated
	 */
	public Adapter createUpdateRateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UpdateType <em>Update Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UpdateType
	 * @generated
	 */
	public Adapter createUpdateTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.UpperBoundType <em>Upper Bound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.UpperBoundType
	 * @generated
	 */
	public Adapter createUpperBoundTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.ValueType <em>Value Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.ValueType
	 * @generated
	 */
	public Adapter createValueTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.VariantRecordDataType <em>Variant Record Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.VariantRecordDataType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.VariantRecordDataType1 <em>Variant Record Data Type1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.VariantRecordDataType1
	 * @generated
	 */
	public Adapter createVariantRecordDataType1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.VariantRecordDataTypesType <em>Variant Record Data Types Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.VariantRecordDataTypesType
	 * @generated
	 */
	public Adapter createVariantRecordDataTypesTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ieee.standards.ieee1516._2010.VariantRecordEncodingType <em>Variant Record Encoding Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ieee.standards.ieee1516._2010.VariantRecordEncodingType
	 * @generated
	 */
	public Adapter createVariantRecordEncodingTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //_2010AdapterFactory
