package com.driver;

public interface Boat extends WaterVehicle {
    String name="";
    int capacity=0;

    default String getVehicleName(){
        return this.name;
    }
    default int getVehicleCapacity(){
        return this.capacity;
    }
}
