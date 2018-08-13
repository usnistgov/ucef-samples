# GridLAB-D Test Federation
This example federation demonstrates how to use the GridLAB-D federate, with an emphasis on the various configuration options that can be embedded into the XML configuration file.

## How to Run

- Download and install UCEF Gateway v1.1.0
- Download and install the GridLAB-D federate
- Run `build.sh` in the GLDExample directory
- Edit `src/GLDFederate/conf/GridLAB-D.json` and update **workingDirectory** if necessary
- Run `run.sh` in the GLDExample directory

## Expected Result

The example federation will run a single day using 15-minute intervals from t=0 to t=95. Because the federation manager has been configured to run as fast as possible, logical time progression will be very fast. At t=96, the GridLAB-D federate will terminate (the terminal window will close) and the remaining federates will continue to execute forever. You can close the remaining terminal windows, or follow the prompt from the run script, to terminate the remaining federates by hand.

The results will be output to `src/GLDFederate/model/house_data.csv`. The set points for two of the houses should change at both 08:00 and 17:00 in response to the individual house schedules. The final compressor count for house 1 and house 3 should be similar, while house 2 should be a slightly lower value. All three values should be in the range 60 - 100.

## XML Configuration File

The file `src/GLDFederate/conf/GridLAB-D.xml` demonstrates some of the configuration options specific to GridLAB-D that can be embedded into the XML configuration file. These options will all be in the namespace `ucef`.

