package com.app.dto;

import java.util.Date;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.app.Entities.rental;

public class paymentDto {

	private rental rental;
	private int amount;
	private Date payment_date;
	private String satus;//completed,pending cancelled
	private String payment_method;
	public paymentDto(com.app.Entities.rental rental, int amount, Date payment_date, String satus,
			String payment_method) {
		super();
		this.rental = rental;
		this.amount = amount;
		this.payment_date = payment_date;
		this.satus = satus;
		this.payment_method = payment_method;
	}
	public rental getRental() {
		return rental;
	}
	public void setRental(rental rental) {
		this.rental = rental;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public Date getPayment_date() {
		return payment_date;
	}
	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}
	public String getSatus() {
		return satus;
	}
	public void setSatus(String satus) {
		this.satus = satus;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	
	
	
	
}
