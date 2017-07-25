# UCEF Virtual Machine
## Install UCEF

1. Insert the UCEF workshop exercise flash drive into your computer
1. Install the version of Virtual Box for your OS from the flash drive
1. Copy the UCEF 1.0.0-alpha virtual machine to your computer
1. Run Virtual Box 
1. Choose File/Import Appliance and navigate to the UCEF image
1. Check the tick box to refresh the MAC address and import the VM
1. Start up UCEF appliance from the Virtual Box menu

## UCEF Virtual Machine Basics

- The username/password for the virtual machine vagrant/vagrant
- The workshop exercise home folder is located at /home/vagrant/cpswt/cpswt-samples/UCEFWorkshopExercise
- All of the applications used in the workshop exercise have shortcuts on the left launcher menu

# Workshop Exercise
## Create a new WebGME project

1. Launch WebGME from the Ubuntu launcher on the left side of the virtual machine. The WebGME icon is the one with three different colored hexagons.
1. WebGME will launch in the Chrome browser. The first time you launch Chrome, it will prompt you for your preferred settings; the default settings are fine. Every time you launch Chrome, it will prompt you for the keyring password which is **vagrant**.
1. WebGME opens the Projects window when it loads for the first time. Select the **Create new** button on the bottom left of this window, enter the project name **HouseProject**, and finish with the bottom right **Create** button. (note: if the project window does not open, click the GME icon on the top left of WebGME to open the menu and select **Manage Projects**)
1. The create new project window will open; select **CPSWT_EmptyProject** as the new project seed and finish project creation.
1. After WebGME opens the new project, go to the object browser located in the top right. Select the top entry in the object browser labeled **CPSWT_EmptyProject**; it will be annotated with the WebGME icon. Then go to the property editor below the object browser and change the name attribute from CPSWT_EmptyProject to **HouseProject**. Press enter when you are done.

You should now be in a new project with the text **HouseProject** displayed in large font in the center WebGME frame. 

## Create a new federate

1. Double click on the grey rectangle labeled **EmptyProject** from the center WebGME frame to open it. (note: you must click on empty space inside of the rectangle or WebGME will open a text editor to rename the object instead)
1. Double click on the grey rectangle labeled **IntegrationModel** after WebGME updates the center frame. (note: do not click on the arrow icon in the bottom center of this rectangle; click the X button to close the pop-up window if you misclick)
1. WebGME will open an empty model that displays the text IntegrationModel. Drag and drop a green java federate from the left column into the empty model using left click. This creates a new java federate instance in the model.
1. Left click on the new java federate instance to select it. Go to the property editor in the lower right and change the name attribute from JavaFederate to **House**.

You should now see one green rectangle labeled **House** in the model.

## Create a new interaction

1. Go to the object browser in the top right. There is a folder named BasePackage under the top most HouseProject that you renamed in an earlier step. Click the small arrow icon to the left of **BasePackage** to expand its content.
1. Select **C2WInteractionRoot** from the content of BasePackage. Drag and drop C2WInteractionRoot from the object browser into the model and place it next to the new House federate. When you release left click, a menu will open near the mouse cursor; select **Create instance here** from the menu to create a new interaction in the model.
1. Left click the interaction to select it and change its name attribute in the property editor to **ResourcePhysicalState**.
1. Double click on the interaction to open it in the center WebGME frame.
1. From the left column, drag and drop a single Parameter into the interaction model; place it near the existing four parameters that were created with the new interaction.
1. Left click the new parameter to select it and change its name in the property editor to **power**. Also in the property editor, change the ParameterType to **double**.
1. From the top WebGME menu, click the up arrow button (four icons from the left) to return to the federate model.

You should now see one white rectangle labeled **ResourcePhysicalState** with a **double** parameter named **power** next to the green **House** federate.

## Import the remaining interactions

