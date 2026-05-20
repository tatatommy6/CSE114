/*
 * IntStackLinkedList.java
 * Last modified by J.Finn: 17-May-2026
 * Linked list implementation of stack
 */

public class IntStackLinkedList implements IntStack
{
	/*** Section 1: Public interface ***/

	/* Construct new, empty stack */
	public IntStackLinkedList()
	{
		body = null;
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
	public void push(int data)
	{
		IntNode newTop = new IntNode(data, body);
		body = newTop;
		size++;
	}
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public int pop()
	{
		if (size > 0)
		{
			int top = body.value;
			body = body.next;
			size--;
			return top;
		}
		else return 0;
	}
	
	
	/*** Section 2: Private implementation ***/

	/* stack contents */
	private IntNode body; // stack contents
	/* stack size */
	private int size;
};
