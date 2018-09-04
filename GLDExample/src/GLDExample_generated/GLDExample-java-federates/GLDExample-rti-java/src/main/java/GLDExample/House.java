// This file was generated by the WebGME Federates Exporter plugin. Do not edit manually!

package GLDExample;

import java.util.HashSet;
import java.util.Set;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;

import hla.rti.FederateNotExecutionMember;
import hla.rti.InteractionClassNotDefined;
import hla.rti.InteractionClassNotPublished;
import hla.rti.InteractionClassNotSubscribed;
import hla.rti.LogicalTime;
import hla.rti.NameNotFound;
import hla.rti.RTIambassador;
import hla.rti.ReceivedInteraction;

import org.cpswt.hla.*;

/**
* Implements InteractionRoot.C2WInteractionRoot.House
*/
public class House extends C2WInteractionRoot {

    private static final Logger logger = LogManager.getLogger();

    /**
    * Creates an instance of the House interaction class with default parameter values.
    */
    public House() {}

    private static int _actualLogicalGenerationTime_handle;
    private static int _compressor_count_handle;
    private static int _compressor_on_handle;
    private static int _federateFilter_handle;
    private static int _name_handle;
    private static int _originFed_handle;
    private static int _sourceFed_handle;
    private static int _temperature_handle;

    private static boolean _isInitialized = false;

    private static int _handle;

