package com.nicotrack.api.Controller.response;

import lombok.Value;

import java.util.Date;
import java.util.List;

@Value
public class SearchFeelingsResponse {
    private final List<Feeling> feelings;

    public SearchFeelingsResponse(List<Feeling> feelings) {
        this.feelings = feelings;
    }

    @Value
    public static class Feeling {
        private final Date date;
        private final int type;
        private final String userName;
    }
}
