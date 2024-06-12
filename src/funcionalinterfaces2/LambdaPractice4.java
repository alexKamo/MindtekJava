package funcionalinterfaces2;

public class LambdaPractice4 {

    public static void main(String[] args) {

        Checker<Integer,Integer> sum = x -> {
            Integer total  = 0;
            for (Integer num : x){
                total+=num;
            }
            return  total;
        };

        Integer[] nums = {5,2,5};
        System.out.println(sum.execute(nums));

        Checker<Integer,Boolean> moreThan20 = x -> sum.execute(x)>20;
        System.out.println(moreThan20.execute(nums));

        /*
        Implement Lambda expression for check that takes
        array of String and return all elements concatenated
            Ex:
                String[] word = {"I", "Love", "Java"}
                concatenate.execute(words); -> return "I Love Java"

         */

        String[] word = {"I", "Love", "How", "Java", "Talk"};
        Checker<String,String> concatenate = x -> {
            StringBuilder stb = new StringBuilder();
          for (String s : x){
              stb.append(s).append(" ");
          }
          return stb.toString().trim();
        };

        System.out.println(concatenate.execute(word));



        /*
        String[] prices = {"$2.4","5.2","3"};
            Ex
                getTotal.execute(prices); -> return 10.6; double
         */
        Checker<String,Double> getTotal = x -> {
            Double total = 0.0;
            for (String price : x){
                Double d = Double.valueOf(price.substring(1));
                total+=d;
            }
            return total;
        };
        String[] prices = {"$2.4","5.2","3"};
        System.out.println(getTotal.execute(prices));






    }

}
