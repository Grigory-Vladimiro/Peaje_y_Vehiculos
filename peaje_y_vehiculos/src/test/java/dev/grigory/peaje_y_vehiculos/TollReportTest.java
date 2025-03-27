package dev.grigory.peaje_y_vehiculos;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.junit.jupiter.api.Test;

public class TollReportTest {
@Test
public void testTollReportShouldPrintSummary() {
    TollStation s = new TollStation("Test", "Nowhere");
    s.processVehicle(new Car("ABC123"));
    s.processVehicle(new Motorcycle("MOTO9"));
    s.processVehicle(new Truck("TRK5", 2)); 

    ByteArrayOutputStream out = new ByteArrayOutputStream();
    System.setOut(new PrintStream(out));

    TollReport.printReport(List.of(s));

    String output = out.toString();

    assertTrue(output.contains("ABC123"));
    assertTrue(output.contains("MOTO9"));
    assertTrue(output.contains("TRK5"));
    assertTrue(output.contains("Subtotal: $250"));
    assertTrue(output.contains("TOTAL: $250"));

    System.setOut(System.out);
    }
}
