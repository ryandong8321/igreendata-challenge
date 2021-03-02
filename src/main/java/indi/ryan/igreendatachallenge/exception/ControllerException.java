package indi.ryan.igreendatachallenge.exception;

import org.springframework.http.HttpStatus;

public class ControllerException extends RuntimeException {
    protected HttpStatus httpStatus;
    protected String message;

    public ControllerException( HttpStatus httpStatus, String message) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }
}
