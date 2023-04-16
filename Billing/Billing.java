public class Billing
{
   final static double TAX = 0.077;
   public static void main(String[] args)
   {
      double bill;
      bill = computeBill(100.00);
      System.out.println("The total for a photobook that costs $100.00 is $" +
         bill);
      bill = computeBill(200.00, 2);
      System.out.println("The total for two photobooks that cost $200.00 is $" +
         bill);
      bill = computeBill(300.00, 3, 50.00);
      System.out.println("The total for three photobooks that cost $300.00 with a $50 coupon is $" +
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