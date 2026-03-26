/*
	FunScan.java
	Last modified by j.finn: 21-Mar-2026
	Use a Scanner to examine a String
 */

import java.util.Scanner;

public class FunScan 
{
    public static void main(String[] args) 
    {
		Scanner scan  = new Scanner(System.in);
		String input;
		
		while (true){
			System.out.print("Enter a line of anything: ");
			if (!scan.hasNextLine()) break;
			input = scan.nextLine();
			
			String[] tokens = input.split(" ");
			for(int i= 0; i< tokens.length;i++){
				for(int j = 0;j < tokens[i].length();j++){
					System.out.println("Next token: *" + tokens[i].charAt(j) + "*");
				}	
			}
		}
		System.out.println();
		System.out.println("Goodbye, parting is such sweet sorrow.");
		scan.close();
    }
}
