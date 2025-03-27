package dev.grigory.peaje_y_vehiculos;

public class Truck {
    private String plate;
    private int axles;

    public Truck(String plate, int axles) {
        this.plate = plate;
        this.axles = axles;
    }

    public String getPlate() {
        return plate;
    }

    public int getAxles() {
        return axles;
    }
}
