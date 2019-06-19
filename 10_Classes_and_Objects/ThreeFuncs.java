/** Answer the following questions in order:
 * 1) Compare and contrast func1, func2, and func3.
 * 2) Will the three functions always return the same answer?
 */

import java.lang.Math;

class ThreeFunctions
{
   public static void main(String[] args)
   {
      int val1 = (int)(100*Math.random()+1);
      int val2 = (int)(100*Math.random()+1);
      System.out.println(val1 + ", " + val2 + ":");
      System.out.println("   " + func1(val1, val2));
      System.out.println("   " + func2(val1, val2));
      System.out.println("   " + func3(val1, val2));

   }

   public static boolean func1(int a, int b)
   {
      if (a >= 70)
         return true;
      if (a >= 50 && b >= 25)
         return true;
      return false;
   }

   public static boolean func2(int a, int b)
   {
      boolean answer = false;
      if (a >= 70)
         answer = true;
      if (a >= 50 && b >= 25)
         answer = true;
      return answer;
   }

   public static boolean func3(int a, int b)
   {
      return (a >= 70) ||
             (a >= 50 && b >= 25);
   }

}
