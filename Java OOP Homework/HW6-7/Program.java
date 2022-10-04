import java.util.ArrayList;
import java.util.List;

import parts_of_vehicles.Chassis;
import parts_of_vehicles.Engine;
import representatives_of_vehicle_types.Atv;
import representatives_of_vehicle_types.Car;
import representatives_of_vehicle_types.Helicopter;
import representatives_of_vehicle_types.Hydrocycle;
import representatives_of_vehicle_types.Motorbike;

public class Program {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        List<Atv> atvs = new ArrayList<>();
        List<Helicopter> copters = new ArrayList<>();
        List<Hydrocycle> cycles = new ArrayList<>();
        List<Motorbike> bikes = new ArrayList<>();

        // BMW G 310 R - мотоцикл
        // KAWASAKI NINJA 400 - мотоцикл
        // SUZUKI SV650 ABS (SV650A)- мотоцикл
        // YAMAHA XJ6 - мотоцикл
        // BMW F 800 GT- мотоцикл
        // HARLEY-DAVIDSON SUPERLOW- мотоцикл

        bikes.add(new Motorbike("BMW", "G 310 R", "256.1f", 21.1f, new Engine(0.8f, 125, "petrol"),
                new Chassis(2, 330, 20, 2, 2), 220, new float[] { 1.1f, 0.8f, 1.3f }));
        bikes.add(new Motorbike("KAWASAKI", "NINJA 400", "256.1f", 21.1f, new Engine(0.4f, 112, "petrol"),
                new Chassis(2, 330, 20, 2, 2), 220, new float[] { 1.11f, 0.9f, 1.3f }));
        bikes.add(new Motorbike("YAMAHA", "XJ6", "016.1f", 21.1f, new Engine(0.5f, 100, "petrol"),
                new Chassis(2, 330, 20, 2, 2), 330, new float[] { 1.2f, 0.7f, 1.3f }));
        bikes.add(new Motorbike("BMW", "F 800 GT", "012.1f", 21.1f, new Engine(1.0f, 330, "petrol"),
                new Chassis(2, 330, 20, 2, 2), 400, new float[] { 1.2f, 0.7f, 1.3f }));
        bikes.add(new Motorbike("HARLEY-DAVIDSON", "SUPERLOW", "012.1f", 21.1f, new Engine(1.0f, 330, "petrol"),
                new Chassis(2, 330, 20, 2, 2), 150, new float[] { 2.2f, 1.7f, 1.3f }));

        // Ford Fiesta - автомобиль
        // Kia Picanto- автомобиль
        // Infiniti QX60- автомобиль
        // Nissan Juke- автомобиль
        // Audi А3- автомобиль
        // Lexus ES 200- автомобиль
        // Honda Talon 1000X- автомобиль

        cars.add(new Car("Ford", "Fiesta", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));
        cars.add(new Car("Kia", "Picanto", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));
        cars.add(new Car("Infiniti", "QX60", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));
        cars.add(new Car("Nissan", "Juke", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));
        cars.add(new Car("Lexus", "ES200", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));
        cars.add(new Car("Honda", "Talon 1000X", new Engine(1.4f, 100, "petrol"),
                new Chassis(4, 1230, 40, 4, 2), 200, new float[] { 3.2f, 2.7f, 2.3f }, new int[] { 220, 45, 17 }));

        // RM 800 DUO - квадроцикл
        // Stels ATV 650 Guepard ST - квадроцикл
        // Yamaha YFZ450R SE - квадроцикл
        // CFMOTO CFORCE 600 S EPS - квадроцикл
        // Polaris Sportsman 570 - квадроцикл
        atvs.add(new Atv("RM", "800 DUO", new Engine(0.7f, 22, "petrol"),
                new Chassis(2, 300, 22, 4, 4), 80, new float[] { 3.2f, 2.7f, 2.3f }));
        atvs.add(new Atv("Stels", "Guepard", new Engine(0.7f, 22, "petrol"),
                new Chassis(2, 300, 22, 4, 4), 80, new float[] { 3.2f, 2.7f, 2.3f }));
        atvs.add(new Atv("Yamaha", "YFZ450R", new Engine(0.7f, 22, "petrol"),
                new Chassis(2, 300, 22, 4, 4), 80, new float[] { 3.2f, 2.7f, 2.3f }));
        atvs.add(new Atv("CFMOTO", "CFORCE", new Engine(0.7f, 22, "petrol"),
                new Chassis(2, 300, 22, 4, 4), 80, new float[] { 3.2f, 2.7f, 2.3f }));
        atvs.add(new Atv("Polaris", "Sportsman 570", new Engine(0.7f, 22, "petrol"),
                new Chassis(2, 300, 22, 4, 4), 80, new float[] { 3.2f, 2.7f, 2.3f }));

        // SEA-DOO PERFORMANCE RXP-X 300 - гидроцикл
        // YAMAHA FX CRUISER SVHO - гидроцикл
        // SEA-DOO SPARK TRIXX 3UP- гидроцикл
        cycles.add(new Hydrocycle("SEA-DOO", "PERFORMANCE", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 4, 4), 200, 30, new float[] { 3.2f, 4.7f, 21.3f }, 300));
        cycles.add(new Hydrocycle("YAMAHA", "FX CRUISER SVHO", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 4, 4), 200, 30, new float[] { 3.2f, 4.7f, 21.3f }, 300));
        cycles.add(new Hydrocycle("SEA-DOO", "SPARK TRIXX 3UP", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 4, 4), 200, 30, new float[] { 3.2f, 4.7f, 21.3f }, 300));

        // GEN H-4 - вертолет
        // Air Scooter 2 - вертолет
        // Dynali H2S - вертолет
        // DF Helicopters DF334 - вертолет

        copters.add(new Helicopter("GEN", "H-4", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 3, 0), 330, new float[] { 13.2f, 4.7f, 21.3f }, "military"));
        copters.add(new Helicopter("Air Scooter", "2", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 3, 0), 330, new float[] { 13.2f, 4.7f, 21.3f }, "civic"));
        copters.add(new Helicopter("Dynali", "H2S", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 3, 0), 330, new float[] { 13.2f, 4.7f, 21.3f }, "civic"));
        copters.add(new Helicopter("DF Helicopters", "DF334", new Engine(1.7f, 62, "kerosine"),
                new Chassis(2, 300, 22, 3, 0), 330, new float[] { 13.2f, 4.7f, 21.3f }, "military"));

        for (Motorbike motorbike : bikes) {
            System.out.println(motorbike.toString());
        }
        System.out.println();
        for (Atv atv : atvs) {
            System.out.println(atv.toString());
        }
        System.out.println();
        for (Helicopter copter : copters) {
            System.out.println(copter.toString());
        }
        System.out.println();
        for (Car car : cars) {
            System.out.println(car.toString());
        }
        System.out.println();
        for (Hydrocycle cycle : cycles) {
            System.out.println(cycle.toString());
        }
    }
}
