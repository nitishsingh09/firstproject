package arrayList;

import java.util.LinkedList;
import java.util.Queue;

public class LearnLinkedListQueue {
	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		
		
		queue.offer(10);
		queue.offer(11);
		queue.offer(12);
		queue.offer(13);
		queue.offer(14);
		queue.offer(15);
		System.out.println(queue);
		
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println(queue.peek());
		
	}
}
