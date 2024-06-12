package testclassesLOOPandARRAY;

public class Test1 {
    public static void main(String[] args) {
        // print all nums from 100 to 50 and make a sum of aLL nums
        int sum = 0;
        int i = 100;
        while(i>=50){
            System.out.println(i);
            sum+=i;
            i--;
        }
        System.out.println("Sum is: "+sum);
        System.out.println("--------------");
        int sum2 = 0;
        for (int j = 100; j>=50; j--) {
            sum2+=j;
            System.out.println(j);
        }
        System.out.println("Sum is: " +sum2);
    }

}
