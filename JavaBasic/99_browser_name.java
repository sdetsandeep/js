// 99	99_browser_name.java	Display the browser name based on a code input using switch.
public class _99_browser_name {
    public static void main(String[] args) {
        String code = "CH";
        switch (code.toUpperCase()) {
            case "CH": System.out.println("Google Chrome"); break;
            case "FF": System.out.println("Mozilla Firefox"); break;
            case "IE": System.out.println("Internet Explorer"); break;
            case "SF": System.out.println("Safari"); break;
            case "ED": System.out.println("Microsoft Edge"); break;
            default:   System.out.println("Unknown Browser.");
        }
    }
}
