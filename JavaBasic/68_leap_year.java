// 68	68_leap_year.java	Check whether a given year is a leap year or not.
public class _68_leap_year {
    public static void main(String[] args) {
        int year = 2024;
        System.out.println("Year: " + year);
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
            System.out.println(year + " is a Leap Year.");
        else
            System.out.println(year + " is NOT a Leap Year.");
    }
}
