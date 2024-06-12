package funcionalinterfaces2;

public class LambdaPractice2 {

    public static void main(String[] args) {

        BiStringManipulation sameLength = (x,y) -> x.length() == y.length();
        System.out.println(sameLength.execute("Java","Lava"));
        System.out.println(sameLength.execute("Mindtek","Developer"));

        BiStringManipulation iSReversed = (x,y) -> x.equalsIgnoreCase(new StringBuilder(y).reverse().toString());
        System.out.println(iSReversed.execute("Java","avaJ"));
        System.out.println(iSReversed.execute("Sun","Moon"));

    }

}

