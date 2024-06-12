package arrays;

public class Task8 {
    public static void main(String[] args) {
        char[] letters = {'A','B','h','C'};
        //calculate the sum of numeric values of all elements in letters
        int s = 0;

//        for (int i =0; i< letters.length; i++){
//            s+=letters[i];
//        }

        for (char el:letters) s+=el;
        System.out.println("Sum is: "+s);
    }
}
