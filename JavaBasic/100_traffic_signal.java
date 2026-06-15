// 100	100_traffic_signal.java	Display the action (Stop/Ready/Go) for a traffic signal color using switch.
public class _100_traffic_signal {
    public static void main(String[] args) {
        String color = "green";
        switch (color.toLowerCase()) {
            case "red":    System.out.println("STOP"); break;
            case "yellow": System.out.println("READY / GET SET"); break;
            case "green":  System.out.println("GO"); break;
            default:       System.out.println("Invalid signal color.");
        }
    }
}
