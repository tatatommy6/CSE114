// Minkyeol Kim
/*
	ArtException.java
	CSE 114 Assignment 5

    This code is the parent class of all exceptions related to art.
    It extends the built in Exception class, and has a constructor that takes a message
    and passes it to the super constructor of Exception.
*/

public class ArtException extends Exception
{
	public ArtException(String message)
	{
		super(message);
	}
}