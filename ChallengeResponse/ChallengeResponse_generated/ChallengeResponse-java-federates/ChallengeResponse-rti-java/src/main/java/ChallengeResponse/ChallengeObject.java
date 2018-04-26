
package ChallengeResponse;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The ChallengeObject class implements the ChallengeObject object in the
* ChallengeResponse simulation.
*/
public class ChallengeObject extends BaseObject {

	private static final Logger logger = LogManager.getLogger(ChallengeObject.class);

	/**
	* Default constructor -- creates an instance of the ChallengeObject object
	* class with default attribute values.
	*/
	public ChallengeObject() { }

	
	
	private static int _integerValue_handle;
	private static int _stringValue_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "integerValue" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "integerValue" attribute
	*/
	public static int get_integerValue_handle() { return _integerValue_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stringValue" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "stringValue" attribute
	*/
	public static int get_stringValue_handle() { return _stringValue_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the ChallengeObject object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the ChallengeObject
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.BaseObject.ChallengeObject"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the ChallengeObject object class.
	*/
	public static String get_simple_class_name() { return "ChallengeObject"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* ChallengeObject object class.
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
	* ChallengeObject object class.
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
		_classNameSet.add("ObjectRoot.BaseObject.ChallengeObject");
		_classNameClassMap.put("ObjectRoot.BaseObject.ChallengeObject", ChallengeObject.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.BaseObject.ChallengeObject", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.BaseObject.ChallengeObject", _allDatamemberNames);

		
		
		
		_datamemberNames.add("integerValue");
		_datamemberNames.add("stringValue");
		
		
		_allDatamemberNames.add("id");
		_allDatamemberNames.add("integerValue");
		_allDatamemberNames.add("stringValue");
		
		
		_datamemberTypeMap.put("integerValue", "int");
		_datamemberTypeMap.put("stringValue", "String");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.BaseObject.ChallengeObject", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.BaseObject.ChallengeObject", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.BaseObject.ChallengeObject", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.BaseObject.ChallengeObject", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.BaseObject.ChallengeObject:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		BaseObject.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.BaseObject.ChallengeObject");
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

		_classNameHandleMap.put("ObjectRoot.BaseObject.ChallengeObject", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.BaseObject.ChallengeObject");
		_classHandleSimpleNameMap.put(get_handle(), "ChallengeObject");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_integerValue_handle = rti.getAttributeHandle("integerValue", get_handle());			
				_stringValue_handle = rti.getAttributeHandle("stringValue", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.BaseObject.ChallengeObject,integerValue", get_integerValue_handle());
		_datamemberNameHandleMap.put("ObjectRoot.BaseObject.ChallengeObject,stringValue", get_stringValue_handle());
			
			
		_datamemberHandleNameMap.put(get_integerValue_handle(), "integerValue");
		_datamemberHandleNameMap.put(get_stringValue_handle(), "stringValue");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.BaseObject.ChallengeObject:  could not publish:  ";

	/**
	* Publishes the ChallengeObject object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.BaseObject.ChallengeObject," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.BaseObject.ChallengeObject:  could not unpublish:  ";
	/**
	* Unpublishes the ChallengeObject object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.BaseObject.ChallengeObject:  could not subscribe:  ";
	/**
	* Subscribes a federate to the ChallengeObject object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.BaseObject.ChallengeObject," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.BaseObject.ChallengeObject:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the ChallengeObject object class.
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
	* (that is, the ChallengeObject object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the ChallengeObject object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the ChallengeObject object class).
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
		return "ChallengeObject("
			
			
			+ "integerValue:" + get_integerValue()
			+ "," + "stringValue:" + get_stringValue()
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
	
	
	/**
	* Publishes the "integerValue" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "integerValue" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_integerValue() {
		_publishAttributeNameSet.add( "integerValue" );
	}

	/**
	* Unpublishes the "integerValue" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "integerValue" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_integerValue() {
		_publishAttributeNameSet.remove( "integerValue" );
	}
	
	/**
	* Subscribes a federate to the "integerValue" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "integerValue" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_integerValue() {
		_subscribeAttributeNameSet.add( "integerValue" );
	}

	/**
	* Unsubscribes a federate from the "integerValue" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "integerValue" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_integerValue() {
		_subscribeAttributeNameSet.remove( "integerValue" );
	}
	
	
	/**
	* Publishes the "stringValue" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "stringValue" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_stringValue() {
		_publishAttributeNameSet.add( "stringValue" );
	}

	/**
	* Unpublishes the "stringValue" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "stringValue" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_stringValue() {
		_publishAttributeNameSet.remove( "stringValue" );
	}
	
	/**
	* Subscribes a federate to the "stringValue" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "stringValue" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_stringValue() {
		_subscribeAttributeNameSet.add( "stringValue" );
	}

	/**
	* Unsubscribes a federate from the "stringValue" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "stringValue" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_stringValue() {
		_subscribeAttributeNameSet.remove( "stringValue" );
	}
	

	
	
	private Attribute< Integer > _integerValue =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "integerValue" attribute to "value" for this object.
	*
	* @param value the new value for the "integerValue" attribute
	*/
	public void set_integerValue( int value ) {
		_integerValue.setValue( value );
		_integerValue.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "integerValue" attribute of this object.
	*
	* @return the value of the "integerValue" attribute
	*/
	public int get_integerValue() {
		return _integerValue.getValue();
	}
	
	/**
	* Returns the current timestamp of the "integerValue" attribute of this object.
	* 
	* @return the current timestamp of the "integerValue" attribute
	*/
	public double get_integerValue_time() {
		return _integerValue.getTime();
	}
	
	
	private Attribute< String > _stringValue =
 		new Attribute< String >(  new String( "" )  );
	
	/**
	* Set the value of the "stringValue" attribute to "value" for this object.
	*
	* @param value the new value for the "stringValue" attribute
	*/
	public void set_stringValue( String value ) {
		_stringValue.setValue( value );
		_stringValue.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "stringValue" attribute of this object.
	*
	* @return the value of the "stringValue" attribute
	*/
	public String get_stringValue() {
		return _stringValue.getValue();
	}
	
	/**
	* Returns the current timestamp of the "stringValue" attribute of this object.
	* 
	* @return the current timestamp of the "stringValue" attribute
	*/
	public double get_stringValue_time() {
		return _stringValue.getTime();
	}
	


	protected ChallengeObject( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected ChallengeObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the ChallengeObject object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ChallengeObject object class instance
	*/
	public ChallengeObject( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #ChallengeObject( ReflectedAttributes datamemberMap )}, except this
	* new ChallengeObject object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new ChallengeObject object class instance
	* @param logicalTime timestamp for this new ChallengeObject object class
	* instance
	*/
	public ChallengeObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new ChallengeObject object class instance that is a duplicate
	* of the instance referred to by ChallengeObject_var.
	*
	* @param ChallengeObject_var ChallengeObject object class instance of which
	* this newly created ChallengeObject object class instance will be a
	* duplicate
	*/
	public ChallengeObject( ChallengeObject ChallengeObject_var ) {
		super( ChallengeObject_var );
		
		
		set_integerValue( ChallengeObject_var.get_integerValue() );
		set_stringValue( ChallengeObject_var.get_stringValue() );
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
		
		
		
		if (  "integerValue".equals( datamemberName )  ) return new Integer(get_integerValue());
		else if (  "stringValue".equals( datamemberName )  ) return get_stringValue();
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
		
				
		
		if ( get_integerValue_handle() == datamemberHandle ) return new Integer(get_integerValue());
		else if ( get_stringValue_handle() == datamemberHandle ) return get_stringValue();
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_integerValue_handle() ) set_integerValue( Integer.parseInt(val) );
		else if ( param_handle == get_stringValue_handle() ) set_stringValue( val );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "integerValue".equals( datamemberName )  ) set_integerValue( Integer.parseInt(val) );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( val );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "integerValue".equals( datamemberName )  ) set_integerValue( (Integer)val );
		else if (  "stringValue".equals( datamemberName )  ) set_stringValue( (String)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_integerValue_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.BaseObject.ChallengeObject.createSuppliedAttributes:  could not determine if integerValue is published.");
				isPublished = false;
			}
			if (  isPublished && _integerValue.shouldBeUpdated( force )  ) {
				datamembers.add( get_integerValue_handle(), Integer.toString(get_integerValue()).getBytes() );
				_integerValue.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_stringValue_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.BaseObject.ChallengeObject.createSuppliedAttributes:  could not determine if stringValue is published.");
				isPublished = false;
			}
			if (  isPublished && _stringValue.shouldBeUpdated( force )  ) {
				datamembers.add( get_stringValue_handle(), get_stringValue().getBytes() );
				_stringValue.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof ChallengeObject ) {
			ChallengeObject data = (ChallengeObject)object;
			
			
				_integerValue = data._integerValue;
				_stringValue = data._stringValue;
			
		}
	}
}
