package com.cn.linkedlist;

/*ABOUT LINKEDLIST
 *  A linked list consists of a data element known as a node. 
 *  And each node consists of two fields: one field has data, and in the second field, 
 *  the node has an address that keeps a reference to the next node. 
 * Linked List in best for storing Dynamic Data Structure
 * Dynamic Data Structure is that kind of data structure that changes its size during runtime.
 * Types of Dynamic data Structure
 * Stacks/Queues/Tree
 */
public class Node<T> 
{
	T data;
	
	Node<T> next;

	Node(T data){
	this.data=data;	
	}
}
