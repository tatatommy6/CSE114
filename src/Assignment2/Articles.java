import java.util.Scanner;

public class Articles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); //declare scanner to read user input
        System.out.print("Enter text, type <ctrl>+d to exit:");

        while (true) {
            if (!s.hasNextLine()) break; //EOF 

            String line = s.nextLine(); // input line from user
            String[] words = line.split(" ");
            StringBuilder result = new StringBuilder(); // StringBuilder to build the result without articles

            for (int i = 0; i < words.length; i++) {
                String word = words[i]; // get the current word
                String lower = word.toLowerCase(); // convert to lowercase for comparison

                // Check if the word is not an article
                if (!lower.equals("a") && !lower.equals("an") && !lower.equals("the")) {
                    if (result.length() > 0) { // Add a space before the word if it's not the first word
                        result.append(" ");
                    }
                    result.append(word); // Append the original word (with original case) to the result
                }
            }
            System.out.println(result); // Print the line without articles
        }

        s.close();
    }
}