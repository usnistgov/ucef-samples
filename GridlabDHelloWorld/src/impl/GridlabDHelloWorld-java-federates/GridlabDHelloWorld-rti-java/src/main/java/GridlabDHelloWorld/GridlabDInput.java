
package GridlabDHelloWorld;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The GridlabDInput class implements the GridlabDInput interaction in the
* GridlabDHelloWorld simulation.
*/
public class GridlabDInput extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(GridlabDInput.class);

	/**
	* Default constructor -- creates an instance of the GridlabDInput interaction
	* class with default parameter values.
	*/
	public GridlabDInput() { }

	
	
	private static int _ModelName_handle;
	private static int _ObjectName_handle;
	private static int _Operation_handle;
	private static int _Parameter_handle;
	private static int _Units_handle;
	private static int _Value_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "ModelName" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ModelName" parameter
	*/
	public static int get_ModelName_handle() { return _ModelName_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ObjectName" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ObjectName" parameter
	*/
	public static int get_ObjectName_handle() { return _ObjectName_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Operation" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "Operation" parameter
	*/
	public static int get_Operation_handle() { return _Operation_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Parameter" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "Parameter" parameter
	*/
	public static int get_Parameter_handle() { return _Parameter_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Units" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "Units" parameter
	*/
	public static int get_Units_handle() { return _Units_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "Value" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "Value" parameter
	*/
	public static int get_Value_handle() { return _Value_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the GridlabDInput interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the GridlabDInput
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.GridlabDInput"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the GridlabDInput interaction class.
	*/
	public static String get_simple_class_name() { return "GridlabDInput"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* GridlabDInput interaction class.
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
	* GridlabDInput interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.GridlabDInput");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput", GridlabDInput.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput", _allDatamemberNames);

		
		
		_datamemberNames.add("ModelName");
		_datamemberNames.add("ObjectName");
		_datamemberNames.add("Operation");
		_datamemberNames.add("Parameter");
		_datamemberNames.add("Units");
		_datamemberNames.add("Value");
		
		
		
		
		
		
		_allDatamemberNames.add("ModelName");
		_allDatamemberNames.add("ObjectName");
		_allDatamemberNames.add("Operation");
		_allDatamemberNames.add("Parameter");
		_allDatamemberNames.add("Units");
		_allDatamemberNames.add("Value");
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("ModelName", "String");
		_datamemberTypeMap.put("ObjectName", "String");
		_datamemberTypeMap.put("Operation", "int");
		_datamemberTypeMap.put("Parameter", "String");
		_datamemberTypeMap.put("Units", "String");
		_datamemberTypeMap.put("Value", "double");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.GridlabDInput:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.GridlabDInput");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.GridlabDInput");
		_classHandleSimpleNameMap.put(get_handle(), "GridlabDInput");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_ModelName_handle = rti.getParameterHandle("ModelName", get_handle());			
				_ObjectName_handle = rti.getParameterHandle("ObjectName", get_handle());			
				_Operation_handle = rti.getParameterHandle("Operation", get_handle());			
				_Parameter_handle = rti.getParameterHandle("Parameter", get_handle());			
				_Units_handle = rti.getParameterHandle("Units", get_handle());			
				_Value_handle = rti.getParameterHandle("Value", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,ModelName", get_ModelName_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,ObjectName", get_ObjectName_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,Operation", get_Operation_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,Parameter", get_Parameter_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,Units", get_Units_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.GridlabDInput,Value", get_Value_handle());
			
			
		_datamemberHandleNameMap.put(get_ModelName_handle(), "ModelName");
		_datamemberHandleNameMap.put(get_ObjectName_handle(), "ObjectName");
		_datamemberHandleNameMap.put(get_Operation_handle(), "Operation");
		_datamemberHandleNameMap.put(get_Parameter_handle(), "Parameter");
		_datamemberHandleNameMap.put(get_Units_handle(), "Units");
		_datamemberHandleNameMap.put(get_Value_handle(), "Value");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.GridlabDInput:  could not publish:  ";

	/**
	* Publishes the GridlabDInput interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.GridlabDInput:  could not unpublish:  ";
	/**
	* Unpublishes the GridlabDInput interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.GridlabDInput:  could not subscribe:  ";
	/**
	* Subscribes a federate to the GridlabDInput interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.GridlabDInput:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the GridlabDInput interaction class.
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
	* (that is, the GridlabDInput interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the GridlabDInput interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the GridlabDInput interaction class).
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
		return "GridlabDInput("
			
			
			+ "ModelName:" + get_ModelName()
			+ "," + "ObjectName:" + get_ObjectName()
			+ "," + "Operation:" + get_Operation()
			+ "," + "Parameter:" + get_Parameter()
			+ "," + "Units:" + get_Units()
			+ "," + "Value:" + get_Value()
			+ ")";
	}
	



	
	
	private String _ModelName = "";
	
	private String _ObjectName = "";
	
	private int _Operation = 0;
	
	private String _Parameter = "";
	
	private String _Units = "";
	
	private double _Value = 0;

	
	
	/**
	* Set the value of the "ModelName" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ModelName" parameter
	*/
	public void set_ModelName( String value ) { _ModelName = value; }
	
	/**
	* Returns the value of the "ModelName" parameter of this interaction.
	*
	* @return the value of the "ModelName" parameter
	*/
	public String get_ModelName() { return _ModelName; }
	
	
	/**
	* Set the value of the "ObjectName" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ObjectName" parameter
	*/
	public void set_ObjectName( String value ) { _ObjectName = value; }
	
	/**
	* Returns the value of the "ObjectName" parameter of this interaction.
	*
	* @return the value of the "ObjectName" parameter
	*/
	public String get_ObjectName() { return _ObjectName; }
	
	
	/**
	* Set the value of the "Operation" parameter to "value" for this parameter.
	*
	* @param value the new value for the "Operation" parameter
	*/
	public void set_Operation( int value ) { _Operation = value; }
	
	/**
	* Returns the value of the "Operation" parameter of this interaction.
	*
	* @return the value of the "Operation" parameter
	*/
	public int get_Operation() { return _Operation; }
	
	
	/**
	* Set the value of the "Parameter" parameter to "value" for this parameter.
	*
	* @param value the new value for the "Parameter" parameter
	*/
	public void set_Parameter( String value ) { _Parameter = value; }
	
	/**
	* Returns the value of the "Parameter" parameter of this interaction.
	*
	* @return the value of the "Parameter" parameter
	*/
	public String get_Parameter() { return _Parameter; }
	
	
	/**
	* Set the value of the "Units" parameter to "value" for this parameter.
	*
	* @param value the new value for the "Units" parameter
	*/
	public void set_Units( String value ) { _Units = value; }
	
	/**
	* Returns the value of the "Units" parameter of this interaction.
	*
	* @return the value of the "Units" parameter
	*/
	public String get_Units() { return _Units; }
	
	
	/**
	* Set the value of the "Value" parameter to "value" for this parameter.
	*
	* @param value the new value for the "Value" parameter
	*/
	public void set_Value( double value ) { _Value = value; }
	
	/**
	* Returns the value of the "Value" parameter of this interaction.
	*
	* @return the value of the "Value" parameter
	*/
	public double get_Value() { return _Value; }
	


	protected GridlabDInput( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected GridlabDInput( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the GridlabDInput interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new GridlabDInput interaction class instance
	*/
	public GridlabDInput( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #GridlabDInput( ReceivedInteraction datamemberMap )}, except this
	* new GridlabDInput interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new GridlabDInput interaction class instance
	* @param logicalTime timestamp for this new GridlabDInput interaction class
	* instance
	*/
	public GridlabDInput( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new GridlabDInput interaction class instance that is a duplicate
	* of the instance referred to by GridlabDInput_var.
	*
	* @param GridlabDInput_var GridlabDInput interaction class instance of which
	* this newly created GridlabDInput interaction class instance will be a
	* duplicate
	*/
	public GridlabDInput( GridlabDInput GridlabDInput_var ) {
		super( GridlabDInput_var );
		
		
		set_ModelName( GridlabDInput_var.get_ModelName() );
		set_ObjectName( GridlabDInput_var.get_ObjectName() );
		set_Operation( GridlabDInput_var.get_Operation() );
		set_Parameter( GridlabDInput_var.get_Parameter() );
		set_Units( GridlabDInput_var.get_Units() );
		set_Value( GridlabDInput_var.get_Value() );
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
		
		
		
		if (  "ModelName".equals( datamemberName )  ) return get_ModelName();
		else if (  "ObjectName".equals( datamemberName )  ) return get_ObjectName();
		else if (  "Operation".equals( datamemberName )  ) return new Integer(get_Operation());
		else if (  "Parameter".equals( datamemberName )  ) return get_Parameter();
		else if (  "Units".equals( datamemberName )  ) return get_Units();
		else if (  "Value".equals( datamemberName )  ) return new Double(get_Value());
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
		
				
		
		if ( get_ModelName_handle() == datamemberHandle ) return get_ModelName();
		else if ( get_ObjectName_handle() == datamemberHandle ) return get_ObjectName();
		else if ( get_Operation_handle() == datamemberHandle ) return new Integer(get_Operation());
		else if ( get_Parameter_handle() == datamemberHandle ) return get_Parameter();
		else if ( get_Units_handle() == datamemberHandle ) return get_Units();
		else if ( get_Value_handle() == datamemberHandle ) return new Double(get_Value());
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_ModelName_handle() ) set_ModelName( val );
		else if ( param_handle == get_ObjectName_handle() ) set_ObjectName( val );
		else if ( param_handle == get_Operation_handle() ) set_Operation( Integer.parseInt(val) );
		else if ( param_handle == get_Parameter_handle() ) set_Parameter( val );
		else if ( param_handle == get_Units_handle() ) set_Units( val );
		else if ( param_handle == get_Value_handle() ) set_Value( Double.parseDouble(val) );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "ModelName".equals( datamemberName )  ) set_ModelName( val );
		else if (  "ObjectName".equals( datamemberName )  ) set_ObjectName( val );
		else if (  "Operation".equals( datamemberName )  ) set_Operation( Integer.parseInt(val) );
		else if (  "Parameter".equals( datamemberName )  ) set_Parameter( val );
		else if (  "Units".equals( datamemberName )  ) set_Units( val );
		else if (  "Value".equals( datamemberName )  ) set_Value( Double.parseDouble(val) );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "ModelName".equals( datamemberName )  ) set_ModelName( (String)val );
		else if (  "ObjectName".equals( datamemberName )  ) set_ObjectName( (String)val );
		else if (  "Operation".equals( datamemberName )  ) set_Operation( (Integer)val );
		else if (  "Parameter".equals( datamemberName )  ) set_Parameter( (String)val );
		else if (  "Units".equals( datamemberName )  ) set_Units( (String)val );
		else if (  "Value".equals( datamemberName )  ) set_Value( (Double)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_ModelName_handle(), get_ModelName().getBytes() );
		
			datamembers.add( get_ObjectName_handle(), get_ObjectName().getBytes() );
		
			datamembers.add( get_Operation_handle(), Integer.toString(get_Operation()).getBytes() );
		
			datamembers.add( get_Parameter_handle(), get_Parameter().getBytes() );
		
			datamembers.add( get_Units_handle(), get_Units().getBytes() );
		
			datamembers.add( get_Value_handle(), Double.toString(get_Value()).getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof GridlabDInput ) {
			GridlabDInput data = (GridlabDInput)object;
			
			
				_ModelName = data._ModelName;
				_ObjectName = data._ObjectName;
				_Operation = data._Operation;
				_Parameter = data._Parameter;
				_Units = data._Units;
				_Value = data._Value;
			
		}
	}
}
