
package WeatherFederate;

import java.util.HashSet;
import java.util.Set;

import hla.rti.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.cpswt.utils.CpswtUtils;


import org.cpswt.hla.*;

/**
* The TMYWeather class implements the TMYWeather interaction in the
* WeatherFederate simulation.
*/
public class TMYWeather extends C2WInteractionRoot {

	private static final Logger logger = LogManager.getLogger(TMYWeather.class);

	/**
	* Default constructor -- creates an instance of the TMYWeather interaction
	* class with default parameter values.
	*/
	public TMYWeather() { }

	
	
	private static int _aerosolOpticalDepth_handle;
	private static int _aerosolOpticalDepthSource_handle;
	private static int _aerosolOpticalDepthUncertainty_handle;
	private static int _albedo_handle;
	private static int _albedoSource_handle;
	private static int _albedoUncertainty_handle;
	private static int _ceilingHeight_handle;
	private static int _ceilingHeightSource_handle;
	private static int _ceilingHeightUncertainty_handle;
	private static int _date_handle;
	private static int _dewPointTemperature_handle;
	private static int _dewPointTemperatureSource_handle;
	private static int _dewPointTemperatureUncertainty_handle;
	private static int _diffuseHorizontalIlluminance_handle;
	private static int _diffuseHorizontalIlluminanceSource_handle;
	private static int _diffuseHorizontalIlluminanceUncertainty_handle;
	private static int _diffuseHorizontalIrradiancSource_handle;
	private static int _diffuseHorizontalIrradiancUncertainty_handle;
	private static int _diffuseHorizontalIrradiance_handle;
	private static int _directNormalIlluminance_handle;
	private static int _directNormalIlluminanceSource_handle;
	private static int _directNormalIlluminanceUncertainty_handle;
	private static int _directNormalIrradiance_handle;
	private static int _directNormalIrradianceSource_handle;
	private static int _directNormalIrradianceUncertainty_handle;
	private static int _dryBulbTemperature_handle;
	private static int _dryBulbTemperatureSource_handle;
	private static int _dryBulbTemperatureUncertainty_handle;
	private static int _elevation_handle;
	private static int _extraTerrestrialRadiation_handle;
	private static int _extraTerrestrialRadiationNormal_handle;
	private static int _globalHorizontalIlluminance_handle;
	private static int _globalHorizontalIlluminanceSource_handle;
	private static int _globalHorizontalIlluminanceUncertainty_handle;
	private static int _globalHorizontalIrradiance_handle;
	private static int _globalHorizontalIrradianceSource_handle;
	private static int _globalHorizontalIrradianceUncertainty_handle;
	private static int _horizontalVisibility_handle;
	private static int _horizontalVisibilitySource_handle;
	private static int _horizontalVisibilityUncertainty_handle;
	private static int _latitude_handle;
	private static int _liquidPrecipitationDepth_handle;
	private static int _liquidPrecipitationDepthSource_handle;
	private static int _liquidPrecipitationDepthUncertainty_handle;
	private static int _liquidPrecipitationQuantity_handle;
	private static int _longitude_handle;
	private static int _opaqueSkyCover_handle;
	private static int _opaqueSkyCoverSource_handle;
	private static int _opaqueSkyCoverUncertainty_handle;
	private static int _precipitableWater_handle;
	private static int _precipitableWaterSource_handle;
	private static int _precipitableWaterUncertainty_handle;
	private static int _presentWeather_handle;
	private static int _presentWeatherSource_handle;
	private static int _presentWeatherUncertainty_handle;
	private static int _pressure_handle;
	private static int _pressureSource_handle;
	private static int _pressureUncertainty_handle;
	private static int _relativeHumidity_handle;
	private static int _relativeHumiditySource_handle;
	private static int _relativeHumidityUncertainty_handle;
	private static int _stationIDCode_handle;
	private static int _stationName_handle;
	private static int _stationState_handle;
	private static int _time_handle;
	private static int _timeZone_handle;
	private static int _totalSkyCover_handle;
	private static int _totalSkyCoverSource_handle;
	private static int _totalSkyCoverUncertainty_handle;
	private static int _windDirection_handle;
	private static int _windDirectionSource_handle;
	private static int _windDirectionUncertainty_handle;
	private static int _windSpeed_handle;
	private static int _windSpeedSource_handle;
	private static int _windSpeedUncertainty_handle;
	private static int _zenithLuminance_handle;
	private static int _zenithLuminanceSource_handle;
	private static int _zenithLuminanceUncertianty_handle;
	
	
	/**
	* Returns the handle (RTI assigned) of the "aerosolOpticalDepth" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "aerosolOpticalDepth" parameter
	*/
	public static int get_aerosolOpticalDepth_handle() { return _aerosolOpticalDepth_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "aerosolOpticalDepthSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "aerosolOpticalDepthSource" parameter
	*/
	public static int get_aerosolOpticalDepthSource_handle() { return _aerosolOpticalDepthSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "aerosolOpticalDepthUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "aerosolOpticalDepthUncertainty" parameter
	*/
	public static int get_aerosolOpticalDepthUncertainty_handle() { return _aerosolOpticalDepthUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "albedo" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "albedo" parameter
	*/
	public static int get_albedo_handle() { return _albedo_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "albedoSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "albedoSource" parameter
	*/
	public static int get_albedoSource_handle() { return _albedoSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "albedoUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "albedoUncertainty" parameter
	*/
	public static int get_albedoUncertainty_handle() { return _albedoUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ceilingHeight" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ceilingHeight" parameter
	*/
	public static int get_ceilingHeight_handle() { return _ceilingHeight_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ceilingHeightSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ceilingHeightSource" parameter
	*/
	public static int get_ceilingHeightSource_handle() { return _ceilingHeightSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "ceilingHeightUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "ceilingHeightUncertainty" parameter
	*/
	public static int get_ceilingHeightUncertainty_handle() { return _ceilingHeightUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "date" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "date" parameter
	*/
	public static int get_date_handle() { return _date_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dewPointTemperature" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dewPointTemperature" parameter
	*/
	public static int get_dewPointTemperature_handle() { return _dewPointTemperature_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dewPointTemperatureSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dewPointTemperatureSource" parameter
	*/
	public static int get_dewPointTemperatureSource_handle() { return _dewPointTemperatureSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dewPointTemperatureUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dewPointTemperatureUncertainty" parameter
	*/
	public static int get_dewPointTemperatureUncertainty_handle() { return _dewPointTemperatureUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIlluminance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIlluminance" parameter
	*/
	public static int get_diffuseHorizontalIlluminance_handle() { return _diffuseHorizontalIlluminance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIlluminanceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIlluminanceSource" parameter
	*/
	public static int get_diffuseHorizontalIlluminanceSource_handle() { return _diffuseHorizontalIlluminanceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIlluminanceUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIlluminanceUncertainty" parameter
	*/
	public static int get_diffuseHorizontalIlluminanceUncertainty_handle() { return _diffuseHorizontalIlluminanceUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIrradiancSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIrradiancSource" parameter
	*/
	public static int get_diffuseHorizontalIrradiancSource_handle() { return _diffuseHorizontalIrradiancSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIrradiancUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIrradiancUncertainty" parameter
	*/
	public static int get_diffuseHorizontalIrradiancUncertainty_handle() { return _diffuseHorizontalIrradiancUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "diffuseHorizontalIrradiance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "diffuseHorizontalIrradiance" parameter
	*/
	public static int get_diffuseHorizontalIrradiance_handle() { return _diffuseHorizontalIrradiance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIlluminance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIlluminance" parameter
	*/
	public static int get_directNormalIlluminance_handle() { return _directNormalIlluminance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIlluminanceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIlluminanceSource" parameter
	*/
	public static int get_directNormalIlluminanceSource_handle() { return _directNormalIlluminanceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIlluminanceUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIlluminanceUncertainty" parameter
	*/
	public static int get_directNormalIlluminanceUncertainty_handle() { return _directNormalIlluminanceUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIrradiance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIrradiance" parameter
	*/
	public static int get_directNormalIrradiance_handle() { return _directNormalIrradiance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIrradianceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIrradianceSource" parameter
	*/
	public static int get_directNormalIrradianceSource_handle() { return _directNormalIrradianceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "directNormalIrradianceUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "directNormalIrradianceUncertainty" parameter
	*/
	public static int get_directNormalIrradianceUncertainty_handle() { return _directNormalIrradianceUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dryBulbTemperature" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dryBulbTemperature" parameter
	*/
	public static int get_dryBulbTemperature_handle() { return _dryBulbTemperature_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dryBulbTemperatureSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dryBulbTemperatureSource" parameter
	*/
	public static int get_dryBulbTemperatureSource_handle() { return _dryBulbTemperatureSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "dryBulbTemperatureUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "dryBulbTemperatureUncertainty" parameter
	*/
	public static int get_dryBulbTemperatureUncertainty_handle() { return _dryBulbTemperatureUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "elevation" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "elevation" parameter
	*/
	public static int get_elevation_handle() { return _elevation_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "extraTerrestrialRadiation" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "extraTerrestrialRadiation" parameter
	*/
	public static int get_extraTerrestrialRadiation_handle() { return _extraTerrestrialRadiation_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "extraTerrestrialRadiationNormal" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "extraTerrestrialRadiationNormal" parameter
	*/
	public static int get_extraTerrestrialRadiationNormal_handle() { return _extraTerrestrialRadiationNormal_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIlluminance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIlluminance" parameter
	*/
	public static int get_globalHorizontalIlluminance_handle() { return _globalHorizontalIlluminance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIlluminanceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIlluminanceSource" parameter
	*/
	public static int get_globalHorizontalIlluminanceSource_handle() { return _globalHorizontalIlluminanceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIlluminanceUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIlluminanceUncertainty" parameter
	*/
	public static int get_globalHorizontalIlluminanceUncertainty_handle() { return _globalHorizontalIlluminanceUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIrradiance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIrradiance" parameter
	*/
	public static int get_globalHorizontalIrradiance_handle() { return _globalHorizontalIrradiance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIrradianceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIrradianceSource" parameter
	*/
	public static int get_globalHorizontalIrradianceSource_handle() { return _globalHorizontalIrradianceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "globalHorizontalIrradianceUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "globalHorizontalIrradianceUncertainty" parameter
	*/
	public static int get_globalHorizontalIrradianceUncertainty_handle() { return _globalHorizontalIrradianceUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "horizontalVisibility" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "horizontalVisibility" parameter
	*/
	public static int get_horizontalVisibility_handle() { return _horizontalVisibility_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "horizontalVisibilitySource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "horizontalVisibilitySource" parameter
	*/
	public static int get_horizontalVisibilitySource_handle() { return _horizontalVisibilitySource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "horizontalVisibilityUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "horizontalVisibilityUncertainty" parameter
	*/
	public static int get_horizontalVisibilityUncertainty_handle() { return _horizontalVisibilityUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "latitude" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "latitude" parameter
	*/
	public static int get_latitude_handle() { return _latitude_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "liquidPrecipitationDepth" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "liquidPrecipitationDepth" parameter
	*/
	public static int get_liquidPrecipitationDepth_handle() { return _liquidPrecipitationDepth_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "liquidPrecipitationDepthSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "liquidPrecipitationDepthSource" parameter
	*/
	public static int get_liquidPrecipitationDepthSource_handle() { return _liquidPrecipitationDepthSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "liquidPrecipitationDepthUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "liquidPrecipitationDepthUncertainty" parameter
	*/
	public static int get_liquidPrecipitationDepthUncertainty_handle() { return _liquidPrecipitationDepthUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "liquidPrecipitationQuantity" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "liquidPrecipitationQuantity" parameter
	*/
	public static int get_liquidPrecipitationQuantity_handle() { return _liquidPrecipitationQuantity_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "longitude" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "longitude" parameter
	*/
	public static int get_longitude_handle() { return _longitude_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "opaqueSkyCover" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "opaqueSkyCover" parameter
	*/
	public static int get_opaqueSkyCover_handle() { return _opaqueSkyCover_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "opaqueSkyCoverSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "opaqueSkyCoverSource" parameter
	*/
	public static int get_opaqueSkyCoverSource_handle() { return _opaqueSkyCoverSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "opaqueSkyCoverUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "opaqueSkyCoverUncertainty" parameter
	*/
	public static int get_opaqueSkyCoverUncertainty_handle() { return _opaqueSkyCoverUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "precipitableWater" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "precipitableWater" parameter
	*/
	public static int get_precipitableWater_handle() { return _precipitableWater_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "precipitableWaterSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "precipitableWaterSource" parameter
	*/
	public static int get_precipitableWaterSource_handle() { return _precipitableWaterSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "precipitableWaterUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "precipitableWaterUncertainty" parameter
	*/
	public static int get_precipitableWaterUncertainty_handle() { return _precipitableWaterUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "presentWeather" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "presentWeather" parameter
	*/
	public static int get_presentWeather_handle() { return _presentWeather_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "presentWeatherSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "presentWeatherSource" parameter
	*/
	public static int get_presentWeatherSource_handle() { return _presentWeatherSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "presentWeatherUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "presentWeatherUncertainty" parameter
	*/
	public static int get_presentWeatherUncertainty_handle() { return _presentWeatherUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "pressure" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "pressure" parameter
	*/
	public static int get_pressure_handle() { return _pressure_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "pressureSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "pressureSource" parameter
	*/
	public static int get_pressureSource_handle() { return _pressureSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "pressureUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "pressureUncertainty" parameter
	*/
	public static int get_pressureUncertainty_handle() { return _pressureUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "relativeHumidity" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "relativeHumidity" parameter
	*/
	public static int get_relativeHumidity_handle() { return _relativeHumidity_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "relativeHumiditySource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "relativeHumiditySource" parameter
	*/
	public static int get_relativeHumiditySource_handle() { return _relativeHumiditySource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "relativeHumidityUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "relativeHumidityUncertainty" parameter
	*/
	public static int get_relativeHumidityUncertainty_handle() { return _relativeHumidityUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stationIDCode" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "stationIDCode" parameter
	*/
	public static int get_stationIDCode_handle() { return _stationIDCode_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stationName" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "stationName" parameter
	*/
	public static int get_stationName_handle() { return _stationName_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "stationState" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "stationState" parameter
	*/
	public static int get_stationState_handle() { return _stationState_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "time" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "time" parameter
	*/
	public static int get_time_handle() { return _time_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "timeZone" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "timeZone" parameter
	*/
	public static int get_timeZone_handle() { return _timeZone_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "totalSkyCover" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "totalSkyCover" parameter
	*/
	public static int get_totalSkyCover_handle() { return _totalSkyCover_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "totalSkyCoverSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "totalSkyCoverSource" parameter
	*/
	public static int get_totalSkyCoverSource_handle() { return _totalSkyCoverSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "totalSkyCoverUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "totalSkyCoverUncertainty" parameter
	*/
	public static int get_totalSkyCoverUncertainty_handle() { return _totalSkyCoverUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windDirection" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windDirection" parameter
	*/
	public static int get_windDirection_handle() { return _windDirection_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windDirectionSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windDirectionSource" parameter
	*/
	public static int get_windDirectionSource_handle() { return _windDirectionSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windDirectionUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windDirectionUncertainty" parameter
	*/
	public static int get_windDirectionUncertainty_handle() { return _windDirectionUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windSpeed" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windSpeed" parameter
	*/
	public static int get_windSpeed_handle() { return _windSpeed_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windSpeedSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windSpeedSource" parameter
	*/
	public static int get_windSpeedSource_handle() { return _windSpeedSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "windSpeedUncertainty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "windSpeedUncertainty" parameter
	*/
	public static int get_windSpeedUncertainty_handle() { return _windSpeedUncertainty_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "zenithLuminance" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "zenithLuminance" parameter
	*/
	public static int get_zenithLuminance_handle() { return _zenithLuminance_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "zenithLuminanceSource" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "zenithLuminanceSource" parameter
	*/
	public static int get_zenithLuminanceSource_handle() { return _zenithLuminanceSource_handle; }
	
	/**
	* Returns the handle (RTI assigned) of the "zenithLuminanceUncertianty" parameter of
	* its containing interaction class.
	*
	* @return the handle (RTI assigned) of the "zenithLuminanceUncertianty" parameter
	*/
	public static int get_zenithLuminanceUncertianty_handle() { return _zenithLuminanceUncertianty_handle; }
	
	
	
	private static boolean _isInitialized = false;

	private static int _handle;

	/**
	* Returns the handle (RTI assigned) of the TMYWeather interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the handle of the class pertaining to the reference,\
	* rather than the handle of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassHandle()}.
	*/
	public static int get_handle() { return _handle; }

	/**
	* Returns the fully-qualified (dot-delimited) name of the TMYWeather
	* interaction class.
	* Note: As this is a static method, it is NOT polymorphic, and so, if called on
	* a reference will return the name of the class pertaining to the reference,\
	* rather than the name of the class for the instance referred to by the reference.
	* For the polymorphic version of this method, use {@link #getClassName()}.
	*/
	public static String get_class_name() { return "InteractionRoot.C2WInteractionRoot.TMYWeather"; }

	/**
	* Returns the simple name (the last name in the dot-delimited fully-qualified
	* class name) of the TMYWeather interaction class.
	*/
	public static String get_simple_class_name() { return "TMYWeather"; }

	private static Set< String > _datamemberNames = new HashSet< String >();
	private static Set< String > _allDatamemberNames = new HashSet< String >();

	/**
	* Returns a set containing the names of all of the non-hidden parameters in the
	* TMYWeather interaction class.
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
	* TMYWeather interaction class.
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
		_classNameSet.add("InteractionRoot.C2WInteractionRoot.TMYWeather");
		_classNameClassMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather", TMYWeather.class);
		
		_datamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather", _datamemberNames);
		_allDatamemberClassNameSetMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather", _allDatamemberNames);

		
		
		
		_datamemberNames.add("aerosolOpticalDepth");
		_datamemberNames.add("aerosolOpticalDepthSource");
		_datamemberNames.add("aerosolOpticalDepthUncertainty");
		_datamemberNames.add("albedo");
		_datamemberNames.add("albedoSource");
		_datamemberNames.add("albedoUncertainty");
		_datamemberNames.add("ceilingHeight");
		_datamemberNames.add("ceilingHeightSource");
		_datamemberNames.add("ceilingHeightUncertainty");
		_datamemberNames.add("date");
		_datamemberNames.add("dewPointTemperature");
		_datamemberNames.add("dewPointTemperatureSource");
		_datamemberNames.add("dewPointTemperatureUncertainty");
		_datamemberNames.add("diffuseHorizontalIlluminance");
		_datamemberNames.add("diffuseHorizontalIlluminanceSource");
		_datamemberNames.add("diffuseHorizontalIlluminanceUncertainty");
		_datamemberNames.add("diffuseHorizontalIrradiancSource");
		_datamemberNames.add("diffuseHorizontalIrradiancUncertainty");
		_datamemberNames.add("diffuseHorizontalIrradiance");
		_datamemberNames.add("directNormalIlluminance");
		_datamemberNames.add("directNormalIlluminanceSource");
		_datamemberNames.add("directNormalIlluminanceUncertainty");
		_datamemberNames.add("directNormalIrradiance");
		_datamemberNames.add("directNormalIrradianceSource");
		_datamemberNames.add("directNormalIrradianceUncertainty");
		_datamemberNames.add("dryBulbTemperature");
		_datamemberNames.add("dryBulbTemperatureSource");
		_datamemberNames.add("dryBulbTemperatureUncertainty");
		_datamemberNames.add("elevation");
		_datamemberNames.add("extraTerrestrialRadiation");
		_datamemberNames.add("extraTerrestrialRadiationNormal");
		
		_datamemberNames.add("globalHorizontalIlluminance");
		_datamemberNames.add("globalHorizontalIlluminanceSource");
		_datamemberNames.add("globalHorizontalIlluminanceUncertainty");
		_datamemberNames.add("globalHorizontalIrradiance");
		_datamemberNames.add("globalHorizontalIrradianceSource");
		_datamemberNames.add("globalHorizontalIrradianceUncertainty");
		_datamemberNames.add("horizontalVisibility");
		_datamemberNames.add("horizontalVisibilitySource");
		_datamemberNames.add("horizontalVisibilityUncertainty");
		_datamemberNames.add("latitude");
		_datamemberNames.add("liquidPrecipitationDepth");
		_datamemberNames.add("liquidPrecipitationDepthSource");
		_datamemberNames.add("liquidPrecipitationDepthUncertainty");
		_datamemberNames.add("liquidPrecipitationQuantity");
		_datamemberNames.add("longitude");
		_datamemberNames.add("opaqueSkyCover");
		_datamemberNames.add("opaqueSkyCoverSource");
		_datamemberNames.add("opaqueSkyCoverUncertainty");
		
		_datamemberNames.add("precipitableWater");
		_datamemberNames.add("precipitableWaterSource");
		_datamemberNames.add("precipitableWaterUncertainty");
		_datamemberNames.add("presentWeather");
		_datamemberNames.add("presentWeatherSource");
		_datamemberNames.add("presentWeatherUncertainty");
		_datamemberNames.add("pressure");
		_datamemberNames.add("pressureSource");
		_datamemberNames.add("pressureUncertainty");
		_datamemberNames.add("relativeHumidity");
		_datamemberNames.add("relativeHumiditySource");
		_datamemberNames.add("relativeHumidityUncertainty");
		
		_datamemberNames.add("stationIDCode");
		_datamemberNames.add("stationName");
		_datamemberNames.add("stationState");
		_datamemberNames.add("time");
		_datamemberNames.add("timeZone");
		_datamemberNames.add("totalSkyCover");
		_datamemberNames.add("totalSkyCoverSource");
		_datamemberNames.add("totalSkyCoverUncertainty");
		_datamemberNames.add("windDirection");
		_datamemberNames.add("windDirectionSource");
		_datamemberNames.add("windDirectionUncertainty");
		_datamemberNames.add("windSpeed");
		_datamemberNames.add("windSpeedSource");
		_datamemberNames.add("windSpeedUncertainty");
		_datamemberNames.add("zenithLuminance");
		_datamemberNames.add("zenithLuminanceSource");
		_datamemberNames.add("zenithLuminanceUncertianty");
		
		
		_allDatamemberNames.add("actualLogicalGenerationTime");
		_allDatamemberNames.add("aerosolOpticalDepth");
		_allDatamemberNames.add("aerosolOpticalDepthSource");
		_allDatamemberNames.add("aerosolOpticalDepthUncertainty");
		_allDatamemberNames.add("albedo");
		_allDatamemberNames.add("albedoSource");
		_allDatamemberNames.add("albedoUncertainty");
		_allDatamemberNames.add("ceilingHeight");
		_allDatamemberNames.add("ceilingHeightSource");
		_allDatamemberNames.add("ceilingHeightUncertainty");
		_allDatamemberNames.add("date");
		_allDatamemberNames.add("dewPointTemperature");
		_allDatamemberNames.add("dewPointTemperatureSource");
		_allDatamemberNames.add("dewPointTemperatureUncertainty");
		_allDatamemberNames.add("diffuseHorizontalIlluminance");
		_allDatamemberNames.add("diffuseHorizontalIlluminanceSource");
		_allDatamemberNames.add("diffuseHorizontalIlluminanceUncertainty");
		_allDatamemberNames.add("diffuseHorizontalIrradiancSource");
		_allDatamemberNames.add("diffuseHorizontalIrradiancUncertainty");
		_allDatamemberNames.add("diffuseHorizontalIrradiance");
		_allDatamemberNames.add("directNormalIlluminance");
		_allDatamemberNames.add("directNormalIlluminanceSource");
		_allDatamemberNames.add("directNormalIlluminanceUncertainty");
		_allDatamemberNames.add("directNormalIrradiance");
		_allDatamemberNames.add("directNormalIrradianceSource");
		_allDatamemberNames.add("directNormalIrradianceUncertainty");
		_allDatamemberNames.add("dryBulbTemperature");
		_allDatamemberNames.add("dryBulbTemperatureSource");
		_allDatamemberNames.add("dryBulbTemperatureUncertainty");
		_allDatamemberNames.add("elevation");
		_allDatamemberNames.add("extraTerrestrialRadiation");
		_allDatamemberNames.add("extraTerrestrialRadiationNormal");
		_allDatamemberNames.add("federateFilter");
		_allDatamemberNames.add("globalHorizontalIlluminance");
		_allDatamemberNames.add("globalHorizontalIlluminanceSource");
		_allDatamemberNames.add("globalHorizontalIlluminanceUncertainty");
		_allDatamemberNames.add("globalHorizontalIrradiance");
		_allDatamemberNames.add("globalHorizontalIrradianceSource");
		_allDatamemberNames.add("globalHorizontalIrradianceUncertainty");
		_allDatamemberNames.add("horizontalVisibility");
		_allDatamemberNames.add("horizontalVisibilitySource");
		_allDatamemberNames.add("horizontalVisibilityUncertainty");
		_allDatamemberNames.add("latitude");
		_allDatamemberNames.add("liquidPrecipitationDepth");
		_allDatamemberNames.add("liquidPrecipitationDepthSource");
		_allDatamemberNames.add("liquidPrecipitationDepthUncertainty");
		_allDatamemberNames.add("liquidPrecipitationQuantity");
		_allDatamemberNames.add("longitude");
		_allDatamemberNames.add("opaqueSkyCover");
		_allDatamemberNames.add("opaqueSkyCoverSource");
		_allDatamemberNames.add("opaqueSkyCoverUncertainty");
		_allDatamemberNames.add("originFed");
		_allDatamemberNames.add("precipitableWater");
		_allDatamemberNames.add("precipitableWaterSource");
		_allDatamemberNames.add("precipitableWaterUncertainty");
		_allDatamemberNames.add("presentWeather");
		_allDatamemberNames.add("presentWeatherSource");
		_allDatamemberNames.add("presentWeatherUncertainty");
		_allDatamemberNames.add("pressure");
		_allDatamemberNames.add("pressureSource");
		_allDatamemberNames.add("pressureUncertainty");
		_allDatamemberNames.add("relativeHumidity");
		_allDatamemberNames.add("relativeHumiditySource");
		_allDatamemberNames.add("relativeHumidityUncertainty");
		_allDatamemberNames.add("sourceFed");
		_allDatamemberNames.add("stationIDCode");
		_allDatamemberNames.add("stationName");
		_allDatamemberNames.add("stationState");
		_allDatamemberNames.add("time");
		_allDatamemberNames.add("timeZone");
		_allDatamemberNames.add("totalSkyCover");
		_allDatamemberNames.add("totalSkyCoverSource");
		_allDatamemberNames.add("totalSkyCoverUncertainty");
		_allDatamemberNames.add("windDirection");
		_allDatamemberNames.add("windDirectionSource");
		_allDatamemberNames.add("windDirectionUncertainty");
		_allDatamemberNames.add("windSpeed");
		_allDatamemberNames.add("windSpeedSource");
		_allDatamemberNames.add("windSpeedUncertainty");
		_allDatamemberNames.add("zenithLuminance");
		_allDatamemberNames.add("zenithLuminanceSource");
		_allDatamemberNames.add("zenithLuminanceUncertianty");
		
		
		_datamemberTypeMap.put("aerosolOpticalDepth", "double");
		_datamemberTypeMap.put("aerosolOpticalDepthSource", "String");
		_datamemberTypeMap.put("aerosolOpticalDepthUncertainty", "double");
		_datamemberTypeMap.put("albedo", "double");
		_datamemberTypeMap.put("albedoSource", "String");
		_datamemberTypeMap.put("albedoUncertainty", "double");
		_datamemberTypeMap.put("ceilingHeight", "double");
		_datamemberTypeMap.put("ceilingHeightSource", "String");
		_datamemberTypeMap.put("ceilingHeightUncertainty", "double");
		_datamemberTypeMap.put("date", "String");
		_datamemberTypeMap.put("dewPointTemperature", "double");
		_datamemberTypeMap.put("dewPointTemperatureSource", "String");
		_datamemberTypeMap.put("dewPointTemperatureUncertainty", "double");
		_datamemberTypeMap.put("diffuseHorizontalIlluminance", "double");
		_datamemberTypeMap.put("diffuseHorizontalIlluminanceSource", "String");
		_datamemberTypeMap.put("diffuseHorizontalIlluminanceUncertainty", "double");
		_datamemberTypeMap.put("diffuseHorizontalIrradiancSource", "String");
		_datamemberTypeMap.put("diffuseHorizontalIrradiancUncertainty", "double");
		_datamemberTypeMap.put("diffuseHorizontalIrradiance", "double");
		_datamemberTypeMap.put("directNormalIlluminance", "double");
		_datamemberTypeMap.put("directNormalIlluminanceSource", "String");
		_datamemberTypeMap.put("directNormalIlluminanceUncertainty", "double");
		_datamemberTypeMap.put("directNormalIrradiance", "double");
		_datamemberTypeMap.put("directNormalIrradianceSource", "String");
		_datamemberTypeMap.put("directNormalIrradianceUncertainty", "double");
		_datamemberTypeMap.put("dryBulbTemperature", "double");
		_datamemberTypeMap.put("dryBulbTemperatureSource", "String");
		_datamemberTypeMap.put("dryBulbTemperatureUncertainty", "double");
		_datamemberTypeMap.put("elevation", "double");
		_datamemberTypeMap.put("extraTerrestrialRadiation", "double");
		_datamemberTypeMap.put("extraTerrestrialRadiationNormal", "double");
		_datamemberTypeMap.put("globalHorizontalIlluminance", "double");
		_datamemberTypeMap.put("globalHorizontalIlluminanceSource", "String");
		_datamemberTypeMap.put("globalHorizontalIlluminanceUncertainty", "double");
		_datamemberTypeMap.put("globalHorizontalIrradiance", "double");
		_datamemberTypeMap.put("globalHorizontalIrradianceSource", "String");
		_datamemberTypeMap.put("globalHorizontalIrradianceUncertainty", "double");
		_datamemberTypeMap.put("horizontalVisibility", "double");
		_datamemberTypeMap.put("horizontalVisibilitySource", "String");
		_datamemberTypeMap.put("horizontalVisibilityUncertainty", "double");
		_datamemberTypeMap.put("latitude", "double");
		_datamemberTypeMap.put("liquidPrecipitationDepth", "double");
		_datamemberTypeMap.put("liquidPrecipitationDepthSource", "String");
		_datamemberTypeMap.put("liquidPrecipitationDepthUncertainty", "double");
		_datamemberTypeMap.put("liquidPrecipitationQuantity", "double");
		_datamemberTypeMap.put("longitude", "double");
		_datamemberTypeMap.put("opaqueSkyCover", "double");
		_datamemberTypeMap.put("opaqueSkyCoverSource", "String");
		_datamemberTypeMap.put("opaqueSkyCoverUncertainty", "double");
		_datamemberTypeMap.put("precipitableWater", "double");
		_datamemberTypeMap.put("precipitableWaterSource", "String");
		_datamemberTypeMap.put("precipitableWaterUncertainty", "double");
		_datamemberTypeMap.put("presentWeather", "double");
		_datamemberTypeMap.put("presentWeatherSource", "String");
		_datamemberTypeMap.put("presentWeatherUncertainty", "double");
		_datamemberTypeMap.put("pressure", "double");
		_datamemberTypeMap.put("pressureSource", "String");
		_datamemberTypeMap.put("pressureUncertainty", "double");
		_datamemberTypeMap.put("relativeHumidity", "double");
		_datamemberTypeMap.put("relativeHumiditySource", "String");
		_datamemberTypeMap.put("relativeHumidityUncertainty", "double");
		_datamemberTypeMap.put("stationIDCode", "int");
		_datamemberTypeMap.put("stationName", "String");
		_datamemberTypeMap.put("stationState", "String");
		_datamemberTypeMap.put("time", "String");
		_datamemberTypeMap.put("timeZone", "double");
		_datamemberTypeMap.put("totalSkyCover", "double");
		_datamemberTypeMap.put("totalSkyCoverSource", "String");
		_datamemberTypeMap.put("totalSkyCoverUncertainty", "double");
		_datamemberTypeMap.put("windDirection", "double");
		_datamemberTypeMap.put("windDirectionSource", "String");
		_datamemberTypeMap.put("windDirectionUncertainty", "double");
		_datamemberTypeMap.put("windSpeed", "double");
		_datamemberTypeMap.put("windSpeedSource", "String");
		_datamemberTypeMap.put("windSpeedUncertainty", "double");
		_datamemberTypeMap.put("zenithLuminance", "double");
		_datamemberTypeMap.put("zenithLuminanceSource", "String");
		_datamemberTypeMap.put("zenithLuminanceUncertianty", "double");
	
	

	}


	private static String initErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.TMYWeather:  could not initialize:  ";
	protected static void init(RTIambassador rti) {
		if (_isInitialized) return;
		_isInitialized = true;
		
		C2WInteractionRoot.init(rti);
		
		boolean isNotInitialized = true;
		while(isNotInitialized) {
			try {
				_handle = rti.getInteractionClassHandle("InteractionRoot.C2WInteractionRoot.TMYWeather");
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

		_classNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather", get_handle());
		_classHandleNameMap.put(get_handle(), "InteractionRoot.C2WInteractionRoot.TMYWeather");
		_classHandleSimpleNameMap.put(get_handle(), "TMYWeather");

		
		isNotInitialized = true;
		while(isNotInitialized) {
			try {
							
				_aerosolOpticalDepth_handle = rti.getParameterHandle("aerosolOpticalDepth", get_handle());			
				_aerosolOpticalDepthSource_handle = rti.getParameterHandle("aerosolOpticalDepthSource", get_handle());			
				_aerosolOpticalDepthUncertainty_handle = rti.getParameterHandle("aerosolOpticalDepthUncertainty", get_handle());			
				_albedo_handle = rti.getParameterHandle("albedo", get_handle());			
				_albedoSource_handle = rti.getParameterHandle("albedoSource", get_handle());			
				_albedoUncertainty_handle = rti.getParameterHandle("albedoUncertainty", get_handle());			
				_ceilingHeight_handle = rti.getParameterHandle("ceilingHeight", get_handle());			
				_ceilingHeightSource_handle = rti.getParameterHandle("ceilingHeightSource", get_handle());			
				_ceilingHeightUncertainty_handle = rti.getParameterHandle("ceilingHeightUncertainty", get_handle());			
				_date_handle = rti.getParameterHandle("date", get_handle());			
				_dewPointTemperature_handle = rti.getParameterHandle("dewPointTemperature", get_handle());			
				_dewPointTemperatureSource_handle = rti.getParameterHandle("dewPointTemperatureSource", get_handle());			
				_dewPointTemperatureUncertainty_handle = rti.getParameterHandle("dewPointTemperatureUncertainty", get_handle());			
				_diffuseHorizontalIlluminance_handle = rti.getParameterHandle("diffuseHorizontalIlluminance", get_handle());			
				_diffuseHorizontalIlluminanceSource_handle = rti.getParameterHandle("diffuseHorizontalIlluminanceSource", get_handle());			
				_diffuseHorizontalIlluminanceUncertainty_handle = rti.getParameterHandle("diffuseHorizontalIlluminanceUncertainty", get_handle());			
				_diffuseHorizontalIrradiancSource_handle = rti.getParameterHandle("diffuseHorizontalIrradiancSource", get_handle());			
				_diffuseHorizontalIrradiancUncertainty_handle = rti.getParameterHandle("diffuseHorizontalIrradiancUncertainty", get_handle());			
				_diffuseHorizontalIrradiance_handle = rti.getParameterHandle("diffuseHorizontalIrradiance", get_handle());			
				_directNormalIlluminance_handle = rti.getParameterHandle("directNormalIlluminance", get_handle());			
				_directNormalIlluminanceSource_handle = rti.getParameterHandle("directNormalIlluminanceSource", get_handle());			
				_directNormalIlluminanceUncertainty_handle = rti.getParameterHandle("directNormalIlluminanceUncertainty", get_handle());			
				_directNormalIrradiance_handle = rti.getParameterHandle("directNormalIrradiance", get_handle());			
				_directNormalIrradianceSource_handle = rti.getParameterHandle("directNormalIrradianceSource", get_handle());			
				_directNormalIrradianceUncertainty_handle = rti.getParameterHandle("directNormalIrradianceUncertainty", get_handle());			
				_dryBulbTemperature_handle = rti.getParameterHandle("dryBulbTemperature", get_handle());			
				_dryBulbTemperatureSource_handle = rti.getParameterHandle("dryBulbTemperatureSource", get_handle());			
				_dryBulbTemperatureUncertainty_handle = rti.getParameterHandle("dryBulbTemperatureUncertainty", get_handle());			
				_elevation_handle = rti.getParameterHandle("elevation", get_handle());			
				_extraTerrestrialRadiation_handle = rti.getParameterHandle("extraTerrestrialRadiation", get_handle());			
				_extraTerrestrialRadiationNormal_handle = rti.getParameterHandle("extraTerrestrialRadiationNormal", get_handle());			
				_globalHorizontalIlluminance_handle = rti.getParameterHandle("globalHorizontalIlluminance", get_handle());			
				_globalHorizontalIlluminanceSource_handle = rti.getParameterHandle("globalHorizontalIlluminanceSource", get_handle());			
				_globalHorizontalIlluminanceUncertainty_handle = rti.getParameterHandle("globalHorizontalIlluminanceUncertainty", get_handle());			
				_globalHorizontalIrradiance_handle = rti.getParameterHandle("globalHorizontalIrradiance", get_handle());			
				_globalHorizontalIrradianceSource_handle = rti.getParameterHandle("globalHorizontalIrradianceSource", get_handle());			
				_globalHorizontalIrradianceUncertainty_handle = rti.getParameterHandle("globalHorizontalIrradianceUncertainty", get_handle());			
				_horizontalVisibility_handle = rti.getParameterHandle("horizontalVisibility", get_handle());			
				_horizontalVisibilitySource_handle = rti.getParameterHandle("horizontalVisibilitySource", get_handle());			
				_horizontalVisibilityUncertainty_handle = rti.getParameterHandle("horizontalVisibilityUncertainty", get_handle());			
				_latitude_handle = rti.getParameterHandle("latitude", get_handle());			
				_liquidPrecipitationDepth_handle = rti.getParameterHandle("liquidPrecipitationDepth", get_handle());			
				_liquidPrecipitationDepthSource_handle = rti.getParameterHandle("liquidPrecipitationDepthSource", get_handle());			
				_liquidPrecipitationDepthUncertainty_handle = rti.getParameterHandle("liquidPrecipitationDepthUncertainty", get_handle());			
				_liquidPrecipitationQuantity_handle = rti.getParameterHandle("liquidPrecipitationQuantity", get_handle());			
				_longitude_handle = rti.getParameterHandle("longitude", get_handle());			
				_opaqueSkyCover_handle = rti.getParameterHandle("opaqueSkyCover", get_handle());			
				_opaqueSkyCoverSource_handle = rti.getParameterHandle("opaqueSkyCoverSource", get_handle());			
				_opaqueSkyCoverUncertainty_handle = rti.getParameterHandle("opaqueSkyCoverUncertainty", get_handle());			
				_precipitableWater_handle = rti.getParameterHandle("precipitableWater", get_handle());			
				_precipitableWaterSource_handle = rti.getParameterHandle("precipitableWaterSource", get_handle());			
				_precipitableWaterUncertainty_handle = rti.getParameterHandle("precipitableWaterUncertainty", get_handle());			
				_presentWeather_handle = rti.getParameterHandle("presentWeather", get_handle());			
				_presentWeatherSource_handle = rti.getParameterHandle("presentWeatherSource", get_handle());			
				_presentWeatherUncertainty_handle = rti.getParameterHandle("presentWeatherUncertainty", get_handle());			
				_pressure_handle = rti.getParameterHandle("pressure", get_handle());			
				_pressureSource_handle = rti.getParameterHandle("pressureSource", get_handle());			
				_pressureUncertainty_handle = rti.getParameterHandle("pressureUncertainty", get_handle());			
				_relativeHumidity_handle = rti.getParameterHandle("relativeHumidity", get_handle());			
				_relativeHumiditySource_handle = rti.getParameterHandle("relativeHumiditySource", get_handle());			
				_relativeHumidityUncertainty_handle = rti.getParameterHandle("relativeHumidityUncertainty", get_handle());			
				_stationIDCode_handle = rti.getParameterHandle("stationIDCode", get_handle());			
				_stationName_handle = rti.getParameterHandle("stationName", get_handle());			
				_stationState_handle = rti.getParameterHandle("stationState", get_handle());			
				_time_handle = rti.getParameterHandle("time", get_handle());			
				_timeZone_handle = rti.getParameterHandle("timeZone", get_handle());			
				_totalSkyCover_handle = rti.getParameterHandle("totalSkyCover", get_handle());			
				_totalSkyCoverSource_handle = rti.getParameterHandle("totalSkyCoverSource", get_handle());			
				_totalSkyCoverUncertainty_handle = rti.getParameterHandle("totalSkyCoverUncertainty", get_handle());			
				_windDirection_handle = rti.getParameterHandle("windDirection", get_handle());			
				_windDirectionSource_handle = rti.getParameterHandle("windDirectionSource", get_handle());			
				_windDirectionUncertainty_handle = rti.getParameterHandle("windDirectionUncertainty", get_handle());			
				_windSpeed_handle = rti.getParameterHandle("windSpeed", get_handle());			
				_windSpeedSource_handle = rti.getParameterHandle("windSpeedSource", get_handle());			
				_windSpeedUncertainty_handle = rti.getParameterHandle("windSpeedUncertainty", get_handle());			
				_zenithLuminance_handle = rti.getParameterHandle("zenithLuminance", get_handle());			
				_zenithLuminanceSource_handle = rti.getParameterHandle("zenithLuminanceSource", get_handle());			
				_zenithLuminanceUncertianty_handle = rti.getParameterHandle("zenithLuminanceUncertianty", get_handle());
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
			
			
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,aerosolOpticalDepth", get_aerosolOpticalDepth_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,aerosolOpticalDepthSource", get_aerosolOpticalDepthSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,aerosolOpticalDepthUncertainty", get_aerosolOpticalDepthUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,albedo", get_albedo_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,albedoSource", get_albedoSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,albedoUncertainty", get_albedoUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,ceilingHeight", get_ceilingHeight_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,ceilingHeightSource", get_ceilingHeightSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,ceilingHeightUncertainty", get_ceilingHeightUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,date", get_date_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dewPointTemperature", get_dewPointTemperature_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dewPointTemperatureSource", get_dewPointTemperatureSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dewPointTemperatureUncertainty", get_dewPointTemperatureUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIlluminance", get_diffuseHorizontalIlluminance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIlluminanceSource", get_diffuseHorizontalIlluminanceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIlluminanceUncertainty", get_diffuseHorizontalIlluminanceUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIrradiancSource", get_diffuseHorizontalIrradiancSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIrradiancUncertainty", get_diffuseHorizontalIrradiancUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,diffuseHorizontalIrradiance", get_diffuseHorizontalIrradiance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIlluminance", get_directNormalIlluminance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIlluminanceSource", get_directNormalIlluminanceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIlluminanceUncertainty", get_directNormalIlluminanceUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIrradiance", get_directNormalIrradiance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIrradianceSource", get_directNormalIrradianceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,directNormalIrradianceUncertainty", get_directNormalIrradianceUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dryBulbTemperature", get_dryBulbTemperature_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dryBulbTemperatureSource", get_dryBulbTemperatureSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,dryBulbTemperatureUncertainty", get_dryBulbTemperatureUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,elevation", get_elevation_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,extraTerrestrialRadiation", get_extraTerrestrialRadiation_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,extraTerrestrialRadiationNormal", get_extraTerrestrialRadiationNormal_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIlluminance", get_globalHorizontalIlluminance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIlluminanceSource", get_globalHorizontalIlluminanceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIlluminanceUncertainty", get_globalHorizontalIlluminanceUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIrradiance", get_globalHorizontalIrradiance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIrradianceSource", get_globalHorizontalIrradianceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,globalHorizontalIrradianceUncertainty", get_globalHorizontalIrradianceUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,horizontalVisibility", get_horizontalVisibility_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,horizontalVisibilitySource", get_horizontalVisibilitySource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,horizontalVisibilityUncertainty", get_horizontalVisibilityUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,latitude", get_latitude_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,liquidPrecipitationDepth", get_liquidPrecipitationDepth_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,liquidPrecipitationDepthSource", get_liquidPrecipitationDepthSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,liquidPrecipitationDepthUncertainty", get_liquidPrecipitationDepthUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,liquidPrecipitationQuantity", get_liquidPrecipitationQuantity_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,longitude", get_longitude_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,opaqueSkyCover", get_opaqueSkyCover_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,opaqueSkyCoverSource", get_opaqueSkyCoverSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,opaqueSkyCoverUncertainty", get_opaqueSkyCoverUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,precipitableWater", get_precipitableWater_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,precipitableWaterSource", get_precipitableWaterSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,precipitableWaterUncertainty", get_precipitableWaterUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,presentWeather", get_presentWeather_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,presentWeatherSource", get_presentWeatherSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,presentWeatherUncertainty", get_presentWeatherUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,pressure", get_pressure_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,pressureSource", get_pressureSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,pressureUncertainty", get_pressureUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,relativeHumidity", get_relativeHumidity_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,relativeHumiditySource", get_relativeHumiditySource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,relativeHumidityUncertainty", get_relativeHumidityUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,stationIDCode", get_stationIDCode_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,stationName", get_stationName_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,stationState", get_stationState_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,time", get_time_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,timeZone", get_timeZone_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,totalSkyCover", get_totalSkyCover_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,totalSkyCoverSource", get_totalSkyCoverSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,totalSkyCoverUncertainty", get_totalSkyCoverUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windDirection", get_windDirection_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windDirectionSource", get_windDirectionSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windDirectionUncertainty", get_windDirectionUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windSpeed", get_windSpeed_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windSpeedSource", get_windSpeedSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,windSpeedUncertainty", get_windSpeedUncertainty_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,zenithLuminance", get_zenithLuminance_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,zenithLuminanceSource", get_zenithLuminanceSource_handle());
		_datamemberNameHandleMap.put("InteractionRoot.C2WInteractionRoot.TMYWeather,zenithLuminanceUncertianty", get_zenithLuminanceUncertianty_handle());
			
			
		_datamemberHandleNameMap.put(get_aerosolOpticalDepth_handle(), "aerosolOpticalDepth");
		_datamemberHandleNameMap.put(get_aerosolOpticalDepthSource_handle(), "aerosolOpticalDepthSource");
		_datamemberHandleNameMap.put(get_aerosolOpticalDepthUncertainty_handle(), "aerosolOpticalDepthUncertainty");
		_datamemberHandleNameMap.put(get_albedo_handle(), "albedo");
		_datamemberHandleNameMap.put(get_albedoSource_handle(), "albedoSource");
		_datamemberHandleNameMap.put(get_albedoUncertainty_handle(), "albedoUncertainty");
		_datamemberHandleNameMap.put(get_ceilingHeight_handle(), "ceilingHeight");
		_datamemberHandleNameMap.put(get_ceilingHeightSource_handle(), "ceilingHeightSource");
		_datamemberHandleNameMap.put(get_ceilingHeightUncertainty_handle(), "ceilingHeightUncertainty");
		_datamemberHandleNameMap.put(get_date_handle(), "date");
		_datamemberHandleNameMap.put(get_dewPointTemperature_handle(), "dewPointTemperature");
		_datamemberHandleNameMap.put(get_dewPointTemperatureSource_handle(), "dewPointTemperatureSource");
		_datamemberHandleNameMap.put(get_dewPointTemperatureUncertainty_handle(), "dewPointTemperatureUncertainty");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIlluminance_handle(), "diffuseHorizontalIlluminance");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIlluminanceSource_handle(), "diffuseHorizontalIlluminanceSource");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIlluminanceUncertainty_handle(), "diffuseHorizontalIlluminanceUncertainty");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIrradiancSource_handle(), "diffuseHorizontalIrradiancSource");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIrradiancUncertainty_handle(), "diffuseHorizontalIrradiancUncertainty");
		_datamemberHandleNameMap.put(get_diffuseHorizontalIrradiance_handle(), "diffuseHorizontalIrradiance");
		_datamemberHandleNameMap.put(get_directNormalIlluminance_handle(), "directNormalIlluminance");
		_datamemberHandleNameMap.put(get_directNormalIlluminanceSource_handle(), "directNormalIlluminanceSource");
		_datamemberHandleNameMap.put(get_directNormalIlluminanceUncertainty_handle(), "directNormalIlluminanceUncertainty");
		_datamemberHandleNameMap.put(get_directNormalIrradiance_handle(), "directNormalIrradiance");
		_datamemberHandleNameMap.put(get_directNormalIrradianceSource_handle(), "directNormalIrradianceSource");
		_datamemberHandleNameMap.put(get_directNormalIrradianceUncertainty_handle(), "directNormalIrradianceUncertainty");
		_datamemberHandleNameMap.put(get_dryBulbTemperature_handle(), "dryBulbTemperature");
		_datamemberHandleNameMap.put(get_dryBulbTemperatureSource_handle(), "dryBulbTemperatureSource");
		_datamemberHandleNameMap.put(get_dryBulbTemperatureUncertainty_handle(), "dryBulbTemperatureUncertainty");
		_datamemberHandleNameMap.put(get_elevation_handle(), "elevation");
		_datamemberHandleNameMap.put(get_extraTerrestrialRadiation_handle(), "extraTerrestrialRadiation");
		_datamemberHandleNameMap.put(get_extraTerrestrialRadiationNormal_handle(), "extraTerrestrialRadiationNormal");
		_datamemberHandleNameMap.put(get_globalHorizontalIlluminance_handle(), "globalHorizontalIlluminance");
		_datamemberHandleNameMap.put(get_globalHorizontalIlluminanceSource_handle(), "globalHorizontalIlluminanceSource");
		_datamemberHandleNameMap.put(get_globalHorizontalIlluminanceUncertainty_handle(), "globalHorizontalIlluminanceUncertainty");
		_datamemberHandleNameMap.put(get_globalHorizontalIrradiance_handle(), "globalHorizontalIrradiance");
		_datamemberHandleNameMap.put(get_globalHorizontalIrradianceSource_handle(), "globalHorizontalIrradianceSource");
		_datamemberHandleNameMap.put(get_globalHorizontalIrradianceUncertainty_handle(), "globalHorizontalIrradianceUncertainty");
		_datamemberHandleNameMap.put(get_horizontalVisibility_handle(), "horizontalVisibility");
		_datamemberHandleNameMap.put(get_horizontalVisibilitySource_handle(), "horizontalVisibilitySource");
		_datamemberHandleNameMap.put(get_horizontalVisibilityUncertainty_handle(), "horizontalVisibilityUncertainty");
		_datamemberHandleNameMap.put(get_latitude_handle(), "latitude");
		_datamemberHandleNameMap.put(get_liquidPrecipitationDepth_handle(), "liquidPrecipitationDepth");
		_datamemberHandleNameMap.put(get_liquidPrecipitationDepthSource_handle(), "liquidPrecipitationDepthSource");
		_datamemberHandleNameMap.put(get_liquidPrecipitationDepthUncertainty_handle(), "liquidPrecipitationDepthUncertainty");
		_datamemberHandleNameMap.put(get_liquidPrecipitationQuantity_handle(), "liquidPrecipitationQuantity");
		_datamemberHandleNameMap.put(get_longitude_handle(), "longitude");
		_datamemberHandleNameMap.put(get_opaqueSkyCover_handle(), "opaqueSkyCover");
		_datamemberHandleNameMap.put(get_opaqueSkyCoverSource_handle(), "opaqueSkyCoverSource");
		_datamemberHandleNameMap.put(get_opaqueSkyCoverUncertainty_handle(), "opaqueSkyCoverUncertainty");
		_datamemberHandleNameMap.put(get_precipitableWater_handle(), "precipitableWater");
		_datamemberHandleNameMap.put(get_precipitableWaterSource_handle(), "precipitableWaterSource");
		_datamemberHandleNameMap.put(get_precipitableWaterUncertainty_handle(), "precipitableWaterUncertainty");
		_datamemberHandleNameMap.put(get_presentWeather_handle(), "presentWeather");
		_datamemberHandleNameMap.put(get_presentWeatherSource_handle(), "presentWeatherSource");
		_datamemberHandleNameMap.put(get_presentWeatherUncertainty_handle(), "presentWeatherUncertainty");
		_datamemberHandleNameMap.put(get_pressure_handle(), "pressure");
		_datamemberHandleNameMap.put(get_pressureSource_handle(), "pressureSource");
		_datamemberHandleNameMap.put(get_pressureUncertainty_handle(), "pressureUncertainty");
		_datamemberHandleNameMap.put(get_relativeHumidity_handle(), "relativeHumidity");
		_datamemberHandleNameMap.put(get_relativeHumiditySource_handle(), "relativeHumiditySource");
		_datamemberHandleNameMap.put(get_relativeHumidityUncertainty_handle(), "relativeHumidityUncertainty");
		_datamemberHandleNameMap.put(get_stationIDCode_handle(), "stationIDCode");
		_datamemberHandleNameMap.put(get_stationName_handle(), "stationName");
		_datamemberHandleNameMap.put(get_stationState_handle(), "stationState");
		_datamemberHandleNameMap.put(get_time_handle(), "time");
		_datamemberHandleNameMap.put(get_timeZone_handle(), "timeZone");
		_datamemberHandleNameMap.put(get_totalSkyCover_handle(), "totalSkyCover");
		_datamemberHandleNameMap.put(get_totalSkyCoverSource_handle(), "totalSkyCoverSource");
		_datamemberHandleNameMap.put(get_totalSkyCoverUncertainty_handle(), "totalSkyCoverUncertainty");
		_datamemberHandleNameMap.put(get_windDirection_handle(), "windDirection");
		_datamemberHandleNameMap.put(get_windDirectionSource_handle(), "windDirectionSource");
		_datamemberHandleNameMap.put(get_windDirectionUncertainty_handle(), "windDirectionUncertainty");
		_datamemberHandleNameMap.put(get_windSpeed_handle(), "windSpeed");
		_datamemberHandleNameMap.put(get_windSpeedSource_handle(), "windSpeedSource");
		_datamemberHandleNameMap.put(get_windSpeedUncertainty_handle(), "windSpeedUncertainty");
		_datamemberHandleNameMap.put(get_zenithLuminance_handle(), "zenithLuminance");
		_datamemberHandleNameMap.put(get_zenithLuminanceSource_handle(), "zenithLuminanceSource");
		_datamemberHandleNameMap.put(get_zenithLuminanceUncertianty_handle(), "zenithLuminanceUncertianty");
		
	}

	private static boolean _isPublished = false;
	private static String publishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.TMYWeather:  could not publish:  ";

	/**
	* Publishes the TMYWeather interaction class for a federate.
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

	private static String unpublishErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.TMYWeather:  could not unpublish:  ";
	/**
	* Unpublishes the TMYWeather interaction class for a federate.
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
	private static String subscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.TMYWeather:  could not subscribe:  ";
	/**
	* Subscribes a federate to the TMYWeather interaction class.
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

	private static String unsubscribeErrorMessage = "Error:  InteractionRoot.C2WInteractionRoot.TMYWeather:  could not unsubscribe:  ";
	/**
	* Unsubscribes a federate from the TMYWeather interaction class.
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
	* (that is, the TMYWeather interaction class).
	*
	* @param handle handle to compare to the value of the handle (RTI assigned) of
	* this class (the TMYWeather interaction class).
	* @return "true" if "handle" matches the value of the handle of this class
	* (that is, the TMYWeather interaction class).
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
		return "TMYWeather("
			
			
			+ "aerosolOpticalDepth:" + get_aerosolOpticalDepth()
			+ "," + "aerosolOpticalDepthSource:" + get_aerosolOpticalDepthSource()
			+ "," + "aerosolOpticalDepthUncertainty:" + get_aerosolOpticalDepthUncertainty()
			+ "," + "albedo:" + get_albedo()
			+ "," + "albedoSource:" + get_albedoSource()
			+ "," + "albedoUncertainty:" + get_albedoUncertainty()
			+ "," + "ceilingHeight:" + get_ceilingHeight()
			+ "," + "ceilingHeightSource:" + get_ceilingHeightSource()
			+ "," + "ceilingHeightUncertainty:" + get_ceilingHeightUncertainty()
			+ "," + "date:" + get_date()
			+ "," + "dewPointTemperature:" + get_dewPointTemperature()
			+ "," + "dewPointTemperatureSource:" + get_dewPointTemperatureSource()
			+ "," + "dewPointTemperatureUncertainty:" + get_dewPointTemperatureUncertainty()
			+ "," + "diffuseHorizontalIlluminance:" + get_diffuseHorizontalIlluminance()
			+ "," + "diffuseHorizontalIlluminanceSource:" + get_diffuseHorizontalIlluminanceSource()
			+ "," + "diffuseHorizontalIlluminanceUncertainty:" + get_diffuseHorizontalIlluminanceUncertainty()
			+ "," + "diffuseHorizontalIrradiancSource:" + get_diffuseHorizontalIrradiancSource()
			+ "," + "diffuseHorizontalIrradiancUncertainty:" + get_diffuseHorizontalIrradiancUncertainty()
			+ "," + "diffuseHorizontalIrradiance:" + get_diffuseHorizontalIrradiance()
			+ "," + "directNormalIlluminance:" + get_directNormalIlluminance()
			+ "," + "directNormalIlluminanceSource:" + get_directNormalIlluminanceSource()
			+ "," + "directNormalIlluminanceUncertainty:" + get_directNormalIlluminanceUncertainty()
			+ "," + "directNormalIrradiance:" + get_directNormalIrradiance()
			+ "," + "directNormalIrradianceSource:" + get_directNormalIrradianceSource()
			+ "," + "directNormalIrradianceUncertainty:" + get_directNormalIrradianceUncertainty()
			+ "," + "dryBulbTemperature:" + get_dryBulbTemperature()
			+ "," + "dryBulbTemperatureSource:" + get_dryBulbTemperatureSource()
			+ "," + "dryBulbTemperatureUncertainty:" + get_dryBulbTemperatureUncertainty()
			+ "," + "elevation:" + get_elevation()
			+ "," + "extraTerrestrialRadiation:" + get_extraTerrestrialRadiation()
			+ "," + "extraTerrestrialRadiationNormal:" + get_extraTerrestrialRadiationNormal()
			+ "," + "globalHorizontalIlluminance:" + get_globalHorizontalIlluminance()
			+ "," + "globalHorizontalIlluminanceSource:" + get_globalHorizontalIlluminanceSource()
			+ "," + "globalHorizontalIlluminanceUncertainty:" + get_globalHorizontalIlluminanceUncertainty()
			+ "," + "globalHorizontalIrradiance:" + get_globalHorizontalIrradiance()
			+ "," + "globalHorizontalIrradianceSource:" + get_globalHorizontalIrradianceSource()
			+ "," + "globalHorizontalIrradianceUncertainty:" + get_globalHorizontalIrradianceUncertainty()
			+ "," + "horizontalVisibility:" + get_horizontalVisibility()
			+ "," + "horizontalVisibilitySource:" + get_horizontalVisibilitySource()
			+ "," + "horizontalVisibilityUncertainty:" + get_horizontalVisibilityUncertainty()
			+ "," + "latitude:" + get_latitude()
			+ "," + "liquidPrecipitationDepth:" + get_liquidPrecipitationDepth()
			+ "," + "liquidPrecipitationDepthSource:" + get_liquidPrecipitationDepthSource()
			+ "," + "liquidPrecipitationDepthUncertainty:" + get_liquidPrecipitationDepthUncertainty()
			+ "," + "liquidPrecipitationQuantity:" + get_liquidPrecipitationQuantity()
			+ "," + "longitude:" + get_longitude()
			+ "," + "opaqueSkyCover:" + get_opaqueSkyCover()
			+ "," + "opaqueSkyCoverSource:" + get_opaqueSkyCoverSource()
			+ "," + "opaqueSkyCoverUncertainty:" + get_opaqueSkyCoverUncertainty()
			+ "," + "precipitableWater:" + get_precipitableWater()
			+ "," + "precipitableWaterSource:" + get_precipitableWaterSource()
			+ "," + "precipitableWaterUncertainty:" + get_precipitableWaterUncertainty()
			+ "," + "presentWeather:" + get_presentWeather()
			+ "," + "presentWeatherSource:" + get_presentWeatherSource()
			+ "," + "presentWeatherUncertainty:" + get_presentWeatherUncertainty()
			+ "," + "pressure:" + get_pressure()
			+ "," + "pressureSource:" + get_pressureSource()
			+ "," + "pressureUncertainty:" + get_pressureUncertainty()
			+ "," + "relativeHumidity:" + get_relativeHumidity()
			+ "," + "relativeHumiditySource:" + get_relativeHumiditySource()
			+ "," + "relativeHumidityUncertainty:" + get_relativeHumidityUncertainty()
			+ "," + "stationIDCode:" + get_stationIDCode()
			+ "," + "stationName:" + get_stationName()
			+ "," + "stationState:" + get_stationState()
			+ "," + "time:" + get_time()
			+ "," + "timeZone:" + get_timeZone()
			+ "," + "totalSkyCover:" + get_totalSkyCover()
			+ "," + "totalSkyCoverSource:" + get_totalSkyCoverSource()
			+ "," + "totalSkyCoverUncertainty:" + get_totalSkyCoverUncertainty()
			+ "," + "windDirection:" + get_windDirection()
			+ "," + "windDirectionSource:" + get_windDirectionSource()
			+ "," + "windDirectionUncertainty:" + get_windDirectionUncertainty()
			+ "," + "windSpeed:" + get_windSpeed()
			+ "," + "windSpeedSource:" + get_windSpeedSource()
			+ "," + "windSpeedUncertainty:" + get_windSpeedUncertainty()
			+ "," + "zenithLuminance:" + get_zenithLuminance()
			+ "," + "zenithLuminanceSource:" + get_zenithLuminanceSource()
			+ "," + "zenithLuminanceUncertianty:" + get_zenithLuminanceUncertianty()
			+ ")";
	}
	



	
	
	private double _aerosolOpticalDepth = 0;
	
	private String _aerosolOpticalDepthSource = "";
	
	private double _aerosolOpticalDepthUncertainty = 0;
	
	private double _albedo = 0;
	
	private String _albedoSource = "";
	
	private double _albedoUncertainty = 0;
	
	private double _ceilingHeight = 0;
	
	private String _ceilingHeightSource = "";
	
	private double _ceilingHeightUncertainty = 0;
	
	private String _date = "";
	
	private double _dewPointTemperature = 0;
	
	private String _dewPointTemperatureSource = "";
	
	private double _dewPointTemperatureUncertainty = 0;
	
	private double _diffuseHorizontalIlluminance = 0;
	
	private String _diffuseHorizontalIlluminanceSource = "";
	
	private double _diffuseHorizontalIlluminanceUncertainty = 0;
	
	private String _diffuseHorizontalIrradiancSource = "";
	
	private double _diffuseHorizontalIrradiancUncertainty = 0;
	
	private double _diffuseHorizontalIrradiance = 0;
	
	private double _directNormalIlluminance = 0;
	
	private String _directNormalIlluminanceSource = "";
	
	private double _directNormalIlluminanceUncertainty = 0;
	
	private double _directNormalIrradiance = 0;
	
	private String _directNormalIrradianceSource = "";
	
	private double _directNormalIrradianceUncertainty = 0;
	
	private double _dryBulbTemperature = 0;
	
	private String _dryBulbTemperatureSource = "";
	
	private double _dryBulbTemperatureUncertainty = 0;
	
	private double _elevation = 0;
	
	private double _extraTerrestrialRadiation = 0;
	
	private double _extraTerrestrialRadiationNormal = 0;
	
	private double _globalHorizontalIlluminance = 0;
	
	private String _globalHorizontalIlluminanceSource = "";
	
	private double _globalHorizontalIlluminanceUncertainty = 0;
	
	private double _globalHorizontalIrradiance = 0;
	
	private String _globalHorizontalIrradianceSource = "";
	
	private double _globalHorizontalIrradianceUncertainty = 0;
	
	private double _horizontalVisibility = 0;
	
	private String _horizontalVisibilitySource = "";
	
	private double _horizontalVisibilityUncertainty = 0;
	
	private double _latitude = 0;
	
	private double _liquidPrecipitationDepth = 0;
	
	private String _liquidPrecipitationDepthSource = "";
	
	private double _liquidPrecipitationDepthUncertainty = 0;
	
	private double _liquidPrecipitationQuantity = 0;
	
	private double _longitude = 0;
	
	private double _opaqueSkyCover = 0;
	
	private String _opaqueSkyCoverSource = "";
	
	private double _opaqueSkyCoverUncertainty = 0;
	
	private double _precipitableWater = 0;
	
	private String _precipitableWaterSource = "";
	
	private double _precipitableWaterUncertainty = 0;
	
	private double _presentWeather = 0;
	
	private String _presentWeatherSource = "";
	
	private double _presentWeatherUncertainty = 0;
	
	private double _pressure = 0;
	
	private String _pressureSource = "";
	
	private double _pressureUncertainty = 0;
	
	private double _relativeHumidity = 0;
	
	private String _relativeHumiditySource = "";
	
	private double _relativeHumidityUncertainty = 0;
	
	private int _stationIDCode = 0;
	
	private String _stationName = "";
	
	private String _stationState = "";
	
	private String _time = "";
	
	private double _timeZone = 0;
	
	private double _totalSkyCover = 0;
	
	private String _totalSkyCoverSource = "";
	
	private double _totalSkyCoverUncertainty = 0;
	
	private double _windDirection = 0;
	
	private String _windDirectionSource = "";
	
	private double _windDirectionUncertainty = 0;
	
	private double _windSpeed = 0;
	
	private String _windSpeedSource = "";
	
	private double _windSpeedUncertainty = 0;
	
	private double _zenithLuminance = 0;
	
	private String _zenithLuminanceSource = "";
	
	private double _zenithLuminanceUncertianty = 0;

	
	
	/**
	* Set the value of the "aerosolOpticalDepth" parameter to "value" for this parameter.
	*
	* @param value the new value for the "aerosolOpticalDepth" parameter
	*/
	public void set_aerosolOpticalDepth( double value ) { _aerosolOpticalDepth = value; }
	
	/**
	* Returns the value of the "aerosolOpticalDepth" parameter of this interaction.
	*
	* @return the value of the "aerosolOpticalDepth" parameter
	*/
	public double get_aerosolOpticalDepth() { return _aerosolOpticalDepth; }
	
	
	/**
	* Set the value of the "aerosolOpticalDepthSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "aerosolOpticalDepthSource" parameter
	*/
	public void set_aerosolOpticalDepthSource( String value ) { _aerosolOpticalDepthSource = value; }
	
	/**
	* Returns the value of the "aerosolOpticalDepthSource" parameter of this interaction.
	*
	* @return the value of the "aerosolOpticalDepthSource" parameter
	*/
	public String get_aerosolOpticalDepthSource() { return _aerosolOpticalDepthSource; }
	
	
	/**
	* Set the value of the "aerosolOpticalDepthUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "aerosolOpticalDepthUncertainty" parameter
	*/
	public void set_aerosolOpticalDepthUncertainty( double value ) { _aerosolOpticalDepthUncertainty = value; }
	
	/**
	* Returns the value of the "aerosolOpticalDepthUncertainty" parameter of this interaction.
	*
	* @return the value of the "aerosolOpticalDepthUncertainty" parameter
	*/
	public double get_aerosolOpticalDepthUncertainty() { return _aerosolOpticalDepthUncertainty; }
	
	
	/**
	* Set the value of the "albedo" parameter to "value" for this parameter.
	*
	* @param value the new value for the "albedo" parameter
	*/
	public void set_albedo( double value ) { _albedo = value; }
	
	/**
	* Returns the value of the "albedo" parameter of this interaction.
	*
	* @return the value of the "albedo" parameter
	*/
	public double get_albedo() { return _albedo; }
	
	
	/**
	* Set the value of the "albedoSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "albedoSource" parameter
	*/
	public void set_albedoSource( String value ) { _albedoSource = value; }
	
	/**
	* Returns the value of the "albedoSource" parameter of this interaction.
	*
	* @return the value of the "albedoSource" parameter
	*/
	public String get_albedoSource() { return _albedoSource; }
	
	
	/**
	* Set the value of the "albedoUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "albedoUncertainty" parameter
	*/
	public void set_albedoUncertainty( double value ) { _albedoUncertainty = value; }
	
	/**
	* Returns the value of the "albedoUncertainty" parameter of this interaction.
	*
	* @return the value of the "albedoUncertainty" parameter
	*/
	public double get_albedoUncertainty() { return _albedoUncertainty; }
	
	
	/**
	* Set the value of the "ceilingHeight" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ceilingHeight" parameter
	*/
	public void set_ceilingHeight( double value ) { _ceilingHeight = value; }
	
	/**
	* Returns the value of the "ceilingHeight" parameter of this interaction.
	*
	* @return the value of the "ceilingHeight" parameter
	*/
	public double get_ceilingHeight() { return _ceilingHeight; }
	
	
	/**
	* Set the value of the "ceilingHeightSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ceilingHeightSource" parameter
	*/
	public void set_ceilingHeightSource( String value ) { _ceilingHeightSource = value; }
	
	/**
	* Returns the value of the "ceilingHeightSource" parameter of this interaction.
	*
	* @return the value of the "ceilingHeightSource" parameter
	*/
	public String get_ceilingHeightSource() { return _ceilingHeightSource; }
	
	
	/**
	* Set the value of the "ceilingHeightUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "ceilingHeightUncertainty" parameter
	*/
	public void set_ceilingHeightUncertainty( double value ) { _ceilingHeightUncertainty = value; }
	
	/**
	* Returns the value of the "ceilingHeightUncertainty" parameter of this interaction.
	*
	* @return the value of the "ceilingHeightUncertainty" parameter
	*/
	public double get_ceilingHeightUncertainty() { return _ceilingHeightUncertainty; }
	
	
	/**
	* Set the value of the "date" parameter to "value" for this parameter.
	*
	* @param value the new value for the "date" parameter
	*/
	public void set_date( String value ) { _date = value; }
	
	/**
	* Returns the value of the "date" parameter of this interaction.
	*
	* @return the value of the "date" parameter
	*/
	public String get_date() { return _date; }
	
	
	/**
	* Set the value of the "dewPointTemperature" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dewPointTemperature" parameter
	*/
	public void set_dewPointTemperature( double value ) { _dewPointTemperature = value; }
	
	/**
	* Returns the value of the "dewPointTemperature" parameter of this interaction.
	*
	* @return the value of the "dewPointTemperature" parameter
	*/
	public double get_dewPointTemperature() { return _dewPointTemperature; }
	
	
	/**
	* Set the value of the "dewPointTemperatureSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dewPointTemperatureSource" parameter
	*/
	public void set_dewPointTemperatureSource( String value ) { _dewPointTemperatureSource = value; }
	
	/**
	* Returns the value of the "dewPointTemperatureSource" parameter of this interaction.
	*
	* @return the value of the "dewPointTemperatureSource" parameter
	*/
	public String get_dewPointTemperatureSource() { return _dewPointTemperatureSource; }
	
	
	/**
	* Set the value of the "dewPointTemperatureUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dewPointTemperatureUncertainty" parameter
	*/
	public void set_dewPointTemperatureUncertainty( double value ) { _dewPointTemperatureUncertainty = value; }
	
	/**
	* Returns the value of the "dewPointTemperatureUncertainty" parameter of this interaction.
	*
	* @return the value of the "dewPointTemperatureUncertainty" parameter
	*/
	public double get_dewPointTemperatureUncertainty() { return _dewPointTemperatureUncertainty; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIlluminance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIlluminance" parameter
	*/
	public void set_diffuseHorizontalIlluminance( double value ) { _diffuseHorizontalIlluminance = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIlluminance" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIlluminance" parameter
	*/
	public double get_diffuseHorizontalIlluminance() { return _diffuseHorizontalIlluminance; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIlluminanceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIlluminanceSource" parameter
	*/
	public void set_diffuseHorizontalIlluminanceSource( String value ) { _diffuseHorizontalIlluminanceSource = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIlluminanceSource" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIlluminanceSource" parameter
	*/
	public String get_diffuseHorizontalIlluminanceSource() { return _diffuseHorizontalIlluminanceSource; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIlluminanceUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIlluminanceUncertainty" parameter
	*/
	public void set_diffuseHorizontalIlluminanceUncertainty( double value ) { _diffuseHorizontalIlluminanceUncertainty = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIlluminanceUncertainty" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIlluminanceUncertainty" parameter
	*/
	public double get_diffuseHorizontalIlluminanceUncertainty() { return _diffuseHorizontalIlluminanceUncertainty; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIrradiancSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIrradiancSource" parameter
	*/
	public void set_diffuseHorizontalIrradiancSource( String value ) { _diffuseHorizontalIrradiancSource = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIrradiancSource" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIrradiancSource" parameter
	*/
	public String get_diffuseHorizontalIrradiancSource() { return _diffuseHorizontalIrradiancSource; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIrradiancUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIrradiancUncertainty" parameter
	*/
	public void set_diffuseHorizontalIrradiancUncertainty( double value ) { _diffuseHorizontalIrradiancUncertainty = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIrradiancUncertainty" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIrradiancUncertainty" parameter
	*/
	public double get_diffuseHorizontalIrradiancUncertainty() { return _diffuseHorizontalIrradiancUncertainty; }
	
	
	/**
	* Set the value of the "diffuseHorizontalIrradiance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "diffuseHorizontalIrradiance" parameter
	*/
	public void set_diffuseHorizontalIrradiance( double value ) { _diffuseHorizontalIrradiance = value; }
	
	/**
	* Returns the value of the "diffuseHorizontalIrradiance" parameter of this interaction.
	*
	* @return the value of the "diffuseHorizontalIrradiance" parameter
	*/
	public double get_diffuseHorizontalIrradiance() { return _diffuseHorizontalIrradiance; }
	
	
	/**
	* Set the value of the "directNormalIlluminance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIlluminance" parameter
	*/
	public void set_directNormalIlluminance( double value ) { _directNormalIlluminance = value; }
	
	/**
	* Returns the value of the "directNormalIlluminance" parameter of this interaction.
	*
	* @return the value of the "directNormalIlluminance" parameter
	*/
	public double get_directNormalIlluminance() { return _directNormalIlluminance; }
	
	
	/**
	* Set the value of the "directNormalIlluminanceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIlluminanceSource" parameter
	*/
	public void set_directNormalIlluminanceSource( String value ) { _directNormalIlluminanceSource = value; }
	
	/**
	* Returns the value of the "directNormalIlluminanceSource" parameter of this interaction.
	*
	* @return the value of the "directNormalIlluminanceSource" parameter
	*/
	public String get_directNormalIlluminanceSource() { return _directNormalIlluminanceSource; }
	
	
	/**
	* Set the value of the "directNormalIlluminanceUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIlluminanceUncertainty" parameter
	*/
	public void set_directNormalIlluminanceUncertainty( double value ) { _directNormalIlluminanceUncertainty = value; }
	
	/**
	* Returns the value of the "directNormalIlluminanceUncertainty" parameter of this interaction.
	*
	* @return the value of the "directNormalIlluminanceUncertainty" parameter
	*/
	public double get_directNormalIlluminanceUncertainty() { return _directNormalIlluminanceUncertainty; }
	
	
	/**
	* Set the value of the "directNormalIrradiance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIrradiance" parameter
	*/
	public void set_directNormalIrradiance( double value ) { _directNormalIrradiance = value; }
	
	/**
	* Returns the value of the "directNormalIrradiance" parameter of this interaction.
	*
	* @return the value of the "directNormalIrradiance" parameter
	*/
	public double get_directNormalIrradiance() { return _directNormalIrradiance; }
	
	
	/**
	* Set the value of the "directNormalIrradianceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIrradianceSource" parameter
	*/
	public void set_directNormalIrradianceSource( String value ) { _directNormalIrradianceSource = value; }
	
	/**
	* Returns the value of the "directNormalIrradianceSource" parameter of this interaction.
	*
	* @return the value of the "directNormalIrradianceSource" parameter
	*/
	public String get_directNormalIrradianceSource() { return _directNormalIrradianceSource; }
	
	
	/**
	* Set the value of the "directNormalIrradianceUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "directNormalIrradianceUncertainty" parameter
	*/
	public void set_directNormalIrradianceUncertainty( double value ) { _directNormalIrradianceUncertainty = value; }
	
	/**
	* Returns the value of the "directNormalIrradianceUncertainty" parameter of this interaction.
	*
	* @return the value of the "directNormalIrradianceUncertainty" parameter
	*/
	public double get_directNormalIrradianceUncertainty() { return _directNormalIrradianceUncertainty; }
	
	
	/**
	* Set the value of the "dryBulbTemperature" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dryBulbTemperature" parameter
	*/
	public void set_dryBulbTemperature( double value ) { _dryBulbTemperature = value; }
	
	/**
	* Returns the value of the "dryBulbTemperature" parameter of this interaction.
	*
	* @return the value of the "dryBulbTemperature" parameter
	*/
	public double get_dryBulbTemperature() { return _dryBulbTemperature; }
	
	
	/**
	* Set the value of the "dryBulbTemperatureSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dryBulbTemperatureSource" parameter
	*/
	public void set_dryBulbTemperatureSource( String value ) { _dryBulbTemperatureSource = value; }
	
	/**
	* Returns the value of the "dryBulbTemperatureSource" parameter of this interaction.
	*
	* @return the value of the "dryBulbTemperatureSource" parameter
	*/
	public String get_dryBulbTemperatureSource() { return _dryBulbTemperatureSource; }
	
	
	/**
	* Set the value of the "dryBulbTemperatureUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "dryBulbTemperatureUncertainty" parameter
	*/
	public void set_dryBulbTemperatureUncertainty( double value ) { _dryBulbTemperatureUncertainty = value; }
	
	/**
	* Returns the value of the "dryBulbTemperatureUncertainty" parameter of this interaction.
	*
	* @return the value of the "dryBulbTemperatureUncertainty" parameter
	*/
	public double get_dryBulbTemperatureUncertainty() { return _dryBulbTemperatureUncertainty; }
	
	
	/**
	* Set the value of the "elevation" parameter to "value" for this parameter.
	*
	* @param value the new value for the "elevation" parameter
	*/
	public void set_elevation( double value ) { _elevation = value; }
	
	/**
	* Returns the value of the "elevation" parameter of this interaction.
	*
	* @return the value of the "elevation" parameter
	*/
	public double get_elevation() { return _elevation; }
	
	
	/**
	* Set the value of the "extraTerrestrialRadiation" parameter to "value" for this parameter.
	*
	* @param value the new value for the "extraTerrestrialRadiation" parameter
	*/
	public void set_extraTerrestrialRadiation( double value ) { _extraTerrestrialRadiation = value; }
	
	/**
	* Returns the value of the "extraTerrestrialRadiation" parameter of this interaction.
	*
	* @return the value of the "extraTerrestrialRadiation" parameter
	*/
	public double get_extraTerrestrialRadiation() { return _extraTerrestrialRadiation; }
	
	
	/**
	* Set the value of the "extraTerrestrialRadiationNormal" parameter to "value" for this parameter.
	*
	* @param value the new value for the "extraTerrestrialRadiationNormal" parameter
	*/
	public void set_extraTerrestrialRadiationNormal( double value ) { _extraTerrestrialRadiationNormal = value; }
	
	/**
	* Returns the value of the "extraTerrestrialRadiationNormal" parameter of this interaction.
	*
	* @return the value of the "extraTerrestrialRadiationNormal" parameter
	*/
	public double get_extraTerrestrialRadiationNormal() { return _extraTerrestrialRadiationNormal; }
	
	
	/**
	* Set the value of the "globalHorizontalIlluminance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIlluminance" parameter
	*/
	public void set_globalHorizontalIlluminance( double value ) { _globalHorizontalIlluminance = value; }
	
	/**
	* Returns the value of the "globalHorizontalIlluminance" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIlluminance" parameter
	*/
	public double get_globalHorizontalIlluminance() { return _globalHorizontalIlluminance; }
	
	
	/**
	* Set the value of the "globalHorizontalIlluminanceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIlluminanceSource" parameter
	*/
	public void set_globalHorizontalIlluminanceSource( String value ) { _globalHorizontalIlluminanceSource = value; }
	
	/**
	* Returns the value of the "globalHorizontalIlluminanceSource" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIlluminanceSource" parameter
	*/
	public String get_globalHorizontalIlluminanceSource() { return _globalHorizontalIlluminanceSource; }
	
	
	/**
	* Set the value of the "globalHorizontalIlluminanceUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIlluminanceUncertainty" parameter
	*/
	public void set_globalHorizontalIlluminanceUncertainty( double value ) { _globalHorizontalIlluminanceUncertainty = value; }
	
	/**
	* Returns the value of the "globalHorizontalIlluminanceUncertainty" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIlluminanceUncertainty" parameter
	*/
	public double get_globalHorizontalIlluminanceUncertainty() { return _globalHorizontalIlluminanceUncertainty; }
	
	
	/**
	* Set the value of the "globalHorizontalIrradiance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIrradiance" parameter
	*/
	public void set_globalHorizontalIrradiance( double value ) { _globalHorizontalIrradiance = value; }
	
	/**
	* Returns the value of the "globalHorizontalIrradiance" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIrradiance" parameter
	*/
	public double get_globalHorizontalIrradiance() { return _globalHorizontalIrradiance; }
	
	
	/**
	* Set the value of the "globalHorizontalIrradianceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIrradianceSource" parameter
	*/
	public void set_globalHorizontalIrradianceSource( String value ) { _globalHorizontalIrradianceSource = value; }
	
	/**
	* Returns the value of the "globalHorizontalIrradianceSource" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIrradianceSource" parameter
	*/
	public String get_globalHorizontalIrradianceSource() { return _globalHorizontalIrradianceSource; }
	
	
	/**
	* Set the value of the "globalHorizontalIrradianceUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "globalHorizontalIrradianceUncertainty" parameter
	*/
	public void set_globalHorizontalIrradianceUncertainty( double value ) { _globalHorizontalIrradianceUncertainty = value; }
	
	/**
	* Returns the value of the "globalHorizontalIrradianceUncertainty" parameter of this interaction.
	*
	* @return the value of the "globalHorizontalIrradianceUncertainty" parameter
	*/
	public double get_globalHorizontalIrradianceUncertainty() { return _globalHorizontalIrradianceUncertainty; }
	
	
	/**
	* Set the value of the "horizontalVisibility" parameter to "value" for this parameter.
	*
	* @param value the new value for the "horizontalVisibility" parameter
	*/
	public void set_horizontalVisibility( double value ) { _horizontalVisibility = value; }
	
	/**
	* Returns the value of the "horizontalVisibility" parameter of this interaction.
	*
	* @return the value of the "horizontalVisibility" parameter
	*/
	public double get_horizontalVisibility() { return _horizontalVisibility; }
	
	
	/**
	* Set the value of the "horizontalVisibilitySource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "horizontalVisibilitySource" parameter
	*/
	public void set_horizontalVisibilitySource( String value ) { _horizontalVisibilitySource = value; }
	
	/**
	* Returns the value of the "horizontalVisibilitySource" parameter of this interaction.
	*
	* @return the value of the "horizontalVisibilitySource" parameter
	*/
	public String get_horizontalVisibilitySource() { return _horizontalVisibilitySource; }
	
	
	/**
	* Set the value of the "horizontalVisibilityUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "horizontalVisibilityUncertainty" parameter
	*/
	public void set_horizontalVisibilityUncertainty( double value ) { _horizontalVisibilityUncertainty = value; }
	
	/**
	* Returns the value of the "horizontalVisibilityUncertainty" parameter of this interaction.
	*
	* @return the value of the "horizontalVisibilityUncertainty" parameter
	*/
	public double get_horizontalVisibilityUncertainty() { return _horizontalVisibilityUncertainty; }
	
	
	/**
	* Set the value of the "latitude" parameter to "value" for this parameter.
	*
	* @param value the new value for the "latitude" parameter
	*/
	public void set_latitude( double value ) { _latitude = value; }
	
	/**
	* Returns the value of the "latitude" parameter of this interaction.
	*
	* @return the value of the "latitude" parameter
	*/
	public double get_latitude() { return _latitude; }
	
	
	/**
	* Set the value of the "liquidPrecipitationDepth" parameter to "value" for this parameter.
	*
	* @param value the new value for the "liquidPrecipitationDepth" parameter
	*/
	public void set_liquidPrecipitationDepth( double value ) { _liquidPrecipitationDepth = value; }
	
	/**
	* Returns the value of the "liquidPrecipitationDepth" parameter of this interaction.
	*
	* @return the value of the "liquidPrecipitationDepth" parameter
	*/
	public double get_liquidPrecipitationDepth() { return _liquidPrecipitationDepth; }
	
	
	/**
	* Set the value of the "liquidPrecipitationDepthSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "liquidPrecipitationDepthSource" parameter
	*/
	public void set_liquidPrecipitationDepthSource( String value ) { _liquidPrecipitationDepthSource = value; }
	
	/**
	* Returns the value of the "liquidPrecipitationDepthSource" parameter of this interaction.
	*
	* @return the value of the "liquidPrecipitationDepthSource" parameter
	*/
	public String get_liquidPrecipitationDepthSource() { return _liquidPrecipitationDepthSource; }
	
	
	/**
	* Set the value of the "liquidPrecipitationDepthUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "liquidPrecipitationDepthUncertainty" parameter
	*/
	public void set_liquidPrecipitationDepthUncertainty( double value ) { _liquidPrecipitationDepthUncertainty = value; }
	
	/**
	* Returns the value of the "liquidPrecipitationDepthUncertainty" parameter of this interaction.
	*
	* @return the value of the "liquidPrecipitationDepthUncertainty" parameter
	*/
	public double get_liquidPrecipitationDepthUncertainty() { return _liquidPrecipitationDepthUncertainty; }
	
	
	/**
	* Set the value of the "liquidPrecipitationQuantity" parameter to "value" for this parameter.
	*
	* @param value the new value for the "liquidPrecipitationQuantity" parameter
	*/
	public void set_liquidPrecipitationQuantity( double value ) { _liquidPrecipitationQuantity = value; }
	
	/**
	* Returns the value of the "liquidPrecipitationQuantity" parameter of this interaction.
	*
	* @return the value of the "liquidPrecipitationQuantity" parameter
	*/
	public double get_liquidPrecipitationQuantity() { return _liquidPrecipitationQuantity; }
	
	
	/**
	* Set the value of the "longitude" parameter to "value" for this parameter.
	*
	* @param value the new value for the "longitude" parameter
	*/
	public void set_longitude( double value ) { _longitude = value; }
	
	/**
	* Returns the value of the "longitude" parameter of this interaction.
	*
	* @return the value of the "longitude" parameter
	*/
	public double get_longitude() { return _longitude; }
	
	
	/**
	* Set the value of the "opaqueSkyCover" parameter to "value" for this parameter.
	*
	* @param value the new value for the "opaqueSkyCover" parameter
	*/
	public void set_opaqueSkyCover( double value ) { _opaqueSkyCover = value; }
	
	/**
	* Returns the value of the "opaqueSkyCover" parameter of this interaction.
	*
	* @return the value of the "opaqueSkyCover" parameter
	*/
	public double get_opaqueSkyCover() { return _opaqueSkyCover; }
	
	
	/**
	* Set the value of the "opaqueSkyCoverSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "opaqueSkyCoverSource" parameter
	*/
	public void set_opaqueSkyCoverSource( String value ) { _opaqueSkyCoverSource = value; }
	
	/**
	* Returns the value of the "opaqueSkyCoverSource" parameter of this interaction.
	*
	* @return the value of the "opaqueSkyCoverSource" parameter
	*/
	public String get_opaqueSkyCoverSource() { return _opaqueSkyCoverSource; }
	
	
	/**
	* Set the value of the "opaqueSkyCoverUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "opaqueSkyCoverUncertainty" parameter
	*/
	public void set_opaqueSkyCoverUncertainty( double value ) { _opaqueSkyCoverUncertainty = value; }
	
	/**
	* Returns the value of the "opaqueSkyCoverUncertainty" parameter of this interaction.
	*
	* @return the value of the "opaqueSkyCoverUncertainty" parameter
	*/
	public double get_opaqueSkyCoverUncertainty() { return _opaqueSkyCoverUncertainty; }
	
	
	/**
	* Set the value of the "precipitableWater" parameter to "value" for this parameter.
	*
	* @param value the new value for the "precipitableWater" parameter
	*/
	public void set_precipitableWater( double value ) { _precipitableWater = value; }
	
	/**
	* Returns the value of the "precipitableWater" parameter of this interaction.
	*
	* @return the value of the "precipitableWater" parameter
	*/
	public double get_precipitableWater() { return _precipitableWater; }
	
	
	/**
	* Set the value of the "precipitableWaterSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "precipitableWaterSource" parameter
	*/
	public void set_precipitableWaterSource( String value ) { _precipitableWaterSource = value; }
	
	/**
	* Returns the value of the "precipitableWaterSource" parameter of this interaction.
	*
	* @return the value of the "precipitableWaterSource" parameter
	*/
	public String get_precipitableWaterSource() { return _precipitableWaterSource; }
	
	
	/**
	* Set the value of the "precipitableWaterUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "precipitableWaterUncertainty" parameter
	*/
	public void set_precipitableWaterUncertainty( double value ) { _precipitableWaterUncertainty = value; }
	
	/**
	* Returns the value of the "precipitableWaterUncertainty" parameter of this interaction.
	*
	* @return the value of the "precipitableWaterUncertainty" parameter
	*/
	public double get_precipitableWaterUncertainty() { return _precipitableWaterUncertainty; }
	
	
	/**
	* Set the value of the "presentWeather" parameter to "value" for this parameter.
	*
	* @param value the new value for the "presentWeather" parameter
	*/
	public void set_presentWeather( double value ) { _presentWeather = value; }
	
	/**
	* Returns the value of the "presentWeather" parameter of this interaction.
	*
	* @return the value of the "presentWeather" parameter
	*/
	public double get_presentWeather() { return _presentWeather; }
	
	
	/**
	* Set the value of the "presentWeatherSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "presentWeatherSource" parameter
	*/
	public void set_presentWeatherSource( String value ) { _presentWeatherSource = value; }
	
	/**
	* Returns the value of the "presentWeatherSource" parameter of this interaction.
	*
	* @return the value of the "presentWeatherSource" parameter
	*/
	public String get_presentWeatherSource() { return _presentWeatherSource; }
	
	
	/**
	* Set the value of the "presentWeatherUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "presentWeatherUncertainty" parameter
	*/
	public void set_presentWeatherUncertainty( double value ) { _presentWeatherUncertainty = value; }
	
	/**
	* Returns the value of the "presentWeatherUncertainty" parameter of this interaction.
	*
	* @return the value of the "presentWeatherUncertainty" parameter
	*/
	public double get_presentWeatherUncertainty() { return _presentWeatherUncertainty; }
	
	
	/**
	* Set the value of the "pressure" parameter to "value" for this parameter.
	*
	* @param value the new value for the "pressure" parameter
	*/
	public void set_pressure( double value ) { _pressure = value; }
	
	/**
	* Returns the value of the "pressure" parameter of this interaction.
	*
	* @return the value of the "pressure" parameter
	*/
	public double get_pressure() { return _pressure; }
	
	
	/**
	* Set the value of the "pressureSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "pressureSource" parameter
	*/
	public void set_pressureSource( String value ) { _pressureSource = value; }
	
	/**
	* Returns the value of the "pressureSource" parameter of this interaction.
	*
	* @return the value of the "pressureSource" parameter
	*/
	public String get_pressureSource() { return _pressureSource; }
	
	
	/**
	* Set the value of the "pressureUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "pressureUncertainty" parameter
	*/
	public void set_pressureUncertainty( double value ) { _pressureUncertainty = value; }
	
	/**
	* Returns the value of the "pressureUncertainty" parameter of this interaction.
	*
	* @return the value of the "pressureUncertainty" parameter
	*/
	public double get_pressureUncertainty() { return _pressureUncertainty; }
	
	
	/**
	* Set the value of the "relativeHumidity" parameter to "value" for this parameter.
	*
	* @param value the new value for the "relativeHumidity" parameter
	*/
	public void set_relativeHumidity( double value ) { _relativeHumidity = value; }
	
	/**
	* Returns the value of the "relativeHumidity" parameter of this interaction.
	*
	* @return the value of the "relativeHumidity" parameter
	*/
	public double get_relativeHumidity() { return _relativeHumidity; }
	
	
	/**
	* Set the value of the "relativeHumiditySource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "relativeHumiditySource" parameter
	*/
	public void set_relativeHumiditySource( String value ) { _relativeHumiditySource = value; }
	
	/**
	* Returns the value of the "relativeHumiditySource" parameter of this interaction.
	*
	* @return the value of the "relativeHumiditySource" parameter
	*/
	public String get_relativeHumiditySource() { return _relativeHumiditySource; }
	
	
	/**
	* Set the value of the "relativeHumidityUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "relativeHumidityUncertainty" parameter
	*/
	public void set_relativeHumidityUncertainty( double value ) { _relativeHumidityUncertainty = value; }
	
	/**
	* Returns the value of the "relativeHumidityUncertainty" parameter of this interaction.
	*
	* @return the value of the "relativeHumidityUncertainty" parameter
	*/
	public double get_relativeHumidityUncertainty() { return _relativeHumidityUncertainty; }
	
	
	/**
	* Set the value of the "stationIDCode" parameter to "value" for this parameter.
	*
	* @param value the new value for the "stationIDCode" parameter
	*/
	public void set_stationIDCode( int value ) { _stationIDCode = value; }
	
	/**
	* Returns the value of the "stationIDCode" parameter of this interaction.
	*
	* @return the value of the "stationIDCode" parameter
	*/
	public int get_stationIDCode() { return _stationIDCode; }
	
	
	/**
	* Set the value of the "stationName" parameter to "value" for this parameter.
	*
	* @param value the new value for the "stationName" parameter
	*/
	public void set_stationName( String value ) { _stationName = value; }
	
	/**
	* Returns the value of the "stationName" parameter of this interaction.
	*
	* @return the value of the "stationName" parameter
	*/
	public String get_stationName() { return _stationName; }
	
	
	/**
	* Set the value of the "stationState" parameter to "value" for this parameter.
	*
	* @param value the new value for the "stationState" parameter
	*/
	public void set_stationState( String value ) { _stationState = value; }
	
	/**
	* Returns the value of the "stationState" parameter of this interaction.
	*
	* @return the value of the "stationState" parameter
	*/
	public String get_stationState() { return _stationState; }
	
	
	/**
	* Set the value of the "time" parameter to "value" for this parameter.
	*
	* @param value the new value for the "time" parameter
	*/
	public void set_time( String value ) { _time = value; }
	
	/**
	* Returns the value of the "time" parameter of this interaction.
	*
	* @return the value of the "time" parameter
	*/
	public String get_time() { return _time; }
	
	
	/**
	* Set the value of the "timeZone" parameter to "value" for this parameter.
	*
	* @param value the new value for the "timeZone" parameter
	*/
	public void set_timeZone( double value ) { _timeZone = value; }
	
	/**
	* Returns the value of the "timeZone" parameter of this interaction.
	*
	* @return the value of the "timeZone" parameter
	*/
	public double get_timeZone() { return _timeZone; }
	
	
	/**
	* Set the value of the "totalSkyCover" parameter to "value" for this parameter.
	*
	* @param value the new value for the "totalSkyCover" parameter
	*/
	public void set_totalSkyCover( double value ) { _totalSkyCover = value; }
	
	/**
	* Returns the value of the "totalSkyCover" parameter of this interaction.
	*
	* @return the value of the "totalSkyCover" parameter
	*/
	public double get_totalSkyCover() { return _totalSkyCover; }
	
	
	/**
	* Set the value of the "totalSkyCoverSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "totalSkyCoverSource" parameter
	*/
	public void set_totalSkyCoverSource( String value ) { _totalSkyCoverSource = value; }
	
	/**
	* Returns the value of the "totalSkyCoverSource" parameter of this interaction.
	*
	* @return the value of the "totalSkyCoverSource" parameter
	*/
	public String get_totalSkyCoverSource() { return _totalSkyCoverSource; }
	
	
	/**
	* Set the value of the "totalSkyCoverUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "totalSkyCoverUncertainty" parameter
	*/
	public void set_totalSkyCoverUncertainty( double value ) { _totalSkyCoverUncertainty = value; }
	
	/**
	* Returns the value of the "totalSkyCoverUncertainty" parameter of this interaction.
	*
	* @return the value of the "totalSkyCoverUncertainty" parameter
	*/
	public double get_totalSkyCoverUncertainty() { return _totalSkyCoverUncertainty; }
	
	
	/**
	* Set the value of the "windDirection" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windDirection" parameter
	*/
	public void set_windDirection( double value ) { _windDirection = value; }
	
	/**
	* Returns the value of the "windDirection" parameter of this interaction.
	*
	* @return the value of the "windDirection" parameter
	*/
	public double get_windDirection() { return _windDirection; }
	
	
	/**
	* Set the value of the "windDirectionSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windDirectionSource" parameter
	*/
	public void set_windDirectionSource( String value ) { _windDirectionSource = value; }
	
	/**
	* Returns the value of the "windDirectionSource" parameter of this interaction.
	*
	* @return the value of the "windDirectionSource" parameter
	*/
	public String get_windDirectionSource() { return _windDirectionSource; }
	
	
	/**
	* Set the value of the "windDirectionUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windDirectionUncertainty" parameter
	*/
	public void set_windDirectionUncertainty( double value ) { _windDirectionUncertainty = value; }
	
	/**
	* Returns the value of the "windDirectionUncertainty" parameter of this interaction.
	*
	* @return the value of the "windDirectionUncertainty" parameter
	*/
	public double get_windDirectionUncertainty() { return _windDirectionUncertainty; }
	
	
	/**
	* Set the value of the "windSpeed" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windSpeed" parameter
	*/
	public void set_windSpeed( double value ) { _windSpeed = value; }
	
	/**
	* Returns the value of the "windSpeed" parameter of this interaction.
	*
	* @return the value of the "windSpeed" parameter
	*/
	public double get_windSpeed() { return _windSpeed; }
	
	
	/**
	* Set the value of the "windSpeedSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windSpeedSource" parameter
	*/
	public void set_windSpeedSource( String value ) { _windSpeedSource = value; }
	
	/**
	* Returns the value of the "windSpeedSource" parameter of this interaction.
	*
	* @return the value of the "windSpeedSource" parameter
	*/
	public String get_windSpeedSource() { return _windSpeedSource; }
	
	
	/**
	* Set the value of the "windSpeedUncertainty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "windSpeedUncertainty" parameter
	*/
	public void set_windSpeedUncertainty( double value ) { _windSpeedUncertainty = value; }
	
	/**
	* Returns the value of the "windSpeedUncertainty" parameter of this interaction.
	*
	* @return the value of the "windSpeedUncertainty" parameter
	*/
	public double get_windSpeedUncertainty() { return _windSpeedUncertainty; }
	
	
	/**
	* Set the value of the "zenithLuminance" parameter to "value" for this parameter.
	*
	* @param value the new value for the "zenithLuminance" parameter
	*/
	public void set_zenithLuminance( double value ) { _zenithLuminance = value; }
	
	/**
	* Returns the value of the "zenithLuminance" parameter of this interaction.
	*
	* @return the value of the "zenithLuminance" parameter
	*/
	public double get_zenithLuminance() { return _zenithLuminance; }
	
	
	/**
	* Set the value of the "zenithLuminanceSource" parameter to "value" for this parameter.
	*
	* @param value the new value for the "zenithLuminanceSource" parameter
	*/
	public void set_zenithLuminanceSource( String value ) { _zenithLuminanceSource = value; }
	
	/**
	* Returns the value of the "zenithLuminanceSource" parameter of this interaction.
	*
	* @return the value of the "zenithLuminanceSource" parameter
	*/
	public String get_zenithLuminanceSource() { return _zenithLuminanceSource; }
	
	
	/**
	* Set the value of the "zenithLuminanceUncertianty" parameter to "value" for this parameter.
	*
	* @param value the new value for the "zenithLuminanceUncertianty" parameter
	*/
	public void set_zenithLuminanceUncertianty( double value ) { _zenithLuminanceUncertianty = value; }
	
	/**
	* Returns the value of the "zenithLuminanceUncertianty" parameter of this interaction.
	*
	* @return the value of the "zenithLuminanceUncertianty" parameter
	*/
	public double get_zenithLuminanceUncertianty() { return _zenithLuminanceUncertianty; }
	


	protected TMYWeather( ReceivedInteraction datamemberMap, boolean initFlag ) {
		super( datamemberMap, false );
		if ( initFlag ) setParameters( datamemberMap );
	}
	
	protected TMYWeather( ReceivedInteraction datamemberMap, LogicalTime logicalTime, boolean initFlag ) {
		super( datamemberMap, logicalTime, false );
		if ( initFlag ) setParameters( datamemberMap );
	}


	/**
	* Creates an instance of the TMYWeather interaction class, using
	* "datamemberMap" to initialize its parameter values.
	* "datamemberMap" is usually acquired as an argument to an RTI federate
	* callback method, such as "receiveInteraction".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new TMYWeather interaction class instance
	*/
	public TMYWeather( ReceivedInteraction datamemberMap ) {
		this( datamemberMap, true );
	}
	
	/**
	* Like {@link #TMYWeather( ReceivedInteraction datamemberMap )}, except this
	* new TMYWeather interaction class instance is given a timestamp of
	* "logicalTime".
	*
	* @param datamemberMap data structure containing initial values for the
	* parameters of this new TMYWeather interaction class instance
	* @param logicalTime timestamp for this new TMYWeather interaction class
	* instance
	*/
	public TMYWeather( ReceivedInteraction datamemberMap, LogicalTime logicalTime ) {
		this( datamemberMap, logicalTime, true );
	}

	/**
	* Creates a new TMYWeather interaction class instance that is a duplicate
	* of the instance referred to by TMYWeather_var.
	*
	* @param TMYWeather_var TMYWeather interaction class instance of which
	* this newly created TMYWeather interaction class instance will be a
	* duplicate
	*/
	public TMYWeather( TMYWeather TMYWeather_var ) {
		super( TMYWeather_var );
		
		
		set_aerosolOpticalDepth( TMYWeather_var.get_aerosolOpticalDepth() );
		set_aerosolOpticalDepthSource( TMYWeather_var.get_aerosolOpticalDepthSource() );
		set_aerosolOpticalDepthUncertainty( TMYWeather_var.get_aerosolOpticalDepthUncertainty() );
		set_albedo( TMYWeather_var.get_albedo() );
		set_albedoSource( TMYWeather_var.get_albedoSource() );
		set_albedoUncertainty( TMYWeather_var.get_albedoUncertainty() );
		set_ceilingHeight( TMYWeather_var.get_ceilingHeight() );
		set_ceilingHeightSource( TMYWeather_var.get_ceilingHeightSource() );
		set_ceilingHeightUncertainty( TMYWeather_var.get_ceilingHeightUncertainty() );
		set_date( TMYWeather_var.get_date() );
		set_dewPointTemperature( TMYWeather_var.get_dewPointTemperature() );
		set_dewPointTemperatureSource( TMYWeather_var.get_dewPointTemperatureSource() );
		set_dewPointTemperatureUncertainty( TMYWeather_var.get_dewPointTemperatureUncertainty() );
		set_diffuseHorizontalIlluminance( TMYWeather_var.get_diffuseHorizontalIlluminance() );
		set_diffuseHorizontalIlluminanceSource( TMYWeather_var.get_diffuseHorizontalIlluminanceSource() );
		set_diffuseHorizontalIlluminanceUncertainty( TMYWeather_var.get_diffuseHorizontalIlluminanceUncertainty() );
		set_diffuseHorizontalIrradiancSource( TMYWeather_var.get_diffuseHorizontalIrradiancSource() );
		set_diffuseHorizontalIrradiancUncertainty( TMYWeather_var.get_diffuseHorizontalIrradiancUncertainty() );
		set_diffuseHorizontalIrradiance( TMYWeather_var.get_diffuseHorizontalIrradiance() );
		set_directNormalIlluminance( TMYWeather_var.get_directNormalIlluminance() );
		set_directNormalIlluminanceSource( TMYWeather_var.get_directNormalIlluminanceSource() );
		set_directNormalIlluminanceUncertainty( TMYWeather_var.get_directNormalIlluminanceUncertainty() );
		set_directNormalIrradiance( TMYWeather_var.get_directNormalIrradiance() );
		set_directNormalIrradianceSource( TMYWeather_var.get_directNormalIrradianceSource() );
		set_directNormalIrradianceUncertainty( TMYWeather_var.get_directNormalIrradianceUncertainty() );
		set_dryBulbTemperature( TMYWeather_var.get_dryBulbTemperature() );
		set_dryBulbTemperatureSource( TMYWeather_var.get_dryBulbTemperatureSource() );
		set_dryBulbTemperatureUncertainty( TMYWeather_var.get_dryBulbTemperatureUncertainty() );
		set_elevation( TMYWeather_var.get_elevation() );
		set_extraTerrestrialRadiation( TMYWeather_var.get_extraTerrestrialRadiation() );
		set_extraTerrestrialRadiationNormal( TMYWeather_var.get_extraTerrestrialRadiationNormal() );
		set_globalHorizontalIlluminance( TMYWeather_var.get_globalHorizontalIlluminance() );
		set_globalHorizontalIlluminanceSource( TMYWeather_var.get_globalHorizontalIlluminanceSource() );
		set_globalHorizontalIlluminanceUncertainty( TMYWeather_var.get_globalHorizontalIlluminanceUncertainty() );
		set_globalHorizontalIrradiance( TMYWeather_var.get_globalHorizontalIrradiance() );
		set_globalHorizontalIrradianceSource( TMYWeather_var.get_globalHorizontalIrradianceSource() );
		set_globalHorizontalIrradianceUncertainty( TMYWeather_var.get_globalHorizontalIrradianceUncertainty() );
		set_horizontalVisibility( TMYWeather_var.get_horizontalVisibility() );
		set_horizontalVisibilitySource( TMYWeather_var.get_horizontalVisibilitySource() );
		set_horizontalVisibilityUncertainty( TMYWeather_var.get_horizontalVisibilityUncertainty() );
		set_latitude( TMYWeather_var.get_latitude() );
		set_liquidPrecipitationDepth( TMYWeather_var.get_liquidPrecipitationDepth() );
		set_liquidPrecipitationDepthSource( TMYWeather_var.get_liquidPrecipitationDepthSource() );
		set_liquidPrecipitationDepthUncertainty( TMYWeather_var.get_liquidPrecipitationDepthUncertainty() );
		set_liquidPrecipitationQuantity( TMYWeather_var.get_liquidPrecipitationQuantity() );
		set_longitude( TMYWeather_var.get_longitude() );
		set_opaqueSkyCover( TMYWeather_var.get_opaqueSkyCover() );
		set_opaqueSkyCoverSource( TMYWeather_var.get_opaqueSkyCoverSource() );
		set_opaqueSkyCoverUncertainty( TMYWeather_var.get_opaqueSkyCoverUncertainty() );
		set_precipitableWater( TMYWeather_var.get_precipitableWater() );
		set_precipitableWaterSource( TMYWeather_var.get_precipitableWaterSource() );
		set_precipitableWaterUncertainty( TMYWeather_var.get_precipitableWaterUncertainty() );
		set_presentWeather( TMYWeather_var.get_presentWeather() );
		set_presentWeatherSource( TMYWeather_var.get_presentWeatherSource() );
		set_presentWeatherUncertainty( TMYWeather_var.get_presentWeatherUncertainty() );
		set_pressure( TMYWeather_var.get_pressure() );
		set_pressureSource( TMYWeather_var.get_pressureSource() );
		set_pressureUncertainty( TMYWeather_var.get_pressureUncertainty() );
		set_relativeHumidity( TMYWeather_var.get_relativeHumidity() );
		set_relativeHumiditySource( TMYWeather_var.get_relativeHumiditySource() );
		set_relativeHumidityUncertainty( TMYWeather_var.get_relativeHumidityUncertainty() );
		set_stationIDCode( TMYWeather_var.get_stationIDCode() );
		set_stationName( TMYWeather_var.get_stationName() );
		set_stationState( TMYWeather_var.get_stationState() );
		set_time( TMYWeather_var.get_time() );
		set_timeZone( TMYWeather_var.get_timeZone() );
		set_totalSkyCover( TMYWeather_var.get_totalSkyCover() );
		set_totalSkyCoverSource( TMYWeather_var.get_totalSkyCoverSource() );
		set_totalSkyCoverUncertainty( TMYWeather_var.get_totalSkyCoverUncertainty() );
		set_windDirection( TMYWeather_var.get_windDirection() );
		set_windDirectionSource( TMYWeather_var.get_windDirectionSource() );
		set_windDirectionUncertainty( TMYWeather_var.get_windDirectionUncertainty() );
		set_windSpeed( TMYWeather_var.get_windSpeed() );
		set_windSpeedSource( TMYWeather_var.get_windSpeedSource() );
		set_windSpeedUncertainty( TMYWeather_var.get_windSpeedUncertainty() );
		set_zenithLuminance( TMYWeather_var.get_zenithLuminance() );
		set_zenithLuminanceSource( TMYWeather_var.get_zenithLuminanceSource() );
		set_zenithLuminanceUncertianty( TMYWeather_var.get_zenithLuminanceUncertianty() );
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
		
		
		
		if (  "aerosolOpticalDepth".equals( datamemberName )  ) return new Double(get_aerosolOpticalDepth());
		else if (  "aerosolOpticalDepthSource".equals( datamemberName )  ) return get_aerosolOpticalDepthSource();
		else if (  "aerosolOpticalDepthUncertainty".equals( datamemberName )  ) return new Double(get_aerosolOpticalDepthUncertainty());
		else if (  "albedo".equals( datamemberName )  ) return new Double(get_albedo());
		else if (  "albedoSource".equals( datamemberName )  ) return get_albedoSource();
		else if (  "albedoUncertainty".equals( datamemberName )  ) return new Double(get_albedoUncertainty());
		else if (  "ceilingHeight".equals( datamemberName )  ) return new Double(get_ceilingHeight());
		else if (  "ceilingHeightSource".equals( datamemberName )  ) return get_ceilingHeightSource();
		else if (  "ceilingHeightUncertainty".equals( datamemberName )  ) return new Double(get_ceilingHeightUncertainty());
		else if (  "date".equals( datamemberName )  ) return get_date();
		else if (  "dewPointTemperature".equals( datamemberName )  ) return new Double(get_dewPointTemperature());
		else if (  "dewPointTemperatureSource".equals( datamemberName )  ) return get_dewPointTemperatureSource();
		else if (  "dewPointTemperatureUncertainty".equals( datamemberName )  ) return new Double(get_dewPointTemperatureUncertainty());
		else if (  "diffuseHorizontalIlluminance".equals( datamemberName )  ) return new Double(get_diffuseHorizontalIlluminance());
		else if (  "diffuseHorizontalIlluminanceSource".equals( datamemberName )  ) return get_diffuseHorizontalIlluminanceSource();
		else if (  "diffuseHorizontalIlluminanceUncertainty".equals( datamemberName )  ) return new Double(get_diffuseHorizontalIlluminanceUncertainty());
		else if (  "diffuseHorizontalIrradiancSource".equals( datamemberName )  ) return get_diffuseHorizontalIrradiancSource();
		else if (  "diffuseHorizontalIrradiancUncertainty".equals( datamemberName )  ) return new Double(get_diffuseHorizontalIrradiancUncertainty());
		else if (  "diffuseHorizontalIrradiance".equals( datamemberName )  ) return new Double(get_diffuseHorizontalIrradiance());
		else if (  "directNormalIlluminance".equals( datamemberName )  ) return new Double(get_directNormalIlluminance());
		else if (  "directNormalIlluminanceSource".equals( datamemberName )  ) return get_directNormalIlluminanceSource();
		else if (  "directNormalIlluminanceUncertainty".equals( datamemberName )  ) return new Double(get_directNormalIlluminanceUncertainty());
		else if (  "directNormalIrradiance".equals( datamemberName )  ) return new Double(get_directNormalIrradiance());
		else if (  "directNormalIrradianceSource".equals( datamemberName )  ) return get_directNormalIrradianceSource();
		else if (  "directNormalIrradianceUncertainty".equals( datamemberName )  ) return new Double(get_directNormalIrradianceUncertainty());
		else if (  "dryBulbTemperature".equals( datamemberName )  ) return new Double(get_dryBulbTemperature());
		else if (  "dryBulbTemperatureSource".equals( datamemberName )  ) return get_dryBulbTemperatureSource();
		else if (  "dryBulbTemperatureUncertainty".equals( datamemberName )  ) return new Double(get_dryBulbTemperatureUncertainty());
		else if (  "elevation".equals( datamemberName )  ) return new Double(get_elevation());
		else if (  "extraTerrestrialRadiation".equals( datamemberName )  ) return new Double(get_extraTerrestrialRadiation());
		else if (  "extraTerrestrialRadiationNormal".equals( datamemberName )  ) return new Double(get_extraTerrestrialRadiationNormal());
		else if (  "globalHorizontalIlluminance".equals( datamemberName )  ) return new Double(get_globalHorizontalIlluminance());
		else if (  "globalHorizontalIlluminanceSource".equals( datamemberName )  ) return get_globalHorizontalIlluminanceSource();
		else if (  "globalHorizontalIlluminanceUncertainty".equals( datamemberName )  ) return new Double(get_globalHorizontalIlluminanceUncertainty());
		else if (  "globalHorizontalIrradiance".equals( datamemberName )  ) return new Double(get_globalHorizontalIrradiance());
		else if (  "globalHorizontalIrradianceSource".equals( datamemberName )  ) return get_globalHorizontalIrradianceSource();
		else if (  "globalHorizontalIrradianceUncertainty".equals( datamemberName )  ) return new Double(get_globalHorizontalIrradianceUncertainty());
		else if (  "horizontalVisibility".equals( datamemberName )  ) return new Double(get_horizontalVisibility());
		else if (  "horizontalVisibilitySource".equals( datamemberName )  ) return get_horizontalVisibilitySource();
		else if (  "horizontalVisibilityUncertainty".equals( datamemberName )  ) return new Double(get_horizontalVisibilityUncertainty());
		else if (  "latitude".equals( datamemberName )  ) return new Double(get_latitude());
		else if (  "liquidPrecipitationDepth".equals( datamemberName )  ) return new Double(get_liquidPrecipitationDepth());
		else if (  "liquidPrecipitationDepthSource".equals( datamemberName )  ) return get_liquidPrecipitationDepthSource();
		else if (  "liquidPrecipitationDepthUncertainty".equals( datamemberName )  ) return new Double(get_liquidPrecipitationDepthUncertainty());
		else if (  "liquidPrecipitationQuantity".equals( datamemberName )  ) return new Double(get_liquidPrecipitationQuantity());
		else if (  "longitude".equals( datamemberName )  ) return new Double(get_longitude());
		else if (  "opaqueSkyCover".equals( datamemberName )  ) return new Double(get_opaqueSkyCover());
		else if (  "opaqueSkyCoverSource".equals( datamemberName )  ) return get_opaqueSkyCoverSource();
		else if (  "opaqueSkyCoverUncertainty".equals( datamemberName )  ) return new Double(get_opaqueSkyCoverUncertainty());
		else if (  "precipitableWater".equals( datamemberName )  ) return new Double(get_precipitableWater());
		else if (  "precipitableWaterSource".equals( datamemberName )  ) return get_precipitableWaterSource();
		else if (  "precipitableWaterUncertainty".equals( datamemberName )  ) return new Double(get_precipitableWaterUncertainty());
		else if (  "presentWeather".equals( datamemberName )  ) return new Double(get_presentWeather());
		else if (  "presentWeatherSource".equals( datamemberName )  ) return get_presentWeatherSource();
		else if (  "presentWeatherUncertainty".equals( datamemberName )  ) return new Double(get_presentWeatherUncertainty());
		else if (  "pressure".equals( datamemberName )  ) return new Double(get_pressure());
		else if (  "pressureSource".equals( datamemberName )  ) return get_pressureSource();
		else if (  "pressureUncertainty".equals( datamemberName )  ) return new Double(get_pressureUncertainty());
		else if (  "relativeHumidity".equals( datamemberName )  ) return new Double(get_relativeHumidity());
		else if (  "relativeHumiditySource".equals( datamemberName )  ) return get_relativeHumiditySource();
		else if (  "relativeHumidityUncertainty".equals( datamemberName )  ) return new Double(get_relativeHumidityUncertainty());
		else if (  "stationIDCode".equals( datamemberName )  ) return new Integer(get_stationIDCode());
		else if (  "stationName".equals( datamemberName )  ) return get_stationName();
		else if (  "stationState".equals( datamemberName )  ) return get_stationState();
		else if (  "time".equals( datamemberName )  ) return get_time();
		else if (  "timeZone".equals( datamemberName )  ) return new Double(get_timeZone());
		else if (  "totalSkyCover".equals( datamemberName )  ) return new Double(get_totalSkyCover());
		else if (  "totalSkyCoverSource".equals( datamemberName )  ) return get_totalSkyCoverSource();
		else if (  "totalSkyCoverUncertainty".equals( datamemberName )  ) return new Double(get_totalSkyCoverUncertainty());
		else if (  "windDirection".equals( datamemberName )  ) return new Double(get_windDirection());
		else if (  "windDirectionSource".equals( datamemberName )  ) return get_windDirectionSource();
		else if (  "windDirectionUncertainty".equals( datamemberName )  ) return new Double(get_windDirectionUncertainty());
		else if (  "windSpeed".equals( datamemberName )  ) return new Double(get_windSpeed());
		else if (  "windSpeedSource".equals( datamemberName )  ) return get_windSpeedSource();
		else if (  "windSpeedUncertainty".equals( datamemberName )  ) return new Double(get_windSpeedUncertainty());
		else if (  "zenithLuminance".equals( datamemberName )  ) return new Double(get_zenithLuminance());
		else if (  "zenithLuminanceSource".equals( datamemberName )  ) return get_zenithLuminanceSource();
		else if (  "zenithLuminanceUncertianty".equals( datamemberName )  ) return new Double(get_zenithLuminanceUncertianty());
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
		
				
		
		if ( get_aerosolOpticalDepth_handle() == datamemberHandle ) return new Double(get_aerosolOpticalDepth());
		else if ( get_aerosolOpticalDepthSource_handle() == datamemberHandle ) return get_aerosolOpticalDepthSource();
		else if ( get_aerosolOpticalDepthUncertainty_handle() == datamemberHandle ) return new Double(get_aerosolOpticalDepthUncertainty());
		else if ( get_albedo_handle() == datamemberHandle ) return new Double(get_albedo());
		else if ( get_albedoSource_handle() == datamemberHandle ) return get_albedoSource();
		else if ( get_albedoUncertainty_handle() == datamemberHandle ) return new Double(get_albedoUncertainty());
		else if ( get_ceilingHeight_handle() == datamemberHandle ) return new Double(get_ceilingHeight());
		else if ( get_ceilingHeightSource_handle() == datamemberHandle ) return get_ceilingHeightSource();
		else if ( get_ceilingHeightUncertainty_handle() == datamemberHandle ) return new Double(get_ceilingHeightUncertainty());
		else if ( get_date_handle() == datamemberHandle ) return get_date();
		else if ( get_dewPointTemperature_handle() == datamemberHandle ) return new Double(get_dewPointTemperature());
		else if ( get_dewPointTemperatureSource_handle() == datamemberHandle ) return get_dewPointTemperatureSource();
		else if ( get_dewPointTemperatureUncertainty_handle() == datamemberHandle ) return new Double(get_dewPointTemperatureUncertainty());
		else if ( get_diffuseHorizontalIlluminance_handle() == datamemberHandle ) return new Double(get_diffuseHorizontalIlluminance());
		else if ( get_diffuseHorizontalIlluminanceSource_handle() == datamemberHandle ) return get_diffuseHorizontalIlluminanceSource();
		else if ( get_diffuseHorizontalIlluminanceUncertainty_handle() == datamemberHandle ) return new Double(get_diffuseHorizontalIlluminanceUncertainty());
		else if ( get_diffuseHorizontalIrradiancSource_handle() == datamemberHandle ) return get_diffuseHorizontalIrradiancSource();
		else if ( get_diffuseHorizontalIrradiancUncertainty_handle() == datamemberHandle ) return new Double(get_diffuseHorizontalIrradiancUncertainty());
		else if ( get_diffuseHorizontalIrradiance_handle() == datamemberHandle ) return new Double(get_diffuseHorizontalIrradiance());
		else if ( get_directNormalIlluminance_handle() == datamemberHandle ) return new Double(get_directNormalIlluminance());
		else if ( get_directNormalIlluminanceSource_handle() == datamemberHandle ) return get_directNormalIlluminanceSource();
		else if ( get_directNormalIlluminanceUncertainty_handle() == datamemberHandle ) return new Double(get_directNormalIlluminanceUncertainty());
		else if ( get_directNormalIrradiance_handle() == datamemberHandle ) return new Double(get_directNormalIrradiance());
		else if ( get_directNormalIrradianceSource_handle() == datamemberHandle ) return get_directNormalIrradianceSource();
		else if ( get_directNormalIrradianceUncertainty_handle() == datamemberHandle ) return new Double(get_directNormalIrradianceUncertainty());
		else if ( get_dryBulbTemperature_handle() == datamemberHandle ) return new Double(get_dryBulbTemperature());
		else if ( get_dryBulbTemperatureSource_handle() == datamemberHandle ) return get_dryBulbTemperatureSource();
		else if ( get_dryBulbTemperatureUncertainty_handle() == datamemberHandle ) return new Double(get_dryBulbTemperatureUncertainty());
		else if ( get_elevation_handle() == datamemberHandle ) return new Double(get_elevation());
		else if ( get_extraTerrestrialRadiation_handle() == datamemberHandle ) return new Double(get_extraTerrestrialRadiation());
		else if ( get_extraTerrestrialRadiationNormal_handle() == datamemberHandle ) return new Double(get_extraTerrestrialRadiationNormal());
		else if ( get_globalHorizontalIlluminance_handle() == datamemberHandle ) return new Double(get_globalHorizontalIlluminance());
		else if ( get_globalHorizontalIlluminanceSource_handle() == datamemberHandle ) return get_globalHorizontalIlluminanceSource();
		else if ( get_globalHorizontalIlluminanceUncertainty_handle() == datamemberHandle ) return new Double(get_globalHorizontalIlluminanceUncertainty());
		else if ( get_globalHorizontalIrradiance_handle() == datamemberHandle ) return new Double(get_globalHorizontalIrradiance());
		else if ( get_globalHorizontalIrradianceSource_handle() == datamemberHandle ) return get_globalHorizontalIrradianceSource();
		else if ( get_globalHorizontalIrradianceUncertainty_handle() == datamemberHandle ) return new Double(get_globalHorizontalIrradianceUncertainty());
		else if ( get_horizontalVisibility_handle() == datamemberHandle ) return new Double(get_horizontalVisibility());
		else if ( get_horizontalVisibilitySource_handle() == datamemberHandle ) return get_horizontalVisibilitySource();
		else if ( get_horizontalVisibilityUncertainty_handle() == datamemberHandle ) return new Double(get_horizontalVisibilityUncertainty());
		else if ( get_latitude_handle() == datamemberHandle ) return new Double(get_latitude());
		else if ( get_liquidPrecipitationDepth_handle() == datamemberHandle ) return new Double(get_liquidPrecipitationDepth());
		else if ( get_liquidPrecipitationDepthSource_handle() == datamemberHandle ) return get_liquidPrecipitationDepthSource();
		else if ( get_liquidPrecipitationDepthUncertainty_handle() == datamemberHandle ) return new Double(get_liquidPrecipitationDepthUncertainty());
		else if ( get_liquidPrecipitationQuantity_handle() == datamemberHandle ) return new Double(get_liquidPrecipitationQuantity());
		else if ( get_longitude_handle() == datamemberHandle ) return new Double(get_longitude());
		else if ( get_opaqueSkyCover_handle() == datamemberHandle ) return new Double(get_opaqueSkyCover());
		else if ( get_opaqueSkyCoverSource_handle() == datamemberHandle ) return get_opaqueSkyCoverSource();
		else if ( get_opaqueSkyCoverUncertainty_handle() == datamemberHandle ) return new Double(get_opaqueSkyCoverUncertainty());
		else if ( get_precipitableWater_handle() == datamemberHandle ) return new Double(get_precipitableWater());
		else if ( get_precipitableWaterSource_handle() == datamemberHandle ) return get_precipitableWaterSource();
		else if ( get_precipitableWaterUncertainty_handle() == datamemberHandle ) return new Double(get_precipitableWaterUncertainty());
		else if ( get_presentWeather_handle() == datamemberHandle ) return new Double(get_presentWeather());
		else if ( get_presentWeatherSource_handle() == datamemberHandle ) return get_presentWeatherSource();
		else if ( get_presentWeatherUncertainty_handle() == datamemberHandle ) return new Double(get_presentWeatherUncertainty());
		else if ( get_pressure_handle() == datamemberHandle ) return new Double(get_pressure());
		else if ( get_pressureSource_handle() == datamemberHandle ) return get_pressureSource();
		else if ( get_pressureUncertainty_handle() == datamemberHandle ) return new Double(get_pressureUncertainty());
		else if ( get_relativeHumidity_handle() == datamemberHandle ) return new Double(get_relativeHumidity());
		else if ( get_relativeHumiditySource_handle() == datamemberHandle ) return get_relativeHumiditySource();
		else if ( get_relativeHumidityUncertainty_handle() == datamemberHandle ) return new Double(get_relativeHumidityUncertainty());
		else if ( get_stationIDCode_handle() == datamemberHandle ) return new Integer(get_stationIDCode());
		else if ( get_stationName_handle() == datamemberHandle ) return get_stationName();
		else if ( get_stationState_handle() == datamemberHandle ) return get_stationState();
		else if ( get_time_handle() == datamemberHandle ) return get_time();
		else if ( get_timeZone_handle() == datamemberHandle ) return new Double(get_timeZone());
		else if ( get_totalSkyCover_handle() == datamemberHandle ) return new Double(get_totalSkyCover());
		else if ( get_totalSkyCoverSource_handle() == datamemberHandle ) return get_totalSkyCoverSource();
		else if ( get_totalSkyCoverUncertainty_handle() == datamemberHandle ) return new Double(get_totalSkyCoverUncertainty());
		else if ( get_windDirection_handle() == datamemberHandle ) return new Double(get_windDirection());
		else if ( get_windDirectionSource_handle() == datamemberHandle ) return get_windDirectionSource();
		else if ( get_windDirectionUncertainty_handle() == datamemberHandle ) return new Double(get_windDirectionUncertainty());
		else if ( get_windSpeed_handle() == datamemberHandle ) return new Double(get_windSpeed());
		else if ( get_windSpeedSource_handle() == datamemberHandle ) return get_windSpeedSource();
		else if ( get_windSpeedUncertainty_handle() == datamemberHandle ) return new Double(get_windSpeedUncertainty());
		else if ( get_zenithLuminance_handle() == datamemberHandle ) return new Double(get_zenithLuminance());
		else if ( get_zenithLuminanceSource_handle() == datamemberHandle ) return get_zenithLuminanceSource();
		else if ( get_zenithLuminanceUncertianty_handle() == datamemberHandle ) return new Double(get_zenithLuminanceUncertianty());
		else return super.getParameter( datamemberHandle );
	}
	
	protected boolean setParameterAux( int param_handle, String val ) {
		boolean retval = true;		
		
			
		
		if ( param_handle == get_aerosolOpticalDepth_handle() ) set_aerosolOpticalDepth( Double.parseDouble(val) );
		else if ( param_handle == get_aerosolOpticalDepthSource_handle() ) set_aerosolOpticalDepthSource( val );
		else if ( param_handle == get_aerosolOpticalDepthUncertainty_handle() ) set_aerosolOpticalDepthUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_albedo_handle() ) set_albedo( Double.parseDouble(val) );
		else if ( param_handle == get_albedoSource_handle() ) set_albedoSource( val );
		else if ( param_handle == get_albedoUncertainty_handle() ) set_albedoUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_ceilingHeight_handle() ) set_ceilingHeight( Double.parseDouble(val) );
		else if ( param_handle == get_ceilingHeightSource_handle() ) set_ceilingHeightSource( val );
		else if ( param_handle == get_ceilingHeightUncertainty_handle() ) set_ceilingHeightUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_date_handle() ) set_date( val );
		else if ( param_handle == get_dewPointTemperature_handle() ) set_dewPointTemperature( Double.parseDouble(val) );
		else if ( param_handle == get_dewPointTemperatureSource_handle() ) set_dewPointTemperatureSource( val );
		else if ( param_handle == get_dewPointTemperatureUncertainty_handle() ) set_dewPointTemperatureUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_diffuseHorizontalIlluminance_handle() ) set_diffuseHorizontalIlluminance( Double.parseDouble(val) );
		else if ( param_handle == get_diffuseHorizontalIlluminanceSource_handle() ) set_diffuseHorizontalIlluminanceSource( val );
		else if ( param_handle == get_diffuseHorizontalIlluminanceUncertainty_handle() ) set_diffuseHorizontalIlluminanceUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_diffuseHorizontalIrradiancSource_handle() ) set_diffuseHorizontalIrradiancSource( val );
		else if ( param_handle == get_diffuseHorizontalIrradiancUncertainty_handle() ) set_diffuseHorizontalIrradiancUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_diffuseHorizontalIrradiance_handle() ) set_diffuseHorizontalIrradiance( Double.parseDouble(val) );
		else if ( param_handle == get_directNormalIlluminance_handle() ) set_directNormalIlluminance( Double.parseDouble(val) );
		else if ( param_handle == get_directNormalIlluminanceSource_handle() ) set_directNormalIlluminanceSource( val );
		else if ( param_handle == get_directNormalIlluminanceUncertainty_handle() ) set_directNormalIlluminanceUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_directNormalIrradiance_handle() ) set_directNormalIrradiance( Double.parseDouble(val) );
		else if ( param_handle == get_directNormalIrradianceSource_handle() ) set_directNormalIrradianceSource( val );
		else if ( param_handle == get_directNormalIrradianceUncertainty_handle() ) set_directNormalIrradianceUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_dryBulbTemperature_handle() ) set_dryBulbTemperature( Double.parseDouble(val) );
		else if ( param_handle == get_dryBulbTemperatureSource_handle() ) set_dryBulbTemperatureSource( val );
		else if ( param_handle == get_dryBulbTemperatureUncertainty_handle() ) set_dryBulbTemperatureUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_elevation_handle() ) set_elevation( Double.parseDouble(val) );
		else if ( param_handle == get_extraTerrestrialRadiation_handle() ) set_extraTerrestrialRadiation( Double.parseDouble(val) );
		else if ( param_handle == get_extraTerrestrialRadiationNormal_handle() ) set_extraTerrestrialRadiationNormal( Double.parseDouble(val) );
		else if ( param_handle == get_globalHorizontalIlluminance_handle() ) set_globalHorizontalIlluminance( Double.parseDouble(val) );
		else if ( param_handle == get_globalHorizontalIlluminanceSource_handle() ) set_globalHorizontalIlluminanceSource( val );
		else if ( param_handle == get_globalHorizontalIlluminanceUncertainty_handle() ) set_globalHorizontalIlluminanceUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_globalHorizontalIrradiance_handle() ) set_globalHorizontalIrradiance( Double.parseDouble(val) );
		else if ( param_handle == get_globalHorizontalIrradianceSource_handle() ) set_globalHorizontalIrradianceSource( val );
		else if ( param_handle == get_globalHorizontalIrradianceUncertainty_handle() ) set_globalHorizontalIrradianceUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_horizontalVisibility_handle() ) set_horizontalVisibility( Double.parseDouble(val) );
		else if ( param_handle == get_horizontalVisibilitySource_handle() ) set_horizontalVisibilitySource( val );
		else if ( param_handle == get_horizontalVisibilityUncertainty_handle() ) set_horizontalVisibilityUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_latitude_handle() ) set_latitude( Double.parseDouble(val) );
		else if ( param_handle == get_liquidPrecipitationDepth_handle() ) set_liquidPrecipitationDepth( Double.parseDouble(val) );
		else if ( param_handle == get_liquidPrecipitationDepthSource_handle() ) set_liquidPrecipitationDepthSource( val );
		else if ( param_handle == get_liquidPrecipitationDepthUncertainty_handle() ) set_liquidPrecipitationDepthUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_liquidPrecipitationQuantity_handle() ) set_liquidPrecipitationQuantity( Double.parseDouble(val) );
		else if ( param_handle == get_longitude_handle() ) set_longitude( Double.parseDouble(val) );
		else if ( param_handle == get_opaqueSkyCover_handle() ) set_opaqueSkyCover( Double.parseDouble(val) );
		else if ( param_handle == get_opaqueSkyCoverSource_handle() ) set_opaqueSkyCoverSource( val );
		else if ( param_handle == get_opaqueSkyCoverUncertainty_handle() ) set_opaqueSkyCoverUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_precipitableWater_handle() ) set_precipitableWater( Double.parseDouble(val) );
		else if ( param_handle == get_precipitableWaterSource_handle() ) set_precipitableWaterSource( val );
		else if ( param_handle == get_precipitableWaterUncertainty_handle() ) set_precipitableWaterUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_presentWeather_handle() ) set_presentWeather( Double.parseDouble(val) );
		else if ( param_handle == get_presentWeatherSource_handle() ) set_presentWeatherSource( val );
		else if ( param_handle == get_presentWeatherUncertainty_handle() ) set_presentWeatherUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_pressure_handle() ) set_pressure( Double.parseDouble(val) );
		else if ( param_handle == get_pressureSource_handle() ) set_pressureSource( val );
		else if ( param_handle == get_pressureUncertainty_handle() ) set_pressureUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_relativeHumidity_handle() ) set_relativeHumidity( Double.parseDouble(val) );
		else if ( param_handle == get_relativeHumiditySource_handle() ) set_relativeHumiditySource( val );
		else if ( param_handle == get_relativeHumidityUncertainty_handle() ) set_relativeHumidityUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_stationIDCode_handle() ) set_stationIDCode( Integer.parseInt(val) );
		else if ( param_handle == get_stationName_handle() ) set_stationName( val );
		else if ( param_handle == get_stationState_handle() ) set_stationState( val );
		else if ( param_handle == get_time_handle() ) set_time( val );
		else if ( param_handle == get_timeZone_handle() ) set_timeZone( Double.parseDouble(val) );
		else if ( param_handle == get_totalSkyCover_handle() ) set_totalSkyCover( Double.parseDouble(val) );
		else if ( param_handle == get_totalSkyCoverSource_handle() ) set_totalSkyCoverSource( val );
		else if ( param_handle == get_totalSkyCoverUncertainty_handle() ) set_totalSkyCoverUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_windDirection_handle() ) set_windDirection( Double.parseDouble(val) );
		else if ( param_handle == get_windDirectionSource_handle() ) set_windDirectionSource( val );
		else if ( param_handle == get_windDirectionUncertainty_handle() ) set_windDirectionUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_windSpeed_handle() ) set_windSpeed( Double.parseDouble(val) );
		else if ( param_handle == get_windSpeedSource_handle() ) set_windSpeedSource( val );
		else if ( param_handle == get_windSpeedUncertainty_handle() ) set_windSpeedUncertainty( Double.parseDouble(val) );
		else if ( param_handle == get_zenithLuminance_handle() ) set_zenithLuminance( Double.parseDouble(val) );
		else if ( param_handle == get_zenithLuminanceSource_handle() ) set_zenithLuminanceSource( val );
		else if ( param_handle == get_zenithLuminanceUncertianty_handle() ) set_zenithLuminanceUncertianty( Double.parseDouble(val) );
		else retval = super.setParameterAux( param_handle, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, String val ) {
		boolean retval = true;
		
			
		
		if (  "aerosolOpticalDepth".equals( datamemberName )  ) set_aerosolOpticalDepth( Double.parseDouble(val) );
		else if (  "aerosolOpticalDepthSource".equals( datamemberName )  ) set_aerosolOpticalDepthSource( val );
		else if (  "aerosolOpticalDepthUncertainty".equals( datamemberName )  ) set_aerosolOpticalDepthUncertainty( Double.parseDouble(val) );
		else if (  "albedo".equals( datamemberName )  ) set_albedo( Double.parseDouble(val) );
		else if (  "albedoSource".equals( datamemberName )  ) set_albedoSource( val );
		else if (  "albedoUncertainty".equals( datamemberName )  ) set_albedoUncertainty( Double.parseDouble(val) );
		else if (  "ceilingHeight".equals( datamemberName )  ) set_ceilingHeight( Double.parseDouble(val) );
		else if (  "ceilingHeightSource".equals( datamemberName )  ) set_ceilingHeightSource( val );
		else if (  "ceilingHeightUncertainty".equals( datamemberName )  ) set_ceilingHeightUncertainty( Double.parseDouble(val) );
		else if (  "date".equals( datamemberName )  ) set_date( val );
		else if (  "dewPointTemperature".equals( datamemberName )  ) set_dewPointTemperature( Double.parseDouble(val) );
		else if (  "dewPointTemperatureSource".equals( datamemberName )  ) set_dewPointTemperatureSource( val );
		else if (  "dewPointTemperatureUncertainty".equals( datamemberName )  ) set_dewPointTemperatureUncertainty( Double.parseDouble(val) );
		else if (  "diffuseHorizontalIlluminance".equals( datamemberName )  ) set_diffuseHorizontalIlluminance( Double.parseDouble(val) );
		else if (  "diffuseHorizontalIlluminanceSource".equals( datamemberName )  ) set_diffuseHorizontalIlluminanceSource( val );
		else if (  "diffuseHorizontalIlluminanceUncertainty".equals( datamemberName )  ) set_diffuseHorizontalIlluminanceUncertainty( Double.parseDouble(val) );
		else if (  "diffuseHorizontalIrradiancSource".equals( datamemberName )  ) set_diffuseHorizontalIrradiancSource( val );
		else if (  "diffuseHorizontalIrradiancUncertainty".equals( datamemberName )  ) set_diffuseHorizontalIrradiancUncertainty( Double.parseDouble(val) );
		else if (  "diffuseHorizontalIrradiance".equals( datamemberName )  ) set_diffuseHorizontalIrradiance( Double.parseDouble(val) );
		else if (  "directNormalIlluminance".equals( datamemberName )  ) set_directNormalIlluminance( Double.parseDouble(val) );
		else if (  "directNormalIlluminanceSource".equals( datamemberName )  ) set_directNormalIlluminanceSource( val );
		else if (  "directNormalIlluminanceUncertainty".equals( datamemberName )  ) set_directNormalIlluminanceUncertainty( Double.parseDouble(val) );
		else if (  "directNormalIrradiance".equals( datamemberName )  ) set_directNormalIrradiance( Double.parseDouble(val) );
		else if (  "directNormalIrradianceSource".equals( datamemberName )  ) set_directNormalIrradianceSource( val );
		else if (  "directNormalIrradianceUncertainty".equals( datamemberName )  ) set_directNormalIrradianceUncertainty( Double.parseDouble(val) );
		else if (  "dryBulbTemperature".equals( datamemberName )  ) set_dryBulbTemperature( Double.parseDouble(val) );
		else if (  "dryBulbTemperatureSource".equals( datamemberName )  ) set_dryBulbTemperatureSource( val );
		else if (  "dryBulbTemperatureUncertainty".equals( datamemberName )  ) set_dryBulbTemperatureUncertainty( Double.parseDouble(val) );
		else if (  "elevation".equals( datamemberName )  ) set_elevation( Double.parseDouble(val) );
		else if (  "extraTerrestrialRadiation".equals( datamemberName )  ) set_extraTerrestrialRadiation( Double.parseDouble(val) );
		else if (  "extraTerrestrialRadiationNormal".equals( datamemberName )  ) set_extraTerrestrialRadiationNormal( Double.parseDouble(val) );
		else if (  "globalHorizontalIlluminance".equals( datamemberName )  ) set_globalHorizontalIlluminance( Double.parseDouble(val) );
		else if (  "globalHorizontalIlluminanceSource".equals( datamemberName )  ) set_globalHorizontalIlluminanceSource( val );
		else if (  "globalHorizontalIlluminanceUncertainty".equals( datamemberName )  ) set_globalHorizontalIlluminanceUncertainty( Double.parseDouble(val) );
		else if (  "globalHorizontalIrradiance".equals( datamemberName )  ) set_globalHorizontalIrradiance( Double.parseDouble(val) );
		else if (  "globalHorizontalIrradianceSource".equals( datamemberName )  ) set_globalHorizontalIrradianceSource( val );
		else if (  "globalHorizontalIrradianceUncertainty".equals( datamemberName )  ) set_globalHorizontalIrradianceUncertainty( Double.parseDouble(val) );
		else if (  "horizontalVisibility".equals( datamemberName )  ) set_horizontalVisibility( Double.parseDouble(val) );
		else if (  "horizontalVisibilitySource".equals( datamemberName )  ) set_horizontalVisibilitySource( val );
		else if (  "horizontalVisibilityUncertainty".equals( datamemberName )  ) set_horizontalVisibilityUncertainty( Double.parseDouble(val) );
		else if (  "latitude".equals( datamemberName )  ) set_latitude( Double.parseDouble(val) );
		else if (  "liquidPrecipitationDepth".equals( datamemberName )  ) set_liquidPrecipitationDepth( Double.parseDouble(val) );
		else if (  "liquidPrecipitationDepthSource".equals( datamemberName )  ) set_liquidPrecipitationDepthSource( val );
		else if (  "liquidPrecipitationDepthUncertainty".equals( datamemberName )  ) set_liquidPrecipitationDepthUncertainty( Double.parseDouble(val) );
		else if (  "liquidPrecipitationQuantity".equals( datamemberName )  ) set_liquidPrecipitationQuantity( Double.parseDouble(val) );
		else if (  "longitude".equals( datamemberName )  ) set_longitude( Double.parseDouble(val) );
		else if (  "opaqueSkyCover".equals( datamemberName )  ) set_opaqueSkyCover( Double.parseDouble(val) );
		else if (  "opaqueSkyCoverSource".equals( datamemberName )  ) set_opaqueSkyCoverSource( val );
		else if (  "opaqueSkyCoverUncertainty".equals( datamemberName )  ) set_opaqueSkyCoverUncertainty( Double.parseDouble(val) );
		else if (  "precipitableWater".equals( datamemberName )  ) set_precipitableWater( Double.parseDouble(val) );
		else if (  "precipitableWaterSource".equals( datamemberName )  ) set_precipitableWaterSource( val );
		else if (  "precipitableWaterUncertainty".equals( datamemberName )  ) set_precipitableWaterUncertainty( Double.parseDouble(val) );
		else if (  "presentWeather".equals( datamemberName )  ) set_presentWeather( Double.parseDouble(val) );
		else if (  "presentWeatherSource".equals( datamemberName )  ) set_presentWeatherSource( val );
		else if (  "presentWeatherUncertainty".equals( datamemberName )  ) set_presentWeatherUncertainty( Double.parseDouble(val) );
		else if (  "pressure".equals( datamemberName )  ) set_pressure( Double.parseDouble(val) );
		else if (  "pressureSource".equals( datamemberName )  ) set_pressureSource( val );
		else if (  "pressureUncertainty".equals( datamemberName )  ) set_pressureUncertainty( Double.parseDouble(val) );
		else if (  "relativeHumidity".equals( datamemberName )  ) set_relativeHumidity( Double.parseDouble(val) );
		else if (  "relativeHumiditySource".equals( datamemberName )  ) set_relativeHumiditySource( val );
		else if (  "relativeHumidityUncertainty".equals( datamemberName )  ) set_relativeHumidityUncertainty( Double.parseDouble(val) );
		else if (  "stationIDCode".equals( datamemberName )  ) set_stationIDCode( Integer.parseInt(val) );
		else if (  "stationName".equals( datamemberName )  ) set_stationName( val );
		else if (  "stationState".equals( datamemberName )  ) set_stationState( val );
		else if (  "time".equals( datamemberName )  ) set_time( val );
		else if (  "timeZone".equals( datamemberName )  ) set_timeZone( Double.parseDouble(val) );
		else if (  "totalSkyCover".equals( datamemberName )  ) set_totalSkyCover( Double.parseDouble(val) );
		else if (  "totalSkyCoverSource".equals( datamemberName )  ) set_totalSkyCoverSource( val );
		else if (  "totalSkyCoverUncertainty".equals( datamemberName )  ) set_totalSkyCoverUncertainty( Double.parseDouble(val) );
		else if (  "windDirection".equals( datamemberName )  ) set_windDirection( Double.parseDouble(val) );
		else if (  "windDirectionSource".equals( datamemberName )  ) set_windDirectionSource( val );
		else if (  "windDirectionUncertainty".equals( datamemberName )  ) set_windDirectionUncertainty( Double.parseDouble(val) );
		else if (  "windSpeed".equals( datamemberName )  ) set_windSpeed( Double.parseDouble(val) );
		else if (  "windSpeedSource".equals( datamemberName )  ) set_windSpeedSource( val );
		else if (  "windSpeedUncertainty".equals( datamemberName )  ) set_windSpeedUncertainty( Double.parseDouble(val) );
		else if (  "zenithLuminance".equals( datamemberName )  ) set_zenithLuminance( Double.parseDouble(val) );
		else if (  "zenithLuminanceSource".equals( datamemberName )  ) set_zenithLuminanceSource( val );
		else if (  "zenithLuminanceUncertianty".equals( datamemberName )  ) set_zenithLuminanceUncertianty( Double.parseDouble(val) );	
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}
	
	protected boolean setParameterAux( String datamemberName, Object val ) {
		boolean retval = true;
		
		
		
		if (  "aerosolOpticalDepth".equals( datamemberName )  ) set_aerosolOpticalDepth( (Double)val );
		else if (  "aerosolOpticalDepthSource".equals( datamemberName )  ) set_aerosolOpticalDepthSource( (String)val );
		else if (  "aerosolOpticalDepthUncertainty".equals( datamemberName )  ) set_aerosolOpticalDepthUncertainty( (Double)val );
		else if (  "albedo".equals( datamemberName )  ) set_albedo( (Double)val );
		else if (  "albedoSource".equals( datamemberName )  ) set_albedoSource( (String)val );
		else if (  "albedoUncertainty".equals( datamemberName )  ) set_albedoUncertainty( (Double)val );
		else if (  "ceilingHeight".equals( datamemberName )  ) set_ceilingHeight( (Double)val );
		else if (  "ceilingHeightSource".equals( datamemberName )  ) set_ceilingHeightSource( (String)val );
		else if (  "ceilingHeightUncertainty".equals( datamemberName )  ) set_ceilingHeightUncertainty( (Double)val );
		else if (  "date".equals( datamemberName )  ) set_date( (String)val );
		else if (  "dewPointTemperature".equals( datamemberName )  ) set_dewPointTemperature( (Double)val );
		else if (  "dewPointTemperatureSource".equals( datamemberName )  ) set_dewPointTemperatureSource( (String)val );
		else if (  "dewPointTemperatureUncertainty".equals( datamemberName )  ) set_dewPointTemperatureUncertainty( (Double)val );
		else if (  "diffuseHorizontalIlluminance".equals( datamemberName )  ) set_diffuseHorizontalIlluminance( (Double)val );
		else if (  "diffuseHorizontalIlluminanceSource".equals( datamemberName )  ) set_diffuseHorizontalIlluminanceSource( (String)val );
		else if (  "diffuseHorizontalIlluminanceUncertainty".equals( datamemberName )  ) set_diffuseHorizontalIlluminanceUncertainty( (Double)val );
		else if (  "diffuseHorizontalIrradiancSource".equals( datamemberName )  ) set_diffuseHorizontalIrradiancSource( (String)val );
		else if (  "diffuseHorizontalIrradiancUncertainty".equals( datamemberName )  ) set_diffuseHorizontalIrradiancUncertainty( (Double)val );
		else if (  "diffuseHorizontalIrradiance".equals( datamemberName )  ) set_diffuseHorizontalIrradiance( (Double)val );
		else if (  "directNormalIlluminance".equals( datamemberName )  ) set_directNormalIlluminance( (Double)val );
		else if (  "directNormalIlluminanceSource".equals( datamemberName )  ) set_directNormalIlluminanceSource( (String)val );
		else if (  "directNormalIlluminanceUncertainty".equals( datamemberName )  ) set_directNormalIlluminanceUncertainty( (Double)val );
		else if (  "directNormalIrradiance".equals( datamemberName )  ) set_directNormalIrradiance( (Double)val );
		else if (  "directNormalIrradianceSource".equals( datamemberName )  ) set_directNormalIrradianceSource( (String)val );
		else if (  "directNormalIrradianceUncertainty".equals( datamemberName )  ) set_directNormalIrradianceUncertainty( (Double)val );
		else if (  "dryBulbTemperature".equals( datamemberName )  ) set_dryBulbTemperature( (Double)val );
		else if (  "dryBulbTemperatureSource".equals( datamemberName )  ) set_dryBulbTemperatureSource( (String)val );
		else if (  "dryBulbTemperatureUncertainty".equals( datamemberName )  ) set_dryBulbTemperatureUncertainty( (Double)val );
		else if (  "elevation".equals( datamemberName )  ) set_elevation( (Double)val );
		else if (  "extraTerrestrialRadiation".equals( datamemberName )  ) set_extraTerrestrialRadiation( (Double)val );
		else if (  "extraTerrestrialRadiationNormal".equals( datamemberName )  ) set_extraTerrestrialRadiationNormal( (Double)val );
		else if (  "globalHorizontalIlluminance".equals( datamemberName )  ) set_globalHorizontalIlluminance( (Double)val );
		else if (  "globalHorizontalIlluminanceSource".equals( datamemberName )  ) set_globalHorizontalIlluminanceSource( (String)val );
		else if (  "globalHorizontalIlluminanceUncertainty".equals( datamemberName )  ) set_globalHorizontalIlluminanceUncertainty( (Double)val );
		else if (  "globalHorizontalIrradiance".equals( datamemberName )  ) set_globalHorizontalIrradiance( (Double)val );
		else if (  "globalHorizontalIrradianceSource".equals( datamemberName )  ) set_globalHorizontalIrradianceSource( (String)val );
		else if (  "globalHorizontalIrradianceUncertainty".equals( datamemberName )  ) set_globalHorizontalIrradianceUncertainty( (Double)val );
		else if (  "horizontalVisibility".equals( datamemberName )  ) set_horizontalVisibility( (Double)val );
		else if (  "horizontalVisibilitySource".equals( datamemberName )  ) set_horizontalVisibilitySource( (String)val );
		else if (  "horizontalVisibilityUncertainty".equals( datamemberName )  ) set_horizontalVisibilityUncertainty( (Double)val );
		else if (  "latitude".equals( datamemberName )  ) set_latitude( (Double)val );
		else if (  "liquidPrecipitationDepth".equals( datamemberName )  ) set_liquidPrecipitationDepth( (Double)val );
		else if (  "liquidPrecipitationDepthSource".equals( datamemberName )  ) set_liquidPrecipitationDepthSource( (String)val );
		else if (  "liquidPrecipitationDepthUncertainty".equals( datamemberName )  ) set_liquidPrecipitationDepthUncertainty( (Double)val );
		else if (  "liquidPrecipitationQuantity".equals( datamemberName )  ) set_liquidPrecipitationQuantity( (Double)val );
		else if (  "longitude".equals( datamemberName )  ) set_longitude( (Double)val );
		else if (  "opaqueSkyCover".equals( datamemberName )  ) set_opaqueSkyCover( (Double)val );
		else if (  "opaqueSkyCoverSource".equals( datamemberName )  ) set_opaqueSkyCoverSource( (String)val );
		else if (  "opaqueSkyCoverUncertainty".equals( datamemberName )  ) set_opaqueSkyCoverUncertainty( (Double)val );
		else if (  "precipitableWater".equals( datamemberName )  ) set_precipitableWater( (Double)val );
		else if (  "precipitableWaterSource".equals( datamemberName )  ) set_precipitableWaterSource( (String)val );
		else if (  "precipitableWaterUncertainty".equals( datamemberName )  ) set_precipitableWaterUncertainty( (Double)val );
		else if (  "presentWeather".equals( datamemberName )  ) set_presentWeather( (Double)val );
		else if (  "presentWeatherSource".equals( datamemberName )  ) set_presentWeatherSource( (String)val );
		else if (  "presentWeatherUncertainty".equals( datamemberName )  ) set_presentWeatherUncertainty( (Double)val );
		else if (  "pressure".equals( datamemberName )  ) set_pressure( (Double)val );
		else if (  "pressureSource".equals( datamemberName )  ) set_pressureSource( (String)val );
		else if (  "pressureUncertainty".equals( datamemberName )  ) set_pressureUncertainty( (Double)val );
		else if (  "relativeHumidity".equals( datamemberName )  ) set_relativeHumidity( (Double)val );
		else if (  "relativeHumiditySource".equals( datamemberName )  ) set_relativeHumiditySource( (String)val );
		else if (  "relativeHumidityUncertainty".equals( datamemberName )  ) set_relativeHumidityUncertainty( (Double)val );
		else if (  "stationIDCode".equals( datamemberName )  ) set_stationIDCode( (Integer)val );
		else if (  "stationName".equals( datamemberName )  ) set_stationName( (String)val );
		else if (  "stationState".equals( datamemberName )  ) set_stationState( (String)val );
		else if (  "time".equals( datamemberName )  ) set_time( (String)val );
		else if (  "timeZone".equals( datamemberName )  ) set_timeZone( (Double)val );
		else if (  "totalSkyCover".equals( datamemberName )  ) set_totalSkyCover( (Double)val );
		else if (  "totalSkyCoverSource".equals( datamemberName )  ) set_totalSkyCoverSource( (String)val );
		else if (  "totalSkyCoverUncertainty".equals( datamemberName )  ) set_totalSkyCoverUncertainty( (Double)val );
		else if (  "windDirection".equals( datamemberName )  ) set_windDirection( (Double)val );
		else if (  "windDirectionSource".equals( datamemberName )  ) set_windDirectionSource( (String)val );
		else if (  "windDirectionUncertainty".equals( datamemberName )  ) set_windDirectionUncertainty( (Double)val );
		else if (  "windSpeed".equals( datamemberName )  ) set_windSpeed( (Double)val );
		else if (  "windSpeedSource".equals( datamemberName )  ) set_windSpeedSource( (String)val );
		else if (  "windSpeedUncertainty".equals( datamemberName )  ) set_windSpeedUncertainty( (Double)val );
		else if (  "zenithLuminance".equals( datamemberName )  ) set_zenithLuminance( (Double)val );
		else if (  "zenithLuminanceSource".equals( datamemberName )  ) set_zenithLuminanceSource( (String)val );
		else if (  "zenithLuminanceUncertianty".equals( datamemberName )  ) set_zenithLuminanceUncertianty( (Double)val );		
		else retval = super.setParameterAux( datamemberName, val );
		
		return retval;
	}

	protected SuppliedParameters createSuppliedDatamembers() {
		SuppliedParameters datamembers = super.createSuppliedDatamembers();

	
		
		
			datamembers.add( get_aerosolOpticalDepth_handle(), Double.toString(get_aerosolOpticalDepth()).getBytes() );
		
			datamembers.add( get_aerosolOpticalDepthSource_handle(), get_aerosolOpticalDepthSource().getBytes() );
		
			datamembers.add( get_aerosolOpticalDepthUncertainty_handle(), Double.toString(get_aerosolOpticalDepthUncertainty()).getBytes() );
		
			datamembers.add( get_albedo_handle(), Double.toString(get_albedo()).getBytes() );
		
			datamembers.add( get_albedoSource_handle(), get_albedoSource().getBytes() );
		
			datamembers.add( get_albedoUncertainty_handle(), Double.toString(get_albedoUncertainty()).getBytes() );
		
			datamembers.add( get_ceilingHeight_handle(), Double.toString(get_ceilingHeight()).getBytes() );
		
			datamembers.add( get_ceilingHeightSource_handle(), get_ceilingHeightSource().getBytes() );
		
			datamembers.add( get_ceilingHeightUncertainty_handle(), Double.toString(get_ceilingHeightUncertainty()).getBytes() );
		
			datamembers.add( get_date_handle(), get_date().getBytes() );
		
			datamembers.add( get_dewPointTemperature_handle(), Double.toString(get_dewPointTemperature()).getBytes() );
		
			datamembers.add( get_dewPointTemperatureSource_handle(), get_dewPointTemperatureSource().getBytes() );
		
			datamembers.add( get_dewPointTemperatureUncertainty_handle(), Double.toString(get_dewPointTemperatureUncertainty()).getBytes() );
		
			datamembers.add( get_diffuseHorizontalIlluminance_handle(), Double.toString(get_diffuseHorizontalIlluminance()).getBytes() );
		
			datamembers.add( get_diffuseHorizontalIlluminanceSource_handle(), get_diffuseHorizontalIlluminanceSource().getBytes() );
		
			datamembers.add( get_diffuseHorizontalIlluminanceUncertainty_handle(), Double.toString(get_diffuseHorizontalIlluminanceUncertainty()).getBytes() );
		
			datamembers.add( get_diffuseHorizontalIrradiancSource_handle(), get_diffuseHorizontalIrradiancSource().getBytes() );
		
			datamembers.add( get_diffuseHorizontalIrradiancUncertainty_handle(), Double.toString(get_diffuseHorizontalIrradiancUncertainty()).getBytes() );
		
			datamembers.add( get_diffuseHorizontalIrradiance_handle(), Double.toString(get_diffuseHorizontalIrradiance()).getBytes() );
		
			datamembers.add( get_directNormalIlluminance_handle(), Double.toString(get_directNormalIlluminance()).getBytes() );
		
			datamembers.add( get_directNormalIlluminanceSource_handle(), get_directNormalIlluminanceSource().getBytes() );
		
			datamembers.add( get_directNormalIlluminanceUncertainty_handle(), Double.toString(get_directNormalIlluminanceUncertainty()).getBytes() );
		
			datamembers.add( get_directNormalIrradiance_handle(), Double.toString(get_directNormalIrradiance()).getBytes() );
		
			datamembers.add( get_directNormalIrradianceSource_handle(), get_directNormalIrradianceSource().getBytes() );
		
			datamembers.add( get_directNormalIrradianceUncertainty_handle(), Double.toString(get_directNormalIrradianceUncertainty()).getBytes() );
		
			datamembers.add( get_dryBulbTemperature_handle(), Double.toString(get_dryBulbTemperature()).getBytes() );
		
			datamembers.add( get_dryBulbTemperatureSource_handle(), get_dryBulbTemperatureSource().getBytes() );
		
			datamembers.add( get_dryBulbTemperatureUncertainty_handle(), Double.toString(get_dryBulbTemperatureUncertainty()).getBytes() );
		
			datamembers.add( get_elevation_handle(), Double.toString(get_elevation()).getBytes() );
		
			datamembers.add( get_extraTerrestrialRadiation_handle(), Double.toString(get_extraTerrestrialRadiation()).getBytes() );
		
			datamembers.add( get_extraTerrestrialRadiationNormal_handle(), Double.toString(get_extraTerrestrialRadiationNormal()).getBytes() );
		
			datamembers.add( get_globalHorizontalIlluminance_handle(), Double.toString(get_globalHorizontalIlluminance()).getBytes() );
		
			datamembers.add( get_globalHorizontalIlluminanceSource_handle(), get_globalHorizontalIlluminanceSource().getBytes() );
		
			datamembers.add( get_globalHorizontalIlluminanceUncertainty_handle(), Double.toString(get_globalHorizontalIlluminanceUncertainty()).getBytes() );
		
			datamembers.add( get_globalHorizontalIrradiance_handle(), Double.toString(get_globalHorizontalIrradiance()).getBytes() );
		
			datamembers.add( get_globalHorizontalIrradianceSource_handle(), get_globalHorizontalIrradianceSource().getBytes() );
		
			datamembers.add( get_globalHorizontalIrradianceUncertainty_handle(), Double.toString(get_globalHorizontalIrradianceUncertainty()).getBytes() );
		
			datamembers.add( get_horizontalVisibility_handle(), Double.toString(get_horizontalVisibility()).getBytes() );
		
			datamembers.add( get_horizontalVisibilitySource_handle(), get_horizontalVisibilitySource().getBytes() );
		
			datamembers.add( get_horizontalVisibilityUncertainty_handle(), Double.toString(get_horizontalVisibilityUncertainty()).getBytes() );
		
			datamembers.add( get_latitude_handle(), Double.toString(get_latitude()).getBytes() );
		
			datamembers.add( get_liquidPrecipitationDepth_handle(), Double.toString(get_liquidPrecipitationDepth()).getBytes() );
		
			datamembers.add( get_liquidPrecipitationDepthSource_handle(), get_liquidPrecipitationDepthSource().getBytes() );
		
			datamembers.add( get_liquidPrecipitationDepthUncertainty_handle(), Double.toString(get_liquidPrecipitationDepthUncertainty()).getBytes() );
		
			datamembers.add( get_liquidPrecipitationQuantity_handle(), Double.toString(get_liquidPrecipitationQuantity()).getBytes() );
		
			datamembers.add( get_longitude_handle(), Double.toString(get_longitude()).getBytes() );
		
			datamembers.add( get_opaqueSkyCover_handle(), Double.toString(get_opaqueSkyCover()).getBytes() );
		
			datamembers.add( get_opaqueSkyCoverSource_handle(), get_opaqueSkyCoverSource().getBytes() );
		
			datamembers.add( get_opaqueSkyCoverUncertainty_handle(), Double.toString(get_opaqueSkyCoverUncertainty()).getBytes() );
		
			datamembers.add( get_precipitableWater_handle(), Double.toString(get_precipitableWater()).getBytes() );
		
			datamembers.add( get_precipitableWaterSource_handle(), get_precipitableWaterSource().getBytes() );
		
			datamembers.add( get_precipitableWaterUncertainty_handle(), Double.toString(get_precipitableWaterUncertainty()).getBytes() );
		
			datamembers.add( get_presentWeather_handle(), Double.toString(get_presentWeather()).getBytes() );
		
			datamembers.add( get_presentWeatherSource_handle(), get_presentWeatherSource().getBytes() );
		
			datamembers.add( get_presentWeatherUncertainty_handle(), Double.toString(get_presentWeatherUncertainty()).getBytes() );
		
			datamembers.add( get_pressure_handle(), Double.toString(get_pressure()).getBytes() );
		
			datamembers.add( get_pressureSource_handle(), get_pressureSource().getBytes() );
		
			datamembers.add( get_pressureUncertainty_handle(), Double.toString(get_pressureUncertainty()).getBytes() );
		
			datamembers.add( get_relativeHumidity_handle(), Double.toString(get_relativeHumidity()).getBytes() );
		
			datamembers.add( get_relativeHumiditySource_handle(), get_relativeHumiditySource().getBytes() );
		
			datamembers.add( get_relativeHumidityUncertainty_handle(), Double.toString(get_relativeHumidityUncertainty()).getBytes() );
		
			datamembers.add( get_stationIDCode_handle(), Integer.toString(get_stationIDCode()).getBytes() );
		
			datamembers.add( get_stationName_handle(), get_stationName().getBytes() );
		
			datamembers.add( get_stationState_handle(), get_stationState().getBytes() );
		
			datamembers.add( get_time_handle(), get_time().getBytes() );
		
			datamembers.add( get_timeZone_handle(), Double.toString(get_timeZone()).getBytes() );
		
			datamembers.add( get_totalSkyCover_handle(), Double.toString(get_totalSkyCover()).getBytes() );
		
			datamembers.add( get_totalSkyCoverSource_handle(), get_totalSkyCoverSource().getBytes() );
		
			datamembers.add( get_totalSkyCoverUncertainty_handle(), Double.toString(get_totalSkyCoverUncertainty()).getBytes() );
		
			datamembers.add( get_windDirection_handle(), Double.toString(get_windDirection()).getBytes() );
		
			datamembers.add( get_windDirectionSource_handle(), get_windDirectionSource().getBytes() );
		
			datamembers.add( get_windDirectionUncertainty_handle(), Double.toString(get_windDirectionUncertainty()).getBytes() );
		
			datamembers.add( get_windSpeed_handle(), Double.toString(get_windSpeed()).getBytes() );
		
			datamembers.add( get_windSpeedSource_handle(), get_windSpeedSource().getBytes() );
		
			datamembers.add( get_windSpeedUncertainty_handle(), Double.toString(get_windSpeedUncertainty()).getBytes() );
		
			datamembers.add( get_zenithLuminance_handle(), Double.toString(get_zenithLuminance()).getBytes() );
		
			datamembers.add( get_zenithLuminanceSource_handle(), get_zenithLuminanceSource().getBytes() );
		
			datamembers.add( get_zenithLuminanceUncertianty_handle(), Double.toString(get_zenithLuminanceUncertianty()).getBytes() );
		
	
		return datamembers;
	}

	
	public void copyFrom( Object object ) {
		super.copyFrom( object );
		if ( object instanceof TMYWeather ) {
			TMYWeather data = (TMYWeather)object;
			
			
				_aerosolOpticalDepth = data._aerosolOpticalDepth;
				_aerosolOpticalDepthSource = data._aerosolOpticalDepthSource;
				_aerosolOpticalDepthUncertainty = data._aerosolOpticalDepthUncertainty;
				_albedo = data._albedo;
				_albedoSource = data._albedoSource;
				_albedoUncertainty = data._albedoUncertainty;
				_ceilingHeight = data._ceilingHeight;
				_ceilingHeightSource = data._ceilingHeightSource;
				_ceilingHeightUncertainty = data._ceilingHeightUncertainty;
				_date = data._date;
				_dewPointTemperature = data._dewPointTemperature;
				_dewPointTemperatureSource = data._dewPointTemperatureSource;
				_dewPointTemperatureUncertainty = data._dewPointTemperatureUncertainty;
				_diffuseHorizontalIlluminance = data._diffuseHorizontalIlluminance;
				_diffuseHorizontalIlluminanceSource = data._diffuseHorizontalIlluminanceSource;
				_diffuseHorizontalIlluminanceUncertainty = data._diffuseHorizontalIlluminanceUncertainty;
				_diffuseHorizontalIrradiancSource = data._diffuseHorizontalIrradiancSource;
				_diffuseHorizontalIrradiancUncertainty = data._diffuseHorizontalIrradiancUncertainty;
				_diffuseHorizontalIrradiance = data._diffuseHorizontalIrradiance;
				_directNormalIlluminance = data._directNormalIlluminance;
				_directNormalIlluminanceSource = data._directNormalIlluminanceSource;
				_directNormalIlluminanceUncertainty = data._directNormalIlluminanceUncertainty;
				_directNormalIrradiance = data._directNormalIrradiance;
				_directNormalIrradianceSource = data._directNormalIrradianceSource;
				_directNormalIrradianceUncertainty = data._directNormalIrradianceUncertainty;
				_dryBulbTemperature = data._dryBulbTemperature;
				_dryBulbTemperatureSource = data._dryBulbTemperatureSource;
				_dryBulbTemperatureUncertainty = data._dryBulbTemperatureUncertainty;
				_elevation = data._elevation;
				_extraTerrestrialRadiation = data._extraTerrestrialRadiation;
				_extraTerrestrialRadiationNormal = data._extraTerrestrialRadiationNormal;
				_globalHorizontalIlluminance = data._globalHorizontalIlluminance;
				_globalHorizontalIlluminanceSource = data._globalHorizontalIlluminanceSource;
				_globalHorizontalIlluminanceUncertainty = data._globalHorizontalIlluminanceUncertainty;
				_globalHorizontalIrradiance = data._globalHorizontalIrradiance;
				_globalHorizontalIrradianceSource = data._globalHorizontalIrradianceSource;
				_globalHorizontalIrradianceUncertainty = data._globalHorizontalIrradianceUncertainty;
				_horizontalVisibility = data._horizontalVisibility;
				_horizontalVisibilitySource = data._horizontalVisibilitySource;
				_horizontalVisibilityUncertainty = data._horizontalVisibilityUncertainty;
				_latitude = data._latitude;
				_liquidPrecipitationDepth = data._liquidPrecipitationDepth;
				_liquidPrecipitationDepthSource = data._liquidPrecipitationDepthSource;
				_liquidPrecipitationDepthUncertainty = data._liquidPrecipitationDepthUncertainty;
				_liquidPrecipitationQuantity = data._liquidPrecipitationQuantity;
				_longitude = data._longitude;
				_opaqueSkyCover = data._opaqueSkyCover;
				_opaqueSkyCoverSource = data._opaqueSkyCoverSource;
				_opaqueSkyCoverUncertainty = data._opaqueSkyCoverUncertainty;
				_precipitableWater = data._precipitableWater;
				_precipitableWaterSource = data._precipitableWaterSource;
				_precipitableWaterUncertainty = data._precipitableWaterUncertainty;
				_presentWeather = data._presentWeather;
				_presentWeatherSource = data._presentWeatherSource;
				_presentWeatherUncertainty = data._presentWeatherUncertainty;
				_pressure = data._pressure;
				_pressureSource = data._pressureSource;
				_pressureUncertainty = data._pressureUncertainty;
				_relativeHumidity = data._relativeHumidity;
				_relativeHumiditySource = data._relativeHumiditySource;
				_relativeHumidityUncertainty = data._relativeHumidityUncertainty;
				_stationIDCode = data._stationIDCode;
				_stationName = data._stationName;
				_stationState = data._stationState;
				_time = data._time;
				_timeZone = data._timeZone;
				_totalSkyCover = data._totalSkyCover;
				_totalSkyCoverSource = data._totalSkyCoverSource;
				_totalSkyCoverUncertainty = data._totalSkyCoverUncertainty;
				_windDirection = data._windDirection;
				_windDirectionSource = data._windDirectionSource;
				_windDirectionUncertainty = data._windDirectionUncertainty;
				_windSpeed = data._windSpeed;
				_windSpeedSource = data._windSpeedSource;
				_windSpeedUncertainty = data._windSpeedUncertainty;
				_zenithLuminance = data._zenithLuminance;
				_zenithLuminanceSource = data._zenithLuminanceSource;
				_zenithLuminanceUncertianty = data._zenithLuminanceUncertianty;
			
		}
	}
}
