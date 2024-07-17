package SOLID;

public class Switch {

    LightBulb lightBulb;

    public Switch(){
        lightBulb = new LightBulb();
    }
    public void Flip(){
        if (lightBulb.isOn) lightBulb.turnOff();
        else lightBulb.turnOn();
    }

}
