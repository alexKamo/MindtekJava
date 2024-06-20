package homeworks.hm2;

public class Checker {

    public String check(String input, Generic<String> function) {

        if (input == null || input.isEmpty()) {
            return "Invalid input!";
        }
        int result = function.gen(input);
        String resultString = result + (result > 10 ? " (High)" : " (Low)");
        return resultString;
    }

    public static void main(String[] args) {
        Checker checker = new Checker();

        Generic<String> lengthFunction = x -> x.length();
        String result1 = checker.check("Hello, world!", lengthFunction);
        System.out.println(result1);

        String result2 = checker.check("Hi", lengthFunction);
        System.out.println(result2);

        String result3 = checker.check("", lengthFunction);
        System.out.println(result3);

        String result4 = checker.check(null, lengthFunction);
        System.out.println(result4);
    }

}
