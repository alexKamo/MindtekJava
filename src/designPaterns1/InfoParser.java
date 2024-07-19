package designPaterns1;

import java.util.ArrayList;
import java.util.Arrays;

public class InfoParser {

    private ArrayList<String> list;
    public InfoParser(){

        //connect to DB to get information -> a
        // communicate with other apps to get some data from external source -> b
        // using a and b create an object

        list = new ArrayList<>();
        list.add("A");
        list.add("B");
        System.out.println("Doing complex operation");
    }

    public void readData(){
        System.out.println(list);
        System.out.println("Logic for reading data is being executed");
    }

}
