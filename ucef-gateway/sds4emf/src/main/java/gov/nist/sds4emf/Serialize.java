package gov.nist.sds4emf;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

public class Serialize extends AbstractSerializeDeserialize {

	private static final Logger log = LogManager.getLogger(Serialize.class);

	public static String it(EObject eObject, String uriString) {

		init();
		resource = resourceSet.createResource(URI.createURI(uriString));
		resource.getContents().add(eObject);
		ByteArrayOutputStream stream = new ByteArrayOutputStream();

		try {
			resource.save(stream, Collections.EMPTY_MAP);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return stream.toString();
	}

	public static OutputStream it(EObject eObject, String uriString, OutputStream stream) {

		init();
		try {
			resource = resourceSet.createResource(URI.createURI(uriString));
			resource.getContents().add(eObject);
			resource.save(stream, Collections.EMPTY_MAP);
		} catch (IOException e) {
			log.error("", e);
		} catch(NullPointerException e) {
			log.error(String.format("uriString=%s", uriString));
			log.error(String.format("is not null: resource=%b, uriString=%b, eObject=%b", resource, uriString, eObject), e);
		}
		return stream;
	}
}
