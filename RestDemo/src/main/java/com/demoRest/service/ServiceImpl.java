package com.demoRest.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoRest.dao.DaoEmployee;
import com.demoRest.pojo.Employee;
import com.demoRest.repository.EmployeeRepository;

@Service
public class ServiceImpl implements ServiceEmployee {

	@Autowired
	private DaoEmployee dao;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	@Override
	public void addNewEmployee ( Employee employee) {
		employeeRepository.save(employee);
	}
	
	@Override
	public List<Employee> viewAll() {
		return employeeRepository.findAll();
		//return dao.viewAll();
	}
	
	
	@Override
	public Employee getEmpById(int id) {
		return employeeRepository.findById(id).get();
		//return dao.getEmpById(id);
	}
	
	
	@Override
	public void deleteEmpById(int id) {
		employeeRepository.deleteById(id);
	}
	
	@Override
	public void updateEmpById(Employee employee,int id) {
		
		 employeeRepository.save(employee);
	}
}
