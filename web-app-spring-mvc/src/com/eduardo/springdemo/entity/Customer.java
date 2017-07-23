package com.eduardo.springdemo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	@NotNull(message="is required")
	@Size(min=2, max=20, message="length must be between 2 and 20")
	private String firstName;
	
	@Column(name="last_name")
	@NotNull(message="is required")
	@Size(min=2, max=20, message="length must be between 2 and 20")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="discount_coupons")
	private int discountCoupons;
	
	public Customer() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getDiscountCoupons() {
		return discountCoupons;
	}

	public void setDiscountCoupons(int discountCoupons) {
		this.discountCoupons = discountCoupons;
	}

	// Good for debugging actions
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", discountCoupons=" + discountCoupons + "]";
	}

}
