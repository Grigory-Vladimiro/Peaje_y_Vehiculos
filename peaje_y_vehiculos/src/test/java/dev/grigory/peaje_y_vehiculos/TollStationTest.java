package dev.grigory.peaje_y_vehiculos;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TollStationTest {

    @Test
    public void testNewStationShouldHaveZeroTotal() {
        TollStation station = new TollStation("Estación Central", "Oviedo");
        assertEquals(0, station.getTotalCollected());
    }
}
