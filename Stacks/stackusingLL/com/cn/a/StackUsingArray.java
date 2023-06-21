package com.cn.a;

import com.cn.stackarray.StackEmptyException;

public class StackUsingArray {
private int data[];
private int topIndex;

public StackUsingArray() {
	data=new int[3];
	topIndex=-1;
}

public void push(int elem) {
	if(topIndex==data.length-1) {
		doubleCapacity();
	}
	data[++topIndex]=elem;
}
private void doubleCapacity() {
	int temp[]=data;
	data=new int[2*temp.length];
}
//getting size of element
public int size() {
	return topIndex++;
}
//to remove top element
public int pop() throws StackEmptyException {
	if(data[topIndex]==-1) {
		throw new StackEmptyException();
	}
	int t=data[topIndex];
	topIndex--;
	return t;
}
public int top() throws StackEmptyException {
	if(topIndex==-1) {
		throw new StackEmptyException();
	}
	return data[topIndex];
}
	public static void main(String[] args) {
		
	}
}
