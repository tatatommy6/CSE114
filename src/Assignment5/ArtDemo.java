/*
	ArtDemo.java
	Last modified by J.Finn: 9-May-2026
	Demo art works
*/

import java.util.Scanner;

public class ArtDemo
{
	/*
	 * Simple art demo program.
	 */
	public static void main(String args[])
	{
		final int DEFAULT = 10;	// default rows, cols
		Scanner s = new Scanner(System.in);
		AsciiArt art = new TriangleArt(DEFAULT, DEFAULT, '*');
		art.describe();
		System.out.println("Drawing on " + DEFAULT + "X" + DEFAULT + " canvas ");
		art.draw();
		System.out.print("How many rows would you like? ");
		int rows = s.nextInt();
		art.setRows(rows);
		System.out.print("How many columns would you like? ");
		int cols = s.nextInt();
		art.setCols(cols);
		art.draw();
		
		art = new Alternator(DEFAULT, DEFAULT, '@', '+');
		System.out.println("\nDrawing on " + DEFAULT + "X" + DEFAULT + " canvas ");
		art.draw();
		System.out.print("How many rows would you like? ");
		rows = s.nextInt();
		art.setRows(rows);
		System.out.print("How many columns would you like? ");
		cols = s.nextInt();
		art.setCols(cols);
		art.draw();
		s.close();
	}
};
