/*
	Read.java
	Demo the scanner class
	Java library is in named packages.
	Packages are identified by name and location
	java.util.Scanner is like a directory path java/util/Scanner.class
	Import statements go at the beginning of the file before classes
	Classes in java.lang, like String, are considered part of the language
		and you don't have to import.
	"import" doesn't really do anything.
	It just tells the compiler that when you write "Scanner" you mean
		java.util.Scanner.
	You could always write java.util.Scanner in full every time
 */
import java.util.Scanner; 

public class Read 
{
    public static void main(String[] args) 
    {
		Scanner scan = new Scanner(System.in); // Scanner attached to System.in = keyboard

		// Scanner
		//   scan.next()   - Next "token" (all characters up to next space or newline)
		//   scan.nextInt() - Up to a non numeric character
		//   scan.nextDouble(); - Reads a double (can have fraction)
		//   scan.nextLine(); - Reads up to next newline
		//
		//   scan.close() = closes the scanner & releases memory
		//   when a program terminates, all open files are closed anyway
		
		//   Review: when a program begins running, three files are already open:
		//	 System.in: standard input, usually the keyboard
		//   System.out: standard output, usually the monitor
		//   System.err: standard error, for error messages, usually the monitor
		//	 The person running the program has the option to "redirect" any
		//     of standard input, standard output or standard error to files.
		
		//   Scanner works well when all input is the same type.
		//	 When mixing input types you may get unexpected behavior
		//		which happens here at the end.


		System.out.print("\nEnter a Fahrenheit temp (integer): ");
		int fahr;
		fahr = scan.nextInt();
		System.out.println("This is the temp: " + fahr);
	
		System.out.print("\nEnter a gas price per liter today (real): ");
		double price = scan.nextDouble();
		System.out.println("That was " + price);
	
		System.out.print("\nEnter a word that describes how you feel today: " );
		String word = scan.next();
		System.out.println(word + "!");
	
		// Get another integer and get a line but use first scanner
		System.out.print("Give me another integer: ");
		int newInt = scan.nextInt();
		System.out.println(newInt);
		
		System.out.print("\nEnter a sentence: ");
		String line2 = scan.nextLine();  // get a whole line
		System.out.println(line2);
	
		scan.close();	// unnecessary as program is about to terminate
    }
}    
