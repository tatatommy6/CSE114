/*
	UsaRat.java
	Last modified by J.Finn: 6-May-2026
	Use Rational class
 */

public class UseRat
{
	public static void main(String args[])
	{
		
		//Rational bad = new Rational(5, 0);
		
		try
		{
			Rational corrupt = new Rational(5, 0);
		}
		catch (ZeroDenom e)
		{
			System.out.println("Error: " + e.getMessage());
		}
			
		Rational zero = new Rational();
		Rational tf = new Rational(3, 4);
		try
		{
			System.out.print("3/4 / 0 = ");
			System.out.println(tf.div(zero));
		}
		catch (DivZero dz)
		{
			System.out.println("Error: " + dz.getMessage());
		}
		
		try
		{
			System.out.print("0/0 = ");
			System.out.println(zero.div(zero));
		}
		catch (RatErr e)
		{
			System.out.println("Error: " + e.getMessage());
		}
		System.out.println("Yay, we didn't crash! Bye.");
	}
}