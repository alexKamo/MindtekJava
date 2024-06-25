package INTERVIEWQUESTIONCODING;

public class ReversedWithSTB {

    public static void main(String[] args) {

        System.out.println(reverseSentSTB("I love Java"));

    }

    public static String reverseSentSTB(String str){
        if (str==null || str.isEmpty()){
            return str;
        }

        String[] words = str.split(" ");

        StringBuilder stb = new StringBuilder();

        for (int i = words.length-1; i>=0; i--){
            stb.append(words[i]);
            if (i>0){
                stb.append(" ");
            }
        }
        return stb.toString().trim();

    }


}
