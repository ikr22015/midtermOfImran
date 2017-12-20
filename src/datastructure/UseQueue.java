package datastructure;

import java.util.Iterator;
import java.util.PriorityQueue;

public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */

		//Demonstrate Queue
		PriorityQueue<String> queue = new PriorityQueue<>();
		//Add elements
		queue.add("Aam");
		queue.add("Jaam");
		queue.add("Katal");
		queue.add("Lichu");
		queue.add("Peyara");

		//Retrieving all elements usung while loop
		Iterator itr = queue.iterator();
		while (itr.hasNext()){
			System.out.println(itr.next());
		}

		//Peek head queue element
		String headQueue = queue.peek();
		System.out.println("Head of the queue is: "+headQueue);

		//Remove queue by an object
		queue.remove("Peyara");
		//Remove head of queue
		queue.remove();
		//Poll head of queue
		queue.poll();
		System.out.println("After removing three elements:");

		//Retrieve all elements using for each loop
		for (String it: queue){
			System.out.println(it);
		}
	}
}
