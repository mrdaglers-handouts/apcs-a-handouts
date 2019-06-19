/**
 * File Name: ForNot.java
 *
 * This deminstrates the foreach loop.
 *
 * @author Mr. Dagler
 */

import java.lang.Math;

class ForNot
{
   public static void main(String[] args)
   {
      final int N = 15;
      int[] vals = new int[N];

      for(int i=0; i<vals.length; i++) // The foreach will not modify 
         vals[i] = randomInt(-20, 20); // values.

      System.out.println("Out 1:");
      for(int n : vals)
         System.out.print(n + " ");
      System.out.println();

      for(int n : vals) // This does nothing :(
         n *= 2;

      System.out.println("Out 2:");
      for(int n : vals)
         System.out.print(n + " ");
      System.out.println();

      for(int i=0; i<vals.length; i++)
         vals[i] *= 2;

      System.out.println("Out 3:");
      for(int n : vals)
            System.out.print(n + " ");
      System.out.println();

      System.out.println("Out 4:");
      for(int i=1; i<vals.length; i+=2)    // Cannot do this with a 
         System.out.print(vals[i] + " ");  // foreach loop.
      System.out.println();

   }

   static int randomInt(int a, int b)
   {
      return (int)((b-a+1)*Math.random()+b);
   }
}
