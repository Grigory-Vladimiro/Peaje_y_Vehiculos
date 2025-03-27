package dev.grigory.peaje_y_vehiculos;

public class TollStation {
    private String name;
    private String city;
    private int totalCollected;

    public TollStation(String name, String city) {
        this.name = name;
        this.city = city;
        this.totalCollected = 0;
    }

    public int getTotalCollected() {
        return totalCollected;
    }   
}
