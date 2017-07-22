package gov.nist.hla.ii;

import java.util.ArrayList;

import hla.rti.ArrayIndexOutOfBounds;
import hla.rti.ReceivedInteraction;

public class Interaction {
  private class Parameter {
    private int handle;
    private String value;
    
    public Parameter(int handle, String value) {
      this.handle = handle;
      this.value = value;
    }
    
    public int getHandle() {
      return handle;
    }
    
    public String getValue() {
      return value;
    }
  }
  
  private int interactionClass;
  private ArrayList<Parameter> parameters;
  
  public Interaction(int interactionClass, ReceivedInteraction theInteraction) {
    this.interactionClass = interactionClass;
    this.parameters = new ArrayList<Parameter>(theInteraction.size());
    
    for (int i = 0; i < theInteraction.size(); i++) {
      try {
        int parameterHandle = theInteraction.getParameterHandle(i);
        String parameterValue = decodeString(theInteraction.getValue(i));
        parameters.add(new Parameter(parameterHandle, parameterValue));
      } catch (ArrayIndexOutOfBounds e) {
        throw new IndexOutOfBoundsException(e.getMessage()); // unreachable code
      }
    }
  }
  
  public int getInteractionClassHandle() {
    return interactionClass;
  }
  
  public int getParameterCount() {
    return parameters.size();
  }
  
  public int getParameterHandle(int index) {
    return parameters.get(index).getHandle();
  }
  
  public String getParameterValue(int index) {
    return parameters.get(index).getValue();
  }
  
  private String decodeString(byte[] buffer) {
    // InteractionRoot.cpp does not send a c-string so we do not need to check for \0
    // see InteractionRoot::createDatamemberHandleValuePairSet and InteractionRoot::setParameters
    return new String(buffer);
  }
}
