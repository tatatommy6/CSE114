/*
	Iter.java
	Last modified by j.finn: 21-Mar-2026
	
	while loop for iteration
	Syntax:
		C is a condition (boolean expression)
		S is a statement
		
		while (C)
			S;
		// whatever follows the while statement
			
	Semantics:
		These steps are done in order:
		1. C is evaluated
		2. If C is false, S is not executed and control passes to 
			whatever follows the while statement
		3. If C is true, S is executed
		4. go back to step 1.

	while loops have their exit test at the top of the loop.
	You can use a break statement to exit the loop from a test in the middle.
	
	An infinite loop is a loop that never exits.
	Infinite loops are usually a bug.
 */

public class Iter 
{
    /* This computes factorials
     * n! is the product of numbers from 1 to n
     * n! = 1 * 2 * 3 * ... * (n-1) * n 
     * Precondition: n > 0
     * Using a long because factorials get big very quickly
     * 
     * Java allows abbreviations for common operator use:
     * x = x * 10 can be written as x *= 10
     * x = x - 5 can be written as x -= 5
     * Adding and subtracting 1 is so common that it gets
     * 	a special abbreviation
     * x = x+1 can be written as x++ or ++x (slightly different meanings)
     * x = x-1 can be written as x-- or --x (slightly different meanings)
     */
    public static long factorial (long n) 
    {
		long result = 1;
		int i = 2;
		
		while (i <= n) 
		{
	    	result = result * i;
			i++;
		}
		return result;
    }
    
    /*
		Adds positive numbers input by user.
		This loop exits when the user enters a negative number.
		The exit test is in the middle of the loop because we
		cannot test the input until after we prompt for input
		and read it.
		Using the value true for the while loop exit test means
		that condition is always true and that test will never
		cause the loop to exit.
     */
    public static int infiniteLoop() 
    {
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		int input;
		int sum = 0;
		while (true) // potential infinite loop, must be exit test in body
		{
			System.out.print("Enter a number (negative to exit): ");
			input = scan.nextInt();
			if (input < 0)
				break;
			sum = sum + input;
		} 
		scan.close();
		return sum;
    }

    public static void main(String[] args) 
    {
		System.out.println("Factorial(6): " + factorial(6));
		System.out.println("Factorial(20): " + factorial(20));
		System.out.println("Sum of your numbers = " + infiniteLoop());
    }
}
