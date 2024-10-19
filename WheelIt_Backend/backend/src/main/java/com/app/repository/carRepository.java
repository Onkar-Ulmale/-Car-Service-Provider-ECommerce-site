package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entities.cars;

public interface carRepository extends JpaRepository<cars, Long>{

}
