// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

package ChallengeResponse;

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
* Implements ObjectRoot.ParentObject.ChallengeObject
*/
public class ChallengeObject extends ParentObject {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the ChallengeObject object class with default attribute values.
    */
    public ChallengeObject() {}

    private static int _beginIndex_handle;
    private static int _challengeId_handle;
    private static int _stringValue_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the ChallengeObject object class.
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
    * Returns the fully-qualified (dot-delimited) name of the ChallengeObject object class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this object class
    */
    public static String get_class_name() {
        return "ObjectRoot.ParentObject.ChallengeObject";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the ChallengeObject object class.
    *
    * @return the name of this object class
    */
    public static String get_simple_class_name() {
        return "ChallengeObject";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden attributes in the
    * ChallengeObject object class.
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
    * ChallengeObject object class.
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
        _classNameSet.add("ObjectRoot.ParentObject.ChallengeObject");
        _classNameClassMap.put("ObjectRoot.ParentObject.ChallengeObject", ChallengeObject.class);

        _datamemberClassNameSetMap.put("ObjectRoot.ParentObject.ChallengeObject", _datamemberNames);
        _allDatamemberClassNameSetMap.put("ObjectRoot.ParentObject.ChallengeObject", _allDatamemberNames);

        _datamemberNames.add("beginIndex");
        _datamemberNames.add("stringValue");

        _datamemberTypeMap.put("beginIndex", "int");
        _datamemberTypeMap.put("stringValue", "String");

        _allDatamemberNames.add("beginIndex");
        _allDatamemberNames.add("challengeId");
        _allDatamemberNames.add("stringValue");

        _classNamePublishAttributeNameMap.put("ObjectRoot.ParentObject.ChallengeObject", _publishAttributeNameSet);
        _classNameSubscribeAttributeNameMap.put("ObjectRoot.ParentObject.ChallengeObject", _subscribeAttributeNameSet);
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        ParentObject.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getObjectClassHandle("ObjectRoot.ParentObject.ChallengeObject");
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

        _classNameHandleMap.put("ObjectRoot.ParentObject.ChallengeObject", get_handle());
        _classHandleNameMap.put(get_handle(), "ObjectRoot.ParentObject.ChallengeObject");
        _classHandleSimpleNameMap.put(get_handle(), "ChallengeObject");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _beginIndex_handle = rti.getAttributeHandle("beginIndex", get_handle());
                _challengeId_handle = rti.getAttributeHandle("challengeId", get_handle());
                _stringValue_handle = rti.getAttributeHandle("stringValue", get_handle());
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

        _datamemberNameHandleMap.put("ObjectRoot.ParentObject.ChallengeObject.beginIndex", _beginIndex_handle);
        _datamemberNameHandleMap.put("ObjectRoot.ParentObject.ChallengeObject.challengeId", _challengeId_handle);
        _datamemberNameHandleMap.put("ObjectRoot.ParentObject.ChallengeObject.stringValue", _stringValue_handle);

        _datamemberHandleNameMap.put(_beginIndex_handle, "beginIndex");
        _datamemberHandleNameMap.put(_challengeId_handle, "challengeId");
        _datamemberHandleNameMap.put(_stringValue_handle, "stringValue");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the ChallengeObject object class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void publish(RTIambassador rti) {
        if (_isPublished) return;

        init(rti);

        AttributeHandleSet publishedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _publishAttributeNameSet) {
            try {
                publishedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ParentObject.ChallengeObject." + attributeName));
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
    * Subscribes a federate to the ChallengeObject object class.
    *
    * @param rti handle to the Local RTI Component
    */
    public static void subscribe(RTIambassador rti) {
        if (_isSubscribed) return;

        init(rti);

        AttributeHandleSet subscribedAttributeHandleSet = _factory.createAttributeHandleSet();
        for(String attributeName : _subscribeAttributeNameSet) {
            try {
                subscribedAttributeHandleSet.add(_datamemberNameHandleMap.get("ObjectRoot.ParentObject.ChallengeObject." + attributeName));
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
    * (that is, the ChallengeObject object class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the ChallengeObject object class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the ChallengeObject object class).
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
        if (datamemberHandle == _beginIndex_handle) return "beginIndex";
        else if (datamemberHandle == _challengeId_handle) return "challengeId";
        else if (datamemberHandle == _stringValue_handle) return "stringValue";
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
                + "beginIndex:" + get_beginIndex()
                + "," + "challengeId:" + get_challengeId()
                + "," + "stringValue:" + get_stringValue()
                + ")";
    }


    /**
    * Publishes the "beginIndex" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "beginIndex" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_beginIndex() {
        _publishAttributeNameSet.add( "beginIndex" );
    }

    /**
    * Unpublishes the "beginIndex" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "beginIndex" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_beginIndex() {
        _publishAttributeNameSet.remove( "beginIndex" );
    }

    /**
    * Subscribes a federate to the "beginIndex" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "beginIndex" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_beginIndex() {
        _subscribeAttributeNameSet.add( "beginIndex" );
    }

    /**
    * Unsubscribes a federate from the "beginIndex" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "beginIndex" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_beginIndex() {
        _subscribeAttributeNameSet.remove( "beginIndex" );
    }

    /**
    * Publishes the "challengeId" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "challengeId" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void publish_challengeId() {
        _publishAttributeNameSet.add( "challengeId" );
    }

    /**
    * Unpublishes the "challengeId" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "challengeId" attribute for unpublication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
    */
    public static void unpublish_challengeId() {
        _publishAttributeNameSet.remove( "challengeId" );
    }

    /**
    * Subscribes a federate to the "challengeId" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "challengeId" attribute for subscription.
    * To actually subscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void subscribe_challengeId() {
        _subscribeAttributeNameSet.add( "challengeId" );
    }

    /**
    * Unsubscribes a federate from the "challengeId" attribute of the attribute's
    * containing object class.
    * Note:  This method only marks the "challengeId" attribute for unsubscription.
    * To actually unsubscribe to the attribute, the federate must (re)subscribe to its
    * containing object class.
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_challengeId() {
        _subscribeAttributeNameSet.remove( "challengeId" );
    }

    /**
    * Publishes the "stringValue" attribute of the attribute's containing object
    * class for a federate.
    * Note:  This method only marks the "stringValue" attribute for publication.
    * To actually publish the attribute, the federate must (re)publish its containing
    * object class.
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
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
    * (using &lt;objectClassName&gt;.publish( RTIambassador rti ) ).
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
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
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
    * (using &lt;objectClassName&gt;.subscribe( RTIambassador rti ) ).
    */
    public static void unsubscribe_stringValue() {
        _subscribeAttributeNameSet.remove( "stringValue" );
    }

    protected Attribute< Integer > _beginIndex =
            new Attribute< Integer >(  new Integer( 0 )  );

    /**
    * Set the value of the "beginIndex" attribute to "value" for this object.
    *
    * @param value the new value for the "beginIndex" attribute
    */
    public void set_beginIndex( int value ) {
        _beginIndex.setValue( value );
        _beginIndex.setTime( getTime() );
    }

    /**
    * Returns the value of the "beginIndex" attribute of this object.
    *
    * @return the value of the "beginIndex" attribute
    */
    public int get_beginIndex() {
        return _beginIndex.getValue();
    }

    /**
    * Returns the current timestamp of the "beginIndex" attribute of this object.
    *
    * @return the current timestamp of the "beginIndex" attribute
    */
    public double get_beginIndex_time() {
        return _beginIndex.getTime();
    }

    protected Attribute< String > _stringValue =
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

        set_beginIndex( ChallengeObject_var.get_beginIndex() );
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
        if ( "beginIndex".equals(datamemberName) ) return new Integer(get_beginIndex());
        else if ( "stringValue".equals(datamemberName) ) return get_stringValue();
        else return super.getAttribute( datamemberName );
    }

    protected boolean setAttributeAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "beginIndex".equals( datamemberName) ) set_beginIndex( Integer.parseInt(val) );
        else if ( "stringValue".equals( datamemberName) ) set_stringValue( val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    protected boolean setAttributeAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "beginIndex".equals( datamemberName) ) set_beginIndex( (Integer)val );
        else if ( "stringValue".equals( datamemberName) ) set_stringValue( (String)val );
        else retval = super.setAttributeAux( datamemberName, val );

        return retval;
    }

    @Override
    protected SuppliedAttributes createSuppliedDatamembers(boolean force) {
        SuppliedAttributes datamembers = _factory.createSuppliedAttributes();
 
        if (_publishAttributeNameSet.contains("beginIndex") && _beginIndex.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("beginIndex"), getAttribute("beginIndex").toString().getBytes() );
            _beginIndex.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("challengeId") && _challengeId.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("challengeId"), getAttribute("challengeId").toString().getBytes() );
            _challengeId.setHasBeenUpdated();
        }

        if (_publishAttributeNameSet.contains("stringValue") && _stringValue.shouldBeUpdated(force)) {
            datamembers.add( getAttributeHandle("stringValue"), getAttribute("stringValue").toString().getBytes() );
            _stringValue.setHasBeenUpdated();
        }

        return datamembers;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof ChallengeObject ) {
            ChallengeObject data = (ChallengeObject)object;
            _beginIndex = data._beginIndex;
            _stringValue = data._stringValue;
        }
    }
}

