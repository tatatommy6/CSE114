// Minkyeol Kim
/*
	Problem2Demo.java
	CSE 114 Assignment 5 problem 2

    This code tests the DiamondArt and XArt classes.
    It also tests the exception handling by trying to create an XArt with a non-square canvas.
*/
public class Problem2Demo {
    public static void main(String[] args) {
        try {
            System.out.println("Testing DiamondArt: ");
            AsciiArt diamond = new DiamondArt(9,17,'*');
            diamond.describe();
            diamond.draw();

            System.out.println();

            System.out.println("Testing XArt: ");
            AsciiArt x = new XArt(9,9,'#');
            x.describe();
            x.draw();

            System.out.println();

            System.out.println("Testing exception algorithm: ");
            AsciiArt notgoodX = new XArt(7,8,'@'); // This should throw an exception because XArt must be a square.
            notgoodX.describe();
            notgoodX.draw();
        }
        catch(Exception e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
