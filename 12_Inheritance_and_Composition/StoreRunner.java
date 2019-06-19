/** This is a basic class to keep track of a store's information.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

class StoreRunner
{
   public static void main(String[] args)
   {
      Store store = new Store();
      Scanner in = new Scanner(System.in);
      double goodsCost, employeeCost, revenue;

      System.out.print("What is the total cost of the goods: ");
      goodsCost = in.nextDouble();
      System.out.print("What is the total cost of the employees: ");
      employeeCost = in.nextDouble();
      System.out.print("What is the total stores's revenue: ");
      revenue = in.nextDouble();

      store.setCostOfGoods(goodsCost);
      store.setCostOfEmployees(employeeCost);
      store.setRevenue(revenue);

      System.out.println();
      System.out.println("The summary for the store:");
      System.out.println("  Cost of Goods: $" + store.getCostOfGoods());
      System.out.println("  Cost of Employees: $" + store.getCostOfEmployees());
      System.out.println("  Store's Revenue: $" + store.getRevenue());
      System.out.println("  Store's Profit: $" + store.getProfit());
   }
}
