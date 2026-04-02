/*
	Bases.java
	Last modified by j.finn: 28-Mar-2026
	Functions to convert nonnegative integers to and from string representations
		in decimal, binary, octal, and hex.
	Functions to convert string representations between binary and octal or hex.
 */

public class Bases 
{
	public static boolean trace = false;	// print what's going on

	/* all the digit characters we use, up to hex */
	public static String digits = "0123456789ABCDEF";
			
	/* 
		return digit corresponding to binary/octal/decimal/hex char c, 
		or -1 if c is not a valid digit char
	 */
	public static int getDigit(char c)
	{
		return digits.indexOf(c);
	}
	
	/* 
		Let's start with an easy case:
		return string representation of nonnegative n in decimal
	 */
	public static String toDecimal(int n)
	{
		String result = "";
		int digit;
		if (trace)
			System.out.println("Convert " + n + " to decimal string");
		while (n > 0)
		{
			digit = n % 10;
			n = n / 10;
			result = digit + result;
			if (trace)
				System.out.println("Next digit = " + digit + ", result so far = " 
					+ result + ", remaining is " + n);
		}
		return result;
	}
	
	/* binary is just as easy */
	public static String toBinary(int n)
	{
		String result = "";
		int digit;
		if (trace)
			System.out.println("Convert " + n + " to binary string");
		while (n > 0)
		{
			digit = n % 2;
			n = n / 2;
			result = digit + result;
			if (trace)
				System.out.println("Next digit = " + digit + ", result so far = " + result 
					+ ", remaining is " + n);
		}
		return result;
	}
	

	/* 
		Let's solve it in general:
		return string representation of n in given base,
		where base should be 2, 8, 10 or 16
	 */
	public static String toBase(int n, int base)
	{
		String result = "";
		int digit;
		if (trace)
			System.out.println("Convert " + n + " to string in base " + base);
		while (n > 0)
		{
			digit = n % base;
			n = n / base;
			result = digits.charAt(digit) + result;
			if (trace)
				System.out.println("Next digit = " + digit + ", result so far = " + result 
					+ ", remaining is " + n);
		}
		return result;
	}
	
	/* 
		s is string representation of number in given base.
		base is 2, 8, 10 or 16
		Return: int value
	 */
	public static int strToInt(String s, int base)
	{
		int i;
		int result = 0;
		char digit;
		if (trace)
			System.out.println("Convert " + s + " to int in base " + base);
		for (i = 0; i < s.length(); i++)
		{
			digit = s.charAt(i);
			result = result * base + getDigit(digit);
			if (trace)
				System.out.println("Next digit = " + digit + 
					" result so far = " + result);
		}
		return result;
	}
	
	/*
		Converts string representations of number from binary to octal.
		s: String contain representation of a nonnegative integer in binary.
		Returns: representation of same number in octal.
		
		This implementation is easy given the above functions.
		Exercise: write it using the fact that one octal digit corresponds
		to three bits and one hex digit corresponds to four bits.
	 */
	public static String binToOct(String s)
	{
		int num = strToInt(s, 2);
		return toBase(num, 8);
	}

	/* converts string s from binary to hex */
	public static String binToHex(String s)
	{
		int num = strToInt(s, 2);
		return toBase(num, 16);
	}
	
	/* converts string s from octal to binary */
	public static String octToBin(String s)
	{
		int num = strToInt(s, 8);
		return toBase(num, 2);
	}
	
	/* converts string s from hex to binary */
	public static String hexToBin(String s)
	{
		int num = strToInt(s, 16);
		return toBase(num, 2);
	}

    public static void main(String[] args) 
    {
		String s;
		int i;
		
		s = toDecimal(9578);
		System.out.println(9578 + " as decimal string is " + s);
		s = toBinary(20);
		System.out.println(20 + " as binary string is " + s);
		
		s = toBase(9578, 10);
		System.out.println(9578 + " as string in base " + 10 + " is " + s);
		s = toBase(20, 2);
		System.out.println(20 + " as string in base " + 2 + " is " + s);
		
		s = toBase(100, 2);
		System.out.println(100 + " as string in base " + 2 + " is " + s);
		s = toBase(100, 8);
		System.out.println(100 + " as string in base " + 8 + " is " + s);
		s = toBase(100, 10);
		System.out.println(100 + " as string in base " + 10 + " is " + s);
		s = toBase(100, 16);
		System.out.println(100 + " as string in base " + 16 + " is " + s);
		
		s = toBase(127, 2);
		System.out.println(127 + " as string in base " + 2 + " is " + s);
		s = toBase(127, 8);
		System.out.println(127 + " as string in base " + 8 + " is " + s);
		s = toBase(127, 10);
		System.out.println(127 + " as string in base " + 10 + " is " + s);
		s = toBase(127, 16);
		System.out.println(127 + " as string in base " + 16 + " is " + s);
		
		i = strToInt("1000", 2);
		System.out.println("1000 as int in base " + 2 + " is " + i);
		i = strToInt("1000", 10);
		System.out.println("1000 as int in base " + 10 + " is " + i);
		i = strToInt("1000", 8);
		System.out.println("1000 as int in base " + 8 + " is " + i);
		i = strToInt("1000", 16);
		System.out.println("1000 as int in base " + 16 + " is " + i);
		System.out.println();
		
		s = "1010";
		System.out.println(s + " from binary to octal = " + binToOct(s));
		System.out.println(s + " from binary to hex = " + binToHex(s));
		s = "111111";
		System.out.println(s + " from binary to octal = " + binToOct(s));
		System.out.println(s + " from binary to hex = " + binToHex(s));
		System.out.println();
		
		s = "1F";
		System.out.println(s + " from hex to binary = "	+ hexToBin(s));
		s = "120";
		System.out.println(s + " from octal to binary = "	+ octToBin(s));
	}
}
