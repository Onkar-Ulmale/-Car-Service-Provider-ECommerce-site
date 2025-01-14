package com.app.Entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "payments")
public class payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long payment_id;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rental_id")
	private rental rental;
	
	public payment(com.app.Entities.rental rental, int amount, Date payment_date, String satus, String payment_method) {
		super();
		this.rental = rental;
		this.amount = amount;
		this.payment_date = payment_date;
		this.satus = satus;
		this.payment_method = payment_method;
	}

	private int amount;
	private Date payment_date;
	private String satus;//completed,pending cancelled
	private String payment_method;
	
	

	public payment(long payment_id, int amount, Date payment_date, String satus, String payment_method,
			com.app.Entities.rental rental) {
		super();
		this.payment_id = payment_id;
		this.amount = amount;
		this.payment_date = payment_date;
		this.satus = satus;
		this.payment_method = payment_method;
		this.rental = rental;
	}

	public long getPayment_id() {
		return payment_id;
	}

	public void setPayment_id(long payment_id) {
		this.payment_id = payment_id;
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

	public rental getRental() {
		return rental;
	}

	public void setRental(rental rental) {
		this.rental = rental;
	}

	@Override
	public String toString() {
		return "payment [payment_id=" + payment_id + ", amount=" + amount + ", payment_date=" + payment_date
				+ ", satus=" + satus + ", payment_method=" + payment_method + ", rental=" + rental + "]";
	}
	
	
	

}
