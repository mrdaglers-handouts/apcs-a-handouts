/** This is a basic class to keep track of a candy store's information.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

class CandyStoreRunner
{
   public static void main(String[] args)
   {
      CandyStore candyStore = new CandyStore();
      Scanner in = new Scanner(System.in);
      double goodsCost, employeeCost, candyBarCost;
      int numCandyBarsSold;

      System.out.print("What is the total cost of the goods: ");
      goodsCost = in.nextDouble();
      System.out.print("What is the total cost of the employees: ");
      employeeCost = in.nextDouble();
      System.out.print("What is the cost of one candy bar: ");
      candyBarCost = in.nextDouble();
      System.out.print("How many candy bar were sold: ");
      numCandyBarsSold = in.nextInt();

      candyStore.setCostOfGoods(goodsCost);
      candyStore.setCostOfEmployees(employeeCost);
      candyStore.setCostOfCandyBar(candyBarCost);
      candyStore.setNumCandyBarsSold(numCandyBarsSold);

      System.out.println();
      System.out.println("  Store's Profit: $" + candyStore.getProfit());
   }
}
