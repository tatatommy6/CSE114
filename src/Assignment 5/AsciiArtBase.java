// Minkyeol Kim
/*
	AsciiArtBase.java
	Last modified by Minkyeol Kim: 21-May-2026

	Abstract base class.(with exception handling)
	
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
	public void setRows(int rows) throws ArtException // Modified to throw ArtException
	{
		if (rows < 1) throw new SizeException("Number of rows must be at least 1");
		this.rows = rows;
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
	public void setCols(int cols) throws ArtException // Modified to throw ArtException
	{
		if (cols < 1) throw new SizeException("Number of columns must ve at least 1.");
		this.cols = cols;
	}

	/*
		Draws the board to standard output on getRows() lines of length getCols().
		Throws DrawingException if artwork() returns null or has incorrect dimensions.
	 */
	public final void draw() throws ArtException{ // Modified to throw ArtException
		char [] [] canvas = artwork();

		if (canvas == null)
			throw new DrawingException("artwork() returned null");
		
		if (canvas.length != rows)
			throw new DrawingException("artwork() has the wrong number of rows.");

		for(int i = 0; i < rows; i++) {
			if(canvas[i] == null || canvas[i].length != cols)
				throw new DrawingException("artwork() has the wrong number of columns.");

			for(int j = 0; j < cols; j++) {
				System.out.print(canvas[i][j]);
			}
			System.out.println();
		}
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
	public abstract char [] [] artwork() throws ArtException; // Modified to throw ArtException
};
