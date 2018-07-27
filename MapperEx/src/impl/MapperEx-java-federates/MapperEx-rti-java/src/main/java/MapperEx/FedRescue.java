
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The FedRescue class implements the FedRescue interaction in the
* MapperEx simulation.
*/
public class FedRescue extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(FedRescue.class);

	/**
	* Default constructor -- creates an instance of the FedRescue interaction
	* class with default parameter values.
	*/
	public FedRescue() { }

	
	
	private static int _dollarsInBillionUSDs_handle;
	private static int _receiver_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "dollarsInBillionUSDs" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dollarsInBillionUSDs" parameter
	*/
	public static int get_dollarsInBillionUSDs_handle() { return _dollarsInBillionUSDs_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiver" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiver" parameter
	*/
	public static int get_receiver_handle() { return _receiver_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the FedRescue interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the FedRescue
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.FedRescue"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the FedRescue interaction class.
	*/
	public static String get_simple_class_name() { return "FedRescue"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* FedRescue interaction class.
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
	* FedRescue interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.FedRescue");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.FedRescue", FedRescue.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.FedRescue", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.FedRescue", _allDatamemberNames);

		
		
		
		_datamemberNames.add("dollarsInBillionUSDs");
		
		
		_datamemberNames.add("receiver");
		
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("dollarsInBillionUSDs");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("receiver");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("dollarsInBillionUSDs", "String");
		_datamemberTypeMap.put("receiver", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.FedRescue:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.FedRescue");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.FedRescue", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.FedRescue");
		_classHandleSimpleNameMap.put(get_handle(), "FedRescue");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_dollarsInBillionUSDs_handle = rti.getParameterHandle("dollarsInBillionUSDs", get_handle());			
				_receiver_handle = rti.getParameterHandle("receiver", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.FedRescue,dollarsInBillionUSDs", get_dollarsInBillionUSDs_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.FedRescue,receiver", get_receiver_handle());
			
			
		_datamemberHandleNameMap.put(get_dollarsInBillionUSDs_handle(), "dollarsInBillionUSDs");
		_datamemberHandleNameMap.put(get_receiver_handle(), "receiver");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.FedRescue:  could not publish:  ";

	/**
	* Publishes the FedRescue interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.FedRescue:  could not unpublish:  ";
	/**
	* Unpublishes the FedRescue interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.FedRescue:  could not subscribe:  ";
	/**
	* Subscribes a federate to the FedRescue interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.FedRescue:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the FedRescue interaction class.
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
	* (that is, the FedRescue interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the FedRescue interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the FedRescue interaction class).
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
		return "FedRescue("
			
			
			+ "dollarsInBillionUSDs:" + get_dollarsInBillionUSDs()
			+ "," + "receiver:" + get_receiver()
			+ ")";
	}
	



	
	
	private String _dollarsInBillionUSDs = "";
	
	private String _receiver = "";

	
	
	/**
	* Set the value of the "dollarsInBillionUSDs" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dollarsInBillionUSDs" parameter
	*/
	public void set_dollarsInBillionUSDs( String value ) { _dollarsInBillionUSDs = value; }
	
	/**
	* Returns the value of the "dollarsInBillionUSDs" parameter of this interaction.
	*
	* @return the value of the "dollarsInBillionUSDs" parameter
	*/
	public String get_dollarsInBillionUSDs() { return _dollarsInBillionUSDs; }
	
	
	/**
	* Set the value of the "receiver" parameter to "value" for this parameter.
	*
	* @param value the new value for the "receiver" parameter
	*/
	public void set_receiver( String value ) { _receiver = value; }
	
	/**
	* Returns the value of the "receiver" parameter of this interaction.
	*
	* @return the value of the "receiver" parameter
	*/
	public String get_receiver() { return _receiver; }
	


	protected FedRescue( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected FedRescue( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the FedRescue interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new FedRescue interaction class instance
	*/
	public FedRescue( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #FedRescue( ReceivedInteraction datamemberMap )}, except this
	* new FedRescue interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new FedRescue interaction class instance
	* @param logicalTime timestamp for this new FedRescue interaction class
	* instance
	*/
	public FedRescue( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new FedRescue interaction class instance that is a duplicate
	* of the instance referred to by FedRescue_var.
	*
	* @param FedRescue_var FedRescue interaction class instance of which
	* this newly created FedRescue interaction class instance will be a
	* duplicate
	*/
	public FedRescue( FedRescue FedRescue_var ) {
		super( FedRescue_var );
		
		
		set_dollarsInBillionUSDs( FedRescue_var.get_dollarsInBillionUSDs() );
		set_receiver( FedRescue_var.get_receiver() );
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
		
		
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) return get_dollarsInBillionUSDs();
		else if (  "receiver".equals( datamemberName )  ) return get_receiver();
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
		
				
		
		if ( get_dollarsInBillionUSDs_handle() == datamemberHandle ) return get_dollarsInBillionUSDs();
		else if ( get_receiver_handle() == datamemberHandle ) return get_receiver();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_dollarsInBillionUSDs_handle() ) set_dollarsInBillionUSDs( val );
		else if ( param_handle == get_receiver_handle() ) set_receiver( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) set_dollarsInBillionUSDs( val );
		else if (  "receiver".equals( datamemberName )  ) set_receiver( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) set_dollarsInBillionUSDs( (String)val );
		else if (  "receiver".equals( datamemberName )  ) set_receiver( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_dollarsInBillionUSDs_handle(), get_dollarsInBillionUSDs().getBytes() );
		
			datamembers.add( get_receiver_handle(), get_receiver().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof FedRescue ) {
			FedRescue data = (FedRescue)object;
			
			
				_dollarsInBillionUSDs = data._dollarsInBillionUSDs;
				_receiver = data._receiver;
			
		}
	}
}
