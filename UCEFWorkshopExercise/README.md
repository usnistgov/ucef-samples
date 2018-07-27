## Installation and Use
1. Compile the code with `./build.sh`
2. Run the compiled code with `./run.sh`
3. Terminate the simulation as prompted on the command line

## Extra Steps after Code Generation
The following steps must be performed when the project is re-generated from WebGME:
1. Delete `ProjectName-impl-java` and all its content from the generated code for each federate; re-use the old folder instead.
1. Edit `WorkshopExercise_deployment/conf/fedmgrconfig.json` and set `experimentConfig` to `"conf/2house/2house.json"`
1. Edit `WorkshopExercise_deployment/RTI.rid` and in *Section 4.2* set `portico.jgroups.udp.bindAddress = LOOPBACK`

