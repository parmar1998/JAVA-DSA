package com.cn.patterns;

import java.util.Scanner;
/*
   1
  12
 123
1234
 */
public class Pattern4 {

	public static void main(String[] args) {
		Scanner sc=new  Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=(n-i)) {
				System.out.print(' ');
				spaces++;
			}
			int a=1;
			while(a<=i) {
				System.out.print(a);
				a++;
			}
			System.out.println();
			i=i+1;
		}
	}
}
