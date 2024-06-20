package homeworks.hm2;

public class MoneyEUDol {

    public static MoneyConvert dollToEu = (int dollars) -> (int) (dollars * 0.9);
    public static MoneyConvert euToDoll = (int euro) -> (int) (euro / 0.9);

    public static void main(String[] args) {

        int convertedToEuro = dollToEu.convert(10);
        int convertedToDollar = euToDoll.convert(25);
        System.out.println(convertedToEuro);
        System.out.println(convertedToDollar);



    }

}
