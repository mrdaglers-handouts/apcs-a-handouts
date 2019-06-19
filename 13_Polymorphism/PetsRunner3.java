/** This shows that a:
 *  - subclasses CAN be coppied into superclass.
 *  - superclass CANNOT be coppied into one of its subclasses.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class PetsRunner3
{
   public static void main(String[] args)
   {
      Pet pet1 = new Pet();
      Pet pet2 = new Pet();
      Cat2 cat = new Cat2();

      System.out.println(pet1);
      pet2 = cat;                 // O.K. No methods or fields are lost.
      System.out.println(pet2);

      cat = pet1;                // Error: methods and/or fields can be lost. 
   }
}
