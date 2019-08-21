package WeatherFederate;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/**
 * The federate federate for the federation federation designed in WebGME.
 *
 * This federate MUST join the federation before the federation manager starts the experiment.
 * This means that, when the federate joins, the federation logical time must be 0 and both
 * the readyToPopulate and the readyToRun synchronization points must be defined.
 */
public class Weather extends WeatherBase {

    private final static Logger log = LogManager.getLogger(Weather.class);

    double currentTime = 0;

    public Weather(FederateConfig params) throws Exception {
        super(params);
    }

	// int interpolateType
	public enum InterpolateType {
		NONE, LINEAR, QUADRATIC
	}

	// create interaction for use
	TMYWeather tMY3WeatherData = create_TMYWeather();
	
	InterpolateType dointerpolate = InterpolateType.QUADRATIC;

	String numOfLoop;
	boolean receivedSimTime = false;
	boolean firsttime = true;

	// time elements
	long startTime = 0;// 1243947600; 6/2/2009 9:00:00
	double ignoreTil = 1000;
	double logicalTimeSec = 1;

	long dttime; // current date and time in msec
	long soytime; // start of year time in msec
	Calendar dt = null;
	Calendar soy = null;

	int hoy = 0; // hour of year
	double hoy0 = 0; // hour
	double hoy1 = 0;// hour
	double hoy2 = 0; // hour
	double now = 0;// minutes
	Long thisTime;

	// TMY3 Data elements
	Tmy3Data[] tmy3Data = null;

	public class Tmy3Data {
		public double diffuseHorizontalIlluminance = 0;
		public String ceilingHeightSource = "";
		public String precipitableWaterSource = "";
		public String opaqueSkyCoverSource = "";
		public double aerosolOpticalDepth = 0;
		public double directNormalIlluminanceUncertainty = 0;
		public String stationName = "";
		public String zenithLuminanceSource = "";
		public String diffuseHorizontalIrradiancSource = "";
		public double albedo = 0;
		public double windDirectionUncertainty = 0;
		public double windSpeed = 0;
		public String windSpeedSource = "";
		public double zenithLuminance = 0;
		public String stationState = "";
		public double globalHorizontalIrradiance = 0;
		public double ceilingHeightUncertainty = 0;
		public double elevation = 0;
		public double horizontalVisibility = 0;
		public String globalHorizontalIrradianceSource = "";
		public double pressureUncertainty = 0;
		public double dewPointTemperature = 0;
		public double dryBulbTemperature = 0;
		public String albedoSource = "";
		public double latitude = 0;
		public String globalHorizontalIlluminanceSource = "";
		public String horizontalVisibilitySource = "";
		public double globalHorizontalIlluminanceUncertainty = 0;
		public double zenithLuminanceUncertianty = 0;
		public double timeZone = 0;
		public String aerosolOpticalDepthSource = "";
		public double aerosolOpticalDepthUncertainty = 0;
		public double albedoUncertainty = 0;
		public double longitude = 0;
		public int stationIDCode = 0;
		public String date = "";
		public double ceilingHeight = 0;
		public String dewPointTemperatureSource = "";
		public double dewPointTemperatureUncertainty = 0;
		public double windSpeedUncertainty = 0;
		public String diffuseHorizontalIlluminanceSource = "";
		public double diffuseHorizontalIlluminanceUncertainty = 0;
		public double diffuseHorizontalIrradiance = 0;
		public double diffuseHorizontalIrradiancUncertainty = 0;
		public double directNormalIlluminance = 0;
		public String directNormalIlluminanceSource = "";
		public double directNormalIrradiance = 0;
		public String directNormalIrradianceSource = "";
		public double directNormalIrradianceUncertainty = 0;
		public String dryBulbTemperatureSource = "";
		public double dryBulbTemperatureUncertainty = 0;
		public double extraTerrestrialRadiation = 0;
		public double extraTerrestrialRadiationNormal = 0;
		public double globalHorizontalIlluminance = 0;
		public double globalHorizontalIrradianceUncertainty = 0;
		public double horizontalVisibilityUncertainty = 0;
		public double liquidPrecipitationDepth = 0;
		public String liquidPrecipitationDepthSource = "";
		public double liquidPrecipitationDepthUncertainty = 0;
		public double liquidPrecipitationQuantity = 0;
		public double opaqueSkyCoverUncertainty = 0;
		public double precipitableWater = 0;
		public double precipitableWaterUncertainty = 0;
		public double presentWeather = 0;
		public String presentWeatherSource = "";
		public double presentWeatherUncertainty = 0;
		public double opaqueSkyCover = 0;
		public double relativeHumidity = 0;
		public String relativeHumiditySource = "";
		public double relativeHumidityUncertainty = 0;
		public double pressure = 0;
		public String pressureSource = "";
		public double totalSkyCover = 0;
		public String totalSkyCoverSource = "";
		public double totalSkyCoverUncertainty = 0;
		public String time = "";
		public String windDirectionSource = "";
		public double windDirection = 0;

		public Tmy3Data() {

		}
	}

