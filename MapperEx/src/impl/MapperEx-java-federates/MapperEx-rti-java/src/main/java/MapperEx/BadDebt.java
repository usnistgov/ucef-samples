
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The BadDebt class implements the BadDebt interaction in the
* MapperEx simulation.
*/
public class BadDebt extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(BadDebt.class);

	/**
	* Default constructor -- creates an instance of the BadDebt interaction
	* class with default parameter values.
	*/
	public BadDebt() { }

	
	
	private static int _dollarsInBillionUSDs_handle;
	private static int _writeOffBank_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "dollarsInBillionUSDs" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dollarsInBillionUSDs" parameter
	*/
	public static int get_dollarsInBillionUSDs_handle() { return _dollarsInBillionUSDs_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "writeOffBank" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "writeOffBank" parameter
	*/
	public static int get_writeOffBank_handle() { return _writeOffBank_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the BadDebt interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the BadDebt
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.BadDebt"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the BadDebt interaction class.
	*/
	public static String get_simple_class_name() { return "BadDebt"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* BadDebt interaction class.
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
	* BadDebt interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.BadDebt");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.BadDebt", BadDebt.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.BadDebt", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.BadDebt", _allDatamemberNames);

		
		
		
		_datamemberNames.add("dollarsInBillionUSDs");
		
		
		
		_datamemberNames.add("writeOffBank");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("dollarsInBillionUSDs");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("writeOffBank");
		
		
		_datamemberTypeMap.put("dollarsInBillionUSDs", "int");
		_datamemberTypeMap.put("writeOffBank", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BadDebt:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.BadDebt");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BadDebt", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.BadDebt");
		_classHandleSimpleNameMap.put(get_handle(), "BadDebt");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_dollarsInBillionUSDs_handle = rti.getParameterHandle("dollarsInBillionUSDs", get_handle());			
				_writeOffBank_handle = rti.getParameterHandle("writeOffBank", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BadDebt,dollarsInBillionUSDs", get_dollarsInBillionUSDs_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BadDebt,writeOffBank", get_writeOffBank_handle());
			
			
		_datamemberHandleNameMap.put(get_dollarsInBillionUSDs_handle(), "dollarsInBillionUSDs");
		_datamemberHandleNameMap.put(get_writeOffBank_handle(), "writeOffBank");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BadDebt:  could not publish:  ";

	/**
	* Publishes the BadDebt interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BadDebt:  could not unpublish:  ";
	/**
	* Unpublishes the BadDebt interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BadDebt:  could not subscribe:  ";
	/**
	* Subscribes a federate to the BadDebt interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BadDebt:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the BadDebt interaction class.
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
	* (that is, the BadDebt interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the BadDebt interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the BadDebt interaction class).
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
		return "BadDebt("
			
			
			+ "dollarsInBillionUSDs:" + get_dollarsInBillionUSDs()
			+ "," + "writeOffBank:" + get_writeOffBank()
			+ ")";
	}
	



	
	
	private int _dollarsInBillionUSDs = 0;
	
	private String _writeOffBank = "";

	
	
	/**
	* Set the value of the "dollarsInBillionUSDs" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dollarsInBillionUSDs" parameter
	*/
	public void set_dollarsInBillionUSDs( int value ) { _dollarsInBillionUSDs = value; }
	
	/**
	* Returns the value of the "dollarsInBillionUSDs" parameter of this interaction.
	*
	* @return the value of the "dollarsInBillionUSDs" parameter
	*/
	public int get_dollarsInBillionUSDs() { return _dollarsInBillionUSDs; }
	
	
	/**
	* Set the value of the "writeOffBank" parameter to "value" for this parameter.
	*
	* @param value the new value for the "writeOffBank" parameter
	*/
	public void set_writeOffBank( String value ) { _writeOffBank = value; }
	
	/**
	* Returns the value of the "writeOffBank" parameter of this interaction.
	*
	* @return the value of the "writeOffBank" parameter
	*/
	public String get_writeOffBank() { return _writeOffBank; }
	


	protected BadDebt( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected BadDebt( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the BadDebt interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new BadDebt interaction class instance
	*/
	public BadDebt( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #BadDebt( ReceivedInteraction datamemberMap )}, except this
	* new BadDebt interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new BadDebt interaction class instance
	* @param logicalTime timestamp for this new BadDebt interaction class
	* instance
	*/
	public BadDebt( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new BadDebt interaction class instance that is a duplicate
	* of the instance referred to by BadDebt_var.
	*
	* @param BadDebt_var BadDebt interaction class instance of which
	* this newly created BadDebt interaction class instance will be a
	* duplicate
	*/
	public BadDebt( BadDebt BadDebt_var ) {
		super( BadDebt_var );
		
		
		set_dollarsInBillionUSDs( BadDebt_var.get_dollarsInBillionUSDs() );
		set_writeOffBank( BadDebt_var.get_writeOffBank() );
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
		
		
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) return new Integer(get_dollarsInBillionUSDs());
		else if (  "writeOffBank".equals( datamemberName )  ) return get_writeOffBank();
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
		
				
		
		if ( get_dollarsInBillionUSDs_handle() == datamemberHandle ) return new Integer(get_dollarsInBillionUSDs());
		else if ( get_writeOffBank_handle() == datamemberHandle ) return get_writeOffBank();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_dollarsInBillionUSDs_handle() ) set_dollarsInBillionUSDs( Integer.parseInt(val) );
		else if ( param_handle == get_writeOffBank_handle() ) set_writeOffBank( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) set_dollarsInBillionUSDs( Integer.parseInt(val) );
		else if (  "writeOffBank".equals( datamemberName )  ) set_writeOffBank( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "dollarsInBillionUSDs".equals( datamemberName )  ) set_dollarsInBillionUSDs( (Integer)val );
		else if (  "writeOffBank".equals( datamemberName )  ) set_writeOffBank( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_dollarsInBillionUSDs_handle(), Integer.toString(get_dollarsInBillionUSDs()).getBytes() );
		
			datamembers.add( get_writeOffBank_handle(), get_writeOffBank().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof BadDebt ) {
			BadDebt data = (BadDebt)object;
			
			
				_dollarsInBillionUSDs = data._dollarsInBillionUSDs;
				_writeOffBank = data._writeOffBank;
			
		}
	}
}
