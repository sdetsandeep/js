// 98	98_atm_menu.java	Create an ATM menu (Balance/Withdraw/Deposit/Exit) using switch.
public class _98_atm_menu {
    public static void main(String[] args) {
        int option = 2;
        double balance = 15000, amount = 3000;
        switch (option) {
            case 1: System.out.println("Balance: Rs." + balance); break;
            case 2:
                if (amount <= balance) { balance -= amount; System.out.println("Withdrawn Rs." + amount + ". Balance: Rs." + balance); }
                else System.out.println("Insufficient balance.");
                break;
            case 3: balance += amount; System.out.println("Deposited Rs." + amount + ". Balance: Rs." + balance); break;
            case 4: System.out.println("Thank you. Goodbye!"); break;
            default: System.out.println("Invalid option.");
        }
    }
}
