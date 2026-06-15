// 96	96_fruit_price.java	Display the price of a fruit using switch case on fruit name.
public class _96_fruit_price {
    public static void main(String[] args) {
        String fruit = "mango";
        switch (fruit.toLowerCase()) {
            case "apple":  System.out.println("Price: Rs.80/kg"); break;
            case "mango":  System.out.println("Price: Rs.60/kg"); break;
            case "banana": System.out.println("Price: Rs.40/dozen"); break;
            case "grapes": System.out.println("Price: Rs.90/kg"); break;
            default: System.out.println("Fruit not found.");
        }
    }
}
