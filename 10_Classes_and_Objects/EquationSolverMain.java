/**
 * File Name: EquationSolverMain.java
 *
 * This solves a set of equations that you may face in a math class. Convert all
 * of the methods in EquationSolver to static and get the program to working
 * again.
 *
 * @author Mr. Dagler
 */

class EquationSolverMain
{
	public static void main(String[] args)
	{
      EquationSolver eqSol = new EquationSolver();
      double a, b, c, d;

      eqSol.setValues(5, -3, 4, 0);
      System.out.println("Solving 5x-3=4");
      System.out.println("  Answer = " + eqSol.solver1());

      eqSol.setValues(4, 1, -3, 0);
      System.out.println("Solving x/4+1=-3");
      System.out.println("  Answer = " + eqSol.solver2());

      eqSol.setValues(7, -3, 8, 11);
      System.out.println("Solving 7x-3=8x+11");
      System.out.println("  Answer = " + eqSol.solver3());
	}
}

class EquationSolver
{
	double A, B, C, D;

	EquationSolver()
	{
		A = B = C = D = 0.0;
	}

	public void setValues(double a, double b, double c, double d)
	{
		A = a;
		B = b;
      C = c;
      D = d;
	}

   // This solves Ax+B=C
	double solver1()
   {
      return (C-B)/A;
   }

   // This solves x/A+B=C
	double solver2()
   {
      return A*(C-B);
   }

   // This solves Ax+B=Cx+D
	double solver3()
   {
      return (D-B)/(C-A);
   }

}
