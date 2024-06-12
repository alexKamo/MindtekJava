package funcionalinterfaces2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class LambdaPractice5 {
    /*
    String str = "Java"
    .getTotalWithCondition(str, condition); -> return "J";
     */

    public static String getTotalWithCondition(String str, MethodCondition<Character> condition){
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (condition.execute(str.charAt(i))){
                output+=str.charAt(i);
            }
        }
        return output;
    }

    public static List<Integer> getNumsWithCondition(List<Integer> nums, MethodCondition<Integer> condition){
        List<Integer> output = new ArrayList<>();
        for (Integer n : nums){
            if (condition.execute(n)){
                output.add(n);
            }
        }

        return output;
    }



    public static void main(String[] args) {

        System.out.println(getTotalWithCondition("JavA",x -> Character.isUpperCase(x)));
        System.out.println(getTotalWithCondition("JaVA", x -> Character.isLowerCase(x)));

        System.out.println(getTotalWithCondition("Java",x -> "aeiouAEIOU".contains(x+"")));

        List<Integer> number = List.of(5,6,1,21,16,42);
        System.out.println(getNumsWithCondition(number,x -> x%2==0 && x>=10 && x<=200));

        Supplier<Integer> generateRandomNum = () -> {
            Random random = new Random();
            return random.nextInt();
        };
        System.out.println(generateRandomNum.get());
        
    }
}
