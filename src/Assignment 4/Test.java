// Minkyeol Kim

public class Test {

    // helper method to print the result more clearly.
    public static void printArray(ContactEZ[] results) {
        if (results == null) {
            System.out.println(" -> No matches found.");
        }
        else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(" -> " + results[i].getName());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("ContactsEZ Database Test");
        
        ContactsEZ db = new ContactsEZ();

        ContactEZ a1 = new ContactEZ("Minkyeol", "Kim");
        a1.setEmail("minkyeol.kim@stonybrook.edu");
        a1.setPhone("010-1111-2222");

        ContactEZ a2 = new ContactEZ("John", "Doe");
        a2.setAddress("Incheon, South Korea");
        a2.setEmail("john.doe@gmail.com");

        ContactEZ a3 = new ContactEZ("Jane", "Doe");
        a3.setPhone("010-3333-4444");
        a3.setEmail("jane.doe@gmail.com");

        // add contacts to the database
        db.add(a1);
        db.add(a2);
        db.add(a3);

        // 1. lookup(String info) test
        System.out.println("\n[Lookup Test 1] Searching for 'Minkyeol':");
        printArray(db.lookup("Minkyeol"));

        System.out.println("\n[Lookup Test 2] Searching for 'gmail':");
        printArray(db.lookup("gmail"));

        System.out.println("\n[Lookup Test 3] Searching for '010':");
        printArray(db.lookup("010"));

        // this should return null so it will print "-> No matches found."
        System.out.println("\n[Lookup Test 4] Searching for 'Seoul':");
        printArray(db.lookup("Seoul"));

        // 2. equals() test
        System.out.println("\nContactEZ equals() Test");
        ContactEZ a4 = new ContactEZ("Minkyeol", "Kim");
        a4.setEmail("minkyeol.kim@stonybrook.edu");
        a4.setPhone("010-1111-2222");

        // a4 has the same details as a1, so the result should be true.
        System.out.println("Does a1 equals a4 (At same details)? " + a1.equals(a4));

        // add address to a4 to make it different (the result should be false)
        a4.setAddress("Songdo");
        System.out.println("Does a1 equals a4 (At different details)? " + a1.equals(a4));
    }
}