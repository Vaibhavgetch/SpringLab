package com.capg.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.capg.dao.EmployeeDaoImpl;
import com.capg.entities.Employee;
import com.capg.exception.EmployeeNotFoundException;

@Component
public class EmployeeServiceImpl implements EmployeeService{

	private EmployeeDaoImpl empimpdao ;
	
	
	
	
	public EmployeeDaoImpl getEmpimpdao() {
		return empimpdao;
	}

	public void setEmpimpdao(EmployeeDaoImpl empimpdao) {
		this.empimpdao = empimpdao;
	}

	public List<Employee> fetchAllEmployees() {
		
		return empimpdao.fetchAllEmployee() ;
	}

	public Employee findEmployee(int empId)  {
		Employee emp = empimpdao.FindEmployee(empId) ;
		
		if(emp == null) {
			throw new EmployeeNotFoundException("No employee found") ;
		}
		return emp;
		
	}
}
