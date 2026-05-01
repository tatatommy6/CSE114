/*
 * UsePoint.java
 * Last modified by J.Finn: 14-Apr-2026
 * Use Point
 */

public class UsePoint{
	public static void main(String args[]) {
		Point p = new Point(3, 4);
		System.out.println("The point is " + p);
		System.out.println("Distance from origin: " + p.distanceFromOrigin());
		Point p2 = new Point(1, 2);
		System.out.println("Distance from (1,2): " + p.distanceFrom(p2));
	}
}
