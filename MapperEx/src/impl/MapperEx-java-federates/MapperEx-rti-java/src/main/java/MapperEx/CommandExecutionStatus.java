
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The CommandExecutionStatus class implements the CommandExecutionStatus interaction in the
* MapperEx simulation.
*/
public class CommandExecutionStatus extends ActionBase {

	private static final Logger logger = LogManager.getLogger(CommandExecutionStatus.class);

	/**
	* Default constructor -- creates an instance of the CommandExecutionStatus interaction
	* class with default parameter values.
	*/
	public CommandExecutionStatus() { }

	
	
	private static int _execStatus_handle;
	private static int _uniqueCommandID_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "execStatus" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "execStatus" parameter
	*/
	public static int get_execStatus_handle() { return _execStatus_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "uniqueCommandID" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "uniqueCommandID" parameter
	*/
	public static int get_uniqueCommandID_handle() { return _uniqueCommandID_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the CommandExecutionStatus interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the CommandExecutionStatus
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the CommandExecutionStatus interaction class.
	*/
	public static String get_simple_class_name() { return "CommandExecutionStatus"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* CommandExecutionStatus interaction class.
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
	* CommandExecutionStatus interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus", CommandExecutionStatus.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus", _allDatamemberNames);

		
		
		
		_datamemberNames.add("execStatus");
		
		
		
		_datamemberNames.add("uniqueCommandID");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("execStatus");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("uniqueCommandID");
		
		
		_datamemberTypeMap.put("execStatus", "int");
		_datamemberTypeMap.put("uniqueCommandID", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ActionBase.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus");
		_classHandleSimpleNameMap.put(get_handle(), "CommandExecutionStatus");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_execStatus_handle = rti.getParameterHandle("execStatus", get_handle());			
				_uniqueCommandID_handle = rti.getParameterHandle("uniqueCommandID", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus,execStatus", get_execStatus_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus,uniqueCommandID", get_uniqueCommandID_handle());
			
			
		_datamemberHandleNameMap.put(get_execStatus_handle(), "execStatus");
		_datamemberHandleNameMap.put(get_uniqueCommandID_handle(), "uniqueCommandID");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus:  could not publish:  ";

	/**
	* Publishes the CommandExecutionStatus interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus:  could not unpublish:  ";
	/**
	* Unpublishes the CommandExecutionStatus interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus:  could not subscribe:  ";
	/**
	* Subscribes a federate to the CommandExecutionStatus interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.CommandExecutionStatus:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the CommandExecutionStatus interaction class.
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
	* (that is, the CommandExecutionStatus interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the CommandExecutionStatus interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the CommandExecutionStatus interaction class).
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
		return "CommandExecutionStatus("
			
			
			+ "execStatus:" + get_execStatus()
			+ "," + "uniqueCommandID:" + get_uniqueCommandID()
			+ ")";
	}
	



	
	
	private int _execStatus = 0;
	
	private String _uniqueCommandID = "";

	
	
	/**
	* Set the value of the "execStatus" parameter to "value" for this parameter.
	*
	* @param value the new value for the "execStatus" parameter
	*/
	public void set_execStatus( int value ) { _execStatus = value; }
	
	/**
	* Returns the value of the "execStatus" parameter of this interaction.
	*
	* @return the value of the "execStatus" parameter
	*/
	public int get_execStatus() { return _execStatus; }
	
	
	/**
	* Set the value of the "uniqueCommandID" parameter to "value" for this parameter.
	*
	* @param value the new value for the "uniqueCommandID" parameter
	*/
	public void set_uniqueCommandID( String value ) { _uniqueCommandID = value; }
	
	/**
	* Returns the value of the "uniqueCommandID" parameter of this interaction.
	*
	* @return the value of the "uniqueCommandID" parameter
	*/
	public String get_uniqueCommandID() { return _uniqueCommandID; }
	


	protected CommandExecutionStatus( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected CommandExecutionStatus( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the CommandExecutionStatus interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new CommandExecutionStatus interaction class instance
	*/
	public CommandExecutionStatus( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #CommandExecutionStatus( ReceivedInteraction datamemberMap )}, except this
	* new CommandExecutionStatus interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new CommandExecutionStatus interaction class instance
	* @param logicalTime timestamp for this new CommandExecutionStatus interaction class
	* instance
	*/
	public CommandExecutionStatus( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new CommandExecutionStatus interaction class instance that is a duplicate
	* of the instance referred to by CommandExecutionStatus_var.
	*
	* @param CommandExecutionStatus_var CommandExecutionStatus interaction class instance of which
	* this newly created CommandExecutionStatus interaction class instance will be a
	* duplicate
	*/
	public CommandExecutionStatus( CommandExecutionStatus CommandExecutionStatus_var ) {
		super( CommandExecutionStatus_var );
		
		
		set_execStatus( CommandExecutionStatus_var.get_execStatus() );
		set_uniqueCommandID( CommandExecutionStatus_var.get_uniqueCommandID() );
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
		
		
		
		if (  "execStatus".equals( datamemberName )  ) return new Integer(get_execStatus());
		else if (  "uniqueCommandID".equals( datamemberName )  ) return get_uniqueCommandID();
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
		
				
		
		if ( get_execStatus_handle() == datamemberHandle ) return new Integer(get_execStatus());
		else if ( get_uniqueCommandID_handle() == datamemberHandle ) return get_uniqueCommandID();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_execStatus_handle() ) set_execStatus( Integer.parseInt(val) );
		else if ( param_handle == get_uniqueCommandID_handle() ) set_uniqueCommandID( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "execStatus".equals( datamemberName )  ) set_execStatus( Integer.parseInt(val) );
		else if (  "uniqueCommandID".equals( datamemberName )  ) set_uniqueCommandID( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "execStatus".equals( datamemberName )  ) set_execStatus( (Integer)val );
		else if (  "uniqueCommandID".equals( datamemberName )  ) set_uniqueCommandID( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_execStatus_handle(), Integer.toString(get_execStatus()).getBytes() );
		
			datamembers.add( get_uniqueCommandID_handle(), get_uniqueCommandID().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof CommandExecutionStatus ) {
			CommandExecutionStatus data = (CommandExecutionStatus)object;
			
			
				_execStatus = data._execStatus;
				_uniqueCommandID = data._uniqueCommandID;
			
		}
	}
}
