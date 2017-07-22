package gov.nist.hla.ii.exception;

public class RTIAmbassadorException extends Exception {
  public RTIAmbassadorException(String message) {
    super(message);
  }
  
  public RTIAmbassadorException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public RTIAmbassadorException(Throwable cause) {
    super(cause);
  }
}
