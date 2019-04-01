package org.example.spring;

import org.springframework.stereotype.Component;

@Component
public class Department {
	
	final private String deptNo="D377";
	final private String deptName="Financial";
	
	
	public String getDeptNo() {
		return deptNo;
	}
	public String getDeptName() {
		return deptName;
	}
	@Override
	public String toString() {
		return "Department [deptNo=" + deptNo + ", deptName=" + deptName + "]";
	}
	
	
	

}
