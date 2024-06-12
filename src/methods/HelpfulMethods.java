package methods;

public class HelpfulMethods {

    public double temperatureConvert(double fahrenheit){
        // (fahrenheit - 32) * 5/9
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        HelpfulMethods temp = new HelpfulMethods();
        System.out.println(temp.temperatureConvert(80));
// ---------------------------------------------------------------------------
        System.out.println(temp.lastTwo("java fun"));
        System.out.println(temp.lastTwo("n"));
        System.out.println(temp.division(4,3));
        System.out.println(temp.division(4,2));
    }
    // ---------------------------------------------------------------------------
    public String lastTwo(String word){
        if (word.length()>=2) {
            int i = word.length()-2;
            return word.substring(i);
        }
        return null;
    }
    // ---------------------------------------------------------------------------
     public boolean division(int n1, int n2){
        return n1%n2==0;
     }
    // ---------------------------------------------------------------------------





}

