
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The CurrentAssetsInBillionUSDs class implements the CurrentAssetsInBillionUSDs interaction in the
* MapperEx simulation.
*/
public class CurrentAssetsInBillionUSDs extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(CurrentAssetsInBillionUSDs.class);

	/**
	* Default constructor -- creates an instance of the CurrentAssetsInBillionUSDs interaction
	* class with default parameter values.
	*/
	public CurrentAssetsInBillionUSDs() { }

	
	
	private static int _dollars_handle;
	private static int _sender_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "dollars" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dollars" parameter
	*/
	public static int get_dollars_handle() { return _dollars_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "sender" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "sender" parameter
	*/
	public static int get_sender_handle() { return _sender_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the CurrentAssetsInBillionUSDs interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the CurrentAssetsInBillionUSDs
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the CurrentAssetsInBillionUSDs interaction class.
	*/
	public static String get_simple_class_name() { return "CurrentAssetsInBillionUSDs"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* CurrentAssetsInBillionUSDs interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_parameter_names() {
		return new HashSet< String >(_datamemberNames);
	}


	/**
	* Returns a set containing the names of all of the parameters in the
	* CurrentAssetsInBillionUSDs interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_all_parameter_names() {
		return new HashSet< String >(_allDatamemberNames);
	}


	

	static {
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs", CurrentAssetsInBillionUSDs.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs", _allDatamemberNames);

		
		
		
		_datamemberNames.add("dollars");
		
		
		_datamemberNames.add("sender");
		
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("dollars");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sender");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("dollars", "int");
		_datamemberTypeMap.put("sender", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs");
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;				
			} catch (NameNotFound n) {
				logger.error("{} Name Not Found", initErrorMessage);
				logger.error(n);
				return;				
			} catch (Exception e) {
				logger.error(e);
				CpswtUtils.sleepDefault();
			}
		}

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs");
		_classHandleSimpleNameMap.put(get_handle(), "CurrentAssetsInBillionUSDs");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_dollars_handle = rti.getParameterHandle("dollars", get_handle());			
				_sender_handle = rti.getParameterHandle("sender", get_handle());
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;
			} catch (InteractionClassNotDefined i) {
				logger.error("{} Interaction Class Not Defined", initErrorMessage);
				logger.error(i);
				return;
			} catch (NameNotFound n) {
				logger.error("{} Name Not Found", initErrorMessage);
				logger.error(n);
				return;
			} catch (Exception e) {
				logger.error(e);
				CpswtUtils.sleepDefault();
			}
		}
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs,dollars", get_dollars_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs,sender", get_sender_handle());
			
			
		_datamemberHandleNameMap.put(get_dollars_handle(), "dollars");
		_datamemberHandleNameMap.put(get_sender_handle(), "sender");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs:  could not publish:  ";

	/**
	* Publishes the CurrentAssetsInBillionUSDs interaction class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

	

		synchronized(rti) {
			boolean isNotPublished = true;
			while(isNotPublished) {
				try {
					rti.publishInteractionClass(get_handle());
					isNotPublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", publishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", publishErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isPublished = true;
	}

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs:  could not unpublish:  ";
	/**
	* Unpublishes the CurrentAssetsInBillionUSDs interaction class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void unpublish(RTIambassador rti) {
		if (!_isPublished) return;
		
		init(rti);
		synchronized(rti) {
			boolean isNotUnpublished = true;
			while(isNotUnpublished) {
				try {
					rti.unpublishInteractionClass(get_handle());
					isNotUnpublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unpublishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotPublished i) {
					logger.error("{} Interaction Class Not Published", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isPublished = false;
	}

	private static boolean _isSubscribed = false;
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs:  could not subscribe:  ";
	/**
	* Subscribes a federate to the CurrentAssetsInBillionUSDs interaction class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
	
		
		synchronized(rti) {
			boolean isNotSubscribed = true;
			while(isNotSubscribed) {
				try {
					rti.subscribeInteractionClass(get_handle());
					isNotSubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", subscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", subscribeErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isSubscribed = true;
	}

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.CurrentAssetsInBillionUSDs:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the CurrentAssetsInBillionUSDs interaction class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void unsubscribe(RTIambassador rti) {
		if (!_isSubscribed) return;

		init(rti);
		synchronized(rti) {
			boolean isNotUnsubscribed = true;
			while(isNotUnsubscribed) {
				try {
					rti.unsubscribeInteractionClass(get_handle());
					isNotUnsubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unsubscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotSubscribed i) {
					logger.error("{} Interaction Class Not Subscribed", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (Exception e) {
					logger.error(e);
					CpswtUtils.sleepDefault();
				}
			}
		}
		
		_isSubscribed = false;
	}

	/**
	* Return true if "handle" is equal to the handle (RTI assigned) of this class
	* (that is, the CurrentAssetsInBillionUSDs interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the CurrentAssetsInBillionUSDs interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the CurrentAssetsInBillionUSDs interaction class).
	*/
	public static boolean match(int handle) { return handle == get_handle(); }

	/**
	* Returns the handle (RTI assigned) of this instance's interaction class .
	* 
	* @return the handle (RTI assigned) if this instance's interaction class
	*/
	public int getClassHandle() { return get_handle(); }

	/**
	* Returns the fully-qualified (dot-delimited) name of this instance's interaction class.
	* 
	* @return the fully-qualified (dot-delimited) name of this instance's interaction class
	*/
	public String getClassName() { return get_class_name(); }

	/**
	* Returns the simple name (last name in its fully-qualified dot-delimited name)
	* of this instance's interaction class.
	* 
	* @return the simple name of this instance's interaction class 
	*/
	public String getSimpleClassName() { return get_simple_class_name(); }

	/**
	* Returns a set containing the names of all of the non-hiddenparameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getParameterNames() { return get_parameter_names(); }

	/**
	* Returns a set containing the names of all of the parameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getAllParameterNames() { return get_all_parameter_names(); }

	/**
	* Publishes the interaction class of this instance of the class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void publishInteraction(RTIambassador rti) { publish(rti); }

	/**
	* Unpublishes the interaction class of this instance of this class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unpublishInteraction(RTIambassador rti) { unpublish(rti); }

	/**
	* Subscribes a federate to the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void subscribeInteraction(RTIambassador rti) { subscribe(rti); }

	/**
	* Unsubscribes a federate from the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unsubscribeInteraction(RTIambassador rti) { unsubscribe(rti); }

	

	public String toString() {
		return "CurrentAssetsInBillionUSDs("
			
			
			+ "dollars:" + get_dollars()
			+ "," + "sender:" + get_sender()
			+ ")";
	}
	



	
	
	private int _dollars = 0;
	
	private String _sender = "";

	
	
	/**
	* Set the value of the "dollars" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dollars" parameter
	*/
	public void set_dollars( int value ) { _dollars = value; }
	
	/**
	* Returns the value of the "dollars" parameter of this interaction.
	*
	* @return the value of the "dollars" parameter
	*/
	public int get_dollars() { return _dollars; }
	
	
	/**
	* Set the value of the "sender" parameter to "value" for this parameter.
	*
	* @param value the new value for the "sender" parameter
	*/
	public void set_sender( String value ) { _sender = value; }
	
	/**
	* Returns the value of the "sender" parameter of this interaction.
	*
	* @return the value of the "sender" parameter
	*/
	public String get_sender() { return _sender; }
	


	protected CurrentAssetsInBillionUSDs( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected CurrentAssetsInBillionUSDs( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the CurrentAssetsInBillionUSDs interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new CurrentAssetsInBillionUSDs interaction class instance
	*/
	public CurrentAssetsInBillionUSDs( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #CurrentAssetsInBillionUSDs( ReceivedInteraction datamemberMap )}, except this
	* new CurrentAssetsInBillionUSDs interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new CurrentAssetsInBillionUSDs interaction class instance
	* @param logicalTime timestamp for this new CurrentAssetsInBillionUSDs interaction class
	* instance
	*/
	public CurrentAssetsInBillionUSDs( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new CurrentAssetsInBillionUSDs interaction class instance that is a duplicate
	* of the instance referred to by CurrentAssetsInBillionUSDs_var.
	*
	* @param CurrentAssetsInBillionUSDs_var CurrentAssetsInBillionUSDs interaction class instance of which
	* this newly created CurrentAssetsInBillionUSDs interaction class instance will be a
	* duplicate
	*/
	public CurrentAssetsInBillionUSDs( CurrentAssetsInBillionUSDs CurrentAssetsInBillionUSDs_var ) {
		super( CurrentAssetsInBillionUSDs_var );
		
		
		set_dollars( CurrentAssetsInBillionUSDs_var.get_dollars() );
		set_sender( CurrentAssetsInBillionUSDs_var.get_sender() );
	}


	/**
	* Returns the value of the parameter whose name is "datamemberName"
	* for this interaction.
	*
	* @param datamemberName name of parameter whose value is to be
	* returned
	* @return value of the parameter whose name is "datamemberName"
	* for this interaction
	*/
	public Object getParameter( String datamemberName ) {
		
		
		
		if (  "dollars".equals( datamemberName )  ) return new Integer(get_dollars());
		else if (  "sender".equals( datamemberName )  ) return get_sender();
		else return super.getParameter( datamemberName );
	}
	
	/**
	* Returns the value of the parameter whose handle (RTI assigned)
	* is "datamemberHandle" for this interaction.
	*
	* @param datamemberHandle handle (RTI assigned) of parameter whose
	* value is to be returned
	* @return value of the parameter whose handle (RTI assigned) is
	* "datamemberHandle" for this interaction
	*/
	public Object getParameter( int datamemberHandle ) {
		
				
		
		if ( get_dollars_handle() == datamemberHandle ) return new Integer(get_dollars());
		else if ( get_sender_handle() == datamemberHandle ) return get_sender();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_dollars_handle() ) set_dollars( Integer.parseInt(val) );
		else if ( param_handle == get_sender_handle() ) set_sender( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "dollars".equals( datamemberName )  ) set_dollars( Integer.parseInt(val) );
		else if (  "sender".equals( datamemberName )  ) set_sender( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "dollars".equals( datamemberName )  ) set_dollars( (Integer)val );
		else if (  "sender".equals( datamemberName )  ) set_sender( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_dollars_handle(), Integer.toString(get_dollars()).getBytes() );
		
			datamembers.add( get_sender_handle(), get_sender().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof CurrentAssetsInBillionUSDs ) {
			CurrentAssetsInBillionUSDs data = (CurrentAssetsInBillionUSDs)object;
			
			
				_dollars = data._dollars;
				_sender = data._sender;
			
		}
	}
}
