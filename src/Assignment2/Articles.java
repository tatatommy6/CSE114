package Assignment2;
import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text, type <ctrl>+d to exit:");

        while (true) {
            if (!s.hasNextLine()) break;

            String line = s.nextLine();
            String[] words = line.split(" ");
            StringBuilder result = new StringBuilder();

            for (int i = 0; i < words.length; i++) {
                String word = words[i];
                String lower = word.toLowerCase();

                if (!lower.equals("a") && !lower.equals("an") && !lower.equals("the")) {
                    if (result.length() > 0) {
                        result.append(" ");
                    }
                    result.append(word);
                }
            }
            System.out.println(result);
        }

        s.close();
    }
}