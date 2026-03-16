// 84	84_discount_calc.java	Calculate discount percentage based on total purchase amount.
public class _84_discount_calc {
    public static void main(String[] args) {
        double amount = 1500;
        int discount;
        if (amount >= 2000) discount = 20;
        else if (amount >= 1000) discount = 10;
        else if (amount >= 500) discount = 5;
        else discount = 0;
        double discountAmt = amount * discount / 100;
        System.out.println("Amount: Rs." + amount);
        System.out.println("Discount: " + discount + "% = Rs." + discountAmt);
        System.out.println("Final: Rs." + (amount - discountAmt));
    }
}
