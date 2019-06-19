/** This illustrates polymorphism.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class PetsRunner1
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      Object obj;
      int userInput;

      System.out.println("What type of pet do you like? Enter:");
      System.out.println("  1: for Dogs");
      System.out.println("  2: for Cats");
      System.out.println("  3: for Fish");
      userInput = in.nextInt();

      if(userInput == 1)
         obj = new Dog1();
      else if(userInput == 2)
         obj = new Cat1();
      else if(userInput == 3)
         obj = new Fish1();
      else
      {
         obj = new Object();
         System.out.println("Error, bad input!!!");
         System.exit(1);
      }

      System.out.println(obj);

   }
}
