/*
 	Contacts.java
 	Last modified by J.Finn: 10-May-2026
 	Class represents contacts database
 	Can now save to file and read file
 	File format
 		for each contact, each item is one line:
 			name
 			surname
 		if email exists:
 			"email"
 			email
 		if phone exists:
 			"phone"
 			phone
 		if address exists:
 			"address"
 			address
 		to mark end of contact:
 			*****
 	Other changes:
 		add checks for duplicates, replaces old entry instead of adding dup
 		added iLookup, delete methods
 		added Constructor that takes filename and loads file if it exists,
 			save will save to that file.
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Contacts
{
	public static final int MAX = 1000;	// maximum number of contacts.
	public static final String SEPARATOR = "*****";
	private Contact [] contacts;	// the contacts
	private int length;				// how many contacts we have
	private String fname;			// filename for storage
	
	// create empty Contacts book
	public Contacts()
	{
		contacts = new Contact[MAX];
		length = 0;
	}
	
	// create Contacts associated wtih filename
	public Contacts(String filename)
	{
		this();		// constructor chaining
		fname = filename;
		load();
	}
	
	/*
		in is successfully opened contacts file.
		Read the file into the contacts array.
		Return: true on succcess, false on error
	 */
	private boolean readData(BufferedReader in)
	{
		Contact c;
		String name;
		String surname;
		String s;
		try
		{
			for(;;)
			{
				name = in.readLine();
				if (name == null) break;	// no more records
				surname = in.readLine();
				c = new Contact(name, surname);
				for(;;)
				{
					s = in.readLine();
					if (s.equals("email"))
					{
						s = in.readLine();
						c.setEmail(s);
					}
					else if (s.equals("phone"))
					{
						s = in.readLine();
						c.setPhone(s);
					}
					else if (s.equals("address"))
					{
						s = in.readLine();
						c.setAddress(s);
					}
					else if (!s.equals(SEPARATOR))
					{
						System.err.println("Error: file corrupt. Bad line: " + s);
						in.close();
						return false;
					}
					else break;
				}
				contacts[length++] = c;
			}
			in.close();
			return true;
		}
		catch (IOException e)
		{
			System.err.println("I/O error: " + e.getMessage());
			return false;
		}
	}
	
	/*
		load contacts from file.
		Return true if succcessful, false on error.
		If file has not yet been created, this will be an error
	 */
	public boolean load()
	{
		BufferedReader in;
		if (fname == null)
		{
			System.err.println(
				"Load Error: no file associated with this Contacts instance");
			return false;
		}
		
		try 
		{
			in = new BufferedReader(new FileReader(fname));
		}
		catch (IOException e)
		{
			return false;
		}
		return readData(in);
	}
	
	/*
		save contacts to file
		Return: true on success, false on failure.
	 */
	boolean save()
	{
		PrintWriter out;
		int i;
		Contact c;
		try
		{
			out = new PrintWriter(new BufferedWriter(new FileWriter(fname)));
			for (i = 0; i < length; i++)
			{
				c = contacts[i];
				out.println(c.getName());
				out.println(c.getSurname());
				if (c.getEmail() != null)
				{
					out.println("email");
					out.println(c.getEmail());
				}
				if (c.getPhone() != null)
				{
					out.println("phone");
					out.println(c.getPhone());
				}
				if (c.getAddress() != null)
				{
					out.println("address");
					out.println(c.getAddress());
				}
				out.println(SEPARATOR);
			}
			out.close();
		}
		catch (IOException e)
		{
			System.err.println("Save error: " + e.getMessage());
			return false;
		}
		return true;
	}
	
	// return size of contact list
	public int length()
	{
		return length;
	}

	/*
		add contact.
		if there is an existing contact with the same name,
		it is replaced by this new contact info.
	 */
	public void add(Contact c)
	{
		int i = iLookup(c);
		if (i == -1)
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
		else contacts[i] = c;
	}
	
	/*
		delete contact if it exists.
		return true if a delete occured
	 */
	public boolean delete(Contact c)
	{
		int i = iLookup(c);
		if (i == -1) return false;
		if (i != length-1) 
			contacts[i] = contacts[length-1];
		length--;
		return true;
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
	
	/* return index of contact in array, or -1 if not found */
	public int iLookup(Contact c)
	{
		for (int i = 0; i < length; i++)
			if (contacts[i].equals(c)) return i;
		return -1;
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
