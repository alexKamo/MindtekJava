package arrays;

import javax.swing.plaf.basic.BasicArrowButton;
import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        /*
        create arr which hold 5 string elements
        then print it
        the add elements: "java", "python", "c++", "JS", "c#"
        print again
         */
        String[] language = new String[5];
        System.out.println(Arrays.toString(language));

        language[0] = "java";
        System.out.println(Arrays.toString(language));
        language[1] = "python";
        System.out.println(Arrays.toString(language));
        language[2] = "c++";
        System.out.println(Arrays.toString(language));
        language[3] = "c#";
        System.out.println(Arrays.toString(language));
        language[4] = "JS";
        System.out.println(Arrays.toString(language));

        String[] language2 = new String[]{"java", "python", "js", "c#", "c++"};
        System.out.println(Arrays.toString(language2));

        //make every element from arr all uppercase
        for (int i = 0; i<language.length; i++)
            language[i]=language[i].toUpperCase();
            System.out.println(Arrays.toString(language));

    }
}
