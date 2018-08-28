package com.demoRest.service;

import java.util.List;

import com.demoRest.pojo.Customer;

public interface ServiceCustomer {

	void addNewCustomer(Customer customer);

	List<Customer> viewAll();

	Customer getCustomerByName(String name);

	void deleteCustById(String id);

	void updateCustById(Customer customer);

}