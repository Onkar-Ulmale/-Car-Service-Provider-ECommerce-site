package com.app.dto;

import java.util.Date;

import com.app.Entities.Users;
import com.app.Entities.cars;

public class rentalDto {
	
	private Users user;
	private cars car;
	
	private Date start_date;
	private Date end_date;
	private int rental_price;
	private int deposite;
	private String Status;
	public rentalDto(Users user, cars car, Date start_date, Date end_date, int rental_price, int deposite,
			String status) {
		super();
		this.user = user;
		this.car = car;
		this.start_date = start_date;
		this.end_date = end_date;
		this.rental_price = rental_price;
		this.deposite = deposite;
		Status = status;
	}
	public Users getUser() {
		return user;
	}
	public void setUser(Users user) {
		this.user = user;
	}
	public cars getCar() {
		return car;
	}
	public void setCar(cars car) {
		this.car = car;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getRental_price() {
		return rental_price;
	}
	public void setRental_price(int rental_price) {
		this.rental_price = rental_price;
	}
	public int getDeposite() {
		return deposite;
	}
	public void setDeposite(int deposite) {
		this.deposite = deposite;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "rentalDto [user=" + user + ", car=" + car + ", start_date=" + start_date + ", end_date=" + end_date
				+ ", rental_price=" + rental_price + ", deposite=" + deposite + ", Status=" + Status + "]";
	}
	
	
	
	
	
	
	
	

}
