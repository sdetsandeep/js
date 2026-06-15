// 97	97_menu_display.java	Display a menu and print selected option details using switch.
public class _97_menu_display {
    public static void main(String[] args) {
        int choice = 2;
        System.out.println("1. Burger - Rs.120");
        System.out.println("2. Pizza  - Rs.250");
        System.out.println("3. Pasta  - Rs.180");
        System.out.println("Selected: " + choice);
        switch (choice) {
            case 1: System.out.println("Burger - Rs.120"); break;
            case 2: System.out.println("Pizza - Rs.250"); break;
            case 3: System.out.println("Pasta - Rs.180"); break;
            default: System.out.println("Invalid choice.");
        }
    }
}
