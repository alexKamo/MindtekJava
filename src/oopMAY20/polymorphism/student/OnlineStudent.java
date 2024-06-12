package oopMAY20.polymorphism.student;

public class OnlineStudent implements Student{


    @Override
    public String study() {
        return "Online student is studying from home.";
    }

    public String doHomework(){
        return "Online student is doing homework";
    }


}

