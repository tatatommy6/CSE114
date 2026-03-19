/*
	Func4.java
	Last modified by j.finn: 3-Sep-2025
	Simple main just prints some lines of text.
	Modifies Func3.java
		Functions can take more than one argument.
		Here, we count the number of languages we have praised.
 */
public class Func4
{
	/*
		function: yesFun
		Prints some lines of text saying a language is fun
		Arguments:
			language: the language of interest
			count: a number to be printed at the start of each line of output
	 */
    public static void yesFun(String language, int count) 
    {
		System.out.println(count + " " + language);
		System.out.println(count + " Fun!");
		System.out.println(count + " Yes, it's fun!");
		System.out.println(count + " Oh, yeah!");
		System.out.println(count + " Come on try it!");
		System.out.println();
    }

    public static void main(String[] args) 
    {
		yesFun("C", 1);
		yesFun("Python", 2);
		yesFun("Scheme", 3);
		yesFun("Java", 4);
    }
}