1. From the integration model that contains the House federate and the ResourcePhysicalState interaction, click the up arrow button from the top WebGME menu to return to the sheet containing two grey rectangles.
1. Click the arrow icon inside the grey rectancle labeled **IntegrationModel** to open the import window.
1. Click the blue document icon on the right side of the import window to open the file browser. Navigate to the workshop exercise directory located in **$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace/resources** and select **UtilityFederate.json**.
1. A new window will open with details about the UtilityFederate that will be imported. Decrease the top multiplier value from 1 to 0, and unselect the ResourcePhysicalState tick box located under the left Inputs column. Leave the remaining three tick boxes checked.
1. Select import, wait to see the green success banner, and close the two open windows. Double click on the grey IntegrationModel rectangle to return to the federate model.

You should now have a model that contains the **House** federate, **ResourcePhysicalState** interaction, and three new interactions that overlap the model.

## Define the publications and subscriptions

1. Move the mouse cursor over the House federate; two blue boxes will appear on the top and bottom of the green rectangle. Left click on either of the blue boxes and hold down the mouse button.
1. While holding left click, drag the cursor over to the ResourcePhysicalState interaction. Two similar blue boxes will appear at the top and bottom of this interaction; release the mouse button with the mouse cursor over one of the two ResourcePhysicalState blue boxes. A directed line will be drawn from the House federate to the ResourcePhysicalState interaction.
1. Move the cursor over the imported SimTime interaction; click its blue box, hold the left click button, and release it over a blue box on the House federate. Repeat the same procedure for both the Quote and TMYWeather interactions, starting with the interaction blue box and releasing over the House federate.

You should now have the same model as before connected with four directed lines. There should be one directed line that goes from the House to the ResourcePhysicalState; the remaining three lines should go SimTime to House, Quote to House, and TMYWeather to House.

## Generate the House federate code

1. Click the triangle run button in the top left corner of WebGME. From the menu, select the Federate Exporter plugin.
1. The execute plugin window will open for the federate exporter; save and run using the default values.
1. Wait until a green success banner appears at the top right corner. Click the triangle run button a second time, and select show results.
1. Click the file named HouseProject_generated.zip under the header **GENERATED ARTIFACTS** from the results screen to download it in the browser.
1. Open the Ubuntu file browser and navigate to the $HOME/Downloads directory.
1. Right click on the generated zip file and select Extract here from the menu.
1. A new folder named HouseProject_generated will appears in the Downloads directory. Copy this folder to $HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace

You should now have a new folder $HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace/HouseProject_generated that contains one directory and a file named pom.xml

## Import the generated code into Eclipse

1. Launch Eclipse from the Ubuntu launcher.
1. When prompted, choose to use the default workspace.
1. Click the Workbench button on the top right corner.
1. From the workbench, go to the package explorer on the left. Right click inside the package explorer and select import from the menu.
1. Expand the folder titled Maven and choose Existing maven projects.
1. Click the Browse button next to the root directory at the top of the import window to open the file browser.
1. Navigate to $HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace where the generated code was exported.
1. A number of House projects will appear in the import window selected by default; finish the import with all the projects selected.
1. From the package explorer, open the project with the name House and open the file House.java.

The generated code for the java House federate will open in Eclipse. This concludes the directed exercise; information on how to complete the House federate can be found in the following section.

# Additional Information

A reference implementation of the House federated is located in $cpswt/cpswt-samples/UCEFWorkshopExercise/workspace/resources - the House.java file depends on the other two java classes in this folder. You can copy from this file to complete the implementation of your House federate that was imported in Eclipse. The workspace folder also contains a script called *build.sh* that you can use to compile your Eclipse project. The default generated code will compile using this script out of the box, although it will perform no function.

The following steps can be used to run your House federate after its complete implementation:

1. Navigate to $HOME/cpswt/cpswt-samples/UCEFWorkshopExercise
1. Right click blank space and open a new terminal from this directory.
1. From the command line, enter the command `./run.sh` to run the full workshop exercise in your virtual machine.
1. Wait until the run script opens two new windows titled *House 1* and *House 2*.
1. Navigate to $HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace
1. Open a new terminal in the workspace folder and enter the command `./runyourhouse.sh` - you can provide an additional argument to give it a unique name.
1. If all of the federates from the run.sh script are running when you enter this last command, your House federate will join the federation and output to this new terminal.
