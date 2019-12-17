package com.nicotrack.api.Controller.request;

import com.nicotrack.api.Entity.User;
import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class RegisterUserRequest {
    @NotNull
    private String token;

    @NotNull
    private String name;

    public User generateUser() {
        return new User(this.name);
    }
}
