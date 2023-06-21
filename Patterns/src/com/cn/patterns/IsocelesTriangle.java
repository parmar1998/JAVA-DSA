package com.cn.patterns;

import java.util.Scanner;
/*
 *To Print
 	 1
    121
   12321
  1234321
 123454321
12345654321
 */
public class IsocelesTriangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int spaces=1;
			while(spaces<=n-i) {
				System.out.print(' ');
				spaces++;
			}
			int nos=1;
			while(nos<=i) {
				System.out.print(nos);
				nos++;
			}
			int dec=i-1;
			while(dec>=1) {
				System.out.print(dec);
				dec=dec-1;
			}
			System.out.println();
			i++;
		}
	}
}
