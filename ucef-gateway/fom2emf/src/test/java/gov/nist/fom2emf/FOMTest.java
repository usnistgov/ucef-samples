package gov.nist.fom2emf;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import gov.nist.fom2emf.FOM;

import java.io.File;

import org.ieee.standards.ieee1516._2010.DocumentRoot;
import org.junit.Test;

public class FOMTest {
	
	@Test
	public void testFOMExists() {
		assertTrue(new File("fom/TripleFederation.xml").exists());
	}

	@Test
	public void testDe_Serialize() {
		DocumentRoot eObject = FOM.deserialize("fom/TripleFederation.xml");
		FOM.deserialize("fom/TripleFederation.xml");
		assertNotNull(eObject);
		String s = FOM.serialize(eObject);
		assertNotNull(s);
	}
}
