package com.cn.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		try (ObjectOutputStream objstreamout = new ObjectOutputStream(new FileOutputStream("Employee.txt"));
				ObjectInputStream obstreamIn = new ObjectInputStream(new FileInputStream("Employee.txt"));) {
			EmployeeDTO edto = new EmployeeDTO("1234", "John", "SE", 3);
			objstreamout.writeObject(edto);
			EmployeeDTO e = (EmployeeDTO) obstreamIn.readObject();
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
