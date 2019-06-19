/** This takes an ArrayList of an even number of Strings and switches 
 * each pair that is next to each other; e.g.,
 * 
 *    {"A", "B", "C", "D", "E", "F"}  => {"B", "A", "D", "C", "F", "E"}
 *
 * Author: Mr. Dagler
 */

import java.util.ArrayList;

class SwitchPairsMain
{
   public static void main(String[] args)
   {
      ArrayList<String> items = new ArrayList<String>();

      items.add("four");
      items.add("score");
      items.add("and");
      items.add("seven");
      items.add("years");
      items.add("ago");

      System.out.println(items + "\n");
      switchPairs(items);
      System.out.println(items + "\n");
   }

   static void switchPairs(ArrayList<String> aList)
   {

   }
}
