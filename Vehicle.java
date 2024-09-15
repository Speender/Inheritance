import java.util.Random;

// Superclass || Parent class
public class Vehicle {
    // Vehicle attributes
    String brand;
    int speed = 0;
    int fuel = 0;
    String color;

    // Constructor to initialize a vehicle
    public Vehicle(String brand, int speed, int fuel, String color) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.color = color;
    }

    // Method to simulate vehicle movement
    public void move() {
        System.out.println(brand + " is now moving at " + speed + " km/h");
    }

    // Method to simulate vehicle stop
    public void stop() {
        System.out.println(brand + " has stopped");
    }

    // Method to refuel the vehicle
    public void refuel(int amount) {
        fuel += amount;
        System.out.println(brand + " has refueled " + amount + "L");
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + "km/h");
        System.out.println("Fuel : " + fuel + "L");
        System.out.println("Color : " + color);
    }

    // Method for design separator
    public void design() {
        System.out.println("=====================================");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    // Motorcycle-specific attributes
    private int engineDisplacement;
    private int weight;

    public Motorcycle(String brand, int speed, int fuel, String color, int engineDisplacement, int weight) {
        super(brand, speed, fuel, color);
        this.engineDisplacement = engineDisplacement;
        this.weight = weight;
    }

    // Method to simulate banking
    public void banking() {
        System.out.println("The " + brand + " is now banking at 45°");
    }

    // Method to simulate a wheelie
    public void wheelie() {
        System.out.println("The " + brand + " is now doing wheelies!");
    }

    // Override displayDetails to show motorcycle-specific information
    @Override
    public void displayDetails() {
        super.design();
        System.out.println("MOTORCYCLE DETAILS");
        super.displayDetails();
        System.out.println("Engine Displacement: " + engineDisplacement + "CC");
        System.out.println("Weight: " + weight + "kg");

    }
}

// Car subclass
class Car extends Vehicle {
    // Car-specific attributes
    private String type;
    private String transmission;

    public Car(String brand, int speed, int fuel, String color, String type, String transmission) {
        super(brand, speed, fuel, color);
        this.type = type;
        this.transmission = transmission;
    }

    // Method to open/close car door
    public void toggleDoor(boolean door) {
        System.out.println(door ? "The door is now open" : "The door has been closed");
    }

    // Method to toggle car wipers
    public void toggleWiper(boolean wiper) {
        System.out.println(wiper ? "The wiper has been turned on" : "The wiper has been turned off");
    }

    // Override displayDetails to show car-specific information
    @Override
    public void displayDetails() {
        super.design();
        System.out.println("CAR DETAILS");
        super.displayDetails();
        System.out.println("Vehicle Type: " + type);
        System.out.println("Transmission: " + transmission);
    }
}

// Bus subclass
class Bus extends Vehicle {
    // Bus-specific attributes
    private String type;
    private String route;

    public Bus(String brand, int speed, int fuel, String color, String type, String route) {
        super(brand, speed, fuel, color);
        this.type = type;
        this.route = route;
    }

    // Method to simulate picking up passengers
    public void pickUpPassenger() {
        Random rand = new Random();
        int rand1 = rand.nextInt(30);
        System.out.println("The bus has picked up " + rand1 + (rand1 > 1 ? " passengers" : " passenger"));
    }

    // Method to calculate remaining distance to destination
    public void destination() {
        Random rand = new Random();
        int rand1 = rand.nextInt(250);
        System.out.println(rand1 == 0 ? "We have arrived at our destination" : rand1 + " km remaining in our journey until we reach our destination");
        super.design();
    }

    // Override displayDetails to show bus-specific information
    @Override
    public void displayDetails() {
        super.design();
        System.out.println("BUS DETAILS");
        super.displayDetails();
        System.out.println("Bus Type: " + type);
        System.out.println("Bus Route: " + route);
    }
}
