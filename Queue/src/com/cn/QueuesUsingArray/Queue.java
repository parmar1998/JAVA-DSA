package com.cn.QueuesUsingArray;

public class Queue {
	
	private int data[];
	private int front;
	private int rear;
	private int size;
	
	public Queue() {
		data =new int[5];
		front=-1;
		rear=-1;
	}
	
	public Queue(int capacity) {
		data =new int[capacity];
		front=-1;
		rear=-1;
	}
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void enQueue(int element) {
		if(size==data.length) {
			doubleCapacity();
		}
		if(size==0) {
			front=0;
		}
		rear=(rear+1)%data.length;
		data[rear]=element;
		size++;
	}

	private void doubleCapacity() {
		int temp[]=data;
		data=new int[2*size];
		int index=0;
		for(int i=front;i<temp.length;i++) {
			data[index++]=temp[i];
		}
		for(int i=0;i<front-1;i++) {
			data[index++]=temp[i];
		}
		front=0;
		rear=temp.length-1;
	}
	
	public int front() throws QueueEmptyException{
		if(size==0) {
			throw new QueueEmptyException();
		}
		return data[front];
	}
	
	public int deQueue() throws QueueEmptyException {
		if(size==0) {
			throw new QueueEmptyException();
		}
		int temp=data[front];
		front=(front=1)%data.length;
		size--;
		if(size==0) {
			front=-1;
			rear=-1;
		}
		return temp;
	}
}
