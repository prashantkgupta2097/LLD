package design_patterns.parking_lot_design;

public class Vehicle {
    private String vehicleNumber;
    private VehicleType vehicleType;

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public Vehicle(String vehicleNumber, VehicleType type) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = type;
    }

    public String getVehicleNumber() {
        return this.vehicleNumber;
    }
}

