/*
	ReverseGame.java
	Last modified by J.Finn: 19-Apr-2026

	MangleGame that reverses user input
*/

public class ReverseGame extends MangleGame
{
	/*
		Construct new ReverseGame
	 */
	public ReverseGame()
	{
		description = "This game reverses your input";
	}

	/*
		Some implementation notes. If s is a String,
		s.charAt(i) is the character at index i
		in s. This is like writing s[i], except Java 
		Strings are not arrays so you can't write that.

		Strings are immutable. If you want a
		String that you can modify, use a StringBuilder.
		StringBuilders grow automatically as needed
		when you add characters to them.
	 */
	protected String transform(String input)
	{
		/* this works but is not efficient */
		/*
			String result = "";
			int i;
			for (i = input.length()-1; i >= 0; i--)
				result += input.charAt(i);
			return result;
		 */
		 
		/* this is more efficient */
		/*
			StringBuilder result = new StringBuilder();
			int i;
			for (i = input.length()-1; i >= 0; i--)
				result.append(input.charAt(i));
			return result.toString();
		 */

		/* but this is fastest and easiest */
		StringBuilder result = new StringBuilder(input);
		result.reverse();
		return result.toString();
	}

	public static void main(String args[])
	{
		ReverseGame r = new ReverseGame();
		r.describe();
		r.play();
	}
};
