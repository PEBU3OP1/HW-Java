package vehicleTypes;

public abstract class WaterVehicle extends Vehicle{
    protected int displacement;

    public WaterVehicle(String brand, String model, String engine, int displacement){
        super(brand, model, engine);
        this.displacement = displacement;
    }
}
