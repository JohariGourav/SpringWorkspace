package com.demoRest;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.demoRest.pojo.Customer;
import com.demoRest.pojo.Employee;
import com.demoRest.service.ServiceCustomerImpl;
import com.demoRest.service.ServiceEmployeeImpl;

@SpringBootApplication
public class RestDemoApp 
{
    public static void main( String[] args )
    {
        SpringApplication.run(RestDemoApp.class, args);
    }
    
    @Bean
    public CommandLineRunner initialDataLoader(ServiceEmployeeImpl service, ServiceCustomerImpl customer) {
    	return (args) -> {
    		service.addNewEmployee(new Employee("karan", 102));
    		service.addNewEmployee(new Employee("Tarun", 101));
    		service.addNewEmployee(new Employee("Deepak", 103));
    		service.addNewEmployee(new Employee("Ritik", 104));
    		service.addNewEmployee(new Employee("Harish", 105));
    		service.addNewEmployee(new Employee("Mahendra", 106));
    		service.addNewEmployee(new Employee("Suraj", 107));
    		service.addNewEmployee(new Employee("Tanmay", 108));
    		customer.addNewCustomer(new Customer("Tarun"));
    		customer.addNewCustomer(new Customer("Arvind"));
    		customer.addNewCustomer(new Customer("Deepak"));
    		customer.addNewCustomer(new Customer("Chandan"));
    		System.out.println("DATA POPULATED");
    	};
    }
}
