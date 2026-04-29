/* 
	Benchmark.java
	Last modified by j.finn: 4-April 2026
	How to test running time.
 */

public class Benchmark {
	/* Does nothing useful, just runs for a bit */
	public static void doNothing() {
		@SuppressWarnings("unused")
		int x;
		for (int i = 0; i < 10000; i++)
			x = i - 1;
	}

	/* 
		call doNothing() count times
		return: total execution time in milliseconds
	 */
    public static long repeat (long count) {
        long start = System.currentTimeMillis(); // get the current time in milliseconds
		for (long i = 0; i < count; i++)
            doNothing();
        long finish = System.currentTimeMillis(); // get the current time again after the loop
        return finish - start; // Subtract finish time from start time to get the total execution time
    }

	/*
		Read long count from command line
		do nothing much that many times.
		report how long it took in millisecons
	 */
    public static void main (String[] args) {
        if (args.length < 1) {
			System.out.println("Usage: java Benchmark.java count");
			return;
        }

		// args[0] is the first command line argument, which should be the count of how many times to call doNothing().
        long count = Long.parseLong(args[0]); // parseLong() -> converts string to long type.
        long time = repeat(count);

        System.out.println(count + " calls to doNothing in " + time + " milliseconds");
    }
}
