/*
	Rational.java
	Last modified by J.Finn: 6-May-2026
	
	Class representing rational numbers.
	Objects are immutable.
	Rationals are represented in this normal form:
	  The denominator is never negative.
	  The fraction is always reduced to lowest terms.
 */

public class Rational
{
	/* Section 0: Private data and functions */

	// numerator, denominator of rational
	private final long num, denom; 
	
	// return greatest common divisor of nonnegative x and y
	private static long gcd(long x, long y)
	{
		long rem;
	
		while (y != 0)
		{
			rem = x % y;
			x = y;
			y = rem;
		}
		return x;
	}
		
	/* Section 1: Constructors */
	
	/* Initialize to 0/1 */
	public Rational()
	{
		num = 0;
		denom = 1;
	}
	
	/* Initialize to n/1 */
	public Rational(long n)
	{
		num = n;
		denom = 1;
	}
	
	/* Initialize to n/d. d must be non-zero */
	public Rational(long n, long d)
	{
		if (d == 0)
			throw new ZeroDenom();
		long factor = gcd(n, d);
		if (factor < 0) factor = -factor;
		if (d < 0)
		{
			n = -n;
			d = -d;
		}
		num = n / factor;
		denom = d / factor;
	}
	
	/* Copy constructor: initialize to same value as r */
	public Rational(Rational r)
	{
	   num = r.num;
	   denom = r.denom;
	}
	
	
	/* Section 2: Rational operations */
	
	/* returns this + x */
	public Rational add(Rational x)
	{
		long n = (num * x.denom) + (x.num * denom);
		long d = denom * x.denom;
		return new Rational(n, d);
	}
	
	/* returns this - x */
	public Rational sub(Rational x)
	{
		long n = (num * x.denom) - (x.num * denom);
		long d = denom * x.denom;
		return new Rational(n, d);
	}
	
	/* returns this * x */
	public Rational mult(Rational x)
	{
		return new Rational(num * x.num, denom * x.denom);
	}
	
	/* returns this / x */
	public Rational div(Rational x)
	{
		if (x.num == 0)
			throw new DivZero();
		return new Rational(num * x.denom, denom * x.num);
	}
	
	/* returns -this */
	public Rational negate()
	{
		return new Rational(-num, denom);
	}
	
	/* return numerator */
	public long numerator()
	{
		return num;
	}
	
	/* return denominator */
	public long denominator()
	{
		return denom;
	}
	
	
	/* Section 3: Object operations */
	
	public boolean equals(Object o)
	{
		if (!(o instanceof Rational))
			return false;
		Rational r = (Rational) o;
		return num == r.num && denom == r.denom;
	}
	
	public String toString()
	{
		if (denom == 1) return num + "";
		else return num + "/" + denom;
	}
}