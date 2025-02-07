package Wipro.com.PAckage;

import java.util.PriorityQueue;
import java.util.Queue;


public class Test4 {
	public static void main(String [] args) {
		
		// create a priority queue
		
		Queue<Integer> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(30);
		priorityQueue.add(10);
		priorityQueue.add(20);
		System.out.println(priorityQueue);
		System.out.println(priorityQueue.poll());
		System.out.println(priorityQueue);
		
		
		System.out.println(priorityQueue.peek());
		System.out.println(priorityQueue);
		
	}

}
