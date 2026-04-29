/* 
	Environment.java
	Last modified by j.finn: 4-Apr-2026
	Print runtime environment
	This uses language features we haven't studied
	but it's good to see the output.
 */

import java.util.Map;
import java.util.Set;

public class Environment {
    public static void main (String[] args) {
		/*
			getenv returns a Map containing the runtime
			environment. A Map is a set of
			key/value pairs. Here the key is some system property
			and the value is the current value of that property.
			Both key and value are strings. You can look up
			a particular value from its key or you can get
			all of the keys as a set, then iterate over that
			set using syntax similar to how we can iterate
			over the elements in an array.
		 */
		Map<String,String> m = System.getenv();
		
		System.out.println("The user is " + m.get("USER"));

		System.out.println("\nThe whole environment:");
		Set<String> keys = m.keySet(); // Set of all environment property names
		for (String s: keys)		// iterate over all properties
			System.out.println(s + " : " + m.get(s));	// and print the values
    }
}
