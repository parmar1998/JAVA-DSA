package com.cn.UP;

//Implementation of Browsing history 
class Node{
	String Url;
	Node next;
	Node prev;
	
	public Node(String Url) {
		this.Url=Url;
		next=null;
		prev=null;
	}
}
public class BrowserHistory {

	Node head,curr;
	
	public BrowserHistory(String HomePage) {
		head=new Node(HomePage);
		curr=head;
	}
	
	public void visit(String Url) {
		Node node=new Node(Url);
		curr.next=node;
		node.prev=curr;
		curr=node;
	}
	public String back(int steps) {
		while(curr.prev!=null&&steps-->0) {
			curr=curr.prev;
			}
		return curr.Url;
	}
	public String Forward(int steps) 
	{
		while(curr.next!=null&&steps-->0)
		{
		curr=curr.next;	
		}
		return curr.Url;
	}
}
