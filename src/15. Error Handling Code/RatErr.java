/*
	RatErr.java
	Last modified by J.Finn: 6-May-2026
	
	Base class for rational number errors
 */

public class RatErr extends RuntimeException
{
	public RatErr(String msg)
	{
		super(msg);
	}
}