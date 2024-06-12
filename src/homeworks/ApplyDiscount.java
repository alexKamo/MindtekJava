package homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplyDiscount {

    /*
    1. Create a class with main method, then create below List.
        ArrayList <String> items=new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));
    2. Update item prices in list with %10 discount that has price equals to or more than 200
    3. Then print items list
        Output should be:
    [AirPods $207, Magic keyboard $100, Apple TV $180, iPhone 13 $900]
     */

    public static void main(String[] args) {

        ArrayList <String> items=new ArrayList<>(Arrays.asList("AirPods $230","Magic keyboard $100", "Apple TV $200","iPhone 13 $999"));

        for (int i = 0; i < items.size(); i++) {
            String[] split = items.get(i).split("\\$");
            String itemName = split[0];
            int itemPrice = Integer.parseInt(split[1]);
            if (itemPrice>=200){
                int updPrice = itemPrice-itemPrice*10/100;
                items.set(i,itemName + " $"+updPrice);
            }
        }
        System.out.println(items);

    }
}
