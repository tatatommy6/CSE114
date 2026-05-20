/*
 * IntLinkedList.java
 * Last modified by J.Finn: 17-May-2026
 * Linked list implementation of IntList
 */

public class IntLinkedList implements IntList
{
	/*** Section 1: Public interface ***/

	/* Construct new, empty stack */
	public IntLinkedList()
	{
		front = null;
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
		
	public int get(int i)
	{
		IntNode mover = front;
		while (i > 0)
		{
			mover = mover.next;
			i--;
		}
		return mover.value;	
	}
		
	public int set(int i, int value)
	{
		IntNode mover = front;
		while (i > 0)
		{
			mover = mover.next;
			i--;
		}
		int old = mover.value;
		mover.value = value;
		return old;	
	}
	
	public void add(int i, int value)
	{
		if (i == 0)
			front = new IntNode(value, front);
		else
		{
			IntNode mover = front;
			IntNode previous = null;
			while (i > 0)
			{
				previous = mover;
				mover = mover.next;
				i--;
			}
			previous.next = new IntNode(value, mover);
		}
		size++;
	}
	
	public void add(int value)
	{
		add(size, value);
	}
	
	public int remove(int i)
	{
		int result = 0;
		if (i == 0)
		{
			result = front.value;
			front = front.next;
		}
		else
		{
			IntNode mover = front;
			IntNode previous = null;
			while (i > 0)
			{
				previous = mover;
				mover = mover.next;
				i--;
			}
			result = mover.value;
			previous.next = mover.next;
		}
		size--;
		return result;
	}
	
	public String toString()
	{
		int i;
		IntNode mover;
		if (size() == 0)
			return "()";
		else
		{
			StringBuilder result = new StringBuilder("(");
			for (mover = front; mover.next != null; mover = mover.next)
				result.append(mover.value + " ");
			result.append(mover.value + ")");
			return result.toString();
		}
	}
		
	/*** Section 2: Private implementation ***/

	/* queue contents */
	private IntNode front; 	// front of queue
	private int size;
};
