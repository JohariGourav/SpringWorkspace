package com.demoRest.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import com.demoRest.pojo.Customer;
import com.demoRest.repository.CustomerRepository;

public class ServiceCustomerImpl implements ServiceCustomer {

	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void addNewCustomer(Customer customer) {
		customerRepository.save(customer);
	}

	@Override
	public List<Customer> viewAll() {
		return customerRepository.findAll();

	}

	@Override
	public Customer getCustomerByName(String name) {
		return customerRepository.findByName(name);

	}

	@Override
	public void deleteCustById(String id) {
		customerRepository.deleteById(id);
	}

	@Override
	public void updateCustById(Customer customer) {

		customerRepository.save(customer);
	}

}
