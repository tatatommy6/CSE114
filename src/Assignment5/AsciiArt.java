/*
	AsciiArt.java
	Last modified by J.Finn: 9-May-2026

	Interface for ASCII art programs that draw character-based
	art over any rectangular grid.
	
	It is expected that the initial number of rows and columns
	will be AsciiArt constructor arguments, but they are intended
	to be modifiable to produce variations on the art of
	different sizes.
*/

public interface AsciiArt
{
	/*
		Print a description of the art
	 */
	public void describe();
	
	/*
		Returns the number of rows in the canvas
	 */
	public int getRows();
	
	/*
		Sets the number of rows in the canvas
		throws SizeException if the requested number of rows is inappropriate.
	 */
	public void setRows(int rows) throws ArtException;
	
	/*
		Returns the number of columns in the canvas
	 */
	public int getCols();
	
	/*
		Sets the number of columns in the canvas.
		throws SizeException if the requested number of columns is inappropriate.
	 */
	public void setCols(int cols) throws ArtException;

	/*
		Draws the board to standard output on getRows() lines of length getCols().
		throws DrawingException on error.
	 */
	public void draw() throws ArtException;
	
	/*
    Returns a newly-created two-dimensional array of char,
    which will have getRows() rows and getCols() columns,
    and which contains the same drawing that would be printed
    to standard output by calling draw().
    Arrays are mutable, so this must be a new array, not a
    reference to any private implementation data structure.
    In other words, if the client modifies this array, it should
    not affect the array returned by subsequent calls to artwork()
    or the art drawn by subsequent calls to draw().
    Throws DrawingException on error.
	*/
	public char [] [] artwork() throws ArtException;
};
