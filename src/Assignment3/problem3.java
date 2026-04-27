// Minkyeol kim

public class problem3 {
    public static long expon(long base, long exp){
        // The reason using long type instead of int type is that the result of 
        // base^exp can be very large, especially when exp is large.

        // Base case
        // Any number raised to the power if 0 is 1.
        if(exp == 0){
            return 1;
        }
        // Recursive
        // Compute base^(exp / 2) first and store it to avoid duplicate computation.

        // So i used long type for half because the result of base^(exp/2) can also be very large.
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
