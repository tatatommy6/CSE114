public class Operators 
{
    public static void main(String[] args) 
    {
		int n = 25;
		int m = 4;
	
		int quotient = n / m;
		System.out.println("\nQuotient = " + quotient);
	
		int remainder = n % m;
		System.out.println("Remainder = " + remainder);
	
		double div = n / m; // does integer division then converts to double
		System.out.println("Div = " + div);
	
		// one operand converted to double so does floating point division
		double div2 = (double)n / m;  // Line 4
		System.out.println("Div2 = " + div2);
		
		double div3 = n / 4.0;
		System.out.println("Div3 = " + div3);
    }
}
