/*
 * UseNotAPoint.java
 * Last modified by J.Finn: 23-Apr-2026
 * Use NotAPoint class
 */
public class UseNotAPoint
{

   public static void main(String[] args)
   {
      Point p = new NotAPoint(3, 5);
      System.out.println(p);
      System.out.println("x = " + p.getX() + ", y = " + p.getY());
      System.out.println("p.equals(p) ? " + p.equals(p));
   }
}
