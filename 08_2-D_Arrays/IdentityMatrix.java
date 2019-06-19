/** This reads in the value n from the user and then outputs an n by n 
 * identity matrix.
 *
 * @author: Mr. Dagler
 */

import java.util.Scanner;

class IdentityMatrix
{
   public static void main(String[] args)
   {
      int n;
      int[][] matrix;
      Scanner in = new Scanner(System.in);

      System.out.println("Getting an n by n identity matrix.");
      System.out.print("  Enter n: ");
      n = in.nextInt();

      System.out.println();
      matrix = getIdentityMatrix(n);

      for(int i=0; i<n; i++)
      {
         for(int j=0; j<n; j++)
            System.out.print(matrix[i][j] + " ");
         System.out.println();
      }

      System.out.println();
   }

   public static int[][] getIdentityMatrix(int n)
   {
      /* The teacher will type his code here */
   }

}
