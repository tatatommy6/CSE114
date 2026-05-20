/*
 * Wortokenizer.java
 * Last modified by J.Finn: 19-Apr-2026
 * 
 *	WordTokenizer takes a String and breaks it up into a sequence of words.
 *  A word is a sequence of letters. Sequences of non-letter characters
 *	are considered to be delimiters.
 *	The first token may be either a word or a delimiter.
 *	Subsequent tokens alternate between words and delimiters.
 *	Example: In the String "I love you!!!" the tokens in sequence are:
 *	   "I" (word)
 *	   " " (delimiter)
 *	   "love" (word)
 *	   " " (delimiter)
 *     "you" (word)
 *	   "!!!" (delimiter)
*/
public class WordTokenizer
{
	/* the String to be tokenized */
	private final String s;
	
	/* the current position in our scan of s */
	private int pos;
	
	/* length of s */
	private int length;
	
	/*
	 *	Construct WordTokenizer
	 *	stringArg is the String to be tokenized
	 */
	public WordTokenizer(String stringArg)
	{
		s = stringArg;
		pos = 0;
		length = s.length();
	}
	
	/*
	 * return true if ch1 and ch2 are both letters or both delimiters
	 */
	private boolean sameType(char ch1, char ch2)
	{
		if (Character.isLetter(ch1))
			return Character.isLetter(ch2);
		else return !Character.isLetter(ch2);
	}
	
	/*
	 * Returns true if there are more tokens
	 */
	public boolean hasNext()
	{
		return pos < length;
	}
	
	/*
	 * returns next token, or null if there are no more tokens
	 */
	public String next()
	{
		if (!hasNext()) return null;
		char first = s.charAt(pos);
		StringBuilder result = new StringBuilder(String.valueOf(first));
		for (pos++; pos < length; pos++)
		{
			char nextChar = s.charAt(pos);
			if (!sameType(first, nextChar))
				break;
			result.append(nextChar);
		}
		return result.toString();
	}
	
	/*
	 * Checks whether next token is a word
	 * Returns true if next token is a word, false if next 
	 * token is a delimiter or there are no more tokens
	 */
	public boolean nextIsWord()
	{
		return hasNext() && Character.isLetter(s.charAt(pos));
	}
	
	/*
	 * Checks whether next token is a delimiter
	 * Returns true if next token is a delimiter, false if next 
	 * token is a word or there are no more tokens
	 */
	public boolean nextIsDelim()
	{
		return hasNext() && !Character.isLetter(s.charAt(pos));
	}

	/* main shows tokens in example string "I love you!!!" */
	public static void main(String[] args)
	{
		String demo = "I love you!!! I mean it this time!";
		WordTokenizer wt = new WordTokenizer(demo);
		System.out.println("Tokens in " + demo);
		while (wt.hasNext())
			System.out.println("\"" + wt.next() + "\"");
	}
}
