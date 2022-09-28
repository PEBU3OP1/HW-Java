
public class Playing_field {

    public static void top() {
        System.out.print("\u250c" + "\u2500" + "\u2500");
        for (int i = 0; i < 9; i++) {
            System.out.print("\u2500" + "\u2500" + "\u252c" + "\u2500" + "\u2500" + "\u2500");

        }
        System.out.print("\u2500" + "\u2500" + "\u2510");
    }

    public static void bottom() {
        System.out.print("\u2514" + "\u2500" + "\u2500");
        for (int k = 0; k < 9; k++) {
            System.out.print("\u2500" + "\u2500" + "\u2518" + "\u2500" + "\u2500" + "\u2500");
        }
        System.out.print("\u2500" + "\u2500" + "\u2518");
    }

    public static String middle() {
        String middle = "   " + "  |";
        return middle;

    }

    public static String middle(String name) {
        String middle = "  " + name + "  |";
        return middle;

    }

}
