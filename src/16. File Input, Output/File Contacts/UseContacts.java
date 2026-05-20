/*
 * UseContacts.java
 * Last modified by J.Finn: 10-May-2026
 */

public class UseContacts
{
	public static void main(String args[])
	{
		// data to initialize contacts
		String [] names = {"James", "Noam", "Patrick", "Tony", "Cameron"};
		String [] surnames = {"Finn", "Chomsky", "Stickles", "Rice", "Winter"};
		
		Contacts c = new Contacts("JFContacts.txt");
		int i;
		for (i = 0; i < names.length; i++)
			c.add(new Contact(names[i], surnames[i]));
			
		// update some contact info
		Contact j = c.lookup("James", "Finn");
		if (j != null)
		{
			j.setAddress("Computer Science Dept, SUNY Korea");
			j.setEmail("james.finn@sunykorea.ac.kr");
		}
		j = c.lookup("Patrick", "Stickles");
		if (j != null)
		{
			j.setAddress("Brooklyn, NY");
			j.setPhone("(718) 555-1212");
		}
		j = c.lookup("Tony", "Rice");
		if (j != null)
			j.setAddress("Guitar Heaven");
		
		if(c.save())
			System.out.println("Successful save");
		else
			System.out.println("Save failed");
		
		// new session, should read saved file
		c = new Contacts("JFContacts.txt");
		// print contacts
		for (i = 0; i < c.length(); i++)
			System.out.println(c.get(i) + "\n");
		j = c.lookup("Patrick", "Stickles");
		c.delete(j);
		j = c.lookup("Tony", "Rice");
		c.delete(j);
		System.out.println("After deleting Paddy Stacks and Tony Rice");
		for (i = 0; i < c.length(); i++)
			System.out.println(c.get(i) + "\n");

			
	}
}
