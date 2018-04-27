
package ChallengeResponse;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The InteractionChallenge class implements the InteractionChallenge interaction in the
* ChallengeResponse simulation.
*/
public class InteractionChallenge extends InteractionBase {

	private static final Logger logger = LogManager.getLogger(InteractionChallenge.class);

	/**
	* Default constructor -- creates an instance of the InteractionChallenge interaction
	* class with default parameter values.
	*/
	public InteractionChallenge() { }

	
	
	private static int _beginIndex_handle;
	private static int _stringValue_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "beginIndex" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "beginIndex" parameter
	*/
	public static int get_beginIndex_handle() { return _beginIndex_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stringValue" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "stringValue" parameter
	*/
	public static int get_stringValue_handle() { return _stringValue_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the InteractionChallenge interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the InteractionChallenge
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the InteractionChallenge interaction class.
	*/
	public static String get_simple_class_name() { return "InteractionChallenge"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* InteractionChallenge interaction class.
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
	* InteractionChallenge interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge", InteractionChallenge.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge", _allDatamemberNames);

		
		
		
		_datamemberNames.add("beginIndex");
		
		
		
		
		_datamemberNames.add("stringValue");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("beginIndex");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("id");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("stringValue");
		
		
		_datamemberTypeMap.put("beginIndex", "int");
		_datamemberTypeMap.put("stringValue", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		InteractionBase.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge");
		_classHandleSimpleNameMap.put(get_handle(), "InteractionChallenge");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_beginIndex_handle = rti.getParameterHandle("beginIndex", get_handle());			
				_stringValue_handle = rti.getParameterHandle("stringValue", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge,beginIndex", get_beginIndex_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge,stringValue", get_stringValue_handle());
			
			
		_datamemberHandleNameMap.put(get_beginIndex_handle(), "beginIndex");
		_datamemberHandleNameMap.put(get_stringValue_handle(), "stringValue");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge:  could not publish:  ";

	/**
	* Publishes the InteractionChallenge interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge:  could not unpublish:  ";
	/**
	* Unpublishes the InteractionChallenge interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge:  could not subscribe:  ";
	/**
	* Subscribes a federate to the InteractionChallenge interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.InteractionBase.InteractionChallenge:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the InteractionChallenge interaction class.
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
	* (that is, the InteractionChallenge interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the InteractionChallenge interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the InteractionChallenge interaction class).
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
		return "InteractionChallenge("
			
			
			+ "beginIndex:" + get_beginIndex()
			+ "," + "stringValue:" + get_stringValue()
			+ ")";
	}
	



	
	
	private int _beginIndex = 0;
	
	private String _stringValue = "";

	
	
	/**
	* Set the value of the "beginIndex" parameter to "value" for this parameter.
	*
	* @param value the new value for the "beginIndex" parameter
	*/
	public void set_beginIndex( int value ) { _beginIndex = value; }
	
	/**
	* Returns the value of the "beginIndex" parameter of this interaction.
	*
	* @return the value of the "beginIndex" parameter
	*/
	public int get_beginIndex() { return _beginIndex; }
	
	
	/**
	* Set the value of the "stringValue" parameter to "value" for this parameter.
	*
	* @param value the new value for the "stringValue" parameter
	*/
	public void set_stringValue( String value ) { _stringValue = value; }
	
	/**
	* Returns the value of the "stringValue" parameter of this interaction.
	*
	* @return the value of the "stringValue" parameter
	*/
	public String get_stringValue() { return _stringValue; }
	


	protected InteractionChallenge( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected InteractionChallenge( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the InteractionChallenge interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new InteractionChallenge interaction class instance
	*/
	public InteractionChallenge( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #InteractionChallenge( ReceivedInteraction datamemberMap )}, except this
	* new InteractionChallenge interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new InteractionChallenge interaction class instance
	* @param logicalTime timestamp for this new InteractionChallenge interaction class
	* instance
	*/
	public InteractionChallenge( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new InteractionChallenge interaction class instance that is a duplicate
	* of the instance referred to by InteractionChallenge_var.
	*
	* @param InteractionChallenge_var InteractionChallenge interaction class instance of which
	* this newly created InteractionChallenge interaction class instance will be a
	* duplicate
	*/
	public InteractionChallenge( InteractionChallenge InteractionChallenge_var ) {
		super( InteractionChallenge_var );
		
		
		set_beginIndex( InteractionChallenge_var.get_beginIndex() );
		set_stringValue( InteractionChallenge_var.get_stringValue() );
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
		
		
		
		if (  "beginIndex".equals( datamemberName )  ) return new Integer(get_beginIndex());
		else if (  "stringValue".equals( datamemberName )  ) return get_stringValue();
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
		
				
		
		if ( get_beginIndex_handle() == datamemberHandle ) return new Integer(get_beginIndex());
		else if ( get_stringValue_handle() == datamemberHandle ) return get_stringValue();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_beginIndex_handle() ) set_beginIndex( Integer.parseInt(val) );
		else if ( param_handle == get_stringValue_handle() ) set_stringValue( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "beginIndex".equals( datamemberName )  ) set_beginIndex( Integer.parseInt(val) );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "beginIndex".equals( datamemberName )  ) set_beginIndex( (Integer)val );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_beginIndex_handle(), Integer.toString(get_beginIndex()).getBytes() );
		
			datamembers.add( get_stringValue_handle(), get_stringValue().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof InteractionChallenge ) {
			InteractionChallenge data = (InteractionChallenge)object;
			
			
				_beginIndex = data._beginIndex;
				_stringValue = data._stringValue;
			
		}
	}
}
