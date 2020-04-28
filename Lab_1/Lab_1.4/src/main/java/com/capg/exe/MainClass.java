package com.capg.exe;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.config.Config;
import com.capg.entities.Employee;
import com.capg.exception.EmployeeNotFoundException;
import com.capg.service.EmployeeServiceImpl;

public class MainClass {

	public static void main(String[] args) throws EmployeeNotFoundException {
	
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class) ;
   
        EmployeeServiceImpl emp_impl = context.getBean(EmployeeServiceImpl.class);
		List<Employee> emplist = emp_impl.fetchAllEmployees();
		System.out.println("Enter Employee Id : ");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt() ;
        Employee employee=emp_impl.findEmployee(id);
		System.out.println(employee);
	}

}
