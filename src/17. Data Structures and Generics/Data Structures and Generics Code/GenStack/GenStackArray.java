/*
 * GenStackArray.java
 * Last modified by J.Finn: 17-May-2026
 * Array implementation of stack
 */

@SuppressWarnings("unchecked")

public class GenStackArray<T> implements GenStack<T>
{
	/*** Section 1: Public interface ***/

	/* stack size */
	public static final int MAXSTACK = 1000;
	
	/* Construct new, empty stack */
	public GenStackArray()
	{
		body = (T[]) new Object[MAXSTACK];
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
	public void push(T data)
	{
		if (top + 1 < body.length)
		{
			top++;
			body[top] = data;
		}
	}
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public T pop()
	{
		if (top >= 0)
		{
			top--;
			return body[top+1];
		}
		else return null;
	}
	
	
	/*** Section 2: Private implementation ***/

	/* stack contents */
	private T body[]; // stack contents
	/* index of last item pushed, -1 means empty stack */
	private int top;
};
