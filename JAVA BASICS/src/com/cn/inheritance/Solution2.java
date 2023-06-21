package com.cn.inheritance;

class HelloWorld{
	HelloWorld(){
		System.out.println("in Helloworld");
	}
}
class Bye extends HelloWorld{
	Bye(){
		System.out.println("Bye");
	}
}
public class Solution2 {

	public static void main(String[] args) {
		HelloWorld w=new Bye();
	}
}
