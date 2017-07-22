package gov.nist.util.script;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;

import emf.sds.Serialize;
import gov.nist.hla.script.Expect;
import gov.nist.hla.script.Interaction;
import gov.nist.hla.script.Script;
import gov.nist.hla.script.ScriptFactory;

public class SOMgenerator implements Runnable {

	Script script = ScriptFactory.eINSTANCE.createScript();
	Expect expect = ScriptFactory.eINSTANCE.createExpect();

	Random rand = new Random();

	public SOMgenerator() {

	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			Interaction interaction = ScriptFactory.eINSTANCE.createInteraction();
			interaction.setName("abc");
			interaction.setParam1(Integer.toString(rand.nextInt()));
			interaction.setParam2(Integer.toString(rand.nextInt()));
			interaction.setStartTime(rand.nextDouble());
			interaction.setInjectionTimeValue(new Integer(i + 1).doubleValue());
			script.getInteraction().add(interaction);
		}
		Expect expect = ScriptFactory.eINSTANCE.createExpect();
		expect.setFederateType("FederateName");
		script.getExpect().add(expect);
		Serialize serialize = new Serialize();
		Path currentRelativePath = Paths.get("").toAbsolutePath();
		Path outPath =  FileSystems.getDefault().getPath(currentRelativePath.toString(), "output", "script.xml");
		String s = serialize.it(script, outPath.toUri().toString());
		try {
			Files.write(outPath, s.getBytes());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		SOMgenerator app = new SOMgenerator();
		app.run();
	}
}
