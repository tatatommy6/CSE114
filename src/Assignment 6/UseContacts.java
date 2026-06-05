/*
 * UseContacts.java
 * Last modified by J.Finn: 10-May-2026
 */

public class UseContacts
{
	public static void main(String args[])
	{
		// data to initialize contacts
		Contacts c = new Contacts("src/Assignment 6/JFContacts.txt");
		System.out.println("Contacts loaded from file: ");

		for(int i = 0; i < c.length(); i++){
			System.out.println(c.get(i) + "\n");
		}

		System.out.println("Saving  contacts in v2.0 format...");
		if(c.save())
			System.out.println("Successful save\n");
		else
			System.out.println("Save failed\n");

		Contacts c2 = new Contacts("src/Assignment 6/JFContacts.txt");

		System.out.println("Contacts loaded again from v2.0 file:");
		for(int i = 0; i < c2.length(); i++){
			System.out.println(c2.get(i) + "\n");
		}
		Contact newContact = new Contact("Minkyeol", "Kim");
		newContact.setEmail("tatatommy6@naver.com");
		newContact.setPhone("010-4480-0180");
		c2.add(newContact);

		System.out.println("After adding a new contact:");
		for(int i = 0; i < c2.length(); i++){
			System.out.println(c2.get(i) + "\n");
		}

		Contact j = c2.lookup("Noam", "Chomsky");
		if(j != null){
			c2.delete(j);
		}

		System.out.println("After deleting Noam Chomsky:");
		for(int i = 0; i < c2.length(); i++){
			System.out.println(c2.get(i) + "\n");
		}
		c2.save();
	}
}
