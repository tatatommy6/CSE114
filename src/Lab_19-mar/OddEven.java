/*
	OddEven.java
	Last modified by j.finn: 19-Mar-2026
	Template for lab exercise.

	Exercise: Write a program that reads exactly two integers 
	then prints out whether they are both odd numbers, both
	even numbers, or one each of odd and even.
	
	The output would be one of:
	"Both numbers are even."
	"Both numbers are odd."
	"One number is even and one is odd."
 */

import java.util.Scanner; 

public class OddEven 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		int first, second;

		System.out.print("Enter an integer value: ");
		first = scan.nextInt();

		System.out.print("Enter an integer value: ");
		second = scan.nextInt();
		
		//edit started here
		if (first % 2 == 0 && second % 2 == 0){
			System.out.println("both numbers are even.");
		}
		else if(first % 2 ==1 && second % 2 == 1){
			System.out.println("both numbers are odd.");
		}
		else{
			System.out.println("One number is even and one is odd.");
		}

		scan.close();
	}
}		
