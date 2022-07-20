package jconsole;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        jconsole.setup();
        System.out.println("Hello world!");
        System.out.println("Clearing console...");
        Thread.sleep(1000);
        utilities.clearScreen();
        System.out.println("All done!");
    }
}
