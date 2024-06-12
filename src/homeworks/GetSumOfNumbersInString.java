package homeworks;

public class GetSumOfNumbersInString {

    /*
    Write a method that accepts String as parameter and returns sum of all numbers in String.

    Example:
   .getSum("a12b2mn10"); return 24;  12+2+10=24
   .getSum("123u6i009"); return 138;  123+6+9=138
     */

    public static void main(String[] args) {
        System.out.println(getSum("a12b2mn10")); //12+2+10=24
        System.out.println(getSum("123u6i009")); //123+6+9=138
    }

    public static int getSum(String str) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i<str.length(); i++){
            if (Character.isDigit(str.charAt(i))) {
                num = num*10+str.charAt(i) - '0';
            }
            else {
                sum+=num;
                num = 0;
            }
        }
        sum+=num;
        return sum;
    }


}

