package com.nicotrack.api.Service;

import com.nicotrack.api.Entity.Feeling;
import com.nicotrack.api.Repository.FeelingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterFeelingService {

    private final FeelingsRepository feelingsRepository;

    public void execute(Feeling feeling) {
        feelingsRepository.save(feeling);
    }
}
