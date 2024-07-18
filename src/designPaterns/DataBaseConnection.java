package designPaterns;

public class DataBaseConnection {

    private static DataBaseConnection obj;

    private DataBaseConnection(){};

    public static DataBaseConnection getConnection(){
        if (obj == null) return new DataBaseConnection();
        return obj;
    }

    public void create(){
        System.out.println("DB create operations");
    }
    public void update(){
        System.out.println("DB update operations");
    }
    public void delete(){
        System.out.println("DB delete operations");
    }


}
