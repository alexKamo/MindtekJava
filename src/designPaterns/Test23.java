package designPaterns;

public class Test23 {

    public void testConnection(){
        DataBaseConnection dbObj = DataBaseConnection.getConnection();
        System.out.println(dbObj);
    }

}
