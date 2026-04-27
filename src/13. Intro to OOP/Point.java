/*
 * Point.java
 * Last modified by J.Finn: 14-Apr-2026
 * Point in x,y plane
 * Example of Simple Class
 */

public class Point
{
	private final double x;		// point's x coordinate
	private final double y;		// point's y coordinate

	/* construct Point with given x, y coordinates */
	public Point(double xval, double yval) 
	{
		x = xval;
		y = yval;
	}

	/* return x coordinate of Point */
	public final double getX() { return x; }

	/* return y coordinate of Point */
	public final double getY() { return y; }

	public final double distanceFromOrigin()
	{
		return Math.sqrt(x*x + y*y);
	}
	
	public final double distanceFrom(Point p)
	{
		double xdelta = p.x-x;
		double ydelta = p.y-y;
		return Math.sqrt(xdelta*xdelta + ydelta*ydelta);
	}

	/*
		Usually a java class has equals and toString methods.
		The default behavior is not useful.
		If you want to be able to compare instances for equality,
		define equals using the format here.
		If you want your instances to be able to print, define toString.
	 */

	/* Is o equal to this */
	public boolean equals (Object o)
	{
		if (!(o instanceof Point)) // check that o is a Point!
			return false;
		Point p = (Point) o;	// this works if o is a Point.
		return p.x == x && p.y == y;
	}

	/* return String representation suitable for printing */
	public String toString()
	{
		return "(" + x + ", " + y + ")";
	}
}
