package com.nicotrack.api.Service;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.auth.FirebaseToken;
import com.nicotrack.api.Entity.User;
import com.nicotrack.api.Exception.NicoTrackException;
import com.nicotrack.api.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterUserService {

    private final UsersRepository usersRepository;

    public void execute(User user, String token) throws NicoTrackException {
        try {
            FirebaseToken decodedToken = FirebaseAuth.getInstance().verifyIdToken(token);
            user.setUid(decodedToken.getUid());
            usersRepository.save(user);
        } catch (FirebaseAuthException e) {
            throw new NicoTrackException("トークンが不正です");
        }
    }
}
