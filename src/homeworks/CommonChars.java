package homeworks;

public class CommonChars {
    /*
    Write a method that accepts two Strings as a parameters and returns common characters.

        Example:
        .commonChars("Code", "Mode");  returns "ode";
        .commonChars("Bunny", "Sun");  returns "un";
        .commonChars("Hot", "Cold");  returns "o";
     */

    public static String commonChars(String str1, String str2) {
        StringBuilder stb = new StringBuilder();

        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        for (int i = 0; i < str1.length(); i++) {
            char c = str1.charAt(i);
            if (str2.contains(String.valueOf(c)) && stb.indexOf(String.valueOf(c)) == -1) {
                stb.append(c);
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        System.out.println(commonChars("Code", "Mode"));
        System.out.println(commonChars("Bunny", "Sun"));
        System.out.println(commonChars("Hot", "Cold"));
    }

}
