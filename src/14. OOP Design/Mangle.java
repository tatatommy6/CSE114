/*
	Mangle.java
	Last modified by J.Finn: 19-Apr-2026

	Interface for mangle games which read a line of text and transform it
	by rules that are specific to the game.
*/

public interface Mangle
{
	/*
		print a description of the game
	 */
	public void describe();

	/*
		play the game:
			Print prompt
			Read user input string
			Transform the string and print the result.
		Returns: true on success, false on error.
		Errors include: blank line input, error in transformation
	 */
	public boolean play();
};
