package oopMAY20.abstractionsMAY21.phone;

import java.util.ArrayList;
import java.util.List;

public class TestPhones2 {
    public static void main(String[] args) {


        Storage phone = new Iphone();
         /*
        Reference decides what variable and methods this object can call
         */
        System.out.println(phone.delete());
        //                     down casting
        System.out.println(((Phone)phone).call());

        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        List<Phone> phonesList = new ArrayList<>();
        phonesList.add(iphone);
        phonesList.add(samsung);

        
    }
}

