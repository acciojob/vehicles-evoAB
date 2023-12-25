package com.driver;

class Boat implements WaterVehicle {
    String name="";
    int capacity=0;

    @Override
    public String getVehicleName(){
        return this.name;
    }
    @Override
    public int getVehicleCapacity(){
        return this.capacity;
    }
}
