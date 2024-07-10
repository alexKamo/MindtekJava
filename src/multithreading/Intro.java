package multithreading;

public class Intro {

    // Single thread : only one thread in app
    // Multithreading : multiple action simultaneously

    public static void main(String[] args) {
        System.out.println("Started");
        NumberPrinter thread = new NumberPrinter();
        thread.start();
    }

    // ways to create threads objects:
    // 1 extends Thread class

}
