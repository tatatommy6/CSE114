/*
 * Wrapper.java
 * Last modified by J.Finn: 23-Apr-2026
 * Introduce wrapper classes
 */

/*
	Primitive types like int, char, double, boolean
	are not Objects.
	
	Sometimes you want to use a primitive type where an
	object is required.
	
	Java has "wrapper" classes that are Object versions of
	the primitive types.
	
	Java will usually convert to and from these types
	automatically as needed.
	
	The String class and the wrapper classes have some
	useful static methods for conversion between strings
	and primitive values.
	
	Convert primitive p to String:
	String s = String.valueOf(p); // works for all primitives
	
	Convert String to primitive:
	int 	Integer.parseInt
	long 	Long.parseLong
	byte 	Byte.parseByte
	short 	Short.parseShort
	float 	Float.parsefloat
	double 	Double.parseDouble
	boolean	Boolean.parseBoolean
 */

public class Wrapper
{
	public static void main(String args[])
	{
		Integer x = 66; 	// automatic conversion between primitive and wrapper
		int i = x; 			// i is 66, automatic conversion
		x = i;				// automatic conversion again
		System.out.println("66? Integer x = " + x + " int i = " + i);
		
		int j = Integer.parseInt("77"); // j is 77
		System.out.println("Did we get 77? " + j);
		
		String s = String.valueOf(99.7);
		System.out.println("Did we get 99.7? " + s);
	}
}
