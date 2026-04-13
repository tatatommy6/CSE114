// this has an error
public class mid1 {
    public static int randomdice() {
        int dice = (int)(Math.random() * (6 - 1 + 1)) + 1;
        int sum = 0;
        for(int i = 0;i < 2;i++){
            sum += dice;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result = randomdice();
        System.out.println("The sum of two dice rolls is: " + result);
    }
}