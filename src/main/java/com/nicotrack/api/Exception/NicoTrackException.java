package com.nicotrack.api.Exception;

public class NicoTrackException extends Exception {
    public NicoTrackException() {
        super();
    }

    public NicoTrackException(String message) {
        super(message);
    }

    public NicoTrackException(String message, Throwable cause) {
        super(message, cause);
    }

    public NicoTrackException(Throwable cause) {
        super(cause);
    }

    protected NicoTrackException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
