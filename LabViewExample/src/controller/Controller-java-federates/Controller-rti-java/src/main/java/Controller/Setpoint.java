
package Controller;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The Setpoint class implements the Setpoint object in the
* Controller simulation.
*/
public class Setpoint extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(Setpoint.class);

	/**
	* Default constructor -- creates an instance of the Setpoint object
	* class with default attribute values.
	*/
	public Setpoint() { }

	
	
	private static int _Occupied_handle;
	private static int _ZoneName_handle;
	private static int _ZoneTempSP_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "Occupied" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "Occupied" attribute
	*/
	public static int get_Occupied_handle() { return _Occupied_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ZoneName" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "ZoneName" attribute
	*/
	public static int get_ZoneName_handle() { return _ZoneName_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ZoneTempSP" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "ZoneTempSP" attribute
	*/
	public static int get_ZoneTempSP_handle() { return _ZoneTempSP_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the Setpoint object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the Setpoint
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.Setpoint"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the Setpoint object class.
	*/
	public static String get_simple_class_name() { return "Setpoint"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* Setpoint object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getAttributeNames()}.
	*/
	public static Set< String > get_attribute_names() {
		return new HashSet< String >(_datamemberNames);
	}


	/**
	* Returns a set containing the names of all of the attributes in the
	* Setpoint object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getAttributeNames()}.
	*/
	public static Set< String > get_all_attribute_names() {
		return new HashSet< String >(_allDatamemberNames);
	}


	
	private static AttributeHandleSet _publishedAttributeHandleSet;
	private static Set< String > _publishAttributeNameSet = new HashSet< String >();

	private static AttributeHandleSet _subscribedAttributeHandleSet; 
	private static Set< String > _subscribeAttributeNameSet = new HashSet< String >();

	

	static {
		_classNameSet.add("ObjectRoot.Setpoint");
		_classNameClassMap.put("ObjectRoot.Setpoint", Setpoint.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.Setpoint", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.Setpoint", _allDatamemberNames);

		
		
		_datamemberNames.add("Occupied");
		_datamemberNames.add("ZoneName");
		_datamemberNames.add("ZoneTempSP");
		
		
		_allDatamemberNames.add("Occupied");
		_allDatamemberNames.add("ZoneName");
		_allDatamemberNames.add("ZoneTempSP");
		
		
		_datamemberTypeMap.put("Occupied", "boolean");
		_datamemberTypeMap.put("ZoneName", "String");
		_datamemberTypeMap.put("ZoneTempSP", "double");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.Setpoint", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.Setpoint", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.Setpoint", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.Setpoint", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.Setpoint:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.Setpoint");
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

		_classNameHandleMap.put("ObjectRoot.Setpoint", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.Setpoint");
		_classHandleSimpleNameMap.put(get_handle(), "Setpoint");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_Occupied_handle = rti.getAttributeHandle("Occupied", get_handle());			
				_ZoneName_handle = rti.getAttributeHandle("ZoneName", get_handle());			
				_ZoneTempSP_handle = rti.getAttributeHandle("ZoneTempSP", get_handle());
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;
			} catch (ObjectClassNotDefined i) {
				logger.error("{} Object Class Not Defined", initErrorMessage);
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.Setpoint,Occupied", get_Occupied_handle());
		_datamemberNameHandleMap.put("ObjectRoot.Setpoint,ZoneName", get_ZoneName_handle());
		_datamemberNameHandleMap.put("ObjectRoot.Setpoint,ZoneTempSP", get_ZoneTempSP_handle());
			
			
		_datamemberHandleNameMap.put(get_Occupied_handle(), "Occupied");
		_datamemberHandleNameMap.put(get_ZoneName_handle(), "ZoneName");
		_datamemberHandleNameMap.put(get_ZoneTempSP_handle(), "ZoneTempSP");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.Setpoint:  could not publish:  ";

	/**
	* Publishes the Setpoint object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Setpoint," + attributeName));
			} catch (Exception e) {
				logger.error("{} Could not publish \"" + attributeName + "\" attribute.", publishErrorMessage);
			}
		}
	

		synchronized(rti) {
			boolean isNotPublished = true;
			while(isNotPublished) {
				try {
					rti.publishObjectClass(get_handle(), _publishedAttributeHandleSet);
					isNotPublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", publishErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", publishErrorMessage);
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.Setpoint:  could not unpublish:  ";
	/**
	* Unpublishes the Setpoint object class for a federate.
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
					rti.unpublishObjectClass(get_handle());
					isNotUnpublished = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unpublishErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (ObjectClassNotPublished i) {
					logger.error("{} Object Class Not Published", unpublishErrorMessage);
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.Setpoint:  could not subscribe:  ";
	/**
	* Subscribes a federate to the Setpoint object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Setpoint," + attributeName));
			} catch (Exception e) {
				logger.error("{} Could not subscribe to \"" + attributeName + "\" attribute.", subscribeErrorMessage);
			}
		}
	
		
		synchronized(rti) {
			boolean isNotSubscribed = true;
			while(isNotSubscribed) {
				try {
					rti.subscribeObjectClassAttributes(get_handle(), _subscribedAttributeHandleSet);
					isNotSubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", subscribeErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", subscribeErrorMessage);
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.Setpoint:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the Setpoint object class.
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
					rti.unsubscribeObjectClass(get_handle());
					isNotUnsubscribed = false;
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unsubscribeErrorMessage);
					logger.error(f);
					return;
				} catch (ObjectClassNotDefined i) {
					logger.error("{} Object Class Not Defined", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (ObjectClassNotSubscribed i) {
					logger.error("{} Object Class Not Subscribed", unsubscribeErrorMessage);
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
	* (that is, the Setpoint object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the Setpoint object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the Setpoint object class).
	*/
	public static boolean match(int handle) { return handle == get_handle(); }

	/**
	* Returns the handle (RTI assigned) of this instance's object class .
	* 
	* @return the handle (RTI assigned) if this instance's object class
	*/
	public int getClassHandle() { return get_handle(); }

	/**
	* Returns the fully-qualified (dot-delimited) name of this instance's object class.
	* 
	* @return the fully-qualified (dot-delimited) name of this instance's object class
	*/
	public String getClassName() { return get_class_name(); }

	/**
	* Returns the simple name (last name in its fully-qualified dot-delimited name)
	* of this instance's object class.
	* 
	* @return the simple name of this instance's object class 
	*/
	public String getSimpleClassName() { return get_simple_class_name(); }

	/**
	* Returns a set containing the names of all of the non-hiddenattributes of an
	* object class instance.
	*
	* @return set containing the names of all of the attributes of an
	* object class instance
	*/
	public Set< String > getAttributeNames() { return get_attribute_names(); }

	/**
	* Returns a set containing the names of all of the attributes of an
	* object class instance.
	*
	* @return set containing the names of all of the attributes of an
	* object class instance
	*/
	public Set< String > getAllAttributeNames() { return get_all_attribute_names(); }

	/**
	* Publishes the object class of this instance of the class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void publishObject(RTIambassador rti) { publish(rti); }

	/**
	* Unpublishes the object class of this instance of this class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unpublishObject(RTIambassador rti) { unpublish(rti); }

	/**
	* Subscribes a federate to the object class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void subscribeObject(RTIambassador rti) { subscribe(rti); }

	/**
	* Unsubscribes a federate from the object class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unsubscribeObject(RTIambassador rti) { unsubscribe(rti); }

	
	/**
	* Returns a data structure containing the handles of all attributes for this object
	* class that are currently marked for subscription.  To actually subscribe to these
	* attributes, a federate must call <objectclassname>.subscribe(RTIambassador rti).
	*
	* @return data structure containing the handles of all attributes for this object
	* class that are currently marked for subscription
	*/
	public AttributeHandleSet getSubscribedAttributeHandleSet() { return _subscribedAttributeHandleSet; }
	

	public String toString() {
		return "Setpoint("
			
			
			+ "Occupied:" + get_Occupied()
			+ "," + "ZoneName:" + get_ZoneName()
			+ "," + "ZoneTempSP:" + get_ZoneTempSP()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "Occupied" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Occupied" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_Occupied() {
		_publishAttributeNameSet.add( "Occupied" );
	}

	/**
	* Unpublishes the "Occupied" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "Occupied" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_Occupied() {
		_publishAttributeNameSet.remove( "Occupied" );
	}
	
	/**
	* Subscribes a federate to the "Occupied" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Occupied" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_Occupied() {
		_subscribeAttributeNameSet.add( "Occupied" );
	}

	/**
	* Unsubscribes a federate from the "Occupied" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "Occupied" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_Occupied() {
		_subscribeAttributeNameSet.remove( "Occupied" );
	}
	
	
	/**
	* Publishes the "ZoneName" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "ZoneName" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_ZoneName() {
		_publishAttributeNameSet.add( "ZoneName" );
	}

	/**
	* Unpublishes the "ZoneName" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "ZoneName" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_ZoneName() {
		_publishAttributeNameSet.remove( "ZoneName" );
	}
	
	/**
	* Subscribes a federate to the "ZoneName" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "ZoneName" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_ZoneName() {
		_subscribeAttributeNameSet.add( "ZoneName" );
	}

	/**
	* Unsubscribes a federate from the "ZoneName" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "ZoneName" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_ZoneName() {
		_subscribeAttributeNameSet.remove( "ZoneName" );
	}
	
	
	/**
	* Publishes the "ZoneTempSP" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "ZoneTempSP" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_ZoneTempSP() {
		_publishAttributeNameSet.add( "ZoneTempSP" );
	}

	/**
	* Unpublishes the "ZoneTempSP" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "ZoneTempSP" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_ZoneTempSP() {
		_publishAttributeNameSet.remove( "ZoneTempSP" );
	}
	
	/**
	* Subscribes a federate to the "ZoneTempSP" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "ZoneTempSP" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_ZoneTempSP() {
		_subscribeAttributeNameSet.add( "ZoneTempSP" );
	}

	/**
	* Unsubscribes a federate from the "ZoneTempSP" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "ZoneTempSP" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_ZoneTempSP() {
		_subscribeAttributeNameSet.remove( "ZoneTempSP" );
	}
	

	
	
	private Attribute< Boolean > _Occupied =
 		new Attribute< Boolean >(  new Boolean( false )  );
	
	/**
	* Set the value of the "Occupied" attribute to "value" for this object.
	*
	* @param value the new value for the "Occupied" attribute
	*/
	public void set_Occupied( boolean value ) {
		_Occupied.setValue( value );
		_Occupied.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "Occupied" attribute of this object.
	*
	* @return the value of the "Occupied" attribute
	*/
	public boolean get_Occupied() {
		return _Occupied.getValue();
	}
	
	/**
	* Returns the current timestamp of the "Occupied" attribute of this object.
	* 
	* @return the current timestamp of the "Occupied" attribute
	*/
	public double get_Occupied_time() {
		return _Occupied.getTime();
	}
	
	
	private Attribute< String > _ZoneName =
 		new Attribute< String >(  new String( "" )  );
	
	/**
	* Set the value of the "ZoneName" attribute to "value" for this object.
	*
	* @param value the new value for the "ZoneName" attribute
	*/
	public void set_ZoneName( String value ) {
		_ZoneName.setValue( value );
		_ZoneName.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "ZoneName" attribute of this object.
	*
	* @return the value of the "ZoneName" attribute
	*/
	public String get_ZoneName() {
		return _ZoneName.getValue();
	}
	
	/**
	* Returns the current timestamp of the "ZoneName" attribute of this object.
	* 
	* @return the current timestamp of the "ZoneName" attribute
	*/
	public double get_ZoneName_time() {
		return _ZoneName.getTime();
	}
	
	
	private Attribute< Double > _ZoneTempSP =
 		new Attribute< Double >(  new Double( 0 )  );
	
	/**
	* Set the value of the "ZoneTempSP" attribute to "value" for this object.
	*
	* @param value the new value for the "ZoneTempSP" attribute
	*/
	public void set_ZoneTempSP( double value ) {
		_ZoneTempSP.setValue( value );
		_ZoneTempSP.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "ZoneTempSP" attribute of this object.
	*
	* @return the value of the "ZoneTempSP" attribute
	*/
	public double get_ZoneTempSP() {
		return _ZoneTempSP.getValue();
	}
	
	/**
	* Returns the current timestamp of the "ZoneTempSP" attribute of this object.
	* 
	* @return the current timestamp of the "ZoneTempSP" attribute
	*/
	public double get_ZoneTempSP_time() {
		return _ZoneTempSP.getTime();
	}
	


	protected Setpoint( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected Setpoint( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the Setpoint object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Setpoint object class instance
	*/
	public Setpoint( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #Setpoint( ReflectedAttributes datamemberMap )}, except this
	* new Setpoint object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Setpoint object class instance
	* @param logicalTime timestamp for this new Setpoint object class
	* instance
	*/
	public Setpoint( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new Setpoint object class instance that is a duplicate
	* of the instance referred to by Setpoint_var.
	*
	* @param Setpoint_var Setpoint object class instance of which
	* this newly created Setpoint object class instance will be a
	* duplicate
	*/
	public Setpoint( Setpoint Setpoint_var ) {
		super( Setpoint_var );
		
		
		set_Occupied( Setpoint_var.get_Occupied() );
		set_ZoneName( Setpoint_var.get_ZoneName() );
		set_ZoneTempSP( Setpoint_var.get_ZoneTempSP() );
	}


	/**
	* Returns the value of the attribute whose name is "datamemberName"
	* for this object.
	*
	* @param datamemberName name of attribute whose value is to be
	* returned
	* @return value of the attribute whose name is "datamemberName"
	* for this object
	*/
	public Object getAttribute( String datamemberName ) {
		
		
		
		if (  "Occupied".equals( datamemberName )  ) return new Boolean(get_Occupied());
		else if (  "ZoneName".equals( datamemberName )  ) return get_ZoneName();
		else if (  "ZoneTempSP".equals( datamemberName )  ) return new Double(get_ZoneTempSP());
		else return super.getAttribute( datamemberName );
	}
	
	/**
	* Returns the value of the attribute whose handle (RTI assigned)
	* is "datamemberHandle" for this object.
	*
	* @param datamemberHandle handle (RTI assigned) of attribute whose
	* value is to be returned
	* @return value of the attribute whose handle (RTI assigned) is
	* "datamemberHandle" for this object
	*/
	public Object getAttribute( int datamemberHandle ) {
		
				
		
		if ( get_Occupied_handle() == datamemberHandle ) return new Boolean(get_Occupied());
		else if ( get_ZoneName_handle() == datamemberHandle ) return get_ZoneName();
		else if ( get_ZoneTempSP_handle() == datamemberHandle ) return new Double(get_ZoneTempSP());
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_Occupied_handle() ) set_Occupied( Boolean.parseBoolean(val) );
		else if ( param_handle == get_ZoneName_handle() ) set_ZoneName( val );
		else if ( param_handle == get_ZoneTempSP_handle() ) set_ZoneTempSP( Double.parseDouble(val) );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "Occupied".equals( datamemberName )  ) set_Occupied( Boolean.parseBoolean(val) );
		else if (  "ZoneName".equals( datamemberName )  ) set_ZoneName( val );
		else if (  "ZoneTempSP".equals( datamemberName )  ) set_ZoneTempSP( Double.parseDouble(val) );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "Occupied".equals( datamemberName )  ) set_Occupied( (Boolean)val );
		else if (  "ZoneName".equals( datamemberName )  ) set_ZoneName( (String)val );
		else if (  "ZoneTempSP".equals( datamemberName )  ) set_ZoneTempSP( (Double)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_Occupied_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Setpoint.createSuppliedAttributes:  could not determine if Occupied is published.");
				isPublished = false;
			}
			if (  isPublished && _Occupied.shouldBeUpdated( force )  ) {
				datamembers.add( get_Occupied_handle(), Boolean.toString(get_Occupied()).getBytes() );
				_Occupied.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_ZoneName_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Setpoint.createSuppliedAttributes:  could not determine if ZoneName is published.");
				isPublished = false;
			}
			if (  isPublished && _ZoneName.shouldBeUpdated( force )  ) {
				datamembers.add( get_ZoneName_handle(), get_ZoneName().getBytes() );
				_ZoneName.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_ZoneTempSP_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Setpoint.createSuppliedAttributes:  could not determine if ZoneTempSP is published.");
				isPublished = false;
			}
			if (  isPublished && _ZoneTempSP.shouldBeUpdated( force )  ) {
				datamembers.add( get_ZoneTempSP_handle(), Double.toString(get_ZoneTempSP()).getBytes() );
				_ZoneTempSP.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof Setpoint ) {
			Setpoint data = (Setpoint)object;
			
			
				_Occupied = data._Occupied;
				_ZoneName = data._ZoneName;
				_ZoneTempSP = data._ZoneTempSP;
			
		}
	}
}
