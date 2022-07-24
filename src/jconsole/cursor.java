package jconsole;

public class cursor {
    public static void blink(boolean state) {
        if(state) System.out.println("\033[?12h");
        else System.out.println("\033[?12l");
    }
    public static void show(boolean state) {
        if(state) System.out.println("\033[?25h");
        else System.out.println("\033[?25l");
    }
}
