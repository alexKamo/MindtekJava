package recursion;

public class IntroRecursion {

    public static void main(String[] args) {

        // print all numbers starting from 1 to 10
        // printIteratively(8);
        // printRecursively(1);
        System.out.println(factorial(7));


    }

    public static void printIteratively(int num) {
        for (int i = num; i <= 10; i++) {
            System.out.println(i);
        }
    }

    static void printRecursively(int num) {

        if (num > 10) return;
        System.out.println(num);
        printRecursively(num + 1);
    }

    static int factorial(int num) {

        // base case
        if (num<=1) return 1;
        return num * factorial(num-1);

    }

    static int sum(int[] arr, int index){
        if (index == arr.length) return 0;
        return arr[index] + sum(arr,index+1);
    }
    static int sum(int[] arr){
        return sum(arr,0);
    }

}
