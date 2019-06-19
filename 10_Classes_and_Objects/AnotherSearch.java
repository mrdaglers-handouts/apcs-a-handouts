/** Answer the following questions in order:
 * 1) Explain what the following code does.
 * 2) What does the following code output?
 * 3) Run the program to check your answer in 2.
 * 4) What would happen if you switch (pos < arr.length) and 
 *    (arr[pos] != val) on line 21?
 */

class AnotherSearch
{
   public static void main(String[] args)
   {
      int[] vals = {4, 1, 9, 5, 11, 3, 10, 15};
      System.out.println(anotherSearch(vals, 20));
   }

   public static int anotherSearch(int[] arr, int val)
   {
      int pos = 0;

      while((pos < arr.length) && (arr[pos] != val))
         pos++;

      return pos;
   }
}
