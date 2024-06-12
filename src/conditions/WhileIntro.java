package conditions;

public class WhileIntro {
    public static void main(String[] args) {
        // loop: while(condition) {    }
        // loop has a starting point, condition, ending point
        // print numbers in range 1 and 1000

//        int num = 1;
//        while (num<=1000){
//            System.out.println(num);
//            num++;
//        }
//        System.out.println("End");

        int num = 0;
        String  word = "Oleksandr Pikhalchuk";
        while (num<word.length()){
            System.out.println(word.charAt(num));
            num++;
        }
        System.out.println("End");
    }

}
