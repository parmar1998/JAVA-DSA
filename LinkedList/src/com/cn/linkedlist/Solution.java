package com.cn.linkedlist;

import java.util.Scanner;

public class Solution {

	//Taking input for a linked list
	public static Node<Integer> takeInput(){
		Scanner sc=new Scanner(System.in);
		int data=sc.nextInt();
		Node<Integer> head=null;
		while(data!=-1) 
		{
			Node<Integer> currentNode=new Node<Integer>(data);
			if(head==null)
			{
				head=currentNode;
			}
			else
			{
				Node<Integer> tail=head;
				while(tail.next!=null) {
					tail=tail.next;
				}
				tail.next=currentNode;
			}
				data=sc.nextInt();
		}
		return head;
	}
	//Multiplication of 2 linked list
	
	//Printing linked list
	public static void print(Node<Integer> head) {
		while(head!=null) {
			System.out.print(head.data+" ");
			head=head.next;
		}
		System.out.println();
	}
	
	//printing i th node
	public static void printithNode(Node<Integer> head,int i) {
		Node<Integer> temp=head;
		int count=0;
		while(temp!=null) {
			count++;
			temp=temp.next;
			if(count==i) {
				System.out.print(temp.data);
			}
		}
	}
	
	//Multiplying 2 linked list
	public static long multiply2linkedlist(Node<Integer> node1,Node<Integer> node2) {	
		long num1=0;
		long num2=0;
		while(node1!=null||node2!=null) {
			if(node1!=null) {
				num1=((num1)*10)+node1.data;
				node1=node1.next;
			}
			if(node2!=null) {
				num2= ((num2)*10)+node2.data;
				node2=node2.next;
			}
		}
		return num1*num2;
	}
	
	//printing reverse in linked list
	public static Node<Integer> printReverse(Node<Integer> head){
		Node<Integer> curr=head;
		Node<Integer> prev=null;
		while(curr!=null) {
			Node<Integer> forward=curr.next;
			curr.next=prev;
			prev=curr;
			curr=forward;
		}
		return prev;
	}
	
	//Checking for palindrome
	public static boolean isPalindrome(Node<Integer> head) {
		Node<Integer> curr=head;
		boolean flag=true;
		if(curr==null) 
			return flag;
		
		//store the mid position of the list
		int mid=mid(head);
		int x=findNode(curr,mid);
		for(int i=1;i<x;i++) {
			curr=curr.next;
		}
		Node<Integer> reverselist=printReverse(head);
		while(curr!=null&&reverselist!=null) {
			if(curr.data!=reverselist.data) {
				flag=false;
				break;
			}
			head=head.next;
			reverselist=reverselist.next;
		}
		return flag;
	}
	private static int findNode(Node<Integer> head, int mid) {
		int c=0;
		int index=-1;
		while(head!=null) {
			if(head.data==mid) {
				index=c;
				break;
			}
			head=head.next;
			c++;
		}
		return index;
	}
	private static int mid(Node<Integer> head) {
		Node<Integer> slowpointer=head;
		Node<Integer> fastpointer=head;
		while(slowpointer.next!=null&&fastpointer.next.next!=null) {
			slowpointer=slowpointer.next;
			fastpointer=slowpointer.next.next;
		}
		return slowpointer.data;
	}

	//Inserting into Linked list
	public static Node<Integer> insert(Node<Integer> head,int pos,int data)
	{		
		Node<Integer> nodetoBeInserted=new Node<Integer>(data);
		if(pos==0) {
			nodetoBeInserted.next=head;
			return nodetoBeInserted;	
		}
		else 
		{
			int c=0;
			Node<Integer> prev=head;
			while(c<pos-1) 
			{
				c++;
				prev=prev.next;
			}
			if(prev!=null)
				nodetoBeInserted.next=prev.next;
				prev.next=nodetoBeInserted;
				return prev;
		}
	}
	
	//inserting into linked list using recursion
	public static int countNodes(Node<Integer> temp) {
		int c=0;
		while(temp!=null) {
		     temp=temp.next;
		     c++;
		}
		return c;
	}
	public static Node<Integer> insertR(Node<Integer> head,int elem,int pos){
	int m=countNodes(head);
	if(pos==0) {
		Node<Integer> newNode=new Node<Integer>(elem);
		newNode.next=head;
		return newNode;
	}
	else
	head.next=insertR(head.next, elem, pos-1);
	return head;
	}

	public static void main(String[] args) {	
		Node<Integer> n1=new Node<Integer>(1);
		Node<Integer> n2=new Node<Integer>(2);
		Node<Integer> n3=new Node<Integer>(3);
		Node<Integer> n4=new Node<Integer>(2);
		Node<Integer> n5=new Node<Integer>(1);
		n1.next=n2;
		n2.next=n3;
		n3.next=n4;
		n4.next=n5;
		System.out.println(isPalindrome(n1));
		
		
		
	}
}
