package jconsole;

public class movements {
    public static void goTo(int x, int y) {
        char escCode = 0x1B;
        System.out.print(String.format("%c[%d;%df",escCode,y,x));
    }
    public static void up(int distance) {
        System.out.println("\033[" + distance + "A");
    }
    public static void down(int distance) {
        System.out.println("\033[" + distance + "B");
    }
    public static void forward(int distance) {
        System.out.println("\033[" + distance + "C");
    }
    public static void backward(int distance) {
        System.out.println("\033[" + distance + "D");
    }
    public static void up() {
        System.out.println("\033[A");
    }
    public static void down() {
        System.out.println("\033[B");
    }
    public static void forward() {
        System.out.println("\033[C");
    }
    public static void backward() {
        System.out.println("\033[D");
    }
}
