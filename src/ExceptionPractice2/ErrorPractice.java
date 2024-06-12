package ExceptionPractice2;

public class ErrorPractice {

    // METHOD RECURSION -> looping non stop method

    public static void method(){
        System.out.println("Running method...");
        method();
    }

    public static void main(String[] args) {

        // JAVA RECOMMENDS TO NOT HANDLE ERRORS
    //    try {
            method();
    //    }catch (StackOverflowError e){
    //        System.out.println("There was an error...");
    //    }
    }

}

