package com.cn.serialization;

import java.io.Serializable;

public class EmployeeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	String name;
	String empid;
	String designation;
	transient int joblevel = 4; // Transient in Java is used to indicate that a field should not be part of the
								// serialization process.
	public EmployeeDTO(String name, String empid, String designation, int joblevel) {
		this.name = name;
		this.empid = empid;
		this.designation = designation;
		this.joblevel = joblevel;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmpid() {
		return empid;
	}
	public void setEmpid(String empid) {
		this.empid = empid;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getJoblevel() {
		return joblevel;
	}
	public void setJoblevel(int joblevel) {
		this.joblevel = joblevel;
	}
	@Override
	public String toString() {
		return "EmployeeDTO[empId=" + empid + ", name=" + name + ",designation=" + designation + ", joblevel="
				+ joblevel + "]";
	}
}
