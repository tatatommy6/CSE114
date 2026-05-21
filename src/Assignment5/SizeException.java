// Minkyeol Kim
/*
	SizeException.java
	CSE 114 Assignment 5

    This code is an exception class for errors related to the size of the canvas.
	It extends ArtException and has a constructor that takes a message
	and passes it to the superclass constructor of ArtException.
*/

public class SizeException extends ArtException
{
	public SizeException(String message)
	{
		super(message);
	}
}