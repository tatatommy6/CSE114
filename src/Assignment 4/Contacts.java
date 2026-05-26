/*
 * Contacts.java
 * Last modified by J.Finn: 21-Apr-2026
 * Class represents contacts database
 */

public class Contacts
{
	public static final int MAX = 1000;	// maximum number of contacts.
	private Contact [] contacts;	// the contacts
	private int length;				// how many contacts we have
	
	// create empty Contacts book
	public Contacts()
	{
		contacts = new Contact[MAX];
		length = 0;
	}
	
	// return size of contact list
	public int length()
	{
		return length;
	}

	/*
		add contact.
		this function should check if contact is there already but doesn't
	 */
	public void add(Contact c)
	{
		if (length == MAX)
		{
			System.out.println("Can't add contact, database is full\n");
			return;
		}
		else
		{
			contacts[length] = c;
			length++;
		}
	}
	
	/*
		return contact at index i
		returns null if i is out of range
	 */
	public Contact get(int i)
	{
		if (i < 0 || i >= length) return null;
		return contacts[i];
	}
	
	/*
		return Contact with given name and surname,
		return null if no such contact
	 */
	public Contact lookup(String name, String surname)
	{
		Contact test = new Contact(name, surname);
		for (int i = 0; i < length; i++)
			if (contacts[i].equals(test))
				return contacts[i];
		return null;
	}
}
