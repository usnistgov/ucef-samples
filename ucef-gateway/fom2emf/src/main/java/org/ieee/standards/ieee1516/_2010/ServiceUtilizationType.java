/**
 */
package org.ieee.standards.ieee1516._2010;

import java.lang.String;

import java.util.List;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service Utilization Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConnect <em>Connect</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisconnect <em>Disconnect</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConnectionLost <em>Connection Lost</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCreateFederationExecution <em>Create Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDestroyFederationExecution <em>Destroy Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getListFederationExecutions <em>List Federation Executions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportFederationExecutions <em>Report Federation Executions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getJoinFederationExecution <em>Join Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getResignFederationExecution <em>Resign Federation Execution</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterFederationSynchronizationPoint <em>Register Federation Synchronization Point</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmSynchronizationPointRegistration <em>Confirm Synchronization Point Registration</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAnnounceSynchronizationPoint <em>Announce Synchronization Point</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSynchronizationPointAchieved <em>Synchronization Point Achieved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSynchronized <em>Federation Synchronized</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestFederationSave <em>Request Federation Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInitiateFederateSave <em>Initiate Federate Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateSaveBegun <em>Federate Save Begun</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateSaveComplete <em>Federate Save Complete</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSaved <em>Federation Saved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAbortFederationSave <em>Abort Federation Save</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryFederationSaveStatus <em>Query Federation Save Status</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSaveStatusResponse <em>Federation Save Status Response</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestFederationRestore <em>Request Federation Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmFederationRestorationRequest <em>Confirm Federation Restoration Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestoreBegun <em>Federation Restore Begun</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInitiateFederateRestore <em>Initiate Federate Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateRestoreComplete <em>Federate Restore Complete</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestored <em>Federation Restored</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAbortFederationRestore <em>Abort Federation Restore</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryFederationRestoreStatus <em>Query Federation Restore Status</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestoreStatusResponse <em>Federation Restore Status Response</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getPublishObjectClassAttributes <em>Publish Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnpublishObjectClassAttributes <em>Unpublish Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getPublishInteractionClass <em>Publish Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnpublishInteractionClass <em>Unpublish Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeObjectClassAttributes <em>Subscribe Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeObjectClassAttributes <em>Unsubscribe Object Class Attributes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeInteractionClass <em>Subscribe Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeInteractionClass <em>Unsubscribe Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getStartRegistrationForObjectClass <em>Start Registration For Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getStopRegistrationForObjectClass <em>Stop Registration For Object Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnInteractionsOn <em>Turn Interactions On</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnInteractionsOff <em>Turn Interactions Off</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReserveObjectInstanceName <em>Reserve Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getObjectInstanceNameReserved <em>Object Instance Name Reserved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReleaseObjectInstanceName <em>Release Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReserveMultipleObjectInstanceNames <em>Reserve Multiple Object Instance Names</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getMultipleObjectInstanceNamesReserved <em>Multiple Object Instance Names Reserved</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReleaseMultipleObjectInstanceNames <em>Release Multiple Object Instance Names</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterObjectInstance <em>Register Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDiscoverObjectInstance <em>Discover Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUpdateAttributeValues <em>Update Attribute Values</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReflectAttributeValues <em>Reflect Attribute Values</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSendInteraction <em>Send Interaction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReceiveInteraction <em>Receive Interaction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDeleteObjectInstance <em>Delete Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRemoveobjectinstance <em>Removeobjectinstance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getLocalDeleteObjectInstance <em>Local Delete Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributesInScope <em>Attributes In Scope</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributesOutOfScope <em>Attributes Out Of Scope</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeValueUpdate <em>Request Attribute Value Update</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getProvideAttributeValueUpdate <em>Provide Attribute Value Update</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnUpdatesOnForObjectInstance <em>Turn Updates On For Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnUpdatesOffForObjectInstance <em>Turn Updates Off For Object Instance</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeTransportationTypeChange <em>Request Attribute Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmAttributeTransportationTypeChange <em>Confirm Attribute Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryAttributeTransportationType <em>Query Attribute Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportAttributeTransportationType <em>Report Attribute Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestInteractionTransportationTypeChange <em>Request Interaction Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmInteractionTransportationTypeChange <em>Confirm Interaction Transportation Type Change</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryInteractionTransportationType <em>Query Interaction Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportInteractionTransportationType <em>Report Interaction Transportation Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnconditionalAttributeOwnershipDivestiture <em>Unconditional Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNegotiatedAttributeOwnershipDivestiture <em>Negotiated Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeOwnershipAssumption <em>Request Attribute Ownership Assumption</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestDivestitureConfirmation <em>Request Divestiture Confirmation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmDivestiture <em>Confirm Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisitionNotification <em>Attribute Ownership Acquisition Notification</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisition <em>Attribute Ownership Acquisition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisitionIfAvailable <em>Attribute Ownership Acquisition If Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipUnavailable <em>Attribute Ownership Unavailable</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeOwnershipRelease <em>Request Attribute Ownership Release</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipReleaseDenied <em>Attribute Ownership Release Denied</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipDivestitureIfWanted <em>Attribute Ownership Divestiture If Wanted</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCancelNegotiatedAttributeOwnershipDivestiture <em>Cancel Negotiated Attribute Ownership Divestiture</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCancelAttributeOwnershipAcquisition <em>Cancel Attribute Ownership Acquisition</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmAttributeOwnershipAcquisitionCancellation <em>Confirm Attribute Ownership Acquisition Cancellation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryAttributeOwnership <em>Query Attribute Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInformAttributeOwnership <em>Inform Attribute Ownership</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getIsAttributeOwnedByFederate <em>Is Attribute Owned By Federate</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableTimeRegulation <em>Enable Time Regulation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeRegulationEnabled <em>Time Regulation Enabled</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableTimeRegulation <em>Disable Time Regulation</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableTimeConstrained <em>Enable Time Constrained</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeConstrainedEnabled <em>Time Constrained Enabled</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableTimeConstrained <em>Disable Time Constrained</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceRequest <em>Time Advance Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceRequestAvailable <em>Time Advance Request Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNextMessageRequest <em>Next Message Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNextMessageRequestAvailable <em>Next Message Request Available</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFlushQueueRequest <em>Flush Queue Request</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceGrant <em>Time Advance Grant</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAsynchronousDelivery <em>Enable Asynchronous Delivery</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAsynchronousDelivery <em>Disable Asynchronous Delivery</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryGALT <em>Query GALT</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLogicalTime <em>Query Logical Time</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLITS <em>Query LITS</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getModifyLookahead <em>Modify Lookahead</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLookahead <em>Query Lookahead</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRetract <em>Retract</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestRetraction <em>Request Retraction</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getChangeAttributeOrderType <em>Change Attribute Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getChangeInteractionOrderType <em>Change Interaction Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCreateRegion <em>Create Region</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCommitRegionModifications <em>Commit Region Modifications</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDeleteRegion <em>Delete Region</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterObjectInstanceWithRegions <em>Register Object Instance With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAssociateRegionsForUpdates <em>Associate Regions For Updates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnassociateRegionsForUpdates <em>Unassociate Regions For Updates</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeObjectClassAttributesWithRegions <em>Subscribe Object Class Attributes With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeObjectClassAttributesWithRegions <em>Unsubscribe Object Class Attributes With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeInteractionClassWithRegions <em>Subscribe Interaction Class With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeInteractionClassWithRegions <em>Unsubscribe Interaction Class With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSendInteractionWithRegions <em>Send Interaction With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeValueUpdateWithRegions <em>Request Attribute Value Update With Regions</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAutomaticResignDirective <em>Get Automatic Resign Directive</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSetAutomaticResignDirective <em>Set Automatic Resign Directive</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetFederateHandle <em>Get Federate Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetFederateName <em>Get Federate Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectClassHandle <em>Get Object Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectClassName <em>Get Object Class Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetKnownObjectClassHandle <em>Get Known Object Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectInstanceHandle <em>Get Object Instance Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectInstanceName <em>Get Object Instance Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAttributeHandle <em>Get Attribute Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAttributeName <em>Get Attribute Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetUpdateRateValue <em>Get Update Rate Value</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetUpdateRateValueForAttribute <em>Get Update Rate Value For Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetInteractionClassHandle <em>Get Interaction Class Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetInteractionClassName <em>Get Interaction Class Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetParameterHandle <em>Get Parameter Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetParameterName <em>Get Parameter Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetOrderType <em>Get Order Type</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetOrderName <em>Get Order Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetTransportationTypeHandle <em>Get Transportation Type Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetTransportationTypeName <em>Get Transportation Type Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAvailableDimensionsForClassAttribute <em>Get Available Dimensions For Class Attribute</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAvailableDimensionsForInteractionClass <em>Get Available Dimensions For Interaction Class</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionHandle <em>Get Dimension Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionName <em>Get Dimension Name</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionUpperBound <em>Get Dimension Upper Bound</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionHandleSet <em>Get Dimension Handle Set</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetRangeBounds <em>Get Range Bounds</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSetRangeBounds <em>Set Range Bounds</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNormalizeFederateHandle <em>Normalize Federate Handle</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNormalizeServiceGroup <em>Normalize Service Group</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableObjectClassRelevanceAdvisorySwitch <em>Enable Object Class Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableObjectClassRelevanceAdvisorySwitch <em>Disable Object Class Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAttributeRelevanceAdvisorySwitch <em>Enable Attribute Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAttributeRelevanceAdvisorySwitch <em>Disable Attribute Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAttributeScopeAdvisorySwitch <em>Enable Attribute Scope Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAttributeScopeAdvisorySwitch <em>Disable Attribute Scope Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableInteractionRelevanceAdvisorySwitch <em>Enable Interaction Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableInteractionRelevanceAdvisorySwitch <em>Disable Interaction Relevance Advisory Switch</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEvokeCallback <em>Evoke Callback</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEvokeMultipleCallbacks <em>Evoke Multiple Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableCallbacks <em>Enable Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableCallbacks <em>Disable Callbacks</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getIdtag <em>Idtag</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNotes <em>Notes</em>}</li>
 *   <li>{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAnyAttribute <em>Any Attribute</em>}</li>
 * </ul>
 *
 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType()
 * @model extendedMetaData="name='serviceUtilizationType' kind='elementOnly'"
 * @generated
 */
public interface ServiceUtilizationType extends EObject {
	/**
	 * Returns the value of the '<em><b>Connect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connect</em>' containment reference.
	 * @see #setConnect(ConnectType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Connect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connect' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectType getConnect();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConnect <em>Connect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connect</em>' containment reference.
	 * @see #getConnect()
	 * @generated
	 */
	void setConnect(ConnectType value);

	/**
	 * Returns the value of the '<em><b>Disconnect</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disconnect</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disconnect</em>' containment reference.
	 * @see #setDisconnect(DisconnectType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Disconnect()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disconnect' namespace='##targetNamespace'"
	 * @generated
	 */
	DisconnectType getDisconnect();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisconnect <em>Disconnect</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disconnect</em>' containment reference.
	 * @see #getDisconnect()
	 * @generated
	 */
	void setDisconnect(DisconnectType value);

	/**
	 * Returns the value of the '<em><b>Connection Lost</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connection Lost</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connection Lost</em>' containment reference.
	 * @see #setConnectionLost(ConnectionLostType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConnectionLost()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='connectionLost' namespace='##targetNamespace'"
	 * @generated
	 */
	ConnectionLostType getConnectionLost();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConnectionLost <em>Connection Lost</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connection Lost</em>' containment reference.
	 * @see #getConnectionLost()
	 * @generated
	 */
	void setConnectionLost(ConnectionLostType value);

	/**
	 * Returns the value of the '<em><b>Create Federation Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Federation Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Federation Execution</em>' containment reference.
	 * @see #setCreateFederationExecution(CreateFederationExecutionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_CreateFederationExecution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createFederationExecution' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateFederationExecutionType getCreateFederationExecution();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCreateFederationExecution <em>Create Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Federation Execution</em>' containment reference.
	 * @see #getCreateFederationExecution()
	 * @generated
	 */
	void setCreateFederationExecution(CreateFederationExecutionType value);

	/**
	 * Returns the value of the '<em><b>Destroy Federation Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destroy Federation Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destroy Federation Execution</em>' containment reference.
	 * @see #setDestroyFederationExecution(DestroyFederationExecutionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DestroyFederationExecution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='destroyFederationExecution' namespace='##targetNamespace'"
	 * @generated
	 */
	DestroyFederationExecutionType getDestroyFederationExecution();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDestroyFederationExecution <em>Destroy Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destroy Federation Execution</em>' containment reference.
	 * @see #getDestroyFederationExecution()
	 * @generated
	 */
	void setDestroyFederationExecution(DestroyFederationExecutionType value);

	/**
	 * Returns the value of the '<em><b>List Federation Executions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>List Federation Executions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>List Federation Executions</em>' containment reference.
	 * @see #setListFederationExecutions(ListFederationExecutionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ListFederationExecutions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='listFederationExecutions' namespace='##targetNamespace'"
	 * @generated
	 */
	ListFederationExecutionsType getListFederationExecutions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getListFederationExecutions <em>List Federation Executions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>List Federation Executions</em>' containment reference.
	 * @see #getListFederationExecutions()
	 * @generated
	 */
	void setListFederationExecutions(ListFederationExecutionsType value);

	/**
	 * Returns the value of the '<em><b>Report Federation Executions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Federation Executions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Federation Executions</em>' containment reference.
	 * @see #setReportFederationExecutions(ReportFederationExecutionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReportFederationExecutions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportFederationExecutions' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportFederationExecutionsType getReportFederationExecutions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportFederationExecutions <em>Report Federation Executions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Federation Executions</em>' containment reference.
	 * @see #getReportFederationExecutions()
	 * @generated
	 */
	void setReportFederationExecutions(ReportFederationExecutionsType value);

	/**
	 * Returns the value of the '<em><b>Join Federation Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Join Federation Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Join Federation Execution</em>' containment reference.
	 * @see #setJoinFederationExecution(JoinFederationExecutionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_JoinFederationExecution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='joinFederationExecution' namespace='##targetNamespace'"
	 * @generated
	 */
	JoinFederationExecutionType getJoinFederationExecution();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getJoinFederationExecution <em>Join Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Join Federation Execution</em>' containment reference.
	 * @see #getJoinFederationExecution()
	 * @generated
	 */
	void setJoinFederationExecution(JoinFederationExecutionType value);

