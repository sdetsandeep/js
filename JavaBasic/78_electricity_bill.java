// 78	78_electricity_bill.java	Calculate electricity bill based on units consumed using slabs.
public class _78_electricity_bill {
    public static void main(String[] args) {
        int units = 350;
        double bill;
        if (units <= 100) bill = units * 1.5;
        else if (units <= 200) bill = 100*1.5 + (units-100)*2.5;
        else if (units <= 500) bill = 100*1.5 + 100*2.5 + (units-200)*4.0;
        else bill = 100*1.5 + 100*2.5 + 300*4.0 + (units-500)*6.0;
        System.out.println("Units: " + units);
        System.out.printf("Bill: Rs.%.2f%n", bill);
    }
}
