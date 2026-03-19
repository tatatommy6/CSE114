package Assignment1;
import java.util.Scanner;

public class CharCode {
    /* 
        function: printCode
        Prints the char c and its Unicode code to
            System.out as one line.
    */
    public static void printCode(char c){
        int code = (int) c;
        System.out.printf("Char '%c' has Code: %d\n", c, code);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a char: ");
        char c = s.next().charAt(0);

        printCode(c);
        s.close();
    }
}
