package com.app.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.app.Entities.cars;
import com.app.dto.carDto;
import com.app.exception.CustomException;
import com.app.repository.carRepository;

@Service
@Transactional
public class carService {
	
	@Autowired
	public carRepository carRepo;
	
	//create 
	public boolean addCar(carDto cardto , MultipartFile imagefile)throws CustomException
	{
		try {
			//String model, String type, long pricePerDay, boolean isAvailable, byte[] imageData,
			//String yearOfManufacturingl, String status
			byte[] image=imagefile.getBytes();
			cars newCar=new cars(cardto.getModel(),cardto.getType(),cardto.getPricePerDay(),cardto.isAvailable(),image,
					cardto.getYearOfManufacturingl(),cardto.getStatus());
			carRepo.save(newCar);
			return true;
			
		}catch(Exception e)
		{
			throw new CustomException("Error in adding a Car ");
		}
	}
	//get All
	public List<cars> getAllCars()throws CustomException
	{
		try {
			return carRepo.findAll();
				
		}catch(Exception e)
		{
			throw new CustomException("Error in getting all cars");
		}
	}
	//get by id
	public cars getCarById(long id)throws CustomException
	{
		try {
			Optional<cars> enteredCar=carRepo.findById(id);
			cars newCar =enteredCar.get();
			//String model, String type, long pricePerDay, boolean isAvailable, byte[] imageData,
			//String yearOfManufacturingl, String status
			carDto newCarDto= new carDto(newCar.getModel(),newCar.getType(),newCar.getPricePerDay(),newCar.isAvailable(),newCar.getimageData(),
					newCar.getYearOfManufacturingl(),newCar.getStatus());
			return newCar;
		}catch(Exception e)
		{
			throw new CustomException("Error in getting car by id");
		}
	}
	//update
	public boolean updateCar(cars enteredCar)throws CustomException
	{
		try {
			cars newCar=getCarById(enteredCar.getCar_id());
			newCar.setModel(enteredCar.getModel());
			newCar.setType(enteredCar.getType());
			newCar.setPricePerDay(enteredCar.getPricePerDay());
			newCar.setAvailable(enteredCar.isAvailable());
			newCar.setimageData(enteredCar.getimageData());
			newCar.setYearOfManufacturingl(enteredCar.getYearOfManufacturingl());
			newCar.setStatus(enteredCar.getStatus());
			carRepo.save(newCar);
			return true;
			
		}catch(Exception e)
		{
			throw new CustomException("Error in Updating the car");
		}
	}
	//delete
	public void deleteCar(long car_Id)throws CustomException
	{
		cars enteredCar=getCarById(car_Id);
		carRepo.delete(enteredCar);
	}

}
