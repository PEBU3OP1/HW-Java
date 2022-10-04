package representatives_of_vehicle_types;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import vehicleTypes.GroundVehicle;

public class Motorbike extends GroundVehicle{
    private String frame;
    private float steering;

    public Motorbike (String brand, String model, String frame, float steering, Engine engine, Chassis chassis, int maxSpeed, float[] dimensions){
        super(brand, model, engine, chassis, maxSpeed,dimensions);
        this.frame = frame;
        this.steering = steering;

    }
    @Override
    public String toString(){
        return String.format("Type of vehicle: Motorbike; Environment: %s, Brand: %s, Model: %s, Frame №: %s; Seats: %d; MaxSpeed: %d, Steering: %f, EngineVolume: %.2f", this.getEnvironment(), 
        brand, model, frame, chassis.getSeats(), this.getMaxspeed(), steering, engine.getVolume());
    }
    
}
