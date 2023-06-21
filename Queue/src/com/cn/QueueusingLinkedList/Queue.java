package com.cn.QueueusingLinkedList;

//Implementation of Queue
public class Queue {

	private Node rear;
	private Node front;
	private int count;
	
	public Queue() {
		rear=front=null;
		count=0;
	}
	
	//returning the Size
	public int getSize() {
		return count;
	}
	
	//isEmpty Function
	public boolean isEmpty() {
		return count==0;
	}
	
	//adds an element at last of queue
	public void enQueue(int data) {
		Node temp=new Node(data);
		if(front==null) {
			front=temp;
			rear=temp;
		}
		else {
			rear.next=temp;
			rear=temp;
		}
		count++;
	}
	
	//removes the element from start of Queue
	public int deQueue() {
		if(front ==null) {
			return -1;
		}
		Node temp=front;
		front =front.next;
		if(front==null) {
			rear=null;
		}
		count=count-1;
		return temp.data;
	}
	
	//displays an element from top
	public int front() {
		if(front==null) {
			return -1;
		}
		return front.data;
	}
	
}
