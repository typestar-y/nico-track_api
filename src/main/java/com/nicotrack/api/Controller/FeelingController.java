package com.nicotrack.api.Controller;

import com.nicotrack.api.Controller.request.RegisterFeelingRequest;
import com.nicotrack.api.Controller.response.SearchFeelingsResponse;
import com.nicotrack.api.Entity.Feeling;
import com.nicotrack.api.Exception.NicoTrackException;
import com.nicotrack.api.Service.RegisterFeelingService;
import com.nicotrack.api.Service.SearchFeelingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
@CrossOrigin
public class FeelingController {

    private final RegisterFeelingService registerFeelingService;
    private final SearchFeelingsService searchFeelingsService;


    @PostMapping("/feelings")
    public void registerFeeling(@Valid @RequestBody RegisterFeelingRequest request) throws NicoTrackException {
        registerFeelingService.execute(request.generateFeeling(), request.getUser());
    }

    @GetMapping("/feelings")
    public SearchFeelingsResponse registerFeeling() {
        List<Feeling> feelings = searchFeelingsService.execute();
        return new SearchFeelingsResponse(feelings.stream()
                .map(feeling -> new SearchFeelingsResponse.Feeling(feeling.getDate(), feeling.getType(), feeling.getUser().getName()))
                .collect(Collectors.toList()));
    }
}
