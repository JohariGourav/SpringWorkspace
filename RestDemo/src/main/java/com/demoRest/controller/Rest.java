package com.demoRest.controller;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.swing.plaf.BorderUIResource.LineBorderUIResource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.Resources;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.demoRest.pojo.Employee;
import com.demoRest.service.ServiceEmployee;

@RestController
public class Rest {

	@Autowired
	ServiceEmployee service;

	@RequestMapping(value = "/hello/{name}", method = RequestMethod.POST)
	public String hello(@PathVariable String name) {
		return "hello " + name;
	}

	// Add New Employee
	@RequestMapping(value = "/addNewEmployee", method = RequestMethod.POST)
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}
	
	// View All Employees
	@RequestMapping (value = "/viewAll", method = RequestMethod.GET)
	public List<Employee> viewAll() {
		return service.viewAll();
	}

	// View All By Pagination employees
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/viewAllByPagination/{start}/{count}", method = RequestMethod.GET, produces = "application/json")
	public Resources<List<Employee>> viewAllByPagination(@PathVariable int start, @PathVariable int count) {
		
		List<Employee> tempEmployees = service.viewAll();
		List<Employee> employees = new ArrayList<>();
		
		for (int i = start-1; i < (start + count < tempEmployees.size() ? start + count : tempEmployees.size())-1; i++) {
			employees.add(tempEmployees.get(i));
		}
		Link nextLink = linkTo(methodOn(Rest.class)
				.viewAllByPagination(start + count < tempEmployees.size() ? start + count : tempEmployees.size() - 1, count))
						.withRel("nextLink");
		Link previousLink = linkTo(methodOn(Rest.class).viewAllByPagination(start - count >= 0 ? start - count : 0, count))
				.withRel("previousLink");

		@SuppressWarnings({ "rawtypes" })
		Resources resource = new Resources(employees, previousLink, nextLink);
		return resource;
	}

	// Get employee by ID
	@RequestMapping(value = "/getEmployee/{id}", method = RequestMethod.GET, produces = "application/xml")
	public Resource<Employee> getEmpById(@PathVariable int id) {
		Employee employee = service.getEmpById(id);
		Link getAllEmployees = linkTo(methodOn(Rest.class).viewAllByPagination(0, 3)).withRel("See All Employees");
		Resource resource = new Resource(employee, getAllEmployees);
		return resource;
	}

	// Update employee by ID
	@RequestMapping(value = "/updateEmployee/{id}", method = RequestMethod.PUT, consumes = "application/xml")
	public void updateEmpById(@RequestBody Employee employee, @PathVariable("id") int id) {
		service.updateEmpById(employee, id);
	}

	// Delete employee by ID
	@RequestMapping(value = "/deleteEmployee/{id}", method = RequestMethod.DELETE)
	public void deleteEmpById(@PathVariable int id) {
		service.deleteEmpById(id);
	}
}
