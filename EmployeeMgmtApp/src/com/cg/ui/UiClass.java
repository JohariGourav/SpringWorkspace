package com.cg.ui;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.controllerclass.AppController;
import com.cg.employeeinterface.Employee;
import com.cg.servicelayer.EmployeeService;

public class UiClass {

	private AppController appController = new AppController();
	Employee employee = new Employee();

	// ApplicationContext context = new
	// ClassPathXmlApplicationContext("context.xml");

	Scanner scanner = new Scanner(System.in);

	public void acceptData() {

		System.out.println("What you want to do?");
		System.out.println("1. Add Employee");
		System.out.println("2. View all employee");
		System.out.println("3. Get employee by id");
		System.out.println("4. Delete Employee");
		System.out.println("enter choice");
		int ch = scanner.nextInt();

		switch (ch) {
		case 1:
			System.out.println("enter employee id");
			int id = scanner.nextInt();
			employee.setId(id);
			System.out.println("enter employee name");
			String name = scanner.next();
			employee.setName(name);
			System.out.println("enter employee salary");
			int salary = scanner.nextInt();
			employee.setSalary(salary);
			appController.addEmployee(employee);
			System.out.println("employee added");
			break;

		case 2:
			appController.viewAllEmployee();
			break;

		default:
			System.out.println("invalid");
			break;
		}
		System.out.println("executed");
	}
}
