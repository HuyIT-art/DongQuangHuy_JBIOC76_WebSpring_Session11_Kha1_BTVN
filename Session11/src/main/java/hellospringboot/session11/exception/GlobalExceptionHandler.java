package hellospringboot.session11.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public Map<String, String> handleException(Exception e) {

        log.error("Lỗi hệ thống xảy ra: ", e);

        return Map.of(
                "message", "Đã xảy ra lỗi hệ thống"
        );
    }
}