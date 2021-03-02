package indi.ryan.igreendatachallenge.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

    protected String code;
    protected String message;

    public ServiceException(IErrorCode errorCode, String message) {
        super(message);
        this.message = message;
        this.code = errorCode.getCode();
    }

    public String getErrorCode() {
        return this.code;
    }
}
