package SOLID;

public class LightBulb {

    boolean isOn;

    public boolean isOn(){
        return isOn;
    }

    public void turnOn(){
        isOn=true;
        System.out.println("Light is ON now!");
    }

    public void turnOff(){
        isOn=false;
        System.out.println("Light is OFF now!");
    }

}
