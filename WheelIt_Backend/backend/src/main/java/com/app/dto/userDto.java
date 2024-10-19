package com.app.dto;

public class userDto {
	
	private String name;
	private String password;
	private long Driving_license_number;
	private String email;
	private String phonenumber;
	public userDto(String name,String email, String password, long driving_license_number, String phonenumber) {
		super();
		this.name = name;
		this.email=email;
		this.password = password;
		Driving_license_number = driving_license_number;
		this.phonenumber = phonenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getDriving_license_number() {
		return Driving_license_number;
	}
	public void setDriving_license_number(long driving_license_number) {
		Driving_license_number = driving_license_number;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	
	

}
