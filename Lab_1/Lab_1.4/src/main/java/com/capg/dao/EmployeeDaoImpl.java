package com.capg.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.capg.entities.Employee;

@Component
public class EmployeeDaoImpl implements EmployeeDao {
	
	private Map<Integer,Employee> map = new HashMap<Integer, Employee>() ;
	
	public  EmployeeDaoImpl() {
		
		map.put(1001, new Employee(1001,"Vaibhav",35000)) ;
		 map.put(1002, new Employee(1002,"Shubham",45000));
		
 	}

	public List<Employee> fetchAllEmployee() {
		Collection<Employee> collection = map.values();
		List<Employee> empList = new ArrayList(collection);
		return empList;
	}
	
	public Employee FindEmployee(int id) {
		Employee employee = map.get(id) ;
		return employee ;
		
	}

	
	

}
