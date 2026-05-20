/*
 * GenStackResizable.java
 * Last modified by J.Finn: 17-May-2026
 * Risizable Array implementation of stack
 */

public class GenStackResizable<T> implements GenStack<T>
{
	/*** Section 1: Public interface ***/
	
	/* Construct new, empty stack */
	public GenStackResizable()
	{
		body = new GenResizable<T>();
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
		top++;
		body.put(data, top);
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
			return (T) body.get(top+1);
		}
		else return null;
	}
	
	
	/*** Section 2: Private implementation ***/

	/* stack contents */
	private GenResizable<T> body; // stack contents
	/* index of last item pushed, -1 means empty stack */
	private int top;
};
