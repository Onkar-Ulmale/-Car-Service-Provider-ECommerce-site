package com.app.Entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class Users {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	private String name;
	private String email;
	private String password;
	private long Driving_license_number;
	private String phonenumber;
	
	@OneToMany(mappedBy = "user" , cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<rental> rentals;
	
	public Users() {
		// TODO Auto-generated constructor stub
	}
	public Users(Long user_id, String name, String password, long driving_license_number, String phonenumber) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.password = password;
		Driving_license_number = driving_license_number;
		this.phonenumber = phonenumber;
	}
	
	public Users(String name, String email, String password, long driving_license_number, String phonenumber) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		Driving_license_number = driving_license_number;
		this.phonenumber = phonenumber;
	}
	public Long getUser_id() {
		return user_id;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Users(long user_id, String name, String email, String password, long driving_license_number,
			String phonenumber, List<rental> rentals) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.email = email;
		this.password = password;
		Driving_license_number = driving_license_number;
		this.phonenumber = phonenumber;
		this.rentals = rentals;
	}
	@Override
	public String toString() {
		return "Users [user_id=" + user_id + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", Driving_license_number=" + Driving_license_number + ", phonenumber=" + phonenumber + ", rentals="
				+ rentals + "]";
	}
	

	
}
