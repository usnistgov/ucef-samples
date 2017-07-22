package gov.nist.sds4emf;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceFactoryImpl;
import org.emfjson.jackson.resource.JsonResourceFactory;

public abstract class AbstractSerializeDeserialize {

	static Logger log = LogManager.getLogger(AbstractSerializeDeserialize.class);

	protected static final ResourceSet resourceSet = new ResourceSetImpl();
	protected static Resource resource;

	protected static void init() {
		log.trace("AbstractSerializeDeserialize==>" + resourceSet);
		resourceSet.getPackageRegistry().put(EcorePackage.eNS_URI, EcorePackage.eINSTANCE);
		log.trace("<==AbstractSerializeDeserialize");
	}
	
	public static ResourceSet getResourceSet() {
		return resourceSet;
	}

	public static Resource getResource() {
		return resource;
	}
	
	public static void associateExtension(String extension, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getExtensionToFactoryMap().put(extension, obj);
	}
	
	public static void associateScheme(String scheme, Object obj) {
		getResourceSet().getResourceFactoryRegistry().getProtocolToFactoryMap().put(scheme, obj);
	}
	
	public static void registerPackage(String packageURI, Object packageImpl) {
		getResourceSet().getPackageRegistry().put(packageURI, packageImpl);
	}
}
