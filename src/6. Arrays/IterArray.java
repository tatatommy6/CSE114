/*
	IterArray.java
	Last modified by j.finn: 21-Mar-2026
	Program prints an array two ways.
 */
	
public class IterArray {
	public static final int MAX = 100;
	
	public static void printArray1(int [] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}
	
	public static void printArray2(int [] a) {
		for (int item: a)
			System.out.print(item + " ");
		System.out.println();
	}
	
    public static void main(String[] args) {
		int [] a = {3, 1, 4, 1, 5, 9, 2, 7};
		System.out.println("Print array two ways");
		printArray1(a);
		printArray2(a);
		
		System.out.println("Wonder no longer about the argument to main!");
		for (int i = 0; i < args.length; i++)
			System.out.print(args[i] + " ");
		System.out.println();
	}
}
