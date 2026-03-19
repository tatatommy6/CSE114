package Assignment1;
import java.util.Scanner;

public class Consecutive {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a char : ");
        char c = s.next().charAt(0);
        System.out.printf("The three consecutive character with '%c' in the middle are: \n", c);
        System.out.printf("Char '%c' has code %d. \n", c-1 , (int)(c-1));
        System.out.printf("Char '%c' has code %d. \n", c , (int)(c));
        System.out.printf("Char '%c' has code %d. \n", c+1 , (int)(c+1));
        s.close();
    }
}
