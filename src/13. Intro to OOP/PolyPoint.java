/*
 * PolyPoint.java
 * Last modified by J.Finn: 23-Apr-2026
 * Class to test ColorPoint and ColorPointCompose
 */
public class PolyPoint
{
	public static void printPoint(Point p)
	{
		System.out.print(p);
	}
	
	public static void main(String[] args)
	{
		Point p = new Point(3, 5);
		printPoint(p);
		System.out.println();
		
		ColorPoint cp = new ColorPoint(1, 2, Color.RED);
		printPoint(cp);
		System.out.println();
		
		ColorPointCompose cpc = new ColorPointCompose(4, 0, Color.GREEN);
		System.out.print(cpc);
		System.out.println();
		printPoint(cpc.asPoint()); // doesn't print color
		System.out.println();	
	}
}
