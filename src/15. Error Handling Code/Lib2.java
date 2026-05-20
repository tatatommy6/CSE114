/*
 * Lib2.java
 * Last modified by J.Finn: 6-May-2026
 * The problem with error handling round 2
 */
public class Lib2
{
	static ErrorHandler eh = null; // client object to handle errors
	
	public static void setError(ErrorHandler err)	// client supplies object
	{
		eh = err;
	}
	
	public static int c()
	{
		int x = d();
		return 0;
	}

	public static int d()
	{
		// do stuff
		if (/* if error detected */ true)
		{
			if (eh != null)
				eh.onErr("Error: Professor's head exploded");
			// I still don't know how to continue
		}
		return 0;
	}
}
