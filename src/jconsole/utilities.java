package jconsole;

public class utilities {
    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
    }
    public static void setWindowTitle(String title) {
        System.out.println("\033]0;" + title + "\07");
    }
    public static void reset() {
        System.out.print("\033[!p");
    }
    public static void eraseThisLine() {
        System.out.println("\033[2K");
    }
    public static void savePosition() {
        System.out.println("\033[s");
    }
    public static void restorePosition() {
        System.out.println("\033[u");
    }
    public static void scrollDown() {
        System.out.println("\033D");
    }
    public static void scrollUp() {
        System.out.println("\033M");
    }
    public static void home() {
        System.out.println("\033[H");
    }
}
