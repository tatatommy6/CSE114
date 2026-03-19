/* 
	Cond1.java
	Last modified by j.finn: 17-Mar-2026
	
	Logical operators take boolean operands and have a boolean value
		&&   (logical and: true if both operands are true)
		||   (logical or: true if one or both operands are true)
		!	 (logical not: true if single operand is false)
 */


public class Cond1
{
	// return true if argument n is even
    public static boolean isEven (int n) 
    {
		if ((n % 2) == 0)
			return true;
		else
			return false;
    }

    /*
		The above function could be coded more simply as:
     */   	
	public static boolean isEven2 (int n) 
	{
		return n % 2 == 0;
	}

	// return true if a is in the range [m..n] inclusive
    public static boolean isInRange(int a, int m, int n) 
    {
		boolean isGreater = (m <= a);
		boolean isLess = (a <= n);
		return (isGreater && isLess);
    }
	// Experienced programmers will write: return ((m <= a) && (a <= n));

    public static void main (String[] args) 
    {
		int num = 101;
	
		System.out.println("Testing parity of " + num);
		if (isEven(num))
			System.out.println(num + " is even");
		else
			System.out.println(num + " is odd");

		System.out.println("Testing if " + "4000" + " is in range [2000..6000]");
		
		num = 4000;
		if (isInRange(num, 2000, 6000))
			System.out.println(num + " is in range.");	
		else
			System.out.println(num + " is not in range.");
	
		System.out.println("Testing inequality of 3 and 4");
		boolean b = 3 != 4;	
		System.out.println(b);
    }
}
