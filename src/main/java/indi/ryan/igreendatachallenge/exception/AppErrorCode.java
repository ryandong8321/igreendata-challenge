package indi.ryan.igreendatachallenge.exception;

public enum AppErrorCode implements IErrorCode {

    UNKNOWN, ILLEGAL_PARAM, MISSING_PARAM, SYSTERM_ERROR;

    @Override
    public String getCode() {
        return this.name();
    }
}
