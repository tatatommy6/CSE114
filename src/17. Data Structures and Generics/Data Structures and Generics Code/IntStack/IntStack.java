/*
 * IntStack.java
 * Last modified by J.Finn: 17-May-2026
 * interface for an int stack
 */

public interface IntStack
{
	/* 
		Return number of elements currently
		stored on the stack. 0 means an empty
		stack
	 */
	public int size();

	/* 
		Push data onto stack
		Calling this function may overflow the stack,
		depending on the implementation.
	 */
	public void push(int data);
		
	/* 
		Remove and return top item
		from stack. It is an error to call
		this function if the size() == 0.
	 */
	public int pop();
};
