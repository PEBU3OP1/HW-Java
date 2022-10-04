package representatives_of_vehicle_types;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import vehicleTypes.WaterVehicle;

public class Hydrocycle extends WaterVehicle {
    int aquatoria;

    public Hydrocycle (String brand, String model, Engine engine , Chassis chassis, int displacement, int maxSpeed, float[] dimensions, int aquatoria){
        super(brand, model, engine, chassis, displacement, maxSpeed, dimensions);
        this.aquatoria = aquatoria;
    }
    @Override
    public String toString(){
        return String.format("Type of vehicle: Hydrocycle; Environment: %s, Brand: %s, Model: %s; Seats: %d; MaxSpeed: %d, EngineVolume: %.2f", this.getEnvironment(), 
        brand, model, chassis.getSeats(), this.getMaxspeed(), engine.getVolume());
    }
    
}