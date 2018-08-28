package com.demoRest.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.hateoas.ResourceSupport;
import org.springframework.stereotype.Repository;

import com.demoRest.pojo.Employee;

@Repository
public class DaoEmployeeImpl implements DaoEmployee {

	private List<Employee> employeeList = new ArrayList<>();

	
	  { addToList(); }
	 

	private void addToList() {
		employeeList.add(new Employee("karan", 102));
		employeeList.add(new Employee("Tarun", 101));
		employeeList.add(new Employee("Deepak", 103));
		employeeList.add(new Employee("Ritik", 104));
		employeeList.add(new Employee("Harish", 105));
		employeeList.add(new Employee("Mahendra", 106));
		employeeList.add(new Employee("Suraj", 107));
		employeeList.add(new Employee("Tanmay", 108));
	}

	@Override
	public void addNewEmployee(Employee employee) {
		employeeList.add(employee);
	}

	@Override
	public List<Employee> viewAll() {
		return employeeList;
	}

	@Override
	public Employee getEmpById(int id) {
		return employeeList.stream().filter(emp -> emp.getEmpId() == id).findFirst().get();
	}
	
	public void deleteById(int id) {
		employeeList.remove(id);
	}

	@Override
	public void updateEmpById(Employee employee, int id) {
		for (int i = 0; i < employeeList.size(); i++) {
			Employee emp = employeeList.get(i);
			if (emp.getEmpId() == id) {
				employeeList.set(i, employee);
				break;

			}
		}

	}
}
