package WorkshopExercise;

import org.cpswt.config.FederateConfig;
import org.cpswt.config.FederateConfigParser;
import org.cpswt.hla.InteractionRoot;
import org.cpswt.hla.base.AdvanceTimeRequest;
import org.cpswt.utils.CpswtDefaults;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Weather type of federate for the federation designed in WebGME.
 *
 */
public class Weather extends WeatherBase {

    private final static Logger log = LogManager.getLogger(Weather.class);

    double currentTime = 0;

    public Weather(FederateConfig params) throws Exception {
        super(params);
    }

    private void CheckReceivedSubscriptions(String s) {

        InteractionRoot interaction = null;
        while ((interaction = getNextInteractionNoWait()) != null) {
            if (interaction instanceof SimTime) {
                handleInteractionClass((SimTime) interaction);
            }
            log.info("Interaction received and handled: " + s);
        }
     }

    private void execute() throws Exception {
        if(super.isLateJoiner()) {
            currentTime = super.getLBTS() - super.getLookAhead();
            super.disableTimeRegulation();
        }

        /////////////////////////////////////////////
        // TODO perform basic initialization below //
        /////////////////////////////////////////////

        AdvanceTimeRequest atr = new AdvanceTimeRequest(currentTime);
        putAdvanceTimeRequest(atr);

        if(!super.isLateJoiner()) {
            readyToPopulate();
        }

        ///////////////////////////////////////////////////////////////////////
        // Call CheckReceivedSubscriptions(<message>) here to receive
        // subscriptions published before the first time step.
        ///////////////////////////////////////////////////////////////////////

        ///////////////////////////////////////////////////////////////////////
        // TODO perform initialization that depends on other federates below //
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

            ////////////////////////////////////////////////////////////////////////////////////////
            // TODO send interactions that must be sent every logical time step below.
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
        // TODO implement how to handle reception of the interaction            //
        //////////////////////////////////////////////////////////////////////////
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
