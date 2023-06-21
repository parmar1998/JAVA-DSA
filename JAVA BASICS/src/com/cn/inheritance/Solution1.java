package com.cn.inheritance;
//why do we need inheritance =  For Code re usability
class Student {
	String name;
	String id;
	int marks;
	
	public Student(String name,String id,int marks) {
		this.name=name;
		this.id=id;
		this.marks=marks;
	}
	//Overloading can be achieved by interchanging the arguments as well 
	public void getMarksbyid(int marks,int id) {
		System.out.println(id+": "+marks);
	}
	public void getMarksbyname(int marks,String name) {
		System.out.println(name+": "+marks);	
	}
	//this here is the VARargs,the argument shall be treated as array and no of element can be passed.
	//so in this case we don't have to write many cases again n again
	public int getMark(int...marks) {
		int sum=0;
		for(int elem:marks) {
			sum=elem+sum;
		}
		return sum;
	}
}
class MBBSStudent extends Student{
	String Speciality;

	public MBBSStudent(String name, String id, int marks,String Speciality) {
		super(name, id, marks);
		this.Speciality=Speciality;
	}
	
	
}
public class Solution1 {

	public static void main(String[] args) {
		
	}
}
