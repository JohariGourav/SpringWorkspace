package com.demoRest.service;

import java.util.List;

import com.demoRest.pojo.Employee;

public interface ServiceEmployee {

	void addNewEmployee(Employee employee);

	List<Employee> viewAll();

	Employee getEmpById(int id);

	void deleteEmpById(int id);

	void updateEmpById(Employee employee, int id);

}