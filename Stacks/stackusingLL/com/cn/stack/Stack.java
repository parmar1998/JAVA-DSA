package com.cn.stack;

import com.cn.stackarray.StackEmptyException;

/*
 * a deck of cards or a pile of plates
 * Last in - First out (LIFO)
 */
public class Stack<T> {

	private Node<T> head;
	int size;
	
	
	public int size() {
		return size;
	}
	
	public boolean isEmpty() {
		return size==0;
	}
	
	public void push(T element) {
		Node<T> newNode=new Node<T>(element);
		newNode.next=head;
		size++;
	}
	
	//Getting the top of the stack
	public T peek() throws StackEmptyException{
		if(head==null){
			throw new StackEmptyException();
		}
		return head.data;
	}
	
	//delete the stack element
	public T pop() throws StackEmptyException {
		if(head==null){
			throw new StackEmptyException();
		}
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	}
}
