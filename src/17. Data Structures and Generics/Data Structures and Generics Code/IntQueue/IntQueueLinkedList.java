/*
 * IntQueueLinkedList.java
 * Last modified by J.Finn: 17-May-2026
 * Linked list implementation of queue
 */

public class IntQueueLinkedList implements IntQueue
{
	/*** Section 1: Public interface ***/

	/* Construct new, empty stack */
	public IntQueueLinkedList()
	{
		front = null;
		end = null;
		size = 0;
	}

	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size()
	{
		return size;
	}
		
	/* 
		Push data onto stack
	 */
	public void enqueue(int data)
	{
		IntNode newEnd = new IntNode(data, end);
		if (size == 0)
		{
			front = newEnd;
			end = newEnd;
		}
		else
		{
			end.next = newEnd;
			end = newEnd;
		}
		size++;
	}
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public int dequeue()
	{
		if (size > 0)
		{
			int val = front.value;
			front = front.next;
			if (front == null)
				end = null;
			size--;
			return val;
		}
		else return 0;
	}
	
	
	/*** Section 2: Private implementation ***/

	/* queue contents */
	private IntNode front; 	// front of queue
	private IntNode end;	// back of queue
	/* queue size */
	private int size;
};
