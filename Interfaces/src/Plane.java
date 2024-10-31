package Interfaces.src;

public class Plane implements Vehicle {
    public String model;

    public Plane (String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println(String.format("Plane %s starts its engine!", this.model));
    }

    public void killEngine() {
        System.out.println(String.format("Plane %s kills the engine", this.model));
    }

    public String getModel() {
        return model;
    }
}
