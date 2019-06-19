/** This tests programming exercises 9.8
 * 
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class FanRunner
{
   public static void main(String[] args) 
   {
      Scanner in = new Scanner(System.in);
      int radius;
      String color;
      Fan fan = new Fan();

      System.out.println("The default fan:");
      System.out.println(fan);
      System.out.println();

      System.out.print("Enter the new fan's radius: ");
      radius = in.nextInt();
      fan.setRadius(radius);
      System.out.print("Enter the new fan's color: ");
      color = in.next();
      fan.setColor(color);
      System.out.println();

      System.out.println("Turning the fan on:");
      fan.setOn(true);
      fan.setSpeed(2);
      System.out.println(fan);
   }
}