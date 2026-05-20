/*
	 PiglatinGame.java
	 Last modified by J.Finn: 19-Apr-2026
		
	 PigLatinGame is a MangleGame that converts the
	 input to Pig Latin.
	
	 Translation is done word per word using the
	 standard definition of Pig Latin:
	
	 If a word starts with a vowel, add the suffix "way".
	 For example, "above" in Pig Latin is "aboveway".
	
	 If the word starts with a consonant, locate the first vowel in the word. 
	 Move all the consonants preceding this vowel to the end of the word,
	 then add the suffix "ay". For example, "frog" in Pig Latin is "ogfray".
	
	 Non-word characters (spaces, punctuation, etc.) are copied unchanged
 */

public class PigLatinGame extends MangleGame
{
	public PigLatinGame()
	{
		description = "This game translates your input into Pig Latin";
	}
	
	/* String of all vowels */
	private static final String vowels = "AaEeIiOoUu";
	
	/*
	 * Return true if ch is a vowel
	 */
	private static boolean isVowel(char ch)
	{
		return (vowels.indexOf(ch) >= 0);
	}
	
	/*
	 * word is a String containing one word
	 * Returns word converted to Pig Latin
	 */
	private static String pigLatinWord(String word)
	{
		// if word starts with vowel add "way"
		if (isVowel(word.charAt(0)))
			return word + "way";
		
		// else find first vowel
		int i;
		for (i = 0; i < word.length() && !isVowel(word.charAt(i)); i++)
			;
		return word.substring(i) + word.substring(0, i) + "ay";
	}
	
	protected String transform(String input)
	{
		WordTokenizer wt = new WordTokenizer(input);
		StringBuilder result = new StringBuilder();
		if (wt.nextIsDelim())				// if string starts with delimiters
			result.append(wt.next());		//    copy it unchanged
	
		while (wt.hasNext())
		{
			// translate next word
			result.append(pigLatinWord(wt.next()));
			if (wt.hasNext())	// copy delimiter if any
				result.append(wt.next());
		}
		return result.toString();
	}
	
	/*
	 * main plays PigLatinGame in a loop until user
	 * enters a blank line.
	 */
	public static void main(String[] args)
	{
		MangleGame game = new PigLatinGame();
		game.describe();
		System.out.println("Enter blank line to quit playing");
		while (game.play())
			;
		System.out.println("Goodbye");
	}
}
