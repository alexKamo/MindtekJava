package arrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); // ArrayList is resizable
        // String[] array = new String[5]; // Array is fixed size

        list.add("Java");
        list.add("Python");
        list.add("JS");
        list.add("C#");
        list.add("C++");

        System.out.println(list);
        System.out.println(list.get(2)); // print only index
        System.out.println(list.size()); // print size (length)
        
        System.out.println("==================");
        list.set(2,"TypeScript");
        System.out.println(list); // change in index 2 change value to another value

        System.out.println("==================");
        list.add(1, "JavaScript"); // add value between two values
        System.out.println(list);

        System.out.println("==================");
        for (String str:list){              // looping in for each loop
            System.out.println(str);
        }
        System.out.println("==================");
        for (int i = 0; i<list.size(); i++){        //looping in traditional loop
            System.out.println(list.get(i));
        }

    }
}
