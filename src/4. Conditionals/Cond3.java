/* 
	Cond3.java
	Last modified by j.finn: 17-Mar-2026

	Conditionals with blocks
 */

public class Cond3 
{
    /*
		The syntax for if..else is

		if (condition)
			statement
		else
			statement

		If you want to put more than one statement in the if or the
		else parts, you need a block statement in braces.
     */
    
    public static void ifBlock()
    {
     	if (10 < 5) // won't work
			System.out.print("Testing if 10 < 5: ");
			System.out.println("It isn't so these lines shouldn't print");
     	// correct:
		if (10 < 5) {
			System.out.print("Testing if 10 < 5: ");
			System.out.println("It isn't so these lines shouldn't print");
		}
		else { 
			System.out.print("Testing if 10 < 5: ");
			System.out.println("It isn't so these lines should print");
		}
	}
    
    /*
		In Java if you write

		if (C1) if (C2) S2 else S3

		the else will match the closest if. It matches this indentation:

		if (C1)
			if (C2)
				S2
			else
				S3
		
		If you need the else to match the first if you must use braces

		if (C1)
		{
			if (C2)
				S2
			}
		else
			S3
     */
    
    public static void main (String[] args) 
    {
		ifBlock();
    }
}

