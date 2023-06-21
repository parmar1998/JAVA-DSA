package com.cn.Polymorphism;

class A {
	public  void display() {
		System.out.println("In Super");
	}
}

class B extends A {
	public  void display() {
		System.out.println("In SubClass");
	}
}

public class PolymorphismDemo {
	public static int add(int x, int y) {
		return x + y;
	}

	public static int add(int x, int y, int z) {
		return x + y + z;
	}

	public static void main(String[] args) {
		A a = new A();
		a.display();
		B b = new B();
		b.display();
		A a_Instance_b = new B();
		a_Instance_b.display();

	}
}
