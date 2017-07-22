/**
 */
package org.ieee.standards.ieee1516._2010.impl;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ieee.standards.ieee1516._2010.AbortFederationRestoreType;
import org.ieee.standards.ieee1516._2010.AbortFederationSaveType;
import org.ieee.standards.ieee1516._2010.AnnounceSynchronizationPointType;
import org.ieee.standards.ieee1516._2010.AssociateRegionsForUpdatesType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionIfAvailableType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionNotificationType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipAcquisitionType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipDivestitureIfWantedType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipReleaseDeniedType;
import org.ieee.standards.ieee1516._2010.AttributeOwnershipUnavailableType;
import org.ieee.standards.ieee1516._2010.AttributesInScopeType;
import org.ieee.standards.ieee1516._2010.AttributesOutOfScopeType;
import org.ieee.standards.ieee1516._2010.CancelAttributeOwnershipAcquisitionType;
import org.ieee.standards.ieee1516._2010.CancelNegotiatedAttributeOwnershipDivestitureType;
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
import org.ieee.standards.ieee1516._2010.DeleteObjectInstanceType;
import org.ieee.standards.ieee1516._2010.DeleteRegionType;
import org.ieee.standards.ieee1516._2010.DestroyFederationExecutionType;
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
import org.ieee.standards.ieee1516._2010.EnableAsynchronousDeliveryType;
import org.ieee.standards.ieee1516._2010.EnableAttributeRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableAttributeScopeAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableCallbacksType;
import org.ieee.standards.ieee1516._2010.EnableInteractionRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableObjectClassRelevanceAdvisorySwitchType;
import org.ieee.standards.ieee1516._2010.EnableTimeConstrainedType;
import org.ieee.standards.ieee1516._2010.EnableTimeRegulationType;
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
import org.ieee.standards.ieee1516._2010.InformAttributeOwnershipType;
import org.ieee.standards.ieee1516._2010.InitiateFederateRestoreType;
import org.ieee.standards.ieee1516._2010.InitiateFederateSaveType;
import org.ieee.standards.ieee1516._2010.IsAttributeOwnedByFederateType;
import org.ieee.standards.ieee1516._2010.JoinFederationExecutionType;
import org.ieee.standards.ieee1516._2010.ListFederationExecutionsType;
import org.ieee.standards.ieee1516._2010.LocalDeleteObjectInstanceType;
import org.ieee.standards.ieee1516._2010.ModifyLookaheadType;
import org.ieee.standards.ieee1516._2010.MultipleObjectInstanceNamesReservedType;
import org.ieee.standards.ieee1516._2010.NegotiatedAttributeOwnershipDivestitureType;
import org.ieee.standards.ieee1516._2010.NextMessageRequestAvailableType;
import org.ieee.standards.ieee1516._2010.NextMessageRequestType;
import org.ieee.standards.ieee1516._2010.NormalizeFederateHandleType;
import org.ieee.standards.ieee1516._2010.NormalizeServiceGroupType;
import org.ieee.standards.ieee1516._2010.ObjectInstanceNameReservedType;
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
import org.ieee.standards.ieee1516._2010.ReceiveInteractionType;
import org.ieee.standards.ieee1516._2010.ReflectAttributeValuesType;
import org.ieee.standards.ieee1516._2010.RegisterFederationSynchronizationPointType;
import org.ieee.standards.ieee1516._2010.RegisterObjectInstanceType;
import org.ieee.standards.ieee1516._2010.RegisterObjectInstanceWithRegionsType;
import org.ieee.standards.ieee1516._2010.ReleaseMultipleObjectInstanceNamesType;
import org.ieee.standards.ieee1516._2010.ReleaseObjectInstanceNameType;
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
import org.ieee.standards.ieee1516._2010.RetractType;
import org.ieee.standards.ieee1516._2010.SendInteractionType;
import org.ieee.standards.ieee1516._2010.SendInteractionWithRegionsType;
import org.ieee.standards.ieee1516._2010.ServiceUtilizationType;
import org.ieee.standards.ieee1516._2010.SetAutomaticResignDirectiveType;
import org.ieee.standards.ieee1516._2010.SetRangeBoundsType;
import org.ieee.standards.ieee1516._2010.StartRegistrationForObjectClassType;
import org.ieee.standards.ieee1516._2010.StopRegistrationForObjectClassType;
import org.ieee.standards.ieee1516._2010.SubscribeInteractionClassType;
import org.ieee.standards.ieee1516._2010.SubscribeInteractionClassWithRegionsType;
import org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.SubscribeObjectClassAttributesWithRegionsType;
import org.ieee.standards.ieee1516._2010.SynchronizationPointAchievedType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceGrantType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceRequestAvailableType;
import org.ieee.standards.ieee1516._2010.TimeAdvanceRequestType;
import org.ieee.standards.ieee1516._2010.TimeConstrainedEnabledType;
import org.ieee.standards.ieee1516._2010.TimeRegulationEnabledType;
import org.ieee.standards.ieee1516._2010.TurnInteractionsOffType;
import org.ieee.standards.ieee1516._2010.TurnInteractionsOnType;
import org.ieee.standards.ieee1516._2010.TurnUpdatesOffForObjectInstanceType;
import org.ieee.standards.ieee1516._2010.TurnUpdatesOnForObjectInstanceType;
import org.ieee.standards.ieee1516._2010.UnassociateRegionsForUpdatesType;
import org.ieee.standards.ieee1516._2010.UnconditionalAttributeOwnershipDivestitureType;
import org.ieee.standards.ieee1516._2010.UnpublishInteractionClassType;
import org.ieee.standards.ieee1516._2010.UnpublishObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassType;
import org.ieee.standards.ieee1516._2010.UnsubscribeInteractionClassWithRegionsType;
import org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesType;
import org.ieee.standards.ieee1516._2010.UnsubscribeObjectClassAttributesWithRegionsType;
import org.ieee.standards.ieee1516._2010.UpdateAttributeValuesType;
import org.ieee.standards.ieee1516._2010._2010Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConnect <em>Connect</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConnectionLost <em>Connection Lost</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getCreateFederationExecution <em>Create Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDestroyFederationExecution <em>Destroy Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getListFederationExecutions <em>List Federation Executions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReportFederationExecutions <em>Report Federation Executions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getJoinFederationExecution <em>Join Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getResignFederationExecution <em>Resign Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRegisterFederationSynchronizationPoint <em>Register Federation Synchronization Point</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmSynchronizationPointRegistration <em>Confirm Synchronization Point Registration</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAnnounceSynchronizationPoint <em>Announce Synchronization Point</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSynchronizationPointAchieved <em>Synchronization Point Achieved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationSynchronized <em>Federation Synchronized</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestFederationSave <em>Request Federation Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getInitiateFederateSave <em>Initiate Federate Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederateSaveBegun <em>Federate Save Begun</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederateSaveComplete <em>Federate Save Complete</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationSaved <em>Federation Saved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAbortFederationSave <em>Abort Federation Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryFederationSaveStatus <em>Query Federation Save Status</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationSaveStatusResponse <em>Federation Save Status Response</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestFederationRestore <em>Request Federation Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmFederationRestorationRequest <em>Confirm Federation Restoration Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationRestoreBegun <em>Federation Restore Begun</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getInitiateFederateRestore <em>Initiate Federate Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederateRestoreComplete <em>Federate Restore Complete</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationRestored <em>Federation Restored</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAbortFederationRestore <em>Abort Federation Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryFederationRestoreStatus <em>Query Federation Restore Status</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFederationRestoreStatusResponse <em>Federation Restore Status Response</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getPublishObjectClassAttributes <em>Publish Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnpublishObjectClassAttributes <em>Unpublish Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getPublishInteractionClass <em>Publish Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnpublishInteractionClass <em>Unpublish Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSubscribeObjectClassAttributes <em>Subscribe Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnsubscribeObjectClassAttributes <em>Unsubscribe Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSubscribeInteractionClass <em>Subscribe Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnsubscribeInteractionClass <em>Unsubscribe Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getStartRegistrationForObjectClass <em>Start Registration For Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getStopRegistrationForObjectClass <em>Stop Registration For Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTurnInteractionsOn <em>Turn Interactions On</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTurnInteractionsOff <em>Turn Interactions Off</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReserveObjectInstanceName <em>Reserve Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getObjectInstanceNameReserved <em>Object Instance Name Reserved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReleaseObjectInstanceName <em>Release Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReserveMultipleObjectInstanceNames <em>Reserve Multiple Object Instance Names</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getMultipleObjectInstanceNamesReserved <em>Multiple Object Instance Names Reserved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReleaseMultipleObjectInstanceNames <em>Release Multiple Object Instance Names</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRegisterObjectInstance <em>Register Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDiscoverObjectInstance <em>Discover Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUpdateAttributeValues <em>Update Attribute Values</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReflectAttributeValues <em>Reflect Attribute Values</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSendInteraction <em>Send Interaction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReceiveInteraction <em>Receive Interaction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDeleteObjectInstance <em>Delete Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRemoveobjectinstance <em>Removeobjectinstance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getLocalDeleteObjectInstance <em>Local Delete Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributesInScope <em>Attributes In Scope</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributesOutOfScope <em>Attributes Out Of Scope</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestAttributeValueUpdate <em>Request Attribute Value Update</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getProvideAttributeValueUpdate <em>Provide Attribute Value Update</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTurnUpdatesOnForObjectInstance <em>Turn Updates On For Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTurnUpdatesOffForObjectInstance <em>Turn Updates Off For Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestAttributeTransportationTypeChange <em>Request Attribute Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmAttributeTransportationTypeChange <em>Confirm Attribute Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryAttributeTransportationType <em>Query Attribute Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReportAttributeTransportationType <em>Report Attribute Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestInteractionTransportationTypeChange <em>Request Interaction Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmInteractionTransportationTypeChange <em>Confirm Interaction Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryInteractionTransportationType <em>Query Interaction Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getReportInteractionTransportationType <em>Report Interaction Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnconditionalAttributeOwnershipDivestiture <em>Unconditional Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNegotiatedAttributeOwnershipDivestiture <em>Negotiated Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestAttributeOwnershipAssumption <em>Request Attribute Ownership Assumption</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestDivestitureConfirmation <em>Request Divestiture Confirmation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmDivestiture <em>Confirm Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipAcquisitionNotification <em>Attribute Ownership Acquisition Notification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipAcquisition <em>Attribute Ownership Acquisition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipAcquisitionIfAvailable <em>Attribute Ownership Acquisition If Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipUnavailable <em>Attribute Ownership Unavailable</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestAttributeOwnershipRelease <em>Request Attribute Ownership Release</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipReleaseDenied <em>Attribute Ownership Release Denied</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAttributeOwnershipDivestitureIfWanted <em>Attribute Ownership Divestiture If Wanted</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getCancelNegotiatedAttributeOwnershipDivestiture <em>Cancel Negotiated Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getCancelAttributeOwnershipAcquisition <em>Cancel Attribute Ownership Acquisition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getConfirmAttributeOwnershipAcquisitionCancellation <em>Confirm Attribute Ownership Acquisition Cancellation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryAttributeOwnership <em>Query Attribute Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getInformAttributeOwnership <em>Inform Attribute Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getIsAttributeOwnedByFederate <em>Is Attribute Owned By Federate</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableTimeRegulation <em>Enable Time Regulation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTimeRegulationEnabled <em>Time Regulation Enabled</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableTimeRegulation <em>Disable Time Regulation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableTimeConstrained <em>Enable Time Constrained</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTimeConstrainedEnabled <em>Time Constrained Enabled</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableTimeConstrained <em>Disable Time Constrained</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTimeAdvanceRequest <em>Time Advance Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTimeAdvanceRequestAvailable <em>Time Advance Request Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNextMessageRequest <em>Next Message Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNextMessageRequestAvailable <em>Next Message Request Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getFlushQueueRequest <em>Flush Queue Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getTimeAdvanceGrant <em>Time Advance Grant</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableAsynchronousDelivery <em>Enable Asynchronous Delivery</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableAsynchronousDelivery <em>Disable Asynchronous Delivery</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryGALT <em>Query GALT</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryLogicalTime <em>Query Logical Time</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryLITS <em>Query LITS</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getModifyLookahead <em>Modify Lookahead</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getQueryLookahead <em>Query Lookahead</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRetract <em>Retract</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestRetraction <em>Request Retraction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getChangeAttributeOrderType <em>Change Attribute Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getChangeInteractionOrderType <em>Change Interaction Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getCreateRegion <em>Create Region</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getCommitRegionModifications <em>Commit Region Modifications</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDeleteRegion <em>Delete Region</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRegisterObjectInstanceWithRegions <em>Register Object Instance With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAssociateRegionsForUpdates <em>Associate Regions For Updates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnassociateRegionsForUpdates <em>Unassociate Regions For Updates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSubscribeObjectClassAttributesWithRegions <em>Subscribe Object Class Attributes With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnsubscribeObjectClassAttributesWithRegions <em>Unsubscribe Object Class Attributes With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSubscribeInteractionClassWithRegions <em>Subscribe Interaction Class With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getUnsubscribeInteractionClassWithRegions <em>Unsubscribe Interaction Class With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSendInteractionWithRegions <em>Send Interaction With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getRequestAttributeValueUpdateWithRegions <em>Request Attribute Value Update With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetAutomaticResignDirective <em>Get Automatic Resign Directive</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSetAutomaticResignDirective <em>Set Automatic Resign Directive</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetFederateHandle <em>Get Federate Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetFederateName <em>Get Federate Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetObjectClassHandle <em>Get Object Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetObjectClassName <em>Get Object Class Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetKnownObjectClassHandle <em>Get Known Object Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetObjectInstanceHandle <em>Get Object Instance Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetObjectInstanceName <em>Get Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetAttributeHandle <em>Get Attribute Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetAttributeName <em>Get Attribute Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetUpdateRateValue <em>Get Update Rate Value</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetUpdateRateValueForAttribute <em>Get Update Rate Value For Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetInteractionClassHandle <em>Get Interaction Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetInteractionClassName <em>Get Interaction Class Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetParameterHandle <em>Get Parameter Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetParameterName <em>Get Parameter Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetOrderType <em>Get Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetOrderName <em>Get Order Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetTransportationTypeHandle <em>Get Transportation Type Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetTransportationTypeName <em>Get Transportation Type Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetAvailableDimensionsForClassAttribute <em>Get Available Dimensions For Class Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetAvailableDimensionsForInteractionClass <em>Get Available Dimensions For Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetDimensionHandle <em>Get Dimension Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetDimensionName <em>Get Dimension Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetDimensionUpperBound <em>Get Dimension Upper Bound</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetDimensionHandleSet <em>Get Dimension Handle Set</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getGetRangeBounds <em>Get Range Bounds</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getSetRangeBounds <em>Set Range Bounds</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNormalizeFederateHandle <em>Normalize Federate Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNormalizeServiceGroup <em>Normalize Service Group</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableObjectClassRelevanceAdvisorySwitch <em>Enable Object Class Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableObjectClassRelevanceAdvisorySwitch <em>Disable Object Class Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableAttributeRelevanceAdvisorySwitch <em>Enable Attribute Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableAttributeRelevanceAdvisorySwitch <em>Disable Attribute Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableAttributeScopeAdvisorySwitch <em>Enable Attribute Scope Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableAttributeScopeAdvisorySwitch <em>Disable Attribute Scope Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableInteractionRelevanceAdvisorySwitch <em>Enable Interaction Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableInteractionRelevanceAdvisorySwitch <em>Disable Interaction Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEvokeCallback <em>Evoke Callback</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEvokeMultipleCallbacks <em>Evoke Multiple Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getEnableCallbacks <em>Enable Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getDisableCallbacks <em>Disable Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.impl.ServiceUtilizationTypeImpl#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceUtilizationTypeImpl extends MinimalEObjectImpl.Container implements ServiceUtilizationType {
	/**
	 * The cached value of the '{@link #getConnect() <em>Connect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnect()
	 * @generated
	 * @ordered
	 */
	protected ConnectType connect;

	/**
	 * The cached value of the '{@link #getDisconnect() <em>Disconnect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisconnect()
	 * @generated
	 * @ordered
	 */
	protected DisconnectType disconnect;

	/**
	 * The cached value of the '{@link #getConnectionLost() <em>Connection Lost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionLost()
	 * @generated
	 * @ordered
	 */
	protected ConnectionLostType connectionLost;

	/**
	 * The cached value of the '{@link #getCreateFederationExecution() <em>Create Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateFederationExecution()
	 * @generated
	 * @ordered
	 */
	protected CreateFederationExecutionType createFederationExecution;

	/**
	 * The cached value of the '{@link #getDestroyFederationExecution() <em>Destroy Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestroyFederationExecution()
	 * @generated
	 * @ordered
	 */
	protected DestroyFederationExecutionType destroyFederationExecution;

	/**
	 * The cached value of the '{@link #getListFederationExecutions() <em>List Federation Executions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListFederationExecutions()
	 * @generated
	 * @ordered
	 */
	protected ListFederationExecutionsType listFederationExecutions;

	/**
	 * The cached value of the '{@link #getReportFederationExecutions() <em>Report Federation Executions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportFederationExecutions()
	 * @generated
	 * @ordered
	 */
	protected ReportFederationExecutionsType reportFederationExecutions;

	/**
	 * The cached value of the '{@link #getJoinFederationExecution() <em>Join Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJoinFederationExecution()
	 * @generated
	 * @ordered
	 */
	protected JoinFederationExecutionType joinFederationExecution;

	/**
	 * The cached value of the '{@link #getResignFederationExecution() <em>Resign Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResignFederationExecution()
	 * @generated
	 * @ordered
	 */
	protected ResignFederationExecutionType resignFederationExecution;

	/**
	 * The cached value of the '{@link #getRegisterFederationSynchronizationPoint() <em>Register Federation Synchronization Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterFederationSynchronizationPoint()
	 * @generated
	 * @ordered
	 */
	protected RegisterFederationSynchronizationPointType registerFederationSynchronizationPoint;

	/**
	 * The cached value of the '{@link #getConfirmSynchronizationPointRegistration() <em>Confirm Synchronization Point Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmSynchronizationPointRegistration()
	 * @generated
	 * @ordered
	 */
	protected ConfirmSynchronizationPointRegistrationType confirmSynchronizationPointRegistration;

	/**
	 * The cached value of the '{@link #getAnnounceSynchronizationPoint() <em>Announce Synchronization Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnounceSynchronizationPoint()
	 * @generated
	 * @ordered
	 */
	protected AnnounceSynchronizationPointType announceSynchronizationPoint;

	/**
	 * The cached value of the '{@link #getSynchronizationPointAchieved() <em>Synchronization Point Achieved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSynchronizationPointAchieved()
	 * @generated
	 * @ordered
	 */
	protected SynchronizationPointAchievedType synchronizationPointAchieved;

	/**
	 * The cached value of the '{@link #getFederationSynchronized() <em>Federation Synchronized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationSynchronized()
	 * @generated
	 * @ordered
	 */
	protected FederationSynchronizedType federationSynchronized;

	/**
	 * The cached value of the '{@link #getRequestFederationSave() <em>Request Federation Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFederationSave()
	 * @generated
	 * @ordered
	 */
	protected RequestFederationSaveType requestFederationSave;

	/**
	 * The cached value of the '{@link #getInitiateFederateSave() <em>Initiate Federate Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiateFederateSave()
	 * @generated
	 * @ordered
	 */
	protected InitiateFederateSaveType initiateFederateSave;

	/**
	 * The cached value of the '{@link #getFederateSaveBegun() <em>Federate Save Begun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederateSaveBegun()
	 * @generated
	 * @ordered
	 */
	protected FederateSaveBegunType federateSaveBegun;

	/**
	 * The cached value of the '{@link #getFederateSaveComplete() <em>Federate Save Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederateSaveComplete()
	 * @generated
	 * @ordered
	 */
	protected FederateSaveCompleteType federateSaveComplete;

	/**
	 * The cached value of the '{@link #getFederationSaved() <em>Federation Saved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationSaved()
	 * @generated
	 * @ordered
	 */
	protected FederationSavedType federationSaved;

	/**
	 * The cached value of the '{@link #getAbortFederationSave() <em>Abort Federation Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortFederationSave()
	 * @generated
	 * @ordered
	 */
	protected AbortFederationSaveType abortFederationSave;

	/**
	 * The cached value of the '{@link #getQueryFederationSaveStatus() <em>Query Federation Save Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFederationSaveStatus()
	 * @generated
	 * @ordered
	 */
	protected QueryFederationSaveStatusType queryFederationSaveStatus;

	/**
	 * The cached value of the '{@link #getFederationSaveStatusResponse() <em>Federation Save Status Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationSaveStatusResponse()
	 * @generated
	 * @ordered
	 */
	protected FederationSaveStatusResponseType federationSaveStatusResponse;

	/**
	 * The cached value of the '{@link #getRequestFederationRestore() <em>Request Federation Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestFederationRestore()
	 * @generated
	 * @ordered
	 */
	protected RequestFederationRestoreType requestFederationRestore;

	/**
	 * The cached value of the '{@link #getConfirmFederationRestorationRequest() <em>Confirm Federation Restoration Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmFederationRestorationRequest()
	 * @generated
	 * @ordered
	 */
	protected ConfirmFederationRestorationRequestType confirmFederationRestorationRequest;

	/**
	 * The cached value of the '{@link #getFederationRestoreBegun() <em>Federation Restore Begun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationRestoreBegun()
	 * @generated
	 * @ordered
	 */
	protected FederationRestoreBegunType federationRestoreBegun;

	/**
	 * The cached value of the '{@link #getInitiateFederateRestore() <em>Initiate Federate Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitiateFederateRestore()
	 * @generated
	 * @ordered
	 */
	protected InitiateFederateRestoreType initiateFederateRestore;

	/**
	 * The cached value of the '{@link #getFederateRestoreComplete() <em>Federate Restore Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederateRestoreComplete()
	 * @generated
	 * @ordered
	 */
	protected FederateRestoreCompleteType federateRestoreComplete;

	/**
	 * The cached value of the '{@link #getFederationRestored() <em>Federation Restored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationRestored()
	 * @generated
	 * @ordered
	 */
	protected FederationRestoredType federationRestored;

	/**
	 * The cached value of the '{@link #getAbortFederationRestore() <em>Abort Federation Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbortFederationRestore()
	 * @generated
	 * @ordered
	 */
	protected AbortFederationRestoreType abortFederationRestore;

	/**
	 * The cached value of the '{@link #getQueryFederationRestoreStatus() <em>Query Federation Restore Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryFederationRestoreStatus()
	 * @generated
	 * @ordered
	 */
	protected QueryFederationRestoreStatusType queryFederationRestoreStatus;

	/**
	 * The cached value of the '{@link #getFederationRestoreStatusResponse() <em>Federation Restore Status Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFederationRestoreStatusResponse()
	 * @generated
	 * @ordered
	 */
	protected FederationRestoreStatusResponseType federationRestoreStatusResponse;

	/**
	 * The cached value of the '{@link #getPublishObjectClassAttributes() <em>Publish Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishObjectClassAttributes()
	 * @generated
	 * @ordered
	 */
	protected PublishObjectClassAttributesType publishObjectClassAttributes;

	/**
	 * The cached value of the '{@link #getUnpublishObjectClassAttributes() <em>Unpublish Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpublishObjectClassAttributes()
	 * @generated
	 * @ordered
	 */
	protected UnpublishObjectClassAttributesType unpublishObjectClassAttributes;

	/**
	 * The cached value of the '{@link #getPublishInteractionClass() <em>Publish Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublishInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected PublishInteractionClassType publishInteractionClass;

	/**
	 * The cached value of the '{@link #getUnpublishInteractionClass() <em>Unpublish Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnpublishInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected UnpublishInteractionClassType unpublishInteractionClass;

	/**
	 * The cached value of the '{@link #getSubscribeObjectClassAttributes() <em>Subscribe Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeObjectClassAttributes()
	 * @generated
	 * @ordered
	 */
	protected SubscribeObjectClassAttributesType subscribeObjectClassAttributes;

	/**
	 * The cached value of the '{@link #getUnsubscribeObjectClassAttributes() <em>Unsubscribe Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribeObjectClassAttributes()
	 * @generated
	 * @ordered
	 */
	protected UnsubscribeObjectClassAttributesType unsubscribeObjectClassAttributes;

	/**
	 * The cached value of the '{@link #getSubscribeInteractionClass() <em>Subscribe Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected SubscribeInteractionClassType subscribeInteractionClass;

	/**
	 * The cached value of the '{@link #getUnsubscribeInteractionClass() <em>Unsubscribe Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribeInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected UnsubscribeInteractionClassType unsubscribeInteractionClass;

	/**
	 * The cached value of the '{@link #getStartRegistrationForObjectClass() <em>Start Registration For Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartRegistrationForObjectClass()
	 * @generated
	 * @ordered
	 */
	protected StartRegistrationForObjectClassType startRegistrationForObjectClass;

	/**
	 * The cached value of the '{@link #getStopRegistrationForObjectClass() <em>Stop Registration For Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopRegistrationForObjectClass()
	 * @generated
	 * @ordered
	 */
	protected StopRegistrationForObjectClassType stopRegistrationForObjectClass;

	/**
	 * The cached value of the '{@link #getTurnInteractionsOn() <em>Turn Interactions On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnInteractionsOn()
	 * @generated
	 * @ordered
	 */
	protected TurnInteractionsOnType turnInteractionsOn;

	/**
	 * The cached value of the '{@link #getTurnInteractionsOff() <em>Turn Interactions Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnInteractionsOff()
	 * @generated
	 * @ordered
	 */
	protected TurnInteractionsOffType turnInteractionsOff;

	/**
	 * The cached value of the '{@link #getReserveObjectInstanceName() <em>Reserve Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveObjectInstanceName()
	 * @generated
	 * @ordered
	 */
	protected ReserveObjectInstanceNameType reserveObjectInstanceName;

	/**
	 * The cached value of the '{@link #getObjectInstanceNameReserved() <em>Object Instance Name Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectInstanceNameReserved()
	 * @generated
	 * @ordered
	 */
	protected ObjectInstanceNameReservedType objectInstanceNameReserved;

	/**
	 * The cached value of the '{@link #getReleaseObjectInstanceName() <em>Release Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseObjectInstanceName()
	 * @generated
	 * @ordered
	 */
	protected ReleaseObjectInstanceNameType releaseObjectInstanceName;

	/**
	 * The cached value of the '{@link #getReserveMultipleObjectInstanceNames() <em>Reserve Multiple Object Instance Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserveMultipleObjectInstanceNames()
	 * @generated
	 * @ordered
	 */
	protected ReserveMultipleObjectInstanceNamesType reserveMultipleObjectInstanceNames;

	/**
	 * The cached value of the '{@link #getMultipleObjectInstanceNamesReserved() <em>Multiple Object Instance Names Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultipleObjectInstanceNamesReserved()
	 * @generated
	 * @ordered
	 */
	protected MultipleObjectInstanceNamesReservedType multipleObjectInstanceNamesReserved;

	/**
	 * The cached value of the '{@link #getReleaseMultipleObjectInstanceNames() <em>Release Multiple Object Instance Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseMultipleObjectInstanceNames()
	 * @generated
	 * @ordered
	 */
	protected ReleaseMultipleObjectInstanceNamesType releaseMultipleObjectInstanceNames;

	/**
	 * The cached value of the '{@link #getRegisterObjectInstance() <em>Register Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected RegisterObjectInstanceType registerObjectInstance;

	/**
	 * The cached value of the '{@link #getDiscoverObjectInstance() <em>Discover Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscoverObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected DiscoverObjectInstanceType discoverObjectInstance;

	/**
	 * The cached value of the '{@link #getUpdateAttributeValues() <em>Update Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpdateAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected UpdateAttributeValuesType updateAttributeValues;

	/**
	 * The cached value of the '{@link #getReflectAttributeValues() <em>Reflect Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReflectAttributeValues()
	 * @generated
	 * @ordered
	 */
	protected ReflectAttributeValuesType reflectAttributeValues;

	/**
	 * The cached value of the '{@link #getSendInteraction() <em>Send Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendInteraction()
	 * @generated
	 * @ordered
	 */
	protected SendInteractionType sendInteraction;

	/**
	 * The cached value of the '{@link #getReceiveInteraction() <em>Receive Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceiveInteraction()
	 * @generated
	 * @ordered
	 */
	protected ReceiveInteractionType receiveInteraction;

	/**
	 * The cached value of the '{@link #getDeleteObjectInstance() <em>Delete Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected DeleteObjectInstanceType deleteObjectInstance;

	/**
	 * The cached value of the '{@link #getRemoveobjectinstance() <em>Removeobjectinstance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveobjectinstance()
	 * @generated
	 * @ordered
	 */
	protected RemoveobjectinstanceType removeobjectinstance;

	/**
	 * The cached value of the '{@link #getLocalDeleteObjectInstance() <em>Local Delete Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocalDeleteObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected LocalDeleteObjectInstanceType localDeleteObjectInstance;

	/**
	 * The cached value of the '{@link #getAttributesInScope() <em>Attributes In Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesInScope()
	 * @generated
	 * @ordered
	 */
	protected AttributesInScopeType attributesInScope;

	/**
	 * The cached value of the '{@link #getAttributesOutOfScope() <em>Attributes Out Of Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributesOutOfScope()
	 * @generated
	 * @ordered
	 */
	protected AttributesOutOfScopeType attributesOutOfScope;

	/**
	 * The cached value of the '{@link #getRequestAttributeValueUpdate() <em>Request Attribute Value Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributeValueUpdate()
	 * @generated
	 * @ordered
	 */
	protected RequestAttributeValueUpdateType requestAttributeValueUpdate;

	/**
	 * The cached value of the '{@link #getProvideAttributeValueUpdate() <em>Provide Attribute Value Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvideAttributeValueUpdate()
	 * @generated
	 * @ordered
	 */
	protected ProvideAttributeValueUpdateType provideAttributeValueUpdate;

	/**
	 * The cached value of the '{@link #getTurnUpdatesOnForObjectInstance() <em>Turn Updates On For Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnUpdatesOnForObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected TurnUpdatesOnForObjectInstanceType turnUpdatesOnForObjectInstance;

	/**
	 * The cached value of the '{@link #getTurnUpdatesOffForObjectInstance() <em>Turn Updates Off For Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTurnUpdatesOffForObjectInstance()
	 * @generated
	 * @ordered
	 */
	protected TurnUpdatesOffForObjectInstanceType turnUpdatesOffForObjectInstance;

	/**
	 * The cached value of the '{@link #getRequestAttributeTransportationTypeChange() <em>Request Attribute Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributeTransportationTypeChange()
	 * @generated
	 * @ordered
	 */
	protected RequestAttributeTransportationTypeChangeType requestAttributeTransportationTypeChange;

	/**
	 * The cached value of the '{@link #getConfirmAttributeTransportationTypeChange() <em>Confirm Attribute Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmAttributeTransportationTypeChange()
	 * @generated
	 * @ordered
	 */
	protected ConfirmAttributeTransportationTypeChangeType confirmAttributeTransportationTypeChange;

	/**
	 * The cached value of the '{@link #getQueryAttributeTransportationType() <em>Query Attribute Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryAttributeTransportationType()
	 * @generated
	 * @ordered
	 */
	protected QueryAttributeTransportationTypeType queryAttributeTransportationType;

	/**
	 * The cached value of the '{@link #getReportAttributeTransportationType() <em>Report Attribute Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportAttributeTransportationType()
	 * @generated
	 * @ordered
	 */
	protected ReportAttributeTransportationTypeType reportAttributeTransportationType;

	/**
	 * The cached value of the '{@link #getRequestInteractionTransportationTypeChange() <em>Request Interaction Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestInteractionTransportationTypeChange()
	 * @generated
	 * @ordered
	 */
	protected RequestInteractionTransportationTypeChangeType requestInteractionTransportationTypeChange;

	/**
	 * The cached value of the '{@link #getConfirmInteractionTransportationTypeChange() <em>Confirm Interaction Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmInteractionTransportationTypeChange()
	 * @generated
	 * @ordered
	 */
	protected ConfirmInteractionTransportationTypeChangeType confirmInteractionTransportationTypeChange;

	/**
	 * The cached value of the '{@link #getQueryInteractionTransportationType() <em>Query Interaction Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryInteractionTransportationType()
	 * @generated
	 * @ordered
	 */
	protected QueryInteractionTransportationTypeType queryInteractionTransportationType;

	/**
	 * The cached value of the '{@link #getReportInteractionTransportationType() <em>Report Interaction Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReportInteractionTransportationType()
	 * @generated
	 * @ordered
	 */
	protected ReportInteractionTransportationTypeType reportInteractionTransportationType;

	/**
	 * The cached value of the '{@link #getUnconditionalAttributeOwnershipDivestiture() <em>Unconditional Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnconditionalAttributeOwnershipDivestiture()
	 * @generated
	 * @ordered
	 */
	protected UnconditionalAttributeOwnershipDivestitureType unconditionalAttributeOwnershipDivestiture;

	/**
	 * The cached value of the '{@link #getNegotiatedAttributeOwnershipDivestiture() <em>Negotiated Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNegotiatedAttributeOwnershipDivestiture()
	 * @generated
	 * @ordered
	 */
	protected NegotiatedAttributeOwnershipDivestitureType negotiatedAttributeOwnershipDivestiture;

	/**
	 * The cached value of the '{@link #getRequestAttributeOwnershipAssumption() <em>Request Attribute Ownership Assumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributeOwnershipAssumption()
	 * @generated
	 * @ordered
	 */
	protected RequestAttributeOwnershipAssumptionType requestAttributeOwnershipAssumption;

	/**
	 * The cached value of the '{@link #getRequestDivestitureConfirmation() <em>Request Divestiture Confirmation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestDivestitureConfirmation()
	 * @generated
	 * @ordered
	 */
	protected RequestDivestitureConfirmationType requestDivestitureConfirmation;

	/**
	 * The cached value of the '{@link #getConfirmDivestiture() <em>Confirm Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmDivestiture()
	 * @generated
	 * @ordered
	 */
	protected ConfirmDivestitureType confirmDivestiture;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipAcquisitionNotification() <em>Attribute Ownership Acquisition Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipAcquisitionNotification()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipAcquisitionNotificationType attributeOwnershipAcquisitionNotification;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipAcquisition() <em>Attribute Ownership Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipAcquisition()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipAcquisitionType attributeOwnershipAcquisition;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipAcquisitionIfAvailable() <em>Attribute Ownership Acquisition If Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipAcquisitionIfAvailable()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipAcquisitionIfAvailableType attributeOwnershipAcquisitionIfAvailable;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipUnavailable() <em>Attribute Ownership Unavailable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipUnavailable()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipUnavailableType attributeOwnershipUnavailable;

	/**
	 * The cached value of the '{@link #getRequestAttributeOwnershipRelease() <em>Request Attribute Ownership Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributeOwnershipRelease()
	 * @generated
	 * @ordered
	 */
	protected RequestAttributeOwnershipReleaseType requestAttributeOwnershipRelease;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipReleaseDenied() <em>Attribute Ownership Release Denied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipReleaseDenied()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipReleaseDeniedType attributeOwnershipReleaseDenied;

	/**
	 * The cached value of the '{@link #getAttributeOwnershipDivestitureIfWanted() <em>Attribute Ownership Divestiture If Wanted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributeOwnershipDivestitureIfWanted()
	 * @generated
	 * @ordered
	 */
	protected AttributeOwnershipDivestitureIfWantedType attributeOwnershipDivestitureIfWanted;

	/**
	 * The cached value of the '{@link #getCancelNegotiatedAttributeOwnershipDivestiture() <em>Cancel Negotiated Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelNegotiatedAttributeOwnershipDivestiture()
	 * @generated
	 * @ordered
	 */
	protected CancelNegotiatedAttributeOwnershipDivestitureType cancelNegotiatedAttributeOwnershipDivestiture;

	/**
	 * The cached value of the '{@link #getCancelAttributeOwnershipAcquisition() <em>Cancel Attribute Ownership Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancelAttributeOwnershipAcquisition()
	 * @generated
	 * @ordered
	 */
	protected CancelAttributeOwnershipAcquisitionType cancelAttributeOwnershipAcquisition;

	/**
	 * The cached value of the '{@link #getConfirmAttributeOwnershipAcquisitionCancellation() <em>Confirm Attribute Ownership Acquisition Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfirmAttributeOwnershipAcquisitionCancellation()
	 * @generated
	 * @ordered
	 */
	protected ConfirmAttributeOwnershipAcquisitionCancellationType confirmAttributeOwnershipAcquisitionCancellation;

	/**
	 * The cached value of the '{@link #getQueryAttributeOwnership() <em>Query Attribute Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryAttributeOwnership()
	 * @generated
	 * @ordered
	 */
	protected QueryAttributeOwnershipType queryAttributeOwnership;

	/**
	 * The cached value of the '{@link #getInformAttributeOwnership() <em>Inform Attribute Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInformAttributeOwnership()
	 * @generated
	 * @ordered
	 */
	protected InformAttributeOwnershipType informAttributeOwnership;

	/**
	 * The cached value of the '{@link #getIsAttributeOwnedByFederate() <em>Is Attribute Owned By Federate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsAttributeOwnedByFederate()
	 * @generated
	 * @ordered
	 */
	protected IsAttributeOwnedByFederateType isAttributeOwnedByFederate;

	/**
	 * The cached value of the '{@link #getEnableTimeRegulation() <em>Enable Time Regulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTimeRegulation()
	 * @generated
	 * @ordered
	 */
	protected EnableTimeRegulationType enableTimeRegulation;

	/**
	 * The cached value of the '{@link #getTimeRegulationEnabled() <em>Time Regulation Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeRegulationEnabled()
	 * @generated
	 * @ordered
	 */
	protected TimeRegulationEnabledType timeRegulationEnabled;

	/**
	 * The cached value of the '{@link #getDisableTimeRegulation() <em>Disable Time Regulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableTimeRegulation()
	 * @generated
	 * @ordered
	 */
	protected DisableTimeRegulationType disableTimeRegulation;

	/**
	 * The cached value of the '{@link #getEnableTimeConstrained() <em>Enable Time Constrained</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableTimeConstrained()
	 * @generated
	 * @ordered
	 */
	protected EnableTimeConstrainedType enableTimeConstrained;

	/**
	 * The cached value of the '{@link #getTimeConstrainedEnabled() <em>Time Constrained Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeConstrainedEnabled()
	 * @generated
	 * @ordered
	 */
	protected TimeConstrainedEnabledType timeConstrainedEnabled;

	/**
	 * The cached value of the '{@link #getDisableTimeConstrained() <em>Disable Time Constrained</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableTimeConstrained()
	 * @generated
	 * @ordered
	 */
	protected DisableTimeConstrainedType disableTimeConstrained;

	/**
	 * The cached value of the '{@link #getTimeAdvanceRequest() <em>Time Advance Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvanceRequest()
	 * @generated
	 * @ordered
	 */
	protected TimeAdvanceRequestType timeAdvanceRequest;

	/**
	 * The cached value of the '{@link #getTimeAdvanceRequestAvailable() <em>Time Advance Request Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvanceRequestAvailable()
	 * @generated
	 * @ordered
	 */
	protected TimeAdvanceRequestAvailableType timeAdvanceRequestAvailable;

	/**
	 * The cached value of the '{@link #getNextMessageRequest() <em>Next Message Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMessageRequest()
	 * @generated
	 * @ordered
	 */
	protected NextMessageRequestType nextMessageRequest;

	/**
	 * The cached value of the '{@link #getNextMessageRequestAvailable() <em>Next Message Request Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNextMessageRequestAvailable()
	 * @generated
	 * @ordered
	 */
	protected NextMessageRequestAvailableType nextMessageRequestAvailable;

	/**
	 * The cached value of the '{@link #getFlushQueueRequest() <em>Flush Queue Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlushQueueRequest()
	 * @generated
	 * @ordered
	 */
	protected FlushQueueRequestType flushQueueRequest;

	/**
	 * The cached value of the '{@link #getTimeAdvanceGrant() <em>Time Advance Grant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeAdvanceGrant()
	 * @generated
	 * @ordered
	 */
	protected TimeAdvanceGrantType timeAdvanceGrant;

	/**
	 * The cached value of the '{@link #getEnableAsynchronousDelivery() <em>Enable Asynchronous Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableAsynchronousDelivery()
	 * @generated
	 * @ordered
	 */
	protected EnableAsynchronousDeliveryType enableAsynchronousDelivery;

	/**
	 * The cached value of the '{@link #getDisableAsynchronousDelivery() <em>Disable Asynchronous Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableAsynchronousDelivery()
	 * @generated
	 * @ordered
	 */
	protected DisableAsynchronousDeliveryType disableAsynchronousDelivery;

	/**
	 * The cached value of the '{@link #getQueryGALT() <em>Query GALT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryGALT()
	 * @generated
	 * @ordered
	 */
	protected QueryGALTType queryGALT;

	/**
	 * The cached value of the '{@link #getQueryLogicalTime() <em>Query Logical Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLogicalTime()
	 * @generated
	 * @ordered
	 */
	protected QueryLogicalTimeType queryLogicalTime;

	/**
	 * The cached value of the '{@link #getQueryLITS() <em>Query LITS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLITS()
	 * @generated
	 * @ordered
	 */
	protected QueryLITSType queryLITS;

	/**
	 * The cached value of the '{@link #getModifyLookahead() <em>Modify Lookahead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModifyLookahead()
	 * @generated
	 * @ordered
	 */
	protected ModifyLookaheadType modifyLookahead;

	/**
	 * The cached value of the '{@link #getQueryLookahead() <em>Query Lookahead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQueryLookahead()
	 * @generated
	 * @ordered
	 */
	protected QueryLookaheadType queryLookahead;

	/**
	 * The cached value of the '{@link #getRetract() <em>Retract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetract()
	 * @generated
	 * @ordered
	 */
	protected RetractType retract;

	/**
	 * The cached value of the '{@link #getRequestRetraction() <em>Request Retraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestRetraction()
	 * @generated
	 * @ordered
	 */
	protected RequestRetractionType requestRetraction;

	/**
	 * The cached value of the '{@link #getChangeAttributeOrderType() <em>Change Attribute Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeAttributeOrderType()
	 * @generated
	 * @ordered
	 */
	protected ChangeAttributeOrderTypeType changeAttributeOrderType;

	/**
	 * The cached value of the '{@link #getChangeInteractionOrderType() <em>Change Interaction Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChangeInteractionOrderType()
	 * @generated
	 * @ordered
	 */
	protected ChangeInteractionOrderTypeType changeInteractionOrderType;

	/**
	 * The cached value of the '{@link #getCreateRegion() <em>Create Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCreateRegion()
	 * @generated
	 * @ordered
	 */
	protected CreateRegionType createRegion;

	/**
	 * The cached value of the '{@link #getCommitRegionModifications() <em>Commit Region Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommitRegionModifications()
	 * @generated
	 * @ordered
	 */
	protected CommitRegionModificationsType commitRegionModifications;

	/**
	 * The cached value of the '{@link #getDeleteRegion() <em>Delete Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeleteRegion()
	 * @generated
	 * @ordered
	 */
	protected DeleteRegionType deleteRegion;

	/**
	 * The cached value of the '{@link #getRegisterObjectInstanceWithRegions() <em>Register Object Instance With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegisterObjectInstanceWithRegions()
	 * @generated
	 * @ordered
	 */
	protected RegisterObjectInstanceWithRegionsType registerObjectInstanceWithRegions;

	/**
	 * The cached value of the '{@link #getAssociateRegionsForUpdates() <em>Associate Regions For Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociateRegionsForUpdates()
	 * @generated
	 * @ordered
	 */
	protected AssociateRegionsForUpdatesType associateRegionsForUpdates;

	/**
	 * The cached value of the '{@link #getUnassociateRegionsForUpdates() <em>Unassociate Regions For Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnassociateRegionsForUpdates()
	 * @generated
	 * @ordered
	 */
	protected UnassociateRegionsForUpdatesType unassociateRegionsForUpdates;

	/**
	 * The cached value of the '{@link #getSubscribeObjectClassAttributesWithRegions() <em>Subscribe Object Class Attributes With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeObjectClassAttributesWithRegions()
	 * @generated
	 * @ordered
	 */
	protected SubscribeObjectClassAttributesWithRegionsType subscribeObjectClassAttributesWithRegions;

	/**
	 * The cached value of the '{@link #getUnsubscribeObjectClassAttributesWithRegions() <em>Unsubscribe Object Class Attributes With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribeObjectClassAttributesWithRegions()
	 * @generated
	 * @ordered
	 */
	protected UnsubscribeObjectClassAttributesWithRegionsType unsubscribeObjectClassAttributesWithRegions;

	/**
	 * The cached value of the '{@link #getSubscribeInteractionClassWithRegions() <em>Subscribe Interaction Class With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubscribeInteractionClassWithRegions()
	 * @generated
	 * @ordered
	 */
	protected SubscribeInteractionClassWithRegionsType subscribeInteractionClassWithRegions;

	/**
	 * The cached value of the '{@link #getUnsubscribeInteractionClassWithRegions() <em>Unsubscribe Interaction Class With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnsubscribeInteractionClassWithRegions()
	 * @generated
	 * @ordered
	 */
	protected UnsubscribeInteractionClassWithRegionsType unsubscribeInteractionClassWithRegions;

	/**
	 * The cached value of the '{@link #getSendInteractionWithRegions() <em>Send Interaction With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendInteractionWithRegions()
	 * @generated
	 * @ordered
	 */
	protected SendInteractionWithRegionsType sendInteractionWithRegions;

	/**
	 * The cached value of the '{@link #getRequestAttributeValueUpdateWithRegions() <em>Request Attribute Value Update With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestAttributeValueUpdateWithRegions()
	 * @generated
	 * @ordered
	 */
	protected RequestAttributeValueUpdateWithRegionsType requestAttributeValueUpdateWithRegions;

	/**
	 * The cached value of the '{@link #getGetAutomaticResignDirective() <em>Get Automatic Resign Directive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAutomaticResignDirective()
	 * @generated
	 * @ordered
	 */
	protected GetAutomaticResignDirectiveType getAutomaticResignDirective;

	/**
	 * The cached value of the '{@link #getSetAutomaticResignDirective() <em>Set Automatic Resign Directive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetAutomaticResignDirective()
	 * @generated
	 * @ordered
	 */
	protected SetAutomaticResignDirectiveType setAutomaticResignDirective;

	/**
	 * The cached value of the '{@link #getGetFederateHandle() <em>Get Federate Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetFederateHandle()
	 * @generated
	 * @ordered
	 */
	protected GetFederateHandleType getFederateHandle;

	/**
	 * The cached value of the '{@link #getGetFederateName() <em>Get Federate Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetFederateName()
	 * @generated
	 * @ordered
	 */
	protected GetFederateNameType getFederateName;

	/**
	 * The cached value of the '{@link #getGetObjectClassHandle() <em>Get Object Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetObjectClassHandle()
	 * @generated
	 * @ordered
	 */
	protected GetObjectClassHandleType getObjectClassHandle;

	/**
	 * The cached value of the '{@link #getGetObjectClassName() <em>Get Object Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetObjectClassName()
	 * @generated
	 * @ordered
	 */
	protected GetObjectClassNameType getObjectClassName;

	/**
	 * The cached value of the '{@link #getGetKnownObjectClassHandle() <em>Get Known Object Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetKnownObjectClassHandle()
	 * @generated
	 * @ordered
	 */
	protected GetKnownObjectClassHandleType getKnownObjectClassHandle;

	/**
	 * The cached value of the '{@link #getGetObjectInstanceHandle() <em>Get Object Instance Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetObjectInstanceHandle()
	 * @generated
	 * @ordered
	 */
	protected GetObjectInstanceHandleType getObjectInstanceHandle;

	/**
	 * The cached value of the '{@link #getGetObjectInstanceName() <em>Get Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetObjectInstanceName()
	 * @generated
	 * @ordered
	 */
	protected GetObjectInstanceNameType getObjectInstanceName;

	/**
	 * The cached value of the '{@link #getGetAttributeHandle() <em>Get Attribute Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAttributeHandle()
	 * @generated
	 * @ordered
	 */
	protected GetAttributeHandleType getAttributeHandle;

	/**
	 * The cached value of the '{@link #getGetAttributeName() <em>Get Attribute Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAttributeName()
	 * @generated
	 * @ordered
	 */
	protected GetAttributeNameType getAttributeName;

	/**
	 * The cached value of the '{@link #getGetUpdateRateValue() <em>Get Update Rate Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetUpdateRateValue()
	 * @generated
	 * @ordered
	 */
	protected GetUpdateRateValueType getUpdateRateValue;

	/**
	 * The cached value of the '{@link #getGetUpdateRateValueForAttribute() <em>Get Update Rate Value For Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetUpdateRateValueForAttribute()
	 * @generated
	 * @ordered
	 */
	protected GetUpdateRateValueForAttributeType getUpdateRateValueForAttribute;

	/**
	 * The cached value of the '{@link #getGetInteractionClassHandle() <em>Get Interaction Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInteractionClassHandle()
	 * @generated
	 * @ordered
	 */
	protected GetInteractionClassHandleType getInteractionClassHandle;

	/**
	 * The cached value of the '{@link #getGetInteractionClassName() <em>Get Interaction Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetInteractionClassName()
	 * @generated
	 * @ordered
	 */
	protected GetInteractionClassNameType getInteractionClassName;

	/**
	 * The cached value of the '{@link #getGetParameterHandle() <em>Get Parameter Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetParameterHandle()
	 * @generated
	 * @ordered
	 */
	protected GetParameterHandleType getParameterHandle;

	/**
	 * The cached value of the '{@link #getGetParameterName() <em>Get Parameter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetParameterName()
	 * @generated
	 * @ordered
	 */
	protected GetParameterNameType getParameterName;

	/**
	 * The cached value of the '{@link #getGetOrderType() <em>Get Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetOrderType()
	 * @generated
	 * @ordered
	 */
	protected GetOrderTypeType getOrderType;

	/**
	 * The cached value of the '{@link #getGetOrderName() <em>Get Order Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetOrderName()
	 * @generated
	 * @ordered
	 */
	protected GetOrderNameType getOrderName;

	/**
	 * The cached value of the '{@link #getGetTransportationTypeHandle() <em>Get Transportation Type Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetTransportationTypeHandle()
	 * @generated
	 * @ordered
	 */
	protected GetTransportationTypeHandleType getTransportationTypeHandle;

	/**
	 * The cached value of the '{@link #getGetTransportationTypeName() <em>Get Transportation Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetTransportationTypeName()
	 * @generated
	 * @ordered
	 */
	protected GetTransportationTypeNameType getTransportationTypeName;

	/**
	 * The cached value of the '{@link #getGetAvailableDimensionsForClassAttribute() <em>Get Available Dimensions For Class Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAvailableDimensionsForClassAttribute()
	 * @generated
	 * @ordered
	 */
	protected GetAvailableDimensionsForClassAttributeType getAvailableDimensionsForClassAttribute;

	/**
	 * The cached value of the '{@link #getGetAvailableDimensionsForInteractionClass() <em>Get Available Dimensions For Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetAvailableDimensionsForInteractionClass()
	 * @generated
	 * @ordered
	 */
	protected GetAvailableDimensionsForInteractionClassType getAvailableDimensionsForInteractionClass;

	/**
	 * The cached value of the '{@link #getGetDimensionHandle() <em>Get Dimension Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDimensionHandle()
	 * @generated
	 * @ordered
	 */
	protected GetDimensionHandleType getDimensionHandle;

	/**
	 * The cached value of the '{@link #getGetDimensionName() <em>Get Dimension Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDimensionName()
	 * @generated
	 * @ordered
	 */
	protected GetDimensionNameType getDimensionName;

	/**
	 * The cached value of the '{@link #getGetDimensionUpperBound() <em>Get Dimension Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDimensionUpperBound()
	 * @generated
	 * @ordered
	 */
	protected GetDimensionUpperBoundType getDimensionUpperBound;

	/**
	 * The cached value of the '{@link #getGetDimensionHandleSet() <em>Get Dimension Handle Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetDimensionHandleSet()
	 * @generated
	 * @ordered
	 */
	protected GetDimensionHandleSetType getDimensionHandleSet;

	/**
	 * The cached value of the '{@link #getGetRangeBounds() <em>Get Range Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGetRangeBounds()
	 * @generated
	 * @ordered
	 */
	protected GetRangeBoundsType getRangeBounds;

	/**
	 * The cached value of the '{@link #getSetRangeBounds() <em>Set Range Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSetRangeBounds()
	 * @generated
	 * @ordered
	 */
	protected SetRangeBoundsType setRangeBounds;

	/**
	 * The cached value of the '{@link #getNormalizeFederateHandle() <em>Normalize Federate Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizeFederateHandle()
	 * @generated
	 * @ordered
	 */
	protected NormalizeFederateHandleType normalizeFederateHandle;

	/**
	 * The cached value of the '{@link #getNormalizeServiceGroup() <em>Normalize Service Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalizeServiceGroup()
	 * @generated
	 * @ordered
	 */
	protected NormalizeServiceGroupType normalizeServiceGroup;

	/**
	 * The cached value of the '{@link #getEnableObjectClassRelevanceAdvisorySwitch() <em>Enable Object Class Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableObjectClassRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected EnableObjectClassRelevanceAdvisorySwitchType enableObjectClassRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getDisableObjectClassRelevanceAdvisorySwitch() <em>Disable Object Class Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableObjectClassRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected DisableObjectClassRelevanceAdvisorySwitchType disableObjectClassRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getEnableAttributeRelevanceAdvisorySwitch() <em>Enable Attribute Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableAttributeRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected EnableAttributeRelevanceAdvisorySwitchType enableAttributeRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getDisableAttributeRelevanceAdvisorySwitch() <em>Disable Attribute Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableAttributeRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected DisableAttributeRelevanceAdvisorySwitchType disableAttributeRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getEnableAttributeScopeAdvisorySwitch() <em>Enable Attribute Scope Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableAttributeScopeAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected EnableAttributeScopeAdvisorySwitchType enableAttributeScopeAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getDisableAttributeScopeAdvisorySwitch() <em>Disable Attribute Scope Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableAttributeScopeAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected DisableAttributeScopeAdvisorySwitchType disableAttributeScopeAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getEnableInteractionRelevanceAdvisorySwitch() <em>Enable Interaction Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableInteractionRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected EnableInteractionRelevanceAdvisorySwitchType enableInteractionRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getDisableInteractionRelevanceAdvisorySwitch() <em>Disable Interaction Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableInteractionRelevanceAdvisorySwitch()
	 * @generated
	 * @ordered
	 */
	protected DisableInteractionRelevanceAdvisorySwitchType disableInteractionRelevanceAdvisorySwitch;

	/**
	 * The cached value of the '{@link #getEvokeCallback() <em>Evoke Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvokeCallback()
	 * @generated
	 * @ordered
	 */
	protected EvokeCallbackType evokeCallback;

	/**
	 * The cached value of the '{@link #getEvokeMultipleCallbacks() <em>Evoke Multiple Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEvokeMultipleCallbacks()
	 * @generated
	 * @ordered
	 */
	protected EvokeMultipleCallbacksType evokeMultipleCallbacks;

	/**
	 * The cached value of the '{@link #getEnableCallbacks() <em>Enable Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnableCallbacks()
	 * @generated
	 * @ordered
	 */
	protected EnableCallbacksType enableCallbacks;

	/**
	 * The cached value of the '{@link #getDisableCallbacks() <em>Disable Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDisableCallbacks()
	 * @generated
	 * @ordered
	 */
	protected DisableCallbacksType disableCallbacks;

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
	protected ServiceUtilizationTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return _2010Package.eINSTANCE.getServiceUtilizationType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectType getConnect() {
		return connect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnect(ConnectType newConnect, NotificationChain msgs) {
		ConnectType oldConnect = connect;
		connect = newConnect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT, oldConnect, newConnect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnect(ConnectType newConnect) {
		if (newConnect != connect) {
			NotificationChain msgs = null;
			if (connect != null)
				msgs = ((InternalEObject)connect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT, null, msgs);
			if (newConnect != null)
				msgs = ((InternalEObject)newConnect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT, null, msgs);
			msgs = basicSetConnect(newConnect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT, newConnect, newConnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisconnectType getDisconnect() {
		return disconnect;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisconnect(DisconnectType newDisconnect, NotificationChain msgs) {
		DisconnectType oldDisconnect = disconnect;
		disconnect = newDisconnect;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT, oldDisconnect, newDisconnect);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisconnect(DisconnectType newDisconnect) {
		if (newDisconnect != disconnect) {
			NotificationChain msgs = null;
			if (disconnect != null)
				msgs = ((InternalEObject)disconnect).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT, null, msgs);
			if (newDisconnect != null)
				msgs = ((InternalEObject)newDisconnect).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT, null, msgs);
			msgs = basicSetDisconnect(newDisconnect, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT, newDisconnect, newDisconnect));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnectionLostType getConnectionLost() {
		return connectionLost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnectionLost(ConnectionLostType newConnectionLost, NotificationChain msgs) {
		ConnectionLostType oldConnectionLost = connectionLost;
		connectionLost = newConnectionLost;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST, oldConnectionLost, newConnectionLost);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectionLost(ConnectionLostType newConnectionLost) {
		if (newConnectionLost != connectionLost) {
			NotificationChain msgs = null;
			if (connectionLost != null)
				msgs = ((InternalEObject)connectionLost).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST, null, msgs);
			if (newConnectionLost != null)
				msgs = ((InternalEObject)newConnectionLost).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST, null, msgs);
			msgs = basicSetConnectionLost(newConnectionLost, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST, newConnectionLost, newConnectionLost));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateFederationExecutionType getCreateFederationExecution() {
		return createFederationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateFederationExecution(CreateFederationExecutionType newCreateFederationExecution, NotificationChain msgs) {
		CreateFederationExecutionType oldCreateFederationExecution = createFederationExecution;
		createFederationExecution = newCreateFederationExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION, oldCreateFederationExecution, newCreateFederationExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateFederationExecution(CreateFederationExecutionType newCreateFederationExecution) {
		if (newCreateFederationExecution != createFederationExecution) {
			NotificationChain msgs = null;
			if (createFederationExecution != null)
				msgs = ((InternalEObject)createFederationExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION, null, msgs);
			if (newCreateFederationExecution != null)
				msgs = ((InternalEObject)newCreateFederationExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION, null, msgs);
			msgs = basicSetCreateFederationExecution(newCreateFederationExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION, newCreateFederationExecution, newCreateFederationExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DestroyFederationExecutionType getDestroyFederationExecution() {
		return destroyFederationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestroyFederationExecution(DestroyFederationExecutionType newDestroyFederationExecution, NotificationChain msgs) {
		DestroyFederationExecutionType oldDestroyFederationExecution = destroyFederationExecution;
		destroyFederationExecution = newDestroyFederationExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION, oldDestroyFederationExecution, newDestroyFederationExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestroyFederationExecution(DestroyFederationExecutionType newDestroyFederationExecution) {
		if (newDestroyFederationExecution != destroyFederationExecution) {
			NotificationChain msgs = null;
			if (destroyFederationExecution != null)
				msgs = ((InternalEObject)destroyFederationExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION, null, msgs);
			if (newDestroyFederationExecution != null)
				msgs = ((InternalEObject)newDestroyFederationExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION, null, msgs);
			msgs = basicSetDestroyFederationExecution(newDestroyFederationExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION, newDestroyFederationExecution, newDestroyFederationExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListFederationExecutionsType getListFederationExecutions() {
		return listFederationExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListFederationExecutions(ListFederationExecutionsType newListFederationExecutions, NotificationChain msgs) {
		ListFederationExecutionsType oldListFederationExecutions = listFederationExecutions;
		listFederationExecutions = newListFederationExecutions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS, oldListFederationExecutions, newListFederationExecutions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListFederationExecutions(ListFederationExecutionsType newListFederationExecutions) {
		if (newListFederationExecutions != listFederationExecutions) {
			NotificationChain msgs = null;
			if (listFederationExecutions != null)
				msgs = ((InternalEObject)listFederationExecutions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS, null, msgs);
			if (newListFederationExecutions != null)
				msgs = ((InternalEObject)newListFederationExecutions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS, null, msgs);
			msgs = basicSetListFederationExecutions(newListFederationExecutions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS, newListFederationExecutions, newListFederationExecutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportFederationExecutionsType getReportFederationExecutions() {
		return reportFederationExecutions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportFederationExecutions(ReportFederationExecutionsType newReportFederationExecutions, NotificationChain msgs) {
		ReportFederationExecutionsType oldReportFederationExecutions = reportFederationExecutions;
		reportFederationExecutions = newReportFederationExecutions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS, oldReportFederationExecutions, newReportFederationExecutions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportFederationExecutions(ReportFederationExecutionsType newReportFederationExecutions) {
		if (newReportFederationExecutions != reportFederationExecutions) {
			NotificationChain msgs = null;
			if (reportFederationExecutions != null)
				msgs = ((InternalEObject)reportFederationExecutions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS, null, msgs);
			if (newReportFederationExecutions != null)
				msgs = ((InternalEObject)newReportFederationExecutions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS, null, msgs);
			msgs = basicSetReportFederationExecutions(newReportFederationExecutions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS, newReportFederationExecutions, newReportFederationExecutions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinFederationExecutionType getJoinFederationExecution() {
		return joinFederationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJoinFederationExecution(JoinFederationExecutionType newJoinFederationExecution, NotificationChain msgs) {
		JoinFederationExecutionType oldJoinFederationExecution = joinFederationExecution;
		joinFederationExecution = newJoinFederationExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION, oldJoinFederationExecution, newJoinFederationExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJoinFederationExecution(JoinFederationExecutionType newJoinFederationExecution) {
		if (newJoinFederationExecution != joinFederationExecution) {
			NotificationChain msgs = null;
			if (joinFederationExecution != null)
				msgs = ((InternalEObject)joinFederationExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION, null, msgs);
			if (newJoinFederationExecution != null)
				msgs = ((InternalEObject)newJoinFederationExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION, null, msgs);
			msgs = basicSetJoinFederationExecution(newJoinFederationExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION, newJoinFederationExecution, newJoinFederationExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResignFederationExecutionType getResignFederationExecution() {
		return resignFederationExecution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResignFederationExecution(ResignFederationExecutionType newResignFederationExecution, NotificationChain msgs) {
		ResignFederationExecutionType oldResignFederationExecution = resignFederationExecution;
		resignFederationExecution = newResignFederationExecution;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION, oldResignFederationExecution, newResignFederationExecution);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResignFederationExecution(ResignFederationExecutionType newResignFederationExecution) {
		if (newResignFederationExecution != resignFederationExecution) {
			NotificationChain msgs = null;
			if (resignFederationExecution != null)
				msgs = ((InternalEObject)resignFederationExecution).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION, null, msgs);
			if (newResignFederationExecution != null)
				msgs = ((InternalEObject)newResignFederationExecution).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION, null, msgs);
			msgs = basicSetResignFederationExecution(newResignFederationExecution, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION, newResignFederationExecution, newResignFederationExecution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterFederationSynchronizationPointType getRegisterFederationSynchronizationPoint() {
		return registerFederationSynchronizationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterFederationSynchronizationPoint(RegisterFederationSynchronizationPointType newRegisterFederationSynchronizationPoint, NotificationChain msgs) {
		RegisterFederationSynchronizationPointType oldRegisterFederationSynchronizationPoint = registerFederationSynchronizationPoint;
		registerFederationSynchronizationPoint = newRegisterFederationSynchronizationPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT, oldRegisterFederationSynchronizationPoint, newRegisterFederationSynchronizationPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterFederationSynchronizationPoint(RegisterFederationSynchronizationPointType newRegisterFederationSynchronizationPoint) {
		if (newRegisterFederationSynchronizationPoint != registerFederationSynchronizationPoint) {
			NotificationChain msgs = null;
			if (registerFederationSynchronizationPoint != null)
				msgs = ((InternalEObject)registerFederationSynchronizationPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT, null, msgs);
			if (newRegisterFederationSynchronizationPoint != null)
				msgs = ((InternalEObject)newRegisterFederationSynchronizationPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT, null, msgs);
			msgs = basicSetRegisterFederationSynchronizationPoint(newRegisterFederationSynchronizationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT, newRegisterFederationSynchronizationPoint, newRegisterFederationSynchronizationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmSynchronizationPointRegistrationType getConfirmSynchronizationPointRegistration() {
		return confirmSynchronizationPointRegistration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmSynchronizationPointRegistration(ConfirmSynchronizationPointRegistrationType newConfirmSynchronizationPointRegistration, NotificationChain msgs) {
		ConfirmSynchronizationPointRegistrationType oldConfirmSynchronizationPointRegistration = confirmSynchronizationPointRegistration;
		confirmSynchronizationPointRegistration = newConfirmSynchronizationPointRegistration;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION, oldConfirmSynchronizationPointRegistration, newConfirmSynchronizationPointRegistration);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmSynchronizationPointRegistration(ConfirmSynchronizationPointRegistrationType newConfirmSynchronizationPointRegistration) {
		if (newConfirmSynchronizationPointRegistration != confirmSynchronizationPointRegistration) {
			NotificationChain msgs = null;
			if (confirmSynchronizationPointRegistration != null)
				msgs = ((InternalEObject)confirmSynchronizationPointRegistration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION, null, msgs);
			if (newConfirmSynchronizationPointRegistration != null)
				msgs = ((InternalEObject)newConfirmSynchronizationPointRegistration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION, null, msgs);
			msgs = basicSetConfirmSynchronizationPointRegistration(newConfirmSynchronizationPointRegistration, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION, newConfirmSynchronizationPointRegistration, newConfirmSynchronizationPointRegistration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AnnounceSynchronizationPointType getAnnounceSynchronizationPoint() {
		return announceSynchronizationPoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnounceSynchronizationPoint(AnnounceSynchronizationPointType newAnnounceSynchronizationPoint, NotificationChain msgs) {
		AnnounceSynchronizationPointType oldAnnounceSynchronizationPoint = announceSynchronizationPoint;
		announceSynchronizationPoint = newAnnounceSynchronizationPoint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT, oldAnnounceSynchronizationPoint, newAnnounceSynchronizationPoint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnounceSynchronizationPoint(AnnounceSynchronizationPointType newAnnounceSynchronizationPoint) {
		if (newAnnounceSynchronizationPoint != announceSynchronizationPoint) {
			NotificationChain msgs = null;
			if (announceSynchronizationPoint != null)
				msgs = ((InternalEObject)announceSynchronizationPoint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT, null, msgs);
			if (newAnnounceSynchronizationPoint != null)
				msgs = ((InternalEObject)newAnnounceSynchronizationPoint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT, null, msgs);
			msgs = basicSetAnnounceSynchronizationPoint(newAnnounceSynchronizationPoint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT, newAnnounceSynchronizationPoint, newAnnounceSynchronizationPoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SynchronizationPointAchievedType getSynchronizationPointAchieved() {
		return synchronizationPointAchieved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSynchronizationPointAchieved(SynchronizationPointAchievedType newSynchronizationPointAchieved, NotificationChain msgs) {
		SynchronizationPointAchievedType oldSynchronizationPointAchieved = synchronizationPointAchieved;
		synchronizationPointAchieved = newSynchronizationPointAchieved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED, oldSynchronizationPointAchieved, newSynchronizationPointAchieved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSynchronizationPointAchieved(SynchronizationPointAchievedType newSynchronizationPointAchieved) {
		if (newSynchronizationPointAchieved != synchronizationPointAchieved) {
			NotificationChain msgs = null;
			if (synchronizationPointAchieved != null)
				msgs = ((InternalEObject)synchronizationPointAchieved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED, null, msgs);
			if (newSynchronizationPointAchieved != null)
				msgs = ((InternalEObject)newSynchronizationPointAchieved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED, null, msgs);
			msgs = basicSetSynchronizationPointAchieved(newSynchronizationPointAchieved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED, newSynchronizationPointAchieved, newSynchronizationPointAchieved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSynchronizedType getFederationSynchronized() {
		return federationSynchronized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationSynchronized(FederationSynchronizedType newFederationSynchronized, NotificationChain msgs) {
		FederationSynchronizedType oldFederationSynchronized = federationSynchronized;
		federationSynchronized = newFederationSynchronized;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED, oldFederationSynchronized, newFederationSynchronized);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationSynchronized(FederationSynchronizedType newFederationSynchronized) {
		if (newFederationSynchronized != federationSynchronized) {
			NotificationChain msgs = null;
			if (federationSynchronized != null)
				msgs = ((InternalEObject)federationSynchronized).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED, null, msgs);
			if (newFederationSynchronized != null)
				msgs = ((InternalEObject)newFederationSynchronized).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED, null, msgs);
			msgs = basicSetFederationSynchronized(newFederationSynchronized, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED, newFederationSynchronized, newFederationSynchronized));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationSaveType getRequestFederationSave() {
		return requestFederationSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestFederationSave(RequestFederationSaveType newRequestFederationSave, NotificationChain msgs) {
		RequestFederationSaveType oldRequestFederationSave = requestFederationSave;
		requestFederationSave = newRequestFederationSave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE, oldRequestFederationSave, newRequestFederationSave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestFederationSave(RequestFederationSaveType newRequestFederationSave) {
		if (newRequestFederationSave != requestFederationSave) {
			NotificationChain msgs = null;
			if (requestFederationSave != null)
				msgs = ((InternalEObject)requestFederationSave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE, null, msgs);
			if (newRequestFederationSave != null)
				msgs = ((InternalEObject)newRequestFederationSave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE, null, msgs);
			msgs = basicSetRequestFederationSave(newRequestFederationSave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE, newRequestFederationSave, newRequestFederationSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateSaveType getInitiateFederateSave() {
		return initiateFederateSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiateFederateSave(InitiateFederateSaveType newInitiateFederateSave, NotificationChain msgs) {
		InitiateFederateSaveType oldInitiateFederateSave = initiateFederateSave;
		initiateFederateSave = newInitiateFederateSave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE, oldInitiateFederateSave, newInitiateFederateSave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiateFederateSave(InitiateFederateSaveType newInitiateFederateSave) {
		if (newInitiateFederateSave != initiateFederateSave) {
			NotificationChain msgs = null;
			if (initiateFederateSave != null)
				msgs = ((InternalEObject)initiateFederateSave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE, null, msgs);
			if (newInitiateFederateSave != null)
				msgs = ((InternalEObject)newInitiateFederateSave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE, null, msgs);
			msgs = basicSetInitiateFederateSave(newInitiateFederateSave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE, newInitiateFederateSave, newInitiateFederateSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveBegunType getFederateSaveBegun() {
		return federateSaveBegun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederateSaveBegun(FederateSaveBegunType newFederateSaveBegun, NotificationChain msgs) {
		FederateSaveBegunType oldFederateSaveBegun = federateSaveBegun;
		federateSaveBegun = newFederateSaveBegun;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN, oldFederateSaveBegun, newFederateSaveBegun);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederateSaveBegun(FederateSaveBegunType newFederateSaveBegun) {
		if (newFederateSaveBegun != federateSaveBegun) {
			NotificationChain msgs = null;
			if (federateSaveBegun != null)
				msgs = ((InternalEObject)federateSaveBegun).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN, null, msgs);
			if (newFederateSaveBegun != null)
				msgs = ((InternalEObject)newFederateSaveBegun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN, null, msgs);
			msgs = basicSetFederateSaveBegun(newFederateSaveBegun, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN, newFederateSaveBegun, newFederateSaveBegun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateSaveCompleteType getFederateSaveComplete() {
		return federateSaveComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederateSaveComplete(FederateSaveCompleteType newFederateSaveComplete, NotificationChain msgs) {
		FederateSaveCompleteType oldFederateSaveComplete = federateSaveComplete;
		federateSaveComplete = newFederateSaveComplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE, oldFederateSaveComplete, newFederateSaveComplete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederateSaveComplete(FederateSaveCompleteType newFederateSaveComplete) {
		if (newFederateSaveComplete != federateSaveComplete) {
			NotificationChain msgs = null;
			if (federateSaveComplete != null)
				msgs = ((InternalEObject)federateSaveComplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE, null, msgs);
			if (newFederateSaveComplete != null)
				msgs = ((InternalEObject)newFederateSaveComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE, null, msgs);
			msgs = basicSetFederateSaveComplete(newFederateSaveComplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE, newFederateSaveComplete, newFederateSaveComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSavedType getFederationSaved() {
		return federationSaved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationSaved(FederationSavedType newFederationSaved, NotificationChain msgs) {
		FederationSavedType oldFederationSaved = federationSaved;
		federationSaved = newFederationSaved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED, oldFederationSaved, newFederationSaved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationSaved(FederationSavedType newFederationSaved) {
		if (newFederationSaved != federationSaved) {
			NotificationChain msgs = null;
			if (federationSaved != null)
				msgs = ((InternalEObject)federationSaved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED, null, msgs);
			if (newFederationSaved != null)
				msgs = ((InternalEObject)newFederationSaved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED, null, msgs);
			msgs = basicSetFederationSaved(newFederationSaved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED, newFederationSaved, newFederationSaved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationSaveType getAbortFederationSave() {
		return abortFederationSave;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbortFederationSave(AbortFederationSaveType newAbortFederationSave, NotificationChain msgs) {
		AbortFederationSaveType oldAbortFederationSave = abortFederationSave;
		abortFederationSave = newAbortFederationSave;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE, oldAbortFederationSave, newAbortFederationSave);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbortFederationSave(AbortFederationSaveType newAbortFederationSave) {
		if (newAbortFederationSave != abortFederationSave) {
			NotificationChain msgs = null;
			if (abortFederationSave != null)
				msgs = ((InternalEObject)abortFederationSave).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE, null, msgs);
			if (newAbortFederationSave != null)
				msgs = ((InternalEObject)newAbortFederationSave).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE, null, msgs);
			msgs = basicSetAbortFederationSave(newAbortFederationSave, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE, newAbortFederationSave, newAbortFederationSave));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationSaveStatusType getQueryFederationSaveStatus() {
		return queryFederationSaveStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFederationSaveStatus(QueryFederationSaveStatusType newQueryFederationSaveStatus, NotificationChain msgs) {
		QueryFederationSaveStatusType oldQueryFederationSaveStatus = queryFederationSaveStatus;
		queryFederationSaveStatus = newQueryFederationSaveStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS, oldQueryFederationSaveStatus, newQueryFederationSaveStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFederationSaveStatus(QueryFederationSaveStatusType newQueryFederationSaveStatus) {
		if (newQueryFederationSaveStatus != queryFederationSaveStatus) {
			NotificationChain msgs = null;
			if (queryFederationSaveStatus != null)
				msgs = ((InternalEObject)queryFederationSaveStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS, null, msgs);
			if (newQueryFederationSaveStatus != null)
				msgs = ((InternalEObject)newQueryFederationSaveStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS, null, msgs);
			msgs = basicSetQueryFederationSaveStatus(newQueryFederationSaveStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS, newQueryFederationSaveStatus, newQueryFederationSaveStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationSaveStatusResponseType getFederationSaveStatusResponse() {
		return federationSaveStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationSaveStatusResponse(FederationSaveStatusResponseType newFederationSaveStatusResponse, NotificationChain msgs) {
		FederationSaveStatusResponseType oldFederationSaveStatusResponse = federationSaveStatusResponse;
		federationSaveStatusResponse = newFederationSaveStatusResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE, oldFederationSaveStatusResponse, newFederationSaveStatusResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationSaveStatusResponse(FederationSaveStatusResponseType newFederationSaveStatusResponse) {
		if (newFederationSaveStatusResponse != federationSaveStatusResponse) {
			NotificationChain msgs = null;
			if (federationSaveStatusResponse != null)
				msgs = ((InternalEObject)federationSaveStatusResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE, null, msgs);
			if (newFederationSaveStatusResponse != null)
				msgs = ((InternalEObject)newFederationSaveStatusResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE, null, msgs);
			msgs = basicSetFederationSaveStatusResponse(newFederationSaveStatusResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE, newFederationSaveStatusResponse, newFederationSaveStatusResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestFederationRestoreType getRequestFederationRestore() {
		return requestFederationRestore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestFederationRestore(RequestFederationRestoreType newRequestFederationRestore, NotificationChain msgs) {
		RequestFederationRestoreType oldRequestFederationRestore = requestFederationRestore;
		requestFederationRestore = newRequestFederationRestore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE, oldRequestFederationRestore, newRequestFederationRestore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestFederationRestore(RequestFederationRestoreType newRequestFederationRestore) {
		if (newRequestFederationRestore != requestFederationRestore) {
			NotificationChain msgs = null;
			if (requestFederationRestore != null)
				msgs = ((InternalEObject)requestFederationRestore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE, null, msgs);
			if (newRequestFederationRestore != null)
				msgs = ((InternalEObject)newRequestFederationRestore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE, null, msgs);
			msgs = basicSetRequestFederationRestore(newRequestFederationRestore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE, newRequestFederationRestore, newRequestFederationRestore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmFederationRestorationRequestType getConfirmFederationRestorationRequest() {
		return confirmFederationRestorationRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmFederationRestorationRequest(ConfirmFederationRestorationRequestType newConfirmFederationRestorationRequest, NotificationChain msgs) {
		ConfirmFederationRestorationRequestType oldConfirmFederationRestorationRequest = confirmFederationRestorationRequest;
		confirmFederationRestorationRequest = newConfirmFederationRestorationRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST, oldConfirmFederationRestorationRequest, newConfirmFederationRestorationRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmFederationRestorationRequest(ConfirmFederationRestorationRequestType newConfirmFederationRestorationRequest) {
		if (newConfirmFederationRestorationRequest != confirmFederationRestorationRequest) {
			NotificationChain msgs = null;
			if (confirmFederationRestorationRequest != null)
				msgs = ((InternalEObject)confirmFederationRestorationRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST, null, msgs);
			if (newConfirmFederationRestorationRequest != null)
				msgs = ((InternalEObject)newConfirmFederationRestorationRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST, null, msgs);
			msgs = basicSetConfirmFederationRestorationRequest(newConfirmFederationRestorationRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST, newConfirmFederationRestorationRequest, newConfirmFederationRestorationRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreBegunType getFederationRestoreBegun() {
		return federationRestoreBegun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationRestoreBegun(FederationRestoreBegunType newFederationRestoreBegun, NotificationChain msgs) {
		FederationRestoreBegunType oldFederationRestoreBegun = federationRestoreBegun;
		federationRestoreBegun = newFederationRestoreBegun;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN, oldFederationRestoreBegun, newFederationRestoreBegun);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationRestoreBegun(FederationRestoreBegunType newFederationRestoreBegun) {
		if (newFederationRestoreBegun != federationRestoreBegun) {
			NotificationChain msgs = null;
			if (federationRestoreBegun != null)
				msgs = ((InternalEObject)federationRestoreBegun).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN, null, msgs);
			if (newFederationRestoreBegun != null)
				msgs = ((InternalEObject)newFederationRestoreBegun).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN, null, msgs);
			msgs = basicSetFederationRestoreBegun(newFederationRestoreBegun, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN, newFederationRestoreBegun, newFederationRestoreBegun));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitiateFederateRestoreType getInitiateFederateRestore() {
		return initiateFederateRestore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitiateFederateRestore(InitiateFederateRestoreType newInitiateFederateRestore, NotificationChain msgs) {
		InitiateFederateRestoreType oldInitiateFederateRestore = initiateFederateRestore;
		initiateFederateRestore = newInitiateFederateRestore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE, oldInitiateFederateRestore, newInitiateFederateRestore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitiateFederateRestore(InitiateFederateRestoreType newInitiateFederateRestore) {
		if (newInitiateFederateRestore != initiateFederateRestore) {
			NotificationChain msgs = null;
			if (initiateFederateRestore != null)
				msgs = ((InternalEObject)initiateFederateRestore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE, null, msgs);
			if (newInitiateFederateRestore != null)
				msgs = ((InternalEObject)newInitiateFederateRestore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE, null, msgs);
			msgs = basicSetInitiateFederateRestore(newInitiateFederateRestore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE, newInitiateFederateRestore, newInitiateFederateRestore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederateRestoreCompleteType getFederateRestoreComplete() {
		return federateRestoreComplete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederateRestoreComplete(FederateRestoreCompleteType newFederateRestoreComplete, NotificationChain msgs) {
		FederateRestoreCompleteType oldFederateRestoreComplete = federateRestoreComplete;
		federateRestoreComplete = newFederateRestoreComplete;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE, oldFederateRestoreComplete, newFederateRestoreComplete);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederateRestoreComplete(FederateRestoreCompleteType newFederateRestoreComplete) {
		if (newFederateRestoreComplete != federateRestoreComplete) {
			NotificationChain msgs = null;
			if (federateRestoreComplete != null)
				msgs = ((InternalEObject)federateRestoreComplete).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE, null, msgs);
			if (newFederateRestoreComplete != null)
				msgs = ((InternalEObject)newFederateRestoreComplete).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE, null, msgs);
			msgs = basicSetFederateRestoreComplete(newFederateRestoreComplete, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE, newFederateRestoreComplete, newFederateRestoreComplete));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoredType getFederationRestored() {
		return federationRestored;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationRestored(FederationRestoredType newFederationRestored, NotificationChain msgs) {
		FederationRestoredType oldFederationRestored = federationRestored;
		federationRestored = newFederationRestored;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED, oldFederationRestored, newFederationRestored);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationRestored(FederationRestoredType newFederationRestored) {
		if (newFederationRestored != federationRestored) {
			NotificationChain msgs = null;
			if (federationRestored != null)
				msgs = ((InternalEObject)federationRestored).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED, null, msgs);
			if (newFederationRestored != null)
				msgs = ((InternalEObject)newFederationRestored).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED, null, msgs);
			msgs = basicSetFederationRestored(newFederationRestored, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED, newFederationRestored, newFederationRestored));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbortFederationRestoreType getAbortFederationRestore() {
		return abortFederationRestore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbortFederationRestore(AbortFederationRestoreType newAbortFederationRestore, NotificationChain msgs) {
		AbortFederationRestoreType oldAbortFederationRestore = abortFederationRestore;
		abortFederationRestore = newAbortFederationRestore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE, oldAbortFederationRestore, newAbortFederationRestore);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbortFederationRestore(AbortFederationRestoreType newAbortFederationRestore) {
		if (newAbortFederationRestore != abortFederationRestore) {
			NotificationChain msgs = null;
			if (abortFederationRestore != null)
				msgs = ((InternalEObject)abortFederationRestore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE, null, msgs);
			if (newAbortFederationRestore != null)
				msgs = ((InternalEObject)newAbortFederationRestore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE, null, msgs);
			msgs = basicSetAbortFederationRestore(newAbortFederationRestore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE, newAbortFederationRestore, newAbortFederationRestore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryFederationRestoreStatusType getQueryFederationRestoreStatus() {
		return queryFederationRestoreStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryFederationRestoreStatus(QueryFederationRestoreStatusType newQueryFederationRestoreStatus, NotificationChain msgs) {
		QueryFederationRestoreStatusType oldQueryFederationRestoreStatus = queryFederationRestoreStatus;
		queryFederationRestoreStatus = newQueryFederationRestoreStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS, oldQueryFederationRestoreStatus, newQueryFederationRestoreStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryFederationRestoreStatus(QueryFederationRestoreStatusType newQueryFederationRestoreStatus) {
		if (newQueryFederationRestoreStatus != queryFederationRestoreStatus) {
			NotificationChain msgs = null;
			if (queryFederationRestoreStatus != null)
				msgs = ((InternalEObject)queryFederationRestoreStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS, null, msgs);
			if (newQueryFederationRestoreStatus != null)
				msgs = ((InternalEObject)newQueryFederationRestoreStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS, null, msgs);
			msgs = basicSetQueryFederationRestoreStatus(newQueryFederationRestoreStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS, newQueryFederationRestoreStatus, newQueryFederationRestoreStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederationRestoreStatusResponseType getFederationRestoreStatusResponse() {
		return federationRestoreStatusResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFederationRestoreStatusResponse(FederationRestoreStatusResponseType newFederationRestoreStatusResponse, NotificationChain msgs) {
		FederationRestoreStatusResponseType oldFederationRestoreStatusResponse = federationRestoreStatusResponse;
		federationRestoreStatusResponse = newFederationRestoreStatusResponse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE, oldFederationRestoreStatusResponse, newFederationRestoreStatusResponse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFederationRestoreStatusResponse(FederationRestoreStatusResponseType newFederationRestoreStatusResponse) {
		if (newFederationRestoreStatusResponse != federationRestoreStatusResponse) {
			NotificationChain msgs = null;
			if (federationRestoreStatusResponse != null)
				msgs = ((InternalEObject)federationRestoreStatusResponse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE, null, msgs);
			if (newFederationRestoreStatusResponse != null)
				msgs = ((InternalEObject)newFederationRestoreStatusResponse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE, null, msgs);
			msgs = basicSetFederationRestoreStatusResponse(newFederationRestoreStatusResponse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE, newFederationRestoreStatusResponse, newFederationRestoreStatusResponse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishObjectClassAttributesType getPublishObjectClassAttributes() {
		return publishObjectClassAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishObjectClassAttributes(PublishObjectClassAttributesType newPublishObjectClassAttributes, NotificationChain msgs) {
		PublishObjectClassAttributesType oldPublishObjectClassAttributes = publishObjectClassAttributes;
		publishObjectClassAttributes = newPublishObjectClassAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES, oldPublishObjectClassAttributes, newPublishObjectClassAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishObjectClassAttributes(PublishObjectClassAttributesType newPublishObjectClassAttributes) {
		if (newPublishObjectClassAttributes != publishObjectClassAttributes) {
			NotificationChain msgs = null;
			if (publishObjectClassAttributes != null)
				msgs = ((InternalEObject)publishObjectClassAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			if (newPublishObjectClassAttributes != null)
				msgs = ((InternalEObject)newPublishObjectClassAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			msgs = basicSetPublishObjectClassAttributes(newPublishObjectClassAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES, newPublishObjectClassAttributes, newPublishObjectClassAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishObjectClassAttributesType getUnpublishObjectClassAttributes() {
		return unpublishObjectClassAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnpublishObjectClassAttributes(UnpublishObjectClassAttributesType newUnpublishObjectClassAttributes, NotificationChain msgs) {
		UnpublishObjectClassAttributesType oldUnpublishObjectClassAttributes = unpublishObjectClassAttributes;
		unpublishObjectClassAttributes = newUnpublishObjectClassAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES, oldUnpublishObjectClassAttributes, newUnpublishObjectClassAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnpublishObjectClassAttributes(UnpublishObjectClassAttributesType newUnpublishObjectClassAttributes) {
		if (newUnpublishObjectClassAttributes != unpublishObjectClassAttributes) {
			NotificationChain msgs = null;
			if (unpublishObjectClassAttributes != null)
				msgs = ((InternalEObject)unpublishObjectClassAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			if (newUnpublishObjectClassAttributes != null)
				msgs = ((InternalEObject)newUnpublishObjectClassAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			msgs = basicSetUnpublishObjectClassAttributes(newUnpublishObjectClassAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES, newUnpublishObjectClassAttributes, newUnpublishObjectClassAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublishInteractionClassType getPublishInteractionClass() {
		return publishInteractionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublishInteractionClass(PublishInteractionClassType newPublishInteractionClass, NotificationChain msgs) {
		PublishInteractionClassType oldPublishInteractionClass = publishInteractionClass;
		publishInteractionClass = newPublishInteractionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS, oldPublishInteractionClass, newPublishInteractionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublishInteractionClass(PublishInteractionClassType newPublishInteractionClass) {
		if (newPublishInteractionClass != publishInteractionClass) {
			NotificationChain msgs = null;
			if (publishInteractionClass != null)
				msgs = ((InternalEObject)publishInteractionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS, null, msgs);
			if (newPublishInteractionClass != null)
				msgs = ((InternalEObject)newPublishInteractionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS, null, msgs);
			msgs = basicSetPublishInteractionClass(newPublishInteractionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS, newPublishInteractionClass, newPublishInteractionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnpublishInteractionClassType getUnpublishInteractionClass() {
		return unpublishInteractionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnpublishInteractionClass(UnpublishInteractionClassType newUnpublishInteractionClass, NotificationChain msgs) {
		UnpublishInteractionClassType oldUnpublishInteractionClass = unpublishInteractionClass;
		unpublishInteractionClass = newUnpublishInteractionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS, oldUnpublishInteractionClass, newUnpublishInteractionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnpublishInteractionClass(UnpublishInteractionClassType newUnpublishInteractionClass) {
		if (newUnpublishInteractionClass != unpublishInteractionClass) {
			NotificationChain msgs = null;
			if (unpublishInteractionClass != null)
				msgs = ((InternalEObject)unpublishInteractionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS, null, msgs);
			if (newUnpublishInteractionClass != null)
				msgs = ((InternalEObject)newUnpublishInteractionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS, null, msgs);
			msgs = basicSetUnpublishInteractionClass(newUnpublishInteractionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS, newUnpublishInteractionClass, newUnpublishInteractionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesType getSubscribeObjectClassAttributes() {
		return subscribeObjectClassAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeObjectClassAttributes(SubscribeObjectClassAttributesType newSubscribeObjectClassAttributes, NotificationChain msgs) {
		SubscribeObjectClassAttributesType oldSubscribeObjectClassAttributes = subscribeObjectClassAttributes;
		subscribeObjectClassAttributes = newSubscribeObjectClassAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, oldSubscribeObjectClassAttributes, newSubscribeObjectClassAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeObjectClassAttributes(SubscribeObjectClassAttributesType newSubscribeObjectClassAttributes) {
		if (newSubscribeObjectClassAttributes != subscribeObjectClassAttributes) {
			NotificationChain msgs = null;
			if (subscribeObjectClassAttributes != null)
				msgs = ((InternalEObject)subscribeObjectClassAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			if (newSubscribeObjectClassAttributes != null)
				msgs = ((InternalEObject)newSubscribeObjectClassAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			msgs = basicSetSubscribeObjectClassAttributes(newSubscribeObjectClassAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, newSubscribeObjectClassAttributes, newSubscribeObjectClassAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesType getUnsubscribeObjectClassAttributes() {
		return unsubscribeObjectClassAttributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeObjectClassAttributes(UnsubscribeObjectClassAttributesType newUnsubscribeObjectClassAttributes, NotificationChain msgs) {
		UnsubscribeObjectClassAttributesType oldUnsubscribeObjectClassAttributes = unsubscribeObjectClassAttributes;
		unsubscribeObjectClassAttributes = newUnsubscribeObjectClassAttributes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, oldUnsubscribeObjectClassAttributes, newUnsubscribeObjectClassAttributes);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsubscribeObjectClassAttributes(UnsubscribeObjectClassAttributesType newUnsubscribeObjectClassAttributes) {
		if (newUnsubscribeObjectClassAttributes != unsubscribeObjectClassAttributes) {
			NotificationChain msgs = null;
			if (unsubscribeObjectClassAttributes != null)
				msgs = ((InternalEObject)unsubscribeObjectClassAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			if (newUnsubscribeObjectClassAttributes != null)
				msgs = ((InternalEObject)newUnsubscribeObjectClassAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, null, msgs);
			msgs = basicSetUnsubscribeObjectClassAttributes(newUnsubscribeObjectClassAttributes, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES, newUnsubscribeObjectClassAttributes, newUnsubscribeObjectClassAttributes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassType getSubscribeInteractionClass() {
		return subscribeInteractionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeInteractionClass(SubscribeInteractionClassType newSubscribeInteractionClass, NotificationChain msgs) {
		SubscribeInteractionClassType oldSubscribeInteractionClass = subscribeInteractionClass;
		subscribeInteractionClass = newSubscribeInteractionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS, oldSubscribeInteractionClass, newSubscribeInteractionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeInteractionClass(SubscribeInteractionClassType newSubscribeInteractionClass) {
		if (newSubscribeInteractionClass != subscribeInteractionClass) {
			NotificationChain msgs = null;
			if (subscribeInteractionClass != null)
				msgs = ((InternalEObject)subscribeInteractionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS, null, msgs);
			if (newSubscribeInteractionClass != null)
				msgs = ((InternalEObject)newSubscribeInteractionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS, null, msgs);
			msgs = basicSetSubscribeInteractionClass(newSubscribeInteractionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS, newSubscribeInteractionClass, newSubscribeInteractionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassType getUnsubscribeInteractionClass() {
		return unsubscribeInteractionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeInteractionClass(UnsubscribeInteractionClassType newUnsubscribeInteractionClass, NotificationChain msgs) {
		UnsubscribeInteractionClassType oldUnsubscribeInteractionClass = unsubscribeInteractionClass;
		unsubscribeInteractionClass = newUnsubscribeInteractionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS, oldUnsubscribeInteractionClass, newUnsubscribeInteractionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsubscribeInteractionClass(UnsubscribeInteractionClassType newUnsubscribeInteractionClass) {
		if (newUnsubscribeInteractionClass != unsubscribeInteractionClass) {
			NotificationChain msgs = null;
			if (unsubscribeInteractionClass != null)
				msgs = ((InternalEObject)unsubscribeInteractionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS, null, msgs);
			if (newUnsubscribeInteractionClass != null)
				msgs = ((InternalEObject)newUnsubscribeInteractionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS, null, msgs);
			msgs = basicSetUnsubscribeInteractionClass(newUnsubscribeInteractionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS, newUnsubscribeInteractionClass, newUnsubscribeInteractionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartRegistrationForObjectClassType getStartRegistrationForObjectClass() {
		return startRegistrationForObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStartRegistrationForObjectClass(StartRegistrationForObjectClassType newStartRegistrationForObjectClass, NotificationChain msgs) {
		StartRegistrationForObjectClassType oldStartRegistrationForObjectClass = startRegistrationForObjectClass;
		startRegistrationForObjectClass = newStartRegistrationForObjectClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS, oldStartRegistrationForObjectClass, newStartRegistrationForObjectClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartRegistrationForObjectClass(StartRegistrationForObjectClassType newStartRegistrationForObjectClass) {
		if (newStartRegistrationForObjectClass != startRegistrationForObjectClass) {
			NotificationChain msgs = null;
			if (startRegistrationForObjectClass != null)
				msgs = ((InternalEObject)startRegistrationForObjectClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS, null, msgs);
			if (newStartRegistrationForObjectClass != null)
				msgs = ((InternalEObject)newStartRegistrationForObjectClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS, null, msgs);
			msgs = basicSetStartRegistrationForObjectClass(newStartRegistrationForObjectClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS, newStartRegistrationForObjectClass, newStartRegistrationForObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopRegistrationForObjectClassType getStopRegistrationForObjectClass() {
		return stopRegistrationForObjectClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStopRegistrationForObjectClass(StopRegistrationForObjectClassType newStopRegistrationForObjectClass, NotificationChain msgs) {
		StopRegistrationForObjectClassType oldStopRegistrationForObjectClass = stopRegistrationForObjectClass;
		stopRegistrationForObjectClass = newStopRegistrationForObjectClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS, oldStopRegistrationForObjectClass, newStopRegistrationForObjectClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopRegistrationForObjectClass(StopRegistrationForObjectClassType newStopRegistrationForObjectClass) {
		if (newStopRegistrationForObjectClass != stopRegistrationForObjectClass) {
			NotificationChain msgs = null;
			if (stopRegistrationForObjectClass != null)
				msgs = ((InternalEObject)stopRegistrationForObjectClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS, null, msgs);
			if (newStopRegistrationForObjectClass != null)
				msgs = ((InternalEObject)newStopRegistrationForObjectClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS, null, msgs);
			msgs = basicSetStopRegistrationForObjectClass(newStopRegistrationForObjectClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS, newStopRegistrationForObjectClass, newStopRegistrationForObjectClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOnType getTurnInteractionsOn() {
		return turnInteractionsOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnInteractionsOn(TurnInteractionsOnType newTurnInteractionsOn, NotificationChain msgs) {
		TurnInteractionsOnType oldTurnInteractionsOn = turnInteractionsOn;
		turnInteractionsOn = newTurnInteractionsOn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON, oldTurnInteractionsOn, newTurnInteractionsOn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnInteractionsOn(TurnInteractionsOnType newTurnInteractionsOn) {
		if (newTurnInteractionsOn != turnInteractionsOn) {
			NotificationChain msgs = null;
			if (turnInteractionsOn != null)
				msgs = ((InternalEObject)turnInteractionsOn).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON, null, msgs);
			if (newTurnInteractionsOn != null)
				msgs = ((InternalEObject)newTurnInteractionsOn).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON, null, msgs);
			msgs = basicSetTurnInteractionsOn(newTurnInteractionsOn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON, newTurnInteractionsOn, newTurnInteractionsOn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnInteractionsOffType getTurnInteractionsOff() {
		return turnInteractionsOff;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnInteractionsOff(TurnInteractionsOffType newTurnInteractionsOff, NotificationChain msgs) {
		TurnInteractionsOffType oldTurnInteractionsOff = turnInteractionsOff;
		turnInteractionsOff = newTurnInteractionsOff;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF, oldTurnInteractionsOff, newTurnInteractionsOff);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnInteractionsOff(TurnInteractionsOffType newTurnInteractionsOff) {
		if (newTurnInteractionsOff != turnInteractionsOff) {
			NotificationChain msgs = null;
			if (turnInteractionsOff != null)
				msgs = ((InternalEObject)turnInteractionsOff).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF, null, msgs);
			if (newTurnInteractionsOff != null)
				msgs = ((InternalEObject)newTurnInteractionsOff).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF, null, msgs);
			msgs = basicSetTurnInteractionsOff(newTurnInteractionsOff, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF, newTurnInteractionsOff, newTurnInteractionsOff));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveObjectInstanceNameType getReserveObjectInstanceName() {
		return reserveObjectInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveObjectInstanceName(ReserveObjectInstanceNameType newReserveObjectInstanceName, NotificationChain msgs) {
		ReserveObjectInstanceNameType oldReserveObjectInstanceName = reserveObjectInstanceName;
		reserveObjectInstanceName = newReserveObjectInstanceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME, oldReserveObjectInstanceName, newReserveObjectInstanceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserveObjectInstanceName(ReserveObjectInstanceNameType newReserveObjectInstanceName) {
		if (newReserveObjectInstanceName != reserveObjectInstanceName) {
			NotificationChain msgs = null;
			if (reserveObjectInstanceName != null)
				msgs = ((InternalEObject)reserveObjectInstanceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME, null, msgs);
			if (newReserveObjectInstanceName != null)
				msgs = ((InternalEObject)newReserveObjectInstanceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME, null, msgs);
			msgs = basicSetReserveObjectInstanceName(newReserveObjectInstanceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME, newReserveObjectInstanceName, newReserveObjectInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObjectInstanceNameReservedType getObjectInstanceNameReserved() {
		return objectInstanceNameReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetObjectInstanceNameReserved(ObjectInstanceNameReservedType newObjectInstanceNameReserved, NotificationChain msgs) {
		ObjectInstanceNameReservedType oldObjectInstanceNameReserved = objectInstanceNameReserved;
		objectInstanceNameReserved = newObjectInstanceNameReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED, oldObjectInstanceNameReserved, newObjectInstanceNameReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectInstanceNameReserved(ObjectInstanceNameReservedType newObjectInstanceNameReserved) {
		if (newObjectInstanceNameReserved != objectInstanceNameReserved) {
			NotificationChain msgs = null;
			if (objectInstanceNameReserved != null)
				msgs = ((InternalEObject)objectInstanceNameReserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED, null, msgs);
			if (newObjectInstanceNameReserved != null)
				msgs = ((InternalEObject)newObjectInstanceNameReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED, null, msgs);
			msgs = basicSetObjectInstanceNameReserved(newObjectInstanceNameReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED, newObjectInstanceNameReserved, newObjectInstanceNameReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseObjectInstanceNameType getReleaseObjectInstanceName() {
		return releaseObjectInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseObjectInstanceName(ReleaseObjectInstanceNameType newReleaseObjectInstanceName, NotificationChain msgs) {
		ReleaseObjectInstanceNameType oldReleaseObjectInstanceName = releaseObjectInstanceName;
		releaseObjectInstanceName = newReleaseObjectInstanceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME, oldReleaseObjectInstanceName, newReleaseObjectInstanceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseObjectInstanceName(ReleaseObjectInstanceNameType newReleaseObjectInstanceName) {
		if (newReleaseObjectInstanceName != releaseObjectInstanceName) {
			NotificationChain msgs = null;
			if (releaseObjectInstanceName != null)
				msgs = ((InternalEObject)releaseObjectInstanceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME, null, msgs);
			if (newReleaseObjectInstanceName != null)
				msgs = ((InternalEObject)newReleaseObjectInstanceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME, null, msgs);
			msgs = basicSetReleaseObjectInstanceName(newReleaseObjectInstanceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME, newReleaseObjectInstanceName, newReleaseObjectInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReserveMultipleObjectInstanceNamesType getReserveMultipleObjectInstanceNames() {
		return reserveMultipleObjectInstanceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReserveMultipleObjectInstanceNames(ReserveMultipleObjectInstanceNamesType newReserveMultipleObjectInstanceNames, NotificationChain msgs) {
		ReserveMultipleObjectInstanceNamesType oldReserveMultipleObjectInstanceNames = reserveMultipleObjectInstanceNames;
		reserveMultipleObjectInstanceNames = newReserveMultipleObjectInstanceNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES, oldReserveMultipleObjectInstanceNames, newReserveMultipleObjectInstanceNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserveMultipleObjectInstanceNames(ReserveMultipleObjectInstanceNamesType newReserveMultipleObjectInstanceNames) {
		if (newReserveMultipleObjectInstanceNames != reserveMultipleObjectInstanceNames) {
			NotificationChain msgs = null;
			if (reserveMultipleObjectInstanceNames != null)
				msgs = ((InternalEObject)reserveMultipleObjectInstanceNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES, null, msgs);
			if (newReserveMultipleObjectInstanceNames != null)
				msgs = ((InternalEObject)newReserveMultipleObjectInstanceNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES, null, msgs);
			msgs = basicSetReserveMultipleObjectInstanceNames(newReserveMultipleObjectInstanceNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES, newReserveMultipleObjectInstanceNames, newReserveMultipleObjectInstanceNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleObjectInstanceNamesReservedType getMultipleObjectInstanceNamesReserved() {
		return multipleObjectInstanceNamesReserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultipleObjectInstanceNamesReserved(MultipleObjectInstanceNamesReservedType newMultipleObjectInstanceNamesReserved, NotificationChain msgs) {
		MultipleObjectInstanceNamesReservedType oldMultipleObjectInstanceNamesReserved = multipleObjectInstanceNamesReserved;
		multipleObjectInstanceNamesReserved = newMultipleObjectInstanceNamesReserved;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED, oldMultipleObjectInstanceNamesReserved, newMultipleObjectInstanceNamesReserved);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMultipleObjectInstanceNamesReserved(MultipleObjectInstanceNamesReservedType newMultipleObjectInstanceNamesReserved) {
		if (newMultipleObjectInstanceNamesReserved != multipleObjectInstanceNamesReserved) {
			NotificationChain msgs = null;
			if (multipleObjectInstanceNamesReserved != null)
				msgs = ((InternalEObject)multipleObjectInstanceNamesReserved).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED, null, msgs);
			if (newMultipleObjectInstanceNamesReserved != null)
				msgs = ((InternalEObject)newMultipleObjectInstanceNamesReserved).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED, null, msgs);
			msgs = basicSetMultipleObjectInstanceNamesReserved(newMultipleObjectInstanceNamesReserved, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED, newMultipleObjectInstanceNamesReserved, newMultipleObjectInstanceNamesReserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReleaseMultipleObjectInstanceNamesType getReleaseMultipleObjectInstanceNames() {
		return releaseMultipleObjectInstanceNames;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReleaseMultipleObjectInstanceNames(ReleaseMultipleObjectInstanceNamesType newReleaseMultipleObjectInstanceNames, NotificationChain msgs) {
		ReleaseMultipleObjectInstanceNamesType oldReleaseMultipleObjectInstanceNames = releaseMultipleObjectInstanceNames;
		releaseMultipleObjectInstanceNames = newReleaseMultipleObjectInstanceNames;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES, oldReleaseMultipleObjectInstanceNames, newReleaseMultipleObjectInstanceNames);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseMultipleObjectInstanceNames(ReleaseMultipleObjectInstanceNamesType newReleaseMultipleObjectInstanceNames) {
		if (newReleaseMultipleObjectInstanceNames != releaseMultipleObjectInstanceNames) {
			NotificationChain msgs = null;
			if (releaseMultipleObjectInstanceNames != null)
				msgs = ((InternalEObject)releaseMultipleObjectInstanceNames).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES, null, msgs);
			if (newReleaseMultipleObjectInstanceNames != null)
				msgs = ((InternalEObject)newReleaseMultipleObjectInstanceNames).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES, null, msgs);
			msgs = basicSetReleaseMultipleObjectInstanceNames(newReleaseMultipleObjectInstanceNames, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES, newReleaseMultipleObjectInstanceNames, newReleaseMultipleObjectInstanceNames));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceType getRegisterObjectInstance() {
		return registerObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterObjectInstance(RegisterObjectInstanceType newRegisterObjectInstance, NotificationChain msgs) {
		RegisterObjectInstanceType oldRegisterObjectInstance = registerObjectInstance;
		registerObjectInstance = newRegisterObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE, oldRegisterObjectInstance, newRegisterObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterObjectInstance(RegisterObjectInstanceType newRegisterObjectInstance) {
		if (newRegisterObjectInstance != registerObjectInstance) {
			NotificationChain msgs = null;
			if (registerObjectInstance != null)
				msgs = ((InternalEObject)registerObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE, null, msgs);
			if (newRegisterObjectInstance != null)
				msgs = ((InternalEObject)newRegisterObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetRegisterObjectInstance(newRegisterObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE, newRegisterObjectInstance, newRegisterObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscoverObjectInstanceType getDiscoverObjectInstance() {
		return discoverObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscoverObjectInstance(DiscoverObjectInstanceType newDiscoverObjectInstance, NotificationChain msgs) {
		DiscoverObjectInstanceType oldDiscoverObjectInstance = discoverObjectInstance;
		discoverObjectInstance = newDiscoverObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE, oldDiscoverObjectInstance, newDiscoverObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscoverObjectInstance(DiscoverObjectInstanceType newDiscoverObjectInstance) {
		if (newDiscoverObjectInstance != discoverObjectInstance) {
			NotificationChain msgs = null;
			if (discoverObjectInstance != null)
				msgs = ((InternalEObject)discoverObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE, null, msgs);
			if (newDiscoverObjectInstance != null)
				msgs = ((InternalEObject)newDiscoverObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetDiscoverObjectInstance(newDiscoverObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE, newDiscoverObjectInstance, newDiscoverObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UpdateAttributeValuesType getUpdateAttributeValues() {
		return updateAttributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpdateAttributeValues(UpdateAttributeValuesType newUpdateAttributeValues, NotificationChain msgs) {
		UpdateAttributeValuesType oldUpdateAttributeValues = updateAttributeValues;
		updateAttributeValues = newUpdateAttributeValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES, oldUpdateAttributeValues, newUpdateAttributeValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpdateAttributeValues(UpdateAttributeValuesType newUpdateAttributeValues) {
		if (newUpdateAttributeValues != updateAttributeValues) {
			NotificationChain msgs = null;
			if (updateAttributeValues != null)
				msgs = ((InternalEObject)updateAttributeValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES, null, msgs);
			if (newUpdateAttributeValues != null)
				msgs = ((InternalEObject)newUpdateAttributeValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES, null, msgs);
			msgs = basicSetUpdateAttributeValues(newUpdateAttributeValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES, newUpdateAttributeValues, newUpdateAttributeValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReflectAttributeValuesType getReflectAttributeValues() {
		return reflectAttributeValues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReflectAttributeValues(ReflectAttributeValuesType newReflectAttributeValues, NotificationChain msgs) {
		ReflectAttributeValuesType oldReflectAttributeValues = reflectAttributeValues;
		reflectAttributeValues = newReflectAttributeValues;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES, oldReflectAttributeValues, newReflectAttributeValues);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReflectAttributeValues(ReflectAttributeValuesType newReflectAttributeValues) {
		if (newReflectAttributeValues != reflectAttributeValues) {
			NotificationChain msgs = null;
			if (reflectAttributeValues != null)
				msgs = ((InternalEObject)reflectAttributeValues).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES, null, msgs);
			if (newReflectAttributeValues != null)
				msgs = ((InternalEObject)newReflectAttributeValues).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES, null, msgs);
			msgs = basicSetReflectAttributeValues(newReflectAttributeValues, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES, newReflectAttributeValues, newReflectAttributeValues));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionType getSendInteraction() {
		return sendInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendInteraction(SendInteractionType newSendInteraction, NotificationChain msgs) {
		SendInteractionType oldSendInteraction = sendInteraction;
		sendInteraction = newSendInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION, oldSendInteraction, newSendInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendInteraction(SendInteractionType newSendInteraction) {
		if (newSendInteraction != sendInteraction) {
			NotificationChain msgs = null;
			if (sendInteraction != null)
				msgs = ((InternalEObject)sendInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION, null, msgs);
			if (newSendInteraction != null)
				msgs = ((InternalEObject)newSendInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION, null, msgs);
			msgs = basicSetSendInteraction(newSendInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION, newSendInteraction, newSendInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReceiveInteractionType getReceiveInteraction() {
		return receiveInteraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReceiveInteraction(ReceiveInteractionType newReceiveInteraction, NotificationChain msgs) {
		ReceiveInteractionType oldReceiveInteraction = receiveInteraction;
		receiveInteraction = newReceiveInteraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION, oldReceiveInteraction, newReceiveInteraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceiveInteraction(ReceiveInteractionType newReceiveInteraction) {
		if (newReceiveInteraction != receiveInteraction) {
			NotificationChain msgs = null;
			if (receiveInteraction != null)
				msgs = ((InternalEObject)receiveInteraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION, null, msgs);
			if (newReceiveInteraction != null)
				msgs = ((InternalEObject)newReceiveInteraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION, null, msgs);
			msgs = basicSetReceiveInteraction(newReceiveInteraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION, newReceiveInteraction, newReceiveInteraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteObjectInstanceType getDeleteObjectInstance() {
		return deleteObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteObjectInstance(DeleteObjectInstanceType newDeleteObjectInstance, NotificationChain msgs) {
		DeleteObjectInstanceType oldDeleteObjectInstance = deleteObjectInstance;
		deleteObjectInstance = newDeleteObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE, oldDeleteObjectInstance, newDeleteObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteObjectInstance(DeleteObjectInstanceType newDeleteObjectInstance) {
		if (newDeleteObjectInstance != deleteObjectInstance) {
			NotificationChain msgs = null;
			if (deleteObjectInstance != null)
				msgs = ((InternalEObject)deleteObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE, null, msgs);
			if (newDeleteObjectInstance != null)
				msgs = ((InternalEObject)newDeleteObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetDeleteObjectInstance(newDeleteObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE, newDeleteObjectInstance, newDeleteObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RemoveobjectinstanceType getRemoveobjectinstance() {
		return removeobjectinstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRemoveobjectinstance(RemoveobjectinstanceType newRemoveobjectinstance, NotificationChain msgs) {
		RemoveobjectinstanceType oldRemoveobjectinstance = removeobjectinstance;
		removeobjectinstance = newRemoveobjectinstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE, oldRemoveobjectinstance, newRemoveobjectinstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveobjectinstance(RemoveobjectinstanceType newRemoveobjectinstance) {
		if (newRemoveobjectinstance != removeobjectinstance) {
			NotificationChain msgs = null;
			if (removeobjectinstance != null)
				msgs = ((InternalEObject)removeobjectinstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE, null, msgs);
			if (newRemoveobjectinstance != null)
				msgs = ((InternalEObject)newRemoveobjectinstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE, null, msgs);
			msgs = basicSetRemoveobjectinstance(newRemoveobjectinstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE, newRemoveobjectinstance, newRemoveobjectinstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalDeleteObjectInstanceType getLocalDeleteObjectInstance() {
		return localDeleteObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocalDeleteObjectInstance(LocalDeleteObjectInstanceType newLocalDeleteObjectInstance, NotificationChain msgs) {
		LocalDeleteObjectInstanceType oldLocalDeleteObjectInstance = localDeleteObjectInstance;
		localDeleteObjectInstance = newLocalDeleteObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE, oldLocalDeleteObjectInstance, newLocalDeleteObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocalDeleteObjectInstance(LocalDeleteObjectInstanceType newLocalDeleteObjectInstance) {
		if (newLocalDeleteObjectInstance != localDeleteObjectInstance) {
			NotificationChain msgs = null;
			if (localDeleteObjectInstance != null)
				msgs = ((InternalEObject)localDeleteObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE, null, msgs);
			if (newLocalDeleteObjectInstance != null)
				msgs = ((InternalEObject)newLocalDeleteObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetLocalDeleteObjectInstance(newLocalDeleteObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE, newLocalDeleteObjectInstance, newLocalDeleteObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesInScopeType getAttributesInScope() {
		return attributesInScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributesInScope(AttributesInScopeType newAttributesInScope, NotificationChain msgs) {
		AttributesInScopeType oldAttributesInScope = attributesInScope;
		attributesInScope = newAttributesInScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE, oldAttributesInScope, newAttributesInScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributesInScope(AttributesInScopeType newAttributesInScope) {
		if (newAttributesInScope != attributesInScope) {
			NotificationChain msgs = null;
			if (attributesInScope != null)
				msgs = ((InternalEObject)attributesInScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE, null, msgs);
			if (newAttributesInScope != null)
				msgs = ((InternalEObject)newAttributesInScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE, null, msgs);
			msgs = basicSetAttributesInScope(newAttributesInScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE, newAttributesInScope, newAttributesInScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributesOutOfScopeType getAttributesOutOfScope() {
		return attributesOutOfScope;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributesOutOfScope(AttributesOutOfScopeType newAttributesOutOfScope, NotificationChain msgs) {
		AttributesOutOfScopeType oldAttributesOutOfScope = attributesOutOfScope;
		attributesOutOfScope = newAttributesOutOfScope;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE, oldAttributesOutOfScope, newAttributesOutOfScope);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributesOutOfScope(AttributesOutOfScopeType newAttributesOutOfScope) {
		if (newAttributesOutOfScope != attributesOutOfScope) {
			NotificationChain msgs = null;
			if (attributesOutOfScope != null)
				msgs = ((InternalEObject)attributesOutOfScope).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE, null, msgs);
			if (newAttributesOutOfScope != null)
				msgs = ((InternalEObject)newAttributesOutOfScope).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE, null, msgs);
			msgs = basicSetAttributesOutOfScope(newAttributesOutOfScope, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE, newAttributesOutOfScope, newAttributesOutOfScope));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateType getRequestAttributeValueUpdate() {
		return requestAttributeValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAttributeValueUpdate(RequestAttributeValueUpdateType newRequestAttributeValueUpdate, NotificationChain msgs) {
		RequestAttributeValueUpdateType oldRequestAttributeValueUpdate = requestAttributeValueUpdate;
		requestAttributeValueUpdate = newRequestAttributeValueUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE, oldRequestAttributeValueUpdate, newRequestAttributeValueUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAttributeValueUpdate(RequestAttributeValueUpdateType newRequestAttributeValueUpdate) {
		if (newRequestAttributeValueUpdate != requestAttributeValueUpdate) {
			NotificationChain msgs = null;
			if (requestAttributeValueUpdate != null)
				msgs = ((InternalEObject)requestAttributeValueUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE, null, msgs);
			if (newRequestAttributeValueUpdate != null)
				msgs = ((InternalEObject)newRequestAttributeValueUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE, null, msgs);
			msgs = basicSetRequestAttributeValueUpdate(newRequestAttributeValueUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE, newRequestAttributeValueUpdate, newRequestAttributeValueUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvideAttributeValueUpdateType getProvideAttributeValueUpdate() {
		return provideAttributeValueUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProvideAttributeValueUpdate(ProvideAttributeValueUpdateType newProvideAttributeValueUpdate, NotificationChain msgs) {
		ProvideAttributeValueUpdateType oldProvideAttributeValueUpdate = provideAttributeValueUpdate;
		provideAttributeValueUpdate = newProvideAttributeValueUpdate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE, oldProvideAttributeValueUpdate, newProvideAttributeValueUpdate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProvideAttributeValueUpdate(ProvideAttributeValueUpdateType newProvideAttributeValueUpdate) {
		if (newProvideAttributeValueUpdate != provideAttributeValueUpdate) {
			NotificationChain msgs = null;
			if (provideAttributeValueUpdate != null)
				msgs = ((InternalEObject)provideAttributeValueUpdate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE, null, msgs);
			if (newProvideAttributeValueUpdate != null)
				msgs = ((InternalEObject)newProvideAttributeValueUpdate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE, null, msgs);
			msgs = basicSetProvideAttributeValueUpdate(newProvideAttributeValueUpdate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE, newProvideAttributeValueUpdate, newProvideAttributeValueUpdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOnForObjectInstanceType getTurnUpdatesOnForObjectInstance() {
		return turnUpdatesOnForObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnUpdatesOnForObjectInstance(TurnUpdatesOnForObjectInstanceType newTurnUpdatesOnForObjectInstance, NotificationChain msgs) {
		TurnUpdatesOnForObjectInstanceType oldTurnUpdatesOnForObjectInstance = turnUpdatesOnForObjectInstance;
		turnUpdatesOnForObjectInstance = newTurnUpdatesOnForObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE, oldTurnUpdatesOnForObjectInstance, newTurnUpdatesOnForObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnUpdatesOnForObjectInstance(TurnUpdatesOnForObjectInstanceType newTurnUpdatesOnForObjectInstance) {
		if (newTurnUpdatesOnForObjectInstance != turnUpdatesOnForObjectInstance) {
			NotificationChain msgs = null;
			if (turnUpdatesOnForObjectInstance != null)
				msgs = ((InternalEObject)turnUpdatesOnForObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE, null, msgs);
			if (newTurnUpdatesOnForObjectInstance != null)
				msgs = ((InternalEObject)newTurnUpdatesOnForObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetTurnUpdatesOnForObjectInstance(newTurnUpdatesOnForObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE, newTurnUpdatesOnForObjectInstance, newTurnUpdatesOnForObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TurnUpdatesOffForObjectInstanceType getTurnUpdatesOffForObjectInstance() {
		return turnUpdatesOffForObjectInstance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTurnUpdatesOffForObjectInstance(TurnUpdatesOffForObjectInstanceType newTurnUpdatesOffForObjectInstance, NotificationChain msgs) {
		TurnUpdatesOffForObjectInstanceType oldTurnUpdatesOffForObjectInstance = turnUpdatesOffForObjectInstance;
		turnUpdatesOffForObjectInstance = newTurnUpdatesOffForObjectInstance;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE, oldTurnUpdatesOffForObjectInstance, newTurnUpdatesOffForObjectInstance);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTurnUpdatesOffForObjectInstance(TurnUpdatesOffForObjectInstanceType newTurnUpdatesOffForObjectInstance) {
		if (newTurnUpdatesOffForObjectInstance != turnUpdatesOffForObjectInstance) {
			NotificationChain msgs = null;
			if (turnUpdatesOffForObjectInstance != null)
				msgs = ((InternalEObject)turnUpdatesOffForObjectInstance).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE, null, msgs);
			if (newTurnUpdatesOffForObjectInstance != null)
				msgs = ((InternalEObject)newTurnUpdatesOffForObjectInstance).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE, null, msgs);
			msgs = basicSetTurnUpdatesOffForObjectInstance(newTurnUpdatesOffForObjectInstance, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE, newTurnUpdatesOffForObjectInstance, newTurnUpdatesOffForObjectInstance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeTransportationTypeChangeType getRequestAttributeTransportationTypeChange() {
		return requestAttributeTransportationTypeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAttributeTransportationTypeChange(RequestAttributeTransportationTypeChangeType newRequestAttributeTransportationTypeChange, NotificationChain msgs) {
		RequestAttributeTransportationTypeChangeType oldRequestAttributeTransportationTypeChange = requestAttributeTransportationTypeChange;
		requestAttributeTransportationTypeChange = newRequestAttributeTransportationTypeChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, oldRequestAttributeTransportationTypeChange, newRequestAttributeTransportationTypeChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAttributeTransportationTypeChange(RequestAttributeTransportationTypeChangeType newRequestAttributeTransportationTypeChange) {
		if (newRequestAttributeTransportationTypeChange != requestAttributeTransportationTypeChange) {
			NotificationChain msgs = null;
			if (requestAttributeTransportationTypeChange != null)
				msgs = ((InternalEObject)requestAttributeTransportationTypeChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			if (newRequestAttributeTransportationTypeChange != null)
				msgs = ((InternalEObject)newRequestAttributeTransportationTypeChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			msgs = basicSetRequestAttributeTransportationTypeChange(newRequestAttributeTransportationTypeChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, newRequestAttributeTransportationTypeChange, newRequestAttributeTransportationTypeChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeTransportationTypeChangeType getConfirmAttributeTransportationTypeChange() {
		return confirmAttributeTransportationTypeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmAttributeTransportationTypeChange(ConfirmAttributeTransportationTypeChangeType newConfirmAttributeTransportationTypeChange, NotificationChain msgs) {
		ConfirmAttributeTransportationTypeChangeType oldConfirmAttributeTransportationTypeChange = confirmAttributeTransportationTypeChange;
		confirmAttributeTransportationTypeChange = newConfirmAttributeTransportationTypeChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, oldConfirmAttributeTransportationTypeChange, newConfirmAttributeTransportationTypeChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmAttributeTransportationTypeChange(ConfirmAttributeTransportationTypeChangeType newConfirmAttributeTransportationTypeChange) {
		if (newConfirmAttributeTransportationTypeChange != confirmAttributeTransportationTypeChange) {
			NotificationChain msgs = null;
			if (confirmAttributeTransportationTypeChange != null)
				msgs = ((InternalEObject)confirmAttributeTransportationTypeChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			if (newConfirmAttributeTransportationTypeChange != null)
				msgs = ((InternalEObject)newConfirmAttributeTransportationTypeChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			msgs = basicSetConfirmAttributeTransportationTypeChange(newConfirmAttributeTransportationTypeChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE, newConfirmAttributeTransportationTypeChange, newConfirmAttributeTransportationTypeChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeTransportationTypeType getQueryAttributeTransportationType() {
		return queryAttributeTransportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryAttributeTransportationType(QueryAttributeTransportationTypeType newQueryAttributeTransportationType, NotificationChain msgs) {
		QueryAttributeTransportationTypeType oldQueryAttributeTransportationType = queryAttributeTransportationType;
		queryAttributeTransportationType = newQueryAttributeTransportationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE, oldQueryAttributeTransportationType, newQueryAttributeTransportationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryAttributeTransportationType(QueryAttributeTransportationTypeType newQueryAttributeTransportationType) {
		if (newQueryAttributeTransportationType != queryAttributeTransportationType) {
			NotificationChain msgs = null;
			if (queryAttributeTransportationType != null)
				msgs = ((InternalEObject)queryAttributeTransportationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE, null, msgs);
			if (newQueryAttributeTransportationType != null)
				msgs = ((InternalEObject)newQueryAttributeTransportationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE, null, msgs);
			msgs = basicSetQueryAttributeTransportationType(newQueryAttributeTransportationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE, newQueryAttributeTransportationType, newQueryAttributeTransportationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportAttributeTransportationTypeType getReportAttributeTransportationType() {
		return reportAttributeTransportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportAttributeTransportationType(ReportAttributeTransportationTypeType newReportAttributeTransportationType, NotificationChain msgs) {
		ReportAttributeTransportationTypeType oldReportAttributeTransportationType = reportAttributeTransportationType;
		reportAttributeTransportationType = newReportAttributeTransportationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE, oldReportAttributeTransportationType, newReportAttributeTransportationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportAttributeTransportationType(ReportAttributeTransportationTypeType newReportAttributeTransportationType) {
		if (newReportAttributeTransportationType != reportAttributeTransportationType) {
			NotificationChain msgs = null;
			if (reportAttributeTransportationType != null)
				msgs = ((InternalEObject)reportAttributeTransportationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE, null, msgs);
			if (newReportAttributeTransportationType != null)
				msgs = ((InternalEObject)newReportAttributeTransportationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE, null, msgs);
			msgs = basicSetReportAttributeTransportationType(newReportAttributeTransportationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE, newReportAttributeTransportationType, newReportAttributeTransportationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestInteractionTransportationTypeChangeType getRequestInteractionTransportationTypeChange() {
		return requestInteractionTransportationTypeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestInteractionTransportationTypeChange(RequestInteractionTransportationTypeChangeType newRequestInteractionTransportationTypeChange, NotificationChain msgs) {
		RequestInteractionTransportationTypeChangeType oldRequestInteractionTransportationTypeChange = requestInteractionTransportationTypeChange;
		requestInteractionTransportationTypeChange = newRequestInteractionTransportationTypeChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE, oldRequestInteractionTransportationTypeChange, newRequestInteractionTransportationTypeChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestInteractionTransportationTypeChange(RequestInteractionTransportationTypeChangeType newRequestInteractionTransportationTypeChange) {
		if (newRequestInteractionTransportationTypeChange != requestInteractionTransportationTypeChange) {
			NotificationChain msgs = null;
			if (requestInteractionTransportationTypeChange != null)
				msgs = ((InternalEObject)requestInteractionTransportationTypeChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			if (newRequestInteractionTransportationTypeChange != null)
				msgs = ((InternalEObject)newRequestInteractionTransportationTypeChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			msgs = basicSetRequestInteractionTransportationTypeChange(newRequestInteractionTransportationTypeChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE, newRequestInteractionTransportationTypeChange, newRequestInteractionTransportationTypeChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmInteractionTransportationTypeChangeType getConfirmInteractionTransportationTypeChange() {
		return confirmInteractionTransportationTypeChange;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmInteractionTransportationTypeChange(ConfirmInteractionTransportationTypeChangeType newConfirmInteractionTransportationTypeChange, NotificationChain msgs) {
		ConfirmInteractionTransportationTypeChangeType oldConfirmInteractionTransportationTypeChange = confirmInteractionTransportationTypeChange;
		confirmInteractionTransportationTypeChange = newConfirmInteractionTransportationTypeChange;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE, oldConfirmInteractionTransportationTypeChange, newConfirmInteractionTransportationTypeChange);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmInteractionTransportationTypeChange(ConfirmInteractionTransportationTypeChangeType newConfirmInteractionTransportationTypeChange) {
		if (newConfirmInteractionTransportationTypeChange != confirmInteractionTransportationTypeChange) {
			NotificationChain msgs = null;
			if (confirmInteractionTransportationTypeChange != null)
				msgs = ((InternalEObject)confirmInteractionTransportationTypeChange).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			if (newConfirmInteractionTransportationTypeChange != null)
				msgs = ((InternalEObject)newConfirmInteractionTransportationTypeChange).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE, null, msgs);
			msgs = basicSetConfirmInteractionTransportationTypeChange(newConfirmInteractionTransportationTypeChange, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE, newConfirmInteractionTransportationTypeChange, newConfirmInteractionTransportationTypeChange));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryInteractionTransportationTypeType getQueryInteractionTransportationType() {
		return queryInteractionTransportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryInteractionTransportationType(QueryInteractionTransportationTypeType newQueryInteractionTransportationType, NotificationChain msgs) {
		QueryInteractionTransportationTypeType oldQueryInteractionTransportationType = queryInteractionTransportationType;
		queryInteractionTransportationType = newQueryInteractionTransportationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE, oldQueryInteractionTransportationType, newQueryInteractionTransportationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryInteractionTransportationType(QueryInteractionTransportationTypeType newQueryInteractionTransportationType) {
		if (newQueryInteractionTransportationType != queryInteractionTransportationType) {
			NotificationChain msgs = null;
			if (queryInteractionTransportationType != null)
				msgs = ((InternalEObject)queryInteractionTransportationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE, null, msgs);
			if (newQueryInteractionTransportationType != null)
				msgs = ((InternalEObject)newQueryInteractionTransportationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE, null, msgs);
			msgs = basicSetQueryInteractionTransportationType(newQueryInteractionTransportationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE, newQueryInteractionTransportationType, newQueryInteractionTransportationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReportInteractionTransportationTypeType getReportInteractionTransportationType() {
		return reportInteractionTransportationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetReportInteractionTransportationType(ReportInteractionTransportationTypeType newReportInteractionTransportationType, NotificationChain msgs) {
		ReportInteractionTransportationTypeType oldReportInteractionTransportationType = reportInteractionTransportationType;
		reportInteractionTransportationType = newReportInteractionTransportationType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE, oldReportInteractionTransportationType, newReportInteractionTransportationType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReportInteractionTransportationType(ReportInteractionTransportationTypeType newReportInteractionTransportationType) {
		if (newReportInteractionTransportationType != reportInteractionTransportationType) {
			NotificationChain msgs = null;
			if (reportInteractionTransportationType != null)
				msgs = ((InternalEObject)reportInteractionTransportationType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE, null, msgs);
			if (newReportInteractionTransportationType != null)
				msgs = ((InternalEObject)newReportInteractionTransportationType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE, null, msgs);
			msgs = basicSetReportInteractionTransportationType(newReportInteractionTransportationType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE, newReportInteractionTransportationType, newReportInteractionTransportationType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnconditionalAttributeOwnershipDivestitureType getUnconditionalAttributeOwnershipDivestiture() {
		return unconditionalAttributeOwnershipDivestiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnconditionalAttributeOwnershipDivestiture(UnconditionalAttributeOwnershipDivestitureType newUnconditionalAttributeOwnershipDivestiture, NotificationChain msgs) {
		UnconditionalAttributeOwnershipDivestitureType oldUnconditionalAttributeOwnershipDivestiture = unconditionalAttributeOwnershipDivestiture;
		unconditionalAttributeOwnershipDivestiture = newUnconditionalAttributeOwnershipDivestiture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE, oldUnconditionalAttributeOwnershipDivestiture, newUnconditionalAttributeOwnershipDivestiture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnconditionalAttributeOwnershipDivestiture(UnconditionalAttributeOwnershipDivestitureType newUnconditionalAttributeOwnershipDivestiture) {
		if (newUnconditionalAttributeOwnershipDivestiture != unconditionalAttributeOwnershipDivestiture) {
			NotificationChain msgs = null;
			if (unconditionalAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)unconditionalAttributeOwnershipDivestiture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			if (newUnconditionalAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)newUnconditionalAttributeOwnershipDivestiture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			msgs = basicSetUnconditionalAttributeOwnershipDivestiture(newUnconditionalAttributeOwnershipDivestiture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE, newUnconditionalAttributeOwnershipDivestiture, newUnconditionalAttributeOwnershipDivestiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NegotiatedAttributeOwnershipDivestitureType getNegotiatedAttributeOwnershipDivestiture() {
		return negotiatedAttributeOwnershipDivestiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNegotiatedAttributeOwnershipDivestiture(NegotiatedAttributeOwnershipDivestitureType newNegotiatedAttributeOwnershipDivestiture, NotificationChain msgs) {
		NegotiatedAttributeOwnershipDivestitureType oldNegotiatedAttributeOwnershipDivestiture = negotiatedAttributeOwnershipDivestiture;
		negotiatedAttributeOwnershipDivestiture = newNegotiatedAttributeOwnershipDivestiture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, oldNegotiatedAttributeOwnershipDivestiture, newNegotiatedAttributeOwnershipDivestiture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNegotiatedAttributeOwnershipDivestiture(NegotiatedAttributeOwnershipDivestitureType newNegotiatedAttributeOwnershipDivestiture) {
		if (newNegotiatedAttributeOwnershipDivestiture != negotiatedAttributeOwnershipDivestiture) {
			NotificationChain msgs = null;
			if (negotiatedAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)negotiatedAttributeOwnershipDivestiture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			if (newNegotiatedAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)newNegotiatedAttributeOwnershipDivestiture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			msgs = basicSetNegotiatedAttributeOwnershipDivestiture(newNegotiatedAttributeOwnershipDivestiture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, newNegotiatedAttributeOwnershipDivestiture, newNegotiatedAttributeOwnershipDivestiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipAssumptionType getRequestAttributeOwnershipAssumption() {
		return requestAttributeOwnershipAssumption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAttributeOwnershipAssumption(RequestAttributeOwnershipAssumptionType newRequestAttributeOwnershipAssumption, NotificationChain msgs) {
		RequestAttributeOwnershipAssumptionType oldRequestAttributeOwnershipAssumption = requestAttributeOwnershipAssumption;
		requestAttributeOwnershipAssumption = newRequestAttributeOwnershipAssumption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION, oldRequestAttributeOwnershipAssumption, newRequestAttributeOwnershipAssumption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAttributeOwnershipAssumption(RequestAttributeOwnershipAssumptionType newRequestAttributeOwnershipAssumption) {
		if (newRequestAttributeOwnershipAssumption != requestAttributeOwnershipAssumption) {
			NotificationChain msgs = null;
			if (requestAttributeOwnershipAssumption != null)
				msgs = ((InternalEObject)requestAttributeOwnershipAssumption).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION, null, msgs);
			if (newRequestAttributeOwnershipAssumption != null)
				msgs = ((InternalEObject)newRequestAttributeOwnershipAssumption).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION, null, msgs);
			msgs = basicSetRequestAttributeOwnershipAssumption(newRequestAttributeOwnershipAssumption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION, newRequestAttributeOwnershipAssumption, newRequestAttributeOwnershipAssumption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestDivestitureConfirmationType getRequestDivestitureConfirmation() {
		return requestDivestitureConfirmation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestDivestitureConfirmation(RequestDivestitureConfirmationType newRequestDivestitureConfirmation, NotificationChain msgs) {
		RequestDivestitureConfirmationType oldRequestDivestitureConfirmation = requestDivestitureConfirmation;
		requestDivestitureConfirmation = newRequestDivestitureConfirmation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION, oldRequestDivestitureConfirmation, newRequestDivestitureConfirmation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestDivestitureConfirmation(RequestDivestitureConfirmationType newRequestDivestitureConfirmation) {
		if (newRequestDivestitureConfirmation != requestDivestitureConfirmation) {
			NotificationChain msgs = null;
			if (requestDivestitureConfirmation != null)
				msgs = ((InternalEObject)requestDivestitureConfirmation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION, null, msgs);
			if (newRequestDivestitureConfirmation != null)
				msgs = ((InternalEObject)newRequestDivestitureConfirmation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION, null, msgs);
			msgs = basicSetRequestDivestitureConfirmation(newRequestDivestitureConfirmation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION, newRequestDivestitureConfirmation, newRequestDivestitureConfirmation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmDivestitureType getConfirmDivestiture() {
		return confirmDivestiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmDivestiture(ConfirmDivestitureType newConfirmDivestiture, NotificationChain msgs) {
		ConfirmDivestitureType oldConfirmDivestiture = confirmDivestiture;
		confirmDivestiture = newConfirmDivestiture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE, oldConfirmDivestiture, newConfirmDivestiture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmDivestiture(ConfirmDivestitureType newConfirmDivestiture) {
		if (newConfirmDivestiture != confirmDivestiture) {
			NotificationChain msgs = null;
			if (confirmDivestiture != null)
				msgs = ((InternalEObject)confirmDivestiture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE, null, msgs);
			if (newConfirmDivestiture != null)
				msgs = ((InternalEObject)newConfirmDivestiture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE, null, msgs);
			msgs = basicSetConfirmDivestiture(newConfirmDivestiture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE, newConfirmDivestiture, newConfirmDivestiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionNotificationType getAttributeOwnershipAcquisitionNotification() {
		return attributeOwnershipAcquisitionNotification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipAcquisitionNotification(AttributeOwnershipAcquisitionNotificationType newAttributeOwnershipAcquisitionNotification, NotificationChain msgs) {
		AttributeOwnershipAcquisitionNotificationType oldAttributeOwnershipAcquisitionNotification = attributeOwnershipAcquisitionNotification;
		attributeOwnershipAcquisitionNotification = newAttributeOwnershipAcquisitionNotification;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION, oldAttributeOwnershipAcquisitionNotification, newAttributeOwnershipAcquisitionNotification);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipAcquisitionNotification(AttributeOwnershipAcquisitionNotificationType newAttributeOwnershipAcquisitionNotification) {
		if (newAttributeOwnershipAcquisitionNotification != attributeOwnershipAcquisitionNotification) {
			NotificationChain msgs = null;
			if (attributeOwnershipAcquisitionNotification != null)
				msgs = ((InternalEObject)attributeOwnershipAcquisitionNotification).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION, null, msgs);
			if (newAttributeOwnershipAcquisitionNotification != null)
				msgs = ((InternalEObject)newAttributeOwnershipAcquisitionNotification).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION, null, msgs);
			msgs = basicSetAttributeOwnershipAcquisitionNotification(newAttributeOwnershipAcquisitionNotification, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION, newAttributeOwnershipAcquisitionNotification, newAttributeOwnershipAcquisitionNotification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionType getAttributeOwnershipAcquisition() {
		return attributeOwnershipAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipAcquisition(AttributeOwnershipAcquisitionType newAttributeOwnershipAcquisition, NotificationChain msgs) {
		AttributeOwnershipAcquisitionType oldAttributeOwnershipAcquisition = attributeOwnershipAcquisition;
		attributeOwnershipAcquisition = newAttributeOwnershipAcquisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION, oldAttributeOwnershipAcquisition, newAttributeOwnershipAcquisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipAcquisition(AttributeOwnershipAcquisitionType newAttributeOwnershipAcquisition) {
		if (newAttributeOwnershipAcquisition != attributeOwnershipAcquisition) {
			NotificationChain msgs = null;
			if (attributeOwnershipAcquisition != null)
				msgs = ((InternalEObject)attributeOwnershipAcquisition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION, null, msgs);
			if (newAttributeOwnershipAcquisition != null)
				msgs = ((InternalEObject)newAttributeOwnershipAcquisition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION, null, msgs);
			msgs = basicSetAttributeOwnershipAcquisition(newAttributeOwnershipAcquisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION, newAttributeOwnershipAcquisition, newAttributeOwnershipAcquisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipAcquisitionIfAvailableType getAttributeOwnershipAcquisitionIfAvailable() {
		return attributeOwnershipAcquisitionIfAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipAcquisitionIfAvailable(AttributeOwnershipAcquisitionIfAvailableType newAttributeOwnershipAcquisitionIfAvailable, NotificationChain msgs) {
		AttributeOwnershipAcquisitionIfAvailableType oldAttributeOwnershipAcquisitionIfAvailable = attributeOwnershipAcquisitionIfAvailable;
		attributeOwnershipAcquisitionIfAvailable = newAttributeOwnershipAcquisitionIfAvailable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE, oldAttributeOwnershipAcquisitionIfAvailable, newAttributeOwnershipAcquisitionIfAvailable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipAcquisitionIfAvailable(AttributeOwnershipAcquisitionIfAvailableType newAttributeOwnershipAcquisitionIfAvailable) {
		if (newAttributeOwnershipAcquisitionIfAvailable != attributeOwnershipAcquisitionIfAvailable) {
			NotificationChain msgs = null;
			if (attributeOwnershipAcquisitionIfAvailable != null)
				msgs = ((InternalEObject)attributeOwnershipAcquisitionIfAvailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE, null, msgs);
			if (newAttributeOwnershipAcquisitionIfAvailable != null)
				msgs = ((InternalEObject)newAttributeOwnershipAcquisitionIfAvailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE, null, msgs);
			msgs = basicSetAttributeOwnershipAcquisitionIfAvailable(newAttributeOwnershipAcquisitionIfAvailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE, newAttributeOwnershipAcquisitionIfAvailable, newAttributeOwnershipAcquisitionIfAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipUnavailableType getAttributeOwnershipUnavailable() {
		return attributeOwnershipUnavailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipUnavailable(AttributeOwnershipUnavailableType newAttributeOwnershipUnavailable, NotificationChain msgs) {
		AttributeOwnershipUnavailableType oldAttributeOwnershipUnavailable = attributeOwnershipUnavailable;
		attributeOwnershipUnavailable = newAttributeOwnershipUnavailable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE, oldAttributeOwnershipUnavailable, newAttributeOwnershipUnavailable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipUnavailable(AttributeOwnershipUnavailableType newAttributeOwnershipUnavailable) {
		if (newAttributeOwnershipUnavailable != attributeOwnershipUnavailable) {
			NotificationChain msgs = null;
			if (attributeOwnershipUnavailable != null)
				msgs = ((InternalEObject)attributeOwnershipUnavailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE, null, msgs);
			if (newAttributeOwnershipUnavailable != null)
				msgs = ((InternalEObject)newAttributeOwnershipUnavailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE, null, msgs);
			msgs = basicSetAttributeOwnershipUnavailable(newAttributeOwnershipUnavailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE, newAttributeOwnershipUnavailable, newAttributeOwnershipUnavailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeOwnershipReleaseType getRequestAttributeOwnershipRelease() {
		return requestAttributeOwnershipRelease;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAttributeOwnershipRelease(RequestAttributeOwnershipReleaseType newRequestAttributeOwnershipRelease, NotificationChain msgs) {
		RequestAttributeOwnershipReleaseType oldRequestAttributeOwnershipRelease = requestAttributeOwnershipRelease;
		requestAttributeOwnershipRelease = newRequestAttributeOwnershipRelease;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE, oldRequestAttributeOwnershipRelease, newRequestAttributeOwnershipRelease);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAttributeOwnershipRelease(RequestAttributeOwnershipReleaseType newRequestAttributeOwnershipRelease) {
		if (newRequestAttributeOwnershipRelease != requestAttributeOwnershipRelease) {
			NotificationChain msgs = null;
			if (requestAttributeOwnershipRelease != null)
				msgs = ((InternalEObject)requestAttributeOwnershipRelease).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE, null, msgs);
			if (newRequestAttributeOwnershipRelease != null)
				msgs = ((InternalEObject)newRequestAttributeOwnershipRelease).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE, null, msgs);
			msgs = basicSetRequestAttributeOwnershipRelease(newRequestAttributeOwnershipRelease, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE, newRequestAttributeOwnershipRelease, newRequestAttributeOwnershipRelease));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipReleaseDeniedType getAttributeOwnershipReleaseDenied() {
		return attributeOwnershipReleaseDenied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipReleaseDenied(AttributeOwnershipReleaseDeniedType newAttributeOwnershipReleaseDenied, NotificationChain msgs) {
		AttributeOwnershipReleaseDeniedType oldAttributeOwnershipReleaseDenied = attributeOwnershipReleaseDenied;
		attributeOwnershipReleaseDenied = newAttributeOwnershipReleaseDenied;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED, oldAttributeOwnershipReleaseDenied, newAttributeOwnershipReleaseDenied);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipReleaseDenied(AttributeOwnershipReleaseDeniedType newAttributeOwnershipReleaseDenied) {
		if (newAttributeOwnershipReleaseDenied != attributeOwnershipReleaseDenied) {
			NotificationChain msgs = null;
			if (attributeOwnershipReleaseDenied != null)
				msgs = ((InternalEObject)attributeOwnershipReleaseDenied).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED, null, msgs);
			if (newAttributeOwnershipReleaseDenied != null)
				msgs = ((InternalEObject)newAttributeOwnershipReleaseDenied).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED, null, msgs);
			msgs = basicSetAttributeOwnershipReleaseDenied(newAttributeOwnershipReleaseDenied, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED, newAttributeOwnershipReleaseDenied, newAttributeOwnershipReleaseDenied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributeOwnershipDivestitureIfWantedType getAttributeOwnershipDivestitureIfWanted() {
		return attributeOwnershipDivestitureIfWanted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAttributeOwnershipDivestitureIfWanted(AttributeOwnershipDivestitureIfWantedType newAttributeOwnershipDivestitureIfWanted, NotificationChain msgs) {
		AttributeOwnershipDivestitureIfWantedType oldAttributeOwnershipDivestitureIfWanted = attributeOwnershipDivestitureIfWanted;
		attributeOwnershipDivestitureIfWanted = newAttributeOwnershipDivestitureIfWanted;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED, oldAttributeOwnershipDivestitureIfWanted, newAttributeOwnershipDivestitureIfWanted);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttributeOwnershipDivestitureIfWanted(AttributeOwnershipDivestitureIfWantedType newAttributeOwnershipDivestitureIfWanted) {
		if (newAttributeOwnershipDivestitureIfWanted != attributeOwnershipDivestitureIfWanted) {
			NotificationChain msgs = null;
			if (attributeOwnershipDivestitureIfWanted != null)
				msgs = ((InternalEObject)attributeOwnershipDivestitureIfWanted).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED, null, msgs);
			if (newAttributeOwnershipDivestitureIfWanted != null)
				msgs = ((InternalEObject)newAttributeOwnershipDivestitureIfWanted).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED, null, msgs);
			msgs = basicSetAttributeOwnershipDivestitureIfWanted(newAttributeOwnershipDivestitureIfWanted, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED, newAttributeOwnershipDivestitureIfWanted, newAttributeOwnershipDivestitureIfWanted));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelNegotiatedAttributeOwnershipDivestitureType getCancelNegotiatedAttributeOwnershipDivestiture() {
		return cancelNegotiatedAttributeOwnershipDivestiture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelNegotiatedAttributeOwnershipDivestiture(CancelNegotiatedAttributeOwnershipDivestitureType newCancelNegotiatedAttributeOwnershipDivestiture, NotificationChain msgs) {
		CancelNegotiatedAttributeOwnershipDivestitureType oldCancelNegotiatedAttributeOwnershipDivestiture = cancelNegotiatedAttributeOwnershipDivestiture;
		cancelNegotiatedAttributeOwnershipDivestiture = newCancelNegotiatedAttributeOwnershipDivestiture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, oldCancelNegotiatedAttributeOwnershipDivestiture, newCancelNegotiatedAttributeOwnershipDivestiture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelNegotiatedAttributeOwnershipDivestiture(CancelNegotiatedAttributeOwnershipDivestitureType newCancelNegotiatedAttributeOwnershipDivestiture) {
		if (newCancelNegotiatedAttributeOwnershipDivestiture != cancelNegotiatedAttributeOwnershipDivestiture) {
			NotificationChain msgs = null;
			if (cancelNegotiatedAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)cancelNegotiatedAttributeOwnershipDivestiture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			if (newCancelNegotiatedAttributeOwnershipDivestiture != null)
				msgs = ((InternalEObject)newCancelNegotiatedAttributeOwnershipDivestiture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, null, msgs);
			msgs = basicSetCancelNegotiatedAttributeOwnershipDivestiture(newCancelNegotiatedAttributeOwnershipDivestiture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE, newCancelNegotiatedAttributeOwnershipDivestiture, newCancelNegotiatedAttributeOwnershipDivestiture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CancelAttributeOwnershipAcquisitionType getCancelAttributeOwnershipAcquisition() {
		return cancelAttributeOwnershipAcquisition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancelAttributeOwnershipAcquisition(CancelAttributeOwnershipAcquisitionType newCancelAttributeOwnershipAcquisition, NotificationChain msgs) {
		CancelAttributeOwnershipAcquisitionType oldCancelAttributeOwnershipAcquisition = cancelAttributeOwnershipAcquisition;
		cancelAttributeOwnershipAcquisition = newCancelAttributeOwnershipAcquisition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION, oldCancelAttributeOwnershipAcquisition, newCancelAttributeOwnershipAcquisition);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCancelAttributeOwnershipAcquisition(CancelAttributeOwnershipAcquisitionType newCancelAttributeOwnershipAcquisition) {
		if (newCancelAttributeOwnershipAcquisition != cancelAttributeOwnershipAcquisition) {
			NotificationChain msgs = null;
			if (cancelAttributeOwnershipAcquisition != null)
				msgs = ((InternalEObject)cancelAttributeOwnershipAcquisition).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION, null, msgs);
			if (newCancelAttributeOwnershipAcquisition != null)
				msgs = ((InternalEObject)newCancelAttributeOwnershipAcquisition).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION, null, msgs);
			msgs = basicSetCancelAttributeOwnershipAcquisition(newCancelAttributeOwnershipAcquisition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION, newCancelAttributeOwnershipAcquisition, newCancelAttributeOwnershipAcquisition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfirmAttributeOwnershipAcquisitionCancellationType getConfirmAttributeOwnershipAcquisitionCancellation() {
		return confirmAttributeOwnershipAcquisitionCancellation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfirmAttributeOwnershipAcquisitionCancellation(ConfirmAttributeOwnershipAcquisitionCancellationType newConfirmAttributeOwnershipAcquisitionCancellation, NotificationChain msgs) {
		ConfirmAttributeOwnershipAcquisitionCancellationType oldConfirmAttributeOwnershipAcquisitionCancellation = confirmAttributeOwnershipAcquisitionCancellation;
		confirmAttributeOwnershipAcquisitionCancellation = newConfirmAttributeOwnershipAcquisitionCancellation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION, oldConfirmAttributeOwnershipAcquisitionCancellation, newConfirmAttributeOwnershipAcquisitionCancellation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfirmAttributeOwnershipAcquisitionCancellation(ConfirmAttributeOwnershipAcquisitionCancellationType newConfirmAttributeOwnershipAcquisitionCancellation) {
		if (newConfirmAttributeOwnershipAcquisitionCancellation != confirmAttributeOwnershipAcquisitionCancellation) {
			NotificationChain msgs = null;
			if (confirmAttributeOwnershipAcquisitionCancellation != null)
				msgs = ((InternalEObject)confirmAttributeOwnershipAcquisitionCancellation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION, null, msgs);
			if (newConfirmAttributeOwnershipAcquisitionCancellation != null)
				msgs = ((InternalEObject)newConfirmAttributeOwnershipAcquisitionCancellation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION, null, msgs);
			msgs = basicSetConfirmAttributeOwnershipAcquisitionCancellation(newConfirmAttributeOwnershipAcquisitionCancellation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION, newConfirmAttributeOwnershipAcquisitionCancellation, newConfirmAttributeOwnershipAcquisitionCancellation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryAttributeOwnershipType getQueryAttributeOwnership() {
		return queryAttributeOwnership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryAttributeOwnership(QueryAttributeOwnershipType newQueryAttributeOwnership, NotificationChain msgs) {
		QueryAttributeOwnershipType oldQueryAttributeOwnership = queryAttributeOwnership;
		queryAttributeOwnership = newQueryAttributeOwnership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP, oldQueryAttributeOwnership, newQueryAttributeOwnership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryAttributeOwnership(QueryAttributeOwnershipType newQueryAttributeOwnership) {
		if (newQueryAttributeOwnership != queryAttributeOwnership) {
			NotificationChain msgs = null;
			if (queryAttributeOwnership != null)
				msgs = ((InternalEObject)queryAttributeOwnership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP, null, msgs);
			if (newQueryAttributeOwnership != null)
				msgs = ((InternalEObject)newQueryAttributeOwnership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP, null, msgs);
			msgs = basicSetQueryAttributeOwnership(newQueryAttributeOwnership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP, newQueryAttributeOwnership, newQueryAttributeOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformAttributeOwnershipType getInformAttributeOwnership() {
		return informAttributeOwnership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInformAttributeOwnership(InformAttributeOwnershipType newInformAttributeOwnership, NotificationChain msgs) {
		InformAttributeOwnershipType oldInformAttributeOwnership = informAttributeOwnership;
		informAttributeOwnership = newInformAttributeOwnership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP, oldInformAttributeOwnership, newInformAttributeOwnership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInformAttributeOwnership(InformAttributeOwnershipType newInformAttributeOwnership) {
		if (newInformAttributeOwnership != informAttributeOwnership) {
			NotificationChain msgs = null;
			if (informAttributeOwnership != null)
				msgs = ((InternalEObject)informAttributeOwnership).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP, null, msgs);
			if (newInformAttributeOwnership != null)
				msgs = ((InternalEObject)newInformAttributeOwnership).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP, null, msgs);
			msgs = basicSetInformAttributeOwnership(newInformAttributeOwnership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP, newInformAttributeOwnership, newInformAttributeOwnership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IsAttributeOwnedByFederateType getIsAttributeOwnedByFederate() {
		return isAttributeOwnedByFederate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsAttributeOwnedByFederate(IsAttributeOwnedByFederateType newIsAttributeOwnedByFederate, NotificationChain msgs) {
		IsAttributeOwnedByFederateType oldIsAttributeOwnedByFederate = isAttributeOwnedByFederate;
		isAttributeOwnedByFederate = newIsAttributeOwnedByFederate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE, oldIsAttributeOwnedByFederate, newIsAttributeOwnedByFederate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAttributeOwnedByFederate(IsAttributeOwnedByFederateType newIsAttributeOwnedByFederate) {
		if (newIsAttributeOwnedByFederate != isAttributeOwnedByFederate) {
			NotificationChain msgs = null;
			if (isAttributeOwnedByFederate != null)
				msgs = ((InternalEObject)isAttributeOwnedByFederate).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE, null, msgs);
			if (newIsAttributeOwnedByFederate != null)
				msgs = ((InternalEObject)newIsAttributeOwnedByFederate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE, null, msgs);
			msgs = basicSetIsAttributeOwnedByFederate(newIsAttributeOwnedByFederate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE, newIsAttributeOwnedByFederate, newIsAttributeOwnedByFederate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeRegulationType getEnableTimeRegulation() {
		return enableTimeRegulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableTimeRegulation(EnableTimeRegulationType newEnableTimeRegulation, NotificationChain msgs) {
		EnableTimeRegulationType oldEnableTimeRegulation = enableTimeRegulation;
		enableTimeRegulation = newEnableTimeRegulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION, oldEnableTimeRegulation, newEnableTimeRegulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableTimeRegulation(EnableTimeRegulationType newEnableTimeRegulation) {
		if (newEnableTimeRegulation != enableTimeRegulation) {
			NotificationChain msgs = null;
			if (enableTimeRegulation != null)
				msgs = ((InternalEObject)enableTimeRegulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION, null, msgs);
			if (newEnableTimeRegulation != null)
				msgs = ((InternalEObject)newEnableTimeRegulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION, null, msgs);
			msgs = basicSetEnableTimeRegulation(newEnableTimeRegulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION, newEnableTimeRegulation, newEnableTimeRegulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeRegulationEnabledType getTimeRegulationEnabled() {
		return timeRegulationEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeRegulationEnabled(TimeRegulationEnabledType newTimeRegulationEnabled, NotificationChain msgs) {
		TimeRegulationEnabledType oldTimeRegulationEnabled = timeRegulationEnabled;
		timeRegulationEnabled = newTimeRegulationEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED, oldTimeRegulationEnabled, newTimeRegulationEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeRegulationEnabled(TimeRegulationEnabledType newTimeRegulationEnabled) {
		if (newTimeRegulationEnabled != timeRegulationEnabled) {
			NotificationChain msgs = null;
			if (timeRegulationEnabled != null)
				msgs = ((InternalEObject)timeRegulationEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED, null, msgs);
			if (newTimeRegulationEnabled != null)
				msgs = ((InternalEObject)newTimeRegulationEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED, null, msgs);
			msgs = basicSetTimeRegulationEnabled(newTimeRegulationEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED, newTimeRegulationEnabled, newTimeRegulationEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeRegulationType getDisableTimeRegulation() {
		return disableTimeRegulation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableTimeRegulation(DisableTimeRegulationType newDisableTimeRegulation, NotificationChain msgs) {
		DisableTimeRegulationType oldDisableTimeRegulation = disableTimeRegulation;
		disableTimeRegulation = newDisableTimeRegulation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION, oldDisableTimeRegulation, newDisableTimeRegulation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableTimeRegulation(DisableTimeRegulationType newDisableTimeRegulation) {
		if (newDisableTimeRegulation != disableTimeRegulation) {
			NotificationChain msgs = null;
			if (disableTimeRegulation != null)
				msgs = ((InternalEObject)disableTimeRegulation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION, null, msgs);
			if (newDisableTimeRegulation != null)
				msgs = ((InternalEObject)newDisableTimeRegulation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION, null, msgs);
			msgs = basicSetDisableTimeRegulation(newDisableTimeRegulation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION, newDisableTimeRegulation, newDisableTimeRegulation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableTimeConstrainedType getEnableTimeConstrained() {
		return enableTimeConstrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableTimeConstrained(EnableTimeConstrainedType newEnableTimeConstrained, NotificationChain msgs) {
		EnableTimeConstrainedType oldEnableTimeConstrained = enableTimeConstrained;
		enableTimeConstrained = newEnableTimeConstrained;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED, oldEnableTimeConstrained, newEnableTimeConstrained);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableTimeConstrained(EnableTimeConstrainedType newEnableTimeConstrained) {
		if (newEnableTimeConstrained != enableTimeConstrained) {
			NotificationChain msgs = null;
			if (enableTimeConstrained != null)
				msgs = ((InternalEObject)enableTimeConstrained).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED, null, msgs);
			if (newEnableTimeConstrained != null)
				msgs = ((InternalEObject)newEnableTimeConstrained).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED, null, msgs);
			msgs = basicSetEnableTimeConstrained(newEnableTimeConstrained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED, newEnableTimeConstrained, newEnableTimeConstrained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeConstrainedEnabledType getTimeConstrainedEnabled() {
		return timeConstrainedEnabled;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeConstrainedEnabled(TimeConstrainedEnabledType newTimeConstrainedEnabled, NotificationChain msgs) {
		TimeConstrainedEnabledType oldTimeConstrainedEnabled = timeConstrainedEnabled;
		timeConstrainedEnabled = newTimeConstrainedEnabled;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED, oldTimeConstrainedEnabled, newTimeConstrainedEnabled);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeConstrainedEnabled(TimeConstrainedEnabledType newTimeConstrainedEnabled) {
		if (newTimeConstrainedEnabled != timeConstrainedEnabled) {
			NotificationChain msgs = null;
			if (timeConstrainedEnabled != null)
				msgs = ((InternalEObject)timeConstrainedEnabled).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED, null, msgs);
			if (newTimeConstrainedEnabled != null)
				msgs = ((InternalEObject)newTimeConstrainedEnabled).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED, null, msgs);
			msgs = basicSetTimeConstrainedEnabled(newTimeConstrainedEnabled, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED, newTimeConstrainedEnabled, newTimeConstrainedEnabled));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableTimeConstrainedType getDisableTimeConstrained() {
		return disableTimeConstrained;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableTimeConstrained(DisableTimeConstrainedType newDisableTimeConstrained, NotificationChain msgs) {
		DisableTimeConstrainedType oldDisableTimeConstrained = disableTimeConstrained;
		disableTimeConstrained = newDisableTimeConstrained;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED, oldDisableTimeConstrained, newDisableTimeConstrained);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableTimeConstrained(DisableTimeConstrainedType newDisableTimeConstrained) {
		if (newDisableTimeConstrained != disableTimeConstrained) {
			NotificationChain msgs = null;
			if (disableTimeConstrained != null)
				msgs = ((InternalEObject)disableTimeConstrained).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED, null, msgs);
			if (newDisableTimeConstrained != null)
				msgs = ((InternalEObject)newDisableTimeConstrained).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED, null, msgs);
			msgs = basicSetDisableTimeConstrained(newDisableTimeConstrained, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED, newDisableTimeConstrained, newDisableTimeConstrained));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestType getTimeAdvanceRequest() {
		return timeAdvanceRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAdvanceRequest(TimeAdvanceRequestType newTimeAdvanceRequest, NotificationChain msgs) {
		TimeAdvanceRequestType oldTimeAdvanceRequest = timeAdvanceRequest;
		timeAdvanceRequest = newTimeAdvanceRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST, oldTimeAdvanceRequest, newTimeAdvanceRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAdvanceRequest(TimeAdvanceRequestType newTimeAdvanceRequest) {
		if (newTimeAdvanceRequest != timeAdvanceRequest) {
			NotificationChain msgs = null;
			if (timeAdvanceRequest != null)
				msgs = ((InternalEObject)timeAdvanceRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST, null, msgs);
			if (newTimeAdvanceRequest != null)
				msgs = ((InternalEObject)newTimeAdvanceRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST, null, msgs);
			msgs = basicSetTimeAdvanceRequest(newTimeAdvanceRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST, newTimeAdvanceRequest, newTimeAdvanceRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceRequestAvailableType getTimeAdvanceRequestAvailable() {
		return timeAdvanceRequestAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAdvanceRequestAvailable(TimeAdvanceRequestAvailableType newTimeAdvanceRequestAvailable, NotificationChain msgs) {
		TimeAdvanceRequestAvailableType oldTimeAdvanceRequestAvailable = timeAdvanceRequestAvailable;
		timeAdvanceRequestAvailable = newTimeAdvanceRequestAvailable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE, oldTimeAdvanceRequestAvailable, newTimeAdvanceRequestAvailable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAdvanceRequestAvailable(TimeAdvanceRequestAvailableType newTimeAdvanceRequestAvailable) {
		if (newTimeAdvanceRequestAvailable != timeAdvanceRequestAvailable) {
			NotificationChain msgs = null;
			if (timeAdvanceRequestAvailable != null)
				msgs = ((InternalEObject)timeAdvanceRequestAvailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE, null, msgs);
			if (newTimeAdvanceRequestAvailable != null)
				msgs = ((InternalEObject)newTimeAdvanceRequestAvailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE, null, msgs);
			msgs = basicSetTimeAdvanceRequestAvailable(newTimeAdvanceRequestAvailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE, newTimeAdvanceRequestAvailable, newTimeAdvanceRequestAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestType getNextMessageRequest() {
		return nextMessageRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextMessageRequest(NextMessageRequestType newNextMessageRequest, NotificationChain msgs) {
		NextMessageRequestType oldNextMessageRequest = nextMessageRequest;
		nextMessageRequest = newNextMessageRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST, oldNextMessageRequest, newNextMessageRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextMessageRequest(NextMessageRequestType newNextMessageRequest) {
		if (newNextMessageRequest != nextMessageRequest) {
			NotificationChain msgs = null;
			if (nextMessageRequest != null)
				msgs = ((InternalEObject)nextMessageRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST, null, msgs);
			if (newNextMessageRequest != null)
				msgs = ((InternalEObject)newNextMessageRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST, null, msgs);
			msgs = basicSetNextMessageRequest(newNextMessageRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST, newNextMessageRequest, newNextMessageRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NextMessageRequestAvailableType getNextMessageRequestAvailable() {
		return nextMessageRequestAvailable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNextMessageRequestAvailable(NextMessageRequestAvailableType newNextMessageRequestAvailable, NotificationChain msgs) {
		NextMessageRequestAvailableType oldNextMessageRequestAvailable = nextMessageRequestAvailable;
		nextMessageRequestAvailable = newNextMessageRequestAvailable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE, oldNextMessageRequestAvailable, newNextMessageRequestAvailable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNextMessageRequestAvailable(NextMessageRequestAvailableType newNextMessageRequestAvailable) {
		if (newNextMessageRequestAvailable != nextMessageRequestAvailable) {
			NotificationChain msgs = null;
			if (nextMessageRequestAvailable != null)
				msgs = ((InternalEObject)nextMessageRequestAvailable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE, null, msgs);
			if (newNextMessageRequestAvailable != null)
				msgs = ((InternalEObject)newNextMessageRequestAvailable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE, null, msgs);
			msgs = basicSetNextMessageRequestAvailable(newNextMessageRequestAvailable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE, newNextMessageRequestAvailable, newNextMessageRequestAvailable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FlushQueueRequestType getFlushQueueRequest() {
		return flushQueueRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFlushQueueRequest(FlushQueueRequestType newFlushQueueRequest, NotificationChain msgs) {
		FlushQueueRequestType oldFlushQueueRequest = flushQueueRequest;
		flushQueueRequest = newFlushQueueRequest;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST, oldFlushQueueRequest, newFlushQueueRequest);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFlushQueueRequest(FlushQueueRequestType newFlushQueueRequest) {
		if (newFlushQueueRequest != flushQueueRequest) {
			NotificationChain msgs = null;
			if (flushQueueRequest != null)
				msgs = ((InternalEObject)flushQueueRequest).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST, null, msgs);
			if (newFlushQueueRequest != null)
				msgs = ((InternalEObject)newFlushQueueRequest).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST, null, msgs);
			msgs = basicSetFlushQueueRequest(newFlushQueueRequest, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST, newFlushQueueRequest, newFlushQueueRequest));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeAdvanceGrantType getTimeAdvanceGrant() {
		return timeAdvanceGrant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTimeAdvanceGrant(TimeAdvanceGrantType newTimeAdvanceGrant, NotificationChain msgs) {
		TimeAdvanceGrantType oldTimeAdvanceGrant = timeAdvanceGrant;
		timeAdvanceGrant = newTimeAdvanceGrant;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT, oldTimeAdvanceGrant, newTimeAdvanceGrant);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeAdvanceGrant(TimeAdvanceGrantType newTimeAdvanceGrant) {
		if (newTimeAdvanceGrant != timeAdvanceGrant) {
			NotificationChain msgs = null;
			if (timeAdvanceGrant != null)
				msgs = ((InternalEObject)timeAdvanceGrant).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT, null, msgs);
			if (newTimeAdvanceGrant != null)
				msgs = ((InternalEObject)newTimeAdvanceGrant).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT, null, msgs);
			msgs = basicSetTimeAdvanceGrant(newTimeAdvanceGrant, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT, newTimeAdvanceGrant, newTimeAdvanceGrant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAsynchronousDeliveryType getEnableAsynchronousDelivery() {
		return enableAsynchronousDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableAsynchronousDelivery(EnableAsynchronousDeliveryType newEnableAsynchronousDelivery, NotificationChain msgs) {
		EnableAsynchronousDeliveryType oldEnableAsynchronousDelivery = enableAsynchronousDelivery;
		enableAsynchronousDelivery = newEnableAsynchronousDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY, oldEnableAsynchronousDelivery, newEnableAsynchronousDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAsynchronousDelivery(EnableAsynchronousDeliveryType newEnableAsynchronousDelivery) {
		if (newEnableAsynchronousDelivery != enableAsynchronousDelivery) {
			NotificationChain msgs = null;
			if (enableAsynchronousDelivery != null)
				msgs = ((InternalEObject)enableAsynchronousDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY, null, msgs);
			if (newEnableAsynchronousDelivery != null)
				msgs = ((InternalEObject)newEnableAsynchronousDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY, null, msgs);
			msgs = basicSetEnableAsynchronousDelivery(newEnableAsynchronousDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY, newEnableAsynchronousDelivery, newEnableAsynchronousDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAsynchronousDeliveryType getDisableAsynchronousDelivery() {
		return disableAsynchronousDelivery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableAsynchronousDelivery(DisableAsynchronousDeliveryType newDisableAsynchronousDelivery, NotificationChain msgs) {
		DisableAsynchronousDeliveryType oldDisableAsynchronousDelivery = disableAsynchronousDelivery;
		disableAsynchronousDelivery = newDisableAsynchronousDelivery;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY, oldDisableAsynchronousDelivery, newDisableAsynchronousDelivery);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableAsynchronousDelivery(DisableAsynchronousDeliveryType newDisableAsynchronousDelivery) {
		if (newDisableAsynchronousDelivery != disableAsynchronousDelivery) {
			NotificationChain msgs = null;
			if (disableAsynchronousDelivery != null)
				msgs = ((InternalEObject)disableAsynchronousDelivery).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY, null, msgs);
			if (newDisableAsynchronousDelivery != null)
				msgs = ((InternalEObject)newDisableAsynchronousDelivery).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY, null, msgs);
			msgs = basicSetDisableAsynchronousDelivery(newDisableAsynchronousDelivery, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY, newDisableAsynchronousDelivery, newDisableAsynchronousDelivery));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryGALTType getQueryGALT() {
		return queryGALT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryGALT(QueryGALTType newQueryGALT, NotificationChain msgs) {
		QueryGALTType oldQueryGALT = queryGALT;
		queryGALT = newQueryGALT;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT, oldQueryGALT, newQueryGALT);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryGALT(QueryGALTType newQueryGALT) {
		if (newQueryGALT != queryGALT) {
			NotificationChain msgs = null;
			if (queryGALT != null)
				msgs = ((InternalEObject)queryGALT).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT, null, msgs);
			if (newQueryGALT != null)
				msgs = ((InternalEObject)newQueryGALT).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT, null, msgs);
			msgs = basicSetQueryGALT(newQueryGALT, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT, newQueryGALT, newQueryGALT));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLogicalTimeType getQueryLogicalTime() {
		return queryLogicalTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryLogicalTime(QueryLogicalTimeType newQueryLogicalTime, NotificationChain msgs) {
		QueryLogicalTimeType oldQueryLogicalTime = queryLogicalTime;
		queryLogicalTime = newQueryLogicalTime;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME, oldQueryLogicalTime, newQueryLogicalTime);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLogicalTime(QueryLogicalTimeType newQueryLogicalTime) {
		if (newQueryLogicalTime != queryLogicalTime) {
			NotificationChain msgs = null;
			if (queryLogicalTime != null)
				msgs = ((InternalEObject)queryLogicalTime).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME, null, msgs);
			if (newQueryLogicalTime != null)
				msgs = ((InternalEObject)newQueryLogicalTime).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME, null, msgs);
			msgs = basicSetQueryLogicalTime(newQueryLogicalTime, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME, newQueryLogicalTime, newQueryLogicalTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLITSType getQueryLITS() {
		return queryLITS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryLITS(QueryLITSType newQueryLITS, NotificationChain msgs) {
		QueryLITSType oldQueryLITS = queryLITS;
		queryLITS = newQueryLITS;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS, oldQueryLITS, newQueryLITS);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLITS(QueryLITSType newQueryLITS) {
		if (newQueryLITS != queryLITS) {
			NotificationChain msgs = null;
			if (queryLITS != null)
				msgs = ((InternalEObject)queryLITS).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS, null, msgs);
			if (newQueryLITS != null)
				msgs = ((InternalEObject)newQueryLITS).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS, null, msgs);
			msgs = basicSetQueryLITS(newQueryLITS, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS, newQueryLITS, newQueryLITS));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModifyLookaheadType getModifyLookahead() {
		return modifyLookahead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModifyLookahead(ModifyLookaheadType newModifyLookahead, NotificationChain msgs) {
		ModifyLookaheadType oldModifyLookahead = modifyLookahead;
		modifyLookahead = newModifyLookahead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD, oldModifyLookahead, newModifyLookahead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModifyLookahead(ModifyLookaheadType newModifyLookahead) {
		if (newModifyLookahead != modifyLookahead) {
			NotificationChain msgs = null;
			if (modifyLookahead != null)
				msgs = ((InternalEObject)modifyLookahead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD, null, msgs);
			if (newModifyLookahead != null)
				msgs = ((InternalEObject)newModifyLookahead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD, null, msgs);
			msgs = basicSetModifyLookahead(newModifyLookahead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD, newModifyLookahead, newModifyLookahead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public QueryLookaheadType getQueryLookahead() {
		return queryLookahead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetQueryLookahead(QueryLookaheadType newQueryLookahead, NotificationChain msgs) {
		QueryLookaheadType oldQueryLookahead = queryLookahead;
		queryLookahead = newQueryLookahead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD, oldQueryLookahead, newQueryLookahead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQueryLookahead(QueryLookaheadType newQueryLookahead) {
		if (newQueryLookahead != queryLookahead) {
			NotificationChain msgs = null;
			if (queryLookahead != null)
				msgs = ((InternalEObject)queryLookahead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD, null, msgs);
			if (newQueryLookahead != null)
				msgs = ((InternalEObject)newQueryLookahead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD, null, msgs);
			msgs = basicSetQueryLookahead(newQueryLookahead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD, newQueryLookahead, newQueryLookahead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RetractType getRetract() {
		return retract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRetract(RetractType newRetract, NotificationChain msgs) {
		RetractType oldRetract = retract;
		retract = newRetract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT, oldRetract, newRetract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetract(RetractType newRetract) {
		if (newRetract != retract) {
			NotificationChain msgs = null;
			if (retract != null)
				msgs = ((InternalEObject)retract).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT, null, msgs);
			if (newRetract != null)
				msgs = ((InternalEObject)newRetract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT, null, msgs);
			msgs = basicSetRetract(newRetract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT, newRetract, newRetract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestRetractionType getRequestRetraction() {
		return requestRetraction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestRetraction(RequestRetractionType newRequestRetraction, NotificationChain msgs) {
		RequestRetractionType oldRequestRetraction = requestRetraction;
		requestRetraction = newRequestRetraction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION, oldRequestRetraction, newRequestRetraction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestRetraction(RequestRetractionType newRequestRetraction) {
		if (newRequestRetraction != requestRetraction) {
			NotificationChain msgs = null;
			if (requestRetraction != null)
				msgs = ((InternalEObject)requestRetraction).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION, null, msgs);
			if (newRequestRetraction != null)
				msgs = ((InternalEObject)newRequestRetraction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION, null, msgs);
			msgs = basicSetRequestRetraction(newRequestRetraction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION, newRequestRetraction, newRequestRetraction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeAttributeOrderTypeType getChangeAttributeOrderType() {
		return changeAttributeOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeAttributeOrderType(ChangeAttributeOrderTypeType newChangeAttributeOrderType, NotificationChain msgs) {
		ChangeAttributeOrderTypeType oldChangeAttributeOrderType = changeAttributeOrderType;
		changeAttributeOrderType = newChangeAttributeOrderType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE, oldChangeAttributeOrderType, newChangeAttributeOrderType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeAttributeOrderType(ChangeAttributeOrderTypeType newChangeAttributeOrderType) {
		if (newChangeAttributeOrderType != changeAttributeOrderType) {
			NotificationChain msgs = null;
			if (changeAttributeOrderType != null)
				msgs = ((InternalEObject)changeAttributeOrderType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE, null, msgs);
			if (newChangeAttributeOrderType != null)
				msgs = ((InternalEObject)newChangeAttributeOrderType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE, null, msgs);
			msgs = basicSetChangeAttributeOrderType(newChangeAttributeOrderType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE, newChangeAttributeOrderType, newChangeAttributeOrderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeInteractionOrderTypeType getChangeInteractionOrderType() {
		return changeInteractionOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetChangeInteractionOrderType(ChangeInteractionOrderTypeType newChangeInteractionOrderType, NotificationChain msgs) {
		ChangeInteractionOrderTypeType oldChangeInteractionOrderType = changeInteractionOrderType;
		changeInteractionOrderType = newChangeInteractionOrderType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE, oldChangeInteractionOrderType, newChangeInteractionOrderType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChangeInteractionOrderType(ChangeInteractionOrderTypeType newChangeInteractionOrderType) {
		if (newChangeInteractionOrderType != changeInteractionOrderType) {
			NotificationChain msgs = null;
			if (changeInteractionOrderType != null)
				msgs = ((InternalEObject)changeInteractionOrderType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE, null, msgs);
			if (newChangeInteractionOrderType != null)
				msgs = ((InternalEObject)newChangeInteractionOrderType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE, null, msgs);
			msgs = basicSetChangeInteractionOrderType(newChangeInteractionOrderType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE, newChangeInteractionOrderType, newChangeInteractionOrderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CreateRegionType getCreateRegion() {
		return createRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCreateRegion(CreateRegionType newCreateRegion, NotificationChain msgs) {
		CreateRegionType oldCreateRegion = createRegion;
		createRegion = newCreateRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION, oldCreateRegion, newCreateRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCreateRegion(CreateRegionType newCreateRegion) {
		if (newCreateRegion != createRegion) {
			NotificationChain msgs = null;
			if (createRegion != null)
				msgs = ((InternalEObject)createRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION, null, msgs);
			if (newCreateRegion != null)
				msgs = ((InternalEObject)newCreateRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION, null, msgs);
			msgs = basicSetCreateRegion(newCreateRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION, newCreateRegion, newCreateRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommitRegionModificationsType getCommitRegionModifications() {
		return commitRegionModifications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommitRegionModifications(CommitRegionModificationsType newCommitRegionModifications, NotificationChain msgs) {
		CommitRegionModificationsType oldCommitRegionModifications = commitRegionModifications;
		commitRegionModifications = newCommitRegionModifications;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS, oldCommitRegionModifications, newCommitRegionModifications);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommitRegionModifications(CommitRegionModificationsType newCommitRegionModifications) {
		if (newCommitRegionModifications != commitRegionModifications) {
			NotificationChain msgs = null;
			if (commitRegionModifications != null)
				msgs = ((InternalEObject)commitRegionModifications).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS, null, msgs);
			if (newCommitRegionModifications != null)
				msgs = ((InternalEObject)newCommitRegionModifications).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS, null, msgs);
			msgs = basicSetCommitRegionModifications(newCommitRegionModifications, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS, newCommitRegionModifications, newCommitRegionModifications));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeleteRegionType getDeleteRegion() {
		return deleteRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeleteRegion(DeleteRegionType newDeleteRegion, NotificationChain msgs) {
		DeleteRegionType oldDeleteRegion = deleteRegion;
		deleteRegion = newDeleteRegion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION, oldDeleteRegion, newDeleteRegion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeleteRegion(DeleteRegionType newDeleteRegion) {
		if (newDeleteRegion != deleteRegion) {
			NotificationChain msgs = null;
			if (deleteRegion != null)
				msgs = ((InternalEObject)deleteRegion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION, null, msgs);
			if (newDeleteRegion != null)
				msgs = ((InternalEObject)newDeleteRegion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION, null, msgs);
			msgs = basicSetDeleteRegion(newDeleteRegion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION, newDeleteRegion, newDeleteRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisterObjectInstanceWithRegionsType getRegisterObjectInstanceWithRegions() {
		return registerObjectInstanceWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegisterObjectInstanceWithRegions(RegisterObjectInstanceWithRegionsType newRegisterObjectInstanceWithRegions, NotificationChain msgs) {
		RegisterObjectInstanceWithRegionsType oldRegisterObjectInstanceWithRegions = registerObjectInstanceWithRegions;
		registerObjectInstanceWithRegions = newRegisterObjectInstanceWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS, oldRegisterObjectInstanceWithRegions, newRegisterObjectInstanceWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegisterObjectInstanceWithRegions(RegisterObjectInstanceWithRegionsType newRegisterObjectInstanceWithRegions) {
		if (newRegisterObjectInstanceWithRegions != registerObjectInstanceWithRegions) {
			NotificationChain msgs = null;
			if (registerObjectInstanceWithRegions != null)
				msgs = ((InternalEObject)registerObjectInstanceWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS, null, msgs);
			if (newRegisterObjectInstanceWithRegions != null)
				msgs = ((InternalEObject)newRegisterObjectInstanceWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS, null, msgs);
			msgs = basicSetRegisterObjectInstanceWithRegions(newRegisterObjectInstanceWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS, newRegisterObjectInstanceWithRegions, newRegisterObjectInstanceWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociateRegionsForUpdatesType getAssociateRegionsForUpdates() {
		return associateRegionsForUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssociateRegionsForUpdates(AssociateRegionsForUpdatesType newAssociateRegionsForUpdates, NotificationChain msgs) {
		AssociateRegionsForUpdatesType oldAssociateRegionsForUpdates = associateRegionsForUpdates;
		associateRegionsForUpdates = newAssociateRegionsForUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES, oldAssociateRegionsForUpdates, newAssociateRegionsForUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociateRegionsForUpdates(AssociateRegionsForUpdatesType newAssociateRegionsForUpdates) {
		if (newAssociateRegionsForUpdates != associateRegionsForUpdates) {
			NotificationChain msgs = null;
			if (associateRegionsForUpdates != null)
				msgs = ((InternalEObject)associateRegionsForUpdates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES, null, msgs);
			if (newAssociateRegionsForUpdates != null)
				msgs = ((InternalEObject)newAssociateRegionsForUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES, null, msgs);
			msgs = basicSetAssociateRegionsForUpdates(newAssociateRegionsForUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES, newAssociateRegionsForUpdates, newAssociateRegionsForUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnassociateRegionsForUpdatesType getUnassociateRegionsForUpdates() {
		return unassociateRegionsForUpdates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnassociateRegionsForUpdates(UnassociateRegionsForUpdatesType newUnassociateRegionsForUpdates, NotificationChain msgs) {
		UnassociateRegionsForUpdatesType oldUnassociateRegionsForUpdates = unassociateRegionsForUpdates;
		unassociateRegionsForUpdates = newUnassociateRegionsForUpdates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES, oldUnassociateRegionsForUpdates, newUnassociateRegionsForUpdates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnassociateRegionsForUpdates(UnassociateRegionsForUpdatesType newUnassociateRegionsForUpdates) {
		if (newUnassociateRegionsForUpdates != unassociateRegionsForUpdates) {
			NotificationChain msgs = null;
			if (unassociateRegionsForUpdates != null)
				msgs = ((InternalEObject)unassociateRegionsForUpdates).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES, null, msgs);
			if (newUnassociateRegionsForUpdates != null)
				msgs = ((InternalEObject)newUnassociateRegionsForUpdates).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES, null, msgs);
			msgs = basicSetUnassociateRegionsForUpdates(newUnassociateRegionsForUpdates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES, newUnassociateRegionsForUpdates, newUnassociateRegionsForUpdates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeObjectClassAttributesWithRegionsType getSubscribeObjectClassAttributesWithRegions() {
		return subscribeObjectClassAttributesWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeObjectClassAttributesWithRegions(SubscribeObjectClassAttributesWithRegionsType newSubscribeObjectClassAttributesWithRegions, NotificationChain msgs) {
		SubscribeObjectClassAttributesWithRegionsType oldSubscribeObjectClassAttributesWithRegions = subscribeObjectClassAttributesWithRegions;
		subscribeObjectClassAttributesWithRegions = newSubscribeObjectClassAttributesWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, oldSubscribeObjectClassAttributesWithRegions, newSubscribeObjectClassAttributesWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeObjectClassAttributesWithRegions(SubscribeObjectClassAttributesWithRegionsType newSubscribeObjectClassAttributesWithRegions) {
		if (newSubscribeObjectClassAttributesWithRegions != subscribeObjectClassAttributesWithRegions) {
			NotificationChain msgs = null;
			if (subscribeObjectClassAttributesWithRegions != null)
				msgs = ((InternalEObject)subscribeObjectClassAttributesWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, null, msgs);
			if (newSubscribeObjectClassAttributesWithRegions != null)
				msgs = ((InternalEObject)newSubscribeObjectClassAttributesWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, null, msgs);
			msgs = basicSetSubscribeObjectClassAttributesWithRegions(newSubscribeObjectClassAttributesWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, newSubscribeObjectClassAttributesWithRegions, newSubscribeObjectClassAttributesWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeObjectClassAttributesWithRegionsType getUnsubscribeObjectClassAttributesWithRegions() {
		return unsubscribeObjectClassAttributesWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeObjectClassAttributesWithRegions(UnsubscribeObjectClassAttributesWithRegionsType newUnsubscribeObjectClassAttributesWithRegions, NotificationChain msgs) {
		UnsubscribeObjectClassAttributesWithRegionsType oldUnsubscribeObjectClassAttributesWithRegions = unsubscribeObjectClassAttributesWithRegions;
		unsubscribeObjectClassAttributesWithRegions = newUnsubscribeObjectClassAttributesWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, oldUnsubscribeObjectClassAttributesWithRegions, newUnsubscribeObjectClassAttributesWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsubscribeObjectClassAttributesWithRegions(UnsubscribeObjectClassAttributesWithRegionsType newUnsubscribeObjectClassAttributesWithRegions) {
		if (newUnsubscribeObjectClassAttributesWithRegions != unsubscribeObjectClassAttributesWithRegions) {
			NotificationChain msgs = null;
			if (unsubscribeObjectClassAttributesWithRegions != null)
				msgs = ((InternalEObject)unsubscribeObjectClassAttributesWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, null, msgs);
			if (newUnsubscribeObjectClassAttributesWithRegions != null)
				msgs = ((InternalEObject)newUnsubscribeObjectClassAttributesWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, null, msgs);
			msgs = basicSetUnsubscribeObjectClassAttributesWithRegions(newUnsubscribeObjectClassAttributesWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS, newUnsubscribeObjectClassAttributesWithRegions, newUnsubscribeObjectClassAttributesWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubscribeInteractionClassWithRegionsType getSubscribeInteractionClassWithRegions() {
		return subscribeInteractionClassWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubscribeInteractionClassWithRegions(SubscribeInteractionClassWithRegionsType newSubscribeInteractionClassWithRegions, NotificationChain msgs) {
		SubscribeInteractionClassWithRegionsType oldSubscribeInteractionClassWithRegions = subscribeInteractionClassWithRegions;
		subscribeInteractionClassWithRegions = newSubscribeInteractionClassWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, oldSubscribeInteractionClassWithRegions, newSubscribeInteractionClassWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubscribeInteractionClassWithRegions(SubscribeInteractionClassWithRegionsType newSubscribeInteractionClassWithRegions) {
		if (newSubscribeInteractionClassWithRegions != subscribeInteractionClassWithRegions) {
			NotificationChain msgs = null;
			if (subscribeInteractionClassWithRegions != null)
				msgs = ((InternalEObject)subscribeInteractionClassWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, null, msgs);
			if (newSubscribeInteractionClassWithRegions != null)
				msgs = ((InternalEObject)newSubscribeInteractionClassWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, null, msgs);
			msgs = basicSetSubscribeInteractionClassWithRegions(newSubscribeInteractionClassWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, newSubscribeInteractionClassWithRegions, newSubscribeInteractionClassWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnsubscribeInteractionClassWithRegionsType getUnsubscribeInteractionClassWithRegions() {
		return unsubscribeInteractionClassWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUnsubscribeInteractionClassWithRegions(UnsubscribeInteractionClassWithRegionsType newUnsubscribeInteractionClassWithRegions, NotificationChain msgs) {
		UnsubscribeInteractionClassWithRegionsType oldUnsubscribeInteractionClassWithRegions = unsubscribeInteractionClassWithRegions;
		unsubscribeInteractionClassWithRegions = newUnsubscribeInteractionClassWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, oldUnsubscribeInteractionClassWithRegions, newUnsubscribeInteractionClassWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnsubscribeInteractionClassWithRegions(UnsubscribeInteractionClassWithRegionsType newUnsubscribeInteractionClassWithRegions) {
		if (newUnsubscribeInteractionClassWithRegions != unsubscribeInteractionClassWithRegions) {
			NotificationChain msgs = null;
			if (unsubscribeInteractionClassWithRegions != null)
				msgs = ((InternalEObject)unsubscribeInteractionClassWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, null, msgs);
			if (newUnsubscribeInteractionClassWithRegions != null)
				msgs = ((InternalEObject)newUnsubscribeInteractionClassWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, null, msgs);
			msgs = basicSetUnsubscribeInteractionClassWithRegions(newUnsubscribeInteractionClassWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS, newUnsubscribeInteractionClassWithRegions, newUnsubscribeInteractionClassWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendInteractionWithRegionsType getSendInteractionWithRegions() {
		return sendInteractionWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSendInteractionWithRegions(SendInteractionWithRegionsType newSendInteractionWithRegions, NotificationChain msgs) {
		SendInteractionWithRegionsType oldSendInteractionWithRegions = sendInteractionWithRegions;
		sendInteractionWithRegions = newSendInteractionWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS, oldSendInteractionWithRegions, newSendInteractionWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendInteractionWithRegions(SendInteractionWithRegionsType newSendInteractionWithRegions) {
		if (newSendInteractionWithRegions != sendInteractionWithRegions) {
			NotificationChain msgs = null;
			if (sendInteractionWithRegions != null)
				msgs = ((InternalEObject)sendInteractionWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS, null, msgs);
			if (newSendInteractionWithRegions != null)
				msgs = ((InternalEObject)newSendInteractionWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS, null, msgs);
			msgs = basicSetSendInteractionWithRegions(newSendInteractionWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS, newSendInteractionWithRegions, newSendInteractionWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestAttributeValueUpdateWithRegionsType getRequestAttributeValueUpdateWithRegions() {
		return requestAttributeValueUpdateWithRegions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRequestAttributeValueUpdateWithRegions(RequestAttributeValueUpdateWithRegionsType newRequestAttributeValueUpdateWithRegions, NotificationChain msgs) {
		RequestAttributeValueUpdateWithRegionsType oldRequestAttributeValueUpdateWithRegions = requestAttributeValueUpdateWithRegions;
		requestAttributeValueUpdateWithRegions = newRequestAttributeValueUpdateWithRegions;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS, oldRequestAttributeValueUpdateWithRegions, newRequestAttributeValueUpdateWithRegions);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRequestAttributeValueUpdateWithRegions(RequestAttributeValueUpdateWithRegionsType newRequestAttributeValueUpdateWithRegions) {
		if (newRequestAttributeValueUpdateWithRegions != requestAttributeValueUpdateWithRegions) {
			NotificationChain msgs = null;
			if (requestAttributeValueUpdateWithRegions != null)
				msgs = ((InternalEObject)requestAttributeValueUpdateWithRegions).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS, null, msgs);
			if (newRequestAttributeValueUpdateWithRegions != null)
				msgs = ((InternalEObject)newRequestAttributeValueUpdateWithRegions).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS, null, msgs);
			msgs = basicSetRequestAttributeValueUpdateWithRegions(newRequestAttributeValueUpdateWithRegions, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS, newRequestAttributeValueUpdateWithRegions, newRequestAttributeValueUpdateWithRegions));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAutomaticResignDirectiveType getGetAutomaticResignDirective() {
		return getAutomaticResignDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAutomaticResignDirective(GetAutomaticResignDirectiveType newGetAutomaticResignDirective, NotificationChain msgs) {
		GetAutomaticResignDirectiveType oldGetAutomaticResignDirective = getAutomaticResignDirective;
		getAutomaticResignDirective = newGetAutomaticResignDirective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE, oldGetAutomaticResignDirective, newGetAutomaticResignDirective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAutomaticResignDirective(GetAutomaticResignDirectiveType newGetAutomaticResignDirective) {
		if (newGetAutomaticResignDirective != getAutomaticResignDirective) {
			NotificationChain msgs = null;
			if (getAutomaticResignDirective != null)
				msgs = ((InternalEObject)getAutomaticResignDirective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE, null, msgs);
			if (newGetAutomaticResignDirective != null)
				msgs = ((InternalEObject)newGetAutomaticResignDirective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE, null, msgs);
			msgs = basicSetGetAutomaticResignDirective(newGetAutomaticResignDirective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE, newGetAutomaticResignDirective, newGetAutomaticResignDirective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetAutomaticResignDirectiveType getSetAutomaticResignDirective() {
		return setAutomaticResignDirective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetAutomaticResignDirective(SetAutomaticResignDirectiveType newSetAutomaticResignDirective, NotificationChain msgs) {
		SetAutomaticResignDirectiveType oldSetAutomaticResignDirective = setAutomaticResignDirective;
		setAutomaticResignDirective = newSetAutomaticResignDirective;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE, oldSetAutomaticResignDirective, newSetAutomaticResignDirective);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetAutomaticResignDirective(SetAutomaticResignDirectiveType newSetAutomaticResignDirective) {
		if (newSetAutomaticResignDirective != setAutomaticResignDirective) {
			NotificationChain msgs = null;
			if (setAutomaticResignDirective != null)
				msgs = ((InternalEObject)setAutomaticResignDirective).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE, null, msgs);
			if (newSetAutomaticResignDirective != null)
				msgs = ((InternalEObject)newSetAutomaticResignDirective).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE, null, msgs);
			msgs = basicSetSetAutomaticResignDirective(newSetAutomaticResignDirective, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE, newSetAutomaticResignDirective, newSetAutomaticResignDirective));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateHandleType getGetFederateHandle() {
		return getFederateHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFederateHandle(GetFederateHandleType newGetFederateHandle, NotificationChain msgs) {
		GetFederateHandleType oldGetFederateHandle = getFederateHandle;
		getFederateHandle = newGetFederateHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE, oldGetFederateHandle, newGetFederateHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetFederateHandle(GetFederateHandleType newGetFederateHandle) {
		if (newGetFederateHandle != getFederateHandle) {
			NotificationChain msgs = null;
			if (getFederateHandle != null)
				msgs = ((InternalEObject)getFederateHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE, null, msgs);
			if (newGetFederateHandle != null)
				msgs = ((InternalEObject)newGetFederateHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE, null, msgs);
			msgs = basicSetGetFederateHandle(newGetFederateHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE, newGetFederateHandle, newGetFederateHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetFederateNameType getGetFederateName() {
		return getFederateName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetFederateName(GetFederateNameType newGetFederateName, NotificationChain msgs) {
		GetFederateNameType oldGetFederateName = getFederateName;
		getFederateName = newGetFederateName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME, oldGetFederateName, newGetFederateName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetFederateName(GetFederateNameType newGetFederateName) {
		if (newGetFederateName != getFederateName) {
			NotificationChain msgs = null;
			if (getFederateName != null)
				msgs = ((InternalEObject)getFederateName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME, null, msgs);
			if (newGetFederateName != null)
				msgs = ((InternalEObject)newGetFederateName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME, null, msgs);
			msgs = basicSetGetFederateName(newGetFederateName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME, newGetFederateName, newGetFederateName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassHandleType getGetObjectClassHandle() {
		return getObjectClassHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectClassHandle(GetObjectClassHandleType newGetObjectClassHandle, NotificationChain msgs) {
		GetObjectClassHandleType oldGetObjectClassHandle = getObjectClassHandle;
		getObjectClassHandle = newGetObjectClassHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE, oldGetObjectClassHandle, newGetObjectClassHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetObjectClassHandle(GetObjectClassHandleType newGetObjectClassHandle) {
		if (newGetObjectClassHandle != getObjectClassHandle) {
			NotificationChain msgs = null;
			if (getObjectClassHandle != null)
				msgs = ((InternalEObject)getObjectClassHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE, null, msgs);
			if (newGetObjectClassHandle != null)
				msgs = ((InternalEObject)newGetObjectClassHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE, null, msgs);
			msgs = basicSetGetObjectClassHandle(newGetObjectClassHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE, newGetObjectClassHandle, newGetObjectClassHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectClassNameType getGetObjectClassName() {
		return getObjectClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectClassName(GetObjectClassNameType newGetObjectClassName, NotificationChain msgs) {
		GetObjectClassNameType oldGetObjectClassName = getObjectClassName;
		getObjectClassName = newGetObjectClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME, oldGetObjectClassName, newGetObjectClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetObjectClassName(GetObjectClassNameType newGetObjectClassName) {
		if (newGetObjectClassName != getObjectClassName) {
			NotificationChain msgs = null;
			if (getObjectClassName != null)
				msgs = ((InternalEObject)getObjectClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME, null, msgs);
			if (newGetObjectClassName != null)
				msgs = ((InternalEObject)newGetObjectClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME, null, msgs);
			msgs = basicSetGetObjectClassName(newGetObjectClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME, newGetObjectClassName, newGetObjectClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetKnownObjectClassHandleType getGetKnownObjectClassHandle() {
		return getKnownObjectClassHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetKnownObjectClassHandle(GetKnownObjectClassHandleType newGetKnownObjectClassHandle, NotificationChain msgs) {
		GetKnownObjectClassHandleType oldGetKnownObjectClassHandle = getKnownObjectClassHandle;
		getKnownObjectClassHandle = newGetKnownObjectClassHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE, oldGetKnownObjectClassHandle, newGetKnownObjectClassHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetKnownObjectClassHandle(GetKnownObjectClassHandleType newGetKnownObjectClassHandle) {
		if (newGetKnownObjectClassHandle != getKnownObjectClassHandle) {
			NotificationChain msgs = null;
			if (getKnownObjectClassHandle != null)
				msgs = ((InternalEObject)getKnownObjectClassHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE, null, msgs);
			if (newGetKnownObjectClassHandle != null)
				msgs = ((InternalEObject)newGetKnownObjectClassHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE, null, msgs);
			msgs = basicSetGetKnownObjectClassHandle(newGetKnownObjectClassHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE, newGetKnownObjectClassHandle, newGetKnownObjectClassHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceHandleType getGetObjectInstanceHandle() {
		return getObjectInstanceHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectInstanceHandle(GetObjectInstanceHandleType newGetObjectInstanceHandle, NotificationChain msgs) {
		GetObjectInstanceHandleType oldGetObjectInstanceHandle = getObjectInstanceHandle;
		getObjectInstanceHandle = newGetObjectInstanceHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE, oldGetObjectInstanceHandle, newGetObjectInstanceHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetObjectInstanceHandle(GetObjectInstanceHandleType newGetObjectInstanceHandle) {
		if (newGetObjectInstanceHandle != getObjectInstanceHandle) {
			NotificationChain msgs = null;
			if (getObjectInstanceHandle != null)
				msgs = ((InternalEObject)getObjectInstanceHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE, null, msgs);
			if (newGetObjectInstanceHandle != null)
				msgs = ((InternalEObject)newGetObjectInstanceHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE, null, msgs);
			msgs = basicSetGetObjectInstanceHandle(newGetObjectInstanceHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE, newGetObjectInstanceHandle, newGetObjectInstanceHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetObjectInstanceNameType getGetObjectInstanceName() {
		return getObjectInstanceName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetObjectInstanceName(GetObjectInstanceNameType newGetObjectInstanceName, NotificationChain msgs) {
		GetObjectInstanceNameType oldGetObjectInstanceName = getObjectInstanceName;
		getObjectInstanceName = newGetObjectInstanceName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME, oldGetObjectInstanceName, newGetObjectInstanceName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetObjectInstanceName(GetObjectInstanceNameType newGetObjectInstanceName) {
		if (newGetObjectInstanceName != getObjectInstanceName) {
			NotificationChain msgs = null;
			if (getObjectInstanceName != null)
				msgs = ((InternalEObject)getObjectInstanceName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME, null, msgs);
			if (newGetObjectInstanceName != null)
				msgs = ((InternalEObject)newGetObjectInstanceName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME, null, msgs);
			msgs = basicSetGetObjectInstanceName(newGetObjectInstanceName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME, newGetObjectInstanceName, newGetObjectInstanceName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeHandleType getGetAttributeHandle() {
		return getAttributeHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAttributeHandle(GetAttributeHandleType newGetAttributeHandle, NotificationChain msgs) {
		GetAttributeHandleType oldGetAttributeHandle = getAttributeHandle;
		getAttributeHandle = newGetAttributeHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE, oldGetAttributeHandle, newGetAttributeHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAttributeHandle(GetAttributeHandleType newGetAttributeHandle) {
		if (newGetAttributeHandle != getAttributeHandle) {
			NotificationChain msgs = null;
			if (getAttributeHandle != null)
				msgs = ((InternalEObject)getAttributeHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE, null, msgs);
			if (newGetAttributeHandle != null)
				msgs = ((InternalEObject)newGetAttributeHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE, null, msgs);
			msgs = basicSetGetAttributeHandle(newGetAttributeHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE, newGetAttributeHandle, newGetAttributeHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAttributeNameType getGetAttributeName() {
		return getAttributeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAttributeName(GetAttributeNameType newGetAttributeName, NotificationChain msgs) {
		GetAttributeNameType oldGetAttributeName = getAttributeName;
		getAttributeName = newGetAttributeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME, oldGetAttributeName, newGetAttributeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAttributeName(GetAttributeNameType newGetAttributeName) {
		if (newGetAttributeName != getAttributeName) {
			NotificationChain msgs = null;
			if (getAttributeName != null)
				msgs = ((InternalEObject)getAttributeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME, null, msgs);
			if (newGetAttributeName != null)
				msgs = ((InternalEObject)newGetAttributeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME, null, msgs);
			msgs = basicSetGetAttributeName(newGetAttributeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME, newGetAttributeName, newGetAttributeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueType getGetUpdateRateValue() {
		return getUpdateRateValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetUpdateRateValue(GetUpdateRateValueType newGetUpdateRateValue, NotificationChain msgs) {
		GetUpdateRateValueType oldGetUpdateRateValue = getUpdateRateValue;
		getUpdateRateValue = newGetUpdateRateValue;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE, oldGetUpdateRateValue, newGetUpdateRateValue);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetUpdateRateValue(GetUpdateRateValueType newGetUpdateRateValue) {
		if (newGetUpdateRateValue != getUpdateRateValue) {
			NotificationChain msgs = null;
			if (getUpdateRateValue != null)
				msgs = ((InternalEObject)getUpdateRateValue).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE, null, msgs);
			if (newGetUpdateRateValue != null)
				msgs = ((InternalEObject)newGetUpdateRateValue).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE, null, msgs);
			msgs = basicSetGetUpdateRateValue(newGetUpdateRateValue, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE, newGetUpdateRateValue, newGetUpdateRateValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetUpdateRateValueForAttributeType getGetUpdateRateValueForAttribute() {
		return getUpdateRateValueForAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetUpdateRateValueForAttribute(GetUpdateRateValueForAttributeType newGetUpdateRateValueForAttribute, NotificationChain msgs) {
		GetUpdateRateValueForAttributeType oldGetUpdateRateValueForAttribute = getUpdateRateValueForAttribute;
		getUpdateRateValueForAttribute = newGetUpdateRateValueForAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE, oldGetUpdateRateValueForAttribute, newGetUpdateRateValueForAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetUpdateRateValueForAttribute(GetUpdateRateValueForAttributeType newGetUpdateRateValueForAttribute) {
		if (newGetUpdateRateValueForAttribute != getUpdateRateValueForAttribute) {
			NotificationChain msgs = null;
			if (getUpdateRateValueForAttribute != null)
				msgs = ((InternalEObject)getUpdateRateValueForAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE, null, msgs);
			if (newGetUpdateRateValueForAttribute != null)
				msgs = ((InternalEObject)newGetUpdateRateValueForAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE, null, msgs);
			msgs = basicSetGetUpdateRateValueForAttribute(newGetUpdateRateValueForAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE, newGetUpdateRateValueForAttribute, newGetUpdateRateValueForAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassHandleType getGetInteractionClassHandle() {
		return getInteractionClassHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetInteractionClassHandle(GetInteractionClassHandleType newGetInteractionClassHandle, NotificationChain msgs) {
		GetInteractionClassHandleType oldGetInteractionClassHandle = getInteractionClassHandle;
		getInteractionClassHandle = newGetInteractionClassHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE, oldGetInteractionClassHandle, newGetInteractionClassHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInteractionClassHandle(GetInteractionClassHandleType newGetInteractionClassHandle) {
		if (newGetInteractionClassHandle != getInteractionClassHandle) {
			NotificationChain msgs = null;
			if (getInteractionClassHandle != null)
				msgs = ((InternalEObject)getInteractionClassHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE, null, msgs);
			if (newGetInteractionClassHandle != null)
				msgs = ((InternalEObject)newGetInteractionClassHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE, null, msgs);
			msgs = basicSetGetInteractionClassHandle(newGetInteractionClassHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE, newGetInteractionClassHandle, newGetInteractionClassHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetInteractionClassNameType getGetInteractionClassName() {
		return getInteractionClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetInteractionClassName(GetInteractionClassNameType newGetInteractionClassName, NotificationChain msgs) {
		GetInteractionClassNameType oldGetInteractionClassName = getInteractionClassName;
		getInteractionClassName = newGetInteractionClassName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME, oldGetInteractionClassName, newGetInteractionClassName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetInteractionClassName(GetInteractionClassNameType newGetInteractionClassName) {
		if (newGetInteractionClassName != getInteractionClassName) {
			NotificationChain msgs = null;
			if (getInteractionClassName != null)
				msgs = ((InternalEObject)getInteractionClassName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME, null, msgs);
			if (newGetInteractionClassName != null)
				msgs = ((InternalEObject)newGetInteractionClassName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME, null, msgs);
			msgs = basicSetGetInteractionClassName(newGetInteractionClassName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME, newGetInteractionClassName, newGetInteractionClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterHandleType getGetParameterHandle() {
		return getParameterHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetParameterHandle(GetParameterHandleType newGetParameterHandle, NotificationChain msgs) {
		GetParameterHandleType oldGetParameterHandle = getParameterHandle;
		getParameterHandle = newGetParameterHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE, oldGetParameterHandle, newGetParameterHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetParameterHandle(GetParameterHandleType newGetParameterHandle) {
		if (newGetParameterHandle != getParameterHandle) {
			NotificationChain msgs = null;
			if (getParameterHandle != null)
				msgs = ((InternalEObject)getParameterHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE, null, msgs);
			if (newGetParameterHandle != null)
				msgs = ((InternalEObject)newGetParameterHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE, null, msgs);
			msgs = basicSetGetParameterHandle(newGetParameterHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE, newGetParameterHandle, newGetParameterHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetParameterNameType getGetParameterName() {
		return getParameterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetParameterName(GetParameterNameType newGetParameterName, NotificationChain msgs) {
		GetParameterNameType oldGetParameterName = getParameterName;
		getParameterName = newGetParameterName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME, oldGetParameterName, newGetParameterName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetParameterName(GetParameterNameType newGetParameterName) {
		if (newGetParameterName != getParameterName) {
			NotificationChain msgs = null;
			if (getParameterName != null)
				msgs = ((InternalEObject)getParameterName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME, null, msgs);
			if (newGetParameterName != null)
				msgs = ((InternalEObject)newGetParameterName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME, null, msgs);
			msgs = basicSetGetParameterName(newGetParameterName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME, newGetParameterName, newGetParameterName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderTypeType getGetOrderType() {
		return getOrderType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetOrderType(GetOrderTypeType newGetOrderType, NotificationChain msgs) {
		GetOrderTypeType oldGetOrderType = getOrderType;
		getOrderType = newGetOrderType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE, oldGetOrderType, newGetOrderType);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetOrderType(GetOrderTypeType newGetOrderType) {
		if (newGetOrderType != getOrderType) {
			NotificationChain msgs = null;
			if (getOrderType != null)
				msgs = ((InternalEObject)getOrderType).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE, null, msgs);
			if (newGetOrderType != null)
				msgs = ((InternalEObject)newGetOrderType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE, null, msgs);
			msgs = basicSetGetOrderType(newGetOrderType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE, newGetOrderType, newGetOrderType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetOrderNameType getGetOrderName() {
		return getOrderName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetOrderName(GetOrderNameType newGetOrderName, NotificationChain msgs) {
		GetOrderNameType oldGetOrderName = getOrderName;
		getOrderName = newGetOrderName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME, oldGetOrderName, newGetOrderName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetOrderName(GetOrderNameType newGetOrderName) {
		if (newGetOrderName != getOrderName) {
			NotificationChain msgs = null;
			if (getOrderName != null)
				msgs = ((InternalEObject)getOrderName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME, null, msgs);
			if (newGetOrderName != null)
				msgs = ((InternalEObject)newGetOrderName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME, null, msgs);
			msgs = basicSetGetOrderName(newGetOrderName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME, newGetOrderName, newGetOrderName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeHandleType getGetTransportationTypeHandle() {
		return getTransportationTypeHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetTransportationTypeHandle(GetTransportationTypeHandleType newGetTransportationTypeHandle, NotificationChain msgs) {
		GetTransportationTypeHandleType oldGetTransportationTypeHandle = getTransportationTypeHandle;
		getTransportationTypeHandle = newGetTransportationTypeHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE, oldGetTransportationTypeHandle, newGetTransportationTypeHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetTransportationTypeHandle(GetTransportationTypeHandleType newGetTransportationTypeHandle) {
		if (newGetTransportationTypeHandle != getTransportationTypeHandle) {
			NotificationChain msgs = null;
			if (getTransportationTypeHandle != null)
				msgs = ((InternalEObject)getTransportationTypeHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE, null, msgs);
			if (newGetTransportationTypeHandle != null)
				msgs = ((InternalEObject)newGetTransportationTypeHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE, null, msgs);
			msgs = basicSetGetTransportationTypeHandle(newGetTransportationTypeHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE, newGetTransportationTypeHandle, newGetTransportationTypeHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTransportationTypeNameType getGetTransportationTypeName() {
		return getTransportationTypeName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetTransportationTypeName(GetTransportationTypeNameType newGetTransportationTypeName, NotificationChain msgs) {
		GetTransportationTypeNameType oldGetTransportationTypeName = getTransportationTypeName;
		getTransportationTypeName = newGetTransportationTypeName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME, oldGetTransportationTypeName, newGetTransportationTypeName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetTransportationTypeName(GetTransportationTypeNameType newGetTransportationTypeName) {
		if (newGetTransportationTypeName != getTransportationTypeName) {
			NotificationChain msgs = null;
			if (getTransportationTypeName != null)
				msgs = ((InternalEObject)getTransportationTypeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME, null, msgs);
			if (newGetTransportationTypeName != null)
				msgs = ((InternalEObject)newGetTransportationTypeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME, null, msgs);
			msgs = basicSetGetTransportationTypeName(newGetTransportationTypeName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME, newGetTransportationTypeName, newGetTransportationTypeName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForClassAttributeType getGetAvailableDimensionsForClassAttribute() {
		return getAvailableDimensionsForClassAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAvailableDimensionsForClassAttribute(GetAvailableDimensionsForClassAttributeType newGetAvailableDimensionsForClassAttribute, NotificationChain msgs) {
		GetAvailableDimensionsForClassAttributeType oldGetAvailableDimensionsForClassAttribute = getAvailableDimensionsForClassAttribute;
		getAvailableDimensionsForClassAttribute = newGetAvailableDimensionsForClassAttribute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE, oldGetAvailableDimensionsForClassAttribute, newGetAvailableDimensionsForClassAttribute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAvailableDimensionsForClassAttribute(GetAvailableDimensionsForClassAttributeType newGetAvailableDimensionsForClassAttribute) {
		if (newGetAvailableDimensionsForClassAttribute != getAvailableDimensionsForClassAttribute) {
			NotificationChain msgs = null;
			if (getAvailableDimensionsForClassAttribute != null)
				msgs = ((InternalEObject)getAvailableDimensionsForClassAttribute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE, null, msgs);
			if (newGetAvailableDimensionsForClassAttribute != null)
				msgs = ((InternalEObject)newGetAvailableDimensionsForClassAttribute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE, null, msgs);
			msgs = basicSetGetAvailableDimensionsForClassAttribute(newGetAvailableDimensionsForClassAttribute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE, newGetAvailableDimensionsForClassAttribute, newGetAvailableDimensionsForClassAttribute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetAvailableDimensionsForInteractionClassType getGetAvailableDimensionsForInteractionClass() {
		return getAvailableDimensionsForInteractionClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetAvailableDimensionsForInteractionClass(GetAvailableDimensionsForInteractionClassType newGetAvailableDimensionsForInteractionClass, NotificationChain msgs) {
		GetAvailableDimensionsForInteractionClassType oldGetAvailableDimensionsForInteractionClass = getAvailableDimensionsForInteractionClass;
		getAvailableDimensionsForInteractionClass = newGetAvailableDimensionsForInteractionClass;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS, oldGetAvailableDimensionsForInteractionClass, newGetAvailableDimensionsForInteractionClass);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetAvailableDimensionsForInteractionClass(GetAvailableDimensionsForInteractionClassType newGetAvailableDimensionsForInteractionClass) {
		if (newGetAvailableDimensionsForInteractionClass != getAvailableDimensionsForInteractionClass) {
			NotificationChain msgs = null;
			if (getAvailableDimensionsForInteractionClass != null)
				msgs = ((InternalEObject)getAvailableDimensionsForInteractionClass).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS, null, msgs);
			if (newGetAvailableDimensionsForInteractionClass != null)
				msgs = ((InternalEObject)newGetAvailableDimensionsForInteractionClass).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS, null, msgs);
			msgs = basicSetGetAvailableDimensionsForInteractionClass(newGetAvailableDimensionsForInteractionClass, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS, newGetAvailableDimensionsForInteractionClass, newGetAvailableDimensionsForInteractionClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleType getGetDimensionHandle() {
		return getDimensionHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDimensionHandle(GetDimensionHandleType newGetDimensionHandle, NotificationChain msgs) {
		GetDimensionHandleType oldGetDimensionHandle = getDimensionHandle;
		getDimensionHandle = newGetDimensionHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE, oldGetDimensionHandle, newGetDimensionHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDimensionHandle(GetDimensionHandleType newGetDimensionHandle) {
		if (newGetDimensionHandle != getDimensionHandle) {
			NotificationChain msgs = null;
			if (getDimensionHandle != null)
				msgs = ((InternalEObject)getDimensionHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE, null, msgs);
			if (newGetDimensionHandle != null)
				msgs = ((InternalEObject)newGetDimensionHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE, null, msgs);
			msgs = basicSetGetDimensionHandle(newGetDimensionHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE, newGetDimensionHandle, newGetDimensionHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionNameType getGetDimensionName() {
		return getDimensionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDimensionName(GetDimensionNameType newGetDimensionName, NotificationChain msgs) {
		GetDimensionNameType oldGetDimensionName = getDimensionName;
		getDimensionName = newGetDimensionName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME, oldGetDimensionName, newGetDimensionName);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDimensionName(GetDimensionNameType newGetDimensionName) {
		if (newGetDimensionName != getDimensionName) {
			NotificationChain msgs = null;
			if (getDimensionName != null)
				msgs = ((InternalEObject)getDimensionName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME, null, msgs);
			if (newGetDimensionName != null)
				msgs = ((InternalEObject)newGetDimensionName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME, null, msgs);
			msgs = basicSetGetDimensionName(newGetDimensionName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME, newGetDimensionName, newGetDimensionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionUpperBoundType getGetDimensionUpperBound() {
		return getDimensionUpperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDimensionUpperBound(GetDimensionUpperBoundType newGetDimensionUpperBound, NotificationChain msgs) {
		GetDimensionUpperBoundType oldGetDimensionUpperBound = getDimensionUpperBound;
		getDimensionUpperBound = newGetDimensionUpperBound;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND, oldGetDimensionUpperBound, newGetDimensionUpperBound);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDimensionUpperBound(GetDimensionUpperBoundType newGetDimensionUpperBound) {
		if (newGetDimensionUpperBound != getDimensionUpperBound) {
			NotificationChain msgs = null;
			if (getDimensionUpperBound != null)
				msgs = ((InternalEObject)getDimensionUpperBound).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND, null, msgs);
			if (newGetDimensionUpperBound != null)
				msgs = ((InternalEObject)newGetDimensionUpperBound).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND, null, msgs);
			msgs = basicSetGetDimensionUpperBound(newGetDimensionUpperBound, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND, newGetDimensionUpperBound, newGetDimensionUpperBound));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetDimensionHandleSetType getGetDimensionHandleSet() {
		return getDimensionHandleSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetDimensionHandleSet(GetDimensionHandleSetType newGetDimensionHandleSet, NotificationChain msgs) {
		GetDimensionHandleSetType oldGetDimensionHandleSet = getDimensionHandleSet;
		getDimensionHandleSet = newGetDimensionHandleSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET, oldGetDimensionHandleSet, newGetDimensionHandleSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetDimensionHandleSet(GetDimensionHandleSetType newGetDimensionHandleSet) {
		if (newGetDimensionHandleSet != getDimensionHandleSet) {
			NotificationChain msgs = null;
			if (getDimensionHandleSet != null)
				msgs = ((InternalEObject)getDimensionHandleSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET, null, msgs);
			if (newGetDimensionHandleSet != null)
				msgs = ((InternalEObject)newGetDimensionHandleSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET, null, msgs);
			msgs = basicSetGetDimensionHandleSet(newGetDimensionHandleSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET, newGetDimensionHandleSet, newGetDimensionHandleSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetRangeBoundsType getGetRangeBounds() {
		return getRangeBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGetRangeBounds(GetRangeBoundsType newGetRangeBounds, NotificationChain msgs) {
		GetRangeBoundsType oldGetRangeBounds = getRangeBounds;
		getRangeBounds = newGetRangeBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS, oldGetRangeBounds, newGetRangeBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGetRangeBounds(GetRangeBoundsType newGetRangeBounds) {
		if (newGetRangeBounds != getRangeBounds) {
			NotificationChain msgs = null;
			if (getRangeBounds != null)
				msgs = ((InternalEObject)getRangeBounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS, null, msgs);
			if (newGetRangeBounds != null)
				msgs = ((InternalEObject)newGetRangeBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS, null, msgs);
			msgs = basicSetGetRangeBounds(newGetRangeBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS, newGetRangeBounds, newGetRangeBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetRangeBoundsType getSetRangeBounds() {
		return setRangeBounds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSetRangeBounds(SetRangeBoundsType newSetRangeBounds, NotificationChain msgs) {
		SetRangeBoundsType oldSetRangeBounds = setRangeBounds;
		setRangeBounds = newSetRangeBounds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS, oldSetRangeBounds, newSetRangeBounds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSetRangeBounds(SetRangeBoundsType newSetRangeBounds) {
		if (newSetRangeBounds != setRangeBounds) {
			NotificationChain msgs = null;
			if (setRangeBounds != null)
				msgs = ((InternalEObject)setRangeBounds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS, null, msgs);
			if (newSetRangeBounds != null)
				msgs = ((InternalEObject)newSetRangeBounds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS, null, msgs);
			msgs = basicSetSetRangeBounds(newSetRangeBounds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS, newSetRangeBounds, newSetRangeBounds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeFederateHandleType getNormalizeFederateHandle() {
		return normalizeFederateHandle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalizeFederateHandle(NormalizeFederateHandleType newNormalizeFederateHandle, NotificationChain msgs) {
		NormalizeFederateHandleType oldNormalizeFederateHandle = normalizeFederateHandle;
		normalizeFederateHandle = newNormalizeFederateHandle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE, oldNormalizeFederateHandle, newNormalizeFederateHandle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizeFederateHandle(NormalizeFederateHandleType newNormalizeFederateHandle) {
		if (newNormalizeFederateHandle != normalizeFederateHandle) {
			NotificationChain msgs = null;
			if (normalizeFederateHandle != null)
				msgs = ((InternalEObject)normalizeFederateHandle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE, null, msgs);
			if (newNormalizeFederateHandle != null)
				msgs = ((InternalEObject)newNormalizeFederateHandle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE, null, msgs);
			msgs = basicSetNormalizeFederateHandle(newNormalizeFederateHandle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE, newNormalizeFederateHandle, newNormalizeFederateHandle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NormalizeServiceGroupType getNormalizeServiceGroup() {
		return normalizeServiceGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNormalizeServiceGroup(NormalizeServiceGroupType newNormalizeServiceGroup, NotificationChain msgs) {
		NormalizeServiceGroupType oldNormalizeServiceGroup = normalizeServiceGroup;
		normalizeServiceGroup = newNormalizeServiceGroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP, oldNormalizeServiceGroup, newNormalizeServiceGroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNormalizeServiceGroup(NormalizeServiceGroupType newNormalizeServiceGroup) {
		if (newNormalizeServiceGroup != normalizeServiceGroup) {
			NotificationChain msgs = null;
			if (normalizeServiceGroup != null)
				msgs = ((InternalEObject)normalizeServiceGroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP, null, msgs);
			if (newNormalizeServiceGroup != null)
				msgs = ((InternalEObject)newNormalizeServiceGroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP, null, msgs);
			msgs = basicSetNormalizeServiceGroup(newNormalizeServiceGroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP, newNormalizeServiceGroup, newNormalizeServiceGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableObjectClassRelevanceAdvisorySwitchType getEnableObjectClassRelevanceAdvisorySwitch() {
		return enableObjectClassRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableObjectClassRelevanceAdvisorySwitch(EnableObjectClassRelevanceAdvisorySwitchType newEnableObjectClassRelevanceAdvisorySwitch, NotificationChain msgs) {
		EnableObjectClassRelevanceAdvisorySwitchType oldEnableObjectClassRelevanceAdvisorySwitch = enableObjectClassRelevanceAdvisorySwitch;
		enableObjectClassRelevanceAdvisorySwitch = newEnableObjectClassRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, oldEnableObjectClassRelevanceAdvisorySwitch, newEnableObjectClassRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableObjectClassRelevanceAdvisorySwitch(EnableObjectClassRelevanceAdvisorySwitchType newEnableObjectClassRelevanceAdvisorySwitch) {
		if (newEnableObjectClassRelevanceAdvisorySwitch != enableObjectClassRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (enableObjectClassRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)enableObjectClassRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newEnableObjectClassRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newEnableObjectClassRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetEnableObjectClassRelevanceAdvisorySwitch(newEnableObjectClassRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, newEnableObjectClassRelevanceAdvisorySwitch, newEnableObjectClassRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableObjectClassRelevanceAdvisorySwitchType getDisableObjectClassRelevanceAdvisorySwitch() {
		return disableObjectClassRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableObjectClassRelevanceAdvisorySwitch(DisableObjectClassRelevanceAdvisorySwitchType newDisableObjectClassRelevanceAdvisorySwitch, NotificationChain msgs) {
		DisableObjectClassRelevanceAdvisorySwitchType oldDisableObjectClassRelevanceAdvisorySwitch = disableObjectClassRelevanceAdvisorySwitch;
		disableObjectClassRelevanceAdvisorySwitch = newDisableObjectClassRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, oldDisableObjectClassRelevanceAdvisorySwitch, newDisableObjectClassRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableObjectClassRelevanceAdvisorySwitch(DisableObjectClassRelevanceAdvisorySwitchType newDisableObjectClassRelevanceAdvisorySwitch) {
		if (newDisableObjectClassRelevanceAdvisorySwitch != disableObjectClassRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (disableObjectClassRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)disableObjectClassRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newDisableObjectClassRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newDisableObjectClassRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetDisableObjectClassRelevanceAdvisorySwitch(newDisableObjectClassRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH, newDisableObjectClassRelevanceAdvisorySwitch, newDisableObjectClassRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeRelevanceAdvisorySwitchType getEnableAttributeRelevanceAdvisorySwitch() {
		return enableAttributeRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableAttributeRelevanceAdvisorySwitch(EnableAttributeRelevanceAdvisorySwitchType newEnableAttributeRelevanceAdvisorySwitch, NotificationChain msgs) {
		EnableAttributeRelevanceAdvisorySwitchType oldEnableAttributeRelevanceAdvisorySwitch = enableAttributeRelevanceAdvisorySwitch;
		enableAttributeRelevanceAdvisorySwitch = newEnableAttributeRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, oldEnableAttributeRelevanceAdvisorySwitch, newEnableAttributeRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAttributeRelevanceAdvisorySwitch(EnableAttributeRelevanceAdvisorySwitchType newEnableAttributeRelevanceAdvisorySwitch) {
		if (newEnableAttributeRelevanceAdvisorySwitch != enableAttributeRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (enableAttributeRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)enableAttributeRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newEnableAttributeRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newEnableAttributeRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetEnableAttributeRelevanceAdvisorySwitch(newEnableAttributeRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, newEnableAttributeRelevanceAdvisorySwitch, newEnableAttributeRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeRelevanceAdvisorySwitchType getDisableAttributeRelevanceAdvisorySwitch() {
		return disableAttributeRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableAttributeRelevanceAdvisorySwitch(DisableAttributeRelevanceAdvisorySwitchType newDisableAttributeRelevanceAdvisorySwitch, NotificationChain msgs) {
		DisableAttributeRelevanceAdvisorySwitchType oldDisableAttributeRelevanceAdvisorySwitch = disableAttributeRelevanceAdvisorySwitch;
		disableAttributeRelevanceAdvisorySwitch = newDisableAttributeRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, oldDisableAttributeRelevanceAdvisorySwitch, newDisableAttributeRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableAttributeRelevanceAdvisorySwitch(DisableAttributeRelevanceAdvisorySwitchType newDisableAttributeRelevanceAdvisorySwitch) {
		if (newDisableAttributeRelevanceAdvisorySwitch != disableAttributeRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (disableAttributeRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)disableAttributeRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newDisableAttributeRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newDisableAttributeRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetDisableAttributeRelevanceAdvisorySwitch(newDisableAttributeRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH, newDisableAttributeRelevanceAdvisorySwitch, newDisableAttributeRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableAttributeScopeAdvisorySwitchType getEnableAttributeScopeAdvisorySwitch() {
		return enableAttributeScopeAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableAttributeScopeAdvisorySwitch(EnableAttributeScopeAdvisorySwitchType newEnableAttributeScopeAdvisorySwitch, NotificationChain msgs) {
		EnableAttributeScopeAdvisorySwitchType oldEnableAttributeScopeAdvisorySwitch = enableAttributeScopeAdvisorySwitch;
		enableAttributeScopeAdvisorySwitch = newEnableAttributeScopeAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, oldEnableAttributeScopeAdvisorySwitch, newEnableAttributeScopeAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableAttributeScopeAdvisorySwitch(EnableAttributeScopeAdvisorySwitchType newEnableAttributeScopeAdvisorySwitch) {
		if (newEnableAttributeScopeAdvisorySwitch != enableAttributeScopeAdvisorySwitch) {
			NotificationChain msgs = null;
			if (enableAttributeScopeAdvisorySwitch != null)
				msgs = ((InternalEObject)enableAttributeScopeAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, null, msgs);
			if (newEnableAttributeScopeAdvisorySwitch != null)
				msgs = ((InternalEObject)newEnableAttributeScopeAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetEnableAttributeScopeAdvisorySwitch(newEnableAttributeScopeAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, newEnableAttributeScopeAdvisorySwitch, newEnableAttributeScopeAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableAttributeScopeAdvisorySwitchType getDisableAttributeScopeAdvisorySwitch() {
		return disableAttributeScopeAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableAttributeScopeAdvisorySwitch(DisableAttributeScopeAdvisorySwitchType newDisableAttributeScopeAdvisorySwitch, NotificationChain msgs) {
		DisableAttributeScopeAdvisorySwitchType oldDisableAttributeScopeAdvisorySwitch = disableAttributeScopeAdvisorySwitch;
		disableAttributeScopeAdvisorySwitch = newDisableAttributeScopeAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, oldDisableAttributeScopeAdvisorySwitch, newDisableAttributeScopeAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableAttributeScopeAdvisorySwitch(DisableAttributeScopeAdvisorySwitchType newDisableAttributeScopeAdvisorySwitch) {
		if (newDisableAttributeScopeAdvisorySwitch != disableAttributeScopeAdvisorySwitch) {
			NotificationChain msgs = null;
			if (disableAttributeScopeAdvisorySwitch != null)
				msgs = ((InternalEObject)disableAttributeScopeAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, null, msgs);
			if (newDisableAttributeScopeAdvisorySwitch != null)
				msgs = ((InternalEObject)newDisableAttributeScopeAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetDisableAttributeScopeAdvisorySwitch(newDisableAttributeScopeAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH, newDisableAttributeScopeAdvisorySwitch, newDisableAttributeScopeAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableInteractionRelevanceAdvisorySwitchType getEnableInteractionRelevanceAdvisorySwitch() {
		return enableInteractionRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableInteractionRelevanceAdvisorySwitch(EnableInteractionRelevanceAdvisorySwitchType newEnableInteractionRelevanceAdvisorySwitch, NotificationChain msgs) {
		EnableInteractionRelevanceAdvisorySwitchType oldEnableInteractionRelevanceAdvisorySwitch = enableInteractionRelevanceAdvisorySwitch;
		enableInteractionRelevanceAdvisorySwitch = newEnableInteractionRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, oldEnableInteractionRelevanceAdvisorySwitch, newEnableInteractionRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableInteractionRelevanceAdvisorySwitch(EnableInteractionRelevanceAdvisorySwitchType newEnableInteractionRelevanceAdvisorySwitch) {
		if (newEnableInteractionRelevanceAdvisorySwitch != enableInteractionRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (enableInteractionRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)enableInteractionRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newEnableInteractionRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newEnableInteractionRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetEnableInteractionRelevanceAdvisorySwitch(newEnableInteractionRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, newEnableInteractionRelevanceAdvisorySwitch, newEnableInteractionRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableInteractionRelevanceAdvisorySwitchType getDisableInteractionRelevanceAdvisorySwitch() {
		return disableInteractionRelevanceAdvisorySwitch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableInteractionRelevanceAdvisorySwitch(DisableInteractionRelevanceAdvisorySwitchType newDisableInteractionRelevanceAdvisorySwitch, NotificationChain msgs) {
		DisableInteractionRelevanceAdvisorySwitchType oldDisableInteractionRelevanceAdvisorySwitch = disableInteractionRelevanceAdvisorySwitch;
		disableInteractionRelevanceAdvisorySwitch = newDisableInteractionRelevanceAdvisorySwitch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, oldDisableInteractionRelevanceAdvisorySwitch, newDisableInteractionRelevanceAdvisorySwitch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableInteractionRelevanceAdvisorySwitch(DisableInteractionRelevanceAdvisorySwitchType newDisableInteractionRelevanceAdvisorySwitch) {
		if (newDisableInteractionRelevanceAdvisorySwitch != disableInteractionRelevanceAdvisorySwitch) {
			NotificationChain msgs = null;
			if (disableInteractionRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)disableInteractionRelevanceAdvisorySwitch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			if (newDisableInteractionRelevanceAdvisorySwitch != null)
				msgs = ((InternalEObject)newDisableInteractionRelevanceAdvisorySwitch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, null, msgs);
			msgs = basicSetDisableInteractionRelevanceAdvisorySwitch(newDisableInteractionRelevanceAdvisorySwitch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH, newDisableInteractionRelevanceAdvisorySwitch, newDisableInteractionRelevanceAdvisorySwitch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeCallbackType getEvokeCallback() {
		return evokeCallback;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvokeCallback(EvokeCallbackType newEvokeCallback, NotificationChain msgs) {
		EvokeCallbackType oldEvokeCallback = evokeCallback;
		evokeCallback = newEvokeCallback;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK, oldEvokeCallback, newEvokeCallback);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvokeCallback(EvokeCallbackType newEvokeCallback) {
		if (newEvokeCallback != evokeCallback) {
			NotificationChain msgs = null;
			if (evokeCallback != null)
				msgs = ((InternalEObject)evokeCallback).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK, null, msgs);
			if (newEvokeCallback != null)
				msgs = ((InternalEObject)newEvokeCallback).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK, null, msgs);
			msgs = basicSetEvokeCallback(newEvokeCallback, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK, newEvokeCallback, newEvokeCallback));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EvokeMultipleCallbacksType getEvokeMultipleCallbacks() {
		return evokeMultipleCallbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEvokeMultipleCallbacks(EvokeMultipleCallbacksType newEvokeMultipleCallbacks, NotificationChain msgs) {
		EvokeMultipleCallbacksType oldEvokeMultipleCallbacks = evokeMultipleCallbacks;
		evokeMultipleCallbacks = newEvokeMultipleCallbacks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS, oldEvokeMultipleCallbacks, newEvokeMultipleCallbacks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEvokeMultipleCallbacks(EvokeMultipleCallbacksType newEvokeMultipleCallbacks) {
		if (newEvokeMultipleCallbacks != evokeMultipleCallbacks) {
			NotificationChain msgs = null;
			if (evokeMultipleCallbacks != null)
				msgs = ((InternalEObject)evokeMultipleCallbacks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS, null, msgs);
			if (newEvokeMultipleCallbacks != null)
				msgs = ((InternalEObject)newEvokeMultipleCallbacks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS, null, msgs);
			msgs = basicSetEvokeMultipleCallbacks(newEvokeMultipleCallbacks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS, newEvokeMultipleCallbacks, newEvokeMultipleCallbacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnableCallbacksType getEnableCallbacks() {
		return enableCallbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnableCallbacks(EnableCallbacksType newEnableCallbacks, NotificationChain msgs) {
		EnableCallbacksType oldEnableCallbacks = enableCallbacks;
		enableCallbacks = newEnableCallbacks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS, oldEnableCallbacks, newEnableCallbacks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnableCallbacks(EnableCallbacksType newEnableCallbacks) {
		if (newEnableCallbacks != enableCallbacks) {
			NotificationChain msgs = null;
			if (enableCallbacks != null)
				msgs = ((InternalEObject)enableCallbacks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS, null, msgs);
			if (newEnableCallbacks != null)
				msgs = ((InternalEObject)newEnableCallbacks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS, null, msgs);
			msgs = basicSetEnableCallbacks(newEnableCallbacks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS, newEnableCallbacks, newEnableCallbacks));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DisableCallbacksType getDisableCallbacks() {
		return disableCallbacks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDisableCallbacks(DisableCallbacksType newDisableCallbacks, NotificationChain msgs) {
		DisableCallbacksType oldDisableCallbacks = disableCallbacks;
		disableCallbacks = newDisableCallbacks;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS, oldDisableCallbacks, newDisableCallbacks);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDisableCallbacks(DisableCallbacksType newDisableCallbacks) {
		if (newDisableCallbacks != disableCallbacks) {
			NotificationChain msgs = null;
			if (disableCallbacks != null)
				msgs = ((InternalEObject)disableCallbacks).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS, null, msgs);
			if (newDisableCallbacks != null)
				msgs = ((InternalEObject)newDisableCallbacks).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS, null, msgs);
			msgs = basicSetDisableCallbacks(newDisableCallbacks, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS, newDisableCallbacks, newDisableCallbacks));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG, oldIdtag, idtag));
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
			eNotify(new ENotificationImpl(this, Notification.SET, _2010Package.SERVICE_UTILIZATION_TYPE__NOTES, oldNotes, notes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getAnyAttribute() {
		if (anyAttribute == null) {
			anyAttribute = new BasicFeatureMap(this, _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE);
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
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
				return basicSetConnect(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
				return basicSetDisconnect(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
				return basicSetConnectionLost(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
				return basicSetCreateFederationExecution(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
				return basicSetDestroyFederationExecution(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
				return basicSetListFederationExecutions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
				return basicSetReportFederationExecutions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
				return basicSetJoinFederationExecution(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
				return basicSetResignFederationExecution(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
				return basicSetRegisterFederationSynchronizationPoint(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
				return basicSetConfirmSynchronizationPointRegistration(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
				return basicSetAnnounceSynchronizationPoint(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
				return basicSetSynchronizationPointAchieved(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
				return basicSetFederationSynchronized(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
				return basicSetRequestFederationSave(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
				return basicSetInitiateFederateSave(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
				return basicSetFederateSaveBegun(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
				return basicSetFederateSaveComplete(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
				return basicSetFederationSaved(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
				return basicSetAbortFederationSave(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
				return basicSetQueryFederationSaveStatus(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
				return basicSetFederationSaveStatusResponse(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
				return basicSetRequestFederationRestore(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
				return basicSetConfirmFederationRestorationRequest(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
				return basicSetFederationRestoreBegun(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
				return basicSetInitiateFederateRestore(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
				return basicSetFederateRestoreComplete(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
				return basicSetFederationRestored(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
				return basicSetAbortFederationRestore(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
				return basicSetQueryFederationRestoreStatus(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
				return basicSetFederationRestoreStatusResponse(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return basicSetPublishObjectClassAttributes(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return basicSetUnpublishObjectClassAttributes(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
				return basicSetPublishInteractionClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
				return basicSetUnpublishInteractionClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return basicSetSubscribeObjectClassAttributes(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return basicSetUnsubscribeObjectClassAttributes(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
				return basicSetSubscribeInteractionClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
				return basicSetUnsubscribeInteractionClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
				return basicSetStartRegistrationForObjectClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
				return basicSetStopRegistrationForObjectClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
				return basicSetTurnInteractionsOn(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
				return basicSetTurnInteractionsOff(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
				return basicSetReserveObjectInstanceName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
				return basicSetObjectInstanceNameReserved(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
				return basicSetReleaseObjectInstanceName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return basicSetReserveMultipleObjectInstanceNames(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
				return basicSetMultipleObjectInstanceNamesReserved(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return basicSetReleaseMultipleObjectInstanceNames(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
				return basicSetRegisterObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
				return basicSetDiscoverObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
				return basicSetUpdateAttributeValues(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
				return basicSetReflectAttributeValues(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
				return basicSetSendInteraction(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
				return basicSetReceiveInteraction(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
				return basicSetDeleteObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
				return basicSetRemoveobjectinstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
				return basicSetLocalDeleteObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
				return basicSetAttributesInScope(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
				return basicSetAttributesOutOfScope(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
				return basicSetRequestAttributeValueUpdate(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
				return basicSetProvideAttributeValueUpdate(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
				return basicSetTurnUpdatesOnForObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
				return basicSetTurnUpdatesOffForObjectInstance(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return basicSetRequestAttributeTransportationTypeChange(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return basicSetConfirmAttributeTransportationTypeChange(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
				return basicSetQueryAttributeTransportationType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
				return basicSetReportAttributeTransportationType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return basicSetRequestInteractionTransportationTypeChange(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return basicSetConfirmInteractionTransportationTypeChange(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
				return basicSetQueryInteractionTransportationType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
				return basicSetReportInteractionTransportationType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return basicSetUnconditionalAttributeOwnershipDivestiture(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return basicSetNegotiatedAttributeOwnershipDivestiture(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
				return basicSetRequestAttributeOwnershipAssumption(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
				return basicSetRequestDivestitureConfirmation(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
				return basicSetConfirmDivestiture(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
				return basicSetAttributeOwnershipAcquisitionNotification(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return basicSetAttributeOwnershipAcquisition(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
				return basicSetAttributeOwnershipAcquisitionIfAvailable(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
				return basicSetAttributeOwnershipUnavailable(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
				return basicSetRequestAttributeOwnershipRelease(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
				return basicSetAttributeOwnershipReleaseDenied(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
				return basicSetAttributeOwnershipDivestitureIfWanted(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return basicSetCancelNegotiatedAttributeOwnershipDivestiture(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return basicSetCancelAttributeOwnershipAcquisition(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
				return basicSetConfirmAttributeOwnershipAcquisitionCancellation(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
				return basicSetQueryAttributeOwnership(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
				return basicSetInformAttributeOwnership(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
				return basicSetIsAttributeOwnedByFederate(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
				return basicSetEnableTimeRegulation(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
				return basicSetTimeRegulationEnabled(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
				return basicSetDisableTimeRegulation(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
				return basicSetEnableTimeConstrained(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
				return basicSetTimeConstrainedEnabled(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
				return basicSetDisableTimeConstrained(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
				return basicSetTimeAdvanceRequest(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
				return basicSetTimeAdvanceRequestAvailable(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
				return basicSetNextMessageRequest(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
				return basicSetNextMessageRequestAvailable(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
				return basicSetFlushQueueRequest(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
				return basicSetTimeAdvanceGrant(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
				return basicSetEnableAsynchronousDelivery(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
				return basicSetDisableAsynchronousDelivery(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
				return basicSetQueryGALT(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
				return basicSetQueryLogicalTime(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
				return basicSetQueryLITS(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
				return basicSetModifyLookahead(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
				return basicSetQueryLookahead(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
				return basicSetRetract(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
				return basicSetRequestRetraction(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
				return basicSetChangeAttributeOrderType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
				return basicSetChangeInteractionOrderType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
				return basicSetCreateRegion(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
				return basicSetCommitRegionModifications(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
				return basicSetDeleteRegion(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
				return basicSetRegisterObjectInstanceWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
				return basicSetAssociateRegionsForUpdates(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
				return basicSetUnassociateRegionsForUpdates(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return basicSetSubscribeObjectClassAttributesWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return basicSetUnsubscribeObjectClassAttributesWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return basicSetSubscribeInteractionClassWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return basicSetUnsubscribeInteractionClassWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
				return basicSetSendInteractionWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
				return basicSetRequestAttributeValueUpdateWithRegions(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
				return basicSetGetAutomaticResignDirective(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
				return basicSetSetAutomaticResignDirective(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
				return basicSetGetFederateHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
				return basicSetGetFederateName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
				return basicSetGetObjectClassHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
				return basicSetGetObjectClassName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
				return basicSetGetKnownObjectClassHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
				return basicSetGetObjectInstanceHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
				return basicSetGetObjectInstanceName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
				return basicSetGetAttributeHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
				return basicSetGetAttributeName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
				return basicSetGetUpdateRateValue(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
				return basicSetGetUpdateRateValueForAttribute(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
				return basicSetGetInteractionClassHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
				return basicSetGetInteractionClassName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
				return basicSetGetParameterHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
				return basicSetGetParameterName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
				return basicSetGetOrderType(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
				return basicSetGetOrderName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
				return basicSetGetTransportationTypeHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
				return basicSetGetTransportationTypeName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
				return basicSetGetAvailableDimensionsForClassAttribute(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
				return basicSetGetAvailableDimensionsForInteractionClass(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
				return basicSetGetDimensionHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
				return basicSetGetDimensionName(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
				return basicSetGetDimensionUpperBound(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
				return basicSetGetDimensionHandleSet(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
				return basicSetGetRangeBounds(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
				return basicSetSetRangeBounds(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
				return basicSetNormalizeFederateHandle(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
				return basicSetNormalizeServiceGroup(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return basicSetEnableObjectClassRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return basicSetDisableObjectClassRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return basicSetEnableAttributeRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return basicSetDisableAttributeRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return basicSetEnableAttributeScopeAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return basicSetDisableAttributeScopeAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return basicSetEnableInteractionRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return basicSetDisableInteractionRelevanceAdvisorySwitch(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
				return basicSetEvokeCallback(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
				return basicSetEvokeMultipleCallbacks(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
				return basicSetEnableCallbacks(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
				return basicSetDisableCallbacks(null, msgs);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
				return getConnect();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
				return getDisconnect();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
				return getConnectionLost();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
				return getCreateFederationExecution();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
				return getDestroyFederationExecution();
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
				return getListFederationExecutions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
				return getReportFederationExecutions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
				return getJoinFederationExecution();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
				return getResignFederationExecution();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
				return getRegisterFederationSynchronizationPoint();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
				return getConfirmSynchronizationPointRegistration();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
				return getAnnounceSynchronizationPoint();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
				return getSynchronizationPointAchieved();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
				return getFederationSynchronized();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
				return getRequestFederationSave();
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
				return getInitiateFederateSave();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
				return getFederateSaveBegun();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
				return getFederateSaveComplete();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
				return getFederationSaved();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
				return getAbortFederationSave();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
				return getQueryFederationSaveStatus();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
				return getFederationSaveStatusResponse();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
				return getRequestFederationRestore();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
				return getConfirmFederationRestorationRequest();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
				return getFederationRestoreBegun();
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
				return getInitiateFederateRestore();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
				return getFederateRestoreComplete();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
				return getFederationRestored();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
				return getAbortFederationRestore();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
				return getQueryFederationRestoreStatus();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
				return getFederationRestoreStatusResponse();
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return getPublishObjectClassAttributes();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return getUnpublishObjectClassAttributes();
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
				return getPublishInteractionClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
				return getUnpublishInteractionClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return getSubscribeObjectClassAttributes();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return getUnsubscribeObjectClassAttributes();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
				return getSubscribeInteractionClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
				return getUnsubscribeInteractionClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
				return getStartRegistrationForObjectClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
				return getStopRegistrationForObjectClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
				return getTurnInteractionsOn();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
				return getTurnInteractionsOff();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
				return getReserveObjectInstanceName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
				return getObjectInstanceNameReserved();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
				return getReleaseObjectInstanceName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return getReserveMultipleObjectInstanceNames();
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
				return getMultipleObjectInstanceNamesReserved();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return getReleaseMultipleObjectInstanceNames();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
				return getRegisterObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
				return getDiscoverObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
				return getUpdateAttributeValues();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
				return getReflectAttributeValues();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
				return getSendInteraction();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
				return getReceiveInteraction();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
				return getDeleteObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
				return getRemoveobjectinstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
				return getLocalDeleteObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
				return getAttributesInScope();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
				return getAttributesOutOfScope();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
				return getRequestAttributeValueUpdate();
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
				return getProvideAttributeValueUpdate();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
				return getTurnUpdatesOnForObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
				return getTurnUpdatesOffForObjectInstance();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return getRequestAttributeTransportationTypeChange();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return getConfirmAttributeTransportationTypeChange();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
				return getQueryAttributeTransportationType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
				return getReportAttributeTransportationType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return getRequestInteractionTransportationTypeChange();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return getConfirmInteractionTransportationTypeChange();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
				return getQueryInteractionTransportationType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
				return getReportInteractionTransportationType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return getUnconditionalAttributeOwnershipDivestiture();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return getNegotiatedAttributeOwnershipDivestiture();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
				return getRequestAttributeOwnershipAssumption();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
				return getRequestDivestitureConfirmation();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
				return getConfirmDivestiture();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
				return getAttributeOwnershipAcquisitionNotification();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return getAttributeOwnershipAcquisition();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
				return getAttributeOwnershipAcquisitionIfAvailable();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
				return getAttributeOwnershipUnavailable();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
				return getRequestAttributeOwnershipRelease();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
				return getAttributeOwnershipReleaseDenied();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
				return getAttributeOwnershipDivestitureIfWanted();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return getCancelNegotiatedAttributeOwnershipDivestiture();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return getCancelAttributeOwnershipAcquisition();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
				return getConfirmAttributeOwnershipAcquisitionCancellation();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
				return getQueryAttributeOwnership();
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
				return getInformAttributeOwnership();
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
				return getIsAttributeOwnedByFederate();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
				return getEnableTimeRegulation();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
				return getTimeRegulationEnabled();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
				return getDisableTimeRegulation();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
				return getEnableTimeConstrained();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
				return getTimeConstrainedEnabled();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
				return getDisableTimeConstrained();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
				return getTimeAdvanceRequest();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
				return getTimeAdvanceRequestAvailable();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
				return getNextMessageRequest();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
				return getNextMessageRequestAvailable();
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
				return getFlushQueueRequest();
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
				return getTimeAdvanceGrant();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
				return getEnableAsynchronousDelivery();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
				return getDisableAsynchronousDelivery();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
				return getQueryGALT();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
				return getQueryLogicalTime();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
				return getQueryLITS();
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
				return getModifyLookahead();
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
				return getQueryLookahead();
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
				return getRetract();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
				return getRequestRetraction();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
				return getChangeAttributeOrderType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
				return getChangeInteractionOrderType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
				return getCreateRegion();
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
				return getCommitRegionModifications();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
				return getDeleteRegion();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
				return getRegisterObjectInstanceWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
				return getAssociateRegionsForUpdates();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
				return getUnassociateRegionsForUpdates();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return getSubscribeObjectClassAttributesWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return getUnsubscribeObjectClassAttributesWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return getSubscribeInteractionClassWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return getUnsubscribeInteractionClassWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
				return getSendInteractionWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
				return getRequestAttributeValueUpdateWithRegions();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
				return getGetAutomaticResignDirective();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
				return getSetAutomaticResignDirective();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
				return getGetFederateHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
				return getGetFederateName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
				return getGetObjectClassHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
				return getGetObjectClassName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
				return getGetKnownObjectClassHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
				return getGetObjectInstanceHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
				return getGetObjectInstanceName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
				return getGetAttributeHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
				return getGetAttributeName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
				return getGetUpdateRateValue();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
				return getGetUpdateRateValueForAttribute();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
				return getGetInteractionClassHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
				return getGetInteractionClassName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
				return getGetParameterHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
				return getGetParameterName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
				return getGetOrderType();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
				return getGetOrderName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
				return getGetTransportationTypeHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
				return getGetTransportationTypeName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
				return getGetAvailableDimensionsForClassAttribute();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
				return getGetAvailableDimensionsForInteractionClass();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
				return getGetDimensionHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
				return getGetDimensionName();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
				return getGetDimensionUpperBound();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
				return getGetDimensionHandleSet();
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
				return getGetRangeBounds();
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
				return getSetRangeBounds();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
				return getNormalizeFederateHandle();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
				return getNormalizeServiceGroup();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return getEnableObjectClassRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return getDisableObjectClassRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return getEnableAttributeRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return getDisableAttributeRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return getEnableAttributeScopeAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return getDisableAttributeScopeAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return getEnableInteractionRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return getDisableInteractionRelevanceAdvisorySwitch();
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
				return getEvokeCallback();
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
				return getEvokeMultipleCallbacks();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
				return getEnableCallbacks();
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
				return getDisableCallbacks();
			case _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG:
				return getIdtag();
			case _2010Package.SERVICE_UTILIZATION_TYPE__NOTES:
				return getNotes();
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
				setConnect((ConnectType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
				setDisconnect((DisconnectType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
				setConnectionLost((ConnectionLostType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
				setCreateFederationExecution((CreateFederationExecutionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
				setDestroyFederationExecution((DestroyFederationExecutionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
				setListFederationExecutions((ListFederationExecutionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
				setReportFederationExecutions((ReportFederationExecutionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
				setJoinFederationExecution((JoinFederationExecutionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
				setResignFederationExecution((ResignFederationExecutionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
				setRegisterFederationSynchronizationPoint((RegisterFederationSynchronizationPointType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
				setConfirmSynchronizationPointRegistration((ConfirmSynchronizationPointRegistrationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
				setAnnounceSynchronizationPoint((AnnounceSynchronizationPointType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
				setSynchronizationPointAchieved((SynchronizationPointAchievedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
				setFederationSynchronized((FederationSynchronizedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
				setRequestFederationSave((RequestFederationSaveType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
				setInitiateFederateSave((InitiateFederateSaveType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
				setFederateSaveBegun((FederateSaveBegunType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
				setFederateSaveComplete((FederateSaveCompleteType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
				setFederationSaved((FederationSavedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
				setAbortFederationSave((AbortFederationSaveType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
				setQueryFederationSaveStatus((QueryFederationSaveStatusType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
				setFederationSaveStatusResponse((FederationSaveStatusResponseType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
				setRequestFederationRestore((RequestFederationRestoreType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
				setConfirmFederationRestorationRequest((ConfirmFederationRestorationRequestType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
				setFederationRestoreBegun((FederationRestoreBegunType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
				setInitiateFederateRestore((InitiateFederateRestoreType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
				setFederateRestoreComplete((FederateRestoreCompleteType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
				setFederationRestored((FederationRestoredType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
				setAbortFederationRestore((AbortFederationRestoreType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
				setQueryFederationRestoreStatus((QueryFederationRestoreStatusType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
				setFederationRestoreStatusResponse((FederationRestoreStatusResponseType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
				setPublishObjectClassAttributes((PublishObjectClassAttributesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
				setUnpublishObjectClassAttributes((UnpublishObjectClassAttributesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
				setPublishInteractionClass((PublishInteractionClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
				setUnpublishInteractionClass((UnpublishInteractionClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				setSubscribeObjectClassAttributes((SubscribeObjectClassAttributesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				setUnsubscribeObjectClassAttributes((UnsubscribeObjectClassAttributesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
				setSubscribeInteractionClass((SubscribeInteractionClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
				setUnsubscribeInteractionClass((UnsubscribeInteractionClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
				setStartRegistrationForObjectClass((StartRegistrationForObjectClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
				setStopRegistrationForObjectClass((StopRegistrationForObjectClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
				setTurnInteractionsOn((TurnInteractionsOnType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
				setTurnInteractionsOff((TurnInteractionsOffType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
				setReserveObjectInstanceName((ReserveObjectInstanceNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
				setObjectInstanceNameReserved((ObjectInstanceNameReservedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
				setReleaseObjectInstanceName((ReleaseObjectInstanceNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				setReserveMultipleObjectInstanceNames((ReserveMultipleObjectInstanceNamesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
				setMultipleObjectInstanceNamesReserved((MultipleObjectInstanceNamesReservedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				setReleaseMultipleObjectInstanceNames((ReleaseMultipleObjectInstanceNamesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
				setRegisterObjectInstance((RegisterObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
				setDiscoverObjectInstance((DiscoverObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
				setUpdateAttributeValues((UpdateAttributeValuesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
				setReflectAttributeValues((ReflectAttributeValuesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
				setSendInteraction((SendInteractionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
				setReceiveInteraction((ReceiveInteractionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
				setDeleteObjectInstance((DeleteObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
				setRemoveobjectinstance((RemoveobjectinstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
				setLocalDeleteObjectInstance((LocalDeleteObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
				setAttributesInScope((AttributesInScopeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
				setAttributesOutOfScope((AttributesOutOfScopeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
				setRequestAttributeValueUpdate((RequestAttributeValueUpdateType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
				setProvideAttributeValueUpdate((ProvideAttributeValueUpdateType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
				setTurnUpdatesOnForObjectInstance((TurnUpdatesOnForObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
				setTurnUpdatesOffForObjectInstance((TurnUpdatesOffForObjectInstanceType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				setRequestAttributeTransportationTypeChange((RequestAttributeTransportationTypeChangeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				setConfirmAttributeTransportationTypeChange((ConfirmAttributeTransportationTypeChangeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
				setQueryAttributeTransportationType((QueryAttributeTransportationTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
				setReportAttributeTransportationType((ReportAttributeTransportationTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				setRequestInteractionTransportationTypeChange((RequestInteractionTransportationTypeChangeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				setConfirmInteractionTransportationTypeChange((ConfirmInteractionTransportationTypeChangeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
				setQueryInteractionTransportationType((QueryInteractionTransportationTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
				setReportInteractionTransportationType((ReportInteractionTransportationTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setUnconditionalAttributeOwnershipDivestiture((UnconditionalAttributeOwnershipDivestitureType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setNegotiatedAttributeOwnershipDivestiture((NegotiatedAttributeOwnershipDivestitureType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
				setRequestAttributeOwnershipAssumption((RequestAttributeOwnershipAssumptionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
				setRequestDivestitureConfirmation((RequestDivestitureConfirmationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
				setConfirmDivestiture((ConfirmDivestitureType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
				setAttributeOwnershipAcquisitionNotification((AttributeOwnershipAcquisitionNotificationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
				setAttributeOwnershipAcquisition((AttributeOwnershipAcquisitionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
				setAttributeOwnershipAcquisitionIfAvailable((AttributeOwnershipAcquisitionIfAvailableType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
				setAttributeOwnershipUnavailable((AttributeOwnershipUnavailableType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
				setRequestAttributeOwnershipRelease((RequestAttributeOwnershipReleaseType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
				setAttributeOwnershipReleaseDenied((AttributeOwnershipReleaseDeniedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
				setAttributeOwnershipDivestitureIfWanted((AttributeOwnershipDivestitureIfWantedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setCancelNegotiatedAttributeOwnershipDivestiture((CancelNegotiatedAttributeOwnershipDivestitureType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
				setCancelAttributeOwnershipAcquisition((CancelAttributeOwnershipAcquisitionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
				setConfirmAttributeOwnershipAcquisitionCancellation((ConfirmAttributeOwnershipAcquisitionCancellationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
				setQueryAttributeOwnership((QueryAttributeOwnershipType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
				setInformAttributeOwnership((InformAttributeOwnershipType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
				setIsAttributeOwnedByFederate((IsAttributeOwnedByFederateType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
				setEnableTimeRegulation((EnableTimeRegulationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
				setTimeRegulationEnabled((TimeRegulationEnabledType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
				setDisableTimeRegulation((DisableTimeRegulationType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
				setEnableTimeConstrained((EnableTimeConstrainedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
				setTimeConstrainedEnabled((TimeConstrainedEnabledType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
				setDisableTimeConstrained((DisableTimeConstrainedType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
				setTimeAdvanceRequest((TimeAdvanceRequestType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
				setTimeAdvanceRequestAvailable((TimeAdvanceRequestAvailableType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
				setNextMessageRequest((NextMessageRequestType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
				setNextMessageRequestAvailable((NextMessageRequestAvailableType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
				setFlushQueueRequest((FlushQueueRequestType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
				setTimeAdvanceGrant((TimeAdvanceGrantType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
				setEnableAsynchronousDelivery((EnableAsynchronousDeliveryType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
				setDisableAsynchronousDelivery((DisableAsynchronousDeliveryType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
				setQueryGALT((QueryGALTType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
				setQueryLogicalTime((QueryLogicalTimeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
				setQueryLITS((QueryLITSType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
				setModifyLookahead((ModifyLookaheadType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
				setQueryLookahead((QueryLookaheadType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
				setRetract((RetractType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
				setRequestRetraction((RequestRetractionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
				setChangeAttributeOrderType((ChangeAttributeOrderTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
				setChangeInteractionOrderType((ChangeInteractionOrderTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
				setCreateRegion((CreateRegionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
				setCommitRegionModifications((CommitRegionModificationsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
				setDeleteRegion((DeleteRegionType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
				setRegisterObjectInstanceWithRegions((RegisterObjectInstanceWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
				setAssociateRegionsForUpdates((AssociateRegionsForUpdatesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
				setUnassociateRegionsForUpdates((UnassociateRegionsForUpdatesType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				setSubscribeObjectClassAttributesWithRegions((SubscribeObjectClassAttributesWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				setUnsubscribeObjectClassAttributesWithRegions((UnsubscribeObjectClassAttributesWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				setSubscribeInteractionClassWithRegions((SubscribeInteractionClassWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				setUnsubscribeInteractionClassWithRegions((UnsubscribeInteractionClassWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
				setSendInteractionWithRegions((SendInteractionWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
				setRequestAttributeValueUpdateWithRegions((RequestAttributeValueUpdateWithRegionsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
				setGetAutomaticResignDirective((GetAutomaticResignDirectiveType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
				setSetAutomaticResignDirective((SetAutomaticResignDirectiveType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
				setGetFederateHandle((GetFederateHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
				setGetFederateName((GetFederateNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
				setGetObjectClassHandle((GetObjectClassHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
				setGetObjectClassName((GetObjectClassNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
				setGetKnownObjectClassHandle((GetKnownObjectClassHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
				setGetObjectInstanceHandle((GetObjectInstanceHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
				setGetObjectInstanceName((GetObjectInstanceNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
				setGetAttributeHandle((GetAttributeHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
				setGetAttributeName((GetAttributeNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
				setGetUpdateRateValue((GetUpdateRateValueType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
				setGetUpdateRateValueForAttribute((GetUpdateRateValueForAttributeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
				setGetInteractionClassHandle((GetInteractionClassHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
				setGetInteractionClassName((GetInteractionClassNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
				setGetParameterHandle((GetParameterHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
				setGetParameterName((GetParameterNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
				setGetOrderType((GetOrderTypeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
				setGetOrderName((GetOrderNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
				setGetTransportationTypeHandle((GetTransportationTypeHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
				setGetTransportationTypeName((GetTransportationTypeNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
				setGetAvailableDimensionsForClassAttribute((GetAvailableDimensionsForClassAttributeType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
				setGetAvailableDimensionsForInteractionClass((GetAvailableDimensionsForInteractionClassType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
				setGetDimensionHandle((GetDimensionHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
				setGetDimensionName((GetDimensionNameType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
				setGetDimensionUpperBound((GetDimensionUpperBoundType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
				setGetDimensionHandleSet((GetDimensionHandleSetType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
				setGetRangeBounds((GetRangeBoundsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
				setSetRangeBounds((SetRangeBoundsType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
				setNormalizeFederateHandle((NormalizeFederateHandleType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
				setNormalizeServiceGroup((NormalizeServiceGroupType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				setEnableObjectClassRelevanceAdvisorySwitch((EnableObjectClassRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				setDisableObjectClassRelevanceAdvisorySwitch((DisableObjectClassRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				setEnableAttributeRelevanceAdvisorySwitch((EnableAttributeRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				setDisableAttributeRelevanceAdvisorySwitch((DisableAttributeRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				setEnableAttributeScopeAdvisorySwitch((EnableAttributeScopeAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				setDisableAttributeScopeAdvisorySwitch((DisableAttributeScopeAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				setEnableInteractionRelevanceAdvisorySwitch((EnableInteractionRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				setDisableInteractionRelevanceAdvisorySwitch((DisableInteractionRelevanceAdvisorySwitchType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
				setEvokeCallback((EvokeCallbackType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
				setEvokeMultipleCallbacks((EvokeMultipleCallbacksType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
				setEnableCallbacks((EnableCallbacksType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
				setDisableCallbacks((DisableCallbacksType)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG:
				setIdtag((String)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NOTES:
				setNotes((List<String>)newValue);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
				setConnect((ConnectType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
				setDisconnect((DisconnectType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
				setConnectionLost((ConnectionLostType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
				setCreateFederationExecution((CreateFederationExecutionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
				setDestroyFederationExecution((DestroyFederationExecutionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
				setListFederationExecutions((ListFederationExecutionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
				setReportFederationExecutions((ReportFederationExecutionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
				setJoinFederationExecution((JoinFederationExecutionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
				setResignFederationExecution((ResignFederationExecutionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
				setRegisterFederationSynchronizationPoint((RegisterFederationSynchronizationPointType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
				setConfirmSynchronizationPointRegistration((ConfirmSynchronizationPointRegistrationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
				setAnnounceSynchronizationPoint((AnnounceSynchronizationPointType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
				setSynchronizationPointAchieved((SynchronizationPointAchievedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
				setFederationSynchronized((FederationSynchronizedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
				setRequestFederationSave((RequestFederationSaveType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
				setInitiateFederateSave((InitiateFederateSaveType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
				setFederateSaveBegun((FederateSaveBegunType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
				setFederateSaveComplete((FederateSaveCompleteType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
				setFederationSaved((FederationSavedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
				setAbortFederationSave((AbortFederationSaveType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
				setQueryFederationSaveStatus((QueryFederationSaveStatusType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
				setFederationSaveStatusResponse((FederationSaveStatusResponseType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
				setRequestFederationRestore((RequestFederationRestoreType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
				setConfirmFederationRestorationRequest((ConfirmFederationRestorationRequestType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
				setFederationRestoreBegun((FederationRestoreBegunType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
				setInitiateFederateRestore((InitiateFederateRestoreType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
				setFederateRestoreComplete((FederateRestoreCompleteType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
				setFederationRestored((FederationRestoredType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
				setAbortFederationRestore((AbortFederationRestoreType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
				setQueryFederationRestoreStatus((QueryFederationRestoreStatusType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
				setFederationRestoreStatusResponse((FederationRestoreStatusResponseType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
				setPublishObjectClassAttributes((PublishObjectClassAttributesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
				setUnpublishObjectClassAttributes((UnpublishObjectClassAttributesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
				setPublishInteractionClass((PublishInteractionClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
				setUnpublishInteractionClass((UnpublishInteractionClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				setSubscribeObjectClassAttributes((SubscribeObjectClassAttributesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				setUnsubscribeObjectClassAttributes((UnsubscribeObjectClassAttributesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
				setSubscribeInteractionClass((SubscribeInteractionClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
				setUnsubscribeInteractionClass((UnsubscribeInteractionClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
				setStartRegistrationForObjectClass((StartRegistrationForObjectClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
				setStopRegistrationForObjectClass((StopRegistrationForObjectClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
				setTurnInteractionsOn((TurnInteractionsOnType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
				setTurnInteractionsOff((TurnInteractionsOffType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
				setReserveObjectInstanceName((ReserveObjectInstanceNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
				setObjectInstanceNameReserved((ObjectInstanceNameReservedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
				setReleaseObjectInstanceName((ReleaseObjectInstanceNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				setReserveMultipleObjectInstanceNames((ReserveMultipleObjectInstanceNamesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
				setMultipleObjectInstanceNamesReserved((MultipleObjectInstanceNamesReservedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				setReleaseMultipleObjectInstanceNames((ReleaseMultipleObjectInstanceNamesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
				setRegisterObjectInstance((RegisterObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
				setDiscoverObjectInstance((DiscoverObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
				setUpdateAttributeValues((UpdateAttributeValuesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
				setReflectAttributeValues((ReflectAttributeValuesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
				setSendInteraction((SendInteractionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
				setReceiveInteraction((ReceiveInteractionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
				setDeleteObjectInstance((DeleteObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
				setRemoveobjectinstance((RemoveobjectinstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
				setLocalDeleteObjectInstance((LocalDeleteObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
				setAttributesInScope((AttributesInScopeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
				setAttributesOutOfScope((AttributesOutOfScopeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
				setRequestAttributeValueUpdate((RequestAttributeValueUpdateType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
				setProvideAttributeValueUpdate((ProvideAttributeValueUpdateType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
				setTurnUpdatesOnForObjectInstance((TurnUpdatesOnForObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
				setTurnUpdatesOffForObjectInstance((TurnUpdatesOffForObjectInstanceType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				setRequestAttributeTransportationTypeChange((RequestAttributeTransportationTypeChangeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				setConfirmAttributeTransportationTypeChange((ConfirmAttributeTransportationTypeChangeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
				setQueryAttributeTransportationType((QueryAttributeTransportationTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
				setReportAttributeTransportationType((ReportAttributeTransportationTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				setRequestInteractionTransportationTypeChange((RequestInteractionTransportationTypeChangeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				setConfirmInteractionTransportationTypeChange((ConfirmInteractionTransportationTypeChangeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
				setQueryInteractionTransportationType((QueryInteractionTransportationTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
				setReportInteractionTransportationType((ReportInteractionTransportationTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setUnconditionalAttributeOwnershipDivestiture((UnconditionalAttributeOwnershipDivestitureType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setNegotiatedAttributeOwnershipDivestiture((NegotiatedAttributeOwnershipDivestitureType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
				setRequestAttributeOwnershipAssumption((RequestAttributeOwnershipAssumptionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
				setRequestDivestitureConfirmation((RequestDivestitureConfirmationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
				setConfirmDivestiture((ConfirmDivestitureType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
				setAttributeOwnershipAcquisitionNotification((AttributeOwnershipAcquisitionNotificationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
				setAttributeOwnershipAcquisition((AttributeOwnershipAcquisitionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
				setAttributeOwnershipAcquisitionIfAvailable((AttributeOwnershipAcquisitionIfAvailableType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
				setAttributeOwnershipUnavailable((AttributeOwnershipUnavailableType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
				setRequestAttributeOwnershipRelease((RequestAttributeOwnershipReleaseType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
				setAttributeOwnershipReleaseDenied((AttributeOwnershipReleaseDeniedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
				setAttributeOwnershipDivestitureIfWanted((AttributeOwnershipDivestitureIfWantedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				setCancelNegotiatedAttributeOwnershipDivestiture((CancelNegotiatedAttributeOwnershipDivestitureType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
				setCancelAttributeOwnershipAcquisition((CancelAttributeOwnershipAcquisitionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
				setConfirmAttributeOwnershipAcquisitionCancellation((ConfirmAttributeOwnershipAcquisitionCancellationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
				setQueryAttributeOwnership((QueryAttributeOwnershipType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
				setInformAttributeOwnership((InformAttributeOwnershipType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
				setIsAttributeOwnedByFederate((IsAttributeOwnedByFederateType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
				setEnableTimeRegulation((EnableTimeRegulationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
				setTimeRegulationEnabled((TimeRegulationEnabledType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
				setDisableTimeRegulation((DisableTimeRegulationType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
				setEnableTimeConstrained((EnableTimeConstrainedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
				setTimeConstrainedEnabled((TimeConstrainedEnabledType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
				setDisableTimeConstrained((DisableTimeConstrainedType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
				setTimeAdvanceRequest((TimeAdvanceRequestType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
				setTimeAdvanceRequestAvailable((TimeAdvanceRequestAvailableType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
				setNextMessageRequest((NextMessageRequestType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
				setNextMessageRequestAvailable((NextMessageRequestAvailableType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
				setFlushQueueRequest((FlushQueueRequestType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
				setTimeAdvanceGrant((TimeAdvanceGrantType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
				setEnableAsynchronousDelivery((EnableAsynchronousDeliveryType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
				setDisableAsynchronousDelivery((DisableAsynchronousDeliveryType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
				setQueryGALT((QueryGALTType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
				setQueryLogicalTime((QueryLogicalTimeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
				setQueryLITS((QueryLITSType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
				setModifyLookahead((ModifyLookaheadType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
				setQueryLookahead((QueryLookaheadType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
				setRetract((RetractType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
				setRequestRetraction((RequestRetractionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
				setChangeAttributeOrderType((ChangeAttributeOrderTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
				setChangeInteractionOrderType((ChangeInteractionOrderTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
				setCreateRegion((CreateRegionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
				setCommitRegionModifications((CommitRegionModificationsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
				setDeleteRegion((DeleteRegionType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
				setRegisterObjectInstanceWithRegions((RegisterObjectInstanceWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
				setAssociateRegionsForUpdates((AssociateRegionsForUpdatesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
				setUnassociateRegionsForUpdates((UnassociateRegionsForUpdatesType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				setSubscribeObjectClassAttributesWithRegions((SubscribeObjectClassAttributesWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				setUnsubscribeObjectClassAttributesWithRegions((UnsubscribeObjectClassAttributesWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				setSubscribeInteractionClassWithRegions((SubscribeInteractionClassWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				setUnsubscribeInteractionClassWithRegions((UnsubscribeInteractionClassWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
				setSendInteractionWithRegions((SendInteractionWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
				setRequestAttributeValueUpdateWithRegions((RequestAttributeValueUpdateWithRegionsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
				setGetAutomaticResignDirective((GetAutomaticResignDirectiveType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
				setSetAutomaticResignDirective((SetAutomaticResignDirectiveType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
				setGetFederateHandle((GetFederateHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
				setGetFederateName((GetFederateNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
				setGetObjectClassHandle((GetObjectClassHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
				setGetObjectClassName((GetObjectClassNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
				setGetKnownObjectClassHandle((GetKnownObjectClassHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
				setGetObjectInstanceHandle((GetObjectInstanceHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
				setGetObjectInstanceName((GetObjectInstanceNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
				setGetAttributeHandle((GetAttributeHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
				setGetAttributeName((GetAttributeNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
				setGetUpdateRateValue((GetUpdateRateValueType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
				setGetUpdateRateValueForAttribute((GetUpdateRateValueForAttributeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
				setGetInteractionClassHandle((GetInteractionClassHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
				setGetInteractionClassName((GetInteractionClassNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
				setGetParameterHandle((GetParameterHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
				setGetParameterName((GetParameterNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
				setGetOrderType((GetOrderTypeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
				setGetOrderName((GetOrderNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
				setGetTransportationTypeHandle((GetTransportationTypeHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
				setGetTransportationTypeName((GetTransportationTypeNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
				setGetAvailableDimensionsForClassAttribute((GetAvailableDimensionsForClassAttributeType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
				setGetAvailableDimensionsForInteractionClass((GetAvailableDimensionsForInteractionClassType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
				setGetDimensionHandle((GetDimensionHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
				setGetDimensionName((GetDimensionNameType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
				setGetDimensionUpperBound((GetDimensionUpperBoundType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
				setGetDimensionHandleSet((GetDimensionHandleSetType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
				setGetRangeBounds((GetRangeBoundsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
				setSetRangeBounds((SetRangeBoundsType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
				setNormalizeFederateHandle((NormalizeFederateHandleType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
				setNormalizeServiceGroup((NormalizeServiceGroupType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				setEnableObjectClassRelevanceAdvisorySwitch((EnableObjectClassRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				setDisableObjectClassRelevanceAdvisorySwitch((DisableObjectClassRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				setEnableAttributeRelevanceAdvisorySwitch((EnableAttributeRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				setDisableAttributeRelevanceAdvisorySwitch((DisableAttributeRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				setEnableAttributeScopeAdvisorySwitch((EnableAttributeScopeAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				setDisableAttributeScopeAdvisorySwitch((DisableAttributeScopeAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				setEnableInteractionRelevanceAdvisorySwitch((EnableInteractionRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				setDisableInteractionRelevanceAdvisorySwitch((DisableInteractionRelevanceAdvisorySwitchType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
				setEvokeCallback((EvokeCallbackType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
				setEvokeMultipleCallbacks((EvokeMultipleCallbacksType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
				setEnableCallbacks((EnableCallbacksType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
				setDisableCallbacks((DisableCallbacksType)null);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG:
				setIdtag(IDTAG_EDEFAULT);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NOTES:
				setNotes(NOTES_EDEFAULT);
				return;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECT:
				return connect != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCONNECT:
				return disconnect != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONNECTION_LOST:
				return connectionLost != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_FEDERATION_EXECUTION:
				return createFederationExecution != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DESTROY_FEDERATION_EXECUTION:
				return destroyFederationExecution != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LIST_FEDERATION_EXECUTIONS:
				return listFederationExecutions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_FEDERATION_EXECUTIONS:
				return reportFederationExecutions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__JOIN_FEDERATION_EXECUTION:
				return joinFederationExecution != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESIGN_FEDERATION_EXECUTION:
				return resignFederationExecution != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_FEDERATION_SYNCHRONIZATION_POINT:
				return registerFederationSynchronizationPoint != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_SYNCHRONIZATION_POINT_REGISTRATION:
				return confirmSynchronizationPointRegistration != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANNOUNCE_SYNCHRONIZATION_POINT:
				return announceSynchronizationPoint != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SYNCHRONIZATION_POINT_ACHIEVED:
				return synchronizationPointAchieved != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SYNCHRONIZED:
				return federationSynchronized != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_SAVE:
				return requestFederationSave != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_SAVE:
				return initiateFederateSave != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_BEGUN:
				return federateSaveBegun != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_SAVE_COMPLETE:
				return federateSaveComplete != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVED:
				return federationSaved != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_SAVE:
				return abortFederationSave != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_SAVE_STATUS:
				return queryFederationSaveStatus != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_SAVE_STATUS_RESPONSE:
				return federationSaveStatusResponse != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_FEDERATION_RESTORE:
				return requestFederationRestore != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_FEDERATION_RESTORATION_REQUEST:
				return confirmFederationRestorationRequest != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_BEGUN:
				return federationRestoreBegun != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INITIATE_FEDERATE_RESTORE:
				return initiateFederateRestore != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATE_RESTORE_COMPLETE:
				return federateRestoreComplete != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORED:
				return federationRestored != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ABORT_FEDERATION_RESTORE:
				return abortFederationRestore != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_FEDERATION_RESTORE_STATUS:
				return queryFederationRestoreStatus != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FEDERATION_RESTORE_STATUS_RESPONSE:
				return federationRestoreStatusResponse != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return publishObjectClassAttributes != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_OBJECT_CLASS_ATTRIBUTES:
				return unpublishObjectClassAttributes != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PUBLISH_INTERACTION_CLASS:
				return publishInteractionClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNPUBLISH_INTERACTION_CLASS:
				return unpublishInteractionClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return subscribeObjectClassAttributes != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES:
				return unsubscribeObjectClassAttributes != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS:
				return subscribeInteractionClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS:
				return unsubscribeInteractionClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__START_REGISTRATION_FOR_OBJECT_CLASS:
				return startRegistrationForObjectClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__STOP_REGISTRATION_FOR_OBJECT_CLASS:
				return stopRegistrationForObjectClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_ON:
				return turnInteractionsOn != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_INTERACTIONS_OFF:
				return turnInteractionsOff != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_OBJECT_INSTANCE_NAME:
				return reserveObjectInstanceName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__OBJECT_INSTANCE_NAME_RESERVED:
				return objectInstanceNameReserved != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_OBJECT_INSTANCE_NAME:
				return releaseObjectInstanceName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RESERVE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return reserveMultipleObjectInstanceNames != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MULTIPLE_OBJECT_INSTANCE_NAMES_RESERVED:
				return multipleObjectInstanceNamesReserved != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RELEASE_MULTIPLE_OBJECT_INSTANCE_NAMES:
				return releaseMultipleObjectInstanceNames != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE:
				return registerObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISCOVER_OBJECT_INSTANCE:
				return discoverObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UPDATE_ATTRIBUTE_VALUES:
				return updateAttributeValues != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REFLECT_ATTRIBUTE_VALUES:
				return reflectAttributeValues != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION:
				return sendInteraction != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RECEIVE_INTERACTION:
				return receiveInteraction != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_OBJECT_INSTANCE:
				return deleteObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REMOVEOBJECTINSTANCE:
				return removeobjectinstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__LOCAL_DELETE_OBJECT_INSTANCE:
				return localDeleteObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_IN_SCOPE:
				return attributesInScope != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTES_OUT_OF_SCOPE:
				return attributesOutOfScope != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE:
				return requestAttributeValueUpdate != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__PROVIDE_ATTRIBUTE_VALUE_UPDATE:
				return provideAttributeValueUpdate != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_ON_FOR_OBJECT_INSTANCE:
				return turnUpdatesOnForObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TURN_UPDATES_OFF_FOR_OBJECT_INSTANCE:
				return turnUpdatesOffForObjectInstance != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return requestAttributeTransportationTypeChange != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_TRANSPORTATION_TYPE_CHANGE:
				return confirmAttributeTransportationTypeChange != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_TRANSPORTATION_TYPE:
				return queryAttributeTransportationType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_ATTRIBUTE_TRANSPORTATION_TYPE:
				return reportAttributeTransportationType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return requestInteractionTransportationTypeChange != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_INTERACTION_TRANSPORTATION_TYPE_CHANGE:
				return confirmInteractionTransportationTypeChange != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_INTERACTION_TRANSPORTATION_TYPE:
				return queryInteractionTransportationType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REPORT_INTERACTION_TRANSPORTATION_TYPE:
				return reportInteractionTransportationType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNCONDITIONAL_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return unconditionalAttributeOwnershipDivestiture != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return negotiatedAttributeOwnershipDivestiture != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_ASSUMPTION:
				return requestAttributeOwnershipAssumption != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_DIVESTITURE_CONFIRMATION:
				return requestDivestitureConfirmation != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_DIVESTITURE:
				return confirmDivestiture != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_NOTIFICATION:
				return attributeOwnershipAcquisitionNotification != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return attributeOwnershipAcquisition != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_ACQUISITION_IF_AVAILABLE:
				return attributeOwnershipAcquisitionIfAvailable != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_UNAVAILABLE:
				return attributeOwnershipUnavailable != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_OWNERSHIP_RELEASE:
				return requestAttributeOwnershipRelease != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_RELEASE_DENIED:
				return attributeOwnershipReleaseDenied != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ATTRIBUTE_OWNERSHIP_DIVESTITURE_IF_WANTED:
				return attributeOwnershipDivestitureIfWanted != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_NEGOTIATED_ATTRIBUTE_OWNERSHIP_DIVESTITURE:
				return cancelNegotiatedAttributeOwnershipDivestiture != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CANCEL_ATTRIBUTE_OWNERSHIP_ACQUISITION:
				return cancelAttributeOwnershipAcquisition != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CONFIRM_ATTRIBUTE_OWNERSHIP_ACQUISITION_CANCELLATION:
				return confirmAttributeOwnershipAcquisitionCancellation != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_ATTRIBUTE_OWNERSHIP:
				return queryAttributeOwnership != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__INFORM_ATTRIBUTE_OWNERSHIP:
				return informAttributeOwnership != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IS_ATTRIBUTE_OWNED_BY_FEDERATE:
				return isAttributeOwnedByFederate != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_REGULATION:
				return enableTimeRegulation != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_REGULATION_ENABLED:
				return timeRegulationEnabled != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_REGULATION:
				return disableTimeRegulation != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_TIME_CONSTRAINED:
				return enableTimeConstrained != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_CONSTRAINED_ENABLED:
				return timeConstrainedEnabled != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_TIME_CONSTRAINED:
				return disableTimeConstrained != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST:
				return timeAdvanceRequest != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_REQUEST_AVAILABLE:
				return timeAdvanceRequestAvailable != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST:
				return nextMessageRequest != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NEXT_MESSAGE_REQUEST_AVAILABLE:
				return nextMessageRequestAvailable != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__FLUSH_QUEUE_REQUEST:
				return flushQueueRequest != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__TIME_ADVANCE_GRANT:
				return timeAdvanceGrant != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ASYNCHRONOUS_DELIVERY:
				return enableAsynchronousDelivery != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ASYNCHRONOUS_DELIVERY:
				return disableAsynchronousDelivery != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_GALT:
				return queryGALT != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOGICAL_TIME:
				return queryLogicalTime != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LITS:
				return queryLITS != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__MODIFY_LOOKAHEAD:
				return modifyLookahead != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__QUERY_LOOKAHEAD:
				return queryLookahead != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__RETRACT:
				return retract != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_RETRACTION:
				return requestRetraction != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_ATTRIBUTE_ORDER_TYPE:
				return changeAttributeOrderType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CHANGE_INTERACTION_ORDER_TYPE:
				return changeInteractionOrderType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__CREATE_REGION:
				return createRegion != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__COMMIT_REGION_MODIFICATIONS:
				return commitRegionModifications != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DELETE_REGION:
				return deleteRegion != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REGISTER_OBJECT_INSTANCE_WITH_REGIONS:
				return registerObjectInstanceWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ASSOCIATE_REGIONS_FOR_UPDATES:
				return associateRegionsForUpdates != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNASSOCIATE_REGIONS_FOR_UPDATES:
				return unassociateRegionsForUpdates != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return subscribeObjectClassAttributesWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_OBJECT_CLASS_ATTRIBUTES_WITH_REGIONS:
				return unsubscribeObjectClassAttributesWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return subscribeInteractionClassWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__UNSUBSCRIBE_INTERACTION_CLASS_WITH_REGIONS:
				return unsubscribeInteractionClassWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SEND_INTERACTION_WITH_REGIONS:
				return sendInteractionWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__REQUEST_ATTRIBUTE_VALUE_UPDATE_WITH_REGIONS:
				return requestAttributeValueUpdateWithRegions != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AUTOMATIC_RESIGN_DIRECTIVE:
				return getAutomaticResignDirective != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_AUTOMATIC_RESIGN_DIRECTIVE:
				return setAutomaticResignDirective != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_HANDLE:
				return getFederateHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_FEDERATE_NAME:
				return getFederateName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_HANDLE:
				return getObjectClassHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_CLASS_NAME:
				return getObjectClassName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_KNOWN_OBJECT_CLASS_HANDLE:
				return getKnownObjectClassHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_HANDLE:
				return getObjectInstanceHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_OBJECT_INSTANCE_NAME:
				return getObjectInstanceName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_HANDLE:
				return getAttributeHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ATTRIBUTE_NAME:
				return getAttributeName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE:
				return getUpdateRateValue != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_UPDATE_RATE_VALUE_FOR_ATTRIBUTE:
				return getUpdateRateValueForAttribute != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_HANDLE:
				return getInteractionClassHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_INTERACTION_CLASS_NAME:
				return getInteractionClassName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_HANDLE:
				return getParameterHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_PARAMETER_NAME:
				return getParameterName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_TYPE:
				return getOrderType != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_ORDER_NAME:
				return getOrderName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_HANDLE:
				return getTransportationTypeHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_TRANSPORTATION_TYPE_NAME:
				return getTransportationTypeName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_CLASS_ATTRIBUTE:
				return getAvailableDimensionsForClassAttribute != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_AVAILABLE_DIMENSIONS_FOR_INTERACTION_CLASS:
				return getAvailableDimensionsForInteractionClass != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE:
				return getDimensionHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_NAME:
				return getDimensionName != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_UPPER_BOUND:
				return getDimensionUpperBound != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_DIMENSION_HANDLE_SET:
				return getDimensionHandleSet != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__GET_RANGE_BOUNDS:
				return getRangeBounds != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__SET_RANGE_BOUNDS:
				return setRangeBounds != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_FEDERATE_HANDLE:
				return normalizeFederateHandle != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__NORMALIZE_SERVICE_GROUP:
				return normalizeServiceGroup != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return enableObjectClassRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_OBJECT_CLASS_RELEVANCE_ADVISORY_SWITCH:
				return disableObjectClassRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return enableAttributeRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_RELEVANCE_ADVISORY_SWITCH:
				return disableAttributeRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return enableAttributeScopeAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_ATTRIBUTE_SCOPE_ADVISORY_SWITCH:
				return disableAttributeScopeAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return enableInteractionRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_INTERACTION_RELEVANCE_ADVISORY_SWITCH:
				return disableInteractionRelevanceAdvisorySwitch != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_CALLBACK:
				return evokeCallback != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__EVOKE_MULTIPLE_CALLBACKS:
				return evokeMultipleCallbacks != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__ENABLE_CALLBACKS:
				return enableCallbacks != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__DISABLE_CALLBACKS:
				return disableCallbacks != null;
			case _2010Package.SERVICE_UTILIZATION_TYPE__IDTAG:
				return IDTAG_EDEFAULT == null ? idtag != null : !IDTAG_EDEFAULT.equals(idtag);
			case _2010Package.SERVICE_UTILIZATION_TYPE__NOTES:
				return NOTES_EDEFAULT == null ? notes != null : !NOTES_EDEFAULT.equals(notes);
			case _2010Package.SERVICE_UTILIZATION_TYPE__ANY_ATTRIBUTE:
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
		result.append(" (idtag: ");
		result.append(idtag);
		result.append(", notes: ");
		result.append(notes);
		result.append(", anyAttribute: ");
		result.append(anyAttribute);
		result.append(')');
		return result.toString();
	}

} //ServiceUtilizationTypeImpl
