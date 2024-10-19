package com.app.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.Entities.Users;

public interface userRepository extends JpaRepository<Users, Long> {

	Optional<Users> findByemail(String email);
}
