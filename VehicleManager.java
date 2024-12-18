package vehicles.manager;

import java.util.ArrayList;
import java.util.List;
import java.lang.Class;
import java.lang.reflect.Method;

import vehicles.types.*;
import vehicles.Vehicle;

public class VehicleManager {
    static List<Vehicle> v = new ArrayList<>(10);

    public void add(Vehicle c) {
        boolean key = false;
        for (int i = 0; i < v.size(); i++) {
            if (c == v.get(i)) {
                key = true;
            }
        }
        if (key == false) {
            System.out.println("Added: " + c.name);
            v.add(c);
        }
    }

    public static void displaylist() {
        for (Vehicle each : v) {
            System.out.println();
            System.out.println(each.name);
            Method[] key = each.getClass().getDeclaredMethods();
            for (Method m : key) {
                System.out.print(m.getName());
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
