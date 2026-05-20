/*
 * GenNode.java
 * Last modified by J.Finn: 17-May-2026
 * cell in a generic linked list
 */

public class GenNode<T>
{
	public T value;
	public GenNode<T> next;
	
	// initialize node withe value and null next field
	public GenNode(T value)
	{
		this.value = value;
		next = null;
	}
	
	// initialize node with given value and next fields
	public GenNode(T value, GenNode<T> next)
	{
		this.value = value;
		this.next = next;
	}
};
