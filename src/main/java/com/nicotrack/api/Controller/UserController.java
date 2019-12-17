package com.nicotrack.api.Controller;

import com.nicotrack.api.Controller.request.RegisterUserRequest;
import com.nicotrack.api.Exception.NicoTrackException;
import com.nicotrack.api.Service.RegisterUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class UserController {

    private final RegisterUserService registerUserService;

    @PostMapping("/users")
    public void registerUser(@Valid @RequestBody RegisterUserRequest request) throws NicoTrackException {
        registerUserService.execute(request.generateUser(), request.getToken());
    }
}
