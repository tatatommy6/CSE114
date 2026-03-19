/*
	Func3.java
	Last modified by j.finn: 3-Sep-2025
	Simple main just prints some lines of text.
	Modifies Func2.java by adding the language name as an argument to yesFun,
		so the repeated println statements in main stating the language name
		can be eliminated.
 */
public class Func3 
{
	/*
		function: yesFun
		Prints some lines of text saying a language is fun
		Argument language: the language of interest
	 */
    public static void yesFun(String language) 
    {
		System.out.println(language);
		System.out.println("Fun!");
		System.out.println("Yes, it's fun!");
		System.out.println("Oh, yeah!");
		System.out.println("Come on try it!");
		System.out.println();
    }

    public static void main(String[] args) 
    {
		yesFun("C");
		yesFun("Python");
		yesFun("Scheme");
		yesFun("Java");
    }
}
