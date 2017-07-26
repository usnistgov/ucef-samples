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

The documentation will use the following notation:

- *Italics* refer to a file path in the virtual machine operating system
- **Bold Text** indicates the name of a GUI element you should interact with
- `code` indicates text that you must type into a field or command line

Some important information to keep at hand:

- The username/password for the virtual machine `vagrant`/`vagrant`
- The workshop exercise home folder is located at */home/vagrant/cpswt/cpswt-samples/UCEFWorkshopExercise*

## Create a new WebGME project

1. Launch WebGME (![WebGME Icon](images/webgme-icon.png)) from the Ubuntu launcher on the left side of the virtual machine.
1. WebGME will launch in the Chrome web browser. Chrome will prompt you for your preferred privacy settings the first time it is launched; the default settings are fine. Chrome will also open a pop-up window that prompts you for a keyring password; the password is `vagrant`.
1. WebGME opens the **Projects** window after it loads in Chrome. Select the **Create new** button on the bottom left of this window, enter the project name `HouseProject` in the bottom text field, and click the bottom right **Create** button. (note: if the project window doesn't open, click the GME icon on the top left of WebGME and select **Manage Projects** from the menu that opens)
1. The **Create new project** window will open; select **UCEF\_EMPTY\_PROJECT** as the project seed and finish project creation.
1. After WebGME opens the new project, go to the **object browser** located in the top right. Select the top entry in the **object browser** labeled **UCEF\_EmptyProject**; it will be annotated with the WebGME icon (![WebGME Icon](images/webgme-icon.png)). Then go to the **property editor** below the **object browser** and change the name attribute to `HouseProject`.

## Create a new federate

1. Double click on the grey rectangle labeled **ProjectContents** in the center WebGME frame to open it. (note: you must click on empty space inside of the rectangle or WebGME will open a text editor to rename the object instead)
1. Double click on the grey rectangle labeled **FederateModels** after WebGME reloads the center frame. (note: do not click on the arrow icon (![Import Icon](images/import-icon.png)) in this rectangle; close the pop-up window if you misclick)
1. WebGME will open an empty schematic. Drag and drop the green **JavaFederate** from the left column into the empty model.
1. Click on the new **JavaFederate** to select it. Go to the **property editor** in the lower right and change the name attribute from JavaFederate to `House`.

## Create a new interaction

1. Go to the **object browser** in the top right. Click the small arrow icon (![Expand Icon](images/expand-icon.png)) to the left of the **BasePackage** folder to expand its content.
1. Drag and drop **C2WInteractionRoot** from **BasePackage** into the model next to the House federate. A menu will open near the mouse cursor; select **Create instance here** from the menu to create a new interaction.
1. Select the interaction and change its name attribute in the **property editor** to `ResourcePhysicalState`.
1. Double click the interaction to open it.
1. From the left column, drag and drop a **Parameter** into the interaction model.
1. Click the new **Parameter**; in the **property editor**, change its name to `power` and its ParameterType to `double`.
1. Click the up arrow button on the top menu bar (![Go to parent](images/parent-icon.png)) to return to the federate model.

## Import the remaining interactions

1. Click the up arrow button (![Go to parent](images/parent-icon.png)) on the top WebGME menu to return to the sheet that contains the rectangle **FederateModels**.
1. Click the import icon (![Import Icon](images/import-icon.png)) inside **FederateModels** to open the import window.
1. Click the document icon (![Document Icon](images/document-icon.png)) in the import window to open the file browser. Select the file *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace/resources/UtilityFederate.json*.
1. The **Import UtilityFederate** window will open. Set the multiplier value to `0`, and unselect the tick box next to **ResourcePhysicalState** under the **Inputs** header.
1. Select **Import**, wait to see the green success banner, and close the open import windows by clicking the **X**. Double click on **FederateModels** to return to the House federate.

## Define the publications and subscriptions

1. Hover the mouse cursor over the **House** federate. Two blue boxes will appear on the top and bottom of the **House**.
1. Click and hold one of the boxes, drag the cursor to the  **ResourcePhysicalState** interaction, and release the mouse button over either of its blue box icons. This creates a publication indicated by a directed line drawn from the **House** to the **ResourcePhysicalState**.
1. Use the same process to draw a line from **SimTime**, **Quote**, and **TMYWeather** interactions to the **House** federate. This creates three subscriptions indicated by directed lines drawn from the interactions to the **House**.

## Generate the House federate code

1. Click the triangle run button (![Execute button](images/run-icon.png)) in the top left corner of WebGME.
1. From the menu that appears, select the **Federates Exporter** plugin.
1. The **FederatesExporter** window will open; click **Save & Run** using the default values.
1. Wait until a green success banner appears in the top right corner.
1. Click the triangle run button (![Execute button](images/run-icon.png)), and select **Show results**.
1. Click the file **HouseProject\_generated.zip** under the header **GENERATED ARTIFACTS** to download the file in the browser.
1. Open the Ubuntu file browser (![File browser](images/explorer-icon.png)) and navigate to the *$HOME/Downloads* directory.
1. Right click the *$HOME/Downloads/HouseProject\_generated.zip* file and select **Extract here** from the menu.
1. Copy the new folder *$HOME/Downloads/HouseProject\_generated* to *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace*

## Import the generated code into Eclipse

1. Launch Eclipse (![Eclipse icon](images/eclipse-icon.png)) from the Ubuntu launcher.
1. Wait until Eclipse prompts you for the default workspace; enter `/home/vagrant/ucef-workshop` as the workspace path.
1. Click the **Workbench** button on the top right corner of Eclipse.
1. Go to the **package explorer** on the left. Right click inside the package explorer and select **import** from the menu.
1. Expand the folder named **Maven** and choose **Existing maven projects**.
1. Click the **Browse** button to the right of **root directory** to open the file browser.
1. Select in the file browser the folder *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace*.
1. Select all of the projects that appear in the import window and click **Finish**.
1. Go to the **package explorer** and open the project for your federate named **House**. Expand *src/main/java* and *HouseProject*, and open the file *House.java*.

# Additional Information

A reference implementation of the House federate is located in *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace/resources/House.java*; the resources folder contains two other Java dependencies. You can copy these files into Eclipse to complete the House federate implementation. The workspace folder also contains a script called *build.sh* that you can use to compile your Eclipse project.

You can use the following steps to run your House federate:

1. Navigate to *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise*
1. Right click on some blank space and select **Open in Terminal**.
1. On the command line, enter the command `./run.sh` to run the workshop exercise.
1. Wait until the run script opens two new windows with titles **House 1** and **House 2**.
1. Navigate to *$HOME/cpswt/cpswt-samples/UCEFWorkshopExercise/workspace*
1. Open a new terminal from the workspace folder and enter the command `./runyourhouse.sh`.
1. Your House federate will join the federation and output to the terminal that ran this script.
