package com.cn.stack;

import com.cn.stackarray.StackEmptyException;

public class StackUse {
	
	/* Next Greater Element to Right
	 * The Next greater Element for an element x is the first greater
	 * element on the right side of x in the array. Elements for which
	 * no greater element exist, consider the next greater element as -1. 
	 */
	public static int[] NextGreaterElementToright(int arr[]) throws StackEmptyException {
		int ans[]=new int[arr.length];
		int li=arr.length-1;
		ans[li]=-1;
		Stack<Integer> st=new Stack<>();
		st.push(arr[li]);
		for(int i=arr.length-2;i>=0;i--) {
			while(st.size()>0&&st.peek()<=arr[i]) {
				st.pop();
			}
			if(st.size()==0) {
				ans[i]=-1;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(arr[i]);
		}
		return ans;
	}
/*
for the array [2 5 9 3 1 12 6 8 7]
Next greater for 2 is -1
Next greater for 5 is -1
Next greater for 9 is -1
Next greater for 3 is 9
Next greater for 1 is 3
Next greater for 12 is -1
Next greater for 6 is 12
Next greater for 8 is 12
Next greater for 7 is 8
*/
	public static int[] NextGreaterElementToleft(int arr[]) throws StackEmptyException {
		int ans[]=new int[arr.length];
		int li=arr.length-1;
		Stack<Integer> st=new Stack<>();
		st.push(arr[li]);
		for(int i=arr.length-2;i>=0;i--){
		while(st.size()>0 && st.peek()<arr[i]){
				st.pop();
		}
		if(st.size()==0) {
				ans[i]=-1;
			}
			else {
				ans[i]=st.peek();
			}
			st.push(arr[i]);
		}
		return ans;
	}
	
	public static void main(String[] args) throws StackEmptyException {
		int arr[]= {2 ,5 ,9 ,3, 1, 12, 6, 8 ,7};
		int arr1[]=NextGreaterElementToleft(arr);
		
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
}
