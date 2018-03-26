
package Controller;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The ZoneState class implements the ZoneState object in the
* Controller simulation.
*/
public class ZoneState extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(ZoneState.class);

	/**
	* Default constructor -- creates an instance of the ZoneState object
	* class with default attribute values.
	*/
	public ZoneState() { }

	
	
	private static int _CoolingOverride_handle;
	private static int _IATemperature_handle;
	private static int _PowerTotal_handle;
	private static int _ZoneName_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "CoolingOverride" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "CoolingOverride" attribute
	*/
	public static int get_CoolingOverride_handle() { return _CoolingOverride_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "IATemperature" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "IATemperature" attribute
	*/
	public static int get_IATemperature_handle() { return _IATemperature_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "PowerTotal" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "PowerTotal" attribute
	*/
	public static int get_PowerTotal_handle() { return _PowerTotal_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ZoneName" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "ZoneName" attribute
	*/
	public static int get_ZoneName_handle() { return _ZoneName_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the ZoneState object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the ZoneState
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.ZoneState"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the ZoneState object class.
	*/
	public static String get_simple_class_name() { return "ZoneState"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* ZoneState object class.
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
	* ZoneState object class.
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
		_classNameSet.add("ObjectRoot.ZoneState");
		_classNameClassMap.put("ObjectRoot.ZoneState", ZoneState.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.ZoneState", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.ZoneState", _allDatamemberNames);

		
		
		_datamemberNames.add("CoolingOverride");
		_datamemberNames.add("IATemperature");
		_datamemberNames.add("PowerTotal");
		_datamemberNames.add("ZoneName");
		
		
		_allDatamemberNames.add("CoolingOverride");
		_allDatamemberNames.add("IATemperature");
		_allDatamemberNames.add("PowerTotal");
		_allDatamemberNames.add("ZoneName");
		
		
		_datamemberTypeMap.put("CoolingOverride", "boolean");
		_datamemberTypeMap.put("IATemperature", "double");
		_datamemberTypeMap.put("PowerTotal", "double");
		_datamemberTypeMap.put("ZoneName", "String");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.ZoneState", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.ZoneState", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.ZoneState", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.ZoneState", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.ZoneState:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.ZoneState");
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

		_classNameHandleMap.put("ObjectRoot.ZoneState", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.ZoneState");
		_classHandleSimpleNameMap.put(get_handle(), "ZoneState");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_CoolingOverride_handle = rti.getAttributeHandle("CoolingOverride", get_handle());			
				_IATemperature_handle = rti.getAttributeHandle("IATemperature", get_handle());			
				_PowerTotal_handle = rti.getAttributeHandle("PowerTotal", get_handle());			
				_ZoneName_handle = rti.getAttributeHandle("ZoneName", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.ZoneState,CoolingOverride", get_CoolingOverride_handle());
		_datamemberNameHandleMap.put("ObjectRoot.ZoneState,IATemperature", get_IATemperature_handle());
		_datamemberNameHandleMap.put("ObjectRoot.ZoneState,PowerTotal", get_PowerTotal_handle());
		_datamemberNameHandleMap.put("ObjectRoot.ZoneState,ZoneName", get_ZoneName_handle());
			
			
		_datamemberHandleNameMap.put(get_CoolingOverride_handle(), "CoolingOverride");
		_datamemberHandleNameMap.put(get_IATemperature_handle(), "IATemperature");
		_datamemberHandleNameMap.put(get_PowerTotal_handle(), "PowerTotal");
		_datamemberHandleNameMap.put(get_ZoneName_handle(), "ZoneName");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.ZoneState:  could not publish:  ";

	/**
	* Publishes the ZoneState object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ZoneState," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.ZoneState:  could not unpublish:  ";
	/**
	* Unpublishes the ZoneState object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.ZoneState:  could not subscribe:  ";
	/**
	* Subscribes a federate to the ZoneState object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ZoneState," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.ZoneState:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the ZoneState object class.
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
	* (that is, the ZoneState object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the ZoneState object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the ZoneState object class).
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
		return "ZoneState("
			
			
			+ "CoolingOverride:" + get_CoolingOverride()
			+ "," + "IATemperature:" + get_IATemperature()
			+ "," + "PowerTotal:" + get_PowerTotal()
			+ "," + "ZoneName:" + get_ZoneName()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "CoolingOverride" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "CoolingOverride" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_CoolingOverride() {
		_publishAttributeNameSet.add( "CoolingOverride" );
	}

	/**
	* Unpublishes the "CoolingOverride" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "CoolingOverride" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_CoolingOverride() {
		_publishAttributeNameSet.remove( "CoolingOverride" );
	}
	
	/**
	* Subscribes a federate to the "CoolingOverride" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "CoolingOverride" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_CoolingOverride() {
		_subscribeAttributeNameSet.add( "CoolingOverride" );
	}

	/**
	* Unsubscribes a federate from the "CoolingOverride" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "CoolingOverride" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_CoolingOverride() {
		_subscribeAttributeNameSet.remove( "CoolingOverride" );
	}
	
	
	/**
	* Publishes the "IATemperature" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "IATemperature" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_IATemperature() {
		_publishAttributeNameSet.add( "IATemperature" );
	}

	/**
	* Unpublishes the "IATemperature" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "IATemperature" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_IATemperature() {
		_publishAttributeNameSet.remove( "IATemperature" );
	}
	
	/**
	* Subscribes a federate to the "IATemperature" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "IATemperature" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_IATemperature() {
		_subscribeAttributeNameSet.add( "IATemperature" );
	}

	/**
	* Unsubscribes a federate from the "IATemperature" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "IATemperature" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_IATemperature() {
		_subscribeAttributeNameSet.remove( "IATemperature" );
	}
	
	
	/**
	* Publishes the "PowerTotal" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "PowerTotal" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_PowerTotal() {
		_publishAttributeNameSet.add( "PowerTotal" );
	}

	/**
	* Unpublishes the "PowerTotal" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "PowerTotal" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_PowerTotal() {
		_publishAttributeNameSet.remove( "PowerTotal" );
	}
	
	/**
	* Subscribes a federate to the "PowerTotal" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "PowerTotal" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_PowerTotal() {
		_subscribeAttributeNameSet.add( "PowerTotal" );
	}

	/**
	* Unsubscribes a federate from the "PowerTotal" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "PowerTotal" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_PowerTotal() {
		_subscribeAttributeNameSet.remove( "PowerTotal" );
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
	

	
	
	private Attribute< Boolean > _CoolingOverride =
 		new Attribute< Boolean >(  new Boolean( false )  );
	
	/**
	* Set the value of the "CoolingOverride" attribute to "value" for this object.
	*
	* @param value the new value for the "CoolingOverride" attribute
	*/
	public void set_CoolingOverride( boolean value ) {
		_CoolingOverride.setValue( value );
		_CoolingOverride.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "CoolingOverride" attribute of this object.
	*
	* @return the value of the "CoolingOverride" attribute
	*/
	public boolean get_CoolingOverride() {
		return _CoolingOverride.getValue();
	}
	
	/**
	* Returns the current timestamp of the "CoolingOverride" attribute of this object.
	* 
	* @return the current timestamp of the "CoolingOverride" attribute
	*/
	public double get_CoolingOverride_time() {
		return _CoolingOverride.getTime();
	}
	
	
	private Attribute< Double > _IATemperature =
 		new Attribute< Double >(  new Double( 0 )  );
	
	/**
	* Set the value of the "IATemperature" attribute to "value" for this object.
	*
	* @param value the new value for the "IATemperature" attribute
	*/
	public void set_IATemperature( double value ) {
		_IATemperature.setValue( value );
		_IATemperature.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "IATemperature" attribute of this object.
	*
	* @return the value of the "IATemperature" attribute
	*/
	public double get_IATemperature() {
		return _IATemperature.getValue();
	}
	
	/**
	* Returns the current timestamp of the "IATemperature" attribute of this object.
	* 
	* @return the current timestamp of the "IATemperature" attribute
	*/
	public double get_IATemperature_time() {
		return _IATemperature.getTime();
	}
	
	
	private Attribute< Double > _PowerTotal =
 		new Attribute< Double >(  new Double( 0 )  );
	
	/**
	* Set the value of the "PowerTotal" attribute to "value" for this object.
	*
	* @param value the new value for the "PowerTotal" attribute
	*/
	public void set_PowerTotal( double value ) {
		_PowerTotal.setValue( value );
		_PowerTotal.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "PowerTotal" attribute of this object.
	*
	* @return the value of the "PowerTotal" attribute
	*/
	public double get_PowerTotal() {
		return _PowerTotal.getValue();
	}
	
	/**
	* Returns the current timestamp of the "PowerTotal" attribute of this object.
	* 
	* @return the current timestamp of the "PowerTotal" attribute
	*/
	public double get_PowerTotal_time() {
		return _PowerTotal.getTime();
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
	


	protected ZoneState( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected ZoneState( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the ZoneState object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ZoneState object class instance
	*/
	public ZoneState( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #ZoneState( ReflectedAttributes datamemberMap )}, except this
	* new ZoneState object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ZoneState object class instance
	* @param logicalTime timestamp for this new ZoneState object class
	* instance
	*/
	public ZoneState( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new ZoneState object class instance that is a duplicate
	* of the instance referred to by ZoneState_var.
	*
	* @param ZoneState_var ZoneState object class instance of which
	* this newly created ZoneState object class instance will be a
	* duplicate
	*/
	public ZoneState( ZoneState ZoneState_var ) {
		super( ZoneState_var );
		
		
		set_CoolingOverride( ZoneState_var.get_CoolingOverride() );
		set_IATemperature( ZoneState_var.get_IATemperature() );
		set_PowerTotal( ZoneState_var.get_PowerTotal() );
		set_ZoneName( ZoneState_var.get_ZoneName() );
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
		
		
		
		if (  "CoolingOverride".equals( datamemberName )  ) return new Boolean(get_CoolingOverride());
		else if (  "IATemperature".equals( datamemberName )  ) return new Double(get_IATemperature());
		else if (  "PowerTotal".equals( datamemberName )  ) return new Double(get_PowerTotal());
		else if (  "ZoneName".equals( datamemberName )  ) return get_ZoneName();
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
		
				
		
		if ( get_CoolingOverride_handle() == datamemberHandle ) return new Boolean(get_CoolingOverride());
		else if ( get_IATemperature_handle() == datamemberHandle ) return new Double(get_IATemperature());
		else if ( get_PowerTotal_handle() == datamemberHandle ) return new Double(get_PowerTotal());
		else if ( get_ZoneName_handle() == datamemberHandle ) return get_ZoneName();
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_CoolingOverride_handle() ) set_CoolingOverride( Boolean.parseBoolean(val) );
		else if ( param_handle == get_IATemperature_handle() ) set_IATemperature( Double.parseDouble(val) );
		else if ( param_handle == get_PowerTotal_handle() ) set_PowerTotal( Double.parseDouble(val) );
		else if ( param_handle == get_ZoneName_handle() ) set_ZoneName( val );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "CoolingOverride".equals( datamemberName )  ) set_CoolingOverride( Boolean.parseBoolean(val) );
		else if (  "IATemperature".equals( datamemberName )  ) set_IATemperature( Double.parseDouble(val) );
		else if (  "PowerTotal".equals( datamemberName )  ) set_PowerTotal( Double.parseDouble(val) );
		else if (  "ZoneName".equals( datamemberName )  ) set_ZoneName( val );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "CoolingOverride".equals( datamemberName )  ) set_CoolingOverride( (Boolean)val );
		else if (  "IATemperature".equals( datamemberName )  ) set_IATemperature( (Double)val );
		else if (  "PowerTotal".equals( datamemberName )  ) set_PowerTotal( (Double)val );
		else if (  "ZoneName".equals( datamemberName )  ) set_ZoneName( (String)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_CoolingOverride_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ZoneState.createSuppliedAttributes:  could not determine if CoolingOverride is published.");
				isPublished = false;
			}
			if (  isPublished && _CoolingOverride.shouldBeUpdated( force )  ) {
				datamembers.add( get_CoolingOverride_handle(), Boolean.toString(get_CoolingOverride()).getBytes() );
				_CoolingOverride.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_IATemperature_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ZoneState.createSuppliedAttributes:  could not determine if IATemperature is published.");
				isPublished = false;
			}
			if (  isPublished && _IATemperature.shouldBeUpdated( force )  ) {
				datamembers.add( get_IATemperature_handle(), Double.toString(get_IATemperature()).getBytes() );
				_IATemperature.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_PowerTotal_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ZoneState.createSuppliedAttributes:  could not determine if PowerTotal is published.");
				isPublished = false;
			}
			if (  isPublished && _PowerTotal.shouldBeUpdated( force )  ) {
				datamembers.add( get_PowerTotal_handle(), Double.toString(get_PowerTotal()).getBytes() );
				_PowerTotal.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_ZoneName_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ZoneState.createSuppliedAttributes:  could not determine if ZoneName is published.");
				isPublished = false;
			}
			if (  isPublished && _ZoneName.shouldBeUpdated( force )  ) {
				datamembers.add( get_ZoneName_handle(), get_ZoneName().getBytes() );
				_ZoneName.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof ZoneState ) {
			ZoneState data = (ZoneState)object;
			
			
				_CoolingOverride = data._CoolingOverride;
				_IATemperature = data._IATemperature;
				_PowerTotal = data._PowerTotal;
				_ZoneName = data._ZoneName;
			
		}
	}
}
