// Minkyeol Kim
/*
	XArt.java
	CSE 114 Assignment 5 problem 2

    This code makes a X shape art on a square canvas.
*/
public class XArt extends AsciiArtBase {
    private char c; // character used to draw the X shape

    public XArt(int rows, int cols, char c) throws ArtException{
        this.description = "This art draws X shape on a square canvas.";
        this.c = c;

        if(rows != cols) throw new SizeException("XArt needs a square canvas. Rows and columns must be equal.");

        setRows(rows);
        setCols(cols);
    }

    // XArt must be a square, so rows and columns must be equal. 
    // We check this condition in both setRows() and setCols()
    // to ensure that the size is valid regardless of the order in which they are set.
    @Override
    public void setRows(int rows) throws ArtException {
        if(rows <= 1) throw new SizeException("Rows must be at least 1.");

        if(cols != 0 && rows != cols) throw new SizeException("XArt must be a square. Rows and columns must be equal.");

        this.rows = rows;
    }

    @Override
    public void setCols(int cols) throws ArtException {
        if(cols <= 1) throw new SizeException("Columns must be at least 1.");

        if(rows != 0 && rows != cols) throw new SizeException("XArt must be a square. Rows and columns must be equal.");

        this.cols = cols;
    }

    @Override
    public char[][] artwork() throws ArtException {
        if(rows != cols) throw new DrawingException("Cannot draw XArt because the canvas is not square.");

        char[][] art = new char[rows][cols];

        for(int i = 0; i < rows ;i++){
            for(int j = 0; j < cols; j++){
                // Draw the character if the current position is on one of the two diagonals.
                if(i == j || i + j == cols - 1) art[i][j] = c;
                // Otherwise, fill the position with a space.
                else art[i][j] = ' ';
            }
        }
        return art;
    }
}
