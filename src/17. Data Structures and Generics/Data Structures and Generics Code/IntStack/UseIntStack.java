/*
 * UseIntStack.java
 * Last modified by J.Finn: 17-May-2026
 * Array implementation of stack
 */

public class UseIntStack
{
	public static void main(String args[])
	{
		// create a Stack and save reference in s
		IntStack s = new IntStackResizable();	
		s.push(10);
		s.push(20);
		s.push(30);
		System.out.println("Push 10, 20, 30, size = " + s.size());
		System.out.println("Pop " + s.pop() + ", size = " + s.size());
		System.out.println("Pop " + s.pop() + ", size = " + s.size());
		s.push(100);
		System.out.println("Push 100, size = " + s.size());
		System.out.println("Pop " + s.pop() + ", size = " + s.size());
		System.out.println("Pop " + s.pop() + ", size = " + s.size());
	}
};
