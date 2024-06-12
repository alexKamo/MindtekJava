package methods2;

public class StaticMethods2 {

    public static int getGreatest(int num1, int num2){

//        int great = 0;
//        if (num1>great) great=num1;
//        if (num2>great) great=num2;
//        return great;

//        if (num1>num2) return num1;
//        return num2;

        return num1>num2 ? num1 : num2;
        //    if this  go  true    false
        //     true                  ^
        //    if this   go -----------
        //    false
    }

    public static void main(String[] args) {
        System.out.println(getGreatest(5,10));
    }
}
