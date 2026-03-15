// 77	77_income_tax.java	Calculate income tax based on given salary slabs.
public class _77_income_tax {
    public static void main(String[] args) {
        double salary = 750000;
        double tax;
        if (salary <= 250000) tax = 0;
        else if (salary <= 500000) tax = (salary - 250000) * 0.05;
        else if (salary <= 1000000) tax = 12500 + (salary - 500000) * 0.20;
        else tax = 112500 + (salary - 1000000) * 0.30;
        System.out.println("Salary: Rs." + salary);
        System.out.println("Income Tax: Rs." + tax);
    }
}
