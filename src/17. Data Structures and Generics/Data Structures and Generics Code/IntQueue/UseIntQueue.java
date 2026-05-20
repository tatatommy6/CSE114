/*
 * UseIntStack.java
 * Last modified by J.Finn: 17-Nov-2025
 * Array implementation of stack
 */

public class UseIntQueue
{
	public static void main(String args[])
	{
		// create a Stack and save reference in s
		IntQueue s = new IntQueueLinkedList();	
		s.enqueue(10);
		s.enqueue(20);
		s.enqueue(30);
		System.out.println("enqueue 10, 20, 30, size = " + s.size());
		System.out.println("dequeue " + s.dequeue() + ", size = " + s.size());
		System.out.println("dequeue " + s.dequeue() + ", size = " + s.size());
		s.enqueue(100);
		System.out.println("enqueue 100, size = " + s.size());
		System.out.println("dequeue " + s.dequeue() + ", size = " + s.size());
		System.out.println("dequeue " + s.dequeue() + ", size = " + s.size());
	}
};
