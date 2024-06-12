package collections;

import java.util.ArrayList;
import java.util.Stack;

public class Intro {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        System.out.println(list);


        System.out.println("*************************************");

        Stack<Integer> stack = new Stack<>();

        //adding values

        stack.push(5);
        System.out.println(stack);
        stack.push(7);
        System.out.println(stack);
        stack.push(2);
        System.out.println(stack);

        // peek method -> just watching values without deleting
        System.out.println(stack.peek());

        // pop method -> removes object from the top and returns array without last values


    }
}
