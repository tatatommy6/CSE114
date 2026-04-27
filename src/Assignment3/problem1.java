package Assignment3;
import java.util.Scanner;
//Minkyeol Kim

public class problem1{
    /* 
    function: reverseString 
    Returns the reverse of its argument s. 
    Example: reverse("pigs") returns "sgip". 
    */ 
    public static String reverseString(String s) {
        // Base case
        // If the string is empty or has only one character, return it as is
        if(s.length() <= 1){
            return s;
        }
        // Recursive
        // Take the first character and append it to the reverse of the rest of the string
        // For example, if s is "pigs", it will take 'p' and append it to the reverse of "igs"
        // reverseString("igs") will return "sgi", and then we append 'p' to get "sgip"
        // This process continues until we reach the base case
        return reverseString(s.substring(1)) + s.charAt(0);
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");

        String input = s.nextLine();
        System.out.println("Reversed string: " + reverseString(input));
        s.close();
    }
}