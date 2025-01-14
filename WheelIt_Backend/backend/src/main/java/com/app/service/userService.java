package com.app.service;

import java.util.List;
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
public class userService {
	
	@Autowired
	public userRepository userRepo;
	
	//register
	public boolean registerUser(userDto userdto)throws CustomException
	{
		try {
		Users newUser=new Users(userdto.getName(),userdto.getEmail(),userdto.getPassword(),userdto.getDriving_license_number(),userdto.getPhonenumber());
		userRepo.save(newUser);
		return true;
		}catch(Exception e){
			throw new CustomException("Error in adding the user");
			
		}
	}
	//login
	public userDto loginUser(String email,String password)
	{
		Optional<Users> enteredUser=userRepo.findByemail(email);
		Users newUser=enteredUser.get();
		if(newUser.getPassword().equals(password))
		{
			userDto userDTO=new userDto(newUser.getName(),newUser.getEmail(),newUser.getPassword(),newUser.getDriving_license_number(),newUser.getPhonenumber());
			return userDTO;
		}
		return null;
	}
	//update
	public boolean updateUser(Users user)throws CustomException
	{
		try {
		Optional<Users> enteredUser=userRepo.findById(user.getUser_id());
		if(enteredUser.isPresent())
		{
			Users newUser=new Users();
			newUser=enteredUser.get();
			newUser.setName(user.getName());
			newUser.setEmail(user.getEmail());
			newUser.setPhonenumber(user.getPhonenumber());
			newUser.setDriving_license_number(user.getDriving_license_number());
			userRepo.save(newUser);
			return true;
		}
		return false;
		}catch(Exception e) {	
			throw new CustomException("Failed to update the user");	
		}
	}
	
	//get by email 
	public userDto findByEmailId(String email)
	{
		Optional<Users> enteredUser=userRepo.findByemail(email);
		Users newUser=enteredUser.get();
		//String name,String email, String password, long driving_license_number, String phonenumber
		userDto newUserDto=new userDto(newUser.getName(), newUser.getEmail(), newUser.getPassword(), newUser.getDriving_license_number(), newUser.getPhonenumber());
		return newUserDto;
	}
	//find all 
	
	public List<Users> getAllUsers()throws CustomException
	{
		try {
			return userRepo.findAll();
			
		}catch(Exception e)
		{
			throw new CustomException("Error in getting all Users");
		}
	}
	public void deleteUser(String email)
	{
		Optional<Users> enteredUser=userRepo.findByemail(email);
		Users newUser=enteredUser.get();
		userRepo.delete(newUser);
	}

}
