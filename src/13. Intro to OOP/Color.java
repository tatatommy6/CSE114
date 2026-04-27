/*
 * Color.java
 * Last modified by J.Finn: 23-Apr-2026
 * simple Color class used in ColorPoint
 * Not real colors, just uses text names for colors
 */
public class Color 
{
	// A color just has a name, no real color info saved.
	private String name;
	
	// A few static constant colors for examples
	public final static Color RED = new Color("red");
	public final static Color BLUE = new Color("blue");
	public final static Color GREEN = new Color("green");
	
	private Color(String c) 
	{
		name = c;
	}
	
	public String toString()
	{
		return name;
	}
}
