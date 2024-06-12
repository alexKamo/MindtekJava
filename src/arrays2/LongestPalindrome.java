package arrays2;

public class LongestPalindrome {
    public static void main(String[] args) {

        String palindromes = "civic kayak racecar mom madam";

        //write the longest palindrome -> racecar

        String[] words = palindromes.split(" ");

        int max = 0;
        // finding maximum length
        for (String palindrome : words){
            // 0<5
            if (max<palindrome.length()){
                max=palindrome.length();
            }
        }
        // finding palindrome that has maximum length
        for (String palindrome: words){
            if (max==palindrome.length()){
                System.out.println(palindrome);
            }
        }

    }
}
