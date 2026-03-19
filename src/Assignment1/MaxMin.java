package Assignment1;
import java.util.Scanner;
public class MaxMin {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an int: ");
        int a = s.nextInt();

        System.out.print("Enter an int: ");
        int b = s.nextInt();

        System.out.print("Enter an int: ");
        int c = s.nextInt();

        System.out.print("Enter an int: ");
        int d = s.nextInt();

        int max = Math.max(Math.max(a, b),Math.max(c, d));
        int min = Math.min(Math.min(a, b),Math.min(c, d));

        System.out.printf("Max is %d, min is %d\n", max, min);
        s.close();
    }
}
