package dev.grigory.peaje_y_vehiculos;

public class TollCalculator {

    public static int calculate(Car car) {
        return 100;
    }
    public static int calculate(Motorcycle moto) {
        return 50;
    }
    public static int calculate(Truck truck) {
        return 50 * truck.getAxles();
    }
}
