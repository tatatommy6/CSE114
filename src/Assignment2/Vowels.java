package Assignment2;
import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter text, type <ctrl>+d to exit:");
        
        while (true) {
            if (!s.hasNextLine()) break; // stop when user presses Ctrl+D
            
            String line = s.nextLine(); // read a line of input
            String result = ""; // text without vowels
            int index = 0;

            // check each character one by one
            while (index < line.length()) {
                char ch = line.charAt(index);
                boolean isVowel = false;

                // check if the character is a vowel (case-insensitive)
                if (ch == 'a' || ch == 'A') isVowel = true;
                else if (ch == 'e' || ch == 'E') isVowel = true;
                else if (ch == 'i' || ch == 'I') isVowel = true;
                else if (ch == 'o' || ch == 'O') isVowel = true;
                else if (ch == 'u' || ch == 'U') isVowel = true;

                if (!isVowel) result += ch; // add non-vowel character to result
                
                index += 1; // move to the next character
            }
            System.out.println(result);
        }

        s.close();
    }
}
