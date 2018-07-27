
package MapperEx;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The NetworkPacket class implements the NetworkPacket interaction in the
* MapperEx simulation.
*/
public class NetworkPacket extends ActionBase {

	private static final Logger logger = LogManager.getLogger(NetworkPacket.class);

	/**
	* Default constructor -- creates an instance of the NetworkPacket interaction
	* class with default parameter values.
	*/
	public NetworkPacket() { }

	
	
	private static int _data_handle;
	private static int _numBytes_handle;
	private static int _packetType_handle;
	private static int _receiverAppIndex_handle;
	private static int _receiverAppInterface_handle;
	private static int _receiverHost_handle;
	private static int _receiverHostApp_handle;
	private static int _senderAppIndex_handle;
	private static int _senderHost_handle;
	private static int _senderHostApp_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "data" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "data" parameter
	*/
	public static int get_data_handle() { return _data_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "numBytes" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "numBytes" parameter
	*/
	public static int get_numBytes_handle() { return _numBytes_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "packetType" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "packetType" parameter
	*/
	public static int get_packetType_handle() { return _packetType_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiverAppIndex" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiverAppIndex" parameter
	*/
	public static int get_receiverAppIndex_handle() { return _receiverAppIndex_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiverAppInterface" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiverAppInterface" parameter
	*/
	public static int get_receiverAppInterface_handle() { return _receiverAppInterface_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiverHost" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiverHost" parameter
	*/
	public static int get_receiverHost_handle() { return _receiverHost_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "receiverHostApp" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "receiverHostApp" parameter
	*/
	public static int get_receiverHostApp_handle() { return _receiverHostApp_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "senderAppIndex" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "senderAppIndex" parameter
	*/
	public static int get_senderAppIndex_handle() { return _senderAppIndex_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "senderHost" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "senderHost" parameter
	*/
	public static int get_senderHost_handle() { return _senderHost_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "senderHostApp" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "senderHostApp" parameter
	*/
	public static int get_senderHostApp_handle() { return _senderHostApp_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the NetworkPacket interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the NetworkPacket
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the NetworkPacket interaction class.
	*/
	public static String get_simple_class_name() { return "NetworkPacket"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* NetworkPacket interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_parameter_names() {
		return new HashSet< String >(_datamemberNames);
	}


	/**
	* Returns a set containing the names of all of the parameters in the
	* NetworkPacket interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return a set of parameter names pertaining to the reference,\
	* rather than the parameter names of the class for the instance referred to by
	* the reference.  For the polymorphic version of this method, use
	* {@link #getParameterNames()}.
	*/
	public static Set< String > get_all_parameter_names() {
		return new HashSet< String >(_allDatamemberNames);
	}


	

	static {
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket", NetworkPacket.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket", _allDatamemberNames);

		
		
		
		_datamemberNames.add("data");
		
		_datamemberNames.add("numBytes");
		
		_datamemberNames.add("packetType");
		_datamemberNames.add("receiverAppIndex");
		_datamemberNames.add("receiverAppInterface");
		_datamemberNames.add("receiverHost");
		_datamemberNames.add("receiverHostApp");
		_datamemberNames.add("senderAppIndex");
		_datamemberNames.add("senderHost");
		_datamemberNames.add("senderHostApp");
		
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("data");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("numBytes");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("packetType");
		_allDatamemberNames.add("receiverAppIndex");
		_allDatamemberNames.add("receiverAppInterface");
		_allDatamemberNames.add("receiverHost");
		_allDatamemberNames.add("receiverHostApp");
		_allDatamemberNames.add("senderAppIndex");
		_allDatamemberNames.add("senderHost");
		_allDatamemberNames.add("senderHostApp");
		_allDatamemberNames.add("sourceFed");
		
		
		_datamemberTypeMap.put("data", "String");
		_datamemberTypeMap.put("numBytes", "int");
		_datamemberTypeMap.put("packetType", "String");
		_datamemberTypeMap.put("receiverAppIndex", "int");
		_datamemberTypeMap.put("receiverAppInterface", "String");
		_datamemberTypeMap.put("receiverHost", "String");
		_datamemberTypeMap.put("receiverHostApp", "String");
		_datamemberTypeMap.put("senderAppIndex", "int");
		_datamemberTypeMap.put("senderHost", "String");
		_datamemberTypeMap.put("senderHostApp", "String");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		ActionBase.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket");
		_classHandleSimpleNameMap.put(get_handle(), "NetworkPacket");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_data_handle = rti.getParameterHandle("data", get_handle());			
				_numBytes_handle = rti.getParameterHandle("numBytes", get_handle());			
				_packetType_handle = rti.getParameterHandle("packetType", get_handle());			
				_receiverAppIndex_handle = rti.getParameterHandle("receiverAppIndex", get_handle());			
				_receiverAppInterface_handle = rti.getParameterHandle("receiverAppInterface", get_handle());			
				_receiverHost_handle = rti.getParameterHandle("receiverHost", get_handle());			
				_receiverHostApp_handle = rti.getParameterHandle("receiverHostApp", get_handle());			
				_senderAppIndex_handle = rti.getParameterHandle("senderAppIndex", get_handle());			
				_senderHost_handle = rti.getParameterHandle("senderHost", get_handle());			
				_senderHostApp_handle = rti.getParameterHandle("senderHostApp", get_handle());
				isNotInitialized = false;
			} catch (FederateNotExecutionMember f) {
				logger.error("{} Federate Not Execution Member", initErrorMessage);
				logger.error(f);
				return;
			} catch (InteractionClassNotDefined i) {
				logger.error("{} Interaction Class Not Defined", initErrorMessage);
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,data", get_data_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,numBytes", get_numBytes_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,packetType", get_packetType_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,receiverAppIndex", get_receiverAppIndex_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,receiverAppInterface", get_receiverAppInterface_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,receiverHost", get_receiverHost_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,receiverHostApp", get_receiverHostApp_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,senderAppIndex", get_senderAppIndex_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,senderHost", get_senderHost_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket,senderHostApp", get_senderHostApp_handle());
			
			
		_datamemberHandleNameMap.put(get_data_handle(), "data");
		_datamemberHandleNameMap.put(get_numBytes_handle(), "numBytes");
		_datamemberHandleNameMap.put(get_packetType_handle(), "packetType");
		_datamemberHandleNameMap.put(get_receiverAppIndex_handle(), "receiverAppIndex");
		_datamemberHandleNameMap.put(get_receiverAppInterface_handle(), "receiverAppInterface");
		_datamemberHandleNameMap.put(get_receiverHost_handle(), "receiverHost");
		_datamemberHandleNameMap.put(get_receiverHostApp_handle(), "receiverHostApp");
		_datamemberHandleNameMap.put(get_senderAppIndex_handle(), "senderAppIndex");
		_datamemberHandleNameMap.put(get_senderHost_handle(), "senderHost");
		_datamemberHandleNameMap.put(get_senderHostApp_handle(), "senderHostApp");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket:  could not publish:  ";

	/**
	* Publishes the NetworkPacket interaction class for a federate.
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
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", publishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", publishErrorMessage);
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket:  could not unpublish:  ";
	/**
	* Unpublishes the NetworkPacket interaction class for a federate.
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
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unpublishErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unpublishErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotPublished i) {
					logger.error("{} Interaction Class Not Published", unpublishErrorMessage);
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket:  could not subscribe:  ";
	/**
	* Subscribes a federate to the NetworkPacket interaction class.
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
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", subscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", subscribeErrorMessage);
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.ActionBase.NetworkPacket:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the NetworkPacket interaction class.
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
				} catch (FederateNotExecutionMember f) {
					logger.error("{} Federate Not Execution Member", unsubscribeErrorMessage);
					logger.error(f);
					return;
				} catch (InteractionClassNotDefined i) {
					logger.error("{} Interaction Class Not Defined", unsubscribeErrorMessage);
					logger.error(i);
					return;
				} catch (InteractionClassNotSubscribed i) {
					logger.error("{} Interaction Class Not Subscribed", unsubscribeErrorMessage);
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
	* (that is, the NetworkPacket interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the NetworkPacket interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the NetworkPacket interaction class).
	*/
	public static boolean match(int handle) { return handle == get_handle(); }

	/**
	* Returns the handle (RTI assigned) of this instance's interaction class .
	* 
	* @return the handle (RTI assigned) if this instance's interaction class
	*/
	public int getClassHandle() { return get_handle(); }

	/**
	* Returns the fully-qualified (dot-delimited) name of this instance's interaction class.
	* 
	* @return the fully-qualified (dot-delimited) name of this instance's interaction class
	*/
	public String getClassName() { return get_class_name(); }

	/**
	* Returns the simple name (last name in its fully-qualified dot-delimited name)
	* of this instance's interaction class.
	* 
	* @return the simple name of this instance's interaction class 
	*/
	public String getSimpleClassName() { return get_simple_class_name(); }

	/**
	* Returns a set containing the names of all of the non-hiddenparameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getParameterNames() { return get_parameter_names(); }

	/**
	* Returns a set containing the names of all of the parameters of an
	* interaction class instance.
	*
	* @return set containing the names of all of the parameters of an
	* interaction class instance
	*/
	public Set< String > getAllParameterNames() { return get_all_parameter_names(); }

	/**
	* Publishes the interaction class of this instance of the class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void publishInteraction(RTIambassador rti) { publish(rti); }

	/**
	* Unpublishes the interaction class of this instance of this class for a federate.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unpublishInteraction(RTIambassador rti) { unpublish(rti); }

	/**
	* Subscribes a federate to the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void subscribeInteraction(RTIambassador rti) { subscribe(rti); }

	/**
	* Unsubscribes a federate from the interaction class of this instance of this class.
	*
	* @param rti handle to the Local RTI Component
	*/
	public void unsubscribeInteraction(RTIambassador rti) { unsubscribe(rti); }

	

	public String toString() {
		return "NetworkPacket("
			
			
			+ "data:" + get_data()
			+ "," + "numBytes:" + get_numBytes()
			+ "," + "packetType:" + get_packetType()
			+ "," + "receiverAppIndex:" + get_receiverAppIndex()
			+ "," + "receiverAppInterface:" + get_receiverAppInterface()
			+ "," + "receiverHost:" + get_receiverHost()
			+ "," + "receiverHostApp:" + get_receiverHostApp()
			+ "," + "senderAppIndex:" + get_senderAppIndex()
			+ "," + "senderHost:" + get_senderHost()
			+ "," + "senderHostApp:" + get_senderHostApp()
			+ ")";
	}
	



	
	
	private String _data = "";
	
	private int _numBytes = 0;
	
	private String _packetType = "";
	
	private int _receiverAppIndex = 0;
	
	private String _receiverAppInterface = "";
	
	private String _receiverHost = "";
	
	private String _receiverHostApp = "";
	
	private int _senderAppIndex = 0;
	
	private String _senderHost = "";
	
	private String _senderHostApp = "";

	
	
	/**
	* Set the value of the "data" parameter to "value" for this parameter.
	*
	* @param value the new value for the "data" parameter
	*/
	public void set_data( String value ) { _data = value; }
	
	/**
	* Returns the value of the "data" parameter of this interaction.
	*
	* @return the value of the "data" parameter
	*/
	public String get_data() { return _data; }
	
	
	/**
	* Set the value of the "numBytes" parameter to "value" for this parameter.
	*
	* @param value the new value for the "numBytes" parameter
	*/
	public void set_numBytes( int value ) { _numBytes = value; }
	
	/**
	* Returns the value of the "numBytes" parameter of this interaction.
	*
	* @return the value of the "numBytes" parameter
	*/
	public int get_numBytes() { return _numBytes; }
	
	
	/**
	* Set the value of the "packetType" parameter to "value" for this parameter.
	*
	* @param value the new value for the "packetType" parameter
	*/
	public void set_packetType( String value ) { _packetType = value; }
	
	/**
	* Returns the value of the "packetType" parameter of this interaction.
	*
	* @return the value of the "packetType" parameter
	*/
	public String get_packetType() { return _packetType; }
	
	
	/**
	* Set the value of the "receiverAppIndex" parameter to "value" for this parameter.
	*
	* @param value the new value for the "receiverAppIndex" parameter
	*/
	public void set_receiverAppIndex( int value ) { _receiverAppIndex = value; }
	
	/**
	* Returns the value of the "receiverAppIndex" parameter of this interaction.
	*
	* @return the value of the "receiverAppIndex" parameter
	*/
	public int get_receiverAppIndex() { return _receiverAppIndex; }
	
	
	/**
	* Set the value of the "receiverAppInterface" parameter to "value" for this parameter.
	*
	* @param value the new value for the "receiverAppInterface" parameter
	*/
	public void set_receiverAppInterface( String value ) { _receiverAppInterface = value; }
	
	/**
	* Returns the value of the "receiverAppInterface" parameter of this interaction.
	*
	* @return the value of the "receiverAppInterface" parameter
	*/
	public String get_receiverAppInterface() { return _receiverAppInterface; }
	
	
	/**
	* Set the value of the "receiverHost" parameter to "value" for this parameter.
	*
	* @param value the new value for the "receiverHost" parameter
	*/
	public void set_receiverHost( String value ) { _receiverHost = value; }
	
	/**
	* Returns the value of the "receiverHost" parameter of this interaction.
	*
	* @return the value of the "receiverHost" parameter
	*/
	public String get_receiverHost() { return _receiverHost; }
	
	
	/**
	* Set the value of the "receiverHostApp" parameter to "value" for this parameter.
	*
	* @param value the new value for the "receiverHostApp" parameter
	*/
	public void set_receiverHostApp( String value ) { _receiverHostApp = value; }
	
	/**
	* Returns the value of the "receiverHostApp" parameter of this interaction.
	*
	* @return the value of the "receiverHostApp" parameter
	*/
	public String get_receiverHostApp() { return _receiverHostApp; }
	
	
	/**
	* Set the value of the "senderAppIndex" parameter to "value" for this parameter.
	*
	* @param value the new value for the "senderAppIndex" parameter
	*/
	public void set_senderAppIndex( int value ) { _senderAppIndex = value; }
	
	/**
	* Returns the value of the "senderAppIndex" parameter of this interaction.
	*
	* @return the value of the "senderAppIndex" parameter
	*/
	public int get_senderAppIndex() { return _senderAppIndex; }
	
	
	/**
	* Set the value of the "senderHost" parameter to "value" for this parameter.
	*
	* @param value the new value for the "senderHost" parameter
	*/
	public void set_senderHost( String value ) { _senderHost = value; }
	
	/**
	* Returns the value of the "senderHost" parameter of this interaction.
	*
	* @return the value of the "senderHost" parameter
	*/
	public String get_senderHost() { return _senderHost; }
	
	
	/**
	* Set the value of the "senderHostApp" parameter to "value" for this parameter.
	*
	* @param value the new value for the "senderHostApp" parameter
	*/
	public void set_senderHostApp( String value ) { _senderHostApp = value; }
	
	/**
	* Returns the value of the "senderHostApp" parameter of this interaction.
	*
	* @return the value of the "senderHostApp" parameter
	*/
	public String get_senderHostApp() { return _senderHostApp; }
	


	protected NetworkPacket( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected NetworkPacket( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the NetworkPacket interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new NetworkPacket interaction class instance
	*/
	public NetworkPacket( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #NetworkPacket( ReceivedInteraction datamemberMap )}, except this
	* new NetworkPacket interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new NetworkPacket interaction class instance
	* @param logicalTime timestamp for this new NetworkPacket interaction class
	* instance
	*/
	public NetworkPacket( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new NetworkPacket interaction class instance that is a duplicate
	* of the instance referred to by NetworkPacket_var.
	*
	* @param NetworkPacket_var NetworkPacket interaction class instance of which
	* this newly created NetworkPacket interaction class instance will be a
	* duplicate
	*/
	public NetworkPacket( NetworkPacket NetworkPacket_var ) {
		super( NetworkPacket_var );
		
		
		set_data( NetworkPacket_var.get_data() );
		set_numBytes( NetworkPacket_var.get_numBytes() );
		set_packetType( NetworkPacket_var.get_packetType() );
		set_receiverAppIndex( NetworkPacket_var.get_receiverAppIndex() );
		set_receiverAppInterface( NetworkPacket_var.get_receiverAppInterface() );
		set_receiverHost( NetworkPacket_var.get_receiverHost() );
		set_receiverHostApp( NetworkPacket_var.get_receiverHostApp() );
		set_senderAppIndex( NetworkPacket_var.get_senderAppIndex() );
		set_senderHost( NetworkPacket_var.get_senderHost() );
		set_senderHostApp( NetworkPacket_var.get_senderHostApp() );
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
		
		
		
		if (  "data".equals( datamemberName )  ) return get_data();
		else if (  "numBytes".equals( datamemberName )  ) return new Integer(get_numBytes());
		else if (  "packetType".equals( datamemberName )  ) return get_packetType();
		else if (  "receiverAppIndex".equals( datamemberName )  ) return new Integer(get_receiverAppIndex());
		else if (  "receiverAppInterface".equals( datamemberName )  ) return get_receiverAppInterface();
		else if (  "receiverHost".equals( datamemberName )  ) return get_receiverHost();
		else if (  "receiverHostApp".equals( datamemberName )  ) return get_receiverHostApp();
		else if (  "senderAppIndex".equals( datamemberName )  ) return new Integer(get_senderAppIndex());
		else if (  "senderHost".equals( datamemberName )  ) return get_senderHost();
		else if (  "senderHostApp".equals( datamemberName )  ) return get_senderHostApp();
		else return super.getParameter( datamemberName );
	}
	
	/**
	* Returns the value of the parameter whose handle (RTI assigned)
	* is "datamemberHandle" for this interaction.
	*
	* @param datamemberHandle handle (RTI assigned) of parameter whose
	* value is to be returned
	* @return value of the parameter whose handle (RTI assigned) is
	* "datamemberHandle" for this interaction
	*/
	public Object getParameter( int datamemberHandle ) {
		
				
		
		if ( get_data_handle() == datamemberHandle ) return get_data();
		else if ( get_numBytes_handle() == datamemberHandle ) return new Integer(get_numBytes());
		else if ( get_packetType_handle() == datamemberHandle ) return get_packetType();
		else if ( get_receiverAppIndex_handle() == datamemberHandle ) return new Integer(get_receiverAppIndex());
		else if ( get_receiverAppInterface_handle() == datamemberHandle ) return get_receiverAppInterface();
		else if ( get_receiverHost_handle() == datamemberHandle ) return get_receiverHost();
		else if ( get_receiverHostApp_handle() == datamemberHandle ) return get_receiverHostApp();
		else if ( get_senderAppIndex_handle() == datamemberHandle ) return new Integer(get_senderAppIndex());
		else if ( get_senderHost_handle() == datamemberHandle ) return get_senderHost();
		else if ( get_senderHostApp_handle() == datamemberHandle ) return get_senderHostApp();
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_data_handle() ) set_data( val );
		else if ( param_handle == get_numBytes_handle() ) set_numBytes( Integer.parseInt(val) );
		else if ( param_handle == get_packetType_handle() ) set_packetType( val );
		else if ( param_handle == get_receiverAppIndex_handle() ) set_receiverAppIndex( Integer.parseInt(val) );
		else if ( param_handle == get_receiverAppInterface_handle() ) set_receiverAppInterface( val );
		else if ( param_handle == get_receiverHost_handle() ) set_receiverHost( val );
		else if ( param_handle == get_receiverHostApp_handle() ) set_receiverHostApp( val );
		else if ( param_handle == get_senderAppIndex_handle() ) set_senderAppIndex( Integer.parseInt(val) );
		else if ( param_handle == get_senderHost_handle() ) set_senderHost( val );
		else if ( param_handle == get_senderHostApp_handle() ) set_senderHostApp( val );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "data".equals( datamemberName )  ) set_data( val );
		else if (  "numBytes".equals( datamemberName )  ) set_numBytes( Integer.parseInt(val) );
		else if (  "packetType".equals( datamemberName )  ) set_packetType( val );
		else if (  "receiverAppIndex".equals( datamemberName )  ) set_receiverAppIndex( Integer.parseInt(val) );
		else if (  "receiverAppInterface".equals( datamemberName )  ) set_receiverAppInterface( val );
		else if (  "receiverHost".equals( datamemberName )  ) set_receiverHost( val );
		else if (  "receiverHostApp".equals( datamemberName )  ) set_receiverHostApp( val );
		else if (  "senderAppIndex".equals( datamemberName )  ) set_senderAppIndex( Integer.parseInt(val) );
		else if (  "senderHost".equals( datamemberName )  ) set_senderHost( val );
		else if (  "senderHostApp".equals( datamemberName )  ) set_senderHostApp( val );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "data".equals( datamemberName )  ) set_data( (String)val );
		else if (  "numBytes".equals( datamemberName )  ) set_numBytes( (Integer)val );
		else if (  "packetType".equals( datamemberName )  ) set_packetType( (String)val );
		else if (  "receiverAppIndex".equals( datamemberName )  ) set_receiverAppIndex( (Integer)val );
		else if (  "receiverAppInterface".equals( datamemberName )  ) set_receiverAppInterface( (String)val );
		else if (  "receiverHost".equals( datamemberName )  ) set_receiverHost( (String)val );
		else if (  "receiverHostApp".equals( datamemberName )  ) set_receiverHostApp( (String)val );
		else if (  "senderAppIndex".equals( datamemberName )  ) set_senderAppIndex( (Integer)val );
		else if (  "senderHost".equals( datamemberName )  ) set_senderHost( (String)val );
		else if (  "senderHostApp".equals( datamemberName )  ) set_senderHostApp( (String)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_data_handle(), get_data().getBytes() );
		
			datamembers.add( get_numBytes_handle(), Integer.toString(get_numBytes()).getBytes() );
		
			datamembers.add( get_packetType_handle(), get_packetType().getBytes() );
		
			datamembers.add( get_receiverAppIndex_handle(), Integer.toString(get_receiverAppIndex()).getBytes() );
		
			datamembers.add( get_receiverAppInterface_handle(), get_receiverAppInterface().getBytes() );
		
			datamembers.add( get_receiverHost_handle(), get_receiverHost().getBytes() );
		
			datamembers.add( get_receiverHostApp_handle(), get_receiverHostApp().getBytes() );
		
			datamembers.add( get_senderAppIndex_handle(), Integer.toString(get_senderAppIndex()).getBytes() );
		
			datamembers.add( get_senderHost_handle(), get_senderHost().getBytes() );
		
			datamembers.add( get_senderHostApp_handle(), get_senderHostApp().getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof NetworkPacket ) {
			NetworkPacket data = (NetworkPacket)object;
			
			
				_data = data._data;
				_numBytes = data._numBytes;
				_packetType = data._packetType;
				_receiverAppIndex = data._receiverAppIndex;
				_receiverAppInterface = data._receiverAppInterface;
				_receiverHost = data._receiverHost;
				_receiverHostApp = data._receiverHostApp;
				_senderAppIndex = data._senderAppIndex;
				_senderHost = data._senderHost;
				_senderHostApp = data._senderHostApp;
			
		}
	}
}
