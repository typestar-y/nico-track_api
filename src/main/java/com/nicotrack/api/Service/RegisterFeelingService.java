package com.nicotrack.api.Service;

import com.nicotrack.api.Entity.Feeling;
import com.nicotrack.api.Entity.User;
import com.nicotrack.api.Exception.NicoTrackException;
import com.nicotrack.api.Repository.FeelingsRepository;
import com.nicotrack.api.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterFeelingService {

    private final FeelingsRepository feelingsRepository;
    private final UsersRepository usersRepository;

    public void execute(Feeling feeling, String userName) throws NicoTrackException {
        User user = usersRepository.findByName(userName);
        if (user == null) {
            throw new NicoTrackException("ユーザが存在しません");
        }
        feeling.setUser(user);
        feelingsRepository.save(feeling);
    }
}
