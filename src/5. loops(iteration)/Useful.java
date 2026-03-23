/* 
	Useful.java
	Last modified by j.finn: 21-Mar-2026

	Demonstrates some useful functions from the Java library
	(mostly String functions)
 */
public class Useful 
{
    public static void main(String[] args) 
    {
		/* pow calculates exponents of doubles */
		double result = Math.pow(2, 4);
		System.out.println("Math.pow(2,4) is: " + result);
		System.out.println();
	
		/*
			charAt selects one character from a string
			given the character's position.
			Positions start from 0. In "Alice" 'A' is
			at position 0, 'l' at 1, and so on.
			
			Note the syntax: name.charAt(x)
			charAt is NOT a static method.
			It is an instance method. We will study
			these soon.
			
			static method: charAt(name, x);
			instance method: name.charAt(x);
			
			length returns the length of the string
			(number of characters in it)			
		 */
		String name = "Alice";
		for (int x = 0; x < name.length(); x++) 
		{
			char ch = name.charAt(x);
			// I have 'c' on my mind. See?
			if (ch == 'c')
				System.out.println(ch + " == c");
			if (Character.isUpperCase(ch))
				System.out.println(ch + " is uppercase");
			else
				System.out.println(ch + " is not uppercase");
		}
	
		System.out.println();
		
		String sentence = "This is a test.";
		System.out.println("String: " + sentence);
	
		/*
			substring returns the part of the string starting at the first
			argument (0) up to but NOT including the position of the second
			argument (4)
		 */
		String partial = sentence.substring(0,4);
		System.out.println("Result of substring from 0 to 4: *" + partial + "*");
	
		/*
			with only one argument, returns the substring from that
			position to the end of the string.
		 */
		System.out.println("Result of substring(5): *" + sentence.substring(5) + "*");
		System.out.println();
	
		System.out.println(sentence.toUpperCase()); // this creates a new string
		System.out.println(sentence); 	// strings are immutable, sentence is unchanged
	
		/*
			indexOf searches the string for the first occurence of 
			the character argument and returns its position,
			or -1 if the character is not found in the string.
		 */
		System.out.println("Index of 'e': " + sentence.indexOf('e'));
	}	
}
