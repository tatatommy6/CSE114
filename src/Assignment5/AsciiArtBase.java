/*
	AsciiArtBase.java
	Last modified by J.Finn: 9-May-2026

	Abstract base class.
	
	To create an art work:
	a) create a subclass of ArtBase
	b) The constructor should initialize rows, cols, and description
	c) Implement the artwork() function
	d) If you do not wish to allow all values for rows and cols, you
	   optionally may override getRows and setRows.
*/

public abstract class AsciiArtBase implements AsciiArt
{
	protected String description;	// artwork description
	protected int rows;		// current number of canvas rows
	protected int cols;		// current number of canvas columns

	/*
		Print a description of the art
	 */
	public final void describe()
	{
		System.out.println(description);
	}
	
	/*
		Returns the number of rows in the canvas
	 */
	public final int getRows()
	{
		return rows;
	}
	
	/*
		Sets the number of rows in the canvas
	 */
	public boolean setRows(int rows)
	{
		if (rows < 1) return false;
		this.rows = rows;
		return true;
	}
	
	/*
		Returns the number of columns in the canvas
	 */
	public final int getCols()
	{
		return cols;
	}
	
	/*
		Sets the number of columns in the canvas
	 */
	public boolean setCols(int cols)
	{
		if (cols < 1) return false;
		this.cols = cols;
		return true;
	}

	/*
		Draws the board to standard output on getRows() lines of length getCols().
		Return true normally, false on error.		
	 */
	public final boolean draw()
	{
		char [] [] canvas = artwork();
		if (canvas == null) return false;
		for (int i = 0; i < rows; i++)
		{
			for (int j = 0; j < cols; j++)
				System.out.print(canvas[i][j]);
			System.out.println();
		}
		return true;
	}
	
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
		Returns null on error.
	 */
	 public abstract char [] [] artwork();
};
