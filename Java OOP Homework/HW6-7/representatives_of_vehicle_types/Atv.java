package representatives_of_vehicle_types;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import vehicleTypes.GroundVehicle;

public class Atv extends GroundVehicle {
    public Atv(String brand, String model, Engine engine, Chassis chassis, int maxSpeed, float[] dimensions){
        super(brand, model, engine, chassis, maxSpeed, dimensions);
    
    }
    @Override
    public String toString(){
        return String.format("Type of vehicle: Car; Environment: %s, Brand: %s, Model: %s, Seats: %d; MaxSpeed: %d, EngineVolume: %.2f", this.getEnvironment(), 
        brand, model, chassis.getSeats(), this.getMaxspeed(), engine.getVolume());
    }
}

