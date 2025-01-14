package com.app.Entities;

import java.util.Arrays;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "cars")
public class cars {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long car_id;
	
	private String model;
	private String type;
	private long pricePerDay;
	private boolean isAvailable;
	
	@Lob
	private byte[] imageData;
	
	private String yearOfManufacturingl;
	private String status;
	
	@OneToMany(mappedBy = "car" ,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<rental> rentals;
	
	public cars() {
		
	}

	public cars(String model, String type, long pricePerDay, boolean isAvailable, byte[] imageData,
			String yearOfManufacturingl, String status) {
		super();
		this.model = model;
		this.type = type;
		this.pricePerDay = pricePerDay;
		this.isAvailable = isAvailable;
		this.imageData = imageData;
		this.yearOfManufacturingl = yearOfManufacturingl;
		this.status = status;
	}

	public cars(Long car_id, String model, String type, long pricePerDay, boolean isAvailable, byte[] imageData,
			String yearOfManufacturingl, String status) {
		super();
		this.car_id = car_id;
		this.model = model;
		this.type = type;
		this.pricePerDay = pricePerDay;
		this.isAvailable = isAvailable;
		this.imageData = imageData;
		this.yearOfManufacturingl = yearOfManufacturingl;
		this.status = status;
	}

	public Long getCar_id() {
		return car_id;
	}

	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public long getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(long pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public boolean isAvailable() {
		return isAvailable;
	}

	public void setAvailable(boolean isAvailable) {
		this.isAvailable = isAvailable;
	}

	public byte[] getimageData() {
		return imageData;
	}

	public void setimageData(byte[] imageData) {
		this.imageData = imageData;
	}

	public String getYearOfManufacturingl() {
		return yearOfManufacturingl;
	}

	public void setYearOfManufacturingl(String yearOfManufacturingl) {
		this.yearOfManufacturingl = yearOfManufacturingl;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "cars [car_id=" + car_id + ", model=" + model + ", type=" + type + ", pricePerDay=" + pricePerDay
				+ ", isAvailable=" + isAvailable + ", imageData=" + Arrays.toString(imageData)
				+ ", yearOfManufacturingl=" + yearOfManufacturingl + ", status=" + status + "]";
	}

	
}
