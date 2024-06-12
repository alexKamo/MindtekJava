package conditions;

public class ForLoopCount {
    public static void main(String[] args) {
        // print the sum of 1 to 500 but skip all nums that en with 00
        int sum = 0;
        for(int i = 1; i<=500; i++){
            //avoid all nums when i  ends with 00
            if (i%100==0) continue;
            sum+=i;
            // or we can use same with if(i%100!=0) sum+=i;
        }
        System.out.println(sum); // or we can do System.out.println(500*501/2);
    }

}
