package TESTS;

public class TestThreads {
    public static void main(String[] args) {

        System.out.println("Thread 1");
        MultiThread multiThread = new MultiThread();
        multiThread.start();

        System.out.println("Thread 2");
        MultiThread multiThread2 = new MultiThread();
        multiThread2.start();

    }
}
