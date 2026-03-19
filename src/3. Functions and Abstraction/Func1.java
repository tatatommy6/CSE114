/*
	Func1.java
	Last modified by j.finn: 3-Sep-2025
	Simple main function just prints some lines of text
	but i changed the logic to for-loop because it was awful to see
 */
public class Func1 {
    public static void main(String[] args)
    {
		String[] language = {"C", "Python", "Scheme", "Java"};
		
		for(int i = 0;i < language.length; i++) {
			System.out.println(language[i]);
			System.out.println("Fun!");
			System.out.println("Yes, it's fun!");
			System.out.println("Oh, yeah!");
			System.out.println("Come on try it!");
			System.out.println();
		}
	}
}
