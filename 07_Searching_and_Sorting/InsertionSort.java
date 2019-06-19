/** This is where you are going to type up the Java code for the 
 * pseudocode that you are going to see in the video.
 *
 * @author Mr. Dagler
 */

class InsertionSort
{
   public static void main(String[] args)
   {
      final int N = 30;
      int[] vals = new int[N];

      for(int i=0; i<vals.length; i++)
         vals[i] = (int)(1000*Math.random()+1);

      System.out.println("Here are the values before thay are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

      insertionSort(vals);

      System.out.println("Here are the values after thay are sorted:");
      for(int v : vals)
         System.out.print(v + " ");
      System.out.println();

   }

   static void insertionSort(int[] A)
   {
      // Use the pseudocode from the video 'XoaX Insertion Sort' to 
      // write this method.
   }

   static void swap(int[] A, int a, int b)
   {
      // This is the same code found in SelectionSort.java.
   }

}
