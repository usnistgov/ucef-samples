package gov.nist.hla.ii.exception;

public class StatusCodeException extends HTTPClientException {
  private int statusCode; // default 0 if connection failed or aborted
  
  public StatusCodeException(String message) {
    super(message);
  }
  
  public StatusCodeException(String message, int statusCode) {
    super(message);
    this.statusCode = statusCode;
  }
  
  public StatusCodeException(String message, Throwable cause) {
    super(message, cause);
  }
  
  public StatusCodeException(Throwable cause) {
    super(cause);
  }
  
  public int getStatusCode() {
    return statusCode;
  }
}
