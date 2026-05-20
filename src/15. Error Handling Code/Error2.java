/*
 * Error2.java
 * Last modified by J.Finn: 6-May-2026
 * The problem with error handling round 2
 */
 
public class Error2
{
	public static int a()
	{
		ErrorHandler eh = new ErrorHandler();
		Lib2.setError(eh);	// register error handler with libary

		int i = b(); // if an error occurs I know what to do
		if (/* something went wrong */ true)
		{
			// handle it
		}
		return 0;
	}

	public static int b()
	{
		Lib2.c(); // c is in a library somewhere
		return 0;
	}

	public static void main(String[] args)
	{	
		int i = a();
    }
}
