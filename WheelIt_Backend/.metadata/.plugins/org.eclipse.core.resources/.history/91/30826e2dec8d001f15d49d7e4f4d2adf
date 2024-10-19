package com.app.Controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.app.Entities.cars;
import com.app.dto.carDto;
import com.app.exception.CustomException;
import com.app.service.carService;

@RestController
@RequestMapping("/car")
public class carController {
	
	@Autowired
	public carService carService1;
	
	//add
	@PostMapping("/add")
	public boolean addNewCar(@RequestPart carDto cardto,@RequestPart MultipartFile image)throws CustomException
	{
		return carService1.addCar(cardto,image);
	}
	//update
	@PutMapping("/update")
	public boolean updateCar(@RequestBody cars enteredCar)throws CustomException
	{
		return carService1.updateCar(enteredCar);
	}
	//getall
	@GetMapping("/all")
	public List<cars> getAllCars()throws CustomException
	{
		return carService1.getAllCars();
	}
	//deletebyid
	@DeleteMapping("/{id}")
	public void deleteCar(@PathVariable Long id)throws CustomException
	{
		 carService1.deleteCar(id);
	}
	//getbyid
	@GetMapping("/car/{id}")
	public cars getCarById(@PathVariable Long id)throws CustomException
	{
		return carService1.getCarById(id);
	}
	

}
