/*
 * UseColorPoint.java
 * Last modified by J.Finn: 23-Apr-2026
 * Class to test ColorPoint
 */
public class UseColorPoint
{
   public static void printPoint(Point p)
   {
      System.out.print(p);
   }
   
   public static void main(String[] args)
   {
      Point p = new Point(3, 5);
      printPoint(p);
      System.out.println();
      ColorPoint cp = new ColorPoint(1, 2, Color.RED);
      printPoint(cp);
      System.out.println();
      Point p2 = new ColorPoint(4, 0, Color.BLUE);
      printPoint(p2);
      System.out.println();
   }   
}
