package com.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.payment;
import com.app.dto.paymentDto;
import com.app.exception.CustomException;
import com.app.service.paymentService;

@RestController
@RequestMapping("/payment")
public class paymentController {

	@Autowired
	public paymentService paymentService1;
	
	@PostMapping("/add")
	public boolean addNewPayment(@RequestBody paymentDto newpaymentDto)throws CustomException
	{
		return paymentService1.addPayment(newpaymentDto);
	}
	
	@GetMapping("/all")
	public List<payment> getAllPayments()throws CustomException
	{
		return paymentService1.getAllPayment();
	}
}
