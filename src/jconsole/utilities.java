package jconsole;

public class utilities {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }

    public static void setWindowTitle(String title) {
        System.out.println("\033] 0 ; " + title + "\07");
    }
}
