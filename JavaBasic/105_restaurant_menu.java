// 105	105_restaurant_menu.java	Create a restaurant menu system — show item and price using switch.
public class _105_restaurant_menu {
    public static void main(String[] args) {
        int item = 3;
        System.out.println("1. Butter Chicken - Rs.220");
        System.out.println("2. Paneer Tikka   - Rs.180");
        System.out.println("3. Dal Makhani    - Rs.150");
        System.out.println("4. Biryani        - Rs.260");
        switch (item) {
            case 1: System.out.println("Ordered: Butter Chicken - Rs.220"); break;
            case 2: System.out.println("Ordered: Paneer Tikka - Rs.180"); break;
            case 3: System.out.println("Ordered: Dal Makhani - Rs.150"); break;
            case 4: System.out.println("Ordered: Biryani - Rs.260"); break;
            default: System.out.println("Invalid choice.");
        }
    }
}
