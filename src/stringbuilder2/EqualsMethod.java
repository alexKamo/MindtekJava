package stringbuilder2;

public class EqualsMethod {

    public static void main(String[] args) {
                                                          // .equals(); method is not overridden
        StringBuilder stb1 = new StringBuilder("Java");   // stb 1 create a value in heap memory
        StringBuilder stb2 = new StringBuilder("Java");   // stb2 create another one value in heap memory
                                                          // that's why  in false because in memory it is separate
        System.out.println(stb1.equals(stb2));
        System.out.println(stb1.toString().equals(stb2.toString()));   // if we want to compare StringBuilder
                                                                       // with same value we need to convert STB value to String value

        String st1 = "Java";
        String st2 = "Java";
        System.out.println(st1.equals(st2));               // .equals(); method is overridden in String class

        String str3 = new String("Java");
        String str4 = new String("Java");
        System.out.println(str3.equals(str4));

    }

}
