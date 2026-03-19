public class MixedTypes 
{
    public static void main(String[] args) 
    {
		// "final" has different meanings depending on context
		// for variables, it means "constant"
		// you can't assign to PI after you initialize it, won't compile
		final double PI = 3.14;
		// won't compile
		// PI = 3.1415927;
	
		int radius = 4;
		double area = PI * radius * radius;
	
		System.out.println("Radius = " + radius + ", Area = " + area);
		
		// won't work
		// int area2 = PI * radius * radius;
	
		int area3 = (int) (PI * radius * radius);
		System.out.println("\nRadius = " + radius + ", Area = " + area3);
	
		int area4 = (int)PI * (int) radius * (int) radius;
		System.out.println("\nRadius = " + radius + ", Area = " + area4);
		
		double circumference = 2 * Math.PI * radius;
		System.out.println("\nRadius = " + radius + 
			" , Circumference = " + circumference);
		System.out.println("\nMath.PI = " + Math.PI);
    }
}
