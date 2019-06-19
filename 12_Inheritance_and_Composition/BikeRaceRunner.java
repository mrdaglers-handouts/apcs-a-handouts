/** This is a basic class to keep track of a bike race.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

class BikeRaceRunner
{
   public static void main(String[] args)
   {
      BikeRace bikeRace;
      Scanner in = new Scanner(System.in);
      String raceName, cyclistsName, bikeType, flag;
      double raceDist, cyclistsSpeed;
      boolean done = false;

      System.out.print("Enter the name of the bike race: ");
      raceName = in.nextLine();
      System.out.print("Enter the distance of the race: ");
      raceDist = in.nextDouble();
      in.nextLine();

      System.out.println(raceName + raceDist);
      bikeRace = new BikeRace(raceName, raceDist);

      while(!done)
      {
         System.out.println("\nEnter cyclits name: ");
         cyclistsName = in.nextLine();
         System.out.println("Enter the type of bike the cyclist is riding: ");
         bikeType = in.nextLine();
         System.out.println("Enter his/her rate of speed: ");
         cyclistsSpeed = in.nextDouble();
         in.nextLine();

         bikeRace.addCyclist(cyclistsName, bikeType, cyclistsSpeed);

         System.out.println("Enter another cyclist into the race? [Y/N]");
         flag = in.nextLine();

         if(!flag.equals("Y"))
            done = true;
      }

      System.out.println(bikeRace.displayFinishOrder());
   }
}
