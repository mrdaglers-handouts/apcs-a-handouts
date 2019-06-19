/** This illustrates polymorphism.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class PetsRunner2
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Pet pet;
      int userInput;

      System.out.println("What type of pet do you like? Enter:");
      System.out.println("  1: for Dogs");
      System.out.println("  2: for Cats");
      System.out.println("  3: for Fish");
      userInput = in.nextInt();

      if(userInput == 1)
         pet = new Dog2();
      else if(userInput == 2)
         pet = new Cat2();
      else if(userInput == 3)
         pet = new Fish2();
      else
      {
         pet = new Pet();
         System.out.println("Error, bad input!!!");
         System.exit(1);
      }

      System.out.println(pet);

   }
}