	/**
	 * Returns the value of the '<em><b>Resign Federation Execution</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Resign Federation Execution</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Resign Federation Execution</em>' containment reference.
	 * @see #setResignFederationExecution(ResignFederationExecutionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ResignFederationExecution()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='resignFederationExecution' namespace='##targetNamespace'"
	 * @generated
	 */
	ResignFederationExecutionType getResignFederationExecution();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getResignFederationExecution <em>Resign Federation Execution</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Resign Federation Execution</em>' containment reference.
	 * @see #getResignFederationExecution()
	 * @generated
	 */
	void setResignFederationExecution(ResignFederationExecutionType value);

	/**
	 * Returns the value of the '<em><b>Register Federation Synchronization Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Federation Synchronization Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Federation Synchronization Point</em>' containment reference.
	 * @see #setRegisterFederationSynchronizationPoint(RegisterFederationSynchronizationPointType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RegisterFederationSynchronizationPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='registerFederationSynchronizationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterFederationSynchronizationPointType getRegisterFederationSynchronizationPoint();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterFederationSynchronizationPoint <em>Register Federation Synchronization Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Federation Synchronization Point</em>' containment reference.
	 * @see #getRegisterFederationSynchronizationPoint()
	 * @generated
	 */
	void setRegisterFederationSynchronizationPoint(RegisterFederationSynchronizationPointType value);

	/**
	 * Returns the value of the '<em><b>Confirm Synchronization Point Registration</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Synchronization Point Registration</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Synchronization Point Registration</em>' containment reference.
	 * @see #setConfirmSynchronizationPointRegistration(ConfirmSynchronizationPointRegistrationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmSynchronizationPointRegistration()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmSynchronizationPointRegistration' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmSynchronizationPointRegistrationType getConfirmSynchronizationPointRegistration();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmSynchronizationPointRegistration <em>Confirm Synchronization Point Registration</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Synchronization Point Registration</em>' containment reference.
	 * @see #getConfirmSynchronizationPointRegistration()
	 * @generated
	 */
	void setConfirmSynchronizationPointRegistration(ConfirmSynchronizationPointRegistrationType value);

	/**
	 * Returns the value of the '<em><b>Announce Synchronization Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Announce Synchronization Point</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Announce Synchronization Point</em>' containment reference.
	 * @see #setAnnounceSynchronizationPoint(AnnounceSynchronizationPointType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AnnounceSynchronizationPoint()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='announceSynchronizationPoint' namespace='##targetNamespace'"
	 * @generated
	 */
	AnnounceSynchronizationPointType getAnnounceSynchronizationPoint();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAnnounceSynchronizationPoint <em>Announce Synchronization Point</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Announce Synchronization Point</em>' containment reference.
	 * @see #getAnnounceSynchronizationPoint()
	 * @generated
	 */
	void setAnnounceSynchronizationPoint(AnnounceSynchronizationPointType value);

	/**
	 * Returns the value of the '<em><b>Synchronization Point Achieved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Synchronization Point Achieved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Synchronization Point Achieved</em>' containment reference.
	 * @see #setSynchronizationPointAchieved(SynchronizationPointAchievedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SynchronizationPointAchieved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='synchronizationPointAchieved' namespace='##targetNamespace'"
	 * @generated
	 */
	SynchronizationPointAchievedType getSynchronizationPointAchieved();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSynchronizationPointAchieved <em>Synchronization Point Achieved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Synchronization Point Achieved</em>' containment reference.
	 * @see #getSynchronizationPointAchieved()
	 * @generated
	 */
	void setSynchronizationPointAchieved(SynchronizationPointAchievedType value);

	/**
	 * Returns the value of the '<em><b>Federation Synchronized</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Synchronized</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Synchronized</em>' containment reference.
	 * @see #setFederationSynchronized(FederationSynchronizedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationSynchronized()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationSynchronized' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationSynchronizedType getFederationSynchronized();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSynchronized <em>Federation Synchronized</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Synchronized</em>' containment reference.
	 * @see #getFederationSynchronized()
	 * @generated
	 */
	void setFederationSynchronized(FederationSynchronizedType value);

	/**
	 * Returns the value of the '<em><b>Request Federation Save</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Federation Save</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Federation Save</em>' containment reference.
	 * @see #setRequestFederationSave(RequestFederationSaveType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestFederationSave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestFederationSave' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestFederationSaveType getRequestFederationSave();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestFederationSave <em>Request Federation Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Federation Save</em>' containment reference.
	 * @see #getRequestFederationSave()
	 * @generated
	 */
	void setRequestFederationSave(RequestFederationSaveType value);

	/**
	 * Returns the value of the '<em><b>Initiate Federate Save</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate Federate Save</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate Federate Save</em>' containment reference.
	 * @see #setInitiateFederateSave(InitiateFederateSaveType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_InitiateFederateSave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiateFederateSave' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiateFederateSaveType getInitiateFederateSave();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInitiateFederateSave <em>Initiate Federate Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate Federate Save</em>' containment reference.
	 * @see #getInitiateFederateSave()
	 * @generated
	 */
	void setInitiateFederateSave(InitiateFederateSaveType value);

	/**
	 * Returns the value of the '<em><b>Federate Save Begun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federate Save Begun</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federate Save Begun</em>' containment reference.
	 * @see #setFederateSaveBegun(FederateSaveBegunType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederateSaveBegun()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federateSaveBegun' namespace='##targetNamespace'"
	 * @generated
	 */
	FederateSaveBegunType getFederateSaveBegun();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateSaveBegun <em>Federate Save Begun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federate Save Begun</em>' containment reference.
	 * @see #getFederateSaveBegun()
	 * @generated
	 */
	void setFederateSaveBegun(FederateSaveBegunType value);

	/**
	 * Returns the value of the '<em><b>Federate Save Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federate Save Complete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federate Save Complete</em>' containment reference.
	 * @see #setFederateSaveComplete(FederateSaveCompleteType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederateSaveComplete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federateSaveComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	FederateSaveCompleteType getFederateSaveComplete();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateSaveComplete <em>Federate Save Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federate Save Complete</em>' containment reference.
	 * @see #getFederateSaveComplete()
	 * @generated
	 */
	void setFederateSaveComplete(FederateSaveCompleteType value);

	/**
	 * Returns the value of the '<em><b>Federation Saved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Saved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Saved</em>' containment reference.
	 * @see #setFederationSaved(FederationSavedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationSaved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationSaved' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationSavedType getFederationSaved();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSaved <em>Federation Saved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Saved</em>' containment reference.
	 * @see #getFederationSaved()
	 * @generated
	 */
	void setFederationSaved(FederationSavedType value);

	/**
	 * Returns the value of the '<em><b>Abort Federation Save</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abort Federation Save</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abort Federation Save</em>' containment reference.
	 * @see #setAbortFederationSave(AbortFederationSaveType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AbortFederationSave()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abortFederationSave' namespace='##targetNamespace'"
	 * @generated
	 */
	AbortFederationSaveType getAbortFederationSave();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAbortFederationSave <em>Abort Federation Save</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort Federation Save</em>' containment reference.
	 * @see #getAbortFederationSave()
	 * @generated
	 */
	void setAbortFederationSave(AbortFederationSaveType value);

	/**
	 * Returns the value of the '<em><b>Query Federation Save Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Federation Save Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Federation Save Status</em>' containment reference.
	 * @see #setQueryFederationSaveStatus(QueryFederationSaveStatusType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryFederationSaveStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryFederationSaveStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryFederationSaveStatusType getQueryFederationSaveStatus();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryFederationSaveStatus <em>Query Federation Save Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Federation Save Status</em>' containment reference.
	 * @see #getQueryFederationSaveStatus()
	 * @generated
	 */
	void setQueryFederationSaveStatus(QueryFederationSaveStatusType value);

	/**
	 * Returns the value of the '<em><b>Federation Save Status Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Save Status Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Save Status Response</em>' containment reference.
	 * @see #setFederationSaveStatusResponse(FederationSaveStatusResponseType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationSaveStatusResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationSaveStatusResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationSaveStatusResponseType getFederationSaveStatusResponse();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationSaveStatusResponse <em>Federation Save Status Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Save Status Response</em>' containment reference.
	 * @see #getFederationSaveStatusResponse()
	 * @generated
	 */
	void setFederationSaveStatusResponse(FederationSaveStatusResponseType value);

	/**
	 * Returns the value of the '<em><b>Request Federation Restore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Federation Restore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Federation Restore</em>' containment reference.
	 * @see #setRequestFederationRestore(RequestFederationRestoreType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestFederationRestore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestFederationRestore' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestFederationRestoreType getRequestFederationRestore();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestFederationRestore <em>Request Federation Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Federation Restore</em>' containment reference.
	 * @see #getRequestFederationRestore()
	 * @generated
	 */
	void setRequestFederationRestore(RequestFederationRestoreType value);

	/**
	 * Returns the value of the '<em><b>Confirm Federation Restoration Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Federation Restoration Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Federation Restoration Request</em>' containment reference.
	 * @see #setConfirmFederationRestorationRequest(ConfirmFederationRestorationRequestType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmFederationRestorationRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmFederationRestorationRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmFederationRestorationRequestType getConfirmFederationRestorationRequest();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmFederationRestorationRequest <em>Confirm Federation Restoration Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Federation Restoration Request</em>' containment reference.
	 * @see #getConfirmFederationRestorationRequest()
	 * @generated
	 */
	void setConfirmFederationRestorationRequest(ConfirmFederationRestorationRequestType value);

	/**
	 * Returns the value of the '<em><b>Federation Restore Begun</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Restore Begun</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Restore Begun</em>' containment reference.
	 * @see #setFederationRestoreBegun(FederationRestoreBegunType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationRestoreBegun()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationRestoreBegun' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationRestoreBegunType getFederationRestoreBegun();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestoreBegun <em>Federation Restore Begun</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Restore Begun</em>' containment reference.
	 * @see #getFederationRestoreBegun()
	 * @generated
	 */
	void setFederationRestoreBegun(FederationRestoreBegunType value);

	/**
	 * Returns the value of the '<em><b>Initiate Federate Restore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initiate Federate Restore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initiate Federate Restore</em>' containment reference.
	 * @see #setInitiateFederateRestore(InitiateFederateRestoreType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_InitiateFederateRestore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='initiateFederateRestore' namespace='##targetNamespace'"
	 * @generated
	 */
	InitiateFederateRestoreType getInitiateFederateRestore();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInitiateFederateRestore <em>Initiate Federate Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initiate Federate Restore</em>' containment reference.
	 * @see #getInitiateFederateRestore()
	 * @generated
	 */
	void setInitiateFederateRestore(InitiateFederateRestoreType value);

	/**
	 * Returns the value of the '<em><b>Federate Restore Complete</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federate Restore Complete</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federate Restore Complete</em>' containment reference.
	 * @see #setFederateRestoreComplete(FederateRestoreCompleteType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederateRestoreComplete()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federateRestoreComplete' namespace='##targetNamespace'"
	 * @generated
	 */
	FederateRestoreCompleteType getFederateRestoreComplete();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederateRestoreComplete <em>Federate Restore Complete</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federate Restore Complete</em>' containment reference.
	 * @see #getFederateRestoreComplete()
	 * @generated
	 */
	void setFederateRestoreComplete(FederateRestoreCompleteType value);

	/**
	 * Returns the value of the '<em><b>Federation Restored</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Restored</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Restored</em>' containment reference.
	 * @see #setFederationRestored(FederationRestoredType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationRestored()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationRestored' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationRestoredType getFederationRestored();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestored <em>Federation Restored</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Restored</em>' containment reference.
	 * @see #getFederationRestored()
	 * @generated
	 */
	void setFederationRestored(FederationRestoredType value);

	/**
	 * Returns the value of the '<em><b>Abort Federation Restore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abort Federation Restore</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abort Federation Restore</em>' containment reference.
	 * @see #setAbortFederationRestore(AbortFederationRestoreType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AbortFederationRestore()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='abortFederationRestore' namespace='##targetNamespace'"
	 * @generated
	 */
	AbortFederationRestoreType getAbortFederationRestore();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAbortFederationRestore <em>Abort Federation Restore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abort Federation Restore</em>' containment reference.
	 * @see #getAbortFederationRestore()
	 * @generated
	 */
	void setAbortFederationRestore(AbortFederationRestoreType value);

	/**
	 * Returns the value of the '<em><b>Query Federation Restore Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Federation Restore Status</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Federation Restore Status</em>' containment reference.
	 * @see #setQueryFederationRestoreStatus(QueryFederationRestoreStatusType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryFederationRestoreStatus()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryFederationRestoreStatus' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryFederationRestoreStatusType getQueryFederationRestoreStatus();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryFederationRestoreStatus <em>Query Federation Restore Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Federation Restore Status</em>' containment reference.
	 * @see #getQueryFederationRestoreStatus()
	 * @generated
	 */
	void setQueryFederationRestoreStatus(QueryFederationRestoreStatusType value);

	/**
	 * Returns the value of the '<em><b>Federation Restore Status Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Federation Restore Status Response</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Federation Restore Status Response</em>' containment reference.
	 * @see #setFederationRestoreStatusResponse(FederationRestoreStatusResponseType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FederationRestoreStatusResponse()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='federationRestoreStatusResponse' namespace='##targetNamespace'"
	 * @generated
	 */
	FederationRestoreStatusResponseType getFederationRestoreStatusResponse();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFederationRestoreStatusResponse <em>Federation Restore Status Response</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Federation Restore Status Response</em>' containment reference.
	 * @see #getFederationRestoreStatusResponse()
	 * @generated
	 */
	void setFederationRestoreStatusResponse(FederationRestoreStatusResponseType value);

	/**
	 * Returns the value of the '<em><b>Publish Object Class Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish Object Class Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Object Class Attributes</em>' containment reference.
	 * @see #setPublishObjectClassAttributes(PublishObjectClassAttributesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_PublishObjectClassAttributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publishObjectClassAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishObjectClassAttributesType getPublishObjectClassAttributes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getPublishObjectClassAttributes <em>Publish Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Object Class Attributes</em>' containment reference.
	 * @see #getPublishObjectClassAttributes()
	 * @generated
	 */
	void setPublishObjectClassAttributes(PublishObjectClassAttributesType value);

	/**
	 * Returns the value of the '<em><b>Unpublish Object Class Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unpublish Object Class Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unpublish Object Class Attributes</em>' containment reference.
	 * @see #setUnpublishObjectClassAttributes(UnpublishObjectClassAttributesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnpublishObjectClassAttributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unpublishObjectClassAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	UnpublishObjectClassAttributesType getUnpublishObjectClassAttributes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnpublishObjectClassAttributes <em>Unpublish Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unpublish Object Class Attributes</em>' containment reference.
	 * @see #getUnpublishObjectClassAttributes()
	 * @generated
	 */
	void setUnpublishObjectClassAttributes(UnpublishObjectClassAttributesType value);

	/**
	 * Returns the value of the '<em><b>Publish Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publish Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publish Interaction Class</em>' containment reference.
	 * @see #setPublishInteractionClass(PublishInteractionClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_PublishInteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='publishInteractionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	PublishInteractionClassType getPublishInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getPublishInteractionClass <em>Publish Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publish Interaction Class</em>' containment reference.
	 * @see #getPublishInteractionClass()
	 * @generated
	 */
	void setPublishInteractionClass(PublishInteractionClassType value);

	/**
	 * Returns the value of the '<em><b>Unpublish Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unpublish Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unpublish Interaction Class</em>' containment reference.
	 * @see #setUnpublishInteractionClass(UnpublishInteractionClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnpublishInteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unpublishInteractionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	UnpublishInteractionClassType getUnpublishInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnpublishInteractionClass <em>Unpublish Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unpublish Interaction Class</em>' containment reference.
	 * @see #getUnpublishInteractionClass()
	 * @generated
	 */
	void setUnpublishInteractionClass(UnpublishInteractionClassType value);

