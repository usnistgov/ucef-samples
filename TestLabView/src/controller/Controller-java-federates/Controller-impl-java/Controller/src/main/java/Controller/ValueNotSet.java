package Controller;

public class ValueNotSet extends RuntimeException {
	  public ValueNotSet(String message) {
	    super(message);
	  }
	  
	  public ValueNotSet(String message, Throwable cause) {
	    super(message, cause);
	  }
	  
	  public ValueNotSet(Throwable cause) {
	    super(cause);
	  }
	}