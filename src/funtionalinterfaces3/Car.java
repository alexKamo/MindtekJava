package funtionalinterfaces3;

public class Car {

    private String model;
    private int tear;
    private String color;
    private String type;

    public Car(String model, int tear, String color, String type) {
        this.model = model;
        this.tear = tear;
        this.color = color;
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getTear() {
        return tear;
    }

    public void setTear(int tear) {
        this.tear = tear;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", tear=" + tear +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
