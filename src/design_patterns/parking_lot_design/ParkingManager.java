package design_patterns.parking_lot_design;

import java.util.*;

public class ParkingManager {
    private List<ParkingSlot> slots;
    private Map<Vehicle, ParkingSlot> vehicleParkingSlotMap;

    public ParkingManager() {
        this.slots = new ArrayList<>();
        slots.add(new ParkingSlot(1, new HashSet<>(Arrays.asList(VehicleType.BIKE, VehicleType.CAR, VehicleType.TRUCK))));
        slots.add(new ParkingSlot(2, new HashSet<>(Arrays.asList(VehicleType.BIKE, VehicleType.CAR))));
        slots.add(new ParkingSlot(3, new HashSet<>(Arrays.asList(VehicleType.BIKE))));
        this.vehicleParkingSlotMap = new HashMap<>();
    }

    public ParkingSlot parkVehicle(Vehicle v) {
        ParkingSlot validSlot = slots.stream().filter(slot -> slot.canParkVehicle() && slot.getAllowedVehicleTypes().contains(v.getVehicleType())).findFirst().orElse(null);
        if(validSlot == null) {
            System.out.println("no valid slot found for the vehicle type " + v.getVehicleType());
            return null;
        }
        vehicleParkingSlotMap.put(v, validSlot);
        validSlot.parkAtSlot(v);
        System.out.println("vehicle: " + v.getVehicleNumber() + " parked at slot" + validSlot.getSlotId());
        return validSlot;

    }

    public ParkingSlot unparkVehicle(Vehicle v) {
        ParkingSlot slot = vehicleParkingSlotMap.getOrDefault(v, null);
        if(slot == null) {
            System.out.println("vehicle not found, cannot unpark");
            return null;
        }
        slot.vacateSlot();
        vehicleParkingSlotMap.remove(v);
        System.out.println("slot: " + slot.getSlotId() + " is empty now");
        return slot;
    }
}
