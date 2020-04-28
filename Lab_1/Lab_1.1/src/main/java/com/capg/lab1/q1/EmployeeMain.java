package com.capg.lab1.q1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;




public class EmployeeMain {
	
	  public static void main(String[] args) {
              
		  ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")  ;
		  SBU sbu=(SBU)context.getBean("sbu");
		  Employee emp = (Employee) context.getBean("employee") ;
		  emp.displayData();
	}

	
	}


