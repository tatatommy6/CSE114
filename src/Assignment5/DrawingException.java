// Minkyeol Kim
/*
	DrawingException.java
	CSE 114 Assignment 5
    
	This code is an exception class for errors related to drawing the art.
	It extends ArtException and has a constructor that takes a message
	and passes it to the superclass constructor of ArtException.
*/

public class DrawingException extends ArtException
{
	public DrawingException(String message)
	{
		super(message);
	}
}