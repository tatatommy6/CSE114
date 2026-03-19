/* 
	Cond5.java
	Last modified by j.finn: 17-Mar-2026

	No matter how many times you type the same string in quotes,
	Java will only create one single String object with that value.
	This is called "interning."
	
	If you create a string value from input, like Scanner.nextLine(),
	or by using the new operator, you will get a new object.
	
	Verify that two strings in quotes will test ==
	but if one string is input from keyboard the test fails.
	Using the equals method works in both cases.
 */

import java.util.Scanner; 


public class Cond5 
{
    public static void main (String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		String s = "love";
		String t = "love";
		System.out.print("Type the word 'love': ");
		String x = scan.nextLine();
		System.out.println("You typed *" + x + "*");
		String w = new String("love");
		System.out.println("Constant strings love test for ==, " 
			+ (s == t));
		System.out.println("Constant vs input string love test for ==, " 
			+ (s == x));
		System.out.println("Constant vs \"new\" string test for ==, " 
			+ (s == w));
		System.out.println("Constant vs input string love test for equals, " 
			+ (s.equals(x)));
		System.out.println("input string vs \"new\" string love test for equals, " 
			+ (x.equals(w)));
		scan.close();
	};
}

