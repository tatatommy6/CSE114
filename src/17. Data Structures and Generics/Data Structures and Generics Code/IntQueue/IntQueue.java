/*
 * IntQueue.java
 * Last modified by J.Finn: 17-May-2026
 * interface for an int queue
 */

public interface IntQueue
{
	/* 
		Return number of elements currently
		stored in the queue. 0 means an empty
		gueue
	 */
	public int size();

	/* 
		add data to end of queue.
		Calling this function may overflow the queue
		depending on the implementation
	 */
	public void enqueue(int data);
		
	/* 
		Remove and return front item
		from queue. It is an error to call
		this function if the size() == 0.
	 */
	public int dequeue();
};
