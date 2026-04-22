/*
 * UseContacts.java
 * Last modified by J.Finn: 21-Apr-2026
 */

public class UseContacts
{
	public static void main(String args[])
	{
		// data to initialize contacts
		String [] names = {"James", "Noam", "Cameron", "Tony"};
		String [] surnames = {"Finn", "Chomsky", "Winter", "Rice"};
		
		Contacts c = new Contacts();
		int i;
		for (i = 0; i < names.length; i++)
			c.add(new Contact(names[i], surnames[i]));
			
		// update James' info
		Contact j = c.lookup("James", "Finn");
		if (j != null)
		{
			j.setAddress("Computer Science Dept, SUNY Korea");
			j.setEmail("james.finn@sunykorea.ac.kr");
		}
		
		// print contacts
		for (i = 0; i < c.length(); i++)
			System.out.println(c.get(i) + "\n");	
	}
}
