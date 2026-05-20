/*
 * IntStackResizable.java
 * Last modified by J.Finn: 17-May-2026
 * Risizable Array implementation of stack
 */

public class IntStackResizable implements IntStack
{
	/*** Section 1: Public interface ***/
	
	/* Construct new, empty stack */
	public IntStackResizable()
	{
		body = new IntResizable();
		top = -1;
	}

	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size()
	{
		return top + 1;
	}
		
	/* 
		Push data onto stack
	 */
	public void push(int data)
	{
		top++;
		body.put(data, top);
	}
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public int pop()
	{
		if (top >= 0)
		{
			top--;
			return body.get(top+1);
		}
		else return 0;
	}
	
	
	/*** Section 2: Private implementation ***/

	/* stack contents */
	private IntResizable body; // stack contents
	/* index of last item pushed, -1 means empty stack */
	private int top;
};
