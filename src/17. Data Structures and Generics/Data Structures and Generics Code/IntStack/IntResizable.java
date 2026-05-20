 /*
	IntResizable.java
	Last modified by j.finn: 17-May-2026
	Implements a resizable int array type
 */

public class IntResizable
{
	/* default initial array size, 2 for demo purposes, should be larger */
	public static final int DEFAULT = 2;
	
	/* if true program prints some tracing output */
	private static boolean debug = false;
	
	/* the current array */
	private int[] body; 
	
	/* create array of DEFAULT size */
	public IntResizable()
	{
		body = new int[DEFAULT];
	}
	
	/* create array of size given by argument initial */
	public IntResizable(int initial)
	{
		body = new int[initial];
	}
	
	/* return current array size */
	public int length()
	{
		return body.length;
	}
	
	/* 
		Return: value at given index
		This may trigger a resize.
	 */
	public int get(int index)
	{	
		if (index >= body.length)	// trigger a resize
			put(0, index);
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
		if (newlen > body.length)
			body = java.util.Arrays.copyOf(body, newlen);
		body[index] = value;
	}
	
	public static void main(String[] args) 
    {
    	IntResizable a = new IntResizable();
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
