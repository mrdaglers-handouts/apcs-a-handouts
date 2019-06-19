/** This test programming exercise 9.11
 * 
 * @author Mr. Dagler
 */

import java.util.Scanner;

public class LinearEquationRunner
{
   public static void main(String[] args) 
   {
      int A, B, C, D, E, F;
      boolean done = false;
      LinearEquation eq;
      String flag = "y";
      Scanner in = new Scanner(System.in);

      while(!done)
      {
         System.out.println("Solving: Ax+By=C");
         System.out.println("         Dx+Ey=F");
         System.out.println();
         System.out.print("Enter the coefficients A B C: ");
         A = in.nextInt();
         B = in.nextInt();
         C = in.nextInt();
         System.out.print("Enter the coefficients D E F: ");
         D = in.nextInt();
         E = in.nextInt();
         F = in.nextInt();

         eq = new LinearEquation(A, B, C, D, E, F);
         System.out.println("Solving: " + eq.getA() + "x + " + eq.getB() + "y = " + eq.getC());
         System.out.println("         " + eq.getD() + "x + " + eq.getE() + "y = " + eq.getF());
         if(eq.isSolvable())
            System.out.println("  Ans: (" + eq.getX() + ", " + eq.getY() + ")");
         else
            System.out.println("  The equation has no solution.");

         System.out.println();
         System.out.println("Enter another equation? [y/n] ");
         flag = in.next();
         System.out.println();

         if(flag.equals("n"))
            done = true;
      }
   }
}