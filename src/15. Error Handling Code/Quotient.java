import java.util.Scanner;

public class Quotient 
{
    public static void main(String[] args) 
    {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter 2 integers: ");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		
// 		System.out.println(number1 + "/" + number2 +" is " +
// 				   (number1 / number2));
	
		try
		{
			System.out.println(number1 + "/" + number2 +" is " +
				   (number1 / number2));
	
		}
		catch (ArithmeticException ex)
		{
			System.out.println("Error: " + ex.getMessage());
			ex.printStackTrace();
		}
		
		System.out.println("We DID NOT CRASH. Goodbye");
		input.close();
   }
}




	
