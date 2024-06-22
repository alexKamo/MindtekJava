package testclassesLOOPandARRAY;

public class ReverseNums {

    public static int reversedNumbers(int num){

        int number = 0;
        if (num<0){
            num=num-num*2;
            number=reversedInt(num,number);
            return number-number*2;
        }else {
            return reversedInt(num,number);
        }
    }

    private static int reversedInt(int num, int number) {
        while (num>0){
            number*=10;
            number+=num%10;
            num=num/10;
        }
        return number;
    }

    public static void main(String[] args) {
        System.out.println(reversedNumbers(-123));
    }

}
