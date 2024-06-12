package stringbuilder;

public class StbExample {

    public static void main(String[] args) {

        long startTimeStb = System.currentTimeMillis();

        StringBuilder stb = new StringBuilder("Java");    // StringBuilder create a value java memory of "Java" then it can be changed to "Java is easy"
        stb.append(" is easy");
        System.out.println(stb);

        long endTimeStb = System.currentTimeMillis();
        System.out.println("Time for StringBuilder " + (endTimeStb-startTimeStb));

        long startTimeStr = System.currentTimeMillis();

        String str = "Java";                           // String create a value in java memory of "Java" then need to create one more value of
        str+= " is easy";                              // " is easy" then it must create 3rd value of "Java is easy"
        System.out.println(str);

        long endTimeStr = System.currentTimeMillis();
        System.out.println("Time for StringBuilder " + (endTimeStr-startTimeStr));
    }
}

