
package HelloWorld;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The PingCount class implements the PingCount object in the
* HelloWorld simulation.
*/
public class PingCount extends ObjectRoot {

	private static final Logger logger = LogManager.getLogger(PingCount.class);

	/**
	* Default constructor -- creates an instance of the PingCount object
	* class with default attribute values.
	*/
	public PingCount() { }

	
	
	private static int _RunningCount_handle;
	private static int _SinkName_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "RunningCount" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "RunningCount" attribute
	*/
	public static int get_RunningCount_handle() { return _RunningCount_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "SinkName" attribute of
	* its containing object class.
	*
	* @return the handle (RTI assigned) of the "SinkName" attribute
	*/
	public static int get_SinkName_handle() { return _SinkName_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the PingCount object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the PingCount
	* object class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "ObjectRoot.PingCount"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the PingCount object class.
	*/
	public static String get_simple_class_name() { return "PingCount"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden attributes in the
	* PingCount object class.
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
	* PingCount object class.
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
		_classNameSet.add("ObjectRoot.PingCount");
		_classNameClassMap.put("ObjectRoot.PingCount", PingCount.class);
		
		_datamemberClassNameSetMap.put("ObjectRoot.PingCount", _datamemberNames);
		_allDatamemberClassNameSetMap.put("ObjectRoot.PingCount", _allDatamemberNames);

		
		
		_datamemberNames.add("RunningCount");
		_datamemberNames.add("SinkName");
		
		
		_allDatamemberNames.add("RunningCount");
		_allDatamemberNames.add("SinkName");
		
		
		_datamemberTypeMap.put("RunningCount", "int");
		_datamemberTypeMap.put("SinkName", "String");
	

		_classNamePublishAttributeNameMap.put("ObjectRoot.PingCount", _publishAttributeNameSet);
		_publishedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNamePublishedAttributeMap.put("ObjectRoot.PingCount", _publishedAttributeHandleSet);

		_classNameSubscribeAttributeNameMap.put("ObjectRoot.PingCount", _subscribeAttributeNameSet);
		_subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
		_classNameSubscribedAttributeMap.put("ObjectRoot.PingCount", _subscribedAttributeHandleSet);
	

	}


	private static String initErrorMessage = "Error:  ObjectRoot.PingCount:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ObjectRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getObjectClassHandle("ObjectRoot.PingCount");
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

		_classNameHandleMap.put("ObjectRoot.PingCount", get_handle());
		_classHandleNameMap.put(get_handle(), "ObjectRoot.PingCount");
		_classHandleSimpleNameMap.put(get_handle(), "PingCount");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_RunningCount_handle = rti.getAttributeHandle("RunningCount", get_handle());			
				_SinkName_handle = rti.getAttributeHandle("SinkName", get_handle());
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
			
			
		_datamemberNameHandleMap.put("ObjectRoot.PingCount,RunningCount", get_RunningCount_handle());
		_datamemberNameHandleMap.put("ObjectRoot.PingCount,SinkName", get_SinkName_handle());
			
			
		_datamemberHandleNameMap.put(get_RunningCount_handle(), "RunningCount");
		_datamemberHandleNameMap.put(get_SinkName_handle(), "SinkName");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  ObjectRoot.PingCount:  could not publish:  ";

	/**
	* Publishes the PingCount object class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void publish(RTIambassador rti) {
		if (_isPublished) return;
		
		init(rti);

		
		_publishedAttributeHandleSet.empty();
		for(String attributeName : _publishAttributeNameSet) {
			try {
				_publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.PingCount," + attributeName));
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

	private static String unpublishErrorMessage = "Error:  ObjectRoot.PingCount:  could not unpublish:  ";
	/**
	* Unpublishes the PingCount object class for a federate.
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
	private static String subscribeErrorMessage = "Error:  ObjectRoot.PingCount:  could not subscribe:  ";
	/**
	* Subscribes a federate to the PingCount object class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public static void subscribe(RTIambassador rti) {
		if (_isSubscribed) return;
		
		init(rti);
		
		_subscribedAttributeHandleSet.empty();
		for(String attributeName : _subscribeAttributeNameSet) {
			try {
				_subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.PingCount," + attributeName));
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

	private static String unsubscribeErrorMessage = "Error:  ObjectRoot.PingCount:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the PingCount object class.
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
	* (that is, the PingCount object class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the PingCount object class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the PingCount object class).
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
		return "PingCount("
			
			
			+ "RunningCount:" + get_RunningCount()
			+ "," + "SinkName:" + get_SinkName()
			+ ")";
	}
	



	
	
	/**
	* Publishes the "RunningCount" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "RunningCount" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_RunningCount() {
		_publishAttributeNameSet.add( "RunningCount" );
	}

	/**
	* Unpublishes the "RunningCount" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "RunningCount" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_RunningCount() {
		_publishAttributeNameSet.remove( "RunningCount" );
	}
	
	/**
	* Subscribes a federate to the "RunningCount" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "RunningCount" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_RunningCount() {
		_subscribeAttributeNameSet.add( "RunningCount" );
	}

	/**
	* Unsubscribes a federate from the "RunningCount" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "RunningCount" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_RunningCount() {
		_subscribeAttributeNameSet.remove( "RunningCount" );
	}
	
	
	/**
	* Publishes the "SinkName" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "SinkName" attribute for publication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void publish_SinkName() {
		_publishAttributeNameSet.add( "SinkName" );
	}

	/**
	* Unpublishes the "SinkName" attribute of the attribute's containing object
	* class for a federate.
	* Note:  This method only marks the "SinkName" attribute for unpublication.
	* To actually publish the attribute, the federate must (re)publish its containing
	* object class.
	* (using <objectClassName>.publish( RTIambassador rti ) ).
	*/
	public static void unpublish_SinkName() {
		_publishAttributeNameSet.remove( "SinkName" );
	}
	
	/**
	* Subscribes a federate to the "SinkName" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "SinkName" attribute for subscription.
	* To actually subscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void subscribe_SinkName() {
		_subscribeAttributeNameSet.add( "SinkName" );
	}

	/**
	* Unsubscribes a federate from the "SinkName" attribute of the attribute's
	* containing object class.
	* Note:  This method only marks the "SinkName" attribute for unsubscription.
	* To actually unsubscribe to the attribute, the federate must (re)subscribe to its
	* containing object class.
	* (using <objectClassName>.subscribe( RTIambassador rti ) ).
	*/
	public static void unsubscribe_SinkName() {
		_subscribeAttributeNameSet.remove( "SinkName" );
	}
	

	
	
	private Attribute< Integer > _RunningCount =
 		new Attribute< Integer >(  new Integer( 0 )  );
	
	/**
	* Set the value of the "RunningCount" attribute to "value" for this object.
	*
	* @param value the new value for the "RunningCount" attribute
	*/
	public void set_RunningCount( int value ) {
		_RunningCount.setValue( value );
		_RunningCount.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "RunningCount" attribute of this object.
	*
	* @return the value of the "RunningCount" attribute
	*/
	public int get_RunningCount() {
		return _RunningCount.getValue();
	}
	
	/**
	* Returns the current timestamp of the "RunningCount" attribute of this object.
	* 
	* @return the current timestamp of the "RunningCount" attribute
	*/
	public double get_RunningCount_time() {
		return _RunningCount.getTime();
	}
	
	
	private Attribute< String > _SinkName =
 		new Attribute< String >(  new String( "" )  );
	
	/**
	* Set the value of the "SinkName" attribute to "value" for this object.
	*
	* @param value the new value for the "SinkName" attribute
	*/
	public void set_SinkName( String value ) {
		_SinkName.setValue( value );
		_SinkName.setTime( getTime() );
	}
	
	/**
	* Returns the value of the "SinkName" attribute of this object.
	*
	* @return the value of the "SinkName" attribute
	*/
	public String get_SinkName() {
		return _SinkName.getValue();
	}
	
	/**
	* Returns the current timestamp of the "SinkName" attribute of this object.
	* 
	* @return the current timestamp of the "SinkName" attribute
	*/
	public double get_SinkName_time() {
		return _SinkName.getTime();
	}
	


	protected PingCount( ReflectedAttributes datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}
	
	protected PingCount( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setAttributes( datamemberMap );
	}


	/**
	* Creates an instance of the PingCount object class, using
	* "datamemberMap" to initialize its attribute values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new PingCount object class instance
	*/
	public PingCount( ReflectedAttributes datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #PingCount( ReflectedAttributes datamemberMap )}, except this
	* new PingCount object class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* attributes of this new PingCount object class instance
	* @param logicalTime timestamp for this new PingCount object class
	* instance
	*/
	public PingCount( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new PingCount object class instance that is a duplicate
	* of the instance referred to by PingCount_var.
	*
	* @param PingCount_var PingCount object class instance of which
	* this newly created PingCount object class instance will be a
	* duplicate
	*/
	public PingCount( PingCount PingCount_var ) {
		super( PingCount_var );
		
		
		set_RunningCount( PingCount_var.get_RunningCount() );
		set_SinkName( PingCount_var.get_SinkName() );
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
		
		
		
		if (  "RunningCount".equals( datamemberName )  ) return new Integer(get_RunningCount());
		else if (  "SinkName".equals( datamemberName )  ) return get_SinkName();
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
		
				
		
		if ( get_RunningCount_handle() == datamemberHandle ) return new Integer(get_RunningCount());
		else if ( get_SinkName_handle() == datamemberHandle ) return get_SinkName();
		else return super.getAttribute( datamemberHandle );
	}
	
	protected boolean setAttributeAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_RunningCount_handle() ) set_RunningCount( Integer.parseInt(val) );
		else if ( param_handle == get_SinkName_handle() ) set_SinkName( val );
		else retval = super.setAttributeAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "RunningCount".equals( datamemberName )  ) set_RunningCount( Integer.parseInt(val) );
		else if (  "SinkName".equals( datamemberName )  ) set_SinkName( val );	
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setAttributeAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "RunningCount".equals( datamemberName )  ) set_RunningCount( (Integer)val );
		else if (  "SinkName".equals( datamemberName )  ) set_SinkName( (String)val );		
		else retval = super.setAttributeAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedAttributes createSuppliedDatamembers( boolean force ) {
		SuppliedAttributes datamembers = super.createSuppliedDatamembers( force );

	
		boolean isPublished = false;
		
		
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_RunningCount_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.PingCount.createSuppliedAttributes:  could not determine if RunningCount is published.");
				isPublished = false;
			}
			if (  isPublished && _RunningCount.shouldBeUpdated( force )  ) {
				datamembers.add( get_RunningCount_handle(), Integer.toString(get_RunningCount()).getBytes() );
				_RunningCount.setHasBeenUpdated();
			}
			try {
				isPublished = _publishedAttributeHandleSet.isMember( get_SinkName_handle() );
			} catch ( Exception e ) {
				logger.error("ERROR:  ObjectRoot.PingCount.createSuppliedAttributes:  could not determine if SinkName is published.");
				isPublished = false;
			}
			if (  isPublished && _SinkName.shouldBeUpdated( force )  ) {
				datamembers.add( get_SinkName_handle(), get_SinkName().getBytes() );
				_SinkName.setHasBeenUpdated();
			}
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof PingCount ) {
			PingCount data = (PingCount)object;
			
			
				_RunningCount = data._RunningCount;
				_SinkName = data._SinkName;
			
		}
	}
}
