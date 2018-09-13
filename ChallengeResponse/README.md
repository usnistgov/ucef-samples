# Challenge-Response Test Federation

This federation was designed to test whether Java, C++, and Gateway federates could exchange string and numeric data without error. The challenger federates generate a random string and an index into that string which is sent to the HLA federation. The responder federates must respond with the substring that starts from the generated index. If an unexpected value is seen by any federate at any point during the execution, it will be logged as an error. When the federation ends, the run script will output all errors to the terminal.

## Known Issues

The federation will not terminate due to a bug that prevents C++ federates from exiting. This will result in a large number of `Currently ticking` error messages from the C++ federates. To exit the federation, the terminal windows for the C++ and Gateway federates must be closed by hand. In addition, the command `pkill ChallengeResponse` must be entered into a terminal to kill the C++ federates.

