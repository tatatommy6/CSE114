package Assignment1;
import java.util.Scanner;

public class CharCode {
    /* 
        function: printCode
        Prints the char c and its Unicode code to
            System.out as one line.
    */
    public static void printCode(char c){
        // Cast char c to int to get its Unicode code.
        int code = (int) c;

        // We need to make a print inside the function 
        // because the function`s return type is void 
        // which means it does not return any value.
        System.out.printf("Char '%c' has Code: %d\n", c, code);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user.
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a char: ");

        // Read a char from the user. 
        // We read a String and take its first char.
        String input = s.nextLine(); // read a full line
        char c = input.charAt(0); // take the first character

        // Call the function to print the char and its code.
        printCode(c);
        // Close the scanner to prevent resource leaks.
        s.close();
    }
}