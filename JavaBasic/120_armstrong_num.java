// 120	120_armstrong_num.java	Check whether a number is an Armstrong number (e.g. 153 = 1³+5³+3³).
public class _120_armstrong_num {
    public static void main(String[] args) {
        int num = 153, temp = num, digits = String.valueOf(num).length(), sum = 0;
        while (temp > 0) { sum += (int)Math.pow(temp%10, digits); temp /= 10; }
        System.out.println("Number: " + num);
        System.out.println(sum==num ? num+" is Armstrong." : num+" is NOT Armstrong.");
    }
}
