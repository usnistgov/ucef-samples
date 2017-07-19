
package SimpleAdderObjects;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The Operand class implements the Operand object in the
* SimpleAdderObjects simulation.
*/
public class Operand extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(Operand.class);

	/**
	* Default constructor -- creates an instance of the Operand object
	* class with default attribute values.
	*/
	public Operand() { }

	
	
	private static int _value_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "value" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "value" attribute
	*/
	public static int get_value_handle() { return _value_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the Operand object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the Operand
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.Operand"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the Operand object class.
	*/
	public static String get_simple_class_name() { return "Operand"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* Operand object class.
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
	* Operand object class.
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
		_classNameSet.add("ObjectRoot.Operand");
		_classNameClassMap.put("ObjectRoot.Operand", Operand.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.Operand", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.Operand", _allDatamemberNames);

		
		
		_datamemberNames.add("value");
		
		
		_allDatamemberNames.add("value");
		
		
		_datamemberTypeMap.put("value", "int");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.Operand", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.Operand", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.Operand", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.Operand", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.Operand:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.Operand");
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

		_classNameHandleMap.put("ObjectRoot.Operand", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.Operand");
		_classHandleSimpleNameMap.put(get_handle(), "Operand");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_value_handle = rti.getAttributeHandle("value", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.Operand,value", get_value_handle());
			
			
		_datamemberHandleNameMap.put(get_value_handle(), "value");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.Operand:  could not publish:  ";

	/**
	* Publishes the Operand object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Operand," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.Operand:  could not unpublish:  ";
	/**
	* Unpublishes the Operand object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.Operand:  could not subscribe:  ";
	/**
	* Subscribes a federate to the Operand object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.Operand," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.Operand:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the Operand object class.
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
	* (that is, the Operand object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the Operand object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the Operand object class).
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
		return "Operand("
			
			
			+ "value:" + get_value()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "value" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "value" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_value() {
		_publishAttributeNameSet.add( "value" );
	}

	/**
	* Unpublishes the "value" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "value" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_value() {
		_publishAttributeNameSet.remove( "value" );
	}
	
	/**
	* Subscribes a federate to the "value" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "value" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_value() {
		_subscribeAttributeNameSet.add( "value" );
	}

	/**
	* Unsubscribes a federate from the "value" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "value" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_value() {
		_subscribeAttributeNameSet.remove( "value" );
	}
	

	
	
	private Attribute< Integer > _value =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "value" attribute to "value" for this object.
	*
	* @param value the new value for the "value" attribute
	*/
	public void set_value( int value ) {
		_value.setValue( value );
		_value.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "value" attribute of this object.
	*
	* @return the value of the "value" attribute
	*/
	public int get_value() {
		return _value.getValue();
	}
	
	/**
	* Returns the current timestamp of the "value" attribute of this object.
	* 
	* @return the current timestamp of the "value" attribute
	*/
	public double get_value_time() {
		return _value.getTime();
	}
	


	protected Operand( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected Operand( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the Operand object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Operand object class instance
	*/
	public Operand( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #Operand( ReflectedAttributes datamemberMap )}, except this
	* new Operand object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new Operand object class instance
	* @param logicalTime timestamp for this new Operand object class
	* instance
	*/
	public Operand( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new Operand object class instance that is a duplicate
	* of the instance referred to by Operand_var.
	*
	* @param Operand_var Operand object class instance of which
	* this newly created Operand object class instance will be a
	* duplicate
	*/
	public Operand( Operand Operand_var ) {
		super( Operand_var );
		
		
		set_value( Operand_var.get_value() );
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
		
		
		
		if (  "value".equals( datamemberName )  ) return new Integer(get_value());
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
		
				
		
		if ( get_value_handle() == datamemberHandle ) return new Integer(get_value());
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_value_handle() ) set_value( Integer.parseInt(val) );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "value".equals( datamemberName )  ) set_value( Integer.parseInt(val) );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "value".equals( datamemberName )  ) set_value( (Integer)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_value_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.Operand.createSuppliedAttributes:  could not determine if value is published.");
				isPublished = false;
			}
			if (  isPublished && _value.shouldBeUpdated( force )  ) {
				datamembers.add( get_value_handle(), Integer.toString(get_value()).getBytes() );
				_value.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof Operand ) {
			Operand data = (Operand)object;
			
			
				_value = data._value;
			
		}
	}
}
