package com.cn.patterns;

import java.util.Scanner;
/*
 To print
FFFFF
FFFF
FFF
FF
F
 */
public class Mirror_pattern_Inverted {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=(n-i+1)) {
				System.out.print("F");
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
