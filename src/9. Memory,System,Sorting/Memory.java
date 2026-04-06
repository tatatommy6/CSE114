/*
	Memory.java
	Last modified by j.finn: 4-Apr-2026
	Illustrate Java memory model
 */

public class Memory 
{
    /* 
		static variables created before main() called,
		exist no matter what function is called
     */
    public static int balance = 0;
    
	public static String msg;
	
    public static void deposit (int amount) 
    {
		balance = balance + amount;
    }

    public static void withdraw (int amount) 
    {
		balance = balance - amount;
    }

	/*
		The variable s is a reference created when makeMsg is called
		and destroyed when makeMsg returns.
		The string message is allocated from the heap and exists
		until it is no longer used by the program (there is no reference to it).
		The reference value s is returned by function and is assigned
		to the static variable msg.
		s and msg both refer to the same String object.
		Even though the variable s is destroyed when this function returns,
		its value has been preserved.
	 */
	public static String makeMsg()
	{
		String s = new String("I bring peace to all mankind.");
		return s;
	}
	
    public static void main(String[] args) 
    {
		System.out.println("Initial balance: " + balance);
		deposit(100);
		System.out.println("After deposit of 100: " + balance);
		withdraw(20);
		System.out.println("Afeter withdrawal of 20: " + balance);
		
		msg = makeMsg();
		System.out.println("\nThe message is: " + msg);
    }
}
