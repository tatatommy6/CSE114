/*
 * Point.java
 * Last modified by J.Finn: 23-Apr-2026
 * Point in x,y plane
 * Example of Simple Class
 */

public class Point
{
	private final double x;		// point's x coordinate
	private final double y;		// point's y coordinate

	/* construct Point with given x, y coordinates */
	public Point(double x, double y) 
	{
		this.x = x;
		this.y = y;
	}

	/* return x coordinate of Point */
	public double getX() { return x; }  // was final in original version

	/* return y coordinate of Point */
	public double getY() { return y; }  // was final in original version

	public final double distanceFromOrigin()
	{
		return Math.sqrt(this.x*this.x + this.y*this.y);
	}
	
	public final double distanceFrom(Point p)
	{
		double xdelta = p.x-this.x;
		double ydelta = p.y-this.y;
		return Math.sqrt(xdelta*xdelta + ydelta*ydelta);
	}

	/*
		Every java class has equals and toString methods.
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
