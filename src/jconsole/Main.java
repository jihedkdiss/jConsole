package jconsole;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        jconsole.setup();
        utilities.clearScreen();
        utilities.setWindowTitle("Jihed Kdiss");
        System.out.println("Square animation:");
        animations.square();
        Thread.sleep(5000);
        utilities.reset();
    }
}
