package Assignment1;
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {

        // Create a Scanner object to read input from the user.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a char : ");

        // Read a char from the user.
        // We read a String and take its first char.
        String input = s.nextLine();  // read a full line
        char c = input.charAt(0);     // take the first character
        
        // Print the three consecutive characters and their codes.
        System.out.printf("The three consecutive character with '%c' in the middle are: \n", c);
        
        // Characters are stored as Unicode integers,
        // so adding or subtracting 1 moves to the next or previous character.
        System.out.printf("Char '%c' has code %d. \n", c-1 , (int)(c-1)); 
        System.out.printf("Char '%c' has code %d. \n", c , (int)(c)); 
        System.out.printf("Char '%c' has code %d. \n", c+1 , (int)(c+1));

        // Close the scanner to prevent resource leaks.
        s.close();
    }
}