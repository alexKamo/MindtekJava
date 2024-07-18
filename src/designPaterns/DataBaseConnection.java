package designPaterns;

public class DataBaseConnection {

    private static DataBaseConnection obj;

    private DataBaseConnection(){};

    public static DataBaseConnection getConnection(){
        if (obj == null) return new DataBaseConnection();
        return obj;
    }

}
