/** This program demonstrates:
 * - Pass By Value [ints, doubles, boolean, String]
 *   When the function DOES NOT modify its parameters.
 * - Pass by Reference [everthing else]
 *   When the function modifies its parameters.
 */

class PassBy1
{
   static int method1(int a, int b)
   {
      a = 7;
      return 2*a+b;
   }

   static double method2(double[] nums)
   {
      double ans = 1.0;

		for(int i=0; i<nums.length; i++)
      {
         ans *= nums[i];
         nums[i] /= 2.0;
      }
      return ans;
   }

   public static void main(String[] args)
   {
      int x = 8, y = 11;
      double[] values = new double[6];

      values[0]=1.3; values[1]=3.9; values[2]=0.3;
      values[3]=2.7; values[4]=8.1; values[5]=8.1;

      System.out.println(method1(x, y));
      System.out.println(method2(values) + "\n");

      System.out.println("(x, y) = (" + x + ", " + y + ")");

      for(double v: values)
         System.out.print(v + " ");

      System.out.println();
   }
}
