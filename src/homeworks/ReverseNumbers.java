package homeworks;

public class ReverseNumbers {
    /*
    Write a method that accepts int as parameter and returns reversed int. Do not use String or StringBuilder

    Example:
    .reverseInt(123); -> returns 321
    .reverseInt(-123); -> returns -321
    .reverseInt(200); -> returns 2
     */

    public static int reverseInt(int num){
        int rev = 0;
        if (num<0){
            num=num-num*2;
            while(num>0){
                rev*=10;
                rev+=num%10;
                num/=10;
            }
            return rev-rev*2;
        }else {
            while (num > 0) {
                rev *= 10;
                rev += num % 10;
                num /= 10;
            }
        }
        return rev;
    }


    public static void main(String[] args) {
        System.out.println(reverseInt(123));
        System.out.println(reverseInt(-123));
        System.out.println(reverseInt(200));
    }
}
