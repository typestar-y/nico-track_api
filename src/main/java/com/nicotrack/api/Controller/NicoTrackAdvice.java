package com.nicotrack.api.Controller;

import com.nicotrack.api.Exception.NicoTrackException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class NicoTrackAdvice {
    @ExceptionHandler({NicoTrackException.class})
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public void handleNicoTrackException() {
    }
}
