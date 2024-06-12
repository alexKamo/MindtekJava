package oopMAY20.abstractionsMAY21.flyobjects;

public class Bird implements Flyable, Noise{


    @Override
    public String fly() {
        return "Bird is flying...";
    }

    @Override
    public String makeNoise() {
        return "Chik chirik";
    }
}