    /**
    * Returns the handle (RTI assigned) of the House interaction class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the handle of the class pertaining to the reference,
    * rather than the handle of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassHandle()}.
    *
    * @return the RTI assigned integer handle that represents this interaction class
    */
    public static int get_handle() {
        return _handle;
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of the House interaction class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return the name of the class pertaining to the reference,
    * rather than the name of the class for the instance referred to by the reference.
    * For the polymorphic version of this method, use {@link #getClassName()}.
    *
    * @return the fully-qualified HLA class path for this interaction class
    */
    public static String get_class_name() {
        return "InteractionRoot.C2WInteractionRoot.House";
    }

    /**
    * Returns the simple name (the last name in the dot-delimited fully-qualified
    * class name) of the House interaction class.
    *
    * @return the name of this interaction class
    */
    public static String get_simple_class_name() {
        return "House";
    }

    private static Set< String > _datamemberNames = new HashSet< String >();
    private static Set< String > _allDatamemberNames = new HashSet< String >();

    /**
    * Returns a set containing the names of all of the non-hidden parameters in the
    * House interaction class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getParameterNames()}.
    *
    * @return a modifiable set of the non-hidden parameter names for this interaction class
    */
    public static Set< String > get_parameter_names() {
        return new HashSet< String >(_datamemberNames);
    }

    /**
    * Returns a set containing the names of all of the parameters in the
    * House interaction class.
    * Note: As this is a static method, it is NOT polymorphic, and so, if called on
    * a reference will return a set of parameter names pertaining to the reference,
    * rather than the parameter names of the class for the instance referred to by
    * the reference.  For the polymorphic version of this method, use
    * {@link #getParameterNames()}.
    *
    * @return a modifiable set of the parameter names for this interaction class
    */
    public static Set< String > get_all_parameter_names() {
        return new HashSet< String >(_allDatamemberNames);
    }

    static {
        _classNameSet.add("InteractionRoot.C2WInteractionRoot.House");
        _classNameClassMap.put("InteractionRoot.C2WInteractionRoot.House", House.class);

        _datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.House", _datamemberNames);
        _allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.House", _allDatamemberNames);

        _datamemberNames.add("compressor_count");
        _datamemberNames.add("compressor_on");
        _datamemberNames.add("name");
        _datamemberNames.add("temperature");

        _datamemberTypeMap.put("compressor_count", "int");
        _datamemberTypeMap.put("compressor_on", "boolean");
        _datamemberTypeMap.put("name", "String");
        _datamemberTypeMap.put("temperature", "double");

        _allDatamemberNames.add("actualLogicalGenerationTime");
        _allDatamemberNames.add("compressor_count");
        _allDatamemberNames.add("compressor_on");
        _allDatamemberNames.add("federateFilter");
        _allDatamemberNames.add("name");
        _allDatamemberNames.add("originFed");
        _allDatamemberNames.add("sourceFed");
        _allDatamemberNames.add("temperature");
    }

    protected static void init(RTIambassador rti) {
        if (_isInitialized) return;
        _isInitialized = true;

        C2WInteractionRoot.init(rti);

        boolean isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.House");
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

        _classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House", get_handle());
        _classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.House");
        _classHandleSimpleNameMap.put(get_handle(), "House");

        isNotInitialized = true;
        while(isNotInitialized) {
            try {
                _actualLogicalGenerationTime_handle = rti.getParameterHandle("actualLogicalGenerationTime", get_handle());
                _compressor_count_handle = rti.getParameterHandle("compressor_count", get_handle());
                _compressor_on_handle = rti.getParameterHandle("compressor_on", get_handle());
                _federateFilter_handle = rti.getParameterHandle("federateFilter", get_handle());
                _name_handle = rti.getParameterHandle("name", get_handle());
                _originFed_handle = rti.getParameterHandle("originFed", get_handle());
                _sourceFed_handle = rti.getParameterHandle("sourceFed", get_handle());
                _temperature_handle = rti.getParameterHandle("temperature", get_handle());
                isNotInitialized = false;
            } catch (FederateNotExecutionMember e) {
                logger.error("could not initialize: Federate Not Execution Member", e);
                return;
            } catch (InteractionClassNotDefined e) {
                logger.error("could not initialize: Interaction Class Not Defined", e);
                return;
            } catch (NameNotFound e) {
                logger.error("could not initialize: Name Not Found", e);
                return;
            } catch (Exception e) {
                logger.error(e);
                CpswtUtils.sleepDefault();
            }
        }

        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.actualLogicalGenerationTime", _actualLogicalGenerationTime_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.compressor_count", _compressor_count_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.compressor_on", _compressor_on_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.federateFilter", _federateFilter_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.name", _name_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.originFed", _originFed_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.sourceFed", _sourceFed_handle);
        _datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.House.temperature", _temperature_handle);

        _datamemberHandleNameMap.put(_actualLogicalGenerationTime_handle, "actualLogicalGenerationTime");
        _datamemberHandleNameMap.put(_compressor_count_handle, "compressor_count");
        _datamemberHandleNameMap.put(_compressor_on_handle, "compressor_on");
        _datamemberHandleNameMap.put(_federateFilter_handle, "federateFilter");
        _datamemberHandleNameMap.put(_name_handle, "name");
        _datamemberHandleNameMap.put(_originFed_handle, "originFed");
        _datamemberHandleNameMap.put(_sourceFed_handle, "sourceFed");
        _datamemberHandleNameMap.put(_temperature_handle, "temperature");
    }

    private static boolean _isPublished = false;

    /**
    * Publishes the House interaction class for a federate.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not publish: Federate Not Execution Member", e);
                    return;
                } catch (InteractionClassNotDefined e) {
                    logger.error("could not publish: Interaction Class Not Defined", e);
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
    * Unpublishes the House interaction class for a federate.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unpublish: Federate Not Execution Member", e);
                    return;
                } catch (InteractionClassNotDefined e) {
                    logger.error("could not unpublish: Interaction Class Not Defined", e);
                    return;
                } catch (InteractionClassNotPublished e) {
                    logger.error("could not unpublish: Interaction Class Not Published", e);
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
    * Subscribes a federate to the House interaction class.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not subscribe: Federate Not Execution Member", e);
                    return;
                } catch (InteractionClassNotDefined e) {
                    logger.error("could not subscribe: Interaction Class Not Defined", e);
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
    * Unsubscribes a federate from the House interaction class.
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
                } catch (FederateNotExecutionMember e) {
                    logger.error("could not unsubscribe: Federate Not Execution Member", e);
                    return;
                } catch (InteractionClassNotDefined e) {
                    logger.error("could not unsubscribe: Interaction Class Not Defined", e);
                    return;
                } catch (InteractionClassNotSubscribed e) {
                    logger.error("could not unsubscribe: Interaction Class Not Subscribed", e);
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
    * (that is, the House interaction class).
    *
    * @param handle handle to compare to the value of the handle (RTI assigned) of
    * this class (the House interaction class).
    * @return "true" if "handle" matches the value of the handle of this class
    * (that is, the House interaction class).
    */
    public static boolean match(int handle) {
        return handle == get_handle();
    }

    /**
    * Returns the handle (RTI assigned) of this instance's interaction class .
    *
    * @return the handle (RTI assigned) if this instance's interaction class
    */
    public int getClassHandle() {
        return get_handle();
    }

    /**
    * Returns the fully-qualified (dot-delimited) name of this instance's interaction class.
    *
    * @return the fully-qualified (dot-delimited) name of this instance's interaction class
    */
    public String getClassName() {
        return get_class_name();
    }

    /**
    * Returns the simple name (last name in its fully-qualified dot-delimited name)
    * of this instance's interaction class.
    *
    * @return the simple name of this instance's interaction class
    */
    public String getSimpleClassName() {
        return get_simple_class_name();
    }

    /**
    * Returns a set containing the names of all of the non-hiddenparameters of an
    * interaction class instance.
    *
    * @return set containing the names of all of the parameters of an
    * interaction class instance
    */
    public Set< String > getParameterNames() {
        return get_parameter_names();
    }

    /**
    * Returns a set containing the names of all of the parameters of an
    * interaction class instance.
    *
    * @return set containing the names of all of the parameters of an
    * interaction class instance
    */
    public Set< String > getAllParameterNames() {
        return get_all_parameter_names();
    }

    @Override
    public String getParameterName(int datamemberHandle) {
        if (datamemberHandle == _actualLogicalGenerationTime_handle) return "actualLogicalGenerationTime";
        else if (datamemberHandle == _compressor_count_handle) return "compressor_count";
        else if (datamemberHandle == _compressor_on_handle) return "compressor_on";
        else if (datamemberHandle == _federateFilter_handle) return "federateFilter";
        else if (datamemberHandle == _name_handle) return "name";
        else if (datamemberHandle == _originFed_handle) return "originFed";
        else if (datamemberHandle == _sourceFed_handle) return "sourceFed";
        else if (datamemberHandle == _temperature_handle) return "temperature";
        else return super.getParameterName(datamemberHandle);
    }

    /**
    * Publishes the interaction class of this instance of the class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void publishInteraction(RTIambassador rti) {
        publish(rti);
    }

    /**
    * Unpublishes the interaction class of this instance of this class for a federate.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unpublishInteraction(RTIambassador rti) {
        unpublish(rti);
    }

    /**
    * Subscribes a federate to the interaction class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void subscribeInteraction(RTIambassador rti) {
        subscribe(rti);
    }

    /**
    * Unsubscribes a federate from the interaction class of this instance of this class.
    *
    * @param rti handle to the Local RTI Component
    */
    public void unsubscribeInteraction(RTIambassador rti) {
        unsubscribe(rti);
    }

    @Override
    public String toString() {
        return getClass().getName() + "("
                + "actualLogicalGenerationTime:" + get_actualLogicalGenerationTime()
                + "," + "compressor_count:" + get_compressor_count()
                + "," + "compressor_on:" + get_compressor_on()
                + "," + "federateFilter:" + get_federateFilter()
                + "," + "name:" + get_name()
                + "," + "originFed:" + get_originFed()
                + "," + "sourceFed:" + get_sourceFed()
                + "," + "temperature:" + get_temperature()
                + ")";
    }

    private int _compressor_count = 0;
    private boolean _compressor_on = false;
    private String _name = "";
    private double _temperature = 0;

    /**
    * Set the value of the "compressor_count" parameter to "value" for this parameter.
    *
    * @param value the new value for the "compressor_count" parameter
    */
    public void set_compressor_count( int value ) {
        _compressor_count = value;
    }

    /**
    * Returns the value of the "compressor_count" parameter of this interaction.
    *
    * @return the value of the "compressor_count" parameter
    */
    public int get_compressor_count() {
        return _compressor_count;
    }
    /**
    * Set the value of the "compressor_on" parameter to "value" for this parameter.
    *
    * @param value the new value for the "compressor_on" parameter
    */
    public void set_compressor_on( boolean value ) {
        _compressor_on = value;
    }

    /**
    * Returns the value of the "compressor_on" parameter of this interaction.
    *
    * @return the value of the "compressor_on" parameter
    */
    public boolean get_compressor_on() {
        return _compressor_on;
    }
    /**
    * Set the value of the "name" parameter to "value" for this parameter.
    *
    * @param value the new value for the "name" parameter
    */
    public void set_name( String value ) {
        _name = value;
    }

    /**
    * Returns the value of the "name" parameter of this interaction.
    *
    * @return the value of the "name" parameter
    */
    public String get_name() {
        return _name;
    }
    /**
    * Set the value of the "temperature" parameter to "value" for this parameter.
    *
    * @param value the new value for the "temperature" parameter
    */
    public void set_temperature( double value ) {
        _temperature = value;
    }

    /**
    * Returns the value of the "temperature" parameter of this interaction.
    *
    * @return the value of the "temperature" parameter
    */
    public double get_temperature() {
        return _temperature;
    }

    protected House( ReceivedInteraction datamemberMap, boolean initFlag ) {
        super( datamemberMap, false );
        if ( initFlag ) setParameters( datamemberMap );
    }

    protected House( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
        super( datamemberMap, logicalTime, false );
        if ( initFlag ) setParameters( datamemberMap );
    }

    /**
    * Creates an instance of the House interaction class, using
    * "datamemberMap" to initialize its parameter values.
    * "datamemberMap" is usually acquired as an argument to an RTI federate
    * callback method, such as "receiveInteraction".
    *
    * @param datamemberMap data structure containing initial values for the
    * parameters of this new House interaction class instance
    */
    public House( ReceivedInteraction datamemberMap ) {
        this( datamemberMap, true );
    }

    /**
    * Like {@link #House( ReceivedInteraction datamemberMap )}, except this
    * new House interaction class instance is given a timestamp of
    * "logicalTime".
    *
    * @param datamemberMap data structure containing initial values for the
    * parameters of this new House interaction class instance
    * @param logicalTime timestamp for this new House interaction class
    * instance
    */
    public House( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
        this( datamemberMap, logicalTime, true );
    }

    /**
    * Creates a new House interaction class instance that is a duplicate
    * of the instance referred to by House_var.
    *
    * @param House_var House interaction class instance of which
    * this newly created House interaction class instance will be a
    * duplicate
    */
    public House( House House_var ) {
        super( House_var );

        set_compressor_count( House_var.get_compressor_count() );
        set_compressor_on( House_var.get_compressor_on() );
        set_name( House_var.get_name() );
        set_temperature( House_var.get_temperature() );
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
        if ( "compressor_count".equals(datamemberName) ) return new Integer(get_compressor_count());
        else if ( "compressor_on".equals(datamemberName) ) return new Boolean(get_compressor_on());
        else if ( "name".equals(datamemberName) ) return get_name();
        else if ( "temperature".equals(datamemberName) ) return new Double(get_temperature());
        else return super.getParameter( datamemberName );
    }

    protected boolean setParameterAux( String datamemberName, String val ) {
        boolean retval = true;
        if ( "compressor_count".equals( datamemberName) ) set_compressor_count( Integer.parseInt(val) );
        else if ( "compressor_on".equals( datamemberName) ) set_compressor_on( Boolean.parseBoolean(val) );
        else if ( "name".equals( datamemberName) ) set_name( val );
        else if ( "temperature".equals( datamemberName) ) set_temperature( Double.parseDouble(val) );
        else retval = super.setParameterAux( datamemberName, val );

        return retval;
    }

    protected boolean setParameterAux( String datamemberName, Object val ) {
        boolean retval = true;
        if ( "compressor_count".equals( datamemberName) ) set_compressor_count( (Integer)val );
        else if ( "compressor_on".equals( datamemberName) ) set_compressor_on( (Boolean)val );
        else if ( "name".equals( datamemberName) ) set_name( (String)val );
        else if ( "temperature".equals( datamemberName) ) set_temperature( (Double)val );
        else retval = super.setParameterAux( datamemberName, val );

        return retval;
    }

    public void copyFrom( Object object ) {
        super.copyFrom( object );
        if ( object instanceof House ) {
            House data = (House)object;
            _compressor_count = data._compressor_count;
            _compressor_on = data._compressor_on;
            _name = data._name;
            _temperature = data._temperature;
        }
    }
}
