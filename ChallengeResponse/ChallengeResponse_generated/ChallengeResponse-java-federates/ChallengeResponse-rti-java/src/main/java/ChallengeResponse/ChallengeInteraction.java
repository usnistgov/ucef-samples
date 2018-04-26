
package ChallengeResponse;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The ChallengeInteraction class implements the ChallengeInteraction interaction in the
* ChallengeResponse simulation.
*/
public class ChallengeInteraction extends BaseInteraction {

	private static final Logger logger = LogManager.getLogger(ChallengeInteraction.class);

	/**
	* Default constructor -- creates an instance of the ChallengeInteraction interaction
	* class with default parameter values.
	*/
	public ChallengeInteraction() { }

	
	
	private static int _integerValue_handle;
	private static int _stringValue_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "integerValue" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "integerValue" parameter
	*/
	public static int get_integerValue_handle() { return _integerValue_handle; }
	
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
	* Returns the handle (RTI assigned) of the ChallengeInteraction interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the ChallengeInteraction
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the ChallengeInteraction interaction class.
	*/
	public static String get_simple_class_name() { return "ChallengeInteraction"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* ChallengeInteraction interaction class.
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
	* ChallengeInteraction interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction", ChallengeInteraction.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction", _allDatamemberNames);

		
		
		
		
		
		_datamemberNames.add("integerValue");
		
		
		_datamemberNames.add("stringValue");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("id");
		_allDatamemberNames.add("integerValue");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("stringValue");
		
		
		_datamemberTypeMap.put("integerValue", "int");
		_datamemberTypeMap.put("stringValue", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		BaseInteraction.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction");
		_classHandleSimpleNameMap.put(get_handle(), "ChallengeInteraction");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_integerValue_handle = rti.getParameterHandle("integerValue", get_handle());			
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction,integerValue", get_integerValue_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction,stringValue", get_stringValue_handle());
			
			
		_datamemberHandleNameMap.put(get_integerValue_handle(), "integerValue");
		_datamemberHandleNameMap.put(get_stringValue_handle(), "stringValue");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction:  could not publish:  ";

	/**
	* Publishes the ChallengeInteraction interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction:  could not unpublish:  ";
	/**
	* Unpublishes the ChallengeInteraction interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction:  could not subscribe:  ";
	/**
	* Subscribes a federate to the ChallengeInteraction interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.BaseInteraction.ChallengeInteraction:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the ChallengeInteraction interaction class.
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
	* (that is, the ChallengeInteraction interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the ChallengeInteraction interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the ChallengeInteraction interaction class).
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
		return "ChallengeInteraction("
			
			
			+ "integerValue:" + get_integerValue()
			+ "," + "stringValue:" + get_stringValue()
			+ ")";
	}
	



	
	
	private int _integerValue = 0;
	
	private String _stringValue = "";

	
	
	/**
	* Set the value of the "integerValue" parameter to "value" for this parameter.
	*
	* @param value the new value for the "integerValue" parameter
	*/
	public void set_integerValue( int value ) { _integerValue = value; }
	
	/**
	* Returns the value of the "integerValue" parameter of this interaction.
	*
	* @return the value of the "integerValue" parameter
	*/
	public int get_integerValue() { return _integerValue; }
	
	
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
	


	protected ChallengeInteraction( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected ChallengeInteraction( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the ChallengeInteraction interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new ChallengeInteraction interaction class instance
	*/
	public ChallengeInteraction( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #ChallengeInteraction( ReceivedInteraction datamemberMap )}, except this
	* new ChallengeInteraction interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new ChallengeInteraction interaction class instance
	* @param logicalTime timestamp for this new ChallengeInteraction interaction class
	* instance
	*/
	public ChallengeInteraction( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new ChallengeInteraction interaction class instance that is a duplicate
	* of the instance referred to by ChallengeInteraction_var.
	*
	* @param ChallengeInteraction_var ChallengeInteraction interaction class instance of which
	* this newly created ChallengeInteraction interaction class instance will be a
	* duplicate
	*/
	public ChallengeInteraction( ChallengeInteraction ChallengeInteraction_var ) {
		super( ChallengeInteraction_var );
		
		
		set_integerValue( ChallengeInteraction_var.get_integerValue() );
		set_stringValue( ChallengeInteraction_var.get_stringValue() );
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
		
		
		
		if (  "integerValue".equals( datamemberName )  ) return new Integer(get_integerValue());
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
		
				
		
		if ( get_integerValue_handle() == datamemberHandle ) return new Integer(get_integerValue());
		else if ( get_stringValue_handle() == datamemberHandle ) return get_stringValue();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_integerValue_handle() ) set_integerValue( Integer.parseInt(val) );
		else if ( param_handle == get_stringValue_handle() ) set_stringValue( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "integerValue".equals( datamemberName )  ) set_integerValue( Integer.parseInt(val) );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "integerValue".equals( datamemberName )  ) set_integerValue( (Integer)val );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_integerValue_handle(), Integer.toString(get_integerValue()).getBytes() );
		
			datamembers.add( get_stringValue_handle(), get_stringValue().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof ChallengeInteraction ) {
			ChallengeInteraction data = (ChallengeInteraction)object;
			
			
				_integerValue = data._integerValue;
				_stringValue = data._stringValue;
			
		}
	}
}
