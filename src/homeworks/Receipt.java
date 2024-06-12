package homeworks;

public class Receipt {
    public static void main(String[] args) {
        /*
        1. Create a class with name Receipt.
        2. Create a main method inside of a class
        3. Create two String variables with values item1="Iphone 13" and item2="AirPods",
        then create two int variables with values item1Price=999 and item2Price=179.
        4. Then write a code to print output like below in console.

         */
        String item1 = "Iphone 13: ";
        String item2 = "Apple Airpods: ";
        int price1 = 999;
        int price2 = 179;
        System.out.println("Apple Store Receipt");
        System.out.println("*******************");
        System.out.println(item1 + "$" + price1);
        System.out.println(item2 + "$" + price2);
        System.out.println("*******************");
        System.out.println("Total: " + "$" + (price1+price2));
    }
}

