package com.cg.employeeinterface;

public class Employee {

	//private int id;
	private String name;
	private int salary;
	
	@Override
	public String toString() {
		return "Employee [ name=" + name + ", salary=" + salary + "]";
	}

	//Getters Setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
