package exceptionsPractice;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckException {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {

        URL url = new URL("https://www.google.com");

        System.out.println("End of code");

        Thread.sleep(4000);

        System.out.println("Wake up");

    }

}
 