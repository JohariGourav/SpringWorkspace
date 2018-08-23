package com.demoRest.dao;

import java.util.List;

import com.demoRest.pojo.Employee;

public interface DaoEmployee {

	void addNewEmployee(Employee employee);

	List<Employee> viewAll();

	Employee getEmpById(int id);

	void updateEmpById(Employee employee, int id);

}