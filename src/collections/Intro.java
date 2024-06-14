package collections;

import java.util.ArrayList;
import java.util.List;
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
        System.out.println(stack.pop());

        Stack<String> words = new Stack<>();
        System.out.println(words);
        if (!words.isEmpty()) words.pop();

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(5);
        list2.add(1,8);
        System.out.println(list2);





    }
}
