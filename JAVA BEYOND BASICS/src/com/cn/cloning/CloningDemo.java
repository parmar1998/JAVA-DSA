package com.cn.cloning;

class Employee implements Cloneable{
	int empid;
	String EmpName;
	String Dept;

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmpName() {
		return EmpName;
	}

	public void setEmpName(String empName) {
		EmpName = empName;
	}

	public String getDept() {
		return Dept;
	}

	public void setDept(String dept) {
		Dept = dept;
	}

	public Employee(int empid, String empName, String dept) {
		this.empid = empid;
		this.EmpName = empName;
		this.Dept = dept;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}

class CloningDemo implements Cloneable{
	public static void main(String[] args) throws CloneNotSupportedException {
		Employee emp1=new Employee(1, "John", "Wick");
		Employee emp2=(Employee)emp1.clone();
		
	}
}
