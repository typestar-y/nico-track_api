package com.nicotrack.api.Repository;

import com.nicotrack.api.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Integer> {
    User findByName(String name);
}
