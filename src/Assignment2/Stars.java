import java.util.Scanner;
public class Stars{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // declare a scanner to read input
        System.out.print("Enter a positive integer: "); 
        int num = s.nextInt(); // read the input number from user

        // I used a double for loop to print the stars.
        // The reason why I used a double loop is because we need to print a 2 dimension of stars.
        // The outer loop(i) is for the number of lines, and the inner loop(j) is for the numbers of stars in each line.
        // The number of stars in each line is equal to the line number(i + 1).
        for(int i = 0; i < num ; i++){
            for(int j = 0 ; j < i + 1 ; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        s.close();
    }
}