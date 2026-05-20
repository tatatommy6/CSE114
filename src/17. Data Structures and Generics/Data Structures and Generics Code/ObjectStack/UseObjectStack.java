/*
 * UseObjectStack.java
 * Last modified by J.Finn: 17-May-2026
 * Demo Object stack
 */

public class UseObjectStack
{	
	public static void main(String args[])
	{
		ObjectStack s = new ObjectStackArray();	
		String str;
		int i;
		
		// push some strings
		s.push("I");					// push 10 onto s
		s.push("Love");
		s.push("You");
		System.out.println("Push I, Love, You, size = " + s.size());
		str = (String) s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
		str = (String) s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
		
		// push some ints
		s.push(10);					// push 10 onto s
		s.push(20);
		System.out.println("Push 10, 20, size = " + s.size());
		i = (int) s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		i = (int) s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		s.push(100);
		System.out.println("Push 100, size = " + s.size());
		i = (int) s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		
		str = (String) s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
	}
};
