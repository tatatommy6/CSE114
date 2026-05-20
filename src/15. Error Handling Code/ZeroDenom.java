/*
	ZeroDenom.java
	Last modified by J.Finn: 6-May-2026
	
	Rational number error: attempt to construct
		rational with 0 denominator
 */

public class ZeroDenom extends RatErr
{
	public ZeroDenom()
	{
		super("Can't construct Rational with denominator 0");
	}
}