	/**
	 * Returns the value of the '<em><b>Subscribe Object Class Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Object Class Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Object Class Attributes</em>' containment reference.
	 * @see #setSubscribeObjectClassAttributes(SubscribeObjectClassAttributesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SubscribeObjectClassAttributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscribeObjectClassAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeObjectClassAttributesType getSubscribeObjectClassAttributes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeObjectClassAttributes <em>Subscribe Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Object Class Attributes</em>' containment reference.
	 * @see #getSubscribeObjectClassAttributes()
	 * @generated
	 */
	void setSubscribeObjectClassAttributes(SubscribeObjectClassAttributesType value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Object Class Attributes</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsubscribe Object Class Attributes</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Object Class Attributes</em>' containment reference.
	 * @see #setUnsubscribeObjectClassAttributes(UnsubscribeObjectClassAttributesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnsubscribeObjectClassAttributes()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsubscribeObjectClassAttributes' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeObjectClassAttributesType getUnsubscribeObjectClassAttributes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeObjectClassAttributes <em>Unsubscribe Object Class Attributes</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Object Class Attributes</em>' containment reference.
	 * @see #getUnsubscribeObjectClassAttributes()
	 * @generated
	 */
	void setUnsubscribeObjectClassAttributes(UnsubscribeObjectClassAttributesType value);

	/**
	 * Returns the value of the '<em><b>Subscribe Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Interaction Class</em>' containment reference.
	 * @see #setSubscribeInteractionClass(SubscribeInteractionClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SubscribeInteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscribeInteractionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeInteractionClassType getSubscribeInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeInteractionClass <em>Subscribe Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Interaction Class</em>' containment reference.
	 * @see #getSubscribeInteractionClass()
	 * @generated
	 */
	void setSubscribeInteractionClass(SubscribeInteractionClassType value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsubscribe Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Interaction Class</em>' containment reference.
	 * @see #setUnsubscribeInteractionClass(UnsubscribeInteractionClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnsubscribeInteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsubscribeInteractionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeInteractionClassType getUnsubscribeInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeInteractionClass <em>Unsubscribe Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Interaction Class</em>' containment reference.
	 * @see #getUnsubscribeInteractionClass()
	 * @generated
	 */
	void setUnsubscribeInteractionClass(UnsubscribeInteractionClassType value);

	/**
	 * Returns the value of the '<em><b>Start Registration For Object Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Start Registration For Object Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start Registration For Object Class</em>' containment reference.
	 * @see #setStartRegistrationForObjectClass(StartRegistrationForObjectClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_StartRegistrationForObjectClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='startRegistrationForObjectClass' namespace='##targetNamespace'"
	 * @generated
	 */
	StartRegistrationForObjectClassType getStartRegistrationForObjectClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getStartRegistrationForObjectClass <em>Start Registration For Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start Registration For Object Class</em>' containment reference.
	 * @see #getStartRegistrationForObjectClass()
	 * @generated
	 */
	void setStartRegistrationForObjectClass(StartRegistrationForObjectClassType value);

	/**
	 * Returns the value of the '<em><b>Stop Registration For Object Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Stop Registration For Object Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stop Registration For Object Class</em>' containment reference.
	 * @see #setStopRegistrationForObjectClass(StopRegistrationForObjectClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_StopRegistrationForObjectClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='stopRegistrationForObjectClass' namespace='##targetNamespace'"
	 * @generated
	 */
	StopRegistrationForObjectClassType getStopRegistrationForObjectClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getStopRegistrationForObjectClass <em>Stop Registration For Object Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stop Registration For Object Class</em>' containment reference.
	 * @see #getStopRegistrationForObjectClass()
	 * @generated
	 */
	void setStopRegistrationForObjectClass(StopRegistrationForObjectClassType value);

	/**
	 * Returns the value of the '<em><b>Turn Interactions On</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Interactions On</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Interactions On</em>' containment reference.
	 * @see #setTurnInteractionsOn(TurnInteractionsOnType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TurnInteractionsOn()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnInteractionsOn' namespace='##targetNamespace'"
	 * @generated
	 */
	TurnInteractionsOnType getTurnInteractionsOn();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnInteractionsOn <em>Turn Interactions On</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Interactions On</em>' containment reference.
	 * @see #getTurnInteractionsOn()
	 * @generated
	 */
	void setTurnInteractionsOn(TurnInteractionsOnType value);

	/**
	 * Returns the value of the '<em><b>Turn Interactions Off</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Interactions Off</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Interactions Off</em>' containment reference.
	 * @see #setTurnInteractionsOff(TurnInteractionsOffType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TurnInteractionsOff()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnInteractionsOff' namespace='##targetNamespace'"
	 * @generated
	 */
	TurnInteractionsOffType getTurnInteractionsOff();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnInteractionsOff <em>Turn Interactions Off</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Interactions Off</em>' containment reference.
	 * @see #getTurnInteractionsOff()
	 * @generated
	 */
	void setTurnInteractionsOff(TurnInteractionsOffType value);

	/**
	 * Returns the value of the '<em><b>Reserve Object Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Object Instance Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Object Instance Name</em>' containment reference.
	 * @see #setReserveObjectInstanceName(ReserveObjectInstanceNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReserveObjectInstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reserveObjectInstanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	ReserveObjectInstanceNameType getReserveObjectInstanceName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReserveObjectInstanceName <em>Reserve Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Object Instance Name</em>' containment reference.
	 * @see #getReserveObjectInstanceName()
	 * @generated
	 */
	void setReserveObjectInstanceName(ReserveObjectInstanceNameType value);

	/**
	 * Returns the value of the '<em><b>Object Instance Name Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Object Instance Name Reserved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object Instance Name Reserved</em>' containment reference.
	 * @see #setObjectInstanceNameReserved(ObjectInstanceNameReservedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ObjectInstanceNameReserved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='objectInstanceNameReserved' namespace='##targetNamespace'"
	 * @generated
	 */
	ObjectInstanceNameReservedType getObjectInstanceNameReserved();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getObjectInstanceNameReserved <em>Object Instance Name Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object Instance Name Reserved</em>' containment reference.
	 * @see #getObjectInstanceNameReserved()
	 * @generated
	 */
	void setObjectInstanceNameReserved(ObjectInstanceNameReservedType value);

	/**
	 * Returns the value of the '<em><b>Release Object Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Object Instance Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Object Instance Name</em>' containment reference.
	 * @see #setReleaseObjectInstanceName(ReleaseObjectInstanceNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReleaseObjectInstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseObjectInstanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleaseObjectInstanceNameType getReleaseObjectInstanceName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReleaseObjectInstanceName <em>Release Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Object Instance Name</em>' containment reference.
	 * @see #getReleaseObjectInstanceName()
	 * @generated
	 */
	void setReleaseObjectInstanceName(ReleaseObjectInstanceNameType value);

	/**
	 * Returns the value of the '<em><b>Reserve Multiple Object Instance Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reserve Multiple Object Instance Names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reserve Multiple Object Instance Names</em>' containment reference.
	 * @see #setReserveMultipleObjectInstanceNames(ReserveMultipleObjectInstanceNamesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReserveMultipleObjectInstanceNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reserveMultipleObjectInstanceNames' namespace='##targetNamespace'"
	 * @generated
	 */
	ReserveMultipleObjectInstanceNamesType getReserveMultipleObjectInstanceNames();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReserveMultipleObjectInstanceNames <em>Reserve Multiple Object Instance Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserve Multiple Object Instance Names</em>' containment reference.
	 * @see #getReserveMultipleObjectInstanceNames()
	 * @generated
	 */
	void setReserveMultipleObjectInstanceNames(ReserveMultipleObjectInstanceNamesType value);

	/**
	 * Returns the value of the '<em><b>Multiple Object Instance Names Reserved</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Multiple Object Instance Names Reserved</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Multiple Object Instance Names Reserved</em>' containment reference.
	 * @see #setMultipleObjectInstanceNamesReserved(MultipleObjectInstanceNamesReservedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_MultipleObjectInstanceNamesReserved()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='multipleObjectInstanceNamesReserved' namespace='##targetNamespace'"
	 * @generated
	 */
	MultipleObjectInstanceNamesReservedType getMultipleObjectInstanceNamesReserved();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getMultipleObjectInstanceNamesReserved <em>Multiple Object Instance Names Reserved</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Multiple Object Instance Names Reserved</em>' containment reference.
	 * @see #getMultipleObjectInstanceNamesReserved()
	 * @generated
	 */
	void setMultipleObjectInstanceNamesReserved(MultipleObjectInstanceNamesReservedType value);

	/**
	 * Returns the value of the '<em><b>Release Multiple Object Instance Names</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Release Multiple Object Instance Names</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release Multiple Object Instance Names</em>' containment reference.
	 * @see #setReleaseMultipleObjectInstanceNames(ReleaseMultipleObjectInstanceNamesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReleaseMultipleObjectInstanceNames()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='releaseMultipleObjectInstanceNames' namespace='##targetNamespace'"
	 * @generated
	 */
	ReleaseMultipleObjectInstanceNamesType getReleaseMultipleObjectInstanceNames();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReleaseMultipleObjectInstanceNames <em>Release Multiple Object Instance Names</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Release Multiple Object Instance Names</em>' containment reference.
	 * @see #getReleaseMultipleObjectInstanceNames()
	 * @generated
	 */
	void setReleaseMultipleObjectInstanceNames(ReleaseMultipleObjectInstanceNamesType value);

	/**
	 * Returns the value of the '<em><b>Register Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Object Instance</em>' containment reference.
	 * @see #setRegisterObjectInstance(RegisterObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RegisterObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='registerObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterObjectInstanceType getRegisterObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterObjectInstance <em>Register Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Object Instance</em>' containment reference.
	 * @see #getRegisterObjectInstance()
	 * @generated
	 */
	void setRegisterObjectInstance(RegisterObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Discover Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discover Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discover Object Instance</em>' containment reference.
	 * @see #setDiscoverObjectInstance(DiscoverObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DiscoverObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='discoverObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	DiscoverObjectInstanceType getDiscoverObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDiscoverObjectInstance <em>Discover Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discover Object Instance</em>' containment reference.
	 * @see #getDiscoverObjectInstance()
	 * @generated
	 */
	void setDiscoverObjectInstance(DiscoverObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Update Attribute Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Attribute Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Attribute Values</em>' containment reference.
	 * @see #setUpdateAttributeValues(UpdateAttributeValuesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UpdateAttributeValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='updateAttributeValues' namespace='##targetNamespace'"
	 * @generated
	 */
	UpdateAttributeValuesType getUpdateAttributeValues();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUpdateAttributeValues <em>Update Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Attribute Values</em>' containment reference.
	 * @see #getUpdateAttributeValues()
	 * @generated
	 */
	void setUpdateAttributeValues(UpdateAttributeValuesType value);

	/**
	 * Returns the value of the '<em><b>Reflect Attribute Values</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reflect Attribute Values</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reflect Attribute Values</em>' containment reference.
	 * @see #setReflectAttributeValues(ReflectAttributeValuesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReflectAttributeValues()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reflectAttributeValues' namespace='##targetNamespace'"
	 * @generated
	 */
	ReflectAttributeValuesType getReflectAttributeValues();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReflectAttributeValues <em>Reflect Attribute Values</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reflect Attribute Values</em>' containment reference.
	 * @see #getReflectAttributeValues()
	 * @generated
	 */
	void setReflectAttributeValues(ReflectAttributeValuesType value);

	/**
	 * Returns the value of the '<em><b>Send Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Interaction</em>' containment reference.
	 * @see #setSendInteraction(SendInteractionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SendInteraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sendInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	SendInteractionType getSendInteraction();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSendInteraction <em>Send Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Interaction</em>' containment reference.
	 * @see #getSendInteraction()
	 * @generated
	 */
	void setSendInteraction(SendInteractionType value);

	/**
	 * Returns the value of the '<em><b>Receive Interaction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Receive Interaction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receive Interaction</em>' containment reference.
	 * @see #setReceiveInteraction(ReceiveInteractionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReceiveInteraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='receiveInteraction' namespace='##targetNamespace'"
	 * @generated
	 */
	ReceiveInteractionType getReceiveInteraction();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReceiveInteraction <em>Receive Interaction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receive Interaction</em>' containment reference.
	 * @see #getReceiveInteraction()
	 * @generated
	 */
	void setReceiveInteraction(ReceiveInteractionType value);

	/**
	 * Returns the value of the '<em><b>Delete Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Object Instance</em>' containment reference.
	 * @see #setDeleteObjectInstance(DeleteObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DeleteObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deleteObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteObjectInstanceType getDeleteObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDeleteObjectInstance <em>Delete Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Object Instance</em>' containment reference.
	 * @see #getDeleteObjectInstance()
	 * @generated
	 */
	void setDeleteObjectInstance(DeleteObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Removeobjectinstance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Removeobjectinstance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Removeobjectinstance</em>' containment reference.
	 * @see #setRemoveobjectinstance(RemoveobjectinstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Removeobjectinstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='removeobjectinstance' namespace='##targetNamespace'"
	 * @generated
	 */
	RemoveobjectinstanceType getRemoveobjectinstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRemoveobjectinstance <em>Removeobjectinstance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Removeobjectinstance</em>' containment reference.
	 * @see #getRemoveobjectinstance()
	 * @generated
	 */
	void setRemoveobjectinstance(RemoveobjectinstanceType value);

	/**
	 * Returns the value of the '<em><b>Local Delete Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Local Delete Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Local Delete Object Instance</em>' containment reference.
	 * @see #setLocalDeleteObjectInstance(LocalDeleteObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_LocalDeleteObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='localDeleteObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	LocalDeleteObjectInstanceType getLocalDeleteObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getLocalDeleteObjectInstance <em>Local Delete Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Local Delete Object Instance</em>' containment reference.
	 * @see #getLocalDeleteObjectInstance()
	 * @generated
	 */
	void setLocalDeleteObjectInstance(LocalDeleteObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Attributes In Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes In Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes In Scope</em>' containment reference.
	 * @see #setAttributesInScope(AttributesInScopeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributesInScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributesInScope' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributesInScopeType getAttributesInScope();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributesInScope <em>Attributes In Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes In Scope</em>' containment reference.
	 * @see #getAttributesInScope()
	 * @generated
	 */
	void setAttributesInScope(AttributesInScopeType value);

	/**
	 * Returns the value of the '<em><b>Attributes Out Of Scope</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes Out Of Scope</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes Out Of Scope</em>' containment reference.
	 * @see #setAttributesOutOfScope(AttributesOutOfScopeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributesOutOfScope()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributesOutOfScope' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributesOutOfScopeType getAttributesOutOfScope();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributesOutOfScope <em>Attributes Out Of Scope</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attributes Out Of Scope</em>' containment reference.
	 * @see #getAttributesOutOfScope()
	 * @generated
	 */
	void setAttributesOutOfScope(AttributesOutOfScopeType value);

	/**
	 * Returns the value of the '<em><b>Request Attribute Value Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attribute Value Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attribute Value Update</em>' containment reference.
	 * @see #setRequestAttributeValueUpdate(RequestAttributeValueUpdateType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestAttributeValueUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestAttributeValueUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAttributeValueUpdateType getRequestAttributeValueUpdate();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeValueUpdate <em>Request Attribute Value Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Attribute Value Update</em>' containment reference.
	 * @see #getRequestAttributeValueUpdate()
	 * @generated
	 */
	void setRequestAttributeValueUpdate(RequestAttributeValueUpdateType value);

	/**
	 * Returns the value of the '<em><b>Provide Attribute Value Update</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provide Attribute Value Update</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide Attribute Value Update</em>' containment reference.
	 * @see #setProvideAttributeValueUpdate(ProvideAttributeValueUpdateType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ProvideAttributeValueUpdate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='provideAttributeValueUpdate' namespace='##targetNamespace'"
	 * @generated
	 */
	ProvideAttributeValueUpdateType getProvideAttributeValueUpdate();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getProvideAttributeValueUpdate <em>Provide Attribute Value Update</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Provide Attribute Value Update</em>' containment reference.
	 * @see #getProvideAttributeValueUpdate()
	 * @generated
	 */
	void setProvideAttributeValueUpdate(ProvideAttributeValueUpdateType value);

	/**
	 * Returns the value of the '<em><b>Turn Updates On For Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Updates On For Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Updates On For Object Instance</em>' containment reference.
	 * @see #setTurnUpdatesOnForObjectInstance(TurnUpdatesOnForObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TurnUpdatesOnForObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnUpdatesOnForObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	TurnUpdatesOnForObjectInstanceType getTurnUpdatesOnForObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnUpdatesOnForObjectInstance <em>Turn Updates On For Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Updates On For Object Instance</em>' containment reference.
	 * @see #getTurnUpdatesOnForObjectInstance()
	 * @generated
	 */
	void setTurnUpdatesOnForObjectInstance(TurnUpdatesOnForObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Turn Updates Off For Object Instance</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Turn Updates Off For Object Instance</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Turn Updates Off For Object Instance</em>' containment reference.
	 * @see #setTurnUpdatesOffForObjectInstance(TurnUpdatesOffForObjectInstanceType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TurnUpdatesOffForObjectInstance()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='turnUpdatesOffForObjectInstance' namespace='##targetNamespace'"
	 * @generated
	 */
	TurnUpdatesOffForObjectInstanceType getTurnUpdatesOffForObjectInstance();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTurnUpdatesOffForObjectInstance <em>Turn Updates Off For Object Instance</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Turn Updates Off For Object Instance</em>' containment reference.
	 * @see #getTurnUpdatesOffForObjectInstance()
	 * @generated
	 */
	void setTurnUpdatesOffForObjectInstance(TurnUpdatesOffForObjectInstanceType value);

	/**
	 * Returns the value of the '<em><b>Request Attribute Transportation Type Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attribute Transportation Type Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attribute Transportation Type Change</em>' containment reference.
	 * @see #setRequestAttributeTransportationTypeChange(RequestAttributeTransportationTypeChangeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestAttributeTransportationTypeChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestAttributeTransportationTypeChange' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAttributeTransportationTypeChangeType getRequestAttributeTransportationTypeChange();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeTransportationTypeChange <em>Request Attribute Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Attribute Transportation Type Change</em>' containment reference.
	 * @see #getRequestAttributeTransportationTypeChange()
	 * @generated
	 */
	void setRequestAttributeTransportationTypeChange(RequestAttributeTransportationTypeChangeType value);

	/**
	 * Returns the value of the '<em><b>Confirm Attribute Transportation Type Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Attribute Transportation Type Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Attribute Transportation Type Change</em>' containment reference.
	 * @see #setConfirmAttributeTransportationTypeChange(ConfirmAttributeTransportationTypeChangeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmAttributeTransportationTypeChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmAttributeTransportationTypeChange' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmAttributeTransportationTypeChangeType getConfirmAttributeTransportationTypeChange();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmAttributeTransportationTypeChange <em>Confirm Attribute Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Attribute Transportation Type Change</em>' containment reference.
	 * @see #getConfirmAttributeTransportationTypeChange()
	 * @generated
	 */
	void setConfirmAttributeTransportationTypeChange(ConfirmAttributeTransportationTypeChangeType value);

	/**
	 * Returns the value of the '<em><b>Query Attribute Transportation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Attribute Transportation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Attribute Transportation Type</em>' containment reference.
	 * @see #setQueryAttributeTransportationType(QueryAttributeTransportationTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryAttributeTransportationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryAttributeTransportationType' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryAttributeTransportationTypeType getQueryAttributeTransportationType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryAttributeTransportationType <em>Query Attribute Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Attribute Transportation Type</em>' containment reference.
	 * @see #getQueryAttributeTransportationType()
	 * @generated
	 */
	void setQueryAttributeTransportationType(QueryAttributeTransportationTypeType value);

	/**
	 * Returns the value of the '<em><b>Report Attribute Transportation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Attribute Transportation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Attribute Transportation Type</em>' containment reference.
	 * @see #setReportAttributeTransportationType(ReportAttributeTransportationTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReportAttributeTransportationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportAttributeTransportationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportAttributeTransportationTypeType getReportAttributeTransportationType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportAttributeTransportationType <em>Report Attribute Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Attribute Transportation Type</em>' containment reference.
	 * @see #getReportAttributeTransportationType()
	 * @generated
	 */
	void setReportAttributeTransportationType(ReportAttributeTransportationTypeType value);

	/**
	 * Returns the value of the '<em><b>Request Interaction Transportation Type Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Interaction Transportation Type Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Interaction Transportation Type Change</em>' containment reference.
	 * @see #setRequestInteractionTransportationTypeChange(RequestInteractionTransportationTypeChangeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestInteractionTransportationTypeChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestInteractionTransportationTypeChange' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestInteractionTransportationTypeChangeType getRequestInteractionTransportationTypeChange();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestInteractionTransportationTypeChange <em>Request Interaction Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Interaction Transportation Type Change</em>' containment reference.
	 * @see #getRequestInteractionTransportationTypeChange()
	 * @generated
	 */
	void setRequestInteractionTransportationTypeChange(RequestInteractionTransportationTypeChangeType value);

	/**
	 * Returns the value of the '<em><b>Confirm Interaction Transportation Type Change</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Interaction Transportation Type Change</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Interaction Transportation Type Change</em>' containment reference.
	 * @see #setConfirmInteractionTransportationTypeChange(ConfirmInteractionTransportationTypeChangeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmInteractionTransportationTypeChange()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmInteractionTransportationTypeChange' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmInteractionTransportationTypeChangeType getConfirmInteractionTransportationTypeChange();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmInteractionTransportationTypeChange <em>Confirm Interaction Transportation Type Change</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Interaction Transportation Type Change</em>' containment reference.
	 * @see #getConfirmInteractionTransportationTypeChange()
	 * @generated
	 */
	void setConfirmInteractionTransportationTypeChange(ConfirmInteractionTransportationTypeChangeType value);

	/**
	 * Returns the value of the '<em><b>Query Interaction Transportation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Interaction Transportation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Interaction Transportation Type</em>' containment reference.
	 * @see #setQueryInteractionTransportationType(QueryInteractionTransportationTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryInteractionTransportationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryInteractionTransportationType' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryInteractionTransportationTypeType getQueryInteractionTransportationType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryInteractionTransportationType <em>Query Interaction Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Interaction Transportation Type</em>' containment reference.
	 * @see #getQueryInteractionTransportationType()
	 * @generated
	 */
	void setQueryInteractionTransportationType(QueryInteractionTransportationTypeType value);

	/**
	 * Returns the value of the '<em><b>Report Interaction Transportation Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Report Interaction Transportation Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Report Interaction Transportation Type</em>' containment reference.
	 * @see #setReportInteractionTransportationType(ReportInteractionTransportationTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ReportInteractionTransportationType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='reportInteractionTransportationType' namespace='##targetNamespace'"
	 * @generated
	 */
	ReportInteractionTransportationTypeType getReportInteractionTransportationType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getReportInteractionTransportationType <em>Report Interaction Transportation Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Report Interaction Transportation Type</em>' containment reference.
	 * @see #getReportInteractionTransportationType()
	 * @generated
	 */
	void setReportInteractionTransportationType(ReportInteractionTransportationTypeType value);

	/**
	 * Returns the value of the '<em><b>Unconditional Attribute Ownership Divestiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unconditional Attribute Ownership Divestiture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unconditional Attribute Ownership Divestiture</em>' containment reference.
	 * @see #setUnconditionalAttributeOwnershipDivestiture(UnconditionalAttributeOwnershipDivestitureType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnconditionalAttributeOwnershipDivestiture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unconditionalAttributeOwnershipDivestiture' namespace='##targetNamespace'"
	 * @generated
	 */
	UnconditionalAttributeOwnershipDivestitureType getUnconditionalAttributeOwnershipDivestiture();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnconditionalAttributeOwnershipDivestiture <em>Unconditional Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unconditional Attribute Ownership Divestiture</em>' containment reference.
	 * @see #getUnconditionalAttributeOwnershipDivestiture()
	 * @generated
	 */
	void setUnconditionalAttributeOwnershipDivestiture(UnconditionalAttributeOwnershipDivestitureType value);

	/**
	 * Returns the value of the '<em><b>Negotiated Attribute Ownership Divestiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Negotiated Attribute Ownership Divestiture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Negotiated Attribute Ownership Divestiture</em>' containment reference.
	 * @see #setNegotiatedAttributeOwnershipDivestiture(NegotiatedAttributeOwnershipDivestitureType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_NegotiatedAttributeOwnershipDivestiture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='negotiatedAttributeOwnershipDivestiture' namespace='##targetNamespace'"
	 * @generated
	 */
	NegotiatedAttributeOwnershipDivestitureType getNegotiatedAttributeOwnershipDivestiture();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNegotiatedAttributeOwnershipDivestiture <em>Negotiated Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Negotiated Attribute Ownership Divestiture</em>' containment reference.
	 * @see #getNegotiatedAttributeOwnershipDivestiture()
	 * @generated
	 */
	void setNegotiatedAttributeOwnershipDivestiture(NegotiatedAttributeOwnershipDivestitureType value);

	/**
	 * Returns the value of the '<em><b>Request Attribute Ownership Assumption</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attribute Ownership Assumption</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attribute Ownership Assumption</em>' containment reference.
	 * @see #setRequestAttributeOwnershipAssumption(RequestAttributeOwnershipAssumptionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestAttributeOwnershipAssumption()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestAttributeOwnershipAssumption' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAttributeOwnershipAssumptionType getRequestAttributeOwnershipAssumption();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeOwnershipAssumption <em>Request Attribute Ownership Assumption</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Attribute Ownership Assumption</em>' containment reference.
	 * @see #getRequestAttributeOwnershipAssumption()
	 * @generated
	 */
	void setRequestAttributeOwnershipAssumption(RequestAttributeOwnershipAssumptionType value);

	/**
	 * Returns the value of the '<em><b>Request Divestiture Confirmation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Divestiture Confirmation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Divestiture Confirmation</em>' containment reference.
	 * @see #setRequestDivestitureConfirmation(RequestDivestitureConfirmationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestDivestitureConfirmation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestDivestitureConfirmation' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestDivestitureConfirmationType getRequestDivestitureConfirmation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestDivestitureConfirmation <em>Request Divestiture Confirmation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Divestiture Confirmation</em>' containment reference.
	 * @see #getRequestDivestitureConfirmation()
	 * @generated
	 */
	void setRequestDivestitureConfirmation(RequestDivestitureConfirmationType value);

	/**
	 * Returns the value of the '<em><b>Confirm Divestiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Divestiture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Divestiture</em>' containment reference.
	 * @see #setConfirmDivestiture(ConfirmDivestitureType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmDivestiture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmDivestiture' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmDivestitureType getConfirmDivestiture();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmDivestiture <em>Confirm Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Divestiture</em>' containment reference.
	 * @see #getConfirmDivestiture()
	 * @generated
	 */
	void setConfirmDivestiture(ConfirmDivestitureType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Acquisition Notification</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Acquisition Notification</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Acquisition Notification</em>' containment reference.
	 * @see #setAttributeOwnershipAcquisitionNotification(AttributeOwnershipAcquisitionNotificationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipAcquisitionNotification()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipAcquisitionNotification' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipAcquisitionNotificationType getAttributeOwnershipAcquisitionNotification();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisitionNotification <em>Attribute Ownership Acquisition Notification</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Acquisition Notification</em>' containment reference.
	 * @see #getAttributeOwnershipAcquisitionNotification()
	 * @generated
	 */
	void setAttributeOwnershipAcquisitionNotification(AttributeOwnershipAcquisitionNotificationType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Acquisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Acquisition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Acquisition</em>' containment reference.
	 * @see #setAttributeOwnershipAcquisition(AttributeOwnershipAcquisitionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipAcquisition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipAcquisition' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipAcquisitionType getAttributeOwnershipAcquisition();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisition <em>Attribute Ownership Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Acquisition</em>' containment reference.
	 * @see #getAttributeOwnershipAcquisition()
	 * @generated
	 */
	void setAttributeOwnershipAcquisition(AttributeOwnershipAcquisitionType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Acquisition If Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Acquisition If Available</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Acquisition If Available</em>' containment reference.
	 * @see #setAttributeOwnershipAcquisitionIfAvailable(AttributeOwnershipAcquisitionIfAvailableType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipAcquisitionIfAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipAcquisitionIfAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipAcquisitionIfAvailableType getAttributeOwnershipAcquisitionIfAvailable();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipAcquisitionIfAvailable <em>Attribute Ownership Acquisition If Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Acquisition If Available</em>' containment reference.
	 * @see #getAttributeOwnershipAcquisitionIfAvailable()
	 * @generated
	 */
	void setAttributeOwnershipAcquisitionIfAvailable(AttributeOwnershipAcquisitionIfAvailableType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Unavailable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Unavailable</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Unavailable</em>' containment reference.
	 * @see #setAttributeOwnershipUnavailable(AttributeOwnershipUnavailableType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipUnavailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipUnavailable' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipUnavailableType getAttributeOwnershipUnavailable();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipUnavailable <em>Attribute Ownership Unavailable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Unavailable</em>' containment reference.
	 * @see #getAttributeOwnershipUnavailable()
	 * @generated
	 */
	void setAttributeOwnershipUnavailable(AttributeOwnershipUnavailableType value);

	/**
	 * Returns the value of the '<em><b>Request Attribute Ownership Release</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attribute Ownership Release</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attribute Ownership Release</em>' containment reference.
	 * @see #setRequestAttributeOwnershipRelease(RequestAttributeOwnershipReleaseType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestAttributeOwnershipRelease()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestAttributeOwnershipRelease' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAttributeOwnershipReleaseType getRequestAttributeOwnershipRelease();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeOwnershipRelease <em>Request Attribute Ownership Release</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Attribute Ownership Release</em>' containment reference.
	 * @see #getRequestAttributeOwnershipRelease()
	 * @generated
	 */
	void setRequestAttributeOwnershipRelease(RequestAttributeOwnershipReleaseType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Release Denied</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Release Denied</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Release Denied</em>' containment reference.
	 * @see #setAttributeOwnershipReleaseDenied(AttributeOwnershipReleaseDeniedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipReleaseDenied()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipReleaseDenied' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipReleaseDeniedType getAttributeOwnershipReleaseDenied();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipReleaseDenied <em>Attribute Ownership Release Denied</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Release Denied</em>' containment reference.
	 * @see #getAttributeOwnershipReleaseDenied()
	 * @generated
	 */
	void setAttributeOwnershipReleaseDenied(AttributeOwnershipReleaseDeniedType value);

	/**
	 * Returns the value of the '<em><b>Attribute Ownership Divestiture If Wanted</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ownership Divestiture If Wanted</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ownership Divestiture If Wanted</em>' containment reference.
	 * @see #setAttributeOwnershipDivestitureIfWanted(AttributeOwnershipDivestitureIfWantedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AttributeOwnershipDivestitureIfWanted()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='attributeOwnershipDivestitureIfWanted' namespace='##targetNamespace'"
	 * @generated
	 */
	AttributeOwnershipDivestitureIfWantedType getAttributeOwnershipDivestitureIfWanted();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAttributeOwnershipDivestitureIfWanted <em>Attribute Ownership Divestiture If Wanted</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ownership Divestiture If Wanted</em>' containment reference.
	 * @see #getAttributeOwnershipDivestitureIfWanted()
	 * @generated
	 */
	void setAttributeOwnershipDivestitureIfWanted(AttributeOwnershipDivestitureIfWantedType value);

	/**
	 * Returns the value of the '<em><b>Cancel Negotiated Attribute Ownership Divestiture</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Negotiated Attribute Ownership Divestiture</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Negotiated Attribute Ownership Divestiture</em>' containment reference.
	 * @see #setCancelNegotiatedAttributeOwnershipDivestiture(CancelNegotiatedAttributeOwnershipDivestitureType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_CancelNegotiatedAttributeOwnershipDivestiture()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cancelNegotiatedAttributeOwnershipDivestiture' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelNegotiatedAttributeOwnershipDivestitureType getCancelNegotiatedAttributeOwnershipDivestiture();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCancelNegotiatedAttributeOwnershipDivestiture <em>Cancel Negotiated Attribute Ownership Divestiture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Negotiated Attribute Ownership Divestiture</em>' containment reference.
	 * @see #getCancelNegotiatedAttributeOwnershipDivestiture()
	 * @generated
	 */
	void setCancelNegotiatedAttributeOwnershipDivestiture(CancelNegotiatedAttributeOwnershipDivestitureType value);

	/**
	 * Returns the value of the '<em><b>Cancel Attribute Ownership Acquisition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cancel Attribute Ownership Acquisition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel Attribute Ownership Acquisition</em>' containment reference.
	 * @see #setCancelAttributeOwnershipAcquisition(CancelAttributeOwnershipAcquisitionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_CancelAttributeOwnershipAcquisition()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='cancelAttributeOwnershipAcquisition' namespace='##targetNamespace'"
	 * @generated
	 */
	CancelAttributeOwnershipAcquisitionType getCancelAttributeOwnershipAcquisition();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCancelAttributeOwnershipAcquisition <em>Cancel Attribute Ownership Acquisition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cancel Attribute Ownership Acquisition</em>' containment reference.
	 * @see #getCancelAttributeOwnershipAcquisition()
	 * @generated
	 */
	void setCancelAttributeOwnershipAcquisition(CancelAttributeOwnershipAcquisitionType value);

	/**
	 * Returns the value of the '<em><b>Confirm Attribute Ownership Acquisition Cancellation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confirm Attribute Ownership Acquisition Cancellation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confirm Attribute Ownership Acquisition Cancellation</em>' containment reference.
	 * @see #setConfirmAttributeOwnershipAcquisitionCancellation(ConfirmAttributeOwnershipAcquisitionCancellationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ConfirmAttributeOwnershipAcquisitionCancellation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='confirmAttributeOwnershipAcquisitionCancellation' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfirmAttributeOwnershipAcquisitionCancellationType getConfirmAttributeOwnershipAcquisitionCancellation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getConfirmAttributeOwnershipAcquisitionCancellation <em>Confirm Attribute Ownership Acquisition Cancellation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confirm Attribute Ownership Acquisition Cancellation</em>' containment reference.
	 * @see #getConfirmAttributeOwnershipAcquisitionCancellation()
	 * @generated
	 */
	void setConfirmAttributeOwnershipAcquisitionCancellation(ConfirmAttributeOwnershipAcquisitionCancellationType value);

	/**
	 * Returns the value of the '<em><b>Query Attribute Ownership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Attribute Ownership</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Attribute Ownership</em>' containment reference.
	 * @see #setQueryAttributeOwnership(QueryAttributeOwnershipType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryAttributeOwnership()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryAttributeOwnership' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryAttributeOwnershipType getQueryAttributeOwnership();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryAttributeOwnership <em>Query Attribute Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Attribute Ownership</em>' containment reference.
	 * @see #getQueryAttributeOwnership()
	 * @generated
	 */
	void setQueryAttributeOwnership(QueryAttributeOwnershipType value);

	/**
	 * Returns the value of the '<em><b>Inform Attribute Ownership</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inform Attribute Ownership</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inform Attribute Ownership</em>' containment reference.
	 * @see #setInformAttributeOwnership(InformAttributeOwnershipType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_InformAttributeOwnership()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='informAttributeOwnership' namespace='##targetNamespace'"
	 * @generated
	 */
	InformAttributeOwnershipType getInformAttributeOwnership();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getInformAttributeOwnership <em>Inform Attribute Ownership</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Inform Attribute Ownership</em>' containment reference.
	 * @see #getInformAttributeOwnership()
	 * @generated
	 */
	void setInformAttributeOwnership(InformAttributeOwnershipType value);

	/**
	 * Returns the value of the '<em><b>Is Attribute Owned By Federate</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Attribute Owned By Federate</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Attribute Owned By Federate</em>' containment reference.
	 * @see #setIsAttributeOwnedByFederate(IsAttributeOwnedByFederateType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_IsAttributeOwnedByFederate()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='isAttributeOwnedByFederate' namespace='##targetNamespace'"
	 * @generated
	 */
	IsAttributeOwnedByFederateType getIsAttributeOwnedByFederate();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getIsAttributeOwnedByFederate <em>Is Attribute Owned By Federate</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Attribute Owned By Federate</em>' containment reference.
	 * @see #getIsAttributeOwnedByFederate()
	 * @generated
	 */
	void setIsAttributeOwnedByFederate(IsAttributeOwnedByFederateType value);

	/**
	 * Returns the value of the '<em><b>Enable Time Regulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Time Regulation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Time Regulation</em>' containment reference.
	 * @see #setEnableTimeRegulation(EnableTimeRegulationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableTimeRegulation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableTimeRegulation' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableTimeRegulationType getEnableTimeRegulation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableTimeRegulation <em>Enable Time Regulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Time Regulation</em>' containment reference.
	 * @see #getEnableTimeRegulation()
	 * @generated
	 */
	void setEnableTimeRegulation(EnableTimeRegulationType value);

	/**
	 * Returns the value of the '<em><b>Time Regulation Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Regulation Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Regulation Enabled</em>' containment reference.
	 * @see #setTimeRegulationEnabled(TimeRegulationEnabledType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TimeRegulationEnabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeRegulationEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeRegulationEnabledType getTimeRegulationEnabled();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeRegulationEnabled <em>Time Regulation Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Regulation Enabled</em>' containment reference.
	 * @see #getTimeRegulationEnabled()
	 * @generated
	 */
	void setTimeRegulationEnabled(TimeRegulationEnabledType value);

	/**
	 * Returns the value of the '<em><b>Disable Time Regulation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Time Regulation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Time Regulation</em>' containment reference.
	 * @see #setDisableTimeRegulation(DisableTimeRegulationType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableTimeRegulation()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableTimeRegulation' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableTimeRegulationType getDisableTimeRegulation();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableTimeRegulation <em>Disable Time Regulation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Time Regulation</em>' containment reference.
	 * @see #getDisableTimeRegulation()
	 * @generated
	 */
	void setDisableTimeRegulation(DisableTimeRegulationType value);

	/**
	 * Returns the value of the '<em><b>Enable Time Constrained</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Time Constrained</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Time Constrained</em>' containment reference.
	 * @see #setEnableTimeConstrained(EnableTimeConstrainedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableTimeConstrained()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableTimeConstrained' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableTimeConstrainedType getEnableTimeConstrained();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableTimeConstrained <em>Enable Time Constrained</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Time Constrained</em>' containment reference.
	 * @see #getEnableTimeConstrained()
	 * @generated
	 */
	void setEnableTimeConstrained(EnableTimeConstrainedType value);

	/**
	 * Returns the value of the '<em><b>Time Constrained Enabled</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Constrained Enabled</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Constrained Enabled</em>' containment reference.
	 * @see #setTimeConstrainedEnabled(TimeConstrainedEnabledType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TimeConstrainedEnabled()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeConstrainedEnabled' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeConstrainedEnabledType getTimeConstrainedEnabled();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeConstrainedEnabled <em>Time Constrained Enabled</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Constrained Enabled</em>' containment reference.
	 * @see #getTimeConstrainedEnabled()
	 * @generated
	 */
	void setTimeConstrainedEnabled(TimeConstrainedEnabledType value);

	/**
	 * Returns the value of the '<em><b>Disable Time Constrained</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Time Constrained</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Time Constrained</em>' containment reference.
	 * @see #setDisableTimeConstrained(DisableTimeConstrainedType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableTimeConstrained()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableTimeConstrained' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableTimeConstrainedType getDisableTimeConstrained();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableTimeConstrained <em>Disable Time Constrained</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Time Constrained</em>' containment reference.
	 * @see #getDisableTimeConstrained()
	 * @generated
	 */
	void setDisableTimeConstrained(DisableTimeConstrainedType value);

	/**
	 * Returns the value of the '<em><b>Time Advance Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Advance Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Advance Request</em>' containment reference.
	 * @see #setTimeAdvanceRequest(TimeAdvanceRequestType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TimeAdvanceRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeAdvanceRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAdvanceRequestType getTimeAdvanceRequest();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceRequest <em>Time Advance Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Advance Request</em>' containment reference.
	 * @see #getTimeAdvanceRequest()
	 * @generated
	 */
	void setTimeAdvanceRequest(TimeAdvanceRequestType value);

	/**
	 * Returns the value of the '<em><b>Time Advance Request Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Advance Request Available</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Advance Request Available</em>' containment reference.
	 * @see #setTimeAdvanceRequestAvailable(TimeAdvanceRequestAvailableType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TimeAdvanceRequestAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeAdvanceRequestAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAdvanceRequestAvailableType getTimeAdvanceRequestAvailable();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceRequestAvailable <em>Time Advance Request Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Advance Request Available</em>' containment reference.
	 * @see #getTimeAdvanceRequestAvailable()
	 * @generated
	 */
	void setTimeAdvanceRequestAvailable(TimeAdvanceRequestAvailableType value);

	/**
	 * Returns the value of the '<em><b>Next Message Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Message Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Message Request</em>' containment reference.
	 * @see #setNextMessageRequest(NextMessageRequestType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_NextMessageRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nextMessageRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	NextMessageRequestType getNextMessageRequest();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNextMessageRequest <em>Next Message Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Message Request</em>' containment reference.
	 * @see #getNextMessageRequest()
	 * @generated
	 */
	void setNextMessageRequest(NextMessageRequestType value);

	/**
	 * Returns the value of the '<em><b>Next Message Request Available</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next Message Request Available</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next Message Request Available</em>' containment reference.
	 * @see #setNextMessageRequestAvailable(NextMessageRequestAvailableType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_NextMessageRequestAvailable()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='nextMessageRequestAvailable' namespace='##targetNamespace'"
	 * @generated
	 */
	NextMessageRequestAvailableType getNextMessageRequestAvailable();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNextMessageRequestAvailable <em>Next Message Request Available</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next Message Request Available</em>' containment reference.
	 * @see #getNextMessageRequestAvailable()
	 * @generated
	 */
	void setNextMessageRequestAvailable(NextMessageRequestAvailableType value);

	/**
	 * Returns the value of the '<em><b>Flush Queue Request</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flush Queue Request</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flush Queue Request</em>' containment reference.
	 * @see #setFlushQueueRequest(FlushQueueRequestType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_FlushQueueRequest()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='flushQueueRequest' namespace='##targetNamespace'"
	 * @generated
	 */
	FlushQueueRequestType getFlushQueueRequest();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getFlushQueueRequest <em>Flush Queue Request</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Flush Queue Request</em>' containment reference.
	 * @see #getFlushQueueRequest()
	 * @generated
	 */
	void setFlushQueueRequest(FlushQueueRequestType value);

	/**
	 * Returns the value of the '<em><b>Time Advance Grant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Time Advance Grant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Time Advance Grant</em>' containment reference.
	 * @see #setTimeAdvanceGrant(TimeAdvanceGrantType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_TimeAdvanceGrant()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='timeAdvanceGrant' namespace='##targetNamespace'"
	 * @generated
	 */
	TimeAdvanceGrantType getTimeAdvanceGrant();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getTimeAdvanceGrant <em>Time Advance Grant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Time Advance Grant</em>' containment reference.
	 * @see #getTimeAdvanceGrant()
	 * @generated
	 */
	void setTimeAdvanceGrant(TimeAdvanceGrantType value);

	/**
	 * Returns the value of the '<em><b>Enable Asynchronous Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Asynchronous Delivery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Asynchronous Delivery</em>' containment reference.
	 * @see #setEnableAsynchronousDelivery(EnableAsynchronousDeliveryType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableAsynchronousDelivery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableAsynchronousDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableAsynchronousDeliveryType getEnableAsynchronousDelivery();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAsynchronousDelivery <em>Enable Asynchronous Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Asynchronous Delivery</em>' containment reference.
	 * @see #getEnableAsynchronousDelivery()
	 * @generated
	 */
	void setEnableAsynchronousDelivery(EnableAsynchronousDeliveryType value);

	/**
	 * Returns the value of the '<em><b>Disable Asynchronous Delivery</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Asynchronous Delivery</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Asynchronous Delivery</em>' containment reference.
	 * @see #setDisableAsynchronousDelivery(DisableAsynchronousDeliveryType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableAsynchronousDelivery()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableAsynchronousDelivery' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableAsynchronousDeliveryType getDisableAsynchronousDelivery();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAsynchronousDelivery <em>Disable Asynchronous Delivery</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Asynchronous Delivery</em>' containment reference.
	 * @see #getDisableAsynchronousDelivery()
	 * @generated
	 */
	void setDisableAsynchronousDelivery(DisableAsynchronousDeliveryType value);

	/**
	 * Returns the value of the '<em><b>Query GALT</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query GALT</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query GALT</em>' containment reference.
	 * @see #setQueryGALT(QueryGALTType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryGALT()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryGALT' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryGALTType getQueryGALT();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryGALT <em>Query GALT</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query GALT</em>' containment reference.
	 * @see #getQueryGALT()
	 * @generated
	 */
	void setQueryGALT(QueryGALTType value);

	/**
	 * Returns the value of the '<em><b>Query Logical Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Logical Time</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Logical Time</em>' containment reference.
	 * @see #setQueryLogicalTime(QueryLogicalTimeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryLogicalTime()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryLogicalTime' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryLogicalTimeType getQueryLogicalTime();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLogicalTime <em>Query Logical Time</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Logical Time</em>' containment reference.
	 * @see #getQueryLogicalTime()
	 * @generated
	 */
	void setQueryLogicalTime(QueryLogicalTimeType value);

	/**
	 * Returns the value of the '<em><b>Query LITS</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query LITS</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query LITS</em>' containment reference.
	 * @see #setQueryLITS(QueryLITSType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryLITS()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryLITS' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryLITSType getQueryLITS();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLITS <em>Query LITS</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query LITS</em>' containment reference.
	 * @see #getQueryLITS()
	 * @generated
	 */
	void setQueryLITS(QueryLITSType value);

	/**
	 * Returns the value of the '<em><b>Modify Lookahead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modify Lookahead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modify Lookahead</em>' containment reference.
	 * @see #setModifyLookahead(ModifyLookaheadType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ModifyLookahead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='modifyLookahead' namespace='##targetNamespace'"
	 * @generated
	 */
	ModifyLookaheadType getModifyLookahead();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getModifyLookahead <em>Modify Lookahead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Modify Lookahead</em>' containment reference.
	 * @see #getModifyLookahead()
	 * @generated
	 */
	void setModifyLookahead(ModifyLookaheadType value);

	/**
	 * Returns the value of the '<em><b>Query Lookahead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Query Lookahead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Query Lookahead</em>' containment reference.
	 * @see #setQueryLookahead(QueryLookaheadType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_QueryLookahead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='queryLookahead' namespace='##targetNamespace'"
	 * @generated
	 */
	QueryLookaheadType getQueryLookahead();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getQueryLookahead <em>Query Lookahead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Query Lookahead</em>' containment reference.
	 * @see #getQueryLookahead()
	 * @generated
	 */
	void setQueryLookahead(QueryLookaheadType value);

	/**
	 * Returns the value of the '<em><b>Retract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Retract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Retract</em>' containment reference.
	 * @see #setRetract(RetractType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Retract()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='retract' namespace='##targetNamespace'"
	 * @generated
	 */
	RetractType getRetract();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRetract <em>Retract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Retract</em>' containment reference.
	 * @see #getRetract()
	 * @generated
	 */
	void setRetract(RetractType value);

	/**
	 * Returns the value of the '<em><b>Request Retraction</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Retraction</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Retraction</em>' containment reference.
	 * @see #setRequestRetraction(RequestRetractionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestRetraction()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestRetraction' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestRetractionType getRequestRetraction();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestRetraction <em>Request Retraction</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Retraction</em>' containment reference.
	 * @see #getRequestRetraction()
	 * @generated
	 */
	void setRequestRetraction(RequestRetractionType value);

	/**
	 * Returns the value of the '<em><b>Change Attribute Order Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Attribute Order Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Attribute Order Type</em>' containment reference.
	 * @see #setChangeAttributeOrderType(ChangeAttributeOrderTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ChangeAttributeOrderType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeAttributeOrderType' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeAttributeOrderTypeType getChangeAttributeOrderType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getChangeAttributeOrderType <em>Change Attribute Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Attribute Order Type</em>' containment reference.
	 * @see #getChangeAttributeOrderType()
	 * @generated
	 */
	void setChangeAttributeOrderType(ChangeAttributeOrderTypeType value);

	/**
	 * Returns the value of the '<em><b>Change Interaction Order Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Change Interaction Order Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Change Interaction Order Type</em>' containment reference.
	 * @see #setChangeInteractionOrderType(ChangeInteractionOrderTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_ChangeInteractionOrderType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='changeInteractionOrderType' namespace='##targetNamespace'"
	 * @generated
	 */
	ChangeInteractionOrderTypeType getChangeInteractionOrderType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getChangeInteractionOrderType <em>Change Interaction Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Change Interaction Order Type</em>' containment reference.
	 * @see #getChangeInteractionOrderType()
	 * @generated
	 */
	void setChangeInteractionOrderType(ChangeInteractionOrderTypeType value);

	/**
	 * Returns the value of the '<em><b>Create Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Create Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create Region</em>' containment reference.
	 * @see #setCreateRegion(CreateRegionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_CreateRegion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='createRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	CreateRegionType getCreateRegion();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCreateRegion <em>Create Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Create Region</em>' containment reference.
	 * @see #getCreateRegion()
	 * @generated
	 */
	void setCreateRegion(CreateRegionType value);

	/**
	 * Returns the value of the '<em><b>Commit Region Modifications</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commit Region Modifications</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commit Region Modifications</em>' containment reference.
	 * @see #setCommitRegionModifications(CommitRegionModificationsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_CommitRegionModifications()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='commitRegionModifications' namespace='##targetNamespace'"
	 * @generated
	 */
	CommitRegionModificationsType getCommitRegionModifications();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getCommitRegionModifications <em>Commit Region Modifications</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commit Region Modifications</em>' containment reference.
	 * @see #getCommitRegionModifications()
	 * @generated
	 */
	void setCommitRegionModifications(CommitRegionModificationsType value);

	/**
	 * Returns the value of the '<em><b>Delete Region</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delete Region</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete Region</em>' containment reference.
	 * @see #setDeleteRegion(DeleteRegionType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DeleteRegion()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='deleteRegion' namespace='##targetNamespace'"
	 * @generated
	 */
	DeleteRegionType getDeleteRegion();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDeleteRegion <em>Delete Region</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delete Region</em>' containment reference.
	 * @see #getDeleteRegion()
	 * @generated
	 */
	void setDeleteRegion(DeleteRegionType value);

	/**
	 * Returns the value of the '<em><b>Register Object Instance With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Register Object Instance With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Register Object Instance With Regions</em>' containment reference.
	 * @see #setRegisterObjectInstanceWithRegions(RegisterObjectInstanceWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RegisterObjectInstanceWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='registerObjectInstanceWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	RegisterObjectInstanceWithRegionsType getRegisterObjectInstanceWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRegisterObjectInstanceWithRegions <em>Register Object Instance With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Register Object Instance With Regions</em>' containment reference.
	 * @see #getRegisterObjectInstanceWithRegions()
	 * @generated
	 */
	void setRegisterObjectInstanceWithRegions(RegisterObjectInstanceWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Associate Regions For Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associate Regions For Updates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associate Regions For Updates</em>' containment reference.
	 * @see #setAssociateRegionsForUpdates(AssociateRegionsForUpdatesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AssociateRegionsForUpdates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='associateRegionsForUpdates' namespace='##targetNamespace'"
	 * @generated
	 */
	AssociateRegionsForUpdatesType getAssociateRegionsForUpdates();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getAssociateRegionsForUpdates <em>Associate Regions For Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associate Regions For Updates</em>' containment reference.
	 * @see #getAssociateRegionsForUpdates()
	 * @generated
	 */
	void setAssociateRegionsForUpdates(AssociateRegionsForUpdatesType value);

	/**
	 * Returns the value of the '<em><b>Unassociate Regions For Updates</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unassociate Regions For Updates</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unassociate Regions For Updates</em>' containment reference.
	 * @see #setUnassociateRegionsForUpdates(UnassociateRegionsForUpdatesType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnassociateRegionsForUpdates()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unassociateRegionsForUpdates' namespace='##targetNamespace'"
	 * @generated
	 */
	UnassociateRegionsForUpdatesType getUnassociateRegionsForUpdates();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnassociateRegionsForUpdates <em>Unassociate Regions For Updates</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unassociate Regions For Updates</em>' containment reference.
	 * @see #getUnassociateRegionsForUpdates()
	 * @generated
	 */
	void setUnassociateRegionsForUpdates(UnassociateRegionsForUpdatesType value);

	/**
	 * Returns the value of the '<em><b>Subscribe Object Class Attributes With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Object Class Attributes With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Object Class Attributes With Regions</em>' containment reference.
	 * @see #setSubscribeObjectClassAttributesWithRegions(SubscribeObjectClassAttributesWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SubscribeObjectClassAttributesWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscribeObjectClassAttributesWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeObjectClassAttributesWithRegionsType getSubscribeObjectClassAttributesWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeObjectClassAttributesWithRegions <em>Subscribe Object Class Attributes With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Object Class Attributes With Regions</em>' containment reference.
	 * @see #getSubscribeObjectClassAttributesWithRegions()
	 * @generated
	 */
	void setSubscribeObjectClassAttributesWithRegions(SubscribeObjectClassAttributesWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Object Class Attributes With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsubscribe Object Class Attributes With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Object Class Attributes With Regions</em>' containment reference.
	 * @see #setUnsubscribeObjectClassAttributesWithRegions(UnsubscribeObjectClassAttributesWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnsubscribeObjectClassAttributesWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsubscribeObjectClassAttributesWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeObjectClassAttributesWithRegionsType getUnsubscribeObjectClassAttributesWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeObjectClassAttributesWithRegions <em>Unsubscribe Object Class Attributes With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Object Class Attributes With Regions</em>' containment reference.
	 * @see #getUnsubscribeObjectClassAttributesWithRegions()
	 * @generated
	 */
	void setUnsubscribeObjectClassAttributesWithRegions(UnsubscribeObjectClassAttributesWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Subscribe Interaction Class With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subscribe Interaction Class With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subscribe Interaction Class With Regions</em>' containment reference.
	 * @see #setSubscribeInteractionClassWithRegions(SubscribeInteractionClassWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SubscribeInteractionClassWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='subscribeInteractionClassWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	SubscribeInteractionClassWithRegionsType getSubscribeInteractionClassWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSubscribeInteractionClassWithRegions <em>Subscribe Interaction Class With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subscribe Interaction Class With Regions</em>' containment reference.
	 * @see #getSubscribeInteractionClassWithRegions()
	 * @generated
	 */
	void setSubscribeInteractionClassWithRegions(SubscribeInteractionClassWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Unsubscribe Interaction Class With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unsubscribe Interaction Class With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unsubscribe Interaction Class With Regions</em>' containment reference.
	 * @see #setUnsubscribeInteractionClassWithRegions(UnsubscribeInteractionClassWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_UnsubscribeInteractionClassWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='unsubscribeInteractionClassWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	UnsubscribeInteractionClassWithRegionsType getUnsubscribeInteractionClassWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getUnsubscribeInteractionClassWithRegions <em>Unsubscribe Interaction Class With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unsubscribe Interaction Class With Regions</em>' containment reference.
	 * @see #getUnsubscribeInteractionClassWithRegions()
	 * @generated
	 */
	void setUnsubscribeInteractionClassWithRegions(UnsubscribeInteractionClassWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Send Interaction With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Send Interaction With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Send Interaction With Regions</em>' containment reference.
	 * @see #setSendInteractionWithRegions(SendInteractionWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SendInteractionWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='sendInteractionWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	SendInteractionWithRegionsType getSendInteractionWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSendInteractionWithRegions <em>Send Interaction With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Send Interaction With Regions</em>' containment reference.
	 * @see #getSendInteractionWithRegions()
	 * @generated
	 */
	void setSendInteractionWithRegions(SendInteractionWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Request Attribute Value Update With Regions</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Attribute Value Update With Regions</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Attribute Value Update With Regions</em>' containment reference.
	 * @see #setRequestAttributeValueUpdateWithRegions(RequestAttributeValueUpdateWithRegionsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_RequestAttributeValueUpdateWithRegions()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='requestAttributeValueUpdateWithRegions' namespace='##targetNamespace'"
	 * @generated
	 */
	RequestAttributeValueUpdateWithRegionsType getRequestAttributeValueUpdateWithRegions();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getRequestAttributeValueUpdateWithRegions <em>Request Attribute Value Update With Regions</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Request Attribute Value Update With Regions</em>' containment reference.
	 * @see #getRequestAttributeValueUpdateWithRegions()
	 * @generated
	 */
	void setRequestAttributeValueUpdateWithRegions(RequestAttributeValueUpdateWithRegionsType value);

	/**
	 * Returns the value of the '<em><b>Get Automatic Resign Directive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Automatic Resign Directive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Automatic Resign Directive</em>' containment reference.
	 * @see #setGetAutomaticResignDirective(GetAutomaticResignDirectiveType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetAutomaticResignDirective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getAutomaticResignDirective' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAutomaticResignDirectiveType getGetAutomaticResignDirective();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAutomaticResignDirective <em>Get Automatic Resign Directive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Automatic Resign Directive</em>' containment reference.
	 * @see #getGetAutomaticResignDirective()
	 * @generated
	 */
	void setGetAutomaticResignDirective(GetAutomaticResignDirectiveType value);

	/**
	 * Returns the value of the '<em><b>Set Automatic Resign Directive</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Automatic Resign Directive</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Automatic Resign Directive</em>' containment reference.
	 * @see #setSetAutomaticResignDirective(SetAutomaticResignDirectiveType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SetAutomaticResignDirective()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setAutomaticResignDirective' namespace='##targetNamespace'"
	 * @generated
	 */
	SetAutomaticResignDirectiveType getSetAutomaticResignDirective();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSetAutomaticResignDirective <em>Set Automatic Resign Directive</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Automatic Resign Directive</em>' containment reference.
	 * @see #getSetAutomaticResignDirective()
	 * @generated
	 */
	void setSetAutomaticResignDirective(SetAutomaticResignDirectiveType value);

	/**
	 * Returns the value of the '<em><b>Get Federate Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Federate Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Federate Handle</em>' containment reference.
	 * @see #setGetFederateHandle(GetFederateHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetFederateHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getFederateHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetFederateHandleType getGetFederateHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetFederateHandle <em>Get Federate Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Federate Handle</em>' containment reference.
	 * @see #getGetFederateHandle()
	 * @generated
	 */
	void setGetFederateHandle(GetFederateHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Federate Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Federate Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Federate Name</em>' containment reference.
	 * @see #setGetFederateName(GetFederateNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetFederateName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getFederateName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetFederateNameType getGetFederateName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetFederateName <em>Get Federate Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Federate Name</em>' containment reference.
	 * @see #getGetFederateName()
	 * @generated
	 */
	void setGetFederateName(GetFederateNameType value);

	/**
	 * Returns the value of the '<em><b>Get Object Class Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Object Class Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object Class Handle</em>' containment reference.
	 * @see #setGetObjectClassHandle(GetObjectClassHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetObjectClassHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getObjectClassHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectClassHandleType getGetObjectClassHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectClassHandle <em>Get Object Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object Class Handle</em>' containment reference.
	 * @see #getGetObjectClassHandle()
	 * @generated
	 */
	void setGetObjectClassHandle(GetObjectClassHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Object Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Object Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object Class Name</em>' containment reference.
	 * @see #setGetObjectClassName(GetObjectClassNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetObjectClassName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getObjectClassName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectClassNameType getGetObjectClassName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectClassName <em>Get Object Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object Class Name</em>' containment reference.
	 * @see #getGetObjectClassName()
	 * @generated
	 */
	void setGetObjectClassName(GetObjectClassNameType value);

	/**
	 * Returns the value of the '<em><b>Get Known Object Class Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Known Object Class Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Known Object Class Handle</em>' containment reference.
	 * @see #setGetKnownObjectClassHandle(GetKnownObjectClassHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetKnownObjectClassHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getKnownObjectClassHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetKnownObjectClassHandleType getGetKnownObjectClassHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetKnownObjectClassHandle <em>Get Known Object Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Known Object Class Handle</em>' containment reference.
	 * @see #getGetKnownObjectClassHandle()
	 * @generated
	 */
	void setGetKnownObjectClassHandle(GetKnownObjectClassHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Object Instance Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Object Instance Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object Instance Handle</em>' containment reference.
	 * @see #setGetObjectInstanceHandle(GetObjectInstanceHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetObjectInstanceHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getObjectInstanceHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectInstanceHandleType getGetObjectInstanceHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectInstanceHandle <em>Get Object Instance Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object Instance Handle</em>' containment reference.
	 * @see #getGetObjectInstanceHandle()
	 * @generated
	 */
	void setGetObjectInstanceHandle(GetObjectInstanceHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Object Instance Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Object Instance Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Object Instance Name</em>' containment reference.
	 * @see #setGetObjectInstanceName(GetObjectInstanceNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetObjectInstanceName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getObjectInstanceName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetObjectInstanceNameType getGetObjectInstanceName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetObjectInstanceName <em>Get Object Instance Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Object Instance Name</em>' containment reference.
	 * @see #getGetObjectInstanceName()
	 * @generated
	 */
	void setGetObjectInstanceName(GetObjectInstanceNameType value);

	/**
	 * Returns the value of the '<em><b>Get Attribute Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Attribute Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Attribute Handle</em>' containment reference.
	 * @see #setGetAttributeHandle(GetAttributeHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetAttributeHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getAttributeHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAttributeHandleType getGetAttributeHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAttributeHandle <em>Get Attribute Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Attribute Handle</em>' containment reference.
	 * @see #getGetAttributeHandle()
	 * @generated
	 */
	void setGetAttributeHandle(GetAttributeHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Attribute Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Attribute Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Attribute Name</em>' containment reference.
	 * @see #setGetAttributeName(GetAttributeNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetAttributeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getAttributeName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAttributeNameType getGetAttributeName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAttributeName <em>Get Attribute Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Attribute Name</em>' containment reference.
	 * @see #getGetAttributeName()
	 * @generated
	 */
	void setGetAttributeName(GetAttributeNameType value);

	/**
	 * Returns the value of the '<em><b>Get Update Rate Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Update Rate Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Update Rate Value</em>' containment reference.
	 * @see #setGetUpdateRateValue(GetUpdateRateValueType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetUpdateRateValue()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getUpdateRateValue' namespace='##targetNamespace'"
	 * @generated
	 */
	GetUpdateRateValueType getGetUpdateRateValue();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetUpdateRateValue <em>Get Update Rate Value</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Update Rate Value</em>' containment reference.
	 * @see #getGetUpdateRateValue()
	 * @generated
	 */
	void setGetUpdateRateValue(GetUpdateRateValueType value);

	/**
	 * Returns the value of the '<em><b>Get Update Rate Value For Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Update Rate Value For Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Update Rate Value For Attribute</em>' containment reference.
	 * @see #setGetUpdateRateValueForAttribute(GetUpdateRateValueForAttributeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetUpdateRateValueForAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getUpdateRateValueForAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	GetUpdateRateValueForAttributeType getGetUpdateRateValueForAttribute();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetUpdateRateValueForAttribute <em>Get Update Rate Value For Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Update Rate Value For Attribute</em>' containment reference.
	 * @see #getGetUpdateRateValueForAttribute()
	 * @generated
	 */
	void setGetUpdateRateValueForAttribute(GetUpdateRateValueForAttributeType value);

	/**
	 * Returns the value of the '<em><b>Get Interaction Class Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Interaction Class Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Interaction Class Handle</em>' containment reference.
	 * @see #setGetInteractionClassHandle(GetInteractionClassHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetInteractionClassHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getInteractionClassHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetInteractionClassHandleType getGetInteractionClassHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetInteractionClassHandle <em>Get Interaction Class Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Interaction Class Handle</em>' containment reference.
	 * @see #getGetInteractionClassHandle()
	 * @generated
	 */
	void setGetInteractionClassHandle(GetInteractionClassHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Interaction Class Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Interaction Class Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Interaction Class Name</em>' containment reference.
	 * @see #setGetInteractionClassName(GetInteractionClassNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetInteractionClassName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getInteractionClassName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetInteractionClassNameType getGetInteractionClassName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetInteractionClassName <em>Get Interaction Class Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Interaction Class Name</em>' containment reference.
	 * @see #getGetInteractionClassName()
	 * @generated
	 */
	void setGetInteractionClassName(GetInteractionClassNameType value);

	/**
	 * Returns the value of the '<em><b>Get Parameter Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Parameter Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Parameter Handle</em>' containment reference.
	 * @see #setGetParameterHandle(GetParameterHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetParameterHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getParameterHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetParameterHandleType getGetParameterHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetParameterHandle <em>Get Parameter Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Parameter Handle</em>' containment reference.
	 * @see #getGetParameterHandle()
	 * @generated
	 */
	void setGetParameterHandle(GetParameterHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Parameter Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Parameter Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Parameter Name</em>' containment reference.
	 * @see #setGetParameterName(GetParameterNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetParameterName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getParameterName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetParameterNameType getGetParameterName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetParameterName <em>Get Parameter Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Parameter Name</em>' containment reference.
	 * @see #getGetParameterName()
	 * @generated
	 */
	void setGetParameterName(GetParameterNameType value);

	/**
	 * Returns the value of the '<em><b>Get Order Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Order Type</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Order Type</em>' containment reference.
	 * @see #setGetOrderType(GetOrderTypeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetOrderType()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getOrderType' namespace='##targetNamespace'"
	 * @generated
	 */
	GetOrderTypeType getGetOrderType();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetOrderType <em>Get Order Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Order Type</em>' containment reference.
	 * @see #getGetOrderType()
	 * @generated
	 */
	void setGetOrderType(GetOrderTypeType value);

	/**
	 * Returns the value of the '<em><b>Get Order Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Order Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Order Name</em>' containment reference.
	 * @see #setGetOrderName(GetOrderNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetOrderName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getOrderName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetOrderNameType getGetOrderName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetOrderName <em>Get Order Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Order Name</em>' containment reference.
	 * @see #getGetOrderName()
	 * @generated
	 */
	void setGetOrderName(GetOrderNameType value);

	/**
	 * Returns the value of the '<em><b>Get Transportation Type Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Transportation Type Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Transportation Type Handle</em>' containment reference.
	 * @see #setGetTransportationTypeHandle(GetTransportationTypeHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetTransportationTypeHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getTransportationTypeHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetTransportationTypeHandleType getGetTransportationTypeHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetTransportationTypeHandle <em>Get Transportation Type Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Transportation Type Handle</em>' containment reference.
	 * @see #getGetTransportationTypeHandle()
	 * @generated
	 */
	void setGetTransportationTypeHandle(GetTransportationTypeHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Transportation Type Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Transportation Type Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Transportation Type Name</em>' containment reference.
	 * @see #setGetTransportationTypeName(GetTransportationTypeNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetTransportationTypeName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getTransportationTypeName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetTransportationTypeNameType getGetTransportationTypeName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetTransportationTypeName <em>Get Transportation Type Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Transportation Type Name</em>' containment reference.
	 * @see #getGetTransportationTypeName()
	 * @generated
	 */
	void setGetTransportationTypeName(GetTransportationTypeNameType value);

	/**
	 * Returns the value of the '<em><b>Get Available Dimensions For Class Attribute</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Available Dimensions For Class Attribute</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Available Dimensions For Class Attribute</em>' containment reference.
	 * @see #setGetAvailableDimensionsForClassAttribute(GetAvailableDimensionsForClassAttributeType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetAvailableDimensionsForClassAttribute()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getAvailableDimensionsForClassAttribute' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAvailableDimensionsForClassAttributeType getGetAvailableDimensionsForClassAttribute();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAvailableDimensionsForClassAttribute <em>Get Available Dimensions For Class Attribute</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Available Dimensions For Class Attribute</em>' containment reference.
	 * @see #getGetAvailableDimensionsForClassAttribute()
	 * @generated
	 */
	void setGetAvailableDimensionsForClassAttribute(GetAvailableDimensionsForClassAttributeType value);

	/**
	 * Returns the value of the '<em><b>Get Available Dimensions For Interaction Class</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Available Dimensions For Interaction Class</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Available Dimensions For Interaction Class</em>' containment reference.
	 * @see #setGetAvailableDimensionsForInteractionClass(GetAvailableDimensionsForInteractionClassType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetAvailableDimensionsForInteractionClass()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getAvailableDimensionsForInteractionClass' namespace='##targetNamespace'"
	 * @generated
	 */
	GetAvailableDimensionsForInteractionClassType getGetAvailableDimensionsForInteractionClass();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetAvailableDimensionsForInteractionClass <em>Get Available Dimensions For Interaction Class</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Available Dimensions For Interaction Class</em>' containment reference.
	 * @see #getGetAvailableDimensionsForInteractionClass()
	 * @generated
	 */
	void setGetAvailableDimensionsForInteractionClass(GetAvailableDimensionsForInteractionClassType value);

	/**
	 * Returns the value of the '<em><b>Get Dimension Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Dimension Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Dimension Handle</em>' containment reference.
	 * @see #setGetDimensionHandle(GetDimensionHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetDimensionHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getDimensionHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDimensionHandleType getGetDimensionHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionHandle <em>Get Dimension Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Dimension Handle</em>' containment reference.
	 * @see #getGetDimensionHandle()
	 * @generated
	 */
	void setGetDimensionHandle(GetDimensionHandleType value);

	/**
	 * Returns the value of the '<em><b>Get Dimension Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Dimension Name</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Dimension Name</em>' containment reference.
	 * @see #setGetDimensionName(GetDimensionNameType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetDimensionName()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getDimensionName' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDimensionNameType getGetDimensionName();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionName <em>Get Dimension Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Dimension Name</em>' containment reference.
	 * @see #getGetDimensionName()
	 * @generated
	 */
	void setGetDimensionName(GetDimensionNameType value);

	/**
	 * Returns the value of the '<em><b>Get Dimension Upper Bound</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Dimension Upper Bound</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Dimension Upper Bound</em>' containment reference.
	 * @see #setGetDimensionUpperBound(GetDimensionUpperBoundType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetDimensionUpperBound()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getDimensionUpperBound' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDimensionUpperBoundType getGetDimensionUpperBound();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionUpperBound <em>Get Dimension Upper Bound</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Dimension Upper Bound</em>' containment reference.
	 * @see #getGetDimensionUpperBound()
	 * @generated
	 */
	void setGetDimensionUpperBound(GetDimensionUpperBoundType value);

	/**
	 * Returns the value of the '<em><b>Get Dimension Handle Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Dimension Handle Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Dimension Handle Set</em>' containment reference.
	 * @see #setGetDimensionHandleSet(GetDimensionHandleSetType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetDimensionHandleSet()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getDimensionHandleSet' namespace='##targetNamespace'"
	 * @generated
	 */
	GetDimensionHandleSetType getGetDimensionHandleSet();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetDimensionHandleSet <em>Get Dimension Handle Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Dimension Handle Set</em>' containment reference.
	 * @see #getGetDimensionHandleSet()
	 * @generated
	 */
	void setGetDimensionHandleSet(GetDimensionHandleSetType value);

	/**
	 * Returns the value of the '<em><b>Get Range Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Get Range Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Get Range Bounds</em>' containment reference.
	 * @see #setGetRangeBounds(GetRangeBoundsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_GetRangeBounds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='getRangeBounds' namespace='##targetNamespace'"
	 * @generated
	 */
	GetRangeBoundsType getGetRangeBounds();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getGetRangeBounds <em>Get Range Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Get Range Bounds</em>' containment reference.
	 * @see #getGetRangeBounds()
	 * @generated
	 */
	void setGetRangeBounds(GetRangeBoundsType value);

	/**
	 * Returns the value of the '<em><b>Set Range Bounds</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Set Range Bounds</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Set Range Bounds</em>' containment reference.
	 * @see #setSetRangeBounds(SetRangeBoundsType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_SetRangeBounds()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='setRangeBounds' namespace='##targetNamespace'"
	 * @generated
	 */
	SetRangeBoundsType getSetRangeBounds();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getSetRangeBounds <em>Set Range Bounds</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Set Range Bounds</em>' containment reference.
	 * @see #getSetRangeBounds()
	 * @generated
	 */
	void setSetRangeBounds(SetRangeBoundsType value);

	/**
	 * Returns the value of the '<em><b>Normalize Federate Handle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalize Federate Handle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalize Federate Handle</em>' containment reference.
	 * @see #setNormalizeFederateHandle(NormalizeFederateHandleType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_NormalizeFederateHandle()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='normalizeFederateHandle' namespace='##targetNamespace'"
	 * @generated
	 */
	NormalizeFederateHandleType getNormalizeFederateHandle();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNormalizeFederateHandle <em>Normalize Federate Handle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalize Federate Handle</em>' containment reference.
	 * @see #getNormalizeFederateHandle()
	 * @generated
	 */
	void setNormalizeFederateHandle(NormalizeFederateHandleType value);

	/**
	 * Returns the value of the '<em><b>Normalize Service Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Normalize Service Group</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Normalize Service Group</em>' containment reference.
	 * @see #setNormalizeServiceGroup(NormalizeServiceGroupType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_NormalizeServiceGroup()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='normalizeServiceGroup' namespace='##targetNamespace'"
	 * @generated
	 */
	NormalizeServiceGroupType getNormalizeServiceGroup();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNormalizeServiceGroup <em>Normalize Service Group</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Normalize Service Group</em>' containment reference.
	 * @see #getNormalizeServiceGroup()
	 * @generated
	 */
	void setNormalizeServiceGroup(NormalizeServiceGroupType value);

	/**
	 * Returns the value of the '<em><b>Enable Object Class Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Object Class Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Object Class Relevance Advisory Switch</em>' containment reference.
	 * @see #setEnableObjectClassRelevanceAdvisorySwitch(EnableObjectClassRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableObjectClassRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableObjectClassRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableObjectClassRelevanceAdvisorySwitchType getEnableObjectClassRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableObjectClassRelevanceAdvisorySwitch <em>Enable Object Class Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Object Class Relevance Advisory Switch</em>' containment reference.
	 * @see #getEnableObjectClassRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setEnableObjectClassRelevanceAdvisorySwitch(EnableObjectClassRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Disable Object Class Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Object Class Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Object Class Relevance Advisory Switch</em>' containment reference.
	 * @see #setDisableObjectClassRelevanceAdvisorySwitch(DisableObjectClassRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableObjectClassRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableObjectClassRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableObjectClassRelevanceAdvisorySwitchType getDisableObjectClassRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableObjectClassRelevanceAdvisorySwitch <em>Disable Object Class Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Object Class Relevance Advisory Switch</em>' containment reference.
	 * @see #getDisableObjectClassRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setDisableObjectClassRelevanceAdvisorySwitch(DisableObjectClassRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Enable Attribute Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Attribute Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Attribute Relevance Advisory Switch</em>' containment reference.
	 * @see #setEnableAttributeRelevanceAdvisorySwitch(EnableAttributeRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableAttributeRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableAttributeRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableAttributeRelevanceAdvisorySwitchType getEnableAttributeRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAttributeRelevanceAdvisorySwitch <em>Enable Attribute Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Attribute Relevance Advisory Switch</em>' containment reference.
	 * @see #getEnableAttributeRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setEnableAttributeRelevanceAdvisorySwitch(EnableAttributeRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Disable Attribute Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Attribute Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Attribute Relevance Advisory Switch</em>' containment reference.
	 * @see #setDisableAttributeRelevanceAdvisorySwitch(DisableAttributeRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableAttributeRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableAttributeRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableAttributeRelevanceAdvisorySwitchType getDisableAttributeRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAttributeRelevanceAdvisorySwitch <em>Disable Attribute Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Attribute Relevance Advisory Switch</em>' containment reference.
	 * @see #getDisableAttributeRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setDisableAttributeRelevanceAdvisorySwitch(DisableAttributeRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Enable Attribute Scope Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Attribute Scope Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Attribute Scope Advisory Switch</em>' containment reference.
	 * @see #setEnableAttributeScopeAdvisorySwitch(EnableAttributeScopeAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableAttributeScopeAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableAttributeScopeAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableAttributeScopeAdvisorySwitchType getEnableAttributeScopeAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableAttributeScopeAdvisorySwitch <em>Enable Attribute Scope Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Attribute Scope Advisory Switch</em>' containment reference.
	 * @see #getEnableAttributeScopeAdvisorySwitch()
	 * @generated
	 */
	void setEnableAttributeScopeAdvisorySwitch(EnableAttributeScopeAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Disable Attribute Scope Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Attribute Scope Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Attribute Scope Advisory Switch</em>' containment reference.
	 * @see #setDisableAttributeScopeAdvisorySwitch(DisableAttributeScopeAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableAttributeScopeAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableAttributeScopeAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableAttributeScopeAdvisorySwitchType getDisableAttributeScopeAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableAttributeScopeAdvisorySwitch <em>Disable Attribute Scope Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Attribute Scope Advisory Switch</em>' containment reference.
	 * @see #getDisableAttributeScopeAdvisorySwitch()
	 * @generated
	 */
	void setDisableAttributeScopeAdvisorySwitch(DisableAttributeScopeAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Enable Interaction Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Interaction Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Interaction Relevance Advisory Switch</em>' containment reference.
	 * @see #setEnableInteractionRelevanceAdvisorySwitch(EnableInteractionRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableInteractionRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableInteractionRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableInteractionRelevanceAdvisorySwitchType getEnableInteractionRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableInteractionRelevanceAdvisorySwitch <em>Enable Interaction Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Interaction Relevance Advisory Switch</em>' containment reference.
	 * @see #getEnableInteractionRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setEnableInteractionRelevanceAdvisorySwitch(EnableInteractionRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Disable Interaction Relevance Advisory Switch</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Interaction Relevance Advisory Switch</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Interaction Relevance Advisory Switch</em>' containment reference.
	 * @see #setDisableInteractionRelevanceAdvisorySwitch(DisableInteractionRelevanceAdvisorySwitchType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableInteractionRelevanceAdvisorySwitch()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableInteractionRelevanceAdvisorySwitch' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableInteractionRelevanceAdvisorySwitchType getDisableInteractionRelevanceAdvisorySwitch();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableInteractionRelevanceAdvisorySwitch <em>Disable Interaction Relevance Advisory Switch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Interaction Relevance Advisory Switch</em>' containment reference.
	 * @see #getDisableInteractionRelevanceAdvisorySwitch()
	 * @generated
	 */
	void setDisableInteractionRelevanceAdvisorySwitch(DisableInteractionRelevanceAdvisorySwitchType value);

	/**
	 * Returns the value of the '<em><b>Evoke Callback</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evoke Callback</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evoke Callback</em>' containment reference.
	 * @see #setEvokeCallback(EvokeCallbackType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EvokeCallback()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evokeCallback' namespace='##targetNamespace'"
	 * @generated
	 */
	EvokeCallbackType getEvokeCallback();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEvokeCallback <em>Evoke Callback</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evoke Callback</em>' containment reference.
	 * @see #getEvokeCallback()
	 * @generated
	 */
	void setEvokeCallback(EvokeCallbackType value);

	/**
	 * Returns the value of the '<em><b>Evoke Multiple Callbacks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Evoke Multiple Callbacks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Evoke Multiple Callbacks</em>' containment reference.
	 * @see #setEvokeMultipleCallbacks(EvokeMultipleCallbacksType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EvokeMultipleCallbacks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='evokeMultipleCallbacks' namespace='##targetNamespace'"
	 * @generated
	 */
	EvokeMultipleCallbacksType getEvokeMultipleCallbacks();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEvokeMultipleCallbacks <em>Evoke Multiple Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Evoke Multiple Callbacks</em>' containment reference.
	 * @see #getEvokeMultipleCallbacks()
	 * @generated
	 */
	void setEvokeMultipleCallbacks(EvokeMultipleCallbacksType value);

	/**
	 * Returns the value of the '<em><b>Enable Callbacks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enable Callbacks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enable Callbacks</em>' containment reference.
	 * @see #setEnableCallbacks(EnableCallbacksType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_EnableCallbacks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='enableCallbacks' namespace='##targetNamespace'"
	 * @generated
	 */
	EnableCallbacksType getEnableCallbacks();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getEnableCallbacks <em>Enable Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enable Callbacks</em>' containment reference.
	 * @see #getEnableCallbacks()
	 * @generated
	 */
	void setEnableCallbacks(EnableCallbacksType value);

	/**
	 * Returns the value of the '<em><b>Disable Callbacks</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Disable Callbacks</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Disable Callbacks</em>' containment reference.
	 * @see #setDisableCallbacks(DisableCallbacksType)
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_DisableCallbacks()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='disableCallbacks' namespace='##targetNamespace'"
	 * @generated
	 */
	DisableCallbacksType getDisableCallbacks();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getDisableCallbacks <em>Disable Callbacks</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Disable Callbacks</em>' containment reference.
	 * @see #getDisableCallbacks()
	 * @generated
	 */
	void setDisableCallbacks(DisableCallbacksType value);

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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Idtag()
	 * @model id="true" dataType="org.eclipse.emf.ecore.xml.type.ID"
	 *        extendedMetaData="kind='attribute' name='idtag'"
	 * @generated
	 */
	String getIdtag();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getIdtag <em>Idtag</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_Notes()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.IDREFS" many="false"
	 *        extendedMetaData="kind='attribute' name='notes'"
	 * @generated
	 */
	List<String> getNotes();

	/**
	 * Sets the value of the '{@link org.ieee.standards.ieee1516._2010.ServiceUtilizationType#getNotes <em>Notes</em>}' attribute.
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
	 * @see org.ieee.standards.ieee1516._2010._2010Package#getServiceUtilizationType_AnyAttribute()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='attributeWildcard' wildcards='##other' name=':170' processing='strict'"
	 * @generated
	 */
	FeatureMap getAnyAttribute();

} // ServiceUtilizationType
