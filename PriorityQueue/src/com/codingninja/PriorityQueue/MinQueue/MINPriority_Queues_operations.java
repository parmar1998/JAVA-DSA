package com.codingninja.PriorityQueue.MinQueue;

import java.util.ArrayList;

public class MINPriority_Queues_operations<T> {
private ArrayList<Element<T>> heap;

public MINPriority_Queues_operations() {
	heap=new ArrayList<>();
} 

public void insert(T value,int priorty) {
	Element<T> element=new Element<>(value, priorty);
	heap.add(element);
	int childIndex=heap.size()-1;
	int parentIndex= (childIndex-1)/2;
	
	while(childIndex>0) 
	{
		if(heap.get(childIndex).priorty<heap.get(parentIndex).priorty) {
			Element<T> temp=heap.get(childIndex);
			heap.set(childIndex,heap.get(parentIndex));
		}
		else {
			return;
		}
	}

}
public T getMin() throws PriortyQueueException{
	if(isEmpty()) {
		throw new PriortyQueueException();
	}
	return heap.get(0).value;
}
public T removeMin() throws PriortyQueueException {
	if(isEmpty()) {
		throw new PriortyQueueException();
	}
	Element<T> remmoved=heap.get(0);
	T ans=remmoved.value;
	
	//swapping the last and first element 7 deleting the last element 
	heap.set(0,heap.get(heap.size()-1));
	heap.remove(heap.size()-1);
	
	int parentindex=0;
	int leftchildindex=2*parentindex+1;
	int rightchildindex=2*parentindex+2;
	int minindex=parentindex;
	while(leftchildindex<heap.size()) {
			if(heap.get(leftchildindex).priorty<heap.get(minindex).priorty) {
				minindex=leftchildindex;
			}
			if(rightchildindex<heap.size()&&heap.get(rightchildindex).priorty<heap.get(minindex).priorty) {
				minindex=rightchildindex;
			}
			if(minindex==parentindex) {
				break;
			}
			Element<T> temp=heap.get(minindex);
			heap.set(minindex, heap.get(parentindex));
			heap.set(parentindex,temp);
			parentindex=minindex;
			leftchildindex=2*parentindex+1;
			rightchildindex=2*parentindex+12;
	}
	
	return ans;
}
public int size() {
return heap.size();	
}
public boolean isEmpty() {
if(heap.size()==0) {
	return true;
}
else {
	return false;
}
}
}
