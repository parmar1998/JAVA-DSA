package com.cn.patterns;

import java.util.Scanner;
/* To Print :-
55555
4444
333
22
1
 */
public class InvertedPattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int p=n;
		while(i<=n) {
			int j=1;
			while(j<=n-i+1) {
				System.out.print(p);
				j++;
			}
			System.out.println();
			i++;
			p--;
		}
	}
}
