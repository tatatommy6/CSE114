/*
 * GenStackJavaArrayList.java
 * Last modified by J.Finn: 17-May-2026
 * java.util.ArrayList implementation of stack
 */

import java.util.ArrayList;

//@SuppressWarnings("unchecked")

public class GenStackJavaArrayList<T> implements GenStack<T>
{
	/*** Section 1: Public interface ***/

	/* Construct new, empty stack */
	public GenStackJavaArrayList()
	{
		body = new ArrayList<T>();
	}

	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size()
	{
		return body.size();
	}
		
	/* 
		Push data onto stack
	 */
	public void push(T data)
	{
		body.add(0, data);
	}
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public T pop()
	{
		if (body.size() > 0)
		{
			return body.remove(0);
		}
		else return null;
	}

	/*** Section 2: Private implementation ***/

	private ArrayList<T> body; // stack contents	
};
