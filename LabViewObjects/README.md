# Installation

This project requires the 1.0.0 release version of UCEF Gateway. Follow the build instructions for the UCEF Gateway project, and then run the `build.sh` script at the top level of this repository.

# Using the run script

The `run.sh` script will launch the test federation using the default configuration.

The default federation contains two zones. Each zone contains a Thermostat federate and a Damper federate. The Thermostat federate treats each logical time step as an hour, and starts considers t = 0 to be midnight of the first day. Between the work hours 9 AM - 5 PM, the Thermostat will produce a different set point and flip the occupied bit. The Thermostats for different zones are configured to produce different set points. The Damper federate outputs the damper position for its zone as new values are received. The Controller federate is a placeholder; the default federation has a single Controller federate that handles both zones.

The object instances are setup to use ObjectClass-Zone# as a naming convention. Each object instance contains a zone attribute the Damper uses to determine whether an instance is relevant to its execution. This convention is arbitrary and should not be considered a guideline for other federations.

