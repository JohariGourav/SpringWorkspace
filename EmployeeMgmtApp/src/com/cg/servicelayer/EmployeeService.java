package com.cg.servicelayer;

import com.cg.datalayer.EmployeeDao;
import com.cg.employeeinterface.Employee;

public class EmployeeService {
	
	EmployeeDao employeeDao;
	
	public void addEmployee(Employee emp ) {
		employeeDao.addEmployee(emp);
	}

	public void deleteEmp(int empId) {
		employeeDao.deleteEmp(empId);
	}

	public void viewAllEmployee() {
		employeeDao.viewAllEmployee();
	}

	public void getEmpById(int empId) {
		employeeDao.getEmpById(empId);
	}

}
