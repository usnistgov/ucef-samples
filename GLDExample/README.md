# GridLAB-D Example

The GridLAB-D example federation was designed to test the GridLAB-D federate implementation. However, it also shows how to use the different features of the GridLAB-D federate. This sample federation demonstrates the following capabilities:

1. how to represent GridLAB-D objects as both interaction classes and object classes;
2. how to subscribe to the GridLAB-D global clock variable; and,
3. how to annotate the XML configuration file to configure the GridLAB'D federate.

## Installation and Use

### Dependencies

All the required dependencies for this federation are included in the UCEF v1.0.0 BETA virtual machine. The code has dependencies on:

- Java 8
- Maven 3
- [GridLAB-D](https://github.com/gridlab-d/gridlab-d)
- [ucef-core](https://github.com/usnistgov/ucef-core)
- [ucef-gateway](https://github.com/usnistgov/ucef-gateway)
- [ucef-gridlabd](https://github.com/usnistgov/ucef-gridlabd)
- Internet access to download maven dependencies

### How to Install

Execute the `build.sh` script in this directory to start the maven installation procedure on federation source code.

### How to Run

Execute the `run.sh` script in this directory to start an automated process that runs the entire federation on the local machine.

The run script will create an additional terminal for each federate in the federation. These windows are scripted to appear at specific screen coordinates. You may experience errors when running at lower than 1024x768 resolution.

To exit the federation, go to the terminal that executed `run.sh` and follow the prompt. This will close the individual federate terminal windows.

### Expected Output

The run script will create 5 terminal windows in sequence. There will be a several second delay between each new terminal, and the entire process can take minutes. After the last terminal, the federation will start to progress logical time as indicated by the `t=1.0` output statements. At `t=96.0`, the terminal named GridLAB-D will exit and logical time will progress at a much faster rate. At this point, the `run.sh` script should be stopped to terminate the federation. The federation will execute forever unless the `run.sh` script is manually stopped.

The federation will create several files. A directory named `logs` will be created in this directory with a set of text files that store the content of each terminal window. These files are timestamped and will not be overridden by multiple runs. GridLAB-D will create a data record at `src/GLDExample_generated/GridLabD/model/house_data.csv` with time series data for the houses in the GridLAB-D model. The house data will be overridden by each new run, and the `# date` comment at the top of the file should be examined to make sure the house data corresponds to the expected run.

The house data should contain values for 3 houses over 24 hours for the day 2009-06-02. At 08:45:00 and 17:45:00 the set points for both House 1 and House 2 should change, while House 3 remains constant. The final compressor count will differ from run to run, but approximate values for each house are House 1: 120, House 2: 80, and House 3: 100. In all runs, House 2 should have the lowest value for compressor count.

## Federation

![Federation Diagram](federation.png)

The GridLAB-D example federation uses a simple GridLAB-D model of 3 houses with cooling set points that are controlled by a Java federate. The federation has 4 federates, excluding the federation manager, that are described in detail below.

### Simulation Time

The Simulation Time federate sends a single interaction called SimTime to the GridLAB-D federate as a receive order (RO) message at `t=0`. The SimTime interaction contains information on how GridLAB-D should initialize and progress its simulation time with respect to logical time progression in the HLA federation. The values used to populate this interaction are specified in the JSON configuration file.

### House Schedule

The House Schedule federate controls the cooling set point for 3 GridLAB-D houses based on a simple schedule. The schedule has two time slices: 8:00 AM to 5:00 PM which are work hours, and the remainder of the day which are at home hours. House 1 and House 2 have higher temperature set points during work hours, while House 3 has a constant set point.

### GridLAB-D

The GridLAB-D federate runs a simple GridLAB-D model that contains 3 houses and weather data. The model uses a TMY file that contains the weather data for Phoenix, Arizona. It exposes an interface that allows for control of house cooling set points, and monitoring of the simulation time and current house states.

### Reporter

The Reporter federate receives values from GridLAB-D for 3 house objects and its clock global variable. These values are output to the log4j2 logger at the INFO level, and by default will appear in the Reporter terminal window.

## Important Notes

### Logical Time Delay

The house schedule changes cooling set points at 8:00 AM and 5:00 PM. However, the GridLAB-D model output records the set point changes at 8:45 AM and 5:45 PM. This is the correct behavior for this federation due to the logical time delay before a message is received in HLA.

Suppose the GridLAB-D model reaches 8:00 AM at logical time step *i*. The **GLDClock** interaction will be sent at `t=i` with a value of 8:00 AM. The house schedule federate will not receive this interaction until the next logical time step `t=i+1`. At `t=i+1`, the house schedule federate will detect work hours and send a **CoolingSetPoint** interaction with an updated set point. The GridLAB-D federate will not receive this interaction until the next logical time step `t=i+2`. At `t=i+2`, the GridLAB-D federate will receive the new set point and update the value in the GridLAB-D simulation. The GridLAB-D simulation requires one last logical time step for the updated set point to propogate through the simulation, which causes the set point to first be in effect at `t=i+3`. Because each logical time step corresponds to 15 simulation minutes for this example federation, the simulation time when the set point is updated at `t=i+3` is 8:45 AM.

### XML Configuration File

The file `src/GLDExample_generated/GridLabD/conf/GridLAB-D.xml` demonstrates some of the configuration options specific to GridLAB-D that can be embedded into the XML configuration file. These options are described below.

#### Interaction Details

An interaction class can be annotated with interactionDetails:

```
<ucef:interactionDetails>
    <ucef:updatePeriod>2</ucef:updatePeriod>
    <ucef:publishedObjects>
        <ucef:objectName>house1</ucef:objectName>
    </ucef:publishedObjects>
</ucef:interactionDetails>
```

The **updatePeriod** defines the amount of logical time between two publications of the interaction class by the GridLAB-D federate. This setting has no effect if the annotated interaction class does not have **Publish** as part of its sharing element. Because the GridLAB-D federate uses fixed step sizes for logical time progression, and cannot publish interactions between two logical time steps, this value should be set to a multiple of the step size.

The **publishedObjects** defines the set of GridLAB-D simulation objects that should be published to the federation using this interaction class. The **objectName** must correspond to the name of some object in the GridLAB-D model, or the GridLAB-D federate will throw an exception.

#### Object Details

An object class can be annotated with objectDetails:

```
<ucef:objectDetails>
    <ucef:publishedObjects>
        <ucef:objectName>house2</ucef:objectName>
        <ucef:objectName>house3</ucef:objectName>
    </ucef:publishedObjects>
</ucef:objectDetails>
```

The **publishedObjects** defines the set of GridLAB-D simulation objects that should be published to the federation using this object class. The **objectName** must correspond to the name of some object in the GridLAB-D model, or the GridLAB-D federate will throw an exception.

#### Parameter Details

An interaction parameter can be annotated with parameterDetails:

```
<ucef:parameterDetails>
    <ucef:propertyName>air_temperature</ucef:propertyName>
    <ucef:unitConversion>
        <ucef:unitName>degC</ucef:unitName>
    </ucef:unitConversion>
</ucef:parameterDetails>
```
The **propertyName** is used in place of the parameter name to refer to some property of the GridLAB-D simulation object. Suppose the parent interaction class for a parameter refers to a GridLAB-D market object. The market object has a property named *current_market.clearing_price* which cannot be represented as a parameter name due to the **.** character. The **propertyName** can be set to *current_market.clearing_price* - and the parameter name could be any arbitrary value - to resolve this issue.

The **unitConversion** can be used to perform unit conversion on values sent and received. There are two possible unit conversions: **unitName** and **linearConversion**. The **unitName** is the preferred mechanism that takes a GridLAB-D unit name and has the GridLAB-D simulation handle the unit conversion. The **linearConversion** method allows for the definition of a custom linear conversion function that uses a **scale** and an **offset**.

#### Attribute Details

An object attribute can be annotated with attributeDetails:

```
<ucef:attributeDetails>
    <ucef:propertyName>air_temperature</ucef:propertyName>
    <ucef:unitConversion>
        <ucef:linearConversion>
            <ucef:scale>0.5556</ucef:scale>
            <ucef:offset>-17.7778</ucef:offset>
        </ucef:linearConversion>
    </ucef:unitConversion>
</ucef:attributeDetails>
```

The **propertyName** is used in place of the attribute name to refer to some property of the GridLAB-D simulation object. Suppose the parent object class for an attribute refers to a GridLAB-D market object. The market object has a property named *current_market.clearing_price* which cannot be represented as an attribute name due to the **.** character. The **propertyName** can be set to *current_market.clearing_price* - and the attribute name could be any arbitrary value - to resolve this issue.

The **unitConversion** can be used to perform unit conversion on values sent and received. There are two possible unit conversions: **unitName** and **linearConversion**. The **unitName** is the preferred mechanism that takes a GridLAB-D unit name and has the GridLAB-D simulation handle the unit conversion. The **linearConversion** method allows for the definition of a custom linear conversion function that uses a **scale** and an **offset**.

The **updatePeriod** defines the amount of logical time between two publications of the object attribute by the GridLAB-D federate. This setting has no effect if the attribute does not have **Publish** as part of its sharing element. Because the GridLAB-D federate uses fixed step sizes for logical time progression, and cannot publish attribute updates between two logical time steps, this value should be set to a multiple of the step size. The attributes for a given object class can all have different update periods.

#### Ignored

The `<ucef:ignored />` element can be used in place of any of the above details (interaction/object/paramter/attribute) to tell the GridLAB-D federate to ignore that section of the XML file. For instance, when only a subset of the parameters define in an interaction class are relevant for the GridLAB-D simulation. When applied to an interaction class or object class, the **ignored** element does not get inherited by child classes and must be applied separately to each class in the XML that should be ignored.

