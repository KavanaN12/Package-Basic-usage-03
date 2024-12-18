package vehicles.types;

import vehicles.Vehicle;

public class Bike extends Vehicle {

    public Bike(String name) {
        super(name);
    }

    public void start() {
        System.out.print("Bike - start ");
        KickStart();
    }

    public void KickStart() {
        System.out.println("Kick Starting...");
    }

    public void stop() {
        System.out.print("Bike - stop ");
        stopWithBrake();
    }

    public void stopWithBrake() {
        System.out.println("Stopping with Brake...");
    }
}
