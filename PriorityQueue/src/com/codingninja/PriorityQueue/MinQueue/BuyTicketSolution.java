package com.codingninja.PriorityQueue.MinQueue;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * A queue is maintained for buying the tickets and every person is attached with a priority (an integer, 1 being the lowest priority).
The tickets are sold in the following manner -
1. The first person (pi) in the queue requests for the ticket.
2. If there is another person present in the queue who has higher priority than pi, then ask pi to move at end of the queue without giving him the ticket.
3. Otherwise, give him the ticket (and don't make him stand in queue again).
Giving a ticket to a person takes exactly 1 minute and it takes no time for removing and adding a person to the queue.
 */
class Pair{
	int value; //stores the value of the element
	int index; //stores the index of the element
}

public class BuyTicketSolution {

	public static int buyTicket(int input[],int k) {
		Queue<Integer> queue = new LinkedList<>();
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
		for (int i = 0; i < input.length; i++) {
			queue.add(i);
			pq.add(input[i]);
		}
		int time = 0;
		while (!queue.isEmpty()) {
			if (input[queue.peek()] < pq.peek()) {
				queue.add(queue.poll());
			} else {
				int idx = queue.poll();
				pq.remove();
				time++;
				if (idx == k) {
					break;
				}
			}
		}
		return time;

	}
	
	public static void main(String[] args) 
	{
	int arr[]= {2 ,3, 2, 2 ,4};
	int k=2;
	int x=buyTicket(arr, k);
	System.out.println(x);
	}

}
