package com.cg.controllerclass;

import com.cg.employeeinterface.Employee;
import com.cg.servicelayer.EmployeeService;

public class AppController {

	private EmployeeService employeeService;

	public void addEmployee(Employee emp) {
		employeeService.addEmployee(emp);
	}

	public void deleteEmp(int empId) {
		employeeService.deleteEmp(empId);
	}

	public void viewAllEmployee() {
		employeeService.viewAllEmployee();
	}

	public void getEmpById(int empId) {
		employeeService.getEmpById(empId);
	}

}
