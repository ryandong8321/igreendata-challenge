package indi.ryan.igreendatachallenge.exception;

import org.springframework.http.HttpStatus;

public class ServiceException extends RuntimeException {

    protected HttpStatus httpStatus;
    protected String code;
    protected String message;

    public ServiceException(IErrorCode errorCode, String message, HttpStatus httpStatus) {
        super(message);
        this.httpStatus = httpStatus;
        this.message = message;
        this.code = errorCode.getCode();
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public String getErrorCode() {
        return this.code;
    }
}
