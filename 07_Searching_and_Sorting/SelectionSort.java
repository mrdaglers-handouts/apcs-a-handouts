/** This is where you are going to type up the Java code for the
 * pseudocode that you are going to get from the teacher.
 *
 * @author Mr. Dagler
 * @author
 */

import java.lang.Math;

class SelectionSort
{
   public static void main(String[] args)
   {
      final int N = 30;
      int[] vals = new int[N];

      for(int i=0; i<vals.length; i++)
         vals[i] = (int)(1000*Math.random()+1);

      System.out.println("Here are the values before they are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

      selectionSort(vals);

      System.out.println("Here are the values after they are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

   }

   static void selectionSort(int[] A)
   {
      // Use the pseudocode from the teacher's handout to write this
      // method.
   }

   static void swap(int[] A, int a, int b)
   {
      // The teacher will help with this method.
   }
}
