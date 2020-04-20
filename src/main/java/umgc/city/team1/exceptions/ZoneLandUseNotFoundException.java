package umgc.city.team1.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.UUID;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ZoneLandUseNotFoundException extends Exception {
    public ZoneLandUseNotFoundException() {
        super();
    }

    public ZoneLandUseNotFoundException(String message) {
        super(message);
    }

    public ZoneLandUseNotFoundException(Throwable e) {
        super(e);
    }

    public ZoneLandUseNotFoundException(String message, Throwable e) {
        super(message, e);
    }

    public ZoneLandUseNotFoundException(UUID uuid) {
    }
}
