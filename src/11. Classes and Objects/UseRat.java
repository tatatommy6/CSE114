/*
	UsaRat.java
	Last modified by J.Finn: 14-Apr-2026
	Use Rational class
 */

public class UseRat
{
	public static void main(String args[])
	{
		Rational zero = new Rational();		// 0
		Rational five = new Rational(5);		// 5/1
		Rational sixeight = new Rational(6, 8);	// 3/4
		Rational threefour = new Rational(sixeight);		// 3/4
		Rational half = new Rational(1, 2);
		Rational tf = new Rational(3, 4);
		System.out.println("zero = " + zero + ", five = " + five + ", 6/8 = " + sixeight + ", 3/4 = " + threefour);
	    System.out.println("1/2 * 1/2 = " + half.mult(half));
		System.out.println("1/2 - 3/4 = " + half.sub(tf));
		System.out.println("1/2 + 1/2 = " + half.add(half));
	}
}