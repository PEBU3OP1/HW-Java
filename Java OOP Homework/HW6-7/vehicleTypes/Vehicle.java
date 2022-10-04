package vehicleTypes;

import Interfaces.mainInterface;
import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;

/**
 * Vehicle
 */
public abstract class Vehicle implements mainInterface{

    // BMW G 310 R - мотоцикл
    // KAWASAKI NINJA 400 - мотоцикл
    // SUZUKI SV650 ABS (SV650A)- мотоцикл
    // YAMAHA XJ6 - мотоцикл
    // BMW F 800 GT- мотоцикл
    // HARLEY-DAVIDSON SUPERLOW- мотоцикл
    // Ford Fiesta - автомобиль
    // Kia Picanto- автомобиль
    // Infiniti QX60- автомобиль
    // Nissan Juke- автомобиль
    // Audi А3- автомобиль
    // Lexus ES 200- автомобиль
    // Honda Talon 1000X- автомобиль
    // RM 800 DUO - квадроцикл
    // Stels ATV 650 Guepard ST - квадроцикл
    // Yamaha YFZ450R SE - квадроцикл
    // CFMOTO CFORCE 600 S EPS - квадроцикл
    // Polaris Sportsman 570 - квадроцикл
    // SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
    // YAMAHA FX CRUISER SVHO - гидроцикл
    // SEA-DOO SPARK TRIXX 3UP- гидроцикл
    // GEN H-4 - вертолет
    // Air Scooter 2  - вертолет
    // Dynali H2S  - вертолет
    // DF Helicopters DF334  - вертолет

    protected int maxspeed;
    protected float weight;
    protected float[] dimensions = {0,0,0};
    protected String brand;
    protected String model;
    protected String environment;
    protected final Engine engine;
    protected final Chassis chassis;

    public Vehicle(String brand, String model, Engine engine , Chassis chassis, int maxSpeed, String environment, float[] dimensions){
        this.brand = brand;
        this.model = model;
        this.engine = engine;
        this.chassis = chassis;
        this.maxspeed = maxSpeed;
        this.environment =environment;
        this.dimensions = dimensions;


    }
    @Override
    public int getMaxspeed() {
        
        return this.maxspeed;
    }
    @Override
    public String getEnvironment() {
        
        return this.environment;
    }
    

}