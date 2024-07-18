package designPaterns;

public class Loggin {

    private static Loggin obj = new Loggin();

    //no one can call this constructor
    private Loggin(){}

    public static Loggin getInstance(){
        return obj;
    }

    public void log(String text){
        System.out.println(text);
    }

}
