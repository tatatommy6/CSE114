// Minkyeol Kim
/*
 * InteractiveContacts.java
 * Text-based user interface for Contacts.
 * Extra credit for CSE 114 Assignment 6.
 */

import java.util.Scanner;

public class InteractiveContacts {
	private static final String DEFAULT_FILE = "JFContacts.txt";

	public static void main(String[] args) {
		String filename;
		Contacts contacts;
		Scanner s;
		String command;
		boolean done;

		if (args.length > 0)
			filename = args[0];
		else
			filename = DEFAULT_FILE;

		contacts = new Contacts(filename);
		s = new Scanner(System.in);
		done = false;

		System.out.println("Contacts loaded from " + filename);
		printMenu();

		while (!done) {
			System.out.print("Command?: ");
			command = s.nextLine().toUpperCase();

			if (command.length() == 0)
				continue;

			switch (command.charAt(0)) {
				case 'N':
					addContact(contacts, s);
					break;
				case 'D':
					deleteContact(contacts, s);
					break;
				case 'L':
					lookupContact(contacts, s);
					break;
				case 'E':
					updateEmail(contacts, s);
					break;
				case 'P':
					updatePhone(contacts, s);
					break;
				case 'A':
					updateAddress(contacts, s);
					break;
				case 'S':
					saveContacts(contacts);
					break;
				case 'H':
					printMenu();
					break;
				case 'Q':
					done = true;
					System.out.println("Goodbye");
					break;
				default:
					System.out.println("Unknown command. Enter H to print the menu again.");
			}
		}

		s.close();
	}

	private static void printMenu() {
		System.out.println("Enter command from menu:");
		System.out.println("N Add new contact");
		System.out.println("D Delete a contact");
		System.out.println("L Lookup a contact by name");
		System.out.println("E Update a contact email");
		System.out.println("P Update a contact phone");
		System.out.println("A Update a contact address");
		System.out.println("S Save contacts to file");
		System.out.println("H Print this menu");
		System.out.println("Q Quit this program");
	}

	private static void addContact(Contacts contacts, Scanner s) {
		String name;
		String surname;
		String email;
		String phone;
		String address;
		Contact c;

		System.out.print("First name? ");
		name = s.nextLine();
		System.out.print("Surname? ");
		surname = s.nextLine();

		if (name.length() == 0 || surname.length() == 0) {
			System.out.println("First name and surname are required.");
			return;
		}

		c = new Contact(name, surname);

		System.out.print("Email (enter Return to skip) ? ");
		email = s.nextLine();
		if (email.length() > 0)
			c.setEmail(email);

		System.out.print("Phone (enter Return to skip) ? ");
		phone = s.nextLine();
		if (phone.length() > 0)
			c.setPhone(phone);

		System.out.print("Address (enter Return to skip) ? ");
		address = s.nextLine();
		if (address.length() > 0)
			c.setAddress(address);

		contacts.add(c);
		System.out.println("Contact added");
	}

	private static void deleteContact(Contacts contacts, Scanner s) {
		Contact c;

		c = findContact(contacts, s);
		if (c == null) {
			System.out.println("Contact not found");
			return;
		}

		if (contacts.delete(c))
			System.out.println("Contact deleted");
		else
			System.out.println("Contact not found");
	}

	private static void lookupContact(Contacts contacts, Scanner s) {
		Contact c;

		c = findContact(contacts, s);
		if (c == null)
			System.out.println("Contact not found");
		else
			System.out.println(c);
	}

	private static void updateEmail(Contacts contacts, Scanner s) {
		Contact c;
		String email;

		c = findContact(contacts, s);
		if (c == null) {
			System.out.println("Contact not found");
			return;
		}

		System.out.print("New email? ");
		email = s.nextLine();
		c.setEmail(email);
		System.out.println("Email updated");
	}

	private static void updatePhone(Contacts contacts, Scanner s) {
		Contact c;
		String phone;

		c = findContact(contacts, s);
		if (c == null) {
			System.out.println("Contact not found");
			return;
		}

		System.out.print("New phone? ");
		phone = s.nextLine();
		c.setPhone(phone);
		System.out.println("Phone updated");
	}

	private static void updateAddress(Contacts contacts, Scanner s) {
		Contact c;
		String address;

		c = findContact(contacts, s);
		if (c == null) {
			System.out.println("Contact not found");
			return;
		}

		System.out.print("New address? ");
		address = s.nextLine();
		c.setAddress(address);
		System.out.println("Address updated");
	}

	private static Contact findContact(Contacts contacts, Scanner s) {
		String name;
		String surname;

		System.out.print("First name? ");
		name = s.nextLine();
		System.out.print("Surname? ");
		surname = s.nextLine();

		return contacts.lookup(name, surname);
	}

	private static void saveContacts(Contacts contacts) {
		if (contacts.save())
			System.out.println("Contacts saved successfully");
		else
			System.out.println("Save failed");
	}
}