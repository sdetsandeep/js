// 95	95_season_month.java	Display season (Summer/Monsoon/Winter) based on month using switch.
public class _95_season_month {
    public static void main(String[] args) {
        int month = 6;
        System.out.println("Month: " + month);
        switch (month) {
            case 3: case 4: case 5: System.out.println("Summer"); break;
            case 6: case 7: case 8: case 9: System.out.println("Monsoon"); break;
            case 10: case 11: case 12: case 1: case 2: System.out.println("Winter"); break;
            default: System.out.println("Invalid month.");
        }
    }
}
