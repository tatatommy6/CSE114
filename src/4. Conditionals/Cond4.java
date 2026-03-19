/* 
	Cond4.java
	Last modified by j.finn: 17-Mar-2026
	
	Functions vs operators
	
	With functions, the arguments can be any expression
	of the correct type.
	
	With operators, the operands can be any expression
	of the correct type.
	
	Functions and operators behave a little differently.
	In a function call, every argument expression will be
	evaluated and their values will be used to initialize
	the function's parameters.

		f(g(), h());
		g() and h() will both be called.
		The are called in left to right order: g() first, then h().
		Their return values will be passed as arguments to f		
	
	With operators, the operator controls whether and in
	what order the operand expressions are evaluated.
	Not all operand expressions are necessarily evaluated:
	
		g() OP h()
		g() and h() may not both be called
		The order in which they will be called is specified
		in the operator's semantics.
	
	E1 && E2 evaluates E1 then evaluates E2 only if E1 is true.
	E1 || E2 evaluates E1 then evaluates E2 only if E1 is false.
	
	Final note on logical operators. If A and B are boolean values, then
		!(A && B) equals !A || !B
		!(A || B) equals !A && !B
 */


public class Cond4
{
	// prints a message and returns true
	public static boolean truePrint()
	{
		System.out.println("I am true");
		return true;
	}

	// prints a message and returns false
	public static boolean falsePrint()
	{
		System.out.println("I am false");
		return false;
	}

	// like && but a function
	public static boolean andFunction(boolean a, boolean b)
	{
		return a && b;
	}
	
	// like || but a function
	public static boolean orFunction(boolean a, boolean b)
	{
		return a || b;
	}
	
    public static void main (String[] args) 
    {
		System.out.println("Test (false && true) with function");
		System.out.println(andFunction(falsePrint(), truePrint()));
		System.out.println();
		System.out.println("Test (false && true) with operator");
		System.out.println(falsePrint() && truePrint());
		System.out.println();
		System.out.println("Test (true || false) with function");
		System.out.println(orFunction(truePrint(), falsePrint()));
		System.out.println();
		System.out.println("Test (true || false) with operator");
		System.out.println(truePrint() || falsePrint());   	
    }
}
