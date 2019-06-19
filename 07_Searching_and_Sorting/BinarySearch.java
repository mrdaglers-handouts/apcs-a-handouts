/** This is where you are going to type up the Java code for the pseudocode
 * that you are going to get from the video.
*
* @author Mr. Dagler
*/

class BinarySearch
{
   public static void main(String[] args)
   {
      int index, valueToFind;
      int[] vals = {1, 4, 11, 14, 16, 25, 30, 33, 34, 37, 41, 42, 51,
         52, 57, 61, 62, 63, 64, 74, 75, 77, 80, 82, 84, 85, 90, 91, 98,
         100};

         valueToFind = 85;
         index = binarySearch(vals, valueToFind);
         if(index == -1)
         {
            System.out.println("I could not find " + valueToFind + ".");
         }
         else
         {
            System.out.println("I found " + valueToFind + " at index ");
            System.out.println(index + ".");
         }

         valueToFind = 7;
         index = binarySearch(vals, valueToFind);
         if(index == -1)
         {
            System.out.println("I could not find " + valueToFind + ".");
         }
         else
         {
            System.out.println("I found " + valueToFind + " at index ");
            System.out.println(index + ".");
         }

      }

      static int binarySearch(int[] A, int target)
      {
         // Use the pseudocode from the video 'XoaX Search' to write this
         // method.
      }
   }
