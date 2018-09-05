
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The StartDelayNodeAttack class implements the StartDelayNodeAttack interaction in the
* MapperEx simulation.
*/
public class StartDelayNodeAttack extends OmnetCommand {

	private static final Logger logger = LogManager.getLogger(StartDelayNodeAttack.class);

	/**
	* Default constructor -- creates an instance of the StartDelayNodeAttack interaction
	* class with default parameter values.
	*/
	public StartDelayNodeAttack() { }

	
	
	private static int _delayMean_handle;
	private static int _delayStdDev_handle;
	private static int _nodeFullPath_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "delayMean" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "delayMean" parameter
	*/
	public static int get_delayMean_handle() { return _delayMean_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "delayStdDev" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "delayStdDev" parameter
	*/
	public static int get_delayStdDev_handle() { return _delayStdDev_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "nodeFullPath" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "nodeFullPath" parameter
	*/
	public static int get_nodeFullPath_handle() { return _nodeFullPath_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the StartDelayNodeAttack interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the StartDelayNodeAttack
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the StartDelayNodeAttack interaction class.
	*/
	public static String get_simple_class_name() { return "StartDelayNodeAttack"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* StartDelayNodeAttack interaction class.
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
	* StartDelayNodeAttack interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack", StartDelayNodeAttack.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack", _allDatamemberNames);

		
		
		
		_datamemberNames.add("delayMean");
		_datamemberNames.add("delayStdDev");
		
		_datamemberNames.add("nodeFullPath");
		
		
		
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("delayMean");
		_allDatamemberNames.add("delayStdDev");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("nodeFullPath");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("uniqueCommandID");
		
		
		_datamemberTypeMap.put("delayMean", "double");
		_datamemberTypeMap.put("delayStdDev", "double");
		_datamemberTypeMap.put("nodeFullPath", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		OmnetCommand.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack");
		_classHandleSimpleNameMap.put(get_handle(), "StartDelayNodeAttack");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_delayMean_handle = rti.getParameterHandle("delayMean", get_handle());			
				_delayStdDev_handle = rti.getParameterHandle("delayStdDev", get_handle());			
				_nodeFullPath_handle = rti.getParameterHandle("nodeFullPath", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack,delayMean", get_delayMean_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack,delayStdDev", get_delayStdDev_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack,nodeFullPath", get_nodeFullPath_handle());
			
			
		_datamemberHandleNameMap.put(get_delayMean_handle(), "delayMean");
		_datamemberHandleNameMap.put(get_delayStdDev_handle(), "delayStdDev");
		_datamemberHandleNameMap.put(get_nodeFullPath_handle(), "nodeFullPath");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack:  could not publish:  ";

	/**
	* Publishes the StartDelayNodeAttack interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack:  could not unpublish:  ";
	/**
	* Unpublishes the StartDelayNodeAttack interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack:  could not subscribe:  ";
	/**
	* Subscribes a federate to the StartDelayNodeAttack interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.OmnetCommand.StartDelayNodeAttack:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the StartDelayNodeAttack interaction class.
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
	* (that is, the StartDelayNodeAttack interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the StartDelayNodeAttack interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the StartDelayNodeAttack interaction class).
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
		return "StartDelayNodeAttack("
			
			
			+ "delayMean:" + get_delayMean()
			+ "," + "delayStdDev:" + get_delayStdDev()
			+ "," + "nodeFullPath:" + get_nodeFullPath()
			+ ")";
	}
	



	
	
	private double _delayMean = 0;
	
	private double _delayStdDev = 0;
	
	private String _nodeFullPath = "";

	
	
	/**
	* Set the value of the "delayMean" parameter to "value" for this parameter.
	*
	* @param value the new value for the "delayMean" parameter
	*/
	public void set_delayMean( double value ) { _delayMean = value; }
	
	/**
	* Returns the value of the "delayMean" parameter of this interaction.
	*
	* @return the value of the "delayMean" parameter
	*/
	public double get_delayMean() { return _delayMean; }
	
	
	/**
	* Set the value of the "delayStdDev" parameter to "value" for this parameter.
	*
	* @param value the new value for the "delayStdDev" parameter
	*/
	public void set_delayStdDev( double value ) { _delayStdDev = value; }
	
	/**
	* Returns the value of the "delayStdDev" parameter of this interaction.
	*
	* @return the value of the "delayStdDev" parameter
	*/
	public double get_delayStdDev() { return _delayStdDev; }
	
	
	/**
	* Set the value of the "nodeFullPath" parameter to "value" for this parameter.
	*
	* @param value the new value for the "nodeFullPath" parameter
	*/
	public void set_nodeFullPath( String value ) { _nodeFullPath = value; }
	
	/**
	* Returns the value of the "nodeFullPath" parameter of this interaction.
	*
	* @return the value of the "nodeFullPath" parameter
	*/
	public String get_nodeFullPath() { return _nodeFullPath; }
	


	protected StartDelayNodeAttack( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected StartDelayNodeAttack( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the StartDelayNodeAttack interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new StartDelayNodeAttack interaction class instance
	*/
	public StartDelayNodeAttack( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #StartDelayNodeAttack( ReceivedInteraction datamemberMap )}, except this
	* new StartDelayNodeAttack interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new StartDelayNodeAttack interaction class instance
	* @param logicalTime timestamp for this new StartDelayNodeAttack interaction class
	* instance
	*/
	public StartDelayNodeAttack( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new StartDelayNodeAttack interaction class instance that is a duplicate
	* of the instance referred to by StartDelayNodeAttack_var.
	*
	* @param StartDelayNodeAttack_var StartDelayNodeAttack interaction class instance of which
	* this newly created StartDelayNodeAttack interaction class instance will be a
	* duplicate
	*/
	public StartDelayNodeAttack( StartDelayNodeAttack StartDelayNodeAttack_var ) {
		super( StartDelayNodeAttack_var );
		
		
		set_delayMean( StartDelayNodeAttack_var.get_delayMean() );
		set_delayStdDev( StartDelayNodeAttack_var.get_delayStdDev() );
		set_nodeFullPath( StartDelayNodeAttack_var.get_nodeFullPath() );
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
		
		
		
		if (  "delayMean".equals( datamemberName )  ) return new Double(get_delayMean());
		else if (  "delayStdDev".equals( datamemberName )  ) return new Double(get_delayStdDev());
		else if (  "nodeFullPath".equals( datamemberName )  ) return get_nodeFullPath();
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
		
				
		
		if ( get_delayMean_handle() == datamemberHandle ) return new Double(get_delayMean());
		else if ( get_delayStdDev_handle() == datamemberHandle ) return new Double(get_delayStdDev());
		else if ( get_nodeFullPath_handle() == datamemberHandle ) return get_nodeFullPath();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_delayMean_handle() ) set_delayMean( Double.parseDouble(val) );
		else if ( param_handle == get_delayStdDev_handle() ) set_delayStdDev( Double.parseDouble(val) );
		else if ( param_handle == get_nodeFullPath_handle() ) set_nodeFullPath( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "delayMean".equals( datamemberName )  ) set_delayMean( Double.parseDouble(val) );
		else if (  "delayStdDev".equals( datamemberName )  ) set_delayStdDev( Double.parseDouble(val) );
		else if (  "nodeFullPath".equals( datamemberName )  ) set_nodeFullPath( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "delayMean".equals( datamemberName )  ) set_delayMean( (Double)val );
		else if (  "delayStdDev".equals( datamemberName )  ) set_delayStdDev( (Double)val );
		else if (  "nodeFullPath".equals( datamemberName )  ) set_nodeFullPath( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_delayMean_handle(), Double.toString(get_delayMean()).getBytes() );
		
			datamembers.add( get_delayStdDev_handle(), Double.toString(get_delayStdDev()).getBytes() );
		
			datamembers.add( get_nodeFullPath_handle(), get_nodeFullPath().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof StartDelayNodeAttack ) {
			StartDelayNodeAttack data = (StartDelayNodeAttack)object;
			
			
				_delayMean = data._delayMean;
				_delayStdDev = data._delayStdDev;
				_nodeFullPath = data._nodeFullPath;
			
		}
	}
}
