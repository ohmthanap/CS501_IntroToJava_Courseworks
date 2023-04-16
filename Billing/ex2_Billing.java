public class ex2_Billing
{
   final static double TAX = 0.10;
   public static void main(String[] args)
   {
      double bill;
      bill = computeBill(10.00);
      System.out.println("The total for a photobook that costs $10.00 is $" +
         bill);
      bill = computeBill(30.00, 2);
      System.out.println("The total for two photobooks that cost $30.00 is $" +
         bill);
      bill = computeBill(15.00, 10, 100.50);
      System.out.println("The total for ten photobooks that cost $15.00 with a $100.50 coupon is $" +
         bill);
    }

   public static double computeBill(double amt)
   {
      double bill = amt + amt * TAX;
      return bill;
   }

   public static double computeBill(double amt, int quantity)
   {
      double bill = amt * quantity;
      bill = bill + bill * TAX;
      return bill;
   }
   public static double computeBill(double amt, int quantity, double coupon)
   {
      double bill = amt * quantity;
      bill = bill - coupon;
      bill = bill + bill * TAX;
      return bill;
   }
}