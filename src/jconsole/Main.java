package jconsole;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        jconsole.setup();
        System.out.println("Hello world!");
        Thread.sleep(1000);
        System.out.println("Clearing console...");
        Thread.sleep(1000);
        // move the cursor to home with
        // \033[H
        // clear the screen with
        // \033[2J
        System.out.print("\033[H\033[2J");
        System.out.println("All done!");
    }
}
