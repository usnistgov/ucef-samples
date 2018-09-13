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

public class ICICIBankBase extends SynchronizedFederate {

	private SubscribedInteractionFilter _subscribedInteractionFilter = new SubscribedInteractionFilter();
	
	// constructor
	public ICICIBankBase(FederateConfig config) throws Exception {
		super(config);

		super.createLRC();
		super.joinFederation();

		enableTimeConstrained();

		enableTimeRegulation(getLookAhead());
		enableAsynchronousDelivery();
        // interaction pubsub
        
        IndianTransferReceipt.publish(getLRC());
        Namaste.publish(getLRC());
        IndianMoneyGram.publish(getLRC());
        CurrentAssetsInBillionUSDs.publish(getLRC());
        
        BadDebt.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			BadDebt.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        Namaste.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			Namaste.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        IndianTransferReceipt.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			IndianTransferReceipt.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        IndianMoneyGram.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			IndianMoneyGram.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.MAPPER 
		);
        FedRescue.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			FedRescue.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        MoodysAnalysis.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			MoodysAnalysis.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);
        StandardAndPoorsAnalysis.subscribe(getLRC());
        _subscribedInteractionFilter.setFedFilters( 
			StandardAndPoorsAnalysis.get_handle(), 
			SubscribedInteractionFilter.OriginFedFilter.ORIGIN_FILTER_DISABLED, 
			SubscribedInteractionFilter.SourceFedFilter.SOURCE_FILTER_DISABLED 
		);		
		// object pubsub
                	}
        
	
	public IndianTransferReceipt create_IndianTransferReceipt() {
	   IndianTransferReceipt interaction = new IndianTransferReceipt();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public Namaste create_Namaste() {
	   Namaste interaction = new Namaste();
	   interaction.set_sourceFed( getFederateId() );
	   interaction.set_originFed( getFederateId() );
	   return interaction;
	}
	public IndianMoneyGram create_IndianMoneyGram() {
	   IndianMoneyGram interaction = new IndianMoneyGram();
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
