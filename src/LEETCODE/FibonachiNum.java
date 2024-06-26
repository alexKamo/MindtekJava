package LEETCODE;

public class FibonachiNum {

    public static int fib(int n) {
        if(n==0) return 0;
        if(n==1) return 1;
        int fib1 = 0, fib2 = 1, fibonacci = 0;

        for(int i = 2; i<=n; i++){
            fibonacci = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibonacci;
        }
        return fibonacci;
    }

    public static void main(String[] args) {

        System.out.println(fib(20));


    }
}
