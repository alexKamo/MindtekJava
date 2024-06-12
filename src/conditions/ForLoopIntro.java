package conditions;

public class ForLoopIntro {
    public static void main(String[] args) {
        // print nums from 1 to 10 with a while loop and for loop
//        int i = 1;
//        while(i<=10) { //finsh when i(0) = 10;
//            i++;
//            System.out.println(i);
//        }
//        for(start; condition; inc logic){code}
        for (int i=1; i<=10; i++){
            System.out.println(i);
            if (i==7) break;
        }
    }

}
