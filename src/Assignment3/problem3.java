package Assignment3;
//Minkyeol kim

public class problem3 {
    public static long expon(long base, long exp){
        // Base case
        // Any number raised to the power if 0 is 1.
        if(exp == 0){
            return 1;
        }
        // Recursive
        // Compute base^(exp / 2) first and store it to avoid duplicate computation.
        long half = expon(base, exp / 2);
        
        // if exponent is even:
        // base^exp = (base^(exp/2))^2
        if(exp % 2 == 0){
            return half * half;
        }
        // if exponnent is odd:
        // base^exp = (base^(exp/2))^2 * base
        else{
            return half * half * base;
        }
    }
    public static void main(String[] args) {
        System.out.println(expon(2, 10));
        System.out.println(expon(3, 5));
    }
}
