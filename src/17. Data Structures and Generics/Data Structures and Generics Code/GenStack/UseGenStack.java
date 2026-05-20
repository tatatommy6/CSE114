/*
 * UseGenStack.java
 * Last modified by J.Finn: 17-May-2026
 * Demo generic stack
 */

public class UseGenStack
{
	public static void demoInt(GenStack<Integer> s)
	{
		int i;
		s.push(10);					// push 10 onto s
		s.push(20);
		s.push(30);
		System.out.println("Push 10, 20, 30, size = " + s.size());
		i = s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		i = s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		s.push(100);
		System.out.println("Push 100, size = " + s.size());
		i = s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
		i = s.pop();
		System.out.println("Pop " + i + ", size = " + s.size());
	}

	public static void demoString(GenStack<String> s)
	{
		String str;
		s.push("I");					// push 10 onto s
		s.push("Love");
		s.push("You");
		System.out.println("Push I, Love, You, size = " + s.size());
		str = s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
		str = s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
		s.push("Desdemona");
		System.out.println("Push Desdemona, size = " + s.size());
		str = s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
		str = s.pop();
		System.out.println("Pop " + str + ", size = " + s.size());
	}
	
	public static void main(String args[])
	{
		GenStack<Integer> s = new GenStackResizable<Integer>();	
		GenStack<String> t = new GenStackResizable<String>();	
		demoInt(s);
		System.out.println();
		demoString(t);
	}
};
