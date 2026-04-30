/* This program will crash */

public class CrashMe {
	public static int count = 0;
	public static void main(String [] args) {
		count++;
		System.out.println("Count = " + count);
		main(args); 
	}
}
