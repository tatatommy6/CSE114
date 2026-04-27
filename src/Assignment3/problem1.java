package Assignment3;
import java.util.Scanner;
//Minkyeol Kim
public class problem1{
    /* 
    function: reverseString 
    Returns the reverse of its argument s. 
    Example: reverse("pigs") returns "sgip". 
    */ 
    public static String reverseString(String s, int index) {
        String result = "";
        if(s.length() <= 1){
            return s;
        }
        
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = s.nextLine();
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
        
    }
}