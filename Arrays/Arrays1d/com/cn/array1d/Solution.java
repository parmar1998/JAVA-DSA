package com.cn.array1d;

public class Solution {
	
	//Printing array
	public static void printArray(int arr[]) {
		for(int element:arr) {
			System.out.print(element+" ");
		}
		System.out.println();
	}
	
	//return count of pair sum 
	public static int pairSum(int arr[],int k) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;i<arr.length;i++) {
				if(arr[i]+arr[j]==k) {
					count++;
				}
			}	
		}
		return count;
	}
	
	//return sum of all elements.
	public static int sum(int arr[],int t) {
		int sum=0;
		while(t<=0) 
		{		
			for(int i=0;i<=arr.length;i++) {
				sum=sum+arr[i];
			}
			t--;
		}
		return sum;
	}
	
	//odd even pattern
	public static void function1(int arr[],int n) {
		int left=0;
		int right=n-1;
		int counter=1;
		if(counter%2==1) {
			arr[left++]=counter;
		}
		else {
			arr[right--]=counter;
		}
		counter++;
	}

	//BinarySearch 
	public static int Binarysearch(int arr[],int x) {
		int start=0;
		int end=arr.length;
		while(start<=end) {
			
			int mid=(start+end)/2;
			
			if(arr[mid]>x) {
				end=mid-1;
			}
			
			else if(arr[mid]<x) {
				start=mid+1;
			}
			
			else {
				return mid;
			}
		}
		return -1;
	}
	
	//bubble sort
	public static void BubbleSort(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length-i-1;j++) {
			if(arr[j]>arr[j+1]) {
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}	
	}
	}
	
	//largest Value
	public static int findlargest(int arr[]) {
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	
	//Finding Triplet Sum
	public static int findTripletSum(int arr[],int x) {
		int count=0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}	
			}
		}
		return count;
	}
	
	//Insertion sort
	public static void InsertionSort(int arr[]) {
		int n=arr.length;
		for(int i=1;i<n;i++) {
			int j=i-1;
			int temp=arr[i];
			while(j>=0&&arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
	}
	
	//Merging 2 sorted arrays
	public static int [] merge2sortedarray(int arr1[],int arr2[]) {
		int i=0;
		int j=0;
		int n=arr1.length+arr2.length;
		int arr[]=new int[n];
		int k=0;
		while(i<arr1.length && j<arr2.length) 
		{
			if(arr1[i]<=arr2[j]) 
			{
				arr[k]=arr1[i];
				i++;
				k++;
			}
			else {
				arr[k]=arr2[j];
				j++;
				k++;
			}
		}
		while(i<arr1.length) {
			arr[k]=arr1[i];
			i++;
			k++;
		}
		while(j<arr2.length) {
			arr[k]=arr2[j];
			j++;
			k++;
		}
		return arr;
	}

	//Push Zeroes at end
	public static void pushZeroesToEnd(int arr[]) {
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0) {
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				j++;
			}
		}
	}
	
	//Rotate Array by d points
	public static void rotate(int arr[],int d) {
		int p=1;
		while(p<=d) 
		{
			int last=arr[0];
			for(int i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=last;
			p++;
		}
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	//second and third largest in an array
	public static int SecondLargest(int arr[]) {
		int second;
		int third;
		int largest=third=second=Integer.MIN_VALUE;
		int count=0;
		for(int i=0;i<arr.length;i++) {
			largest=Math.max(largest, arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest)
				second=Math.max(second, arr[i]);
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=largest&&arr[i]!=second) {
				third=Math.max(third, arr[i]);
			}
		}
		return second;
	}
	
	//Selection Sort
	public static void SelectionSort(int arr[]) {
		
		int n=arr.length;
		for(int i=0;i<n-1;i++) 
		{
			int min=Integer.MAX_VALUE;
			int minindex=1;
			for(int j=i;j<n-1;j++) 
			{
				if(arr[j]<min) 
				{
					min=arr[j];
					minindex=j;
				}
			}
			int temp=arr[minindex];
			arr[minindex]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	//sum of 2 arrays
	public static void sumof2Arrays(int arr1[],int arr2[],int output[]) {
		int i=arr1.length-1;
		int j=arr2.length-1;
		int k=arr1.length-1;
		int carry=1;
		int s=0;
		while(j>=0) {
			s=arr1[i]+arr2[i]+carry;
			output[k]=s%10;
			carry=s/10;
			k--;
			j--;
			i--;
		}
		while(i>=0) {
			s=arr1[i]+carry;
			output[k]=s%10;
			carry=s/10;
			i--;
			k--;
		}
		int ans=0;
		if(carry==1)
			ans=10;
		for(i=0;i<=arr1.length-1;i++) {
			ans=ans+output[i];
			ans=ans*10;
		}
	}

	

	
	public static void main(String[] args) {
		int arr1[]={1,2,3};
		int x=SecondLargest(arr1);
		System.out.println(x);


	}
}
