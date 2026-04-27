/*
 * ColorPointCompose.java
 * Last modified by J.Finn: 23-Apr-2026
 * ColorPoint implementation using composition
 * instead of inheritance
 */
public class ColorPointCompose 
{
	private Color color;
	private Point p;
	
	public ColorPointCompose(double x, double y, Color colorval) 
	{
		p = new Point(x, y);
		color = colorval;
	}
	
	/* equals doesn't have problems with composition */
	public boolean equals (Object o)
	{
		if (!(o instanceof ColorPointCompose))
			return false;
		ColorPointCompose cp = (ColorPointCompose) o;
		return cp.p.equals(p) && cp.color.equals(color);
	}
	
	/*
		With composition, you don't inherit Point
		methods so you have to implement them.
		
		Composition gives you the option of not
		supporting all of the Point interface.
	 */
	public double getX() { return p.getX(); }
	public double getY() { return p.getY(); }
	public Color getColor() { return color; }
	
	public String toString()
	{
		return "(" + p.getX() + ", " + p.getY() + 
				" [" + color + "])";
	}

	// "view" method, common with composition
	public Point asPoint() { return p; }
}
