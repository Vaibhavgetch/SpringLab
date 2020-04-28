package com.capg.lab1.q2;

public class SBU {
	
	private int sbuId ;
	private String sbuName ;
	private String sbuHead ;
	public void setSbuId(int sbuId) {
		this.sbuId = sbuId;
	}
	public void setSbuName(String sbuName) {
		this.sbuName = sbuName;
	}
	public void setSbuHEAD(String sbuHead) {
		this.sbuHead = sbuHead;
	}
	@Override
	public String toString() {
		return "SBU [sbuId=" + sbuId + ", sbuName=" + sbuName + ", sbuHead=" + sbuHead + "]";
	}
	
	
     

}
