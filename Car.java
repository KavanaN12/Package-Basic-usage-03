package vehicles.types;

import vehicles.Vehicle;

public class Car extends Vehicle {

    public Car(String name) {
        super(name);
    }

    public void start() {
        System.out.print("Car - Starting...");
        enableAirConditioner();
    }

    public void enableAirConditioner() {
        System.out.println("Air Conditioner Enabled...");
    }

    public void stop() {
        System.out.print("Car - Stoping...");
        disableAirConditioner();
    }

    public void disableAirConditioner() {
        System.out.println("Air Conditioner Disabled...");
    }
}
