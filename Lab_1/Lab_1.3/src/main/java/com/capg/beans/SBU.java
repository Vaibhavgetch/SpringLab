package com.capg.beans;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SBU {
    
	@Value("2101")
	private String sbuCode;
	
	@Value("Product Engineer Services")
	private String sbuName;
	
	@Value("Kiran Rao")
	private String sbuHead;
     
	@Autowired
	private List<Employee> empList;
	
	
	public SBU(String sbuCode, String sbuName, String sbuHead, List<Employee> empList) {
		super();
		this.sbuCode = sbuCode;
		this.sbuName = sbuName;
		this.sbuHead = sbuHead;
		this.empList = empList;
	}
	public SBU() {
		
	}

  public String getSbuCode() {
		return sbuCode;
	}
	public void setSbuCode(String sbuCode) {
		this.sbuCode = sbuCode;
	}
	public String getSbuName() {
		return sbuName;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public String getSbuHead() {
		return sbuHead;
	}
	public void setSbuHead(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	public List<Employee> getEmpList() {
		return empList;
	}
	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}
	@Override
	public String toString() {
		return "SBU [sbuCode=" + sbuCode + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + ", empList=" + empList
				+ "]";
	}

}
