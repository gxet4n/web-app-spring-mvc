package com.eduardo.springdemo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.eduardo.utils.DateUtils;

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
	@NotNull(message="is required")
	@Min(value=0, message="must be equal to or greater than 0")
	@Max(value=5, message="must be equal to or less than 5")
	private int discountCoupons;
	
	@Column(name="birth_date")
	@Temporal(TemporalType.DATE)
	private Date birthDate;
	
	@Column(name="color")
	private String color;
	
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

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// Good for debugging actions
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", discountCoupons=" + discountCoupons + ", birthDate=" + DateUtils.formatDate(birthDate) + ", color=" + color + "]";
	}

	

	

}
