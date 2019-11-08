package FGObackEnd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static FGObackEnd.constants.StringConstants.DATABASE_NOT_AVAILABLE;

@ResponseStatus(value = HttpStatus.SERVICE_UNAVAILABLE, reason = DATABASE_NOT_AVAILABLE)
public class ServiceUnavailable extends RuntimeException {
}
