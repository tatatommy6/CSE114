/*
	NoVowelsGame.java
	Last modified by J.Finn: 19-Apr-2026

	MangleGame that removes all vowels from the input
*/

public class NoVowelsGame extends MangleGame
{
	private static final String vowels = "AaEeIiOoUu";

	/*
		Construct new NoVowelsGame
	 */
	public NoVowelsGame()
	{
		description = "This game removes all vowels from your input";
	}

	protected String transform(String input)
	{
		/*
		 * Implementation note: If s is a String and c is a character,
		 * s.indexOf(c) searches for the first occurence of c in s. It returns the
		 * index of this first occurrence, or -1 if c does not occur in s.
		 */
		StringBuilder result = new StringBuilder();
		int i;
		for (i = 0; i < input.length(); i++)
			if (vowels.indexOf(input.charAt(i)) == -1)
				result.append(input.charAt(i));
		return result.toString();
	}

	public static void main(String args[])
	{
		NoVowelsGame nv = new NoVowelsGame();
		nv.describe();
		nv.play();
	}
};
