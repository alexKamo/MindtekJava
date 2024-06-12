package stringbuilder2;

public class EqualsMethod2 {

    public static void main(String[] args) {

        StringBuilder stb1 = new StringBuilder("Apple");
        StringBuilder stb2 = new StringBuilder("Apple");
        StringBuilder stb3 = new StringBuilder("Apple");

        stb1 = stb2; // value of stb1 will = to stb2;
        System.out.println(stb1.equals(stb2)); // will be true

        stb2 = stb3;  // stb1 will not = to stb2. But stb2 will = to stb3;
        System.out.println(stb2.equals(stb3)); //will be true

        stb1 = stb2;  // stb1 will = to stb2 and stb1 will automaticly = to stb3 because stb2 is already equal to stb3
        System.out.println(stb1.equals(stb2)); //will be true

        System.gc(); //garbage collector

    }

}
