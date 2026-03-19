import java.util.Scanner;

public class Hello
{    
    public static void main (String[] args)
    {		
		Scanner s = new Scanner(System.in);
		System.out.print("Hi!\nWelcome to CSE 114\nLet`s average three numbers.\n\"Give me a number (Integer whole number, no decimal point):");
		int n1 = s.nextInt();
		System.out.print("Give me a second number: ");
		int n2 = s.nextInt();
		System.out.print("Give me a third number: ");                
		System.out.printf("The average is: %.2f\n", (n1 + n2 + s.nextInt()) / 3.0);
		s.close(); // you should close the scanner when you're done with it. it raises a warning (not an error)
		// System.exit(0); // also you need to close the programm. but it`s not necessary XD
    }
}