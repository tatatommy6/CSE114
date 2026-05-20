/*
	MangleGame.java
	Last modified by J.Finn: 19-Apr-2026

	Abstract base class for "mangle" text transformation games.
	To create your own game:
		Create a derived class of MangleGame.
		In your constructor, set the description
			string, and, optionally, the prompt string.
		Implement the transform function.
*/

import java.util.Scanner;

public abstract class MangleGame implements Mangle
{
	/*** Section 1: public functions ***/

	/*
		Construct new MangleGame
	 */
	public MangleGame()
	{
		console = new Scanner(System.in);
	}

	/*
		print a description of the game
	 */
	public final void describe()
	{
		System.out.println(description);
	}

	/*
		play the game:
			Print prompt
			Read user input string
			Transform the string and print the result.
		Returns: true on success, false on error.
		Errors include: blank line input, error in transformation
	 */
	public final boolean play()
	{
		String input = readInput();			// prompt user, read input
		if (input == null) return false;	// end of file, blank line, error
		String result = transform(input);	// this is really the game
		if (result == null) return false;
		System.out.println(result);			// print result
		return true;
	}

	/*** Section 2: protected functions and data ***/

	/*
		Game description string.
		Derived classes should set this
		to an appropriate message in their
		constructors.
	 */
	protected String description = "";

	/*
		Prompt string for user input.
		Derived classes may change this if
		so desired.
	 */
	protected String promptString = 
		"Enter a line of text: ";

	/*
		userinput is the user input string.
		This is the main "game playing" function.
		It should alter the input according to
		the game rules and return the result.

		Returns: result String or null on error.

		All derived classes must override this
		function to implement their game.
	 */
	protected abstract String transform(String userinput);

	/*** Section 3: private functions and data ***/

	/* Reader for user input */
	private final Scanner console;

	/*
		print prompt, read user input String.
		Return: input String, or null on
		end-of-file or error
	 */
	private final String readInput()
	{
		System.out.print(promptString);			
		if (!console.hasNextLine()) return null;
		else
		{
			String input = console.nextLine();
			if (input.length() == 0) return null;
			else return input;
		}
	}
};
