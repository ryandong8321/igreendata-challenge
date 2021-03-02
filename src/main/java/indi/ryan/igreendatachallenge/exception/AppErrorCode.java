package indi.ryan.igreendatachallenge.exception;

import org.springframework.http.HttpStatus;

public enum AppErrorCode implements IErrorCode {

    UNKNOWN, ILLEGAL_PARAM, MISSING_PARAM, SYSTERM_ERROR, CANNOT_FINE_RESULT;

    @Override
    public String getCode() {
        return this.name();
    }

    public static HttpStatus getResponseStatus(String code) {
        switch (AppErrorCode.valueOf(code)) {
            case UNKNOWN:
            case SYSTERM_ERROR:
                return HttpStatus.BAD_REQUEST;
            case ILLEGAL_PARAM:
            case MISSING_PARAM:
                return HttpStatus.NOT_FOUND;
            case CANNOT_FINE_RESULT:
                return HttpStatus.OK;
        }
        return HttpStatus.OK;
    }
}
