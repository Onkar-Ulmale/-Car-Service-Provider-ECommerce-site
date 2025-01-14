package com.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.payment;
import com.app.Entities.rental;

public interface paymentRepository extends JpaRepository<payment, Long>{

	Optional<payment> getByRental(rental givenRental);
	List<payment> findAllByRental(rental givenRental);
	
}
