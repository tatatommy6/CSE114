 /*
	Resizable.java
	Last modified by j.finn: 17-Nov-2025
	Implements a resizable array tupe
 */

public class Resizable
{
	/* default initial array size, 2 for demo purposes, should be larger */
	public static final int DEFAULT = 2;
	
	/* if true program prints some tracing output */
	private static boolean debug = true;
	
	/* the current array */
	private int[] body; 
	
	/* create array of DEFAULT size */
	public Resizable()
	{
		body = new int[DEFAULT];
	}
	
	/* create array of size given by argument initial */
	public Resizable(int initial)
	{
		body = new int[initial];
	}
	
	/* return current array size */
	public int length()
	{
		return body.length;
	}
	
	/* Return: value at given indxe, which must be less than length() */
	public int get(int index)
	{
		return body[index];
	}
	
	/* 
		store value at given index. 
		This may trigger a resize operation.
		Resizing is done by repeatedly doubling the
		array size until it is large enough to
		accommodate the index.
	 */
	public void put(int value, int index)
	{
		int newlen = body.length;
		while (index >= newlen)
		{
			newlen *= 2;
			if (debug)
				System.out.println("Resizing from " + body.length + " to " + newlen);
		}
		body = java.util.Arrays.copyOf(body, newlen);
		body[index] = value;
	}
	
	public static void main(String[] args) 
    {
    	Resizable a = new Resizable();
    	int i;
    	for (i = 0; i < 10; i++)
    		a.put(2*i, i);
    	for (i = 0; i < 10; i++)
    		System.out.print(a.get(i) + " ");
    	System.out.println();
    	a.put(99, 50);
    	for (i = 0; i < 60; i++)
    		System.out.print(a.get(i) + " ");
    	System.out.println();
	}
}
