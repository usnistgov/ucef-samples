# Interaction Injector Example

### This is a demonstration project is intended to show how interactions can be injected into  a running federation without any implemented injections classes being on the classpath.  The injector uses only the Portico API.

### The example shows 

1. How to configure and launch the injector federate.
2. How to perform and injection(s).
3. How to implement a mechanism for handling any interactions received from other federates.

It consists of two components:

1. Driver -- A class to serve as an entry point. (Has a main()).
2. Reporter -- A class to serve as a receiver for all published interactions. 

### 1. How to configure and launch the injector federate. 
The injector federate is launched in it's own thread.  It reads a user supplied FOM file and prepares itself to receive all interactions contain therein.  It also uses a user supplied properties file for its configuration.  (See config.properties documentation below.).

The injector will attempt to take interactions from a queue.  It blocks if the queue is empty.  When an interaction is added by the Driver, the injector take it, inject it into the federation's current time step, and continue doing so until the queue is once again empty.  The injector does not advance the time step itself.

### 2. How to perform and injection(s).
The example in not a federate in its own right.  It runs in its own thread performing what ever computations are required to assemble an interaction(s).  When ready, it then adds the interaction to a queue that is shared with the injector. (See above.) Once all interactions have been queued, then the Driver tells the injector to advance the time step.

### 3. How to implement a mechanism for handling any interactions received from other federates.
The example shows how to handle interactions received from other federates.  It overrides two methods then simply logs the interactions to the console.

## Prepare to Run:

git clone the follwing:

https://github.com/usnistgov/interaction-injection-example.git
https://gcr-nist@github.com/usnistgov/interaction-injection.git
https://gcr-nist@github.com/gcr-nist/TripleSendFederation_generated.git
https://gcr-nist@github.com/gcr-nist/TripleReceiveFederation_generated.git
https://github.com/usnistgov/fom2emf.git
https://github.com/usnistgov/sds4emf.git

cd <into each of the above>
mvn install

cd into the TripleSendFederation_generated and TripleReceiveFederation_generated down to the sub module that has the *impl prefix.  

mvn clean package  // These are uber jars.

## Run:

Run VU's RESTful federation-manager as per the instructions on Vulcan Forge, 

Each of these projects has a run.sh at its root.  Run them.

- interaction-injection-example
- interaction-injection
- TripleSendFederation_generated
- TripleReceiveFederation_generated

