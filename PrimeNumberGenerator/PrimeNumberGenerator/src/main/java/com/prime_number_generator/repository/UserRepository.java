package com.prime_number_generator.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import com.prime_number_generator.model.PrimeGenerationRecord;
import com.prime_number_generator.model.User;

@EnableJpaRepositories
public interface UserRepository extends JpaRepository<PrimeGenerationRecord, Long> {

	User save(User user);

}
