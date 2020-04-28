package com.capg.lab1.q2;

public class Employee {

	private int employeeId ;
	private String employeeName ;
	private double salary ;
	private String businessUnit ;
	private int age ;
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	public void displayData() {
		
		System.out.println("Employee Details ");
		System.out.println("----------------");
		System.out.println("Employee Id :"+ employeeId);
		System.out.println("Employee Name: "+ employeeName);
		System.out.println("Employee Salary :"+ salary);
		System.out.println("Employee BU :"+ businessUnit);
		System.out.println("Employee Age :" + age);
		
		
		
	}
	
		
		
	
}
