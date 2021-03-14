package day16;

import java.util.Deque;
import java.util.LinkedList;

public class Question08 {

	public static void main(String[] args) {
		
		Deque<Integer> dq = new LinkedList<Integer>();
		dq.add(100);
		dq.add(200);
		dq.add(250);
		dq.add(95);
		System.out.println(dq);
		
		System.out.println(dq.pollFirst());
		System.out.println(dq);

	}

}
