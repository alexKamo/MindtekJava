package arrays2;


public class NameToEmail {
    public static void main(String[] args) {

        String[] names = {"John Doe","Patel Harsh","Kim Yan","Brat Pitt"};

        /*
         John Doe -> john.d@mindtek.io
         */
        for (String n : names) {
            String[] slash = n.split(" "); // {"John"},{"Doe"}
            String fname = slash[0].toLowerCase(), lname = slash[1].toLowerCase();
            String email = fname + "." + lname.charAt(0) + "@mindtek.io";
            System.out.println(n + " : " + email);
        }



    }
}

