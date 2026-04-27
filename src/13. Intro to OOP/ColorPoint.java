/*
 * ColorPoint.java
 * Last modified by J.Finn: 23-Apr-2026
 * ColorPoint example of subclass and subtype
 */
public class ColorPoint extends Point 
{
	private final Color color;	// Point's color
	
	/*
	 * construct ColorPoint with given coordinates and Color.
	 */
	public ColorPoint (double x, double y, Color colorval) 
	{
		super(x, y);		// calls Point(x, y) to construct base part
		color = colorval;
	}
	
	/* Return color of Point */
	public Color getColor() { return color; }
	
	/* equals has some problems with subclasses, but here we go */
	public boolean equals(Object o)
	{
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return super.equals(o) && cp.color.equals(color);
	}
	
	public String toString()
	{
		return "(" + getX() + ", " + getY() + " [" + color + "])";
	}
}
