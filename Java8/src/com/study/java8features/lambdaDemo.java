package com.study.java8features;
interface A{
	void show(int i);
	
}
//class B implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Hello");	
//	}
//}
public class lambdaDemo {
	
	public static void main(String[] args) {
		//	A obj=new A() {//Anonymous inner class
		//		public void show(){
		//	
		//			System.out.print("Hello");
		//		}
		//	
		//	};
		//		

	//this is by use of lambda expression.if only single line(method)
	//is present we can remove the curly braces 
		//from this there will be no inner class created which helps in less usage of space
	A obj2 = (i) ->
	{
		System.out.print("Hello"+i);
	};
	obj2.show(6);
}
	}
