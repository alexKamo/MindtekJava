package oopMAY20.abstractionsMAY21.phone;

public class Samsung extends Phone{
    @Override
    public String takePhoto() {
        return "Samsung is taking photo";
    }

    @Override
    public String call() {
        return "Samsung is calling";
    }

    @Override
    public String upload() {
        return "Samsung is uploading to memory";
    }
}
