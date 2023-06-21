package com.cn.loops;
//Entry Controlled Loop
//when no of iterations are not known
public class WhileDemo {
	public static void main(String[] args) {
		//basic While loop structure
		int i=23;
		boolean res=true;
		while(res) {
			System.out.print(i+" ");
			i++;
			if(i==46) {
				res=false;
			}
		}
	}
}
