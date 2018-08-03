package com.cg.servicelayer;

import com.cg.datalayer.EmployeeDao;
import com.cg.employeeinterface.Employee;

public class EmployeeService {
	
	EmployeeDao dao = new EmployeeDao();
	
	public void addEmployee(Employee emp ) {
		dao.addEmployee(emp);
	}

	public void deleteEmp(String empName) {
		dao.deleteEmp(empName);
	}

	public void viewAllEmployee() {
		dao.viewAllEmployee();
	}

	public void getEmpById() {
		dao.getEmpById();
	}

}
