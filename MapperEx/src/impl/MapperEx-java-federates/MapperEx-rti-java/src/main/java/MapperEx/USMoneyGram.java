
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The USMoneyGram class implements the USMoneyGram interaction in the
* MapperEx simulation.
*/
public class USMoneyGram extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(USMoneyGram.class);

	/**
	* Default constructor -- creates an instance of the USMoneyGram interaction
	* class with default parameter values.
	*/
	public USMoneyGram() { }

	
	
	private static int _dollars_handle;
	private static int _id_handle;
	private static int _receiver_handle;
	private static int _sender_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "dollars" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dollars" parameter
	*/
	public static int get_dollars_handle() { return _dollars_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "id" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "id" parameter
	*/
	public static int get_id_handle() { return _id_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiver" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiver" parameter
	*/
	public static int get_receiver_handle() { return _receiver_handle; }
	
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
	* Returns the handle (RTI assigned) of the USMoneyGram interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the USMoneyGram
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.USMoneyGram"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the USMoneyGram interaction class.
	*/
	public static String get_simple_class_name() { return "USMoneyGram"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* USMoneyGram interaction class.
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
	* USMoneyGram interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.USMoneyGram");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram", USMoneyGram.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram", _allDatamemberNames);

		
		
		
		_datamemberNames.add("dollars");
		
		_datamemberNames.add("id");
		
		_datamemberNames.add("receiver");
		_datamemberNames.add("sender");
		
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("dollars");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("id");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("receiver");
		_allDatamemberNames.add("sender");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("dollars", "double");
		_datamemberTypeMap.put("id", "int");
		_datamemberTypeMap.put("receiver", "String");
		_datamemberTypeMap.put("sender", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.USMoneyGram:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.USMoneyGram");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.USMoneyGram");
		_classHandleSimpleNameMap.put(get_handle(), "USMoneyGram");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_dollars_handle = rti.getParameterHandle("dollars", get_handle());			
				_id_handle = rti.getParameterHandle("id", get_handle());			
				_receiver_handle = rti.getParameterHandle("receiver", get_handle());			
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram,dollars", get_dollars_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram,id", get_id_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram,receiver", get_receiver_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.USMoneyGram,sender", get_sender_handle());
			
			
		_datamemberHandleNameMap.put(get_dollars_handle(), "dollars");
		_datamemberHandleNameMap.put(get_id_handle(), "id");
		_datamemberHandleNameMap.put(get_receiver_handle(), "receiver");
		_datamemberHandleNameMap.put(get_sender_handle(), "sender");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.USMoneyGram:  could not publish:  ";

	/**
	* Publishes the USMoneyGram interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.USMoneyGram:  could not unpublish:  ";
	/**
	* Unpublishes the USMoneyGram interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.USMoneyGram:  could not subscribe:  ";
	/**
	* Subscribes a federate to the USMoneyGram interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.USMoneyGram:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the USMoneyGram interaction class.
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
	* (that is, the USMoneyGram interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the USMoneyGram interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the USMoneyGram interaction class).
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
		return "USMoneyGram("
			
			
			+ "dollars:" + get_dollars()
			+ "," + "id:" + get_id()
			+ "," + "receiver:" + get_receiver()
			+ "," + "sender:" + get_sender()
			+ ")";
	}
	



	
	
	private double _dollars = 0;
	
	private int _id = 0;
	
	private String _receiver = "";
	
	private String _sender = "";

	
	
	/**
	* Set the value of the "dollars" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dollars" parameter
	*/
	public void set_dollars( double value ) { _dollars = value; }
	
	/**
	* Returns the value of the "dollars" parameter of this interaction.
	*
	* @return the value of the "dollars" parameter
	*/
	public double get_dollars() { return _dollars; }
	
	
	/**
	* Set the value of the "id" parameter to "value" for this parameter.
	*
	* @param value the new value for the "id" parameter
	*/
	public void set_id( int value ) { _id = value; }
	
	/**
	* Returns the value of the "id" parameter of this interaction.
	*
	* @return the value of the "id" parameter
	*/
	public int get_id() { return _id; }
	
	
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
	


	protected USMoneyGram( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected USMoneyGram( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the USMoneyGram interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new USMoneyGram interaction class instance
	*/
	public USMoneyGram( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #USMoneyGram( ReceivedInteraction datamemberMap )}, except this
	* new USMoneyGram interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new USMoneyGram interaction class instance
	* @param logicalTime timestamp for this new USMoneyGram interaction class
	* instance
	*/
	public USMoneyGram( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new USMoneyGram interaction class instance that is a duplicate
	* of the instance referred to by USMoneyGram_var.
	*
	* @param USMoneyGram_var USMoneyGram interaction class instance of which
	* this newly created USMoneyGram interaction class instance will be a
	* duplicate
	*/
	public USMoneyGram( USMoneyGram USMoneyGram_var ) {
		super( USMoneyGram_var );
		
		
		set_dollars( USMoneyGram_var.get_dollars() );
		set_id( USMoneyGram_var.get_id() );
		set_receiver( USMoneyGram_var.get_receiver() );
		set_sender( USMoneyGram_var.get_sender() );
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
		
		
		
		if (  "dollars".equals( datamemberName )  ) return new Double(get_dollars());
		else if (  "id".equals( datamemberName )  ) return new Integer(get_id());
		else if (  "receiver".equals( datamemberName )  ) return get_receiver();
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
		
				
		
		if ( get_dollars_handle() == datamemberHandle ) return new Double(get_dollars());
		else if ( get_id_handle() == datamemberHandle ) return new Integer(get_id());
		else if ( get_receiver_handle() == datamemberHandle ) return get_receiver();
		else if ( get_sender_handle() == datamemberHandle ) return get_sender();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_dollars_handle() ) set_dollars( Double.parseDouble(val) );
		else if ( param_handle == get_id_handle() ) set_id( Integer.parseInt(val) );
		else if ( param_handle == get_receiver_handle() ) set_receiver( val );
		else if ( param_handle == get_sender_handle() ) set_sender( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "dollars".equals( datamemberName )  ) set_dollars( Double.parseDouble(val) );
		else if (  "id".equals( datamemberName )  ) set_id( Integer.parseInt(val) );
		else if (  "receiver".equals( datamemberName )  ) set_receiver( val );
		else if (  "sender".equals( datamemberName )  ) set_sender( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "dollars".equals( datamemberName )  ) set_dollars( (Double)val );
		else if (  "id".equals( datamemberName )  ) set_id( (Integer)val );
		else if (  "receiver".equals( datamemberName )  ) set_receiver( (String)val );
		else if (  "sender".equals( datamemberName )  ) set_sender( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_dollars_handle(), Double.toString(get_dollars()).getBytes() );
		
			datamembers.add( get_id_handle(), Integer.toString(get_id()).getBytes() );
		
			datamembers.add( get_receiver_handle(), get_receiver().getBytes() );
		
			datamembers.add( get_sender_handle(), get_sender().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof USMoneyGram ) {
			USMoneyGram data = (USMoneyGram)object;
			
			
				_dollars = data._dollars;
				_id = data._id;
				_receiver = data._receiver;
				_sender = data._sender;
			
		}
	}
}
