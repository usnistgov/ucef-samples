package gov.nist.hla.ii.exception;

public class PropertyNotAssigned extends Exception {
  public PropertyNotAssigned(String message) {
    super(message);
  }
  
  public PropertyNotAssigned(String message, Throwable cause) {
    super(message, cause);
  }
  
  public PropertyNotAssigned(Throwable cause) {
    super(cause);
  }
}
