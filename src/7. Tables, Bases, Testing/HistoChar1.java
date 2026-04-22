/*
	Histochar1.java
	Last modified by j.finn: 28-Mar-2026
	Read standard input until end of file.
	Print count of how many times each letter A-Z appears
	Upper and lower case letters count as same letter.
	Here, the table size is 128 to accommodate all ASCII codes,
	but we only use 'A' through 'Z'.
 */

import java.util.Scanner;

public class HistoChar1 
{
    public static void main(String[] args) 
    {
		Scanner scan  = new Scanner(System.in);
		String input;
		int [] charCounts = new int[128]; // one per ASCII code
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
					charCounts[c]++;
			}
		} 
		for (i = 'A'; i <= 'Z'; i++)
			System.out.println((char)(i) + ": " + charCounts[i]);
		scan.close();
    }
}
