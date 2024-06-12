package oopMAY20.abstractionsMAY21.phone;

public class TestPhones {

    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        Samsung samsung = new Samsung();

        System.out.println(iphone.call());
        System.out.println(CloudStorage.CLOUDMEMORY);

        System.out.println(samsung.takePhoto());



    }

}

