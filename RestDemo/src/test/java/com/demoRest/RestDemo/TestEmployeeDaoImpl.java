package com.demoRest.RestDemo;

import java.util.NoSuchElementException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import com.demoRest.dao.DaoImpl;
import com.demoRest.pojo.Employee;

@RunWith(SpringRunner.class)
@TestConfiguration
public class TestEmployeeDaoImpl {
	
	@TestConfiguration
	static class EmployeeDaoImplTestConfiguration {
		
		@Bean
		public DaoImpl testServiceImpl() {
			return new DaoImpl();
		}
	}

	private static Employee employee;
	
	@Autowired
	private DaoImpl dao;
	
	@BeforeClass
	public static void objectCreation() {
		 employee = new Employee("Rakesh", 114);
	}
	
	@Test
	public void testAddNewEmployee() {
		
		dao.addNewEmployee(employee);
		Employee tempEmployee = dao.getEmpById(114);
		Assert.assertEquals(employee, tempEmployee);
	}
	
	@Test
	public void testNegativeAddNewEmployee() {
		
		dao.addNewEmployee(employee);
		Employee tempEmployee = dao.getEmpById(114);
		Assert.assertNotSame(null, tempEmployee);
	}
	
	@Test(expected=NoSuchElementException.class)
	public void testDelete() {
		dao.deleteById(114);
		
		Assert.assertEquals("NO Such Elements", null, dao.getEmpById(114));
	}

}
