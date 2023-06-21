package com.codingninja.PriorityQueue.MinQueue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {

	public static void downHeapify(int arr[],int i,int n){
		int parentIndex=i;
		int leftchildindex=2*parentIndex+1;
		int rightchildindex=2*parentIndex+2;
		while(leftchildindex<n) {
			int minIndex=parentIndex;
			if(arr[leftchildindex]<arr[minIndex]) 
			{
				minIndex=leftchildindex;
			}
			if(rightchildindex<n&&arr[rightchildindex]<arr[minIndex]) 
			{
				minIndex=rightchildindex;
			}
			if(minIndex==parentIndex) {return;}
			int temp=arr[parentIndex];
			arr[parentIndex]=arr[minIndex];
			arr[minIndex]=temp;
			parentIndex=minIndex;
			leftchildindex=2*parentIndex+1;
			rightchildindex=2*parentIndex+2;
		}
	}
	
	public static void heapSortArray(int arr[]) {

		//Build the heap 
			int n=arr.length;
			for(int i=(n/2)-1;i>=0;i--) {
				downHeapify(arr,i,n);
			}
			//remove elements to their respective elements
			for(int i=n-1;i>=0;i--) {
				int temp =arr[i];
				arr[i]=arr[0];
				arr[0]=temp;
				downHeapify(arr,0,i);
				
			}
			
	}
	
	//printing k elements of an arraylist using priorityqueue	
	public static void printKlargest(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
		{
		pq.add(arr[i]);	
		}
		for(;i<arr.length;i++)
		{
			int min=pq.element();
			if(min<arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		while(!pq.isEmpty()) {
			System.out.println(pq.remove()+" ");
		}
		
	}
	
	//returning k elements of an arraylist using priorityqueue
	public static ArrayList<Integer> kLargest(int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++)
		{
		pq.add(input[i]);	
		}
		for(;i<input.length;i++)
		{
			int min=pq.peek();
			if(min<input[i]) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		 ArrayList<Integer> a1=new ArrayList<>();
		while(!pq.isEmpty()) {
			a1.add(pq.remove());
		}
		return a1;
	}

	//print k smallest element of array
	public static ArrayList<Integer> kSmallest(int n,int input[], int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
		
		int i=0;
		for(;i<k;i++)
		{
		pq.add(input[i]);	
		}
		
		for(;i<n;i++)
		{
			int min=pq.peek();
			if(min>input[i]) {
				pq.remove();
				pq.add(input[i]);
			}
		}
		 ArrayList<Integer> a1=new ArrayList<>();
		while(!pq.isEmpty()) {
			a1.add(pq.remove());
		}
		return a1;
	}

	//print k th largest element
	public static int kthlargestelement(int arr[],int k) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		for(int i=0;i<k;i++) {
			pq.add(arr[i]);
		}
			for(int i=k;i<arr.length;i++) {
				if(pq.peek()<arr[i]) {
					pq.poll();
					pq.add(arr[i]);
				}                      
			}
			return pq.peek();
		}


	//Check Max-Heap
	public static boolean checkMaxHeap(int arr[]) 
	{
		boolean check=true;
	for(int i=0;i<arr.length;i++) 
		{
		int paretindex=i;
		int leftchildindex=2*i+1;
		int rightchildindex=2*i+2;
		if(leftchildindex<arr.length&&arr[leftchildindex]>arr[paretindex])
			{
			check=false;
			}
		if(rightchildindex<arr.length&&arr[rightchildindex]>arr[paretindex]) 
			{
			check=false;
			}
		}	
		return check;
	}
	
	public static void main(String[] args) throws PriortyQueueException
	{

		int[] arr= {2, 6, 10, 11, 13, 4, 1, 20};
		int x=kthlargestelement(arr,3);
		System.out.println(x);
		}
		
	
}
