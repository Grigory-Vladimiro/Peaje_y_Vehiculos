package dev.grigory.peaje_y_vehiculos;

import java.util.ArrayList;
import java.util.List;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;

    private List<Object> processedVehicles = new ArrayList<>();

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
    }

    public int getTotalCollected() {
        return totalCollected;
    }   
    public void processVehicle(Car car) {
        int toll = TollCalculator.calculate(car);
        totalCollected += toll;
        processedVehicles.add(car);
    }
    public void processVehicle(Motorcycle moto) {
        int toll = TollCalculator.calculate(moto);
        totalCollected += toll;
        processedVehicles.add(moto);
    }
    public void processVehicle(Truck truck) {
        int toll = TollCalculator.calculate(truck);
        totalCollected += toll;
        processedVehicles.add(truck);
    }
    public List<Object> getAllVehicles() {
        return processedVehicles;
    }
    public void printSummary() {
        System.out.println("=== Toll Station Summary ===");
        for (Object vehicle : processedVehicles) {
            if (vehicle instanceof Car) {
                System.out.println("Car: " + ((Car) vehicle).getPlate());
            } else if (vehicle instanceof Motorcycle) {
                System.out.println("Motorcycle: " + ((Motorcycle) vehicle).getPlate());
            } else if (vehicle instanceof Truck) {
                System.out.println("Truck: " + ((Truck) vehicle).getPlate() + " (" + ((Truck) vehicle).getAxles() + " axles)");
            }
        }
        System.out.println("Total collected: $" + totalCollected);
    }
    public String getName() {
        return name;
    }
    
    public String getCity() {
        return city;
    }
}
