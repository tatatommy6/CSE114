public class Var 
{
    public static void main(String[] args) 
    {
		int width;
		width = 10;
	
		int height = 10;
	
		int area;
		area = width * height;
	
		System.out.println();
		System.out.println("Width is " + 10);
		System.out.println("Height is " + height);
	
		System.out.println("Area of a rectangle with two sides 10" +
					" and " + height + " is " + area);
	
		int xScaleFactor = 2;
		int yScaleFactor = 3;
	
		width = width * xScaleFactor;
		height = height * yScaleFactor;
		area = width * height;
		System.out.println("\nArea of a rectangle with two sides " 
						+ width + " and " + height + " is " + area);
	
		// Test how
		System.out.println("\nDemo some bad printing technique:"); // blank line
		System.out.println(20 + 30 + "Width is " + 10 + 20);
		// 50 + "Width is ...	
		// "50Width is " + 10 + 20
		// "50Width is 10" + 20
		// "50Width is 1020"
		System.out.println("\nImprove things");
		System.out.println(20 + 30 + "Width is " + 10 + " " + 20);
	
    }

}
