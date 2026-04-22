/*
	Histochar2.java
	Last modified by j.finn: 28-Mar-2026
	Read standard input until end of file.
	Print count of how many times each letter A-Z appeared
	Upper and lower case letters count as same letter.
	Here, we use a table of size 26 as there are only 26 letters.
	We translate each letter into a number between 0 and 25
	by subtracting 'A' from it. 'A'-'A' is 0, 'B'-'A' is 1, etc.
 */

import java.util.Scanner;

public class HistoChar2
{
    public static void main(String[] args) 
    {
		Scanner scan  = new Scanner(System.in);
		String input;
		int [] charCounts = new int[26];
		char c;
		int i;
		System.out.println("Enter text, ctrl-d to quit");
		while (scan.hasNextLine())
		{
			input = scan.nextLine();
			input = input.toUpperCase();
			for (i = 0; i < input.length(); i++)
			{
				c = input.charAt(i);
				if (c >= 'A' && c <= 'Z')
					charCounts[c-'A']++;
			}
		} 
		for (i = 0; i < 26; i++)
			System.out.println((char)(i+'A') + ": " + charCounts[i]);
		scan.close();
    }
}
