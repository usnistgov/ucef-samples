package gov.nist.hla.ii;

import java.util.Map;

public class InterObjDef {

	public enum TYPE {
		INTERACTION, OBJECT
	};

	public final TYPE type;

	protected final String name;
	protected final Map<String, String> parameters;

	public InterObjDef(String name, Map<String, String> parameters, TYPE type) {
		this.name = name;
		this.parameters = parameters;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public Map<String, String> getParameters() {
		return parameters;
	}

	public TYPE getType() {
		return type;
	}

	public String toString() {
		return String.format("name=%s parameters=%d type=%s", name,
				parameters.size(), type.name());
	}

	public boolean isInteraction() {
		return type == TYPE.INTERACTION;
	}

	public boolean isObject() {
		return type == TYPE.OBJECT;
	}
}
