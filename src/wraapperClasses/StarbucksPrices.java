package wraapperClasses;

import java.util.Arrays;

public class StarbucksPrices {

    public static void main(String[] args) {

        String[] prices = {"Coffee $2.25", "Cappuccino $4.45", "Latte $4.10", "Mocha $3.25"};
        /* 10% inflation updater
        {"Coffee $2.47", "Cappuccino $4.89", "Latte $4.51", "Mocha $3.57"}
        1. Loop through each price
        2. Split String by dollar sign "Coffee $2.25" . split("$"); -> ["Coffee" , "2.25"]
        3. Take second element which is price and convert to double "2.25" -> 2.25
        4. Add %10 to 2.25 -> 2.25*=0.1 = 2.47
        5. Concatenate first element of array to new price "Coffee " + "$" + 2.47 = "Coffee $2.47"
        6. Reassign old element with new String new price
        */


        for (int i =0; i< prices.length; i++){
            String[] el = prices[i].split("\\$");
            double price = Double.parseDouble(el[1]);
            price+=price*0.1;
            price=Math.round(price*100.0)/100.0;
            String newEl = el[0] + "$" + price;
            prices[i] = newEl;
        }
        System.out.println(Arrays.toString(prices));




    }

}