	/////////////////////////////////////////////
	// Read in tmy3 data file //
	/////////////////////////////////////////////
	private void readTmy3Data(){
		File fileName = new File("tmy3.csv");
		//File outputDataFileName = new File("tmy3InterpolatedData.csv");
		String tmy3HeaderMsg[] = { "" };
//		String tmy3DataHeaderMsg[] = { "" };
		String tmy3DataFields[] = { "" };
	
		BufferedReader reader = null;
	
		try {
			reader = new BufferedReader(new FileReader(fileName));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}
	
		try {
			String line = "";
			// read first line
			line = reader.readLine();
	
			tmy3HeaderMsg = line.split(",", -1);
			for (int k = 0; k < tmy3HeaderMsg.length; k++) {
				if (k == 0) {
					log.info("Station ID Code=:" + tmy3HeaderMsg[0]);
					Integer i = Integer.parseInt(tmy3HeaderMsg[0]);
					tMY3WeatherData.set_stationIDCode(i);
				} else if (k == 1) {
					log.info("Station Name=:" + tmy3HeaderMsg[1]);
					tMY3WeatherData.set_stationName(tmy3HeaderMsg[1]);
				} else if (k == 2) {
					log.info("State Name=:" + tmy3HeaderMsg[2]);
					tMY3WeatherData.set_stationState(tmy3HeaderMsg[2]);
				} else if (k == 3) {
					log.info("Time zone=:" + tmy3HeaderMsg[3]);
					tMY3WeatherData.set_timeZone(Float.parseFloat(tmy3HeaderMsg[3]));
				} else if (k == 4) {
					log.info("Latitude=:" + tmy3HeaderMsg[4]);
					tMY3WeatherData.set_latitude(Double.parseDouble(tmy3HeaderMsg[4]));
				} else if (k == 5) {
					log.info("Longitude=:" + tmy3HeaderMsg[5]);
					tMY3WeatherData.set_longitude(Double.parseDouble(tmy3HeaderMsg[5]));
				} else if (k == 6) {
					log.info("Elevation=:" + tmy3HeaderMsg[6]);
					tMY3WeatherData.set_elevation(Integer.parseInt(tmy3HeaderMsg[6]));
				}
			}
	
			// read second line
			line = reader.readLine();
			//tmy3DataHeaderMsg = line.split(",", -1);
	
			// read rest of file
			tmy3Data = new Tmy3Data[8760]; // initialize array
			// log.info(""+tmy3Data.length);
	
			for (int i = 0; i < tmy3Data.length; i++) {
				tmy3Data[i] = new Tmy3Data(); // initialize each element of array
			}
	
			for (int k = 0; k < tmy3Data.length; k++) {
				line = reader.readLine();
				if (line != null) {
					// log.info("Line No.=: "+k);
					tmy3DataFields = line.split(",", -1);
	
					// log.info("Date=:"+tmy3DataFields[0]);
					tmy3Data[k].date = tmy3DataFields[0];
					tmy3Data[k].time = tmy3DataFields[1];
	
					tmy3Data[k].extraTerrestrialRadiation = Double.parseDouble(tmy3DataFields[2]);
					tmy3Data[k].extraTerrestrialRadiationNormal = Double.parseDouble(tmy3DataFields[3]);
	
					tmy3Data[k].globalHorizontalIrradiance = Double.parseDouble(tmy3DataFields[4]);
					tmy3Data[k].globalHorizontalIrradianceSource = tmy3DataFields[5];
					tmy3Data[k].globalHorizontalIrradianceUncertainty = Double.parseDouble(tmy3DataFields[6]);
	
					tmy3Data[k].directNormalIrradiance = Double.parseDouble(tmy3DataFields[7]);
					tmy3Data[k].directNormalIrradianceSource = tmy3DataFields[8];
					tmy3Data[k].directNormalIrradianceUncertainty = Double.parseDouble(tmy3DataFields[9]);
	
					tmy3Data[k].diffuseHorizontalIrradiance = Double.parseDouble(tmy3DataFields[10]);
					tmy3Data[k].diffuseHorizontalIrradiancSource = tmy3DataFields[11];
					tmy3Data[k].diffuseHorizontalIrradiancUncertainty = Double.parseDouble(tmy3DataFields[12]);
	
					tmy3Data[k].globalHorizontalIlluminance = Double.parseDouble(tmy3DataFields[13]);
					tmy3Data[k].globalHorizontalIlluminanceSource = tmy3DataFields[14];
					tmy3Data[k].globalHorizontalIlluminanceUncertainty = Double.parseDouble(tmy3DataFields[15]);
	
					tmy3Data[k].directNormalIlluminance = Double.parseDouble(tmy3DataFields[16]);
					tmy3Data[k].directNormalIlluminanceSource = tmy3DataFields[17];
					tmy3Data[k].directNormalIlluminanceUncertainty = Double.parseDouble(tmy3DataFields[18]);
	
					tmy3Data[k].directNormalIlluminance = Double.parseDouble(tmy3DataFields[19]);
					tmy3Data[k].directNormalIlluminanceSource = tmy3DataFields[20];
					tmy3Data[k].directNormalIlluminanceUncertainty = Double.parseDouble(tmy3DataFields[21]);
	
					tmy3Data[k].zenithLuminance = Double.parseDouble(tmy3DataFields[22]);
					tmy3Data[k].zenithLuminanceSource = tmy3DataFields[23];
					tmy3Data[k].zenithLuminanceUncertianty = Double.parseDouble(tmy3DataFields[24]);
	
					tmy3Data[k].totalSkyCover = Double.parseDouble(tmy3DataFields[25]);
					tmy3Data[k].totalSkyCoverSource = tmy3DataFields[26];
					tmy3Data[k].totalSkyCoverUncertainty = Double.parseDouble(tmy3DataFields[27]);
	
					tmy3Data[k].opaqueSkyCover = Double.parseDouble(tmy3DataFields[28]);
					tmy3Data[k].opaqueSkyCoverSource = tmy3DataFields[29];
					tmy3Data[k].opaqueSkyCoverUncertainty = Double.parseDouble(tmy3DataFields[30]);
	
					tmy3Data[k].dryBulbTemperature = Double.parseDouble(tmy3DataFields[31]);
					tmy3Data[k].dryBulbTemperatureSource = tmy3DataFields[32];
					tmy3Data[k].dryBulbTemperatureUncertainty = Double.parseDouble(tmy3DataFields[33]);
	
					tmy3Data[k].dewPointTemperature = Double.parseDouble(tmy3DataFields[34]);
					tmy3Data[k].dewPointTemperatureSource = tmy3DataFields[35];
					tmy3Data[k].dewPointTemperatureUncertainty = Double.parseDouble(tmy3DataFields[36]);
	
					tmy3Data[k].relativeHumidity = Double.parseDouble(tmy3DataFields[37]);
					tmy3Data[k].relativeHumiditySource = tmy3DataFields[38];
					tmy3Data[k].relativeHumidityUncertainty = Double.parseDouble(tmy3DataFields[39]);
	
					tmy3Data[k].pressure = Double.parseDouble(tmy3DataFields[40]);
					tmy3Data[k].pressureSource = tmy3DataFields[41];
					tmy3Data[k].pressureUncertainty = Double.parseDouble(tmy3DataFields[42]);
	
					tmy3Data[k].windDirection = Double.parseDouble(tmy3DataFields[43]);
					tmy3Data[k].windDirectionSource = tmy3DataFields[44];
					tmy3Data[k].windDirectionUncertainty = Double.parseDouble(tmy3DataFields[45]);
	
					tmy3Data[k].windSpeed = Double.parseDouble(tmy3DataFields[46]);
					tmy3Data[k].windSpeedSource = tmy3DataFields[47];
					tmy3Data[k].windSpeedUncertainty = Double.parseDouble(tmy3DataFields[48]);
	
					tmy3Data[k].horizontalVisibility = Double.parseDouble(tmy3DataFields[49]);
					tmy3Data[k].horizontalVisibilitySource = tmy3DataFields[50];
					tmy3Data[k].horizontalVisibilityUncertainty = Double.parseDouble(tmy3DataFields[51]);
	
					tmy3Data[k].ceilingHeight = Double.parseDouble(tmy3DataFields[52]);
					tmy3Data[k].ceilingHeightSource = tmy3DataFields[53];
					tmy3Data[k].ceilingHeightUncertainty = Double.parseDouble(tmy3DataFields[54]);
	
					tmy3Data[k].precipitableWater = Double.parseDouble(tmy3DataFields[55]);
					tmy3Data[k].precipitableWaterSource = tmy3DataFields[56];
					tmy3Data[k].precipitableWaterUncertainty = Double.parseDouble(tmy3DataFields[57]);
	
					tmy3Data[k].aerosolOpticalDepth = Double.parseDouble(tmy3DataFields[58]);
					tmy3Data[k].aerosolOpticalDepthSource = tmy3DataFields[59];
					tmy3Data[k].aerosolOpticalDepthUncertainty = Double.parseDouble(tmy3DataFields[60]);
	
					tmy3Data[k].albedo = Double.parseDouble(tmy3DataFields[61]);
					tmy3Data[k].albedoSource = tmy3DataFields[62];
					tmy3Data[k].albedoUncertainty = Double.parseDouble(tmy3DataFields[63]);
	
					tmy3Data[k].liquidPrecipitationDepth = Double.parseDouble(tmy3DataFields[64]);
					tmy3Data[k].liquidPrecipitationQuantity = Double.parseDouble(tmy3DataFields[65]);
					tmy3Data[k].liquidPrecipitationDepthSource = tmy3DataFields[66];
					tmy3Data[k].liquidPrecipitationDepthUncertainty = Double.parseDouble(tmy3DataFields[67]);
	
					tmy3Data[k].presentWeather = Double.parseDouble(tmy3DataFields[68]);
					tmy3Data[k].presentWeatherSource = tmy3DataFields[69];
					tmy3Data[k].presentWeatherUncertainty = Double.parseDouble(tmy3DataFields[70]);
				} // if end
			}
			reader.close();
		}catch(IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public double interpolate_linear(double t, double x0, double y0, double x1, double y1) {
		// p0(x0, y0), p1(x1,y1)
		// p(t, y), t is between x0 and x1, y is interpolated value between x0
		// and x1
		double y = y0 + (t - x0) * (y1 - y0) / (x1 - x0);
		return y;
	}

	public double interpolate_quadratic(double t, double x0, double y0, double x1, double y1, double x2, double y2) {
		// (x0, y0), (x1,y1), (x2, y2)
		// t is between x0, x1 and x2, v is interpolated value of t
		double a, b, c, h, v;
		h = x1 - x0;
		c = y0;
		b = (y1 - y0) / h;
		a = (y2 - 2 * y1 + y0) / 2 * h * h;
		v = a * (t - x0) * (t - x1) + b * (t - x0) + c;
		return v;
	}

	/////////////////////////////////////////////
	// Perform interpolation for this timestep //
	/////////////////////////////////////////////
	private void interpolate() {
		switch (dointerpolate) {

		case NONE:
			log.info("=========================Interpolation:=" + dointerpolate);
			tMY3WeatherData.set_date(tmy3Data[hoy].date);
			tMY3WeatherData.set_time(tmy3Data[hoy].time);
			tMY3WeatherData.set_extraTerrestrialRadiation(tmy3Data[hoy].extraTerrestrialRadiation);
			tMY3WeatherData.set_extraTerrestrialRadiationNormal(tmy3Data[hoy].extraTerrestrialRadiationNormal);

			tMY3WeatherData.set_globalHorizontalIrradiance(tmy3Data[hoy].globalHorizontalIrradiance);
			tMY3WeatherData.set_globalHorizontalIrradianceSource(tmy3Data[hoy].globalHorizontalIrradianceSource);
			tMY3WeatherData
			.set_globalHorizontalIrradianceUncertainty(tmy3Data[hoy].globalHorizontalIrradianceUncertainty);

			// ES 02-27-2017
			tMY3WeatherData.set_directNormalIrradiance(tmy3Data[hoy].directNormalIrradiance);
			tMY3WeatherData.set_directNormalIrradianceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIrradianceUncertainty(tmy3Data[hoy].directNormalIrradianceUncertainty);

			// ES 02-27-2017
			tMY3WeatherData.set_diffuseHorizontalIrradiance(tmy3Data[hoy].diffuseHorizontalIrradiance);
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData.set_directNormalIrradianceUncertainty(tmy3Data[hoy].diffuseHorizontalIrradiancUncertainty);

			tMY3WeatherData.set_globalHorizontalIlluminance(tmy3Data[hoy].globalHorizontalIlluminance);
			tMY3WeatherData.set_globalHorizontalIlluminanceSource(tmy3Data[hoy].globalHorizontalIlluminanceSource);
			tMY3WeatherData
			.set_globalHorizontalIlluminanceUncertainty(tmy3Data[hoy].globalHorizontalIlluminanceUncertainty);
			// 16
			tMY3WeatherData.set_directNormalIlluminance(tmy3Data[hoy].directNormalIlluminance);
			tMY3WeatherData.set_directNormalIlluminanceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIlluminanceUncertainty(tmy3Data[hoy].directNormalIlluminanceUncertainty);

			tMY3WeatherData.set_diffuseHorizontalIrradiance(tmy3Data[hoy].diffuseHorizontalIrradiance);
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData
			.set_diffuseHorizontalIrradiancUncertainty(tmy3Data[hoy].diffuseHorizontalIrradiancUncertainty);

			tMY3WeatherData.set_zenithLuminance(tmy3Data[hoy].zenithLuminance);
			tMY3WeatherData.set_zenithLuminanceSource(tmy3Data[hoy].zenithLuminanceSource);
			tMY3WeatherData.set_zenithLuminanceUncertianty(tmy3Data[hoy].zenithLuminanceUncertianty);

			tMY3WeatherData.set_totalSkyCover(tmy3Data[hoy].totalSkyCover);
			tMY3WeatherData.set_totalSkyCoverSource(tmy3Data[hoy].totalSkyCoverSource);
			tMY3WeatherData.set_totalSkyCoverUncertainty(tmy3Data[hoy].totalSkyCoverUncertainty);

			tMY3WeatherData.set_opaqueSkyCover(tmy3Data[hoy].opaqueSkyCover);
			tMY3WeatherData.set_opaqueSkyCoverSource(tmy3Data[hoy].opaqueSkyCoverSource);
			tMY3WeatherData.set_opaqueSkyCoverUncertainty(tmy3Data[hoy].opaqueSkyCoverUncertainty);

			tMY3WeatherData.set_dryBulbTemperature(tmy3Data[hoy].dryBulbTemperature);
			tMY3WeatherData.set_dryBulbTemperatureSource(tmy3Data[hoy].dryBulbTemperatureSource);
			tMY3WeatherData.set_dryBulbTemperatureUncertainty(tmy3Data[hoy].dryBulbTemperatureUncertainty);

			tMY3WeatherData.set_dewPointTemperature(tmy3Data[hoy].dewPointTemperature);
			tMY3WeatherData.set_dewPointTemperatureSource(tmy3Data[hoy].dewPointTemperatureSource);
			tMY3WeatherData.set_dewPointTemperatureUncertainty(tmy3Data[hoy].dewPointTemperatureUncertainty);

			tMY3WeatherData.set_relativeHumidity(tmy3Data[hoy].relativeHumidity);
			tMY3WeatherData.set_relativeHumiditySource(tmy3Data[hoy].relativeHumiditySource);
			tMY3WeatherData.set_relativeHumidityUncertainty(tmy3Data[hoy].relativeHumidityUncertainty);

			tMY3WeatherData.set_pressure(tmy3Data[hoy].pressure);
			tMY3WeatherData.set_pressureSource(tmy3Data[hoy].pressureSource);
			tMY3WeatherData.set_pressureUncertainty(tmy3Data[hoy].pressureUncertainty);

			tMY3WeatherData.set_windDirection(tmy3Data[hoy].windDirection);
			tMY3WeatherData.set_windDirectionSource(tmy3Data[hoy].windDirectionSource);
			tMY3WeatherData.set_windDirectionUncertainty(tmy3Data[hoy].windDirectionUncertainty);

			tMY3WeatherData.set_windSpeed(tmy3Data[hoy].windSpeed);
			tMY3WeatherData.set_windSpeedSource(tmy3Data[hoy].windSpeedSource);
			tMY3WeatherData.set_windSpeedUncertainty(tmy3Data[hoy].windSpeedUncertainty);

			tMY3WeatherData.set_horizontalVisibility(tmy3Data[hoy].horizontalVisibility);
			tMY3WeatherData.set_horizontalVisibilitySource(tmy3Data[hoy].horizontalVisibilitySource);
			tMY3WeatherData.set_horizontalVisibilityUncertainty(tmy3Data[hoy].horizontalVisibilityUncertainty);

			tMY3WeatherData.set_ceilingHeight(tmy3Data[hoy].ceilingHeight);
			tMY3WeatherData.set_ceilingHeightSource(tmy3Data[hoy].ceilingHeightSource);
			tMY3WeatherData.set_ceilingHeightUncertainty(tmy3Data[hoy].ceilingHeightUncertainty);

			tMY3WeatherData.set_precipitableWater(tmy3Data[hoy].precipitableWater);
			tMY3WeatherData.set_precipitableWaterSource(tmy3Data[hoy].precipitableWaterSource);
			tMY3WeatherData.set_precipitableWaterUncertainty(tmy3Data[hoy].precipitableWaterUncertainty);

			tMY3WeatherData.set_aerosolOpticalDepth(tmy3Data[hoy].aerosolOpticalDepth);
			tMY3WeatherData.set_aerosolOpticalDepthSource(tmy3Data[hoy].aerosolOpticalDepthSource);
			tMY3WeatherData.set_aerosolOpticalDepthUncertainty(tmy3Data[hoy].aerosolOpticalDepthUncertainty);

			tMY3WeatherData.set_albedo(tmy3Data[hoy].albedo);
			tMY3WeatherData.set_albedoSource(tmy3Data[hoy].albedoSource);
			tMY3WeatherData.set_albedoUncertainty(tmy3Data[hoy].albedoUncertainty);

			tMY3WeatherData.set_liquidPrecipitationDepth(tmy3Data[hoy].liquidPrecipitationDepth);
			tMY3WeatherData.set_liquidPrecipitationDepthSource(tmy3Data[hoy].liquidPrecipitationDepthSource);
			tMY3WeatherData.set_liquidPrecipitationDepthUncertainty(tmy3Data[hoy].liquidPrecipitationDepthUncertainty);
			tMY3WeatherData.set_liquidPrecipitationQuantity(tmy3Data[hoy].liquidPrecipitationQuantity);

			tMY3WeatherData.set_presentWeather(tmy3Data[hoy].presentWeather);
			tMY3WeatherData.set_presentWeatherSource(tmy3Data[hoy].presentWeatherSource);
			tMY3WeatherData.set_presentWeatherUncertainty(tmy3Data[hoy].presentWeatherUncertainty);
			break;
		case LINEAR:
			now = dt.get(Calendar.MINUTE) / 60.0 + hoy;// ?

			hoy0 = hoy;
			hoy1 = hoy + 1.0;

			tMY3WeatherData.set_date(
					dt.get(Calendar.YEAR) + "/" + (dt.get(Calendar.MONTH) + 1) + "/" + dt.get(Calendar.DAY_OF_MONTH)); // tmy3Data[hoy].date
			tMY3WeatherData.set_time(dt.get(Calendar.HOUR_OF_DAY) + ":" + dt.get(Calendar.MINUTE)); // tmy3Data[hoy].time

			tMY3WeatherData.set_extraTerrestrialRadiation(interpolate_linear(now, hoy0,
					tmy3Data[hoy].extraTerrestrialRadiation, hoy1, tmy3Data[hoy + 1 % 8760].extraTerrestrialRadiation));
			// tmy3Data[hoy].extraTerrestrialRadiation

			tMY3WeatherData.set_extraTerrestrialRadiationNormal(
					interpolate_linear(now, hoy0, tmy3Data[hoy].extraTerrestrialRadiationNormal, hoy1,
							tmy3Data[hoy + 1 % 8760].extraTerrestrialRadiationNormal));

			tMY3WeatherData.set_globalHorizontalIrradiance(
					interpolate_linear(now, hoy0, tmy3Data[hoy].globalHorizontalIrradiance, hoy1,
							tmy3Data[hoy + 1 % 8760].globalHorizontalIrradiance));
			tMY3WeatherData.set_globalHorizontalIrradianceSource(tmy3Data[hoy].globalHorizontalIrradianceSource);
			tMY3WeatherData.set_globalHorizontalIrradianceUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].globalHorizontalIrradianceUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].globalHorizontalIrradianceUncertainty));

