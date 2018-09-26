# Challenge-Response Test Federation

This federation was designed to test whether Java, C++, and Gateway federates could exchange string and numeric data without error. The challenger federates generate a random string and an index into that string which is sent to the HLA federation. The responder federates must respond with the substring that starts from the generated index. If an unexpected value is seen by any federate at any point during the execution, it will be logged as an error. When the federation ends, the run script will output all errors to the terminal.

## Project Dependencies

All the required dependencies for this federation are included in the UCEF v1.0.0 BETA virtual machine. The code has dependencies on:

- Java 8
- Maven 3
- [ucef-core](https://github.com/usnistgov/ucef-core)
- [ucef-cpp](https://github.com/usnistgov/ucef-cpp)
- [ucef-gateway](https://github.com/usnistgov/ucef-gateway)

## Installation and Use

Install the federation using the `build.sh` script co-located with this README file.

Run the federation using the `run.sh` script co-located with this README file. The run process is fully automated. The run script will create 10 new terminal windows with each terminal running a different federate. Each terminal will open in sequence, and there will be a small delay on the order of seconds after each new terminal window opens. The run process is slow, and it can take several minutes before all the terminal windows are open and the federation starts.

The federation will continue to execute until the run script is terminated by following the prompts it outputs to the terminal. After termination, the terminal windows will close and a new directory named `logs` will be created that stores a record of each terminal's content.

## Known Issues

Because the terminals are scripted to open at specific points on the screen, it is possible with small screen resolutions for the run process to fail. It is not recommended to run the federation with a resolution smaller than 1280x720 in either dimension.

The current version of the federation will not terminate due to a bug that prevents C++ federates from exiting. This will result in a large number of `Currently ticking` error messages from the C++ federates. To exit the federation, the terminal windows for the C++ and Gateway federates must be closed by hand. In addition, the command `pkill ChallengeResponse` must be entered into a terminal to kill the C++ federates that linger as background processes.

