package strings;

import java.util.Scanner;

public class TAsk9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //assume that we capture fullname of a person from some console
        //task: print firstName and lastName separately

        String fullName = sc.nextLine();
        int index = fullName.indexOf(' ');
        String firstName = fullName.substring(0,index);
        String lastName = fullName.substring(index);
        System.out.println("Your first name is: " + firstName + " and " + " Your last name is: " +lastName);
    }
}
