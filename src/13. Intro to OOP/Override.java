/*
 * Override.java
 * Last modified by J.Finn: 23-Apr-2026
 */

public class Override extends Overload
{
   public Override(String initial)
   {
      super(initial);
   }
   
   public void print()	// This overrides Overload.print()
   {
      System.out.println("This is from subclass Override!");
   }
   
   public void print(int x)	// This overloads print
   {
      System.out.println("X = " + x);
   }

   public static void main(String[] args)
   {
      Override test = new Override("Hello");
      test.print();			// calls override Override.print()
      test.print(22);		// calls overloaded Override.print(int)
      test.print("Fun");	// calls Overload.print(String), we did not override it
   }
}
