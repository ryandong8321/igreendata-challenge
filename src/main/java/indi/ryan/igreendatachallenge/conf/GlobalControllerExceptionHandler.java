package indi.ryan.igreendatachallenge.conf;

import indi.ryan.igreendatachallenge.exception.ControllerException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class GlobalControllerExceptionHandler {

    @ExceptionHandler(ControllerException.class)
    public ResponseEntity handlerException(ControllerException exception) {
        log.error("Controller exception {} and http status is {}", exception.getMessage(), exception.getHttpStatus());
        return new ResponseEntity(exception.getMessage(), exception.getHttpStatus());
    }
}
