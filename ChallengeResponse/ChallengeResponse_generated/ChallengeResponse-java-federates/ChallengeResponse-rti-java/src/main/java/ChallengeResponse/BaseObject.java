
package ChallengeResponse;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The BaseObject class implements the BaseObject object in the
* ChallengeResponse simulation.
*/
public class BaseObject extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(BaseObject.class);

	/**
	* Default constructor -- creates an instance of the BaseObject object
	* class with default attribute values.
	*/
	public BaseObject() { }

	
	
	private static int _id_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "id" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "id" attribute
	*/
	public static int get_id_handle() { return _id_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the BaseObject object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the BaseObject
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.BaseObject"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the BaseObject object class.
	*/
	public static String get_simple_class_name() { return "BaseObject"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* BaseObject object class.
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
	* BaseObject object class.
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
		_classNameSet.add("ObjectRoot.BaseObject");
		_classNameClassMap.put("ObjectRoot.BaseObject", BaseObject.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.BaseObject", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.BaseObject", _allDatamemberNames);

		
		
		_datamemberNames.add("id");
		
		
		_allDatamemberNames.add("id");
		
		
		_datamemberTypeMap.put("id", "String");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.BaseObject", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.BaseObject", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.BaseObject", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.BaseObject", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.BaseObject:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.BaseObject");
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

		_classNameHandleMap.put("ObjectRoot.BaseObject", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.BaseObject");
		_classHandleSimpleNameMap.put(get_handle(), "BaseObject");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_id_handle = rti.getAttributeHandle("id", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.BaseObject,id", get_id_handle());
			
			
		_datamemberHandleNameMap.put(get_id_handle(), "id");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.BaseObject:  could not publish:  ";

	/**
	* Publishes the BaseObject object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.BaseObject," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.BaseObject:  could not unpublish:  ";
	/**
	* Unpublishes the BaseObject object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.BaseObject:  could not subscribe:  ";
	/**
	* Subscribes a federate to the BaseObject object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.BaseObject," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.BaseObject:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the BaseObject object class.
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
	* (that is, the BaseObject object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the BaseObject object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the BaseObject object class).
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
		return "BaseObject("
			
			
			+ "id:" + get_id()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "id" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "id" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_id() {
		_publishAttributeNameSet.add( "id" );
	}

	/**
	* Unpublishes the "id" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "id" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_id() {
		_publishAttributeNameSet.remove( "id" );
	}
	
	/**
	* Subscribes a federate to the "id" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "id" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_id() {
		_subscribeAttributeNameSet.add( "id" );
	}

	/**
	* Unsubscribes a federate from the "id" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "id" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_id() {
		_subscribeAttributeNameSet.remove( "id" );
	}
	

	
	
	private Attribute< String > _id =
 		new Attribute< String >(  new String( "" )  );
	
	/**
	* Set the value of the "id" attribute to "value" for this object.
	*
	* @param value the new value for the "id" attribute
	*/
	public void set_id( String value ) {
		_id.setValue( value );
		_id.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "id" attribute of this object.
	*
	* @return the value of the "id" attribute
	*/
	public String get_id() {
		return _id.getValue();
	}
	
	/**
	* Returns the current timestamp of the "id" attribute of this object.
	* 
	* @return the current timestamp of the "id" attribute
	*/
	public double get_id_time() {
		return _id.getTime();
	}
	


	protected BaseObject( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected BaseObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the BaseObject object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new BaseObject object class instance
	*/
	public BaseObject( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #BaseObject( ReflectedAttributes datamemberMap )}, except this
	* new BaseObject object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new BaseObject object class instance
	* @param logicalTime timestamp for this new BaseObject object class
	* instance
	*/
	public BaseObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new BaseObject object class instance that is a duplicate
	* of the instance referred to by BaseObject_var.
	*
	* @param BaseObject_var BaseObject object class instance of which
	* this newly created BaseObject object class instance will be a
	* duplicate
	*/
	public BaseObject( BaseObject BaseObject_var ) {
		super( BaseObject_var );
		
		
		set_id( BaseObject_var.get_id() );
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
		
		
		
		if (  "id".equals( datamemberName )  ) return get_id();
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
		
				
		
		if ( get_id_handle() == datamemberHandle ) return get_id();
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_id_handle() ) set_id( val );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "id".equals( datamemberName )  ) set_id( val );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "id".equals( datamemberName )  ) set_id( (String)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_id_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.BaseObject.createSuppliedAttributes:  could not determine if id is published.");
				isPublished = false;
			}
			if (  isPublished && _id.shouldBeUpdated( force )  ) {
				datamembers.add( get_id_handle(), get_id().getBytes() );
				_id.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof BaseObject ) {
			BaseObject data = (BaseObject)object;
			
			
				_id = data._id;
			
		}
	}
}
