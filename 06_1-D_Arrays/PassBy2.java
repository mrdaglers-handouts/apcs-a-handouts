/** This program shows three other examples of Pass by Reference.
 *
 * @author Mr. Dagler
 */

class PassBy2
{
   /*
    * Making a copy of nums
    */
   static void method1(int[] nums)
   {
      int[] arr = new int[nums.length];

      for(int i=0; i<nums.length; i++)
         arr[i] = nums[i];

      arr[0] = 0;
   }

   /*
    * Making a local variable nums that is pointing to something else.
    */
   static void method2(int[] nums)
   {
      nums = new int[6];
      nums[0] = 0;
   }

   /*
    * Not making a copy of nums
    */
   static void method3(int[] nums)
   {
      nums[0] = 0;
   }

   public static void main(String[] args)
   {
      int[] list1 = {1, 2, 4, 8, 16, 32};
      int[] list2 = {1, 2, 4, 8, 16, 32};
      int[] list3 = {1, 2, 4, 8, 16, 32};

      method1(list1);
      method2(list2);
      method3(list3);

      System.out.print("List 1: ");
      for(int l1: list1)
         System.out.print(l1 + " ");
      System.out.println();

      System.out.print("List 2: ");
      for(int l2: list2)
         System.out.print(l2 + " ");
      System.out.println();

      System.out.print("List 3: ");
      for(int l3: list3)
         System.out.print(l3 + " ");
      System.out.println();

   }
}
