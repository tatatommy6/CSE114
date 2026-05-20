/*
	RemoverGame.java
	Last modified by J.Finn: 19-Apr-2026

	MangleGame that removes removes specified characters from input.
	By default, it removes vowels (it is the same as the NoVowelsGame.
	By calling the method changeRemoveString, you can alter the set
	of characters to be removed
*/

public class RemoverGame extends MangleGame
{
	/*
	 * String representing characters to be removed, defaults to vowels
	 */
	private String removeString = "AaEeIiOoUu";

	/*
		Construct new RemoveGame
	 */
	public RemoverGame()
	{
		description = "This game removes all vowels from your input";
	}
	
	/*
	 *  Construct new RemoveGame using given String as set
	 *  of characters to be removed
	 */
	public RemoverGame(String r)
	{
		description = "This game removes these characters from your input: " + r;
		removeString = r;
	}
	
	/*
	 * Change set of characters to be removed to r
	 */
	public void changeRemoveString(String r)
	{
		description = "This game removes these characters from your input: " + r;
		removeString = r;
		System.out.println("New remove string: " + r);
	}

	protected String transform(String input)
	{
		StringBuilder result = new StringBuilder();
		int i;
		for (i = 0; i < input.length(); i++)
			if (removeString.indexOf(input.charAt(i)) == -1)
				result.append(input.charAt(i));
		return result.toString();
	}

	public static void main(String args[])
	{
		RemoverGame g = new RemoverGame();
		System.out.println("Should remove vowels");
		g.describe();
		g.play();
		System.out.println("Change to abc");
		g.changeRemoveString("abcABC");
		g.describe();
		g.play();
		System.out.println("New xyz game");
		MangleGame wg = new RemoverGame("xyzXYZ");
		wg.describe();
		wg.play();
	}
};
