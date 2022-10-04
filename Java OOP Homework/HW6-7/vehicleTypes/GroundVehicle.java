package vehicleTypes;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;

public abstract class GroundVehicle extends Vehicle {
    private int wheels;
    private static String environment = "Ground";

    
    public GroundVehicle(String brand, String model, Engine engine, Chassis chassis,int maxSpeed, float[] dimensions){
        super(brand, model, engine, chassis, maxSpeed, environment,dimensions);
        
    }
    
    
    
}
