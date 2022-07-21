package jconsole;

public class animations {
    public static void square(int width) throws InterruptedException {
        for (int i = 0; i < width; i++) {
            System.out.print("*");
            movements.forward();
        }

    }
}
