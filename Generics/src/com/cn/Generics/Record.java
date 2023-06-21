package com.cn.Generics;

import java.util.Set;

class Student {
	String name;
	int roll_no;
}

public class Record<T> {
	
private T record;
public void DisplayItems(T item) {
	System.out.println(item);
}
public static void main(String[] args) {
	
	Student s1=new Student();
	s1.name="Rupesh";
	s1.roll_no=12;
	
	Record<Student> student=new Record<>();
	student.DisplayItems(s1);
}
}
