import java.util.Random;

// Superclass || Parent class
public class Vehicle {
    String brand;
    int speed = 0;
    int fuel = 0;
    String color;

    public Vehicle(String brand, int speed, int fuel, String color) {
        this.brand = brand;
        this.speed = speed;
        this.fuel = fuel;
        this.color = color;
    }

    public void move() {
        System.out.println(brand + " is now moving at " + speed + " km/h");
    }

    public void stop() {
        System.out.println(brand + " has stopped");
    }

    public void refuel(int amount) {
        fuel += amount;
        System.out.println(brand + " has refueled " + amount + "L");
    }

    public void displayDetails() {
        System.out.println("Brand : " + brand);
        System.out.println("Speed : " + speed + "km/h");
        System.out.println("Fuel : " + fuel + "L");
        System.out.println("Color : " + color);
    }
    public void design(){
        System.out.println("=====================================");
    }
}

// Motorcycle subclass
class Motorcycle extends Vehicle {
    private int engineDisplacement;
    private int weight;

    public Motorcycle(String brand, int speed, int fuel, String color, int engineDisplacement, int weight) {
        super(brand, speed, fuel, color);
        this.engineDisplacement = engineDisplacement;
        this.weight = weight;
    }

    public void banking() {
        super.design();
        System.out.println("The " + brand + " is now banking at 45°");
    }

    public void wheelie() {
        System.out.println("The " + brand + " is now doing wheelies!");
    }

    public void displayDetails() {
        super.design();
        System.out.println("MOTORCYLE DETAILS");
        super.displayDetails();
        System.out.println("Engine Displacement: " + engineDisplacement + "CC");
        System.out.println("Weight: " + weight + "kg");
        super.design();
    }
}

// Car subclass
class Car extends Vehicle {
    private String type;
    private String transmission;

    public Car(String brand, int speed, int fuel, String color, String type, String transmission) {
        super(brand, speed, fuel, color);
        this.type = type;
        this.transmission = transmission;
    }

    public void toggleDoor(boolean door) {
        System.out.println(door ? "The door is now open" : "The door has been closed");
    }

    public void toggleWiper(boolean wiper) {
        System.out.println(wiper ? "The wiper has been turned on" : "The wiper has been turned off");
    }

    public void displayDetails() {
        super.design();
        System.out.println("CAR DETAILS");
        super.displayDetails();
        System.out.println("Vehicle Type: " + type);
        System.out.println("Transmission: " + transmission);
        super.design();
    }
}

// Bus subclass
class Bus extends Vehicle {
    private String type;
    private String route;

    public Bus(String brand, int speed, int fuel, String color, String type, String route) {
        super(brand, speed, fuel, color);  
        this.type = type;
        this.route = route;
    }

    public void pickUpPassenger() {
        Random rand = new Random();
        int rand1 = rand.nextInt(30);
        System.out.println("The bus has picked up " + rand1 + (rand1 > 1 ? " passengers" : " passenger"));
    }

    public void destination() {
        Random rand = new Random();
        int rand1 = rand.nextInt(250);  
        System.out.println(rand1 == 0 ? "We have arrived at our destination" : rand1 + " km remaining in our journey until we reach our destination");
    }

    public void displayDetails() {
        super.design();
        System.out.println("BUS DETAILS");
        super.displayDetails();
        System.out.println("Bus Type: " + type);
        System.out.println("Bus route: " + route);
        super.design();
    }
}