/*
 * UseContact.java
 * Last modified by J.Finn: 21-Apr-2026
 */

public class UseContact
{
	public static void main(String args[])
	{
		Contact c = new Contact("James", "Finn");
		System.out.println("Initially:\n" + c);
		c.setEmail("james.finn@sunykorea.ac.kr");
		c.setAddress("County jail");
		System.out.println("\nContact is now\n" + c);
	}
}
