package queueIntro;

import java.util.LinkedList;
import java.util.Queue;

public class IntroQueue {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(55);
        queue.offer(67);
        System.out.println(queue);

    }

}
