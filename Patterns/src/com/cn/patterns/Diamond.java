package com.cn.patterns;

import java.util.Scanner;
/*
 * To print
   *
  ***
 *****
*******
 *****
  ***
   *
 */
public class Diamond {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		n=n/2+1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			int p1=1;
			while(p1<=i) {
				System.out.print("*");
				p1++;
			}
			int p2=i-1;
			while(p2>=1) {
				System.out.print("*");
				p2--;
			}
			i++;
			System.out.println();
		}
		i=n-1;
		while(i>=1) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(" ");
				spaces++;
			}
			int p1=1;
			while(p1<=i) {
				System.out.print("*");
				p1++;
			}
			int p2=i-1;
			while(p2>=1) {
				System.out.print("*");
				p2--;
			}
			i--;
			System.out.println();
			
		}
		sc.close();
	}
}
