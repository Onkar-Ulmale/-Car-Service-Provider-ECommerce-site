package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Users;
import com.app.dto.userDto;
import com.app.exception.CustomException;
import com.app.service.userService;

@RestController
@RequestMapping("/user")
public class userController {
	
	@Autowired
	public userService userservice1;
	
	//getByEmail
	@GetMapping("/get")
	public  userDto getByEmail(@RequestBody String email)throws CustomException
	{
		return userservice1.findByEmailId(email);
	}
	//update
	@PutMapping("/update")
	public boolean updateUser(@RequestBody Users user)throws CustomException
	{
		return userservice1.updateUser(user);
	}
}
