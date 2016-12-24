This is a sample GridlabDHelloWorld example federation.

The ./src/webgme contains the WebGME model seed. Use the seed file with .webgmex extension (as opposed to .webgmex.notused extension). The ./src/impl/GridlabDHelloWorld-impl-cpp and ./src/impl/GridlabDHelloWorld-impl-java folders contain the implemented federate code.

The generated files are also checked in for reference in the ./generated folder.

The steps to recreate the running federation from scratch are:

** Create a new WebGME federation model using the above mentioned WebGME seed file.

** Navigate to the federation model and execute "FederatesExporter" plugin to generate base classes. These artifacts should correspond to those in the checked in file ./generated/InterfaceFiles.zip.

** Go to the root folder containing base interface classes and run 
	"mvn -U clean compile deploy".

** Use the implementation code checked in ./src/impl/GridlabDHelloWorld-impl-cpp and ./src/impl/GridlabDHelloWorld-impl-java folders for the federate implementation.

** Run "mvn -U clean compile deploy" on the root directory (such as 'impl') containing both the directories GridlabDHelloWorld-impl-java and GridlabDHelloWorld-impl-cpp (with these exact directory names).

** Execute "DeploymentExporter" plugin to generate deployment files. These artifacts should correspond to those in the checked in file ./generated/DeploymentFiles.zip.
IMPORTANT: You will need to edit pom.xml in the generated ZIP file in order to update the dependencies on the implementation package. Also, you may edit the federation and federate parameters as needed. The pom.xml in ./generated/DeploymentFiles.zip already has proper dependencies and parameters specified. 

Add following to the deployment pom.xml

		<dependency><!-- The depenency for the user written code-->
			<groupId>org.webgme.guest</groupId>
			<artifactId>GridlabDHelloWorld</artifactId>
			<version>0.0.1-SNAPSHOT</version>
			<type>pom</type>
		</dependency>
		
		<dependency>
		 	<groupId>org.webgme.guest</groupId>
  			<artifactId>GridlabDHelloWorld-impl-java</artifactId>
  			<version>0.0.1-SNAPSHOT</version>
  			<type>jar</type>
		</dependency>

		<dependency>
		 	<groupId>org.webgme.guest</groupId>
  			<artifactId>GridlabDHelloWorld-impl-cpp</artifactId>
  			<version>0.0.1-SNAPSHOT</version>
  			<type>pom</type>
		</dependency>




Examples of the federation manager parameters for this GridlabDHelloWorld sample are as below (for easy reference):

	<configuration>
		<executable>java</executable>
		<arguments>
			<argument>-Xmx512m</argument>
			<!-- For debugging purposes-->
			<!--argument>-Xdiag</argument-->
			<argument>-Djava.library.path=${project.basedir}/target/nar/processid-${c2w.version}-amd64-Linux-gpp-jni/lib/amd64-Linux-gpp/jni/</argument>
			<argument>-Djava.net.preferIPv4Stack=true</argument>
			<argument>-classpath</argument>
			<!-- automatically creates the classpath using all project dependencies,
			also adding the project build directory -->
			<classpath/>
			<argument>c2w.gui.hla.main.C2WSim</argument>
			<argument>--step</argument><argument>1.0</argument>
			<argument>--lookahead</argument><argument>0.1</argument>
			<argument>--realtime</argument>
			<argument>--autoStart</argument>
			<argument>--federationEndTime</argument><argument>100</argument>
			<argument>--seed4DurRNG</argument><argument>0</argument>
			<argument>--lockfile</argument><argument>/home/vagrant/Projects/cpswt/__lock__</argument>
			<argument>GridlabDHelloWorld</argument>
			<argument>${project.basedir}/target/classes/GridlabDHelloWorld.fed</argument>
			<argument>${project.basedir}/target/classes/default/script.xml</argument>
			<argument>GridlabDHelloWorld_main-Deployment</argument>
			<argument>NORMAL</argument>
		</arguments>
		<environmentVariables>
			<EXEDIR>/home/vagrant/Projects/cpswt</EXEDIR>
		</environmentVariables>
	</configuration>
					
** If RunFederation plugin is not enabled by default, enable it from the Property Editor under meta|validPlugins.

** Run the RunFederation plguin, set "Execute on Server" to true, and choose the above DeploymentFiles.zip file as the input.

--
Himanshu Neema
himanshu@isis.vanderbi1t.edu (change the '1' to 'l')

