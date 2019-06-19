/**
 * File Name: PrintTwoD.java
 *
 * This prints out a few Two-D arrays.
 *
 * @author: Mr. Dagler
 */


class PrintTwoD
{
   public static void main(String[] args)
   {
      int[][] vals = {{7, 8, 3, 9}, {6, 1, 0, 2}};
      double[][] nums = {{0.0, 0.1, 0.2}, {1.0, 1.1, 1.2}, {2.0, 2.1, 2.2}};
      String[][] names = {{"Liang", "Daniel"}, {"Ericson", "Barbara"},
         {"Lewis", "John"}};

      System.out.println();
      printTwoD(vals);
      System.out.println();
      printTwoD(nums);
      System.out.println();
      printTwoD(names);
      System.out.println();
   }

   public static void printTwoD(int[][] m)
   {
      for(int i=0; i<m.length; i++)
      {
         for(int j=0; j<m[0].length; j++)
         {
            System.out.print(m[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void printTwoD(double[][] m)
   {
      for(int i=0; i<m.length; i++)
      {
         for(int j=0; j<m[0].length; j++)
         {
            System.out.print(m[i][j] + " ");
         }
         System.out.println();
      }
   }

   public static void printTwoD(String[][] m)
   {
      for(int i=0; i<m.length; i++)
      {
         for(int j=0; j<m[0].length; j++)
         {
            System.out.print(m[i][j] + " ");
         }
         System.out.println();
      }
   }
}
