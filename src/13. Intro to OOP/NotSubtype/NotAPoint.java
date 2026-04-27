/*
 * NotAPoint.java
 * Last modified by J.Finn: 23-Apr-2026
 * Subclass of Point that is not a subtype
 */

public class NotAPoint extends Point
{
	/* construct Point with given x, y coordinates */
	public NotAPoint(double x, double y) 
	{
		super(x,y);
	}

	public final double getX() { return 6.0; }	// six seven ha ha

	public final double getY() { return 7.0; } 	// six seven ha ha


	/* Is o equal to this */
	public boolean equals (Object o)
	{
		return false;	// violates equals contract, a.equals(a) should be true
	}

	/* return String representation suitable for printing */
	public String toString()
	{
		return "Question Authority!";
	}
}
