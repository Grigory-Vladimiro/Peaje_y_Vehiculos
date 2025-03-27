package dev.grigory.peaje_y_vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

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
    @Test
    public void testStationShouldStoreAllProcessedVehicles() {
        TollStation station = new TollStation("Estación Oeste", "Castropol");
        Car car = new Car("CAR1");
        Motorcycle moto = new Motorcycle("MOTO1");
        Truck truck = new Truck("TRK1", 2);

        station.processVehicle(car);
        station.processVehicle(moto);
        station.processVehicle(truck);

        var vehicles = station.getAllVehicles();

        assertEquals(3, vehicles.size());
        assertTrue(vehicles.contains(car));
        assertTrue(vehicles.contains(moto));
        assertTrue(vehicles.contains(truck));
    }
    @Test
    public void testPrintSummaryShouldIncludeVehiclesAndTotal() {
        TollStation station = new TollStation("Estación Final", "Llanes");
        station.processVehicle(new Car("CARX"));
        station.processVehicle(new Motorcycle("MOTOX"));
        station.processVehicle(new Truck("TRUCKX", 2));

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        station.printSummary();

        String output = outContent.toString();

        assertTrue(output.contains("CARX"));
        assertTrue(output.contains("MOTOX"));
        assertTrue(output.contains("TRUCKX"));
        assertTrue(output.contains("Total recaudado: 200"));

        System.setOut(System.out);
    }
}
