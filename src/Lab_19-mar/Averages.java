/*
	Averages.java
	Last modified by j.finn: 19-Mar-2026
	Template for lab exercise.

	Exercise: Write a program that reads exactly ten integers 
	from the keyboard and then computes the average of all the even 
	integers and the average of all the odd integers separately, 
	then prints the two (double) averages.

	We are about to learn about loops and iteration, which will
	allow a simpler solution to this exercise without so much
	duplicated code for each of the ten 10 input integers.
	
	Remember, your computer can copy and paste, but better
	days are coming.
 */

import java.util.Scanner; 

public class Averages 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in);
		
		int totalEven = 0;	// total of even numbers
		int countEven = 0;	// how many even numbers
		int n;				// to hold one input value

		//edit started here
		int totalOdd = 0;
		int countOdd = 0;
		
		for(int i=0;i<10;i++){
			System.out.print("Enter an integer value: ");
			n = scan.nextInt();
			if(n % 2 == 0){
				totalEven += n;
				countEven++;
			}
			else{
				totalOdd += n;
				countOdd++;
			}
		}

		System.out.printf("The average of the even numbers is :%.2f\n", (double)totalEven/countEven);
		System.out.printf("The average of the odd numbers is %.2f\n",(double)totalOdd/countOdd);
		scan.close();
	}
}		
