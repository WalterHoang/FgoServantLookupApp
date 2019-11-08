package FGObackEnd.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import static FGObackEnd.constants.StringConstants.UNEXPECTED_ERROR;

@ResponseStatus(value = HttpStatus.INTERNAL_SERVER_ERROR, reason = UNEXPECTED_ERROR)
public class Unexpected extends RuntimeException{
}
