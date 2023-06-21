package com.cn.poly;

class Animal{
	public void AnimalSound() {
		System.out.println("The animal makes a sound");
	}
}
class Dog extends Animal{
	public void AnimalSound() {
		System.out.println("The Dog says : woof");
	} 
}
class Pig extends Animal{
	public void AnimalSound() {
		System.out.println("The Pig says : wee");
	} 
}
public class Understanding_polymorphism {

	public static void main(String[] args) {
		Animal myPig=new Pig();
		myPig.AnimalSound();
		Animal myDog=new Dog();
		myDog.AnimalSound();
		
	}
	 
}
