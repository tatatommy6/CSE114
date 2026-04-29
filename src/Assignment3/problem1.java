import java.util.Scanner;
// Minkyeol Kim

public class problem1{

    /* 
    function: reverseString 
    Returns the reverse of its argument s. 
    Example: reverse("pigs") returns "sgip". 
    */ 
    public static String reverseString(String s) {
        // Start recursion from the last index of the string
        return reverseHelper(s, s.length() - 1);
    }
    // Helper function to handle recursion using index
    public static String reverseHelper(String s, int index) {
        // Base case
        // If index is less than 0, we have processed all characters
        if(index < 0){
            return "";
        }

        // Recursive
        // Take the current character at index
        // and append the result of reversing the rest (moving left)
        return s.charAt(index) + reverseHelper(s, index - 1);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");

        String input = s.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
        s.close();
    }
}