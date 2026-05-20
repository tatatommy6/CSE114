/*
	Console.java
	Last modified by J.Finn: 19-Apr-2026
	Simple Console for playing Mangle Games
*/

public class Console
{
	/* current game */
	private Mangle theGame;

	/*
	 * Initialize new console with no game loaded
	 */
	public Console()
	{
	   	theGame = null;
	}
	
	/*
		Initialize new console with game g loaded
	 */
	public Console(Mangle g)
	{
		theGame = g;
	}

	/*
		Print current game description
	 */
	public void describe()
	{
		theGame.describe();
	}

	/*
		Play the game once
	 */
	public void play()
	{
		theGame.play();
	}

	/*
		Play the game repeatedly until the
		user enters blank line or signals end-of-file
	 */
	public void loop()
	{
		System.out.println("The game will be played repeatedly until\n"
				+ "you enter a blank line");
		while (theGame.play())
			;
	}

	/*
	 * Set the console to use a different game
	 */
	public void load(Mangle g)
	{
		theGame = g;
	}
	
	/*
	 * Simple console demo program.
	 */
	public static void main(String args[])
	{
		Console c = new Console(new ReverseGame());
		c.describe();
		c.loop();
	}
};
