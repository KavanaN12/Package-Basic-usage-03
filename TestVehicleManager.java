import vehicles.manager.*;
import vehicles.types.*;

public class TestVehicleManager {
    public static void main(String[] args) {
        VehicleManager v = new VehicleManager();
        Bike b = new Bike("Splender");
        v.add(b);
        b.start();
        b.stop();
        Car c = new Car("BMW");
        v.add(c);
        c.start();
        c.stop();
        v.add(c);
        v.add(b);
        VehicleManager.displaylist();
    }
}