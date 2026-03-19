public class Format 
{
    public static void main(String[] args) 
    {
		// %b  	- boolean
		// %c  	- char
		// %d  	- decimal integer
		// %f  	- floating point
		// %.2f	- floating point, round to 2 decimal places	
		// %e  - scientific notation
		// %s  - string
		
		// A whole number before the format (%10d) prints in a field of that width
		
		double result = 10 / 3.0;
		double res2 = 219482.39280349;
	
		System.out.println("Result: " + result);
		System.out.printf("Result: %10.3f\n", result);
	
		System.out.println("Result2: " + res2);
		System.out.printf("Result2: %10.3f\n", res2);
		System.out.printf("Result2: %e\n", res2);
		char ch = 'M';
		String aString = "This is a string";
		int myInt = 28391;
	
		System.out.printf("Character: |%c|\n", ch);
	
		System.out.printf("String: |%s|\n", aString);
	
		System.out.printf("decimal: |%10d|\n", myInt);
		System.out.printf("decimal: |%010d|\n", myInt);
    }
}
