package testclassesLOOPandARRAY;

public class Test2 {
    public static void main(String[] args) {
        String text = "java is fun";
        // print every letter in a single new line
        int j = 0;
        while(j<text.length()){
            System.out.println(text.charAt(j));
            j++;
        }
        System.out.println("--------------------------------------");
        for (int i = 0; i<text.length(); i++) System.out.println(text.charAt(i));
    }

}
