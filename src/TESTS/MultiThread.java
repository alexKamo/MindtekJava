package TESTS;

public class MultiThread extends Thread{

    public void run(){
        for (int i = 1; i < 6; i++) {
            System.out.println(i);
        }
    }

}
