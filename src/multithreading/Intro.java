package multithreading;

public class Intro {

    // Single thread : only one thread in app
    // Multithreading : multiple action simultaneously

    public static void main(String[] args) {
        System.out.println("Started");

        NumberPrinter thread = new NumberPrinter("First -> ");
        thread.start();

        NumberPrinter thread2 = new NumberPrinter("Second -> ");
        thread2.start();

        MyThread thread0 = new MyThread("ThreadZZero");
        thread0.start();

        for (int i = 0; i <= 5; i++) {
            System.out.println("main1 -> " + i);
        }

    }

    /*
     Ways to create threads objects:
     1 extends Thread class

     */

}