			// ES 02-27-2017
			tMY3WeatherData.set_directNormalIrradiance(interpolate_linear(now, hoy0,
					tmy3Data[hoy].directNormalIrradiance, hoy1, tmy3Data[hoy + 1 % 87601].directNormalIrradiance));
			tMY3WeatherData.set_directNormalIrradianceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIrradianceUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].directNormalIrradianceUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].directNormalIrradianceUncertainty));

			// ES 02-27-2017
			tMY3WeatherData.set_diffuseHorizontalIrradiance(
					interpolate_linear(now, hoy0, tmy3Data[hoy].diffuseHorizontalIrradiance, hoy1,
							tmy3Data[hoy + 1 % 8760].diffuseHorizontalIrradiance));
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData.set_directNormalIrradianceUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].directNormalIrradianceUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].diffuseHorizontalIrradiancUncertainty));

			tMY3WeatherData.set_globalHorizontalIlluminance(
					interpolate_linear(now, hoy0, tmy3Data[hoy].globalHorizontalIlluminance, hoy1,
							tmy3Data[hoy + 1 % 8760].globalHorizontalIlluminance));
			tMY3WeatherData.set_globalHorizontalIlluminanceSource(tmy3Data[hoy].globalHorizontalIlluminanceSource);
			tMY3WeatherData.set_globalHorizontalIlluminanceUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy + 1 % 8760].globalHorizontalIlluminanceUncertainty, hoy1,
							tmy3Data[hoy + 2 % 8760].globalHorizontalIlluminanceUncertainty));

			tMY3WeatherData.set_directNormalIlluminance(interpolate_linear(now, hoy0,
					tmy3Data[hoy].directNormalIlluminance, hoy1, tmy3Data[hoy + 1 % 8760].directNormalIlluminance));
			tMY3WeatherData.set_directNormalIlluminanceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIlluminanceUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].directNormalIlluminanceUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].directNormalIlluminanceUncertainty));

			tMY3WeatherData.set_diffuseHorizontalIrradiance(
					interpolate_linear(now, hoy0, tmy3Data[hoy].diffuseHorizontalIrradiance, hoy1,
							tmy3Data[hoy + 1 % 8760].diffuseHorizontalIrradiance));
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData.set_diffuseHorizontalIrradiancUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].diffuseHorizontalIrradiancUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].diffuseHorizontalIrradiancUncertainty));

			tMY3WeatherData.set_zenithLuminance(interpolate_linear(now, hoy0, tmy3Data[hoy].zenithLuminance, hoy1,
					tmy3Data[hoy + 1 % 8760].zenithLuminance));
			tMY3WeatherData.set_zenithLuminanceSource(tmy3Data[hoy].zenithLuminanceSource);
			tMY3WeatherData.set_zenithLuminanceUncertianty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].zenithLuminanceUncertianty, hoy1,
							tmy3Data[hoy + 1 % 8760].zenithLuminanceUncertianty));

			tMY3WeatherData.set_totalSkyCover(interpolate_linear(now, hoy0, tmy3Data[hoy].totalSkyCover, hoy1,
					tmy3Data[hoy + 1 % 8760].totalSkyCover));
			tMY3WeatherData.set_totalSkyCoverSource(tmy3Data[hoy].totalSkyCoverSource);
			tMY3WeatherData.set_totalSkyCoverUncertainty(interpolate_linear(now, hoy,
					tmy3Data[hoy].totalSkyCoverUncertainty, hoy1, tmy3Data[hoy + 1 % 8760].totalSkyCoverUncertainty));

			tMY3WeatherData.set_opaqueSkyCover(interpolate_linear(now, hoy0, tmy3Data[hoy].opaqueSkyCover, hoy1,
					tmy3Data[hoy + 1 % 8760].opaqueSkyCover));
			tMY3WeatherData.set_opaqueSkyCoverSource(tmy3Data[hoy].opaqueSkyCoverSource);
			tMY3WeatherData.set_opaqueSkyCoverUncertainty(interpolate_linear(now, hoy0,
					tmy3Data[hoy].opaqueSkyCoverUncertainty, hoy1, tmy3Data[hoy + 1 % 8760].opaqueSkyCoverUncertainty));

			tMY3WeatherData.set_dryBulbTemperature(interpolate_linear(now, hoy0, tmy3Data[hoy].dryBulbTemperature, hoy1,
					tmy3Data[hoy + 1 % 8760].dryBulbTemperature));
			tMY3WeatherData.set_dryBulbTemperatureSource(tmy3Data[hoy].dryBulbTemperatureSource);
			tMY3WeatherData.set_dryBulbTemperatureUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].dryBulbTemperatureUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].dryBulbTemperatureUncertainty));

			tMY3WeatherData.set_dewPointTemperature(interpolate_linear(now, hoy0, tmy3Data[hoy].dewPointTemperature,
					hoy1, tmy3Data[hoy + 1 % 8760].dewPointTemperature));
			tMY3WeatherData.set_dewPointTemperatureSource(tmy3Data[hoy].dewPointTemperatureSource);
			tMY3WeatherData.set_dewPointTemperatureUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].dewPointTemperatureUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].dewPointTemperatureUncertainty));

			tMY3WeatherData.set_relativeHumidity(interpolate_linear(now, hoy0, tmy3Data[hoy].relativeHumidity, hoy1,
					tmy3Data[hoy + 1 % 8760].relativeHumidity));
			tMY3WeatherData.set_relativeHumiditySource(tmy3Data[hoy].relativeHumiditySource);
			tMY3WeatherData.set_relativeHumidityUncertainty(interpolate_linear(now, hoy0,
					tmy3Data[hoy].relativeHumidity, hoy1, tmy3Data[hoy + 1 % 8760].relativeHumidityUncertainty));

			tMY3WeatherData.set_pressure(
					interpolate_linear(now, hoy0, tmy3Data[hoy].pressure, hoy1, tmy3Data[hoy + 1 % 8760].pressure));
			tMY3WeatherData.set_pressureSource(tmy3Data[hoy].pressureSource);
			tMY3WeatherData.set_pressureUncertainty(interpolate_linear(now, hoy0, tmy3Data[hoy].pressureUncertainty,
					hoy1, tmy3Data[hoy + 1 % 8760].pressureUncertainty));

			tMY3WeatherData.set_windDirection(interpolate_linear(now, hoy0, tmy3Data[hoy].windDirection, hoy1,
					tmy3Data[hoy + 1 % 8760].windDirection));
			tMY3WeatherData.set_windDirectionSource(tmy3Data[hoy].windDirectionSource);
			tMY3WeatherData.set_windDirectionUncertainty(interpolate_linear(now, hoy0,
					tmy3Data[hoy].windDirectionUncertainty, hoy1, tmy3Data[hoy + 1 % 8760].windDirectionUncertainty));

			tMY3WeatherData.set_windSpeed(
					interpolate_linear(now, hoy0, tmy3Data[hoy].windSpeed, hoy1, tmy3Data[hoy + 1 % 8760].windSpeed));
			tMY3WeatherData.set_windSpeedSource(tmy3Data[hoy].windSpeedSource);
			tMY3WeatherData.set_windSpeedUncertainty(interpolate_linear(now, hoy0, tmy3Data[hoy].windSpeedUncertainty,
					hoy1, tmy3Data[hoy + 1 % 8760].windSpeedUncertainty));

			tMY3WeatherData.set_horizontalVisibility(interpolate_linear(now, hoy0, tmy3Data[hoy].horizontalVisibility,
					hoy1, tmy3Data[hoy + 1 % 8760].horizontalVisibility));
			tMY3WeatherData.set_horizontalVisibilitySource(tmy3Data[hoy].horizontalVisibilitySource);
			tMY3WeatherData.set_horizontalVisibilityUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].horizontalVisibilityUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].horizontalVisibilityUncertainty));

			tMY3WeatherData.set_ceilingHeight(interpolate_linear(now, hoy0, tmy3Data[hoy].ceilingHeight, hoy1,
					tmy3Data[hoy + 1 % 8760].ceilingHeight));
			tMY3WeatherData.set_ceilingHeightSource(tmy3Data[hoy].ceilingHeightSource);
			tMY3WeatherData.set_ceilingHeightUncertainty(interpolate_linear(now, hoy0,
					tmy3Data[hoy].ceilingHeightUncertainty, hoy1, tmy3Data[hoy + 1 % 8760].ceilingHeightUncertainty));

			tMY3WeatherData.set_precipitableWater(interpolate_linear(now, hoy0, tmy3Data[hoy].precipitableWater, hoy1,
					tmy3Data[hoy + 1 % 8760].precipitableWater));
			tMY3WeatherData.set_precipitableWaterSource(tmy3Data[hoy].precipitableWaterSource);
			tMY3WeatherData.set_precipitableWaterUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].precipitableWaterUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].precipitableWaterUncertainty));

			tMY3WeatherData.set_aerosolOpticalDepth(interpolate_linear(now, hoy0, tmy3Data[hoy].aerosolOpticalDepth,
					hoy1, tmy3Data[hoy + 1 % 8760].aerosolOpticalDepth));
			tMY3WeatherData.set_aerosolOpticalDepthSource(tmy3Data[hoy].aerosolOpticalDepthSource);
			tMY3WeatherData.set_aerosolOpticalDepthUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].aerosolOpticalDepthUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].aerosolOpticalDepthUncertainty));

			tMY3WeatherData.set_albedo(
					interpolate_linear(now, hoy0, tmy3Data[hoy].albedo, hoy1, tmy3Data[hoy + 1 % 8760].albedo));
			tMY3WeatherData.set_albedoSource(tmy3Data[hoy].albedoSource);
			tMY3WeatherData.set_albedoUncertainty(interpolate_linear(now, hoy0, tmy3Data[hoy].albedoUncertainty, hoy1,
					tmy3Data[hoy + 1 % 8760].albedoUncertainty));

			tMY3WeatherData.set_liquidPrecipitationDepth(interpolate_linear(now, hoy0, tmy3Data[hoy].albedo, hoy1,
					tmy3Data[hoy + 1 % 8760].liquidPrecipitationDepth));
			tMY3WeatherData.set_liquidPrecipitationDepthSource(tmy3Data[hoy].liquidPrecipitationDepthSource);
			tMY3WeatherData.set_liquidPrecipitationDepthUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].liquidPrecipitationDepthUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].liquidPrecipitationDepthUncertainty));
			tMY3WeatherData.set_liquidPrecipitationQuantity(
					interpolate_linear(now, hoy0, tmy3Data[hoy].liquidPrecipitationQuantity, hoy1,
							tmy3Data[hoy + 1 % 8760].liquidPrecipitationQuantity));

			tMY3WeatherData.set_presentWeather(interpolate_linear(now, hoy0, tmy3Data[hoy].precipitableWater, hoy1,
					tmy3Data[hoy + 1 % 8760].presentWeather));
			tMY3WeatherData.set_presentWeatherSource(tmy3Data[hoy].presentWeatherSource);
			tMY3WeatherData.set_presentWeatherUncertainty(
					interpolate_linear(now, hoy0, tmy3Data[hoy].precipitableWaterUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].presentWeatherUncertainty));

			break;
		case QUADRATIC:
			// public double interpolate_quadratic(double t, double x0, double
			// y0, double x1, double y1, double x2, double y2)
			// interpolate_quadratic(now,hoy0,tmy3Data[hoy0].,hoy1,tmy3Data[hoy1].,hoy2,tmy3Data[hoy2].)
			double mini = dt.get(Calendar.MINUTE) / 60.0;
			now = mini + hoy;// ?

			hoy0 = hoy;
			hoy1 = hoy + 1;
			hoy2 = hoy + 2;

			tMY3WeatherData.set_date(
					dt.get(Calendar.YEAR) + "/" + (dt.get(Calendar.MONTH) + 1) + "/" + dt.get(Calendar.DAY_OF_MONTH)); // tmy3Data[hoy].date
			tMY3WeatherData.set_time(dt.get(Calendar.HOUR_OF_DAY) + ":" + dt.get(Calendar.MINUTE)); // tmy3Data[hoy].time


			tMY3WeatherData.set_extraTerrestrialRadiation(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].extraTerrestrialRadiation, hoy1, tmy3Data[hoy + 1].extraTerrestrialRadiation, hoy2,
					tmy3Data[hoy + 2].extraTerrestrialRadiation));

			tMY3WeatherData.set_extraTerrestrialRadiationNormal(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].extraTerrestrialRadiationNormal, hoy1,
							tmy3Data[hoy + 1 % 8760].extraTerrestrialRadiationNormal, hoy2,
							tmy3Data[hoy + 2 % 8760].extraTerrestrialRadiationNormal));

			tMY3WeatherData.set_globalHorizontalIrradiance(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].globalHorizontalIrradiance, hoy1, tmy3Data[hoy + 1].globalHorizontalIrradiance, hoy2,
					tmy3Data[hoy + 2].globalHorizontalIrradiance));
			tMY3WeatherData.set_globalHorizontalIrradianceSource(tmy3Data[hoy].globalHorizontalIrradianceSource);
			tMY3WeatherData.set_globalHorizontalIrradianceUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].globalHorizontalIrradianceUncertainty, hoy1,
							tmy3Data[hoy + 1 % 8760].globalHorizontalIrradianceUncertainty, hoy2,
							tmy3Data[hoy + 2 % 8760].globalHorizontalIrradianceUncertainty));

			double dni = interpolate_quadratic(now, hoy0, tmy3Data[hoy].directNormalIrradiance, hoy1,
					tmy3Data[hoy + 1].directNormalIrradiance, hoy2, tmy3Data[hoy + 2].directNormalIrradiance);
			tMY3WeatherData.set_directNormalIrradiance((dni >=0.0) ? dni:0.0);
			tMY3WeatherData.set_directNormalIrradianceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIrradianceUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].directNormalIrradianceUncertainty, hoy1,
							tmy3Data[hoy + 1].directNormalIrradianceUncertainty, hoy2,
							tmy3Data[hoy + 2].directNormalIrradianceUncertainty));

			tMY3WeatherData.set_diffuseHorizontalIrradiance(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].diffuseHorizontalIrradiance, hoy1, tmy3Data[hoy + 1].diffuseHorizontalIrradiance,
					hoy2, tmy3Data[hoy + 2].diffuseHorizontalIrradiance));
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData.set_diffuseHorizontalIrradiancUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].diffuseHorizontalIrradiancUncertainty, hoy1,
							tmy3Data[hoy + 1].diffuseHorizontalIrradiancUncertainty, hoy2,
							tmy3Data[hoy + 2].diffuseHorizontalIrradiancUncertainty));

			tMY3WeatherData.set_globalHorizontalIlluminance(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].globalHorizontalIlluminance, hoy1, tmy3Data[hoy + 1].globalHorizontalIlluminance,
					hoy2, tmy3Data[hoy + 2].globalHorizontalIlluminance));
			tMY3WeatherData.set_globalHorizontalIlluminanceSource(tmy3Data[hoy].globalHorizontalIlluminanceSource);
			tMY3WeatherData.set_globalHorizontalIlluminanceUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].globalHorizontalIlluminanceUncertainty, hoy1,
							tmy3Data[hoy + 1].globalHorizontalIlluminanceUncertainty, hoy2,
							tmy3Data[hoy + 2].globalHorizontalIlluminanceUncertainty));
			// 16
			double dnil = interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].directNormalIlluminance, hoy1, tmy3Data[hoy + 1].directNormalIlluminance, hoy2,
					tmy3Data[hoy + 2].directNormalIlluminance);
			tMY3WeatherData.set_directNormalIlluminance((dnil >=0.0)?dnil:0.0);
			tMY3WeatherData.set_directNormalIlluminanceSource(tmy3Data[hoy].directNormalIrradianceSource);
			tMY3WeatherData.set_directNormalIlluminanceUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].directNormalIlluminanceUncertainty, hoy1,
							tmy3Data[hoy + 1].directNormalIlluminanceUncertainty, hoy2,
							tmy3Data[hoy + 2].directNormalIrradianceUncertainty));

			tMY3WeatherData.set_diffuseHorizontalIrradiance(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].diffuseHorizontalIrradiance, hoy1, tmy3Data[hoy + 1].diffuseHorizontalIrradiance,
					hoy2, tmy3Data[hoy + 2].diffuseHorizontalIrradiance));
			tMY3WeatherData.set_diffuseHorizontalIrradiancSource(tmy3Data[hoy].diffuseHorizontalIrradiancSource);
			tMY3WeatherData.set_diffuseHorizontalIrradiancUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].diffuseHorizontalIrradiancUncertainty, hoy1,
							tmy3Data[hoy + 1].diffuseHorizontalIrradiancUncertainty, hoy2,
							tmy3Data[hoy + 2].diffuseHorizontalIrradiancUncertainty));

			tMY3WeatherData.set_zenithLuminance(interpolate_quadratic(now, hoy0, tmy3Data[hoy].zenithLuminance, hoy1,
					tmy3Data[hoy + 1].zenithLuminance, hoy2, tmy3Data[hoy + 2].zenithLuminance));
			tMY3WeatherData.set_zenithLuminanceSource(tmy3Data[hoy].zenithLuminanceSource);
			tMY3WeatherData.set_zenithLuminanceUncertianty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].zenithLuminanceUncertianty, hoy1, tmy3Data[hoy + 1].zenithLuminanceUncertianty, hoy2,
					tmy3Data[hoy + 2].zenithLuminanceUncertianty));

			tMY3WeatherData.set_totalSkyCover(interpolate_quadratic(now, hoy0, tmy3Data[hoy].totalSkyCover, hoy1,
					tmy3Data[hoy + 1].totalSkyCover, hoy2, tmy3Data[hoy + 2].totalSkyCover));
			tMY3WeatherData.set_totalSkyCoverSource(tmy3Data[hoy].totalSkyCoverSource);
			tMY3WeatherData.set_totalSkyCoverUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].totalSkyCoverUncertainty, hoy1, tmy3Data[hoy + 1].totalSkyCoverUncertainty, hoy2,
					tmy3Data[hoy + 2].totalSkyCoverUncertainty));

			tMY3WeatherData.set_opaqueSkyCover(interpolate_quadratic(now, hoy0, tmy3Data[hoy].opaqueSkyCover, hoy1,
					tmy3Data[hoy + 1].opaqueSkyCover, hoy2, tmy3Data[hoy + 2].opaqueSkyCover));
			tMY3WeatherData.set_opaqueSkyCoverSource(tmy3Data[hoy].opaqueSkyCoverSource);
			tMY3WeatherData.set_opaqueSkyCoverUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].opaqueSkyCoverUncertainty, hoy1, tmy3Data[hoy + 1].opaqueSkyCoverUncertainty, hoy2,
					tmy3Data[hoy + 2].opaqueSkyCoverUncertainty));

			tMY3WeatherData.set_dryBulbTemperature(interpolate_quadratic(now, hoy0, tmy3Data[hoy].dryBulbTemperature,
					hoy1, tmy3Data[hoy + 1 % 8760].dryBulbTemperature, hoy2,
					tmy3Data[hoy + 2 % 8760].dryBulbTemperature));
			tMY3WeatherData.set_dryBulbTemperatureSource(tmy3Data[hoy].dryBulbTemperatureSource);
			tMY3WeatherData.set_dryBulbTemperatureUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].dryBulbTemperatureUncertainty, hoy1, tmy3Data[hoy + 1].dryBulbTemperatureUncertainty,
					hoy2, tmy3Data[hoy + 2].dryBulbTemperatureUncertainty));

			tMY3WeatherData.set_dewPointTemperature(interpolate_quadratic(now, hoy0, tmy3Data[hoy].dewPointTemperature,
					hoy1, tmy3Data[hoy + 1].dewPointTemperature, hoy2, tmy3Data[hoy + 2].dewPointTemperature));
			tMY3WeatherData.set_dewPointTemperatureSource(tmy3Data[hoy].dewPointTemperatureSource);
			tMY3WeatherData.set_dewPointTemperatureUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].dewPointTemperatureUncertainty, hoy1,
							tmy3Data[hoy + 1].dewPointTemperatureUncertainty, hoy2,
							tmy3Data[hoy + 2].dewPointTemperatureUncertainty));

			tMY3WeatherData.set_relativeHumidity(interpolate_quadratic(now, hoy0, tmy3Data[hoy].relativeHumidity, hoy1,
					tmy3Data[hoy + 1].relativeHumidity, hoy2, tmy3Data[hoy + 2].relativeHumidity));
			tMY3WeatherData.set_relativeHumiditySource(tmy3Data[hoy].relativeHumiditySource);
			tMY3WeatherData.set_relativeHumidityUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].relativeHumidity, hoy1, tmy3Data[hoy + 1].relativeHumidityUncertainty, hoy2,
					tmy3Data[hoy + 2].relativeHumidityUncertainty));

			tMY3WeatherData.set_pressure(interpolate_quadratic(now, hoy0, tmy3Data[hoy].pressure, hoy1,
					tmy3Data[hoy + 1].pressure, hoy2, tmy3Data[hoy + 2].aerosolOpticalDepth));
			tMY3WeatherData.set_pressureSource(tmy3Data[hoy].pressureSource);
			tMY3WeatherData.set_pressureUncertainty(interpolate_quadratic(now, hoy0, tmy3Data[hoy].pressureUncertainty,
					hoy1, tmy3Data[hoy + 1].pressureUncertainty, hoy2,
					tmy3Data[hoy + 2].aerosolOpticalDepthUncertainty));

			tMY3WeatherData.set_windDirection(interpolate_quadratic(now, hoy0, tmy3Data[hoy].windDirection, hoy1,
					tmy3Data[hoy + 1].windDirection, hoy2, tmy3Data[hoy + 2].windDirection));
			tMY3WeatherData.set_windDirectionSource(tmy3Data[hoy].windDirectionSource);
			tMY3WeatherData.set_windDirectionUncertainty(interpolate_quadratic(now, hoy,
					tmy3Data[hoy].windDirectionUncertainty, hoy1, tmy3Data[hoy + 1].windDirectionUncertainty, hoy2,
					tmy3Data[hoy + 2].windDirectionUncertainty));

			tMY3WeatherData.set_windSpeed(interpolate_quadratic(now, hoy0, tmy3Data[hoy].windSpeed, hoy1,
					tmy3Data[hoy + 1].windSpeed, hoy2, tmy3Data[hoy + 2].windSpeed));
			tMY3WeatherData.set_windSpeedSource(tmy3Data[hoy].windSpeedSource);
			tMY3WeatherData
			.set_windSpeedUncertainty(interpolate_quadratic(now, hoy0, tmy3Data[hoy].windSpeedUncertainty, hoy1,
					tmy3Data[hoy + 1].windSpeedUncertainty, hoy2, tmy3Data[hoy + 2].windSpeedUncertainty));

			tMY3WeatherData
			.set_horizontalVisibility(interpolate_quadratic(now, hoy0, tmy3Data[hoy].horizontalVisibility, hoy1,
					tmy3Data[hoy + 1].horizontalVisibility, hoy2, tmy3Data[hoy + 2].horizontalVisibility));
			tMY3WeatherData.set_horizontalVisibilitySource(tmy3Data[hoy].horizontalVisibilitySource);
			tMY3WeatherData.set_horizontalVisibilityUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].horizontalVisibilityUncertainty, hoy1,
							tmy3Data[hoy + 1].horizontalVisibilityUncertainty, hoy2,
							tmy3Data[hoy + 2].horizontalVisibilityUncertainty));

			tMY3WeatherData.set_ceilingHeight(interpolate_quadratic(now, hoy0, tmy3Data[hoy].ceilingHeight, hoy1,
					tmy3Data[hoy + 1].ceilingHeight, hoy2, tmy3Data[hoy + 1].ceilingHeight));
			tMY3WeatherData.set_ceilingHeightSource(tmy3Data[hoy].ceilingHeightSource);
			tMY3WeatherData.set_ceilingHeightUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].ceilingHeightUncertainty, hoy1, tmy3Data[hoy + 1].ceilingHeightUncertainty, hoy2,
					tmy3Data[hoy + 2].ceilingHeightUncertainty));

			tMY3WeatherData.set_precipitableWater(interpolate_quadratic(now, hoy0, tmy3Data[hoy].precipitableWater,
					hoy1, tmy3Data[hoy + 1].precipitableWater, hoy2, tmy3Data[hoy + 2].precipitableWater));
			tMY3WeatherData.set_precipitableWaterSource(tmy3Data[hoy].precipitableWaterSource);
			tMY3WeatherData.set_precipitableWaterUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].precipitableWaterUncertainty, hoy1, tmy3Data[hoy + 1].precipitableWaterUncertainty,
					hoy2, tmy3Data[hoy + 2].precipitableWaterUncertainty));

			tMY3WeatherData.set_aerosolOpticalDepth(interpolate_quadratic(now, hoy0, tmy3Data[hoy].aerosolOpticalDepth,
					hoy1, tmy3Data[hoy + 1].aerosolOpticalDepth, hoy2, tmy3Data[hoy + 2].aerosolOpticalDepth));
			tMY3WeatherData.set_aerosolOpticalDepthSource(tmy3Data[hoy].aerosolOpticalDepthSource);
			tMY3WeatherData.set_aerosolOpticalDepthUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].aerosolOpticalDepthUncertainty, hoy1,
							tmy3Data[hoy + 1].aerosolOpticalDepthUncertainty, hoy2,
							tmy3Data[hoy + 2].aerosolOpticalDepthUncertainty));

			tMY3WeatherData.set_albedo(interpolate_quadratic(now, hoy0, tmy3Data[hoy].albedo, hoy1,
					tmy3Data[hoy + 1].albedo, hoy2, tmy3Data[hoy + 2].albedo));
			tMY3WeatherData.set_albedoSource(tmy3Data[hoy].albedoSource);
			tMY3WeatherData.set_albedoUncertainty(interpolate_quadratic(now, hoy0, tmy3Data[hoy].albedoUncertainty,
					hoy1, tmy3Data[hoy + 1].albedoUncertainty, hoy2, tmy3Data[hoy + 2].albedoUncertainty));

			tMY3WeatherData.set_liquidPrecipitationDepth(interpolate_quadratic(now, hoy0, tmy3Data[hoy].albedo, hoy1,
					tmy3Data[hoy + 1].liquidPrecipitationDepth, hoy2, tmy3Data[hoy + 1].liquidPrecipitationDepth));
			tMY3WeatherData.set_liquidPrecipitationDepthSource(tmy3Data[hoy].liquidPrecipitationDepthSource);
			tMY3WeatherData.set_liquidPrecipitationDepthUncertainty(
					interpolate_quadratic(now, hoy0, tmy3Data[hoy].liquidPrecipitationDepthUncertainty, hoy1,
							tmy3Data[hoy + 1].liquidPrecipitationDepthUncertainty, hoy2,
							tmy3Data[hoy + 2 % 8760].liquidPrecipitationDepthUncertainty));
			tMY3WeatherData.set_liquidPrecipitationQuantity(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].liquidPrecipitationQuantity, hoy1, tmy3Data[hoy + 1].liquidPrecipitationQuantity,
					hoy2, tmy3Data[hoy + 2].liquidPrecipitationQuantity));

			tMY3WeatherData.set_presentWeather(interpolate_quadratic(now, hoy0, tmy3Data[hoy].precipitableWater, hoy1,
					tmy3Data[hoy + 1].presentWeather, hoy2, tmy3Data[hoy + 2].presentWeather));
			tMY3WeatherData.set_presentWeatherSource(tmy3Data[hoy].presentWeatherSource);
			tMY3WeatherData.set_presentWeatherUncertainty(interpolate_quadratic(now, hoy0,
					tmy3Data[hoy].precipitableWaterUncertainty, hoy1, tmy3Data[hoy + 1].presentWeatherUncertainty, hoy2,
					tmy3Data[hoy + 2].precipitableWaterUncertainty));

			break;
		}
	}


	private void initializeTimeStep() {
		
		// initialize timezone support
		int tzhours = (int) tMY3WeatherData.get_timeZone();// -7
		log.info("time zone hours=:" + tzhours);
		SimpleTimeZone tz = new SimpleTimeZone(tzhours * 3600000, "GMT");

		// DST Support all of US uses same DST rules if not AZ,HI which doesn't switch over
		if (!(tMY3WeatherData.get_stationState().equals("AZ") || tMY3WeatherData.get_stationState().equals("HI"))) {
			tz.setStartRule(Calendar.MARCH, 8, -Calendar.SUNDAY, 2 * 60 * 60 * 1000);
			tz.setEndRule(Calendar.NOVEMBER, 1, Calendar.SUNDAY, 2 * 60 * 60 * 1000);
		}

		// establish calendar time reference
		dt = new GregorianCalendar(tz); // get calendar
		soy = new GregorianCalendar(tz); // get calendar

		// inistialize with startTime
		dt.setTimeInMillis(startTime * 1000);// 1243929600 without -7 hours
		log.debug("year=:" + dt.get(Calendar.YEAR)); // 2009
		log.debug("month=:" + dt.get(Calendar.MONTH)); // 6
		log.debug("Day: " + dt.get(Calendar.DAY_OF_MONTH)); // 2
		log.debug("Hour: " + dt.get(Calendar.HOUR)); // 9
		log.debug("Minute:" + dt.get(Calendar.MINUTE)); // 0

		// determine start time of year in UTC
		soy.set(dt.get(Calendar.YEAR), 0, 1, 0, 0, 0);// e.g. 2009/1/1 0:0:0
		log.debug("year=:" + soy.get(Calendar.YEAR)); // 2009
		log.debug("month=:" + soy.get(Calendar.MONTH)); // 6
		log.debug("Day: " + soy.get(Calendar.DAY_OF_MONTH)); // 2
		log.debug("Hour: " + soy.get(Calendar.HOUR_OF_DAY)); // 9
		log.debug("Minute:" + soy.get(Calendar.MINUTE)); // 0

		// get current time in msec and hrs this year
		dttime = dt.getTimeInMillis();
		soytime = soy.getTimeInMillis();
		hoy = (int) ((dttime - soytime) / 3600000); // 3656 vs 8760
		log.debug("Hour of year=:" + hoy);
	}

	private void computeNextTimeStep() {
		dt.setTimeInMillis((long) ((startTime + currentTime * logicalTimeSec) * 1000));

		thisTime = dt.getTimeInMillis();
		hoy = (int) ((thisTime - soytime) / 3600000);

		log.debug("LogicalTime: " + currentTime + ", CalendarTime=:" + thisTime);
		log.debug("hoy=:" + hoy);

	}

	private void CheckReceivedSubscriptions(String s){
		InteractionRoot interaction = null;
		
		// check for interactions
		while ((interaction = getNextInteractionNoWait()) != null) {
	
                if (interaction instanceof SimTime) {
                    handleInteractionClass((SimTime) interaction);
			}
	
			log.info("Interaction received and handled: " + s);
		}	
	}
	
	
	private void execute() throws Exception {
		/////////////////////////////////////////////
		// TODO perform basic initialization below //
		/////////////////////////////////////////////


		// read in the tmy3 data
		readTmy3Data();

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive 
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////
        
		CheckReceivedSubscriptions("After ReadyToPopulate");		

		
        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below
        ///////////////////////////////////////////////////////////////////////

        if(!super.isLateJoiner()) {
            readyToRun();
        }

        startAdvanceTimeThread();

        // this is the exit condition of the following while loop
        // it is used to break the loop so that latejoiner federates can
        // notify the federation manager that they left the federation
        boolean exitCondition = false;

        while (true) {
            currentTime += super.getStepSize();

            atr.requestSyncStart();
            enteredTimeGrantedState();

            if(receivedSimTime==true){
	       		if (firsttime == true){
	                // use the time parameters to compute the current calendar time reference for simulation
	       			initializeTimeStep();
	       			firsttime = false;
	       		}
            	
            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
			// compute weather status and send interaction
			computeNextTimeStep();
			interpolate();
			
            // Set the interaction's parameters.
            //
            //    TMYWeather vTMYWeather = create_TMYWeather();
            //    vTMYWeather.set_aerosolOpticalDepth( < YOUR VALUE HERE > );
            //    vTMYWeather.set_aerosolOpticalDepthSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_aerosolOpticalDepthUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_albedo( < YOUR VALUE HERE > );
            //    vTMYWeather.set_albedoSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_albedoUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_ceilingHeight( < YOUR VALUE HERE > );
            //    vTMYWeather.set_ceilingHeightSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_ceilingHeightUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_date( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dewPointTemperature( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dewPointTemperatureSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dewPointTemperatureUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIlluminance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIlluminanceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIlluminanceUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIrradiancSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIrradiancUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_diffuseHorizontalIrradiance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIlluminance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIlluminanceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIlluminanceUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIrradiance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIrradianceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_directNormalIrradianceUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dryBulbTemperature( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dryBulbTemperatureSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_dryBulbTemperatureUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_elevation( < YOUR VALUE HERE > );
            //    vTMYWeather.set_extraTerrestrialRadiation( < YOUR VALUE HERE > );
            //    vTMYWeather.set_extraTerrestrialRadiationNormal( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIlluminance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIlluminanceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIlluminanceUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIrradiance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIrradianceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_globalHorizontalIrradianceUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_horizontalVisibility( < YOUR VALUE HERE > );
            //    vTMYWeather.set_horizontalVisibilitySource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_horizontalVisibilityUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_latitude( < YOUR VALUE HERE > );
            //    vTMYWeather.set_liquidPrecipitationDepth( < YOUR VALUE HERE > );
            //    vTMYWeather.set_liquidPrecipitationDepthSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_liquidPrecipitationDepthUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_liquidPrecipitationQuantity( < YOUR VALUE HERE > );
            //    vTMYWeather.set_longitude( < YOUR VALUE HERE > );
            //    vTMYWeather.set_opaqueSkyCover( < YOUR VALUE HERE > );
            //    vTMYWeather.set_opaqueSkyCoverSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_opaqueSkyCoverUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_precipitableWater( < YOUR VALUE HERE > );
            //    vTMYWeather.set_precipitableWaterSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_precipitableWaterUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_presentWeather( < YOUR VALUE HERE > );
            //    vTMYWeather.set_presentWeatherSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_presentWeatherUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_pressure( < YOUR VALUE HERE > );
            //    vTMYWeather.set_pressureSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_pressureUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_relativeHumidity( < YOUR VALUE HERE > );
            //    vTMYWeather.set_relativeHumiditySource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_relativeHumidityUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_stationIDCode( < YOUR VALUE HERE > );
            //    vTMYWeather.set_stationName( < YOUR VALUE HERE > );
            //    vTMYWeather.set_stationState( < YOUR VALUE HERE > );
            //    vTMYWeather.set_time( < YOUR VALUE HERE > );
            //    vTMYWeather.set_timeZone( < YOUR VALUE HERE > );
            //    vTMYWeather.set_totalSkyCover( < YOUR VALUE HERE > );
            //    vTMYWeather.set_totalSkyCoverSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_totalSkyCoverUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windDirection( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windDirectionSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windDirectionUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windSpeed( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windSpeedSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_windSpeedUncertainty( < YOUR VALUE HERE > );
            //    vTMYWeather.set_zenithLuminance( < YOUR VALUE HERE > );
            //    vTMYWeather.set_zenithLuminanceSource( < YOUR VALUE HERE > );
            //    vTMYWeather.set_zenithLuminanceUncertianty( < YOUR VALUE HERE > );
            //    vTMYWeather.sendInteraction(getLRC(), currentTime);
            //
            ////////////////////////////////////////////////////////////////////////////////////////
			
			tMY3WeatherData.sendInteraction(getLRC(), currentTime);

			log.info(
					"now: " + now
					+ ", hour of year: " + hoy
					+ ", drybulb: " + tMY3WeatherData.get_dryBulbTemperature()
					+ ", dni: " + tMY3WeatherData.get_directNormalIlluminance()
					);
			
            }


            CheckReceivedSubscriptions("Main Loop");

            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            // DO NOT MODIFY FILE BEYOND THIS LINE
            // !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
            AdvanceTimeRequest newATR = new AdvanceTimeRequest(currentTime);
            putAdvanceTimeRequest(newATR);
            atr.requestSyncEnd();
            atr = newATR;

            if(exitCondition) {
                break;
            }
        }

        // while loop finished, notify FederationManager about resign
        super.notifyFederationOfResign();
    }

    private void handleInteractionClass(SimTime interaction) {
        //////////////////////////////////////////////////////////////////////////
        // TODO implement how to handle reception of the interaction            
        //////////////////////////////////////////////////////////////////////////
		startTime = (long) interaction.get_startTime();
		ignoreTil = interaction.get_ignoreTil();
		logicalTimeSec = interaction.get_secondsPerLogicalTime();
		
		if(receivedSimTime == false){
			log.info(
					"startTime: " + startTime + ", ignoreTil: " + ignoreTil + ", logicalTimeSec: " + logicalTimeSec);
		}

		receivedSimTime = true;		
	}

    public static void main(String[] args) {
        try {
            FederateConfigParser federateConfigParser = new FederateConfigParser();
            FederateConfig federateConfig = federateConfigParser.parseArgs(args, FederateConfig.class);
            Weather federate = new Weather(federateConfig);
            federate.execute();

            System.exit(0);
        } catch (Exception e) {
            log.error("There was a problem executing the Weather federate: {}", e.getMessage());
            log.error(e);

            System.exit(1);
        }
    }
}
