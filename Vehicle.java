package vehicles;

abstract public class Vehicle {
    public String name = "Unknown";

    public Vehicle(String name) {
        this.name = name;
    }

    abstract public void start();

    abstract public void stop();
}