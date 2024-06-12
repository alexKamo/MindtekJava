package oopMAY20.abstractionsMAY21.phone;

public class Iphone extends Phone{
    @Override
    public String takePhoto() {
        return "Iphone is taking photo";
    }

    @Override
    public String call() {
        return "Iphone is calling";
    }

    @Override
    public String upload() {
        return "Iphone is uploading to memory";
    }
}

