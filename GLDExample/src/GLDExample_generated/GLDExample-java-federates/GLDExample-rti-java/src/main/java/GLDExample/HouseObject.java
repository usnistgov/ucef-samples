// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

package GLDExample;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;

import hla.rti.AttributeHandleSet;
import hla.rti.FederateNotExecutionMember;
import hla.rti.LogicalTime;
import hla.rti.NameNotFound;
import hla.rti.ObjectClassNotDefined;
import hla.rti.ObjectClassNotPublished;
import hla.rti.ObjectClassNotSubscribed;
import hla.rti.RTIambassador;
import hla.rti.ReflectedAttributes;
import hla.rti.SuppliedAttributes;

import org.cpswt.hla.*;

/**
* Implements ObjectRoot.HouseObject
*/
public class HouseObject extends ObjectRoot {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the HouseObject object class with default attribute values.
    */
    public HouseObject() {}

    private static int _compressor_count_handle;
    private static int _compressor_on_handle;
    private static int _name_handle;
    private static int _temperature_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the HouseObject object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the handle of the class pertaining to the reference,
    * rather than the handle of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassHandle()}.
    *
    * @return the RTI assigned integer handle that represents this object class
    */
    public static int get_handle() {
        return _handle;
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of the HouseObject object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this object class
    */
    public static String get_class_name() {
        return "ObjectRoot.HouseObject";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the HouseObject object class.
    *
    * @return the name of this object class
    */
    public static String get_simple_class_name() {
        return "HouseObject";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden attributes in the
    * HouseObject object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getAttributeNames()}.
    *
    * @return a modifiable set of the non-hidden attribute names for this object class
    */
    public static Set< String > get_attribute_names() {
        return new HashSet< String >(_datamemberNames);
    }

    /**
    * Returns a set containing the names of all of the attributes in the
    * HouseObject object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getAttributeNames()}.
    *
    * @return a modifiable set of the attribute names for this object class
    */
    public static Set< String > get_all_attribute_names() {
        return new HashSet< String >(_allDatamemberNames);
    }

    private static Set< String > _publishAttributeNameSet = new HashSet< String >();
    private static Set< String > _subscribeAttributeNameSet = new HashSet< String >();

    static {
        _classNameSet.add("ObjectRoot.HouseObject");
        _classNameClassMap.put("ObjectRoot.HouseObject", HouseObject.class);

        _datamemberClassNameSetMap.put("ObjectRoot.HouseObject", _datamemberNames);
        _allDatamemberClassNameSetMap.put("ObjectRoot.HouseObject", _allDatamemberNames);

        _datamemberNames.add("compressor_count");
        _datamemberNames.add("compressor_on");
        _datamemberNames.add("name");
        _datamemberNames.add("temperature");

        _datamemberTypeMap.put("compressor_count", "int");
        _datamemberTypeMap.put("compressor_on", "boolean");
        _datamemberTypeMap.put("name", "String");
        _datamemberTypeMap.put("temperature", "double");

        _allDatamemberNames.add("compressor_count");
        _allDatamemberNames.add("compressor_on");
        _allDatamemberNames.add("name");
        _allDatamemberNames.add("temperature");

        _classNamePublishAttributeNameMap.put("ObjectRoot.HouseObject", _publishAttributeNameSet);
        _classNameSubscribeAttributeNameMap.put("ObjectRoot.HouseObject", _subscribeAttributeNameSet);
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        ObjectRoot.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getObjectClassHandle("ObjectRoot.HouseObject");
                isNotInitialized = false;
            } catch (FederateNotExecutionMember e) {
                logger.error("could not initialize: Federate Not Execution Member", e);
                return;
            } catch (NameNotFound e) {
                logger.error("could not initialize: Name Not Found", e);
                return;
            } catch (Exception e) {
                logger.error(e);
                CpswtUtils.sleepDefault();
            }
        }

        _classNameHandleMap.put("ObjectRoot.HouseObject", get_handle());
        _classHandleNameMap.put(get_handle(), "ObjectRoot.HouseObject");
        _classHandleSimpleNameMap.put(get_handle(), "HouseObject");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _compressor_count_handle = rti.getAttributeHandle("compressor_count", get_handle());
                _compressor_on_handle = rti.getAttributeHandle("compressor_on", get_handle());
                _name_handle = rti.getAttributeHandle("name", get_handle());
                _temperature_handle = rti.getAttributeHandle("temperature", get_handle());
                isNotInitialized = false;
            } catch (FederateNotExecutionMember e) {
                logger.error("could not initialize: Federate Not Execution Member", e);
                return;
            } catch (ObjectClassNotDefined e) {
                logger.error("could not initialize: Object Class Not Defined", e);
                return;
            } catch (NameNotFound e) {
                logger.error("could not initialize: Name Not Found", e);
                return;
            } catch (Exception e) {
                logger.error(e);
                CpswtUtils.sleepDefault();
            }
        }

        _datamemberNameHandleMap.put("ObjectRoot.HouseObject.compressor_count", _compressor_count_handle);
        _datamemberNameHandleMap.put("ObjectRoot.HouseObject.compressor_on", _compressor_on_handle);
        _datamemberNameHandleMap.put("ObjectRoot.HouseObject.name", _name_handle);
        _datamemberNameHandleMap.put("ObjectRoot.HouseObject.temperature", _temperature_handle);

        _datamemberHandleNameMap.put(_compressor_count_handle, "compressor_count");
        _datamemberHandleNameMap.put(_compressor_on_handle, "compressor_on");
        _datamemberHandleNameMap.put(_name_handle, "name");
        _datamemberHandleNameMap.put(_temperature_handle, "temperature");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the HouseObject object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void publish(RTIambassador rti) {
        if (_isPublished) return;

        init(rti);

        AttributeHandleSet publishedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _publishAttributeNameSet) {
            try {
                publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.HouseObject." + attributeName));
                logger.trace("publish {}:{}", get_class_name(), attributeName);
            } catch (Exception e) {
                logger.error("could not publish \"" + attributeName + "\" attribute.", e);
            }
        }

        synchronized(rti) {
            boolean isNotPublished = true;
            while(isNotPublished) {
                try {
                    rti.publishObjectClass(get_handle(), publishedAttributeHandleSet);
                    isNotPublished = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not publish: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not publish: Object Class Not Defined", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isPublished = true;
        logger.debug("publish: {}", get_class_name());
    }

    /**
    * Unpublishes the HouseObject object class for a federate.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unpublish: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not unpublish: Object Class Not Defined", e);
                    return;
                } catch (ObjectClassNotPublished e) {
                    logger.error("could not unpublish: Object Class Not Published", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isPublished = false;
        logger.debug("unpublish: {}", get_class_name());
    }

    private static boolean _isSubscribed = false;

    /**
    * Subscribes a federate to the HouseObject object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void subscribe(RTIambassador rti) {
        if (_isSubscribed) return;

        init(rti);

        AttributeHandleSet subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _subscribeAttributeNameSet) {
            try {
                subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.HouseObject." + attributeName));
                logger.trace("subscribe {}:{}", get_class_name(), attributeName);
            } catch (Exception e) {
                logger.error("could not subscribe to \"" + attributeName + "\" attribute.", e);
            }
        }

        synchronized(rti) {
            boolean isNotSubscribed = true;
            while(isNotSubscribed) {
                try {
                    rti.subscribeObjectClassAttributes(get_handle(), subscribedAttributeHandleSet);
                    isNotSubscribed = false;
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not subscribe: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not subscribe: Object Class Not Defined", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isSubscribed = true;
        logger.debug("subscribe: {}", get_class_name());
    }

    /**
    * Unsubscribes a federate from the HouseObject object class.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unsubscribe: Federate Not Execution Member", e);
                    return;
                } catch (ObjectClassNotDefined e) {
                    logger.error("could not unsubscribe: Object Class Not Defined", e);
                    return;
                } catch (ObjectClassNotSubscribed e) {
                    logger.error("could not unsubscribe: Object Class Not Subscribed", e);
                    return;
                } catch (Exception e) {
                    logger.error(e);
                    CpswtUtils.sleepDefault();
                }
            }
        }

        _isSubscribed = false;
        logger.debug("unsubscribe: {}", get_class_name());
    }

    /**
    * Return true if "handle" is equal to the handle (RTI assigned) of this class
    * (that is, the HouseObject object class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the HouseObject object class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the HouseObject object class).
    */
    public static boolean match(int handle) {
        return handle == get_handle();
    }

    /**
    * Returns the handle (RTI assigned) of this instance's object class .
    *
    * @return the handle (RTI assigned) if this instance's object class
    */
    public int getClassHandle() {
        return get_handle();
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of this instance's object class.
    *
    * @return the fully-qualified (dot-delimited) name of this instance's object class
    */
    public String getClassName() {
        return get_class_name();
    }

    /**
    * Returns the simple name (last name in its fully-qualified dot-delimited name)
    * of this instance's object class.
    *
    * @return the simple name of this instance's object class
    */
    public String getSimpleClassName() {
        return get_simple_class_name();
    }

    /**
    * Returns a set containing the names of all of the non-hiddenattributes of an
    * object class instance.
    *
    * @return set containing the names of all of the attributes of an
    * object class instance
    */
    public Set< String > getAttributeNames() {
        return get_attribute_names();
    }

    /**
    * Returns a set containing the names of all of the attributes of an
    * object class instance.
    *
    * @return set containing the names of all of the attributes of an
    * object class instance
    */
    public Set< String > getAllAttributeNames() {
        return get_all_attribute_names();
    }

    @Override
    public String getAttributeName(int datamemberHandle) {
        if (datamemberHandle == _compressor_count_handle) return "compressor_count";
        else if (datamemberHandle == _compressor_on_handle) return "compressor_on";
        else if (datamemberHandle == _name_handle) return "name";
        else if (datamemberHandle == _temperature_handle) return "temperature";
        else return super.getAttributeName(datamemberHandle);
    }

    /**
    * Publishes the object class of this instance of the class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void publishObject(RTIambassador rti) {
        publish(rti);
    }

    /**
    * Unpublishes the object class of this instance of this class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unpublishObject(RTIambassador rti) {
        unpublish(rti);
    }

    /**
    * Subscribes a federate to the object class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void subscribeObject(RTIambassador rti) {
        subscribe(rti);
    }

    /**
    * Unsubscribes a federate from the object class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unsubscribeObject(RTIambassador rti) {
        unsubscribe(rti);
    }

    @Override
    public String toString() {
        return getClass().getName() + "("
                + "compressor_count:" + get_compressor_count()
                + "," + "compressor_on:" + get_compressor_on()
                + "," + "name:" + get_name()
                + "," + "temperature:" + get_temperature()
                + ")";
    }


    /**
    * Publishes the "compressor_count" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "compressor_count" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_compressor_count() {
        _publishAttributeNameSet.add( "compressor_count" );
    }

    /**
    * Unpublishes the "compressor_count" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "compressor_count" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_compressor_count() {
        _publishAttributeNameSet.remove( "compressor_count" );
    }

    /**
    * Subscribes a federate to the "compressor_count" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "compressor_count" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_compressor_count() {
        _subscribeAttributeNameSet.add( "compressor_count" );
    }

    /**
    * Unsubscribes a federate from the "compressor_count" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "compressor_count" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_compressor_count() {
        _subscribeAttributeNameSet.remove( "compressor_count" );
    }

    /**
    * Publishes the "compressor_on" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "compressor_on" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_compressor_on() {
        _publishAttributeNameSet.add( "compressor_on" );
    }

    /**
    * Unpublishes the "compressor_on" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "compressor_on" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_compressor_on() {
        _publishAttributeNameSet.remove( "compressor_on" );
    }

    /**
    * Subscribes a federate to the "compressor_on" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "compressor_on" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_compressor_on() {
        _subscribeAttributeNameSet.add( "compressor_on" );
    }

    /**
    * Unsubscribes a federate from the "compressor_on" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "compressor_on" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_compressor_on() {
        _subscribeAttributeNameSet.remove( "compressor_on" );
    }

    /**
    * Publishes the "name" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "name" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_name() {
        _publishAttributeNameSet.add( "name" );
    }

    /**
    * Unpublishes the "name" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "name" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_name() {
        _publishAttributeNameSet.remove( "name" );
    }

    /**
    * Subscribes a federate to the "name" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "name" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_name() {
        _subscribeAttributeNameSet.add( "name" );
    }

    /**
    * Unsubscribes a federate from the "name" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "name" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_name() {
        _subscribeAttributeNameSet.remove( "name" );
    }

    /**
    * Publishes the "temperature" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "temperature" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_temperature() {
        _publishAttributeNameSet.add( "temperature" );
    }

    /**
    * Unpublishes the "temperature" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "temperature" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_temperature() {
        _publishAttributeNameSet.remove( "temperature" );
    }

    /**
    * Subscribes a federate to the "temperature" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "temperature" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_temperature() {
        _subscribeAttributeNameSet.add( "temperature" );
    }

    /**
    * Unsubscribes a federate from the "temperature" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "temperature" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_temperature() {
        _subscribeAttributeNameSet.remove( "temperature" );
    }

    protected Attribute< Integer > _compressor_count =
            new Attribute< Integer >(  new Integer( 0 )  );

    /**
    * Set the value of the "compressor_count" attribute to "value" for this object.
    *
    * @param value the new value for the "compressor_count" attribute
    */
    public void set_compressor_count( int value ) {
        _compressor_count.setValue( value );
        _compressor_count.setTime( getTime() );
    }

    /**
    * Returns the value of the "compressor_count" attribute of this object.
    *
    * @return the value of the "compressor_count" attribute
    */
    public int get_compressor_count() {
        return _compressor_count.getValue();
    }

    /**
    * Returns the current timestamp of the "compressor_count" attribute of this object.
    *
    * @return the current timestamp of the "compressor_count" attribute
    */
    public double get_compressor_count_time() {
        return _compressor_count.getTime();
    }

    protected Attribute< Boolean > _compressor_on =
            new Attribute< Boolean >(  new Boolean( false )  );

    /**
    * Set the value of the "compressor_on" attribute to "value" for this object.
    *
    * @param value the new value for the "compressor_on" attribute
    */
    public void set_compressor_on( boolean value ) {
        _compressor_on.setValue( value );
        _compressor_on.setTime( getTime() );
    }

    /**
    * Returns the value of the "compressor_on" attribute of this object.
    *
    * @return the value of the "compressor_on" attribute
    */
    public boolean get_compressor_on() {
        return _compressor_on.getValue();
    }

    /**
    * Returns the current timestamp of the "compressor_on" attribute of this object.
    *
    * @return the current timestamp of the "compressor_on" attribute
    */
    public double get_compressor_on_time() {
        return _compressor_on.getTime();
    }

    protected Attribute< String > _name =
            new Attribute< String >(  new String( "" )  );

    /**
    * Set the value of the "name" attribute to "value" for this object.
    *
    * @param value the new value for the "name" attribute
    */
    public void set_name( String value ) {
        _name.setValue( value );
        _name.setTime( getTime() );
    }

    /**
    * Returns the value of the "name" attribute of this object.
    *
    * @return the value of the "name" attribute
    */
    public String get_name() {
        return _name.getValue();
    }

    /**
    * Returns the current timestamp of the "name" attribute of this object.
    *
    * @return the current timestamp of the "name" attribute
    */
    public double get_name_time() {
        return _name.getTime();
    }

    protected Attribute< Double > _temperature =
            new Attribute< Double >(  new Double( 0 )  );

    /**
    * Set the value of the "temperature" attribute to "value" for this object.
    *
    * @param value the new value for the "temperature" attribute
    */
    public void set_temperature( double value ) {
        _temperature.setValue( value );
        _temperature.setTime( getTime() );
    }

    /**
    * Returns the value of the "temperature" attribute of this object.
    *
    * @return the value of the "temperature" attribute
    */
    public double get_temperature() {
        return _temperature.getValue();
    }

    /**
    * Returns the current timestamp of the "temperature" attribute of this object.
    *
    * @return the current timestamp of the "temperature" attribute
    */
    public double get_temperature_time() {
        return _temperature.getTime();
    }

    protected HouseObject( ReflectedAttributes datamemberMap, boolean initFlag ) {
        super( datamemberMap, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    protected HouseObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
        super( datamemberMap, logicalTime, false );
        if ( initFlag ) setAttributes( datamemberMap );
    }

    /**
    * Creates an instance of the HouseObject object class, using
    * "datamemberMap" to initialize its attribute values.
    * "datamemberMap" is usually acquired as an argument to an RTI federate
    * callback method, such as "receiveInteraction".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new HouseObject object class instance
    */
    public HouseObject( ReflectedAttributes datamemberMap ) {
        this( datamemberMap, true );
    }

    /**
    * Like {@link #HouseObject( ReflectedAttributes datamemberMap )}, except this
    * new HouseObject object class instance is given a timestamp of
    * "logicalTime".
    *
    * @param datamemberMap data structure containing initial values for the
    * attributes of this new HouseObject object class instance
    * @param logicalTime timestamp for this new HouseObject object class
    * instance
    */
    public HouseObject( ReflectedAttributes datamemberMap, LogicalTime logicalTime ) {
        this( datamemberMap, logicalTime, true );
    }

    /**
    * Creates a new HouseObject object class instance that is a duplicate
    * of the instance referred to by HouseObject_var.
    *
    * @param HouseObject_var HouseObject object class instance of which
    * this newly created HouseObject object class instance will be a
    * duplicate
    */
    public HouseObject( HouseObject HouseObject_var ) {
        super( HouseObject_var );

        set_compressor_count( HouseObject_var.get_compressor_count() );
        set_compressor_on( HouseObject_var.get_compressor_on() );
        set_name( HouseObject_var.get_name() );
        set_temperature( HouseObject_var.get_temperature() );
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
        if ( "compressor_count".equals(datamemberName) ) return new Integer(get_compressor_count());
        else if ( "compressor_on".equals(datamemberName) ) return new Boolean(get_compressor_on());
        else if ( "name".equals(datamemberName) ) return get_name();
        else if ( "temperature".equals(datamemberName) ) return new Double(get_temperature());
        else return super.getAttribute( datamemberName );
    }

    protected boolean setAttributeAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "compressor_count".equals( datamemberName) ) set_compressor_count( Integer.parseInt(val) );
        else if ( "compressor_on".equals( datamemberName) ) set_compressor_on( Boolean.parseBoolean(val) );
        else if ( "name".equals( datamemberName) ) set_name( val );
        else if ( "temperature".equals( datamemberName) ) set_temperature( Double.parseDouble(val) );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    protected boolean setAttributeAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "compressor_count".equals( datamemberName) ) set_compressor_count( (Integer)val );
        else if ( "compressor_on".equals( datamemberName) ) set_compressor_on( (Boolean)val );
        else if ( "name".equals( datamemberName) ) set_name( (String)val );
        else if ( "temperature".equals( datamemberName) ) set_temperature( (Double)val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    @Override
    protected SuppliedAttributes createSuppliedDatamembers(boolean force) {
        SuppliedAttributes datamembers = _factory.createSuppliedAttributes();
 
        if (_publishAttributeNameSet.contains("compressor_count") && _compressor_count.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("compressor_count"), getAttribute("compressor_count").toString().getBytes() );
            _compressor_count.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("compressor_on") && _compressor_on.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("compressor_on"), getAttribute("compressor_on").toString().getBytes() );
            _compressor_on.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("name") && _name.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("name"), getAttribute("name").toString().getBytes() );
            _name.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("temperature") && _temperature.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("temperature"), getAttribute("temperature").toString().getBytes() );
            _temperature.setHasBeenUpdated();
        }

        return datamembers;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof HouseObject ) {
            HouseObject data = (HouseObject)object;
            _compressor_count = data._compressor_count;
            _compressor_on = data._compressor_on;
            _name = data._name;
            _temperature = data._temperature;
        }
    }
}
