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




// public class Articles {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter text, type <ctrl>+d to exit:");

//         while (s.hasNextLine()) {
//             String line = s.nextLine();
//             String result = "";

//             int start = 0;

//             while (start < line.length()) {
//                 int spaceIndex = line.indexOf(" ", start);

//                 String word;
//                 if (spaceIndex == -1) {
//                     word = line.substring(start);
//                     start = line.length();
//                 } else {
//                     word = line.substring(start, spaceIndex);
//                     start = spaceIndex + 1;
//                 }

//                 String lower = word.toLowerCase();

//                 if (!lower.equals("a") && !lower.equals("an") && !lower.equals("the")) {
//                     if (!result.equals("")) {
//                         result = result + " ";
//                     }
//                     result = result + word;
//                 }
//             }

//             System.out.println(result);
//         }

//         s.close();
//     }
// }