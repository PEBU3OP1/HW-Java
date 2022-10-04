package parts_of_vehicles;

public class Engine {
    private final float volume;
    private final int horsePower;
    private final String fuelType;

    public Engine(float volume, int horsePower, String fuelType){
        this.volume = volume;
        this.horsePower = horsePower;
        this.fuelType = fuelType;
    }
    public float getVolume() {
        return volume;
    }
}
