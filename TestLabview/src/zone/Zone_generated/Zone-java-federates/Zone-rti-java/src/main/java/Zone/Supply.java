
package Zone;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The Supply class implements the Supply interaction in the
* Zone simulation.
*/
public class Supply extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(Supply.class);

	/**
	* Default constructor -- creates an instance of the Supply interaction
	* class with default parameter values.
	*/
	public Supply() { }

	
	
	private static int _SupplyAirHumidity_handle;
	private static int _SupplyAirTemp_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "SupplyAirHumidity" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "SupplyAirHumidity" parameter
	*/
	public static int get_SupplyAirHumidity_handle() { return _SupplyAirHumidity_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "SupplyAirTemp" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "SupplyAirTemp" parameter
	*/
	public static int get_SupplyAirTemp_handle() { return _SupplyAirTemp_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the Supply interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the Supply
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.Supply"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the Supply interaction class.
	*/
	public static String get_simple_class_name() { return "Supply"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* Supply interaction class.
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
	* Supply interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.Supply");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.Supply", Supply.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.Supply", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.Supply", _allDatamemberNames);

		
		
		_datamemberNames.add("SupplyAirHumidity");
		_datamemberNames.add("SupplyAirTemp");
		
		
		
		
		
		
		_allDatamemberNames.add("SupplyAirHumidity");
		_allDatamemberNames.add("SupplyAirTemp");
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("SupplyAirHumidity", "double");
		_datamemberTypeMap.put("SupplyAirTemp", "double");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Supply:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.Supply");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Supply", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.Supply");
		_classHandleSimpleNameMap.put(get_handle(), "Supply");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_SupplyAirHumidity_handle = rti.getParameterHandle("SupplyAirHumidity", get_handle());			
				_SupplyAirTemp_handle = rti.getParameterHandle("SupplyAirTemp", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Supply,SupplyAirHumidity", get_SupplyAirHumidity_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.Supply,SupplyAirTemp", get_SupplyAirTemp_handle());
			
			
		_datamemberHandleNameMap.put(get_SupplyAirHumidity_handle(), "SupplyAirHumidity");
		_datamemberHandleNameMap.put(get_SupplyAirTemp_handle(), "SupplyAirTemp");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Supply:  could not publish:  ";

	/**
	* Publishes the Supply interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Supply:  could not unpublish:  ";
	/**
	* Unpublishes the Supply interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Supply:  could not subscribe:  ";
	/**
	* Subscribes a federate to the Supply interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.Supply:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the Supply interaction class.
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
	* (that is, the Supply interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the Supply interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the Supply interaction class).
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
		return "Supply("
			
			
			+ "SupplyAirHumidity:" + get_SupplyAirHumidity()
			+ "," + "SupplyAirTemp:" + get_SupplyAirTemp()
			+ ")";
	}
	



	
	
	private double _SupplyAirHumidity = 0;
	
	private double _SupplyAirTemp = 0;

	
	
	/**
	* Set the value of the "SupplyAirHumidity" parameter to "value" for this parameter.
	*
	* @param value the new value for the "SupplyAirHumidity" parameter
	*/
	public void set_SupplyAirHumidity( double value ) { _SupplyAirHumidity = value; }
	
	/**
	* Returns the value of the "SupplyAirHumidity" parameter of this interaction.
	*
	* @return the value of the "SupplyAirHumidity" parameter
	*/
	public double get_SupplyAirHumidity() { return _SupplyAirHumidity; }
	
	
	/**
	* Set the value of the "SupplyAirTemp" parameter to "value" for this parameter.
	*
	* @param value the new value for the "SupplyAirTemp" parameter
	*/
	public void set_SupplyAirTemp( double value ) { _SupplyAirTemp = value; }
	
	/**
	* Returns the value of the "SupplyAirTemp" parameter of this interaction.
	*
	* @return the value of the "SupplyAirTemp" parameter
	*/
	public double get_SupplyAirTemp() { return _SupplyAirTemp; }
	


	protected Supply( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected Supply( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the Supply interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new Supply interaction class instance
	*/
	public Supply( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #Supply( ReceivedInteraction datamemberMap )}, except this
	* new Supply interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new Supply interaction class instance
	* @param logicalTime timestamp for this new Supply interaction class
	* instance
	*/
	public Supply( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new Supply interaction class instance that is a duplicate
	* of the instance referred to by Supply_var.
	*
	* @param Supply_var Supply interaction class instance of which
	* this newly created Supply interaction class instance will be a
	* duplicate
	*/
	public Supply( Supply Supply_var ) {
		super( Supply_var );
		
		
		set_SupplyAirHumidity( Supply_var.get_SupplyAirHumidity() );
		set_SupplyAirTemp( Supply_var.get_SupplyAirTemp() );
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
		
		
		
		if (  "SupplyAirHumidity".equals( datamemberName )  ) return new Double(get_SupplyAirHumidity());
		else if (  "SupplyAirTemp".equals( datamemberName )  ) return new Double(get_SupplyAirTemp());
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
		
				
		
		if ( get_SupplyAirHumidity_handle() == datamemberHandle ) return new Double(get_SupplyAirHumidity());
		else if ( get_SupplyAirTemp_handle() == datamemberHandle ) return new Double(get_SupplyAirTemp());
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_SupplyAirHumidity_handle() ) set_SupplyAirHumidity( Double.parseDouble(val) );
		else if ( param_handle == get_SupplyAirTemp_handle() ) set_SupplyAirTemp( Double.parseDouble(val) );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "SupplyAirHumidity".equals( datamemberName )  ) set_SupplyAirHumidity( Double.parseDouble(val) );
		else if (  "SupplyAirTemp".equals( datamemberName )  ) set_SupplyAirTemp( Double.parseDouble(val) );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "SupplyAirHumidity".equals( datamemberName )  ) set_SupplyAirHumidity( (Double)val );
		else if (  "SupplyAirTemp".equals( datamemberName )  ) set_SupplyAirTemp( (Double)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_SupplyAirHumidity_handle(), Double.toString(get_SupplyAirHumidity()).getBytes() );
		
			datamembers.add( get_SupplyAirTemp_handle(), Double.toString(get_SupplyAirTemp()).getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof Supply ) {
			Supply data = (Supply)object;
			
			
				_SupplyAirHumidity = data._SupplyAirHumidity;
				_SupplyAirTemp = data._SupplyAirTemp;
			
		}
	}
}
