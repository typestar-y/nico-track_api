package com.nicotrack.api.Repository;

import com.nicotrack.api.Entity.Feeling;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeelingsRepository extends JpaRepository<Feeling, Integer> {
}
