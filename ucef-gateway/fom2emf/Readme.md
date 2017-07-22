# FOM2EMF
## (Federated Object Model to Eclipse Modeling Framework)

### Usage: 

FOM2EMF is depends on SDS4EMF as a companion project.

The 0.0.2 snapshot has convenience methods that eliminate the boiler plate of the earlier version:
    `
    // Imported from FOM2EMF
    import org.ieee.standards.ieee1516._2010.ObjectModelType;
    import org.ieee.standards.ieee1516._2010._2010Package;
    import org.ieee.standards.ieee1516._2010.util._2010ResourceFactoryImpl;
    `
    
    To instantiate a fom graph from a fom file:
    `
    DocumentRoot root = FOM.deserialize(<fullpath-to-a-fom.xml>);
    `
    
    To obtain a string from a fom graph:
    `
    String s = FOM.serialize(<a DocumentRoot object>);
    `
    
### Dependencies:

    `
    <dependencies>
        <dependency>
            <groupId>gov.nist.hla</groupId>
            <artifactId>fom2emf</artifactId>
            <version>0.0.2-SNAPSHOT</version>
        </dependency>
        <dependency>
            <groupId>gov.nist.hla</groupId>
            <artifactId>sds4emf</artifactId>
            <version>0.0.1-SNAPSHOT</version>
        </dependency>
        ... Additional dependencies ...
    </dependencies>
    
If using 0.0.1 snapshot:
    `
    // Imported from FOM2EMF
    import org.ieee.standards.ieee1516._2010.ObjectModelType;
    import org.ieee.standards.ieee1516._2010._2010Package;
    import org.ieee.standards.ieee1516._2010.util._2010ResourceFactoryImpl;
    
    // Imported from SDS4EMF
    import emf.sds.Deserialize;

    // First we setup the Deserializer with our FOM2EMF resource factory. 
    // Then we register our FOM2EMF specific package. 
    // We only need to do these two things once during a run. 

    Deserialize.associateExtension"xml", new _2010ResourceFactoryImpl());

    Deserialize.registerPackage(_2010Package.eNS_URI, _2010Package.eINSTANCE);

    // Now we can instantiate an object graph from a compliant file.
    // Compliant here means a fom file that conforms to the schema IEEE1516-DIF-2010.xsd.
    ObjectModelType objModel = Deserialize.it(<fullpath-to-a-fom.xml>); `

### Dependencies:

    `
    <dependencies>
	    <dependency>
			<groupId>gov.nist.hla</groupId>
			<artifactId>fom2emf</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
		<dependency>
			<groupId>gov.nist.hla</groupId>
			<artifactId>sds4emf</artifactId>
			<version>0.0.1-SNAPSHOT</version>
		</dependency>
        ... Additional dependencies ...
	</dependencies>
    `
