/*
 * UseIntList.java
 * Last modified by J.Finn: 17-May-2026
 * Use int list
 */

public class UseIntList
{
	public static void main(String args[])
	{
		// create a Stack and save reference in s
		IntList list = new IntLinkedList();	
		list.add(10);
		list.add(20);
		list.add(30);
		System.out.println("Should be (10 20 30), is " + list);
		list.set(2, 25);
		list.add(3, 100);
		list.remove(1);
		System.out.println("Should be (10 25 100), is " + list);
	}
};
