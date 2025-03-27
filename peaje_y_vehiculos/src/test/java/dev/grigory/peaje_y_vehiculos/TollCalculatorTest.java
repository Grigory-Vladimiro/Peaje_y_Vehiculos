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
}
