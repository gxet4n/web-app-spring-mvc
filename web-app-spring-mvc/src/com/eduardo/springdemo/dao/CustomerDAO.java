package com.eduardo.springdemo.dao;

import java.util.List;

import com.eduardo.springdemo.entity.Customer;

public interface CustomerDAO {

	public List<Customer> getCustomers();

	public void saveCustomer(Customer theCustomer);

	public Customer getCustomer(int theId);

	public void deleteCustomer(int theId);

	public List<Customer> searchCustomers(String theSearch);

	public List<Customer> getCustomersAgeFiltered();

	public void deleteAllCustomers();
}
