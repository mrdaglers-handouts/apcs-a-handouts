/**
 * File Name: TridiagonalMatrix.java
 *
 * This reads in the value n from the user and then outputs an n by n
 * tridiagonal matrix with the main diagonals made up of 1’s and the 
 * subdiagonals made up of 2’s
 *
 * @author: Mr. Dagler
 */

import java.util.Scanner;

class TridiagonalMatrix
{
   public static void main(String[] args)
   {
      int n;
      int[][] matrix;
      Scanner in = new Scanner(System.in);

      System.out.println("Getting an n by n tridiagonal matrix.");
      System.out.print("  Enter n: ");
      n = in.nextInt();

      System.out.println();
      matrix = getTridiagonalMatrix(n);

      for(int i=0; i<n; i++)
      {
         for(int j=0; j<n; j++)
            System.out.print(matrix[i][j] + " ");
         System.out.println();
      }

      System.out.println();
   }

   public static int[][] getTridiagonalMatrix(int n)
   {
      /* Type your code here. */
   }

}
