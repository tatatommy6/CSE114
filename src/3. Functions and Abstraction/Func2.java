/*
	Func2.java
	Last modified by j.finn: 10-Mar-2026
	Simple main just prints some lines of text
	Modifies Func1.java by "encapsulating" repeated
	code in a function yesFun.
 */
public class Func2 
{
	/*
		function: yesFun
		Prints some lines of text saying a language is fun.
		These are lines that were repeated several times in Func1.java
	 */
    public static void yesFun() 
    {
		System.out.println("Fun!");
		System.out.println("Yes, it's fun!");
		System.out.println("Oh, yeah!");
		System.out.println("Come on try it!");
		System.out.println();
    }

    public static void main(String[] args) 
    {
		System.out.println("C");
		yesFun();
	
		System.out.println("Python");
		yesFun();
		
		System.out.println("Scheme");
		yesFun();
		
		System.out.println("Java");
		yesFun();
    }

}
