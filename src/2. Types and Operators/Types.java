public class Types 
{
    public static void main(String[] args) 
    {

		// short, int, long => all different types but all
		// whole number integer.
		int numberOfStudents = 10;
	
		// float, double  => 32 bits, 64 bits
	
		double interestRate = 3.25;
	
		// One single char, 16 bits 
		char letter = 'M';   // M

		// But Unicode chars can be 32 bits!
		// Java char uses UTF-16.
		// One Korean char will fit in 16 bits
		// Some Unicode chars need TWO Java chars
		// 		char low; char high;
		//  	System.out.println("One char: " + low + high);
			
		// String is a class in Java
		// Strings will handle ALL Unicode characters
		String name = "Amy"; // String is a class, not primitive type!
	
		// boolean has only two values, true and false
		boolean isRaining = false;
	
		System.out.println(numberOfStudents + ", " +
				interestRate + ", " +
				letter + ", " +
				name + ", " +
				isRaining);

		numberOfStudents = numberOfStudents + 100;
		interestRate = interestRate - 0.15;
		letter = 'm';
		name = name + " rocks.";
		isRaining = true;
	
		System.out.println("\n" + numberOfStudents + ", \n" +
				interestRate + ", \n" +
				letter + ", \n" +
				name + ", \n" +
				isRaining);
		// Try the following
		int i;
		i = (int) 3.2; // Line A
		System.out.println("i = " + i);
	
		// a byte is a very small int: one byte is
		// enough space to hold ascii character codes
		byte aByte = 'A';
		System.out.println("aByte: " + aByte);
		System.out.println("aByte as a char: " + (char) aByte);
    }
}
