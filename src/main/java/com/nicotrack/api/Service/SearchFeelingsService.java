package com.nicotrack.api.Service;

import com.nicotrack.api.Entity.Feeling;
import com.nicotrack.api.Repository.FeelingsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class SearchFeelingsService {

    private final FeelingsRepository feelingsRepository;

    public List<Feeling> execute() {
        return feelingsRepository.findAll();
    }
}
