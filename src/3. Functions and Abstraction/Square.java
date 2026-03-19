/*
	Square.java
	Last modified by j.finn: 10-Mar-2026
	Illustrates simple function that returns a value
	and that can be used in experessions.
 */

import java.util.Scanner; 

public class Square 
{
	/*
		function: Square
		returns: the square of its integer argument toBeSquared
	 */
	public static int square(int toBeSquared)
	{
		return toBeSquared * toBeSquared;
	}
	
	/*
		main asks user for an int and the squares it
	 */
    public static void main(String[] args) 
    {
    	int userInput;
		Scanner scan = new Scanner(System.in);
		System.out.print("Number you would like squared: ");
		userInput = scan.nextInt();
		System.out.println("That number squared is " + square(userInput));		
		scan.close();
    }
}
