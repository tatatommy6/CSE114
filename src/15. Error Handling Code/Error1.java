/*
 * Error1.java
 * Last modified by J.Finn: 6-May-2026
 * The problem with error handling round 1
 */
 

public class Error1
{

	public static int a()
	{
		int i = b(); // if an error occurs I know what to do
		if (/* something went wrong */ true)
		{
			// handle it
		}
		return 0;
	}

	public static int b()
	{
		Lib1.c(); // c is in a library somewhere
		return 0;
	}

	public static void main(String[] args)
	{
		int i = a();
    }
}
