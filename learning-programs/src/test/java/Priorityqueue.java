

import java.util.PriorityQueue;

public class Priorityqueue {

	public static void main(String[] args) {
		
		PriorityQueue q=new PriorityQueue();
		
		q.add('A');
		q.add('B');
		q.add('C');
		q.offer('D');
		System.out.println(q);//[A, B, C, D]
		//insertion order is preserved and duplicates are also allowed
		//get head element element() peek()
		System.out.println(q.element());//if empty it return exception
		System.out.println(q.peek());//if empty it return null
		//return &remove element from queue remove() poll()
		System.out.println(q.remove());//starting head element will be removed
		System.out.println(q);//[B,D,C] THROWS EXCEPTION
		System.out.println(q.poll());
		System.out.println(q);//[B,D,C] NULL IF NO ELEMENT
	

	}

}
