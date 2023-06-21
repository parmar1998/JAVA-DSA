package com.cn.patterns;

import java.util.Scanner;

/*
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 1 2 3 4 5
 */
public class Pattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n) {
				System.out.print(" "+j);
				j=j+1;			
			}
			System.out.println();
			i++;
		}
		
	}
}
