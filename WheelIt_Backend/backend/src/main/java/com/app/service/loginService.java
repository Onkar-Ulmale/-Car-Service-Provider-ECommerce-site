package com.app.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entities.Users;
import com.app.dto.userDto;
import com.app.exception.CustomException;
import com.app.repository.userRepository;

@Service
@Transactional
public class loginService {
	
	@Autowired
	public userRepository userRepo;
	
	public userDto loginUser(String email,String password)throws CustomException
	{
		try {
			Optional<Users> enteredUser=userRepo.findByemail(email);
			Users user=enteredUser.get();
			if(user.getPassword().equals(password))
			{
				//String name,String email, String password, long driving_license_number, String phonenumber
				userDto newUserDto =new userDto(user.getName(),user.getEmail(),user.getPassword(),user.getDriving_license_number(),user.getPhonenumber());
				return newUserDto;
			}
			else {
				return null;
			}
			
		}catch(Exception e) {
			throw new CustomException("Login with correct credentials!");
		}
	}

}
