package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Users;
import com.app.Entities.rental;

public interface rentalRepository extends JpaRepository<rental, Long>{

	Optional<rental> findByUser(Users user);
}
