package com.demoRest.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {

	public String name;
	
	@Id
	public int empId;

	public Employee() {
		super();
	}

	public Employee(String name, int
			empId) {
		super();
		this.name = name;
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	

}
