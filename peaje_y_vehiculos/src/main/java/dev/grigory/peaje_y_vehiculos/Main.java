package dev.grigory.peaje_y_vehiculos;

import java.util.List;

public class Main { public static void main(String[] args) {
    List<TollStation> stations = List.of(
        new TollStation("Estación Central", "Oviedo"),
        new TollStation("Estación San Lorenzo", "Gijón"),
        new TollStation("Estación Xagó", "Avilés"),
        new TollStation("Estación Campus", "Mieres"),
        new TollStation("Estación Oeste", "Castropol"),
        new TollStation("Estación Final", "Llanes")
    );

    stations.get(0).processVehicle(new Car("OVD001"));
    stations.get(0).processVehicle(new Motorcycle("OVD002"));

    stations.get(1).processVehicle(new Car("GIJ001"));

    stations.get(2).processVehicle(new Motorcycle("AVL001"));

    stations.get(3).processVehicle(new Truck("MRS001", 3));
    stations.get(3).processVehicle(new Car("MRS002"));

    stations.get(4).processVehicle(new Car("CST001"));
    stations.get(4).processVehicle(new Motorcycle("CST002"));
    stations.get(4).processVehicle(new Truck("CST003", 2));

    stations.get(5).processVehicle(new Car("LLN001"));
    stations.get(5).processVehicle(new Motorcycle("LLN002"));
    stations.get(5).processVehicle(new Truck("LLN003", 2));

    TollReport.printReport(stations);
    }
}
