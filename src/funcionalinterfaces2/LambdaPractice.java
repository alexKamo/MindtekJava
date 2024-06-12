package funcionalinterfaces2;

public class LambdaPractice {

    public static void main(String[] args) {

        StringManipulation stringManipulation = (x) -> x.toLowerCase();
        System.out.println(stringManipulation.execute("JAVA"));

        StringManipulation stringManipulation2 = (x) -> "" + x.charAt(0) + x.charAt(x.length()-1);
        System.out.println(stringManipulation2.execute("MINDTEK"));

        StringManipulation stringManipulation3 = (x) -> {
            if (x.length()>=5){
                return x.toUpperCase();
            }else {
                return x.toLowerCase();
            }
        };
        System.out.println(stringManipulation3.execute("Lambda"));
        System.out.println(stringManipulation3.execute("Java"));

    }

}
