// 136	136_hollow_rect.java	Print a hollow rectangle border pattern of given width and height.
public class _136_hollow_rect {
    public static void main(String[] args) {
        int w = 7, h = 4;
        for (int i = 1; i <= h; i++) {
            for (int j = 1; j <= w; j++) {
                if (i==1||i==h||j==1||j==w) System.out.print("* ");
                else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
