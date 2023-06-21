package Fulltest1;

import java.util.Scanner;

public class InfiniteSequence {
	public static int search(int a[],int x,int index){
		for(int i=index-2;i>=0;i--){
			if(a[i]==x)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[128];
		a[0]=0;
		for(int i=1;i<128;i++){
			int index=search(a,a[i-1],i);
			if(index==-1)
			a[i]=0;
			else
			a[i]=i-index-1;
		}
		
	
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++){
			if(a[i]==a[n-1])
			count++;
	}
		System.out.println(count);
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		s.close();
	}

}
