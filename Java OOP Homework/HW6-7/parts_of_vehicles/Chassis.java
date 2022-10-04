package parts_of_vehicles;

public class Chassis {
    private final int seats;
    private final int load_capacity;
    private final int fuel_tank;
    private final int wheel_formula;
    private final int driving_wheels;
    
    public Chassis(int seats, int load_capacity, int fuel_tank, int wheel_formula, int driving_wheels) {
        
        this.seats = seats;
        this.load_capacity = load_capacity;
        this.fuel_tank = fuel_tank;
        this.wheel_formula = wheel_formula;
        this.driving_wheels = driving_wheels;
        
    }

    
    public int getSeats() {
        return seats;
    }
}
