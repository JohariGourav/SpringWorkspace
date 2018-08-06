package com.cg.datalayer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.cg.employeeinterface.Employee;

public class EmployeeDao {

	Employee employee = new Employee();
	List<Employee> empList = new ArrayList<>();
	private Map<Integer, Employee> employeeMap = new HashMap<>();
	private static int id;
	private int uniqId;
	
	static {
		id=100;
	}
	public void addEmployee(Employee emp) {
		empList.add(emp);
		uniqId = ++id;
		employeeMap.put(uniqId, emp);
		System.out.println("Your employee id is: " +uniqId);
	}

	public void deleteEmp(int id) {
		//list.removeIf();
		Set<Entry< Integer, Employee>> set = employeeMap.entrySet();
		for( Entry e: set ) {
			Predicate<Employee> getById = Employee -> e.getKey().equals(id);
			 empList.removeIf(getById);
		}
		System.out.println("account deleted");
	}

	public void viewAllEmployee() {
		//Consumer<Employee> consumer = System.out::println("fg");
		//list.stream().forEach(employ) -> System.out.println(employee));
		empList.stream().forEach(System.out::println);
	}

	public Employee getEmpById(int id ) {
		//list.contains(null);
		Set<Entry< Integer, Employee>> set = employeeMap.entrySet();
		for( Entry e: set ) {
			Predicate<Employee> getById = Employee -> e.getKey().equals(id);
			return (Employee) e.getValue();
		}
		return null;
	}

}
