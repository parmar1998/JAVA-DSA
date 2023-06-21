package com.cn.patterns;

import java.util.Scanner;
/*
 * To Print
  	ABCDE
	ABCDE
	ABCDE
	ABCDE
	ABCDE
 */
public class CharacterPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				char jthchar=(char) ('A'+j-1);
				System.out.print(jthchar);
				j++;	
			}
			System.out.println();
			i++;
		}
	}
}
