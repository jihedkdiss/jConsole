package jconsole;

public class movements {
    public static void up(int distance) {
        System.out.println("\033[" + distance + "F");
    }
    public static void down(int distance) {
        System.out.println("\033[" + distance + "E");
    }
    public static void forward(int distance) {
        System.out.println("\033[" + distance + "C");
    }
    public static void backward(int distance) {
        System.out.println("\033[" + distance + "D");
    }
    public static void up() {
        System.out.println("\033[F");
    }
    public static void down() {
        System.out.println("\033[E");
    }
    public static void forward() {
        System.out.println("\033[C");
    }
    public static void backward() {
        System.out.println("\033[D");
    }
}
