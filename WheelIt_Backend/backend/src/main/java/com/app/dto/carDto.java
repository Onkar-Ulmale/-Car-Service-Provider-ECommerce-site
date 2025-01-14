package com.app.dto;

import java.util.Arrays;

import javax.persistence.Lob;

public class carDto {
	
	private String model;
	private String type;
	private long pricePerDay;
	private boolean isAvailable;
	
//	@Lob
//	private byte[] imageData;

	private String yearOfManufacturingl;
	private String status;
	public carDto(String model, String type, long pricePerDay, boolean isAvailable, byte[] imageData,
			String yearOfManufacturingl, String status) {
		super();
		this.model = model;
		this.type = type;
		this.pricePerDay = pricePerDay;
		this.isAvailable = isAvailable;
		//this.imageData = imageData;
		this.yearOfManufacturingl = yearOfManufacturingl;
		this.status = status;
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
//	public byte[] getImageData() {
//		return imageData;
//	}
//	public void setImageData(byte[] imageData) {
//		this.imageData = imageData;
//	}
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
		return "carDto [model=" + model + ", type=" + type + ", pricePerDay=" + pricePerDay + ", isAvailable="
				+ isAvailable + ", imageData=" + /*Arrays.toString(imageData) +*/ ", yearOfManufacturingl="
				+ yearOfManufacturingl + ", status=" + status + "]";
	}
	
	

}
