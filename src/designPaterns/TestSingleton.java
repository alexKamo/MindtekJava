package designPaterns;

public class TestSingleton {

    public static void main(String[] args) {

        Loggin ob1 = Loggin.getInstance();
        Loggin ob2 = Loggin.getInstance();
        System.out.println(ob1.equals(ob2));


        DataBaseConnection dbobj = DataBaseConnection.getConnection();
    }


}
