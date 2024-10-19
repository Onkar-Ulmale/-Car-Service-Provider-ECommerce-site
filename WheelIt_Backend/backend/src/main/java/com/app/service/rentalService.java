package com.app.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Users;
import com.app.Entities.cars;
import com.app.Entities.rental;
import com.app.dto.rentalDto;
import com.app.exception.CustomException;
import com.app.repository.rentalRepository;

@Service
@Transactional
public class rentalService {
	
	@Autowired
	public rentalRepository rentalRepo;
	
	//create
	public boolean addNewRental(rentalDto enteredRentalDto)throws CustomException
	{
		try {
		//Users user, cars car, Date start_date, Date end_date, int rental_price, int deposite, String status
		rental newREntal=new rental(enteredRentalDto.getUser(),enteredRentalDto.getCar(),enteredRentalDto.getStart_date(),enteredRentalDto.getEnd_date(),
				enteredRentalDto.getRental_price(),enteredRentalDto.getDeposite(),enteredRentalDto.getStatus());
		rentalRepo.save(newREntal);
		return true;
		}catch(Exception e)
		{
			throw new CustomException("Error in creating a rental");
		}
	}
	//retrive
	public List<rental> getAllREntals()throws CustomException
	{
		try {
			return rentalRepo.findAll();
		}catch(Exception e)
		{
			throw new CustomException("Error in getting all rentals ");
		}
	}
	//get by id
	public rental getRentalById(long id)throws CustomException
	{
		try {
			Optional<rental> enteredREntal= rentalRepo.findById(id);
			rental newREntal=enteredREntal.get();
			return newREntal;
			
		}catch(Exception e)
		{
			throw new CustomException("Error in finding rental by id");

		}
	}
	//get by user
	public rental getREntalByUser(Users user)throws CustomException
	{
		try {
			Optional<rental> enteredREntal=rentalRepo.findByUser(user);
			rental requiredRental=enteredREntal.get();
			return requiredRental;
		}catch(Exception e)
		{
			throw new CustomException("Error in getting rental");
		}
	}
	//update
	public boolean updateRental(rental enteredREntal)throws CustomException
	{
		try {
			rental newRental=getRentalById(enteredREntal.getUser().getUser_id());
			newRental.setCar(enteredREntal.getCar());
			newRental.setStart_date(enteredREntal.getStart_date());
			newRental.setEnd_date(enteredREntal.getEnd_date());
			return true;
		}catch(Exception e)
		{
			throw new CustomException("Coulden't able to update rental , Please try again !" );
		}
	}
	//delete
	public void deleteRental(long id)throws CustomException
	{
		rental newRental=getRentalById(id);
		rentalRepo.delete(newRental);		
	}
	

}
