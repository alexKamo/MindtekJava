package objects;

public class Student {

    //            TEMPLATE  /  BLUEPRINT

    // Attributes / Instance Variables / Fields
    // Methods / Action

    // Attributes
    String name;
    int id;
    String location;

    // Action Methods
    public String study(){
        return name+" is studying";
    }

    public String attendingClass(){
        return name+" is attending class from "+location;
    }



}
