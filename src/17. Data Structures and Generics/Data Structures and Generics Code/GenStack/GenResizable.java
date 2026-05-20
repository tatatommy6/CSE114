 /*
	GenResizable.java
	Last modified by j.finn: 17-May-2026
	Implements a resizable array type
 */

@SuppressWarnings("unchecked")

public class GenResizable<T>
{
	/* default initial array size, 2 for demo purposes, should be larger */
	public static final int DEFAULT = 1000;
	
	/* if true program prints some tracing output */
	private static boolean debug = false;
	
	/* the current array */
	private T body[]; 
	
	/* create array of DEFAULT size */
	public GenResizable()
	{
		body = (T[]) new Object[DEFAULT];
	}
	
	/* create array of size given by argument initial */
	public GenResizable(int initial)
	{
		body = (T[]) new Object[initial];
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
	public T get(int index)
	{	
		if (index >= body.length)	// trigger a resize
			put(null, index);
		return body[index];
	}

	/* 
		store value at given index. 
		This may trigger a resize operation.
		Resizing is done by repeatedly doubling the
		array size until it is large enough to
		accommodate the index.
	 */
	public void put(T value, int index)
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
    	GenResizable<Integer> a = new GenResizable<Integer>();
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
