package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.payment;
import com.app.Entities.rental;
import com.app.dto.paymentDto;
import com.app.exception.CustomException;
import com.app.repository.paymentRepository;

@Service
@Transactional
public class paymentService {

	@Autowired
	public paymentRepository paymentRepo;
	
	//create
	public boolean addPayment(paymentDto payDto)throws CustomException
	{
		try {//rental, int amount, Date payment_date, String satus, String payment_method
			payment newPayment=new payment(payDto.getRental(),payDto.getAmount(),payDto.getPayment_date(),payDto.getSatus(),payDto.getPayment_method());
			paymentRepo.save(newPayment);
			return true;
		}catch(Exception e)
		{
			throw new CustomException("Error in adding the payment");
		}
	}
	//update
	//retrive
	public List<payment> getAllPayment()throws CustomException
	{
		try {
				return paymentRepo.findAll();
		}catch(Exception e)
		{
			throw new CustomException("Error in getting all payments ");
		}
	}
	//getallbyrental
	public List<payment> getAllPaymentByRental(rental givenRental)throws CustomException
	{
		try {
			return paymentRepo.findAllByRental(givenRental);
			
		}catch(Exception e) {
			throw new CustomException("Error in finding all payments");
		}
	}
}
