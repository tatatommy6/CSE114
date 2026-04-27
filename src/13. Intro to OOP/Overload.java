/*
 * Overload.java
 * Last modified by J.Finn: 23-Apr-2026
 * Example of Overloading vs. Overriding
 */
public class Overload
{
   private String msg;
   
   public Overload(String initial)
   {
      msg = initial;
   }
   
   // print is overloaded
   public void print() { System.out.println(msg); }
   public void print(String s) { System.out.println(s); }
   
   public static void main(String[] args)
   {
      Overload o = new Overload("Hello");
      o.print();				// No argument, prints "Hello"
      o.print("Goodbye");		// String argument, prints "Goodbye"
   }
}
