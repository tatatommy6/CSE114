// Minkyeol Kim

public class Test {
    public static void main(String[] args) {
        System.out.println("=== ContactsEZ Database Test ===");
        
        ContactsEZ db = new ContactsEZ();

        // 연락처 생성 및 정보 추가
        ContactEZ c1 = new ContactEZ("James", "Finn");
        c1.setEmail("james.finn@sunykorea.ac.kr");
        c1.setPhone("010-1111-2222");

        ContactEZ c2 = new ContactEZ("John", "Doe");
        c2.setAddress("Incheon, South Korea");
        c2.setEmail("john.doe@gmail.com");

        ContactEZ c3 = new ContactEZ("Jane", "Doe");
        c3.setPhone("010-3333-4444");
        c3.setEmail("jane.finn@gmail.com");

        // DB에 연락처 추가
        db.add(c1);
        db.add(c2);
        db.add(c3);

        // 1. lookup(String info) 테스트
        System.out.println("\n[Lookup Test 1] Searching for 'Finn':");
        printArray(db.lookup("Finn"));

        System.out.println("\n[Lookup Test 2] Searching for 'gmail':");
        printArray(db.lookup("gmail"));

        System.out.println("\n[Lookup Test 3] Searching for '010':");
        printArray(db.lookup("010"));

        System.out.println("\n[Lookup Test 4] Searching for 'Seoul' (Should be null):");
        printArray(db.lookup("Seoul"));

        // 2. equals() 테스트
        System.out.println("\n=== ContactEZ equals() Test ===");
        ContactEZ c4 = new ContactEZ("James", "Finn");
        c4.setEmail("james.finn@sunykorea.ac.kr");
        c4.setPhone("010-1111-2222");

        System.out.println("c1 equals c4 (same details)? " + c1.equals(c4));

        // c4에 주소 정보를 추가하여 다르게 만듦
        c4.setAddress("Songdo");
        System.out.println("c1 equals c4 (different details)? " + c1.equals(c4));
    }

    // 결과를 깔끔하게 출력하기 위한 헬퍼 메서드
    public static void printArray(ContactEZ[] results) {
        if (results == null) {
            System.out.println(" -> No matches found.");
        } else {
            for (int i = 0; i < results.length; i++) {
                System.out.println(" -> " + results[i].getName());
            }
        }
    }
}