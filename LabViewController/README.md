# Installation

This project requires the 1.0.0 release version of UCEF Gateway. Follow the build instructions for the UCEF Gateway project, and then run the `build.sh` script at the top level of this repository.

# Using the run script

The `run.sh` script will launch the test federation using the default configuration. There are two global variables at the top of the script that can be re-configured to alter the test federation behavior.

```
# set to true to skip the wait period between launching federates
#   WARNING - will break logical time sychronization between federates
skip_wait_until_join=false

# set the name of the COA for the federation manager to execute
#   from the set { FixedSetPoint, SummerSchedule, WinterSchedule }
experiment_id=SummerSchedule
```

Set **skip_wait_until_join** to true to turn off the wait period between launching each federate. This will make the run script faster, but can break time advancement in the federation.

Set **experiment_id** to one of the alternative listed values to change the script the federation manager uses to inject interactions into the federation at runtime. Invalid values will lead to a null pointer exception crash.

