/**
 * This demonstrates Objects and the assignment operator (=).
 *
 * @author Mr. Dagler
 */

class ObjectEquals
{
   public static void main(String[] args)
   {
      MoneyBox gymMoneyBox = new MoneyBox(100.00, 30.00);

      gymMoneyBox.addCheck(50.00);

      MoneyBox bookStoreMoneyBox = gymMoneyBox;

      System.out.println();
      System.out.println("Gym: Checks = $" + gymMoneyBox.getCheckValue()
      + " Cash = " + gymMoneyBox.getCashValue());
      System.out.println("Book Store: Checks = $"
      + bookStoreMoneyBox.getCheckValue() + " Cash = "
      + bookStoreMoneyBox.getCashValue());

      gymMoneyBox.addCheck(100.00);
      bookStoreMoneyBox.addCash(20.00);

      System.out.println();
      System.out.println("Gym: Checks = $" + gymMoneyBox.getCheckValue()
      + " Cash = " + gymMoneyBox.getCashValue());
      System.out.println("Book Store: Checks = $"
      + bookStoreMoneyBox.getCheckValue() + " Cash = "
      + bookStoreMoneyBox.getCashValue());
   }
}

class MoneyBox
{
   private double checksValue;
   private double cashValue;

   MoneyBox(double checkV, double cashV)
   {
      checksValue = checkV;
      cashValue = cashV;
   }

   public void addCheck(double checkV)
   { checksValue += checkV; }

   public void addCash(double cashV)
   { cashValue += cashV; }

   double getCheckValue()
   { return checksValue; }

   double getCashValue()
   { return cashValue; }
}
