package stringbuilder;

public class RemoveDuplicates {

    /*
    .removeDupChars("Hello"); -> return "Helo"
    .removeDupChars("Java"); -> return "Jav"
     */

    public String removeDupChars(String str) {
        StringBuilder stb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i,i+1).equals(" ") || stb.indexOf(str.substring(i, i + 1)) == -1) {
                stb.append(str.charAt(i));
            }
        }
        return stb.toString();
    }

    public static void main(String[] args) {
        RemoveDuplicates dup = new RemoveDuplicates();
        System.out.println(dup.removeDupChars("Hello World"));
        System.out.println(dup.removeDupChars("Java is my passion"));
    }
}

