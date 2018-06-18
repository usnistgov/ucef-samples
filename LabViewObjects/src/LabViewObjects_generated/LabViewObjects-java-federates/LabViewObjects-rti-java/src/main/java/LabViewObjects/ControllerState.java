
package LabViewObjects;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The ControllerState class implements the ControllerState object in the
* LabViewObjects simulation.
*/
public class ControllerState extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(ControllerState.class);

	/**
	* Default constructor -- creates an instance of the ControllerState object
	* class with default attribute values.
	*/
	public ControllerState() { }

	
	
	private static int _damperPosition_handle;
	private static int _zone_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "damperPosition" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "damperPosition" attribute
	*/
	public static int get_damperPosition_handle() { return _damperPosition_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "zone" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "zone" attribute
	*/
	public static int get_zone_handle() { return _zone_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the ControllerState object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the ControllerState
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.ControllerState"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the ControllerState object class.
	*/
	public static String get_simple_class_name() { return "ControllerState"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* ControllerState object class.
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
	* ControllerState object class.
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
		_classNameSet.add("ObjectRoot.ControllerState");
		_classNameClassMap.put("ObjectRoot.ControllerState", ControllerState.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.ControllerState", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.ControllerState", _allDatamemberNames);

		
		
		_datamemberNames.add("damperPosition");
		_datamemberNames.add("zone");
		
		
		_allDatamemberNames.add("damperPosition");
		_allDatamemberNames.add("zone");
		
		
		_datamemberTypeMap.put("damperPosition", "int");
		_datamemberTypeMap.put("zone", "int");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.ControllerState", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.ControllerState", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.ControllerState", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.ControllerState", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.ControllerState:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.ControllerState");
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

		_classNameHandleMap.put("ObjectRoot.ControllerState", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.ControllerState");
		_classHandleSimpleNameMap.put(get_handle(), "ControllerState");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_damperPosition_handle = rti.getAttributeHandle("damperPosition", get_handle());			
				_zone_handle = rti.getAttributeHandle("zone", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.ControllerState,damperPosition", get_damperPosition_handle());
		_datamemberNameHandleMap.put("ObjectRoot.ControllerState,zone", get_zone_handle());
			
			
		_datamemberHandleNameMap.put(get_damperPosition_handle(), "damperPosition");
		_datamemberHandleNameMap.put(get_zone_handle(), "zone");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.ControllerState:  could not publish:  ";

	/**
	* Publishes the ControllerState object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ControllerState," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.ControllerState:  could not unpublish:  ";
	/**
	* Unpublishes the ControllerState object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.ControllerState:  could not subscribe:  ";
	/**
	* Subscribes a federate to the ControllerState object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ControllerState," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.ControllerState:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the ControllerState object class.
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
	* (that is, the ControllerState object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the ControllerState object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the ControllerState object class).
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
		return "ControllerState("
			
			
			+ "damperPosition:" + get_damperPosition()
			+ "," + "zone:" + get_zone()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "damperPosition" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "damperPosition" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_damperPosition() {
		_publishAttributeNameSet.add( "damperPosition" );
	}

	/**
	* Unpublishes the "damperPosition" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "damperPosition" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_damperPosition() {
		_publishAttributeNameSet.remove( "damperPosition" );
	}
	
	/**
	* Subscribes a federate to the "damperPosition" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "damperPosition" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_damperPosition() {
		_subscribeAttributeNameSet.add( "damperPosition" );
	}

	/**
	* Unsubscribes a federate from the "damperPosition" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "damperPosition" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_damperPosition() {
		_subscribeAttributeNameSet.remove( "damperPosition" );
	}
	
	
	/**
	* Publishes the "zone" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "zone" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_zone() {
		_publishAttributeNameSet.add( "zone" );
	}

	/**
	* Unpublishes the "zone" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "zone" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_zone() {
		_publishAttributeNameSet.remove( "zone" );
	}
	
	/**
	* Subscribes a federate to the "zone" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "zone" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_zone() {
		_subscribeAttributeNameSet.add( "zone" );
	}

	/**
	* Unsubscribes a federate from the "zone" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "zone" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_zone() {
		_subscribeAttributeNameSet.remove( "zone" );
	}
	

	
	
	private Attribute< Integer > _damperPosition =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "damperPosition" attribute to "value" for this object.
	*
	* @param value the new value for the "damperPosition" attribute
	*/
	public void set_damperPosition( int value ) {
		_damperPosition.setValue( value );
		_damperPosition.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "damperPosition" attribute of this object.
	*
	* @return the value of the "damperPosition" attribute
	*/
	public int get_damperPosition() {
		return _damperPosition.getValue();
	}
	
	/**
	* Returns the current timestamp of the "damperPosition" attribute of this object.
	* 
	* @return the current timestamp of the "damperPosition" attribute
	*/
	public double get_damperPosition_time() {
		return _damperPosition.getTime();
	}
	
	
	private Attribute< Integer > _zone =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "zone" attribute to "value" for this object.
	*
	* @param value the new value for the "zone" attribute
	*/
	public void set_zone( int value ) {
		_zone.setValue( value );
		_zone.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "zone" attribute of this object.
	*
	* @return the value of the "zone" attribute
	*/
	public int get_zone() {
		return _zone.getValue();
	}
	
	/**
	* Returns the current timestamp of the "zone" attribute of this object.
	* 
	* @return the current timestamp of the "zone" attribute
	*/
	public double get_zone_time() {
		return _zone.getTime();
	}
	


	protected ControllerState( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected ControllerState( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the ControllerState object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ControllerState object class instance
	*/
	public ControllerState( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #ControllerState( ReflectedAttributes datamemberMap )}, except this
	* new ControllerState object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ControllerState object class instance
	* @param logicalTime timestamp for this new ControllerState object class
	* instance
	*/
	public ControllerState( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new ControllerState object class instance that is a duplicate
	* of the instance referred to by ControllerState_var.
	*
	* @param ControllerState_var ControllerState object class instance of which
	* this newly created ControllerState object class instance will be a
	* duplicate
	*/
	public ControllerState( ControllerState ControllerState_var ) {
		super( ControllerState_var );
		
		
		set_damperPosition( ControllerState_var.get_damperPosition() );
		set_zone( ControllerState_var.get_zone() );
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
		
		
		
		if (  "damperPosition".equals( datamemberName )  ) return new Integer(get_damperPosition());
		else if (  "zone".equals( datamemberName )  ) return new Integer(get_zone());
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
		
				
		
		if ( get_damperPosition_handle() == datamemberHandle ) return new Integer(get_damperPosition());
		else if ( get_zone_handle() == datamemberHandle ) return new Integer(get_zone());
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_damperPosition_handle() ) set_damperPosition( Integer.parseInt(val) );
		else if ( param_handle == get_zone_handle() ) set_zone( Integer.parseInt(val) );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "damperPosition".equals( datamemberName )  ) set_damperPosition( Integer.parseInt(val) );
		else if (  "zone".equals( datamemberName )  ) set_zone( Integer.parseInt(val) );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "damperPosition".equals( datamemberName )  ) set_damperPosition( (Integer)val );
		else if (  "zone".equals( datamemberName )  ) set_zone( (Integer)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_damperPosition_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ControllerState.createSuppliedAttributes:  could not determine if damperPosition is published.");
				isPublished = false;
			}
			if (  isPublished && _damperPosition.shouldBeUpdated( force )  ) {
				datamembers.add( get_damperPosition_handle(), Integer.toString(get_damperPosition()).getBytes() );
				_damperPosition.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_zone_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.ControllerState.createSuppliedAttributes:  could not determine if zone is published.");
				isPublished = false;
			}
			if (  isPublished && _zone.shouldBeUpdated( force )  ) {
				datamembers.add( get_zone_handle(), Integer.toString(get_zone()).getBytes() );
				_zone.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof ControllerState ) {
			ControllerState data = (ControllerState)object;
			
			
				_damperPosition = data._damperPosition;
				_zone = data._zone;
			
		}
	}
}
