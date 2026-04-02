/*
	Histochar3.java
	Last modified by j.finn: 28-Mar-2026
	Read standard input until end of file.
	In this version we print the char counts as a histogram:
	We print a line of '*' for each char A-Z with number of * 
	equal to how many times each char appeared in the input.
 */

import java.util.Scanner;

public class HistoChar3
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
		{
			System.out.print((char)(i+'A') + ": ");
			for (int j = 0; j < charCounts[i]; j++)
				System.out.print("*");
			System.out.println();
		}
		scan.close();
    }
}
