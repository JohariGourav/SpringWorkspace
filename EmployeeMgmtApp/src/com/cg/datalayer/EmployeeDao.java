package com.cg.datalayer;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

import com.cg.employeeinterface.Employee;

public class EmployeeDao {

	Employee employee = new Employee();
	Set<Employee> list = new HashSet<>();

	public void addEmployee(Employee emp) {
		list.add(emp);
	}

	public void deleteEmp(String empName) {
		//list.removeIf();
	}

	public void viewAllEmployee() {
		//Consumer<Employee> consumer = System.out::println("fg");
		list.stream().forEach(employ) -> System.out.println(employee));
	}

	public void getEmpById() {
		//list.contains(null);
	}

}
