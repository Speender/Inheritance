import java.util.Random;

public class Main {
    public static void main(String... args) {
        Motorcycle motor = new Motorcycle("Kawasaki Ninja", 165, 10, "Black & Gold", 400, 180);
        Car car = new Car("Tesla Cyber Truck", 200, 0, "Black", "Electric", "Automatic");
        Bus bus = new Bus("Yutong Ceres Bus", 90, 250, "Yellow", "Air-Conditioned", "Cebu - Bantayan Island");
        Random rand = new Random();
        boolean doorOpen = rand.nextBoolean();
        boolean wiperOn = rand.nextBoolean();
        
        motor.displayDetails();
        motor.banking();
        motor.wheelie();

        car.displayDetails();
        car.toggleDoor(doorOpen);
        car.toggleWiper(wiperOn);

        bus.displayDetails();
        bus.pickUpPassenger();
        bus.destination();
    }
}
