/*
	Random numbers
	Last modified by j.finn: 21-Mar-2026
	Demo how to use random numbers
 */
 
import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) 
    {
		/*
		The math library has a random() function that returns
		a random number that is greater than or equal to 0
		and less than 1.
		
		Ranges of this form are typically expressed as [0..1)
		The left square bracket [ means that 0 is included in the range.
		The right open parenthesis ) means that 1 is not included
		in the range.
		
		These are "pseudo-random" numbers. They pass statistical
		tests for randomness, but they are not really "random".
    	 */

		double r = Math.random();
		System.out.println("Random positive real less than 1: " + r);
		
		/*
			You can convert r to an integer in any range [a..b]
			by this formula:
    			a + (int)(r * (b-a+1))
			
			Alternatively, java.util has a Random class.
			You have to create a random number generator.
			This will be more understandable once we cover Java classes.
			Once created, the generator has several methods for 
			generating random numbers in a range.
			In particular, nextInt(n) returns a random int in
				the range [0..n)
    	 */	

		Random randgen = new Random(); // you have to do this
		
		/*
			If you create randgen by passing a long as a "Seed",
			it will generate the same sequence of random numbers
			every time. Try it. This lets you write programs that
			use random numbers but still have reproducible behavior.
		 */
		 //	long seed = 10599999;
		 //	Random randgen = new Random(seed);

		System.out.println("A random integer: " + randgen.nextInt());
		System.out.println("[0..9]: " + randgen.nextInt(10));
		System.out.println("[1..10]: " + (randgen.nextInt(10) + 1));
		System.out.println("[-10..9]: " + (randgen.nextInt(20) - 10));
		System.out.println("Double [0.0..1.0): " + randgen.nextDouble());

		for (int i = 0; i < 10; i++) 
			System.out.println("[1..10]: " + (randgen.nextInt(10) + 1));
    }
}
