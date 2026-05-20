/*
 * Contact.java
 * Last modified by J.Finn: 10-May-2026
 * Class represents a contact entry in a contacts list
 * Required fields: name, surname
 * Optional fields: email, phone, address
 */

public class Contact
{
	private String name;		// first name
	private String surname;		// surname
	private String email;		// email address
	private String phone;		// phone number
	private String address;		// address

	/*
		Contact will always have name and surname.
		Other members may be null
	 */
	public Contact(String fname, String sname)
	{
		name = fname;
		surname = sname;
	}
	
	// return name
	public String getName()
	{
		return name;
	}
	
	public String getSurname()
	{
		return surname;
	}
	
	// return name in form "surname name"
	public String getFullName()
	{
		return surname + " " + name;
	}
	
	// Change the name. Sometimes people change their name
	public void setName(String fname, String sname)
	{
		name = fname;
		surname = sname;
	}
	
	// return email
	public String getEmail()
	{
		return email;
	}
	
	// set email
	public void setEmail(String em)
	{
		email = em;
	}
	
	// return phone
	public String getPhone()
	{
		return phone;
	}
	
	// set phone
	public void setPhone(String p)
	{
		phone = p;
	}
	
	// return address
	public String getAddress()
	{
		return address;
	}
	
	// set address
	public void setAddress(String a)
	{
		address = a;
	}
	
	/* We will say two contacts are the same if they have the same name */
	public boolean equals (Object o)
	{
		if (!(o instanceof Contact))
			return false;
		Contact c = (Contact) o;
		return c.name.equals(name) && c.surname.equals(surname);
	}

	/* return String representation suitable for printing */
	public String toString()
	{
		String result = surname + ", " + name;
		if (email != null)
			result += "\n\tEmail: " + email;
		if (phone != null)
			result += "\n\tPhone: " + phone;
		if (address != null)
			result += "\n\tAddress: " + address;
		return result;
	}
}
