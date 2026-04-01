package Assignment2;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter text, type <ctrl>+d to exit:");

        while (true) {
            if (!s.hasNextLine()) break;

            String line = s.nextLine();
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {
                char ch = line.charAt(i);

                if (!(ch == 'a' || ch == 'A' ||
                    ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' ||
                    ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U')) {
                    result.append(ch);
                }
            }

            String output = result.toString().replaceAll("\\s+", " ").trim();

            System.out.println(output);
        }

        s.close();
    }
}