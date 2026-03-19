/*
	Cond0.java
	Last modified by j.finn: 17-Mar-2026
	
	Introduce conditional statements
	
	Relationals :
	==  !=  >   <   >=   <=
	These work for primitive types and evaluate to true or false.
	
	For objects: a == b tests whether a and b are the SAME OBJECT
		It does not test whether two objects have the SAME VALUE
	For objects, it's up to the class to decide
	how its instances compare.
	Most classes that represent values let you test 
		for equal value with a.equals(b)
	
	Syntax and semantics of conditional statements:
	Let S1, S2, S3 ... be statements
	Let C be any condition, meaning an expression with a boolean value
	
	Java if statement:
	
	Syntax:
		if (C)
			S1;
		// whatever follows the if statement goes here
	
	Semantics:
		C is evaluated.
		If the value of C is true, then
			S1 is executed, followed by whatever follows the if statement
		If the value of C is false, then S1 is not executed and control
			passes immediately to whatever follows the if statement   
			
	Java if statement with else part:
	
	Syntax:
		if (C)
			S1;
		else
			S2;
		// whatever follows the if/else statement goes here
			
	Semantics:   
		C is evaluated.
		If the value of C is true, then
			S1 is executed, followed by whatever follows the if statement.
			S2 is not executed.
		If the value of C is false, then 
			S2 is executed, followed by whatever follows the if statement.
			S1 is not executed.

 */


public class Cond0 
{
    public static void main(String[] args) 
    {
		int num = 101;
	
		if (num > 100)
			System.out.println(num + " is greater than 100");
		
	
		String name = "Alice";
	
		if (name.equals("Alice"))
			System.out.println("The name is Alice");
		else
			System.out.println("The name is not Alice");	    
	
		num = 2000;
	
		if (num < 1000)
			System.out.println(num + " is less than 1000");
		else if (num <= 2500)
			System.out.println(num + " is between 1000 and 2500");
		else
			System.out.println(num + " is greater than 2500");	 			
		
    }
}
