/*
 * ObjectStack.java
 * Last modified by J.Finn: 17-May-2026
 * interface for an Object stack
 * generics are a better solution to having a
 * stack that can work with any data type
 */

public interface ObjectStack
{
	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size();

	/* 
		Push data onto stack
		Calling this function may overflow the stack
	 */
	public void push(Object data);
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public Object pop();
};
