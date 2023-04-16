public class ex1_Billing
{
   final static double TAX = 0.07;
   public static void main(String[] args)
   {
      double bill;
      bill = computeBill(20.00);
      System.out.println("The total for a photobook that costs $20.00 is $" +
         bill);
      bill = computeBill(50.00, 3);
      System.out.println("The total for three photobooks that cost $50.00 is $" +
         bill);
      bill = computeBill(100.00, 5, 50.00);
      System.out.println("The total for five photobooks that cost $100.00 with a $50 coupon is $" +
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