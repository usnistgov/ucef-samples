package gov.nist.hla.ii;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ExampleMain {

	private static final Logger log = LogManager.getLogger(ExampleMain.class);

	public static void main(String[] args) {
		if (args.length != 1) {
			log.error("command line argument for properties file not specified");
			args = new String[1];
			args[0] = "config.properties";
		}

		try {
			InjectionFederate app = new InjectionFederate();
			app.loadConfiguration(args[0]);
			app.init();
			
			// listen only
			ExampleInject inj = new ExampleInject(app);
			app.setInterObjectInjection(inj);
			
			ExampleReception recp = new ExampleReception();
			app.setInterObjectReception(recp);
			
			app.run();
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
	}
}
