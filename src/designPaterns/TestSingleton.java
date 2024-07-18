package designPaterns;

public class TestSingleton {

    public static void main(String[] args) {

        Loggin ob1 = new Loggin();
        Loggin ob2 = new Loggin();
        System.out.println(ob1.equals(ob2));

    }


}
