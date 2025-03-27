package dev.grigory.peaje_y_vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test 
    public void testCarShouldHavePlate() {
        Car car = new Car("1234ABC");
        assertEquals("1234ABC", car.getPlate());
    }
}
