package recursion;

public class RecursionPractice {

    public static void main(String[] args) {

        print(5);

    }

    public static void print(int num){
        if (num <= 0) return;
        System.out.println(num);
        print(num-1);
        System.out.println("Recursion method: " + num);

    }

}
