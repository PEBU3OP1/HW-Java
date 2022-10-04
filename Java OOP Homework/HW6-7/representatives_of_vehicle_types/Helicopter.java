package representatives_of_vehicle_types;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import vehicleTypes.FlyingVehicle;

public class Helicopter extends FlyingVehicle{
    private String purpose;

    public Helicopter(String brand, String model, Engine engine , Chassis chassis, int maxSpeed, float[] dimensions, String purpose){
        super(brand, model, engine, chassis, maxSpeed, dimensions);
        this.purpose = purpose;
    
    }
    @Override
    public String toString(){
        return String.format("Type of vehicle: Helicopter; Environment: %s, Brand: %s, Model: %s, Purpose: %s; Seats: %d; MaxSpeed: %d, EngineVolume: %.2f", this.getEnvironment(), 
        brand, model, purpose, chassis.getSeats(), this.getMaxspeed(), engine.getVolume());
    }
}
