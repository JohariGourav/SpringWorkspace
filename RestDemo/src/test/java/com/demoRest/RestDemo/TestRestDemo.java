package com.demoRest.RestDemo;

import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;

import com.demoRest.dao.DaoEmployee;
import com.demoRest.dao.DaoImpl;
import com.demoRest.pojo.Employee;

public class TestRestDemo {
	
	
	
	
	
	private DaoEmployee dao = new DaoImpl();

	/*@Test
	public void test() {
		employee.setEmpId(101);
		Assert.assertEquals(101, employee.getEmpId());
	}*/
	
	@Test
	public void daoGetEmpByIdTest() {
		 Employee employee = new Employee();
		 employee = dao.getEmpById(101);
		Assert.assertEquals(employee, dao.getEmpById(101));
	}
	
	public void daoGetEmpByIdNegativeTest() {
		 Employee employee;
		 employee = dao.getEmpById(101);
		Assert.assertNotSame(employee, dao.getEmpById(102));
	}

	public void viewAllPositiveTest() {
		Collection<Employee> employee = dao.viewAll();
		Assert.assertEquals( employee, dao.viewAll());
	}
	
	public void viewAllNegativeTest() {
		Collection<Employee> employee = null;
		Assert.assertNotSame( employee, dao.viewAll());
	}
	
	public void updateEmpByIdPositiveTest() {
		Employee employee = new Employee();
		Assert.assertEquals( employee, dao.viewAll());
	}
}
