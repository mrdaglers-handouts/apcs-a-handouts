/**
 * File Name: TwoDElementPractice.java
 *
 * This randomly generates a 2-D array and has the user input some values
 * that appear in the array.
 *
 * @author: Mr. Dagler
 */

import java.lang.Math;
import java.util.Scanner;

class TwoDElementPractice
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      int n = (int)(15*Math.random()+5);
      int m = (int)(15*Math.random()+5);
      int r, c, userInput;

      int[][] vals = new int[n][m];

      for(int i=0; i<n; i++)
         for(int j=0; j<m; j++)
            vals[i][j] = (int)(90*Math.random()+10);

      for(int i=0; i<n; i++)
      {
         for(int j=0; j<m; j++)
            System.out.print(vals[i][j] + " ");
         System.out.println();
      }
      System.out.println();

      for(int i=1; i<=3; i++)
      {
         r = (int)(n*Math.random()+0);
         c = (int)(m*Math.random()+0);

         System.out.print("Enter the value at vals[" + r + "][" + c + "]: ");
         userInput = in.nextInt();

         if(userInput == vals[r][c])
            System.out.println("   Great Job!!!!");
         else
            System.out.println("   Nope, the answer is " + vals[r][c]);
      }

   }
}
