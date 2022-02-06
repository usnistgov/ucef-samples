package gov.nist.hla.exception;

import java.lang.IllegalThreadStateException;

public class NotReadyToInteract extends IllegalThreadStateException {
    public NotReadyToInteract(String message) {
        super(message);
    }
}

