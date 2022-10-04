package representatives_of_vehicle_types;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import vehicleTypes.GroundVehicle;

public class Car extends GroundVehicle {
    private int [] wheelsize;

    public Car(String brand, String model, Engine engine , Chassis chassis, int maxSpeed, float[] dimensions, int[] wheelsize){
        super(brand, model, engine, chassis, maxSpeed, dimensions);
        this.wheelsize = wheelsize;
    }

    @Override
    public String toString(){
        Object i;
        return String.format("Type of vehicle: Car; Environment: %s, Brand: %s, Model: %s, WheelSize: (%d x %d x %d); Seats: %d; MaxSpeed: %d, EngineVolume: %.2f", this.getEnvironment(), 
        brand, model, wheelsize[0], wheelsize[1], wheelsize[2], chassis.getSeats(), this.getMaxspeed(), engine.getVolume());
    }
}
