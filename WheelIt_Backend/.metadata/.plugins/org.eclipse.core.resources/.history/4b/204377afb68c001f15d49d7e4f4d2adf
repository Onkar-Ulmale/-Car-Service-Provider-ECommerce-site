package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.rental;
import com.app.dto.rentalDto;
import com.app.exception.CustomException;
import com.app.service.rentalService;

@RestController
@RequestMapping("/rental")
public class rentalController {
	
	@Autowired
	public rentalService rentalService1;
	
	//create
	@PostMapping("/add")
	public boolean addNewRental(@RequestBody rentalDto newRentalDto)throws CustomException
	{
		return rentalService1.addNewRental(newRentalDto);
	}
	//update
	@PutMapping("/update")
	public boolean updateRental(@RequestBody rental newRental)throws CustomException
	{
		return rentalService1.updateRental(newRental);
	}
	//getById
	@PostMapping("/get/{id}")
	public rental getById(@PathVariable long id)throws CustomException
	{
		return rentalService1.getRentalById(id);
	}
	//getAll
	@GetMapping("/all")
	public List<rental> getAllRentals()throws CustomException
	{
		return rentalService1.getAllREntals();
	}
	//delete
	@DeleteMapping("/cancel/{id}")
	public void deleteRental(@PathVariable long id)throws CustomException
	{
		 rentalService1.deleteRental(id);
	}

}
