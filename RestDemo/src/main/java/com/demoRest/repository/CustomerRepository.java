package com.demoRest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.demoRest.pojo.Customer;

public interface CustomerRepository extends MongoRepository <Customer,String>{

	public Customer findByName(String name);
}
