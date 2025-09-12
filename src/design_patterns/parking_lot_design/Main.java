package design_patterns.parking_lot_design;

public class Main {
    public static void main(String[] args) {
        ParkingManager parkingManager = new ParkingManager();
        Vehicle v1 = new Vehicle("car1", VehicleType.CAR);
        Vehicle v2 = new Vehicle("bike1", VehicleType.BIKE);
        Vehicle v3 = new Vehicle("truck", VehicleType.TRUCK);

        parkingManager.parkVehicle(v1);
        parkingManager.parkVehicle(v2);
        parkingManager.parkVehicle(v3);
        parkingManager.unparkVehicle(v1);
    }
}
