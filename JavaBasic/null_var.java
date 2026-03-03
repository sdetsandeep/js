// 11	null_var.java	Assign null to a variable and print it along with its typeof.

public class null_var {
    public static void main(String[] args) {
        String str = null;
        Integer num = null;

        System.out.println("str = " + str);
        System.out.println("num = " + num);
        System.out.println("Is str null? " + (str == null));
        System.out.println("Type of null reference: null (no type in Java)");
    }
}
