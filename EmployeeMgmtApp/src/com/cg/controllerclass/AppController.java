package com.cg.controllerclass;

import com.cg.employeeinterface.Employee;
import com.cg.servicelayer.EmployeeService;

public class AppController {

	private EmployeeService service = new EmployeeService();

	public void addEmployee(Employee emp) {
		service.addEmployee(emp);
	}

	public void deleteEmp(String empName) {
		service.deleteEmp(empName);
	}

	public void viewAllEmployee() {
		service.viewAllEmployee();
	}

	public void getEmpById() {
		service.getEmpById();
	}

}
