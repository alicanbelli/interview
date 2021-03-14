package day16;

import java.util.PriorityQueue;

public class Question06 {

	public static void main(String[] args) {
		
		PriorityQueue<String> pq = new PriorityQueue<>();
		pq.add("red");
		pq.add("green");
		pq.add("orange");
		pq.add("white");
		
		System.out.println(pq);

		pq.add("blue");
		System.out.println(pq);
	}

}
