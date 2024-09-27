package com.queueIntefaceDemo;

import java.util.PriorityQueue;
public class PriorityQueueDemo {
	
	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		q.add(1);
		q.add(2);
		q.add(4);
		q.add(5);
		System.out.println(q);
		q.offer(6);
		System.out.println(q);
		//remove
		q.remove();
		System.out.println("After the remove:-"+q);
		
		//poll
		q.poll();
		System.out.println("Using the poll:-"+q);
		
		
		//Element
		
		//q.element();
		
		System.out.println("Element method use:-"+q.element());
		
		//peek
		
		System.out.println("Peek method use:-"+q.peek());
		
	}

}
