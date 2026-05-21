// Minkyeol Kim
/*
	DiamondArt.java
	CSE 114 Assignment 5 problem 2

    This code makes a diamond art by extending AsciiArtBase.
    It has a constructor that takes the number of rows, columns, and a char to draw the diamond with.
*/
public class DiamondArt extends AsciiArtBase {

    private char c; // char to draw the diamond with.
    public DiamondArt(int rows, int cols, char c) throws ArtException{
        this.description = "This art draws a diamond shape on the canvas.";
        this.c = c;

        setRows(rows);
        setCols(cols);
    }
    
    @Override
    public void setRows(int rows) throws ArtException{ // Override to set minimum size for diamond art
        if (rows < 3) throw new SizeException("DiamodArt must have at least 3 rows.");
        this.rows = rows;
    }

    @Override
    public void setCols(int cols) throws ArtException{ // Override to set minimum size for diamond art
        if (cols < 3) throw new SizeException("DiamodArt must have at least 3 columns.");
        this.cols = cols;
    }

    @Override
    public char[][] artwork() throws ArtException{

        // Check if the canvas size is sufficient to draw a diamond shape. 
        // If not, throw a DrawingException.
        if(rows < 3 || cols < 3) throw new DrawingException("cannot draw Diamond art with this canvas size.");

        char[][] art = new char [rows][cols];

        double centerRow = (rows - 1) / 2.0; // Calculate the center row and column of the canvas.
        double centerCol = (cols - 1) / 2.0; // This will be used to determine how far each point is from the center of the canvas.

        double maxRowDistance = centerRow;
        double MaxColDistance = centerCol;

        // draw the diamond shape.
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols; j++){
                double rowDistance = Math.abs(i - centerRow) / maxRowDistance;
                double colDistance = Math.abs(j - centerCol) / MaxColDistance;

                // Draw the character when the current position is inside the diamond area.
                if(rowDistance + colDistance <= 1) art[i][j] = c;
                else art[i][j] = ' ';
            }
        }
        return art;
    }
}
