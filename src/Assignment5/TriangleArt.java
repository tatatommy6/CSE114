/*
	TriangleArt.java
	Last modified by J.Finn: 9-May-2026

	Art that prints a triangle on the canvas that fills half the canvas
*/

public class TriangleArt extends AsciiArtBase
{
	private String desc = 
		"This art prints a triangle that fills the lower-left half of the canvas";
	private char c;
	
	/* 
		rows, cols are the initial rows and columns of the canvas.
		c is the char to be used in drawing
	 */
	public TriangleArt(int rows, int cols, char c)
	{
		if (rows >= 1) this.rows = rows;
		else this.rows = 10;
		if (cols >= 1) this.cols = cols;
		else this.cols = 10;
		this.description = desc;
		this.c = c;
	}

	 public char [] [] artwork()
	 {
	 	char [] [] art = new char[rows][cols];
	 	double ratio = (double) rows / cols;
	 	for (int i = 0; i < rows; i++)
	 		for (int j = 0; j < cols; j++)
	 			if (i >= ratio * j) art[i][j] = c;
	 			else art[i][j] = ' ';
	 	return art;
	 }
};
