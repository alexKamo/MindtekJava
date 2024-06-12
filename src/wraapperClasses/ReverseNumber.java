package wraapperClasses;

public class ReverseNumber {

    public static void main(String[] args) {

        int num = -12345;
        // 12345 -> 54321

        // 1. convert int to StringBuilder
        // 2. reverse(); method
        // 3. StringBuilder -> int (54321);

        StringBuilder stb = new StringBuilder(num+"");
        stb.reverse();
        if (stb.toString().contains("-")){
            num=Integer.parseInt(stb.toString().substring(0,stb.length()-1))*-1;
        }
        else num=Integer.parseInt(stb.toString());
        System.out.println(num);
    }
}

