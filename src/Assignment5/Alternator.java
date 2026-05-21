// Minkyeol Kim
/*
	Alternator.java
	Last modified by minkyeol kim: 21-May-2026

	Art that prints alternating characters.(with exception handling)
*/

public class Alternator extends AsciiArtBase
{
	private String desc = "This art prints two alternating characters on the canvas";
	private char c1, c2;
	
	/* 
		rows, cols are the initial rows and columns of the canvas.
		c1 and c2 are the characters to be used in drawing
	 */
	public Alternator(int rows, int cols, char c1, char c2) {
		if (rows >= 1) this.rows = rows;
		else this.rows = 10;
		if (cols >= 1) this.cols = cols;
		else this.cols = 10;
		this.description = desc;
		this.c1 = c1;
		this.c2 = c2;
	}

	public char [] [] artwork() throws ArtException { // Modified to throw ArtException
		char [] [] art = new char[rows][cols];
		for (int i = 0; i < rows; i++)
			for (int j = 0; j < cols; j++)
				if ((i+j) % 2 == 0) art[i][j] = c1;
				else art[i][j] = c2;
		return art;
	}
};
