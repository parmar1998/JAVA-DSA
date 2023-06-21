package FullTest2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {

	//rainbow array
	public static String Rainbow(int s[]) {
		int i,j,n=s.length;
		if(s[0]!=1)
			return "NO";
		for(i=0,j=n-1;i<j;i++,j--)
	          if((s[i]!=s[j]) || (s[i+1]-s[i]>1 )|| ( s[i+1]-s[i]<0 ) || (s[i]<1 )|| (s[i] > 7))
	               break;
		if(i<j || s[i]!=7)
            return "no";
      return "yes";
	}
	
	//reverse the linked list (every k)
	 public static Node reverse(Node head, int k) {
	        // Your code here
	        // Make change in the linked list only
	        // Return the head of the new Linked list
	        if (head == null)
	            return null;
	        Node current = head;
	        Node next = null;
	        Node prev = null;

	        int count = 0;

	        /* Reverse first k nodes of linked list */
	        while (count < k && current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	            count++;
	        }
	        /*
	         * next is now a pointer to (k+1)th node
	         * Recursively call for the list starting from
	         * current. And make rest of the list as next of
	         * first node
	         */
	        if (next != null)
	            head.next = reverse(next, k);

	        // prev is now head of input list
	        return prev;
	    }
	
	
	//sort an array - Higher frequency elements come first.
	//i/p:- [1,2,2,2,3,3] | o/p:-[2,2,2,3,3,1]
	 public static int sortByFreq(Integer[] arr, int n) {
		 
		 int maxE = -1;
		 
		 //find maximum element in array
		 for (int i = 0; i < n; i++) {
				maxE = Math.max(maxE, arr[i]);
			}
		 
		//create frequency array
		 int freq[] = new int[maxE + 1];
		
		 
		 for (int i = 0; i < n; i++) {
				freq[arr[i]]++;
			}
		 
		 int cnt = 0;
		 for (int i = 0; i <= maxE; i++) {

				// If freq of an element is
				// greater than 0 update the
				// value of arr[] at index cnt
				// & increment cnt
				if (freq[i] > 0) {

					int value = 100000 - i;
					arr[cnt] = 100000 * freq[i] + value;
					cnt++;
				}
			}
			return cnt;
	 }
	 public static void printSortedArray(Integer[] arr, int cnt) {

			// Traversing arr[] till index cnt
			for (int i = 0; i < cnt; i++)
			{
				// Find frequency of elements
				int frequency = arr[i] / 100000;

				// Find value at index i
				int value = 100000 - (arr[i] % 100000);

				// Traversing till frequency
				// to print value at index i
				for (int j = 0; j < frequency; j++) {
					System.out.print(value + " ");
				}
			}
		}
	
	
	//game of death
	public static void Josh(List<Integer> person,int k,int index) {
		//Base case : - only One person is left
			if(person.size()==1) {
				System.out.println(person.get(0));
				return;
			}
		//finding index that is going to be eliminated
		index=((index+k)%person.size());
		person.remove(index);
		
		//Recursive call for person n-1 persons
		Josh(person, k, index);
	}
	
	//binomial expression
	public static int factorial(int n) {
		int f=1;
		for(int i=2;i<=n;i++) {
			f=f*i;
			}
	return f;
	}
	public static void Series(int A,int X,int n) {
		  int nFact = factorial(n);
		  for (int i = 0; i < n + 1; i++) {
			  int niFact = factorial(n - i);
			  int iFact = factorial(i);
			  int aPow = (int)Math.pow(A, n - i);
			  int xPow = (int)Math.pow(X, i);
			  System.out.print((nFact * aPow * xPow)
                      / (niFact * iFact) + " ");
		  }
	}
	
	
	public static void main(String[] args) {
	
		//Main for Rainbow
//		Scanner sc=new Scanner(System.in);
//	       int t;//no of test cases
//	       t=sc.nextInt();
//	       for(int i=0;i<t;i++)
//	       {
//	          int n,val;
//	          n=sc.nextInt();
//	          int[] Arr=new int[n];
//	          for(int j=0;j<n;j++)
//	          {
//	              Arr[j]=sc.nextInt();
//	          }
//	           String str = Rainbow(Arr);
//	           System.out.println(str);
//	       }
	       
		//Main for Sort by frequency
//		Scanner s = new Scanner(System.in);
//		int n = s.nextInt();
//		Integer[] arr = new Integer[n];
//		for (int i = 0; i < n; i++) {
//			arr[i] = s.nextInt();
//		}
//		int cnt = sortByFreq(arr, n);
//		Arrays.sort(arr, Collections.reverseOrder());
//		printSortedArray(arr, cnt);	
	     
		//Main for Game of death
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		k--;
		List<Integer> l1=new ArrayList<>();
		int index=0;
		for(int i=1;i<=n;i++) {
			l1.add(i);
		}
		Josh(l1, k, index);
	
//		Main for Factorial
//		Series(2,2,2);
		
	       
//sc.close();
	}
}
