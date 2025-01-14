package com.app.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.Users;
import com.app.dto.loginDto;
import com.app.dto.userDto;
import com.app.exception.CustomException;
import com.app.service.loginService;
import com.app.service.userService;

@RestController
@RequestMapping("/auth")
public class authController {
	
	@Autowired
	public userService usersSrevice;
	@Autowired
	public loginService loginService1;
	
	
	@PostMapping("/Register")
	public boolean registerUser(@RequestBody userDto givenDto) throws CustomException
	{
		return usersSrevice.registerUser(givenDto);
	}
	
	@PostMapping("/login")
	public userDto loginUser(@RequestBody loginDto userLoginDto) throws CustomException
	{
		return loginService1.loginUser(userLoginDto.getEmail(), userLoginDto.getPassword());
		
	}

}
