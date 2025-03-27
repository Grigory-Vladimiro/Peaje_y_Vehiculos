package dev.grigory.peaje_y_vehiculos;

import java.util.List;

public class TollReport {
public static void printReport(List<TollStation> stations) {
        int globalTotal = 0;

        for (TollStation station : stations) {
            System.out.println(station.getName() + " (" + station.getCity() + "):");

            for (Object v : station.getAllVehicles()) {
                String type;
                String plate;

                if (v instanceof Car) {
                    type = "Car";
                    plate = ((Car) v).getPlate();
                } else if (v instanceof Motorcycle) {
                    type = "Motorcycle";
                    plate = ((Motorcycle) v).getPlate();
                } else if (v instanceof Truck) {
                    type = "Truck";
                    plate = ((Truck) v).getPlate();
                } else {
                    type = "Unknown";
                    plate = "???";
                }

                System.out.println(" - " + plate + " [" + type + "]");
            }

            int subtotal = station.getTotalCollected();
            System.out.println("Subtotal: $" + subtotal + "\n");
            globalTotal += subtotal;
        }

        System.out.println("TOTAL: $" + globalTotal);
    }
}
