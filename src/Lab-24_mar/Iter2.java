/*
	Iter2.java
	Last modified by j.finn: 21-Mar-2026
 */

public class Iter2
{
    /*
		Adds integers input by user.
		This loop exits when the user enters ctrl-d.
     */
    public static int infiniteLoop() 
    {
		java.util.Scanner scan  = new java.util.Scanner(System.in);
		int input;
		int sum = 0;
		int countint = 0;
		int countnonint = 0;
		while (true) // or, equivalently, for(;;)
		{
			System.out.print("Enter a number (ctrl-d to exit): ");
			if (scan.hasNextInt())
			{
				input = scan.nextInt();
				sum = sum + input;
				countint++;
			}
			else if (scan.hasNext()) // skip next token, wasn't an integer
			{
				String s = scan.next(); // read and discard
				System.out.println(s + " is not an integer.");
				countnonint++;
			}
			else	// got end of file
				break;
		} 
		scan.close();
		System.out.println();
		System.out.println("You entered " + countint + " integers and " + countnonint + " non-integers.");
		return sum;
    }
	
    public static void main(String[] args) 
    {
		System.out.println("Sum of your numbers = " + infiniteLoop());
    }
}
