package com.capg.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.capg.beans.Employee;
import com.capg.beans.SBU;
import com.capg.config.config;

public class MainClass {

	

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
	
		Employee e1 =context.getBean(Employee.class);
		e1.setEmpId(1);
		e1.setEmpName("Vaibhav");
		e1.setSalary(40000);
		
		Employee e2 = context.getBean(Employee.class);
		e2.setEmpId(2);
		e2.setEmpName("Shubham");
		e2.setSalary(40000);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(e1);
	    list.add(e2);
		
		SBU sbu = context.getBean(SBU.class);
		sbu.setEmpList(list);
		
		System.out.println(sbu);
		
		
		
		
	}

}
	

