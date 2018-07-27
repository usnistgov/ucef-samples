A simple test federation that demonstrates the basic capabilities (configuration, send/receive interaction, send/receive object) of WebGME generated federates.

## Installation and Use
1. Compile the code with `./build.sh`
2. Run the compiled code with `./run.sh`
3. Terminate the simulation as prompted on the command line

## Extra Steps after Code Generation
The following steps must be performed when the project is re-generated from WebGME:
1. Edit `SimpleAdder_deployment/conf/fedmgrconfig.json` and set `experimentConfig` to `"conf/experiment1/experiment1.json"`
2. Edit `SimpleAdder_deployment/conf/inputsource.json ` and append entries for `numberOfInputs` and `maxValue`

