package design_patterns.parking_lot_design;

import java.util.*;

public class ParkingSlot {
    private Vehicle vehicle;
    private int slotId;
    private Set<VehicleType> allowedVehicleTypes;

    public Set<VehicleType> getAllowedVehicleTypes() {
        return allowedVehicleTypes;
    }

    public ParkingSlot(int slotId, Set<VehicleType> allowedVehicleTypes) {
        this.slotId = slotId;
        this.allowedVehicleTypes = allowedVehicleTypes;
    }

    public int getSlotId() {
        return slotId;
    }

    public boolean parkAtSlot(Vehicle v) {
        if(!canParkVehicle()) {
            return false;
        }

        if(!allowedVehicleTypes.contains(v.getVehicleType())) {
            System.out.println("can not park the vehicle " + v.getVehicleNumber() + " as slot is of different type");
            return false;
        }

        vehicle = v;
        return true;
    }

    public boolean vacateSlot() {
        if(this.vehicle == null) {
            return false;
        }

        this.vehicle = null;
        return true;
    }

    public boolean canParkVehicle() {
        return this.vehicle == null;
    }

}
