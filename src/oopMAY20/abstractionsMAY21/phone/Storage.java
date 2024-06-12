package oopMAY20.abstractionsMAY21.phone;

public interface Storage {

    int PHONEMEMORY=256;

    String upload();

    //static method
    public static String share(){
        return "Phone can share media";
    }

    //regular method
    default String delete(){
        return "Memory is deleting...";
    }


}

