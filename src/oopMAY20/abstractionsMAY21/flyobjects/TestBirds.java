package oopMAY20.abstractionsMAY21.flyobjects;

public class TestBirds {

    public static void main(String[] args) {

        // interface can NOT be instantiated (create object)
        // Flyable flyable = new Flyable();

        Eagle   eagle = new Eagle();

        System.out.println(eagle.fly());
        System.out.println(eagle.makeNoise());


    }
}

