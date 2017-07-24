package com.eduardo.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.eduardo.springdemo.dao.CustomerDAO;
import com.eduardo.springdemo.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	// CustomerDAO injected
	@Autowired
	private CustomerDAO customerDAO;
	
	@Override
	@Transactional
	public List<Customer> getCustomers() {
		return customerDAO.getCustomers();
	}

	@Override
	@Transactional
	public void saveCustomer(Customer theCustomer) {
		customerDAO.saveCustomer(theCustomer);
	}

	@Override
	@Transactional
	public Customer getCustomer(int theId) {
		return customerDAO.getCustomer(theId);
	}

	@Override
	@Transactional
	public void deleteCustomer(int theId) {
		customerDAO.deleteCustomer(theId);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomers(String theSearch) {
		return customerDAO.searchCustomers(theSearch);
	}

	@Override
	@Transactional
	public List<Customer> getCustomersAgeFiltered() {
		return customerDAO.getCustomersAgeFiltered();
	}

	@Override
	@Transactional
	public void deleteAllCustomers() {
		customerDAO.deleteAllCustomers();
	}
}
