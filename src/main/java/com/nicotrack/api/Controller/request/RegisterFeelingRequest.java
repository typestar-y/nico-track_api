package com.nicotrack.api.Controller.request;

import com.nicotrack.api.Entity.Feeling;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class RegisterFeelingRequest {

    @NotNull
    private Date date;

    @NotNull
    private Integer type;

    public Feeling generateFeeling() {
        return new Feeling(this.date, this.type);
    }
}
