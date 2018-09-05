
package MetronomeFederate;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The SimTime class implements the SimTime interaction in the
* MetronomeFederate simulation.
*/
public class SimTime extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(SimTime.class);

	/**
	* Default constructor -- creates an instance of the SimTime interaction
	* class with default parameter values.
	*/
	public SimTime() { }

	
	
	private static int _ignoreTil_handle;
	private static int _secondsPerLogicalTime_handle;
	private static int _startTime_handle;
	private static int _stopTime_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "ignoreTil" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ignoreTil" parameter
	*/
	public static int get_ignoreTil_handle() { return _ignoreTil_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "secondsPerLogicalTime" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "secondsPerLogicalTime" parameter
	*/
	public static int get_secondsPerLogicalTime_handle() { return _secondsPerLogicalTime_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "startTime" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "startTime" parameter
	*/
	public static int get_startTime_handle() { return _startTime_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stopTime" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "stopTime" parameter
	*/
	public static int get_stopTime_handle() { return _stopTime_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the SimTime interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the SimTime
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.SimTime"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the SimTime interaction class.
	*/
	public static String get_simple_class_name() { return "SimTime"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* SimTime interaction class.
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
	* SimTime interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.SimTime");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.SimTime", SimTime.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.SimTime", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.SimTime", _allDatamemberNames);

		
		
		
		
		_datamemberNames.add("ignoreTil");
		
		_datamemberNames.add("secondsPerLogicalTime");
		
		_datamemberNames.add("startTime");
		_datamemberNames.add("stopTime");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("ignoreTil");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("secondsPerLogicalTime");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("startTime");
		_allDatamemberNames.add("stopTime");
		
		
		_datamemberTypeMap.put("ignoreTil", "double");
		_datamemberTypeMap.put("secondsPerLogicalTime", "double");
		_datamemberTypeMap.put("startTime", "double");
		_datamemberTypeMap.put("stopTime", "double");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimTime:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.SimTime");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.SimTime", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.SimTime");
		_classHandleSimpleNameMap.put(get_handle(), "SimTime");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_ignoreTil_handle = rti.getParameterHandle("ignoreTil", get_handle());			
				_secondsPerLogicalTime_handle = rti.getParameterHandle("secondsPerLogicalTime", get_handle());			
				_startTime_handle = rti.getParameterHandle("startTime", get_handle());			
				_stopTime_handle = rti.getParameterHandle("stopTime", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.SimTime,ignoreTil", get_ignoreTil_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.SimTime,secondsPerLogicalTime", get_secondsPerLogicalTime_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.SimTime,startTime", get_startTime_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.SimTime,stopTime", get_stopTime_handle());
			
			
		_datamemberHandleNameMap.put(get_ignoreTil_handle(), "ignoreTil");
		_datamemberHandleNameMap.put(get_secondsPerLogicalTime_handle(), "secondsPerLogicalTime");
		_datamemberHandleNameMap.put(get_startTime_handle(), "startTime");
		_datamemberHandleNameMap.put(get_stopTime_handle(), "stopTime");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimTime:  could not publish:  ";

	/**
	* Publishes the SimTime interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimTime:  could not unpublish:  ";
	/**
	* Unpublishes the SimTime interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimTime:  could not subscribe:  ";
	/**
	* Subscribes a federate to the SimTime interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.SimTime:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the SimTime interaction class.
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
	* (that is, the SimTime interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the SimTime interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the SimTime interaction class).
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
		return "SimTime("
			
			
			+ "ignoreTil:" + get_ignoreTil()
			+ "," + "secondsPerLogicalTime:" + get_secondsPerLogicalTime()
			+ "," + "startTime:" + get_startTime()
			+ "," + "stopTime:" + get_stopTime()
			+ ")";
	}
	



	
	
	private double _ignoreTil = 0;
	
	private double _secondsPerLogicalTime = 0;
	
	private double _startTime = 0;
	
	private double _stopTime = 0;

	
	
	/**
	* Set the value of the "ignoreTil" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ignoreTil" parameter
	*/
	public void set_ignoreTil( double value ) { _ignoreTil = value; }
	
	/**
	* Returns the value of the "ignoreTil" parameter of this interaction.
	*
	* @return the value of the "ignoreTil" parameter
	*/
	public double get_ignoreTil() { return _ignoreTil; }
	
	
	/**
	* Set the value of the "secondsPerLogicalTime" parameter to "value" for this parameter.
	*
	* @param value the new value for the "secondsPerLogicalTime" parameter
	*/
	public void set_secondsPerLogicalTime( double value ) { _secondsPerLogicalTime = value; }
	
	/**
	* Returns the value of the "secondsPerLogicalTime" parameter of this interaction.
	*
	* @return the value of the "secondsPerLogicalTime" parameter
	*/
	public double get_secondsPerLogicalTime() { return _secondsPerLogicalTime; }
	
	
	/**
	* Set the value of the "startTime" parameter to "value" for this parameter.
	*
	* @param value the new value for the "startTime" parameter
	*/
	public void set_startTime( double value ) { _startTime = value; }
	
	/**
	* Returns the value of the "startTime" parameter of this interaction.
	*
	* @return the value of the "startTime" parameter
	*/
	public double get_startTime() { return _startTime; }
	
	
	/**
	* Set the value of the "stopTime" parameter to "value" for this parameter.
	*
	* @param value the new value for the "stopTime" parameter
	*/
	public void set_stopTime( double value ) { _stopTime = value; }
	
	/**
	* Returns the value of the "stopTime" parameter of this interaction.
	*
	* @return the value of the "stopTime" parameter
	*/
	public double get_stopTime() { return _stopTime; }
	


	protected SimTime( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected SimTime( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the SimTime interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new SimTime interaction class instance
	*/
	public SimTime( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #SimTime( ReceivedInteraction datamemberMap )}, except this
	* new SimTime interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new SimTime interaction class instance
	* @param logicalTime timestamp for this new SimTime interaction class
	* instance
	*/
	public SimTime( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new SimTime interaction class instance that is a duplicate
	* of the instance referred to by SimTime_var.
	*
	* @param SimTime_var SimTime interaction class instance of which
	* this newly created SimTime interaction class instance will be a
	* duplicate
	*/
	public SimTime( SimTime SimTime_var ) {
		super( SimTime_var );
		
		
		set_ignoreTil( SimTime_var.get_ignoreTil() );
		set_secondsPerLogicalTime( SimTime_var.get_secondsPerLogicalTime() );
		set_startTime( SimTime_var.get_startTime() );
		set_stopTime( SimTime_var.get_stopTime() );
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
		
		
		
		if (  "ignoreTil".equals( datamemberName )  ) return new Double(get_ignoreTil());
		else if (  "secondsPerLogicalTime".equals( datamemberName )  ) return new Double(get_secondsPerLogicalTime());
		else if (  "startTime".equals( datamemberName )  ) return new Double(get_startTime());
		else if (  "stopTime".equals( datamemberName )  ) return new Double(get_stopTime());
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
		
				
		
		if ( get_ignoreTil_handle() == datamemberHandle ) return new Double(get_ignoreTil());
		else if ( get_secondsPerLogicalTime_handle() == datamemberHandle ) return new Double(get_secondsPerLogicalTime());
		else if ( get_startTime_handle() == datamemberHandle ) return new Double(get_startTime());
		else if ( get_stopTime_handle() == datamemberHandle ) return new Double(get_stopTime());
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_ignoreTil_handle() ) set_ignoreTil( Double.parseDouble(val) );
		else if ( param_handle == get_secondsPerLogicalTime_handle() ) set_secondsPerLogicalTime( Double.parseDouble(val) );
		else if ( param_handle == get_startTime_handle() ) set_startTime( Double.parseDouble(val) );
		else if ( param_handle == get_stopTime_handle() ) set_stopTime( Double.parseDouble(val) );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "ignoreTil".equals( datamemberName )  ) set_ignoreTil( Double.parseDouble(val) );
		else if (  "secondsPerLogicalTime".equals( datamemberName )  ) set_secondsPerLogicalTime( Double.parseDouble(val) );
		else if (  "startTime".equals( datamemberName )  ) set_startTime( Double.parseDouble(val) );
		else if (  "stopTime".equals( datamemberName )  ) set_stopTime( Double.parseDouble(val) );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "ignoreTil".equals( datamemberName )  ) set_ignoreTil( (Double)val );
		else if (  "secondsPerLogicalTime".equals( datamemberName )  ) set_secondsPerLogicalTime( (Double)val );
		else if (  "startTime".equals( datamemberName )  ) set_startTime( (Double)val );
		else if (  "stopTime".equals( datamemberName )  ) set_stopTime( (Double)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_ignoreTil_handle(), Double.toString(get_ignoreTil()).getBytes() );
		
			datamembers.add( get_secondsPerLogicalTime_handle(), Double.toString(get_secondsPerLogicalTime()).getBytes() );
		
			datamembers.add( get_startTime_handle(), Double.toString(get_startTime()).getBytes() );
		
			datamembers.add( get_stopTime_handle(), Double.toString(get_stopTime()).getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof SimTime ) {
			SimTime data = (SimTime)object;
			
			
				_ignoreTil = data._ignoreTil;
				_secondsPerLogicalTime = data._secondsPerLogicalTime;
				_startTime = data._startTime;
				_stopTime = data._stopTime;
			
		}
	}
}
