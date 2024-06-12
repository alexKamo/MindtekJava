package oopMAY20.abstractionsMAY21.shapes;

public class Square extends Shape{

    @Override
    public int getPerimeter(){
        return length*4;
    }

    @Override
    public int getArea(){
        return length*width;
    }



}

