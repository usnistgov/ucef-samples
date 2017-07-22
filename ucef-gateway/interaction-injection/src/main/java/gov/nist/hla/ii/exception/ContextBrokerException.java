package gov.nist.hla.ii.exception;

public class ContextBrokerException extends Exception {
  public ContextBrokerException(String message) {
    super(message);
  }
  
  public ContextBrokerException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public ContextBrokerException(Throwable cause) {
    super(cause);
  }}
