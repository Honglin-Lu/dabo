package tech.honglin.dashboard.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import tech.honglin.dashboard.base.ResultStatus;
import tech.honglin.dashboard.base.WrapResult;

@Slf4j
@RestControllerAdvice
public class ApiExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public WrapResult<String> exception(Exception e) {
        log.error("Throw runtime exception ex={}", e.getMessage(), e);
        return WrapResult.fail(ResultStatus.S500.getCode(),e.getMessage());
    }

}
