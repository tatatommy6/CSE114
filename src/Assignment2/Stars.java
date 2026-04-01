package Assignment2;
import java.util.Scanner;
public class Stars{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = s.nextInt();
        for(int i = 0; i < num ; i++){
            for(int j = 0 ; j < i + 1 ; j++){
                System.out.print("*");
                
            }
            System.out.println();
        }
        s.close();
    }
}