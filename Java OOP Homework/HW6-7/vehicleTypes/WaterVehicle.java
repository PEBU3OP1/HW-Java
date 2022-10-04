package vehicleTypes;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;

public abstract class WaterVehicle extends Vehicle{
    protected int displacement;
    protected static String environment = "Water";
    public WaterVehicle(String brand, String model, Engine engine, Chassis chassis,int maxSpeed, int displacement, float[] dimensions){
        super(brand, model, engine, chassis, maxSpeed, environment, dimensions);
        this.displacement = displacement;
       
    }
   
}
