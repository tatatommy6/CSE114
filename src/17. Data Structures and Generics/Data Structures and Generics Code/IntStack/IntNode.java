/*
 * IntNode.java
 * Last modified by J.Finn: 17-May-2026
 * cell in an int linked list
 */

public class IntNode
{
	public int value;		// node value
	public IntNode next;	// next node on list
	
	// initialize node withe value and null next field
	public IntNode(int value)
	{
		this.value = value;
		next = null;
	}
	
	// initialize node with given value and next fields
	public IntNode(int value, IntNode next)
	{
		this.value = value;
		this.next = next;
	}
};
