package dev.grigory.peaje_y_vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TollStationTest {

    @Test
    public void testNewStationShouldHaveZeroTotal() {
        TollStation station = new TollStation("Estación Central", "Oviedo");
        assertEquals(0, station.getTotalCollected());
    }
    @Test
    public void testStationShouldProcessCarAndAddToTotal() {
        TollStation station = new TollStation("Estación San Lorenzo", "Gijón");
        Car car = new Car("CAR123");
        station.processVehicle(car);
        assertEquals(100, station.getTotalCollected());
    }
    @Test
    public void testStationShouldProcessMotorcycleAndAddToTotal() {
        TollStation station = new TollStation("Estación Xagó", "Avilés");
        Motorcycle moto = new Motorcycle("MOTO321");
        station.processVehicle(moto);
        assertEquals(50, station.getTotalCollected());
    }
    @Test
    public void testStationShouldProcessTruckAndAddToTotal() {
        TollStation station = new TollStation("Estación Campus", "Mieres");
        Truck truck = new Truck("TRK888", 4);
        station.processVehicle(truck);
        assertEquals(200, station.getTotalCollected());
    }
}
