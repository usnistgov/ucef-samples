package gov.nist.hla.ii.exception;

public class PropertyNotFound extends Exception {
  public PropertyNotFound(String message) {
    super(message);
  }
  
  public PropertyNotFound(String message, Throwable cause) {
    super(message, cause);
  }
  
  public PropertyNotFound(Throwable cause) {
    super(cause);
  }
}
