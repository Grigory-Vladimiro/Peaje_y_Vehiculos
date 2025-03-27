package dev.grigory.peaje_y_vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TollCalculatorTest {

    @Test
    public void testCarShouldPay100() {
        Car car = new Car("1234ABC");
        int toll = TollCalculator.calculate(car);
        assertEquals(100, toll);
    }
    @Test
    public void testMotorcycleShouldPay50() {
        Motorcycle moto = new Motorcycle("MOTO567");
        int toll = TollCalculator.calculate(moto);
        assertEquals(50, toll);
    }
    @Test
    public void testTruckShouldPay50PerAxle() {
        Truck truck = new Truck("TRK999", 3); 
        int toll = TollCalculator.calculate(truck);
        assertEquals(150, toll);
    }
}
