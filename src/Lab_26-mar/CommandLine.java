/*
	CommandLine.java
	Last modified by j.finn: 26-Mar-2026
	Print the command line arguments
	Demo, not an exercise
 */

public class CommandLine 
{
    public static void main(String[] args) 
	{
		int i;
		System.out.print("Command line: ");
		for (String s:args)
			System.out.print(s + " ");
		System.out.println();
	}
}
