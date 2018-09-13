package MapperEx;

import hla.rti.EventRetractionHandle;
import hla.rti.LogicalTime;
import hla.rti.ReceivedInteraction;

import org.cpswt.hla.C2WInteractionRoot;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.SubscribedInteractionFilter;
import org.cpswt.hla.SynchronizedFederate;

import org.cpswt.config.FederateConfig;

import org.cpswt.*;

public class BankOfAmericaBase extends SynchronizedFederate {

	private SubscribedInteractionFilter _subscribedInteractionFilter = new SubscribedInteractionFilter();
	
	// constructor
	public BankOfAmericaBase(FederateConfig config) throws Exception {
		super(config);

		super.createLRC();
		super.joinFederation();

		enableTimeConstrained();

		enableTimeRegulation(getLookAhead());
		enableAsynchronousDelivery();
        // interaction pubsub
        
        EUDebtBAC.publish(getLRC());
        Hello.publish(getLRC());
        USTransferReceipt.publish(getLRC());
        CurrentAssetsInBillionUSDs.publish(getLRC());
        USMoneyGram.publish(getLRC());
        
        BadDebt.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			BadDebt.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        EUDebtBAC.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			EUDebtBAC.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        USMoneyGram.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			USMoneyGram.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        Hello.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			Hello.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        USTransferReceipt.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			USTransferReceipt.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        FedRescue.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			FedRescue.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        StandardAndPoorsAnalysis.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			StandardAndPoorsAnalysis.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        MoodysAnalysis.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			MoodysAnalysis.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);		
		// object pubsub
                	}
        
	
	public EUDebtBAC create_EUDebtBAC() {
	   EUDebtBAC interaction = new EUDebtBAC();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public Hello create_Hello() {
	   Hello interaction = new Hello();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public USTransferReceipt create_USTransferReceipt() {
	   USTransferReceipt interaction = new USTransferReceipt();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public CurrentAssetsInBillionUSDs create_CurrentAssetsInBillionUSDs() {
	   CurrentAssetsInBillionUSDs interaction = new CurrentAssetsInBillionUSDs();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public USMoneyGram create_USMoneyGram() {
	   USMoneyGram interaction = new USMoneyGram();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	@Override
	public void receiveInteraction(
	 int interactionClass, ReceivedInteraction theInteraction, byte[] userSuppliedTag
	) {
		InteractionRoot interactionRoot = InteractionRoot.create_interaction( interactionClass, theInteraction );
		if ( interactionRoot instanceof C2WInteractionRoot ) {
			
			C2WInteractionRoot c2wInteractionRoot = (C2WInteractionRoot)interactionRoot;

	        // Filter interaction if src/origin fed requirements (if any) are not met
	        if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRoot )  ) {
	        	return;
	        } 
		}
		
		super.receiveInteraction( interactionClass, theInteraction, userSuppliedTag );			
	}

	@Override
	public void receiveInteraction(
	 int interactionClass,
	 ReceivedInteraction theInteraction,
	 byte[] userSuppliedTag,
	 LogicalTime theTime,
	 EventRetractionHandle retractionHandle
	) {
		InteractionRoot interactionRoot = InteractionRoot.create_interaction( interactionClass, theInteraction, theTime );
		if ( interactionRoot instanceof C2WInteractionRoot ) {

			C2WInteractionRoot c2wInteractionRoot = (C2WInteractionRoot)interactionRoot;

	        // Filter interaction if src/origin fed requirements (if any) are not met
	        if (  _subscribedInteractionFilter.filterC2WInteraction( getFederateId(), c2wInteractionRoot )  ) {
	        	return;
	        } 
		}

		super.receiveInteraction( interactionClass, theInteraction, userSuppliedTag, theTime, retractionHandle );			
	}
}
