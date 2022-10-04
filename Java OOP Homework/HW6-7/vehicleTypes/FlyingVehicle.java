package vehicleTypes;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;

public abstract class FlyingVehicle extends Vehicle {
    private int wheels;
    protected static String environment = "Air";
    int maxAltitude;
    int crew;

public FlyingVehicle(String brand, String model, Engine engine, Chassis chassis,int maxSpeed, float[] dimensions){
    super(brand, model, engine, chassis, maxSpeed, environment, dimensions);
}

    
}