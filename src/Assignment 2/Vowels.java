import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // declare a scanner to read input

        System.out.print("Enter text, type <ctrl>+d to exit:");

        while (true) {
            if (!s.hasNextLine()) break; //EOF

            String line = s.nextLine(); // input line from user

            // String is immutable, so we use StringBuilder to build the result.
            // But StringBuilder is mutable, so we can append characters easily.
            // When we use String, we have to create a new string every time when we append a character.
            // Which is inefficient and slows down the program at runtime.
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);

                // If the character is not a vowel, we append it to the result.
                if (!(ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U')) {
                    result.append(ch);
                }
            }
            // We use .replaceAll() to replace multiple spaces with a single space
            // And we use .trim() to remove leading and trailing spaces. (whitespace)
            String output = result.toString().replaceAll(" ", " ").trim(); // this line is error. It replaces " " to " " so it does nothing
            // the correct line should be ~.replaceAll(" +", " ").trim();

            System.out.println(output);
        }
        s.close();
    }
}