import java.util.Random;

public class Main {
    public static void main(String... args) {
        Motorcycle motor = new Motorcycle("Kawasaki Ninja", 165, 10, "Black & Gold", 400, 180);
        Car car = new Car("Tesla Cyber Truck", 200, 0, "Black", "Electric", "Automatic");
        Bus bus = new Bus("Yutong Ceres Bus", 90, 250, "Yellow", "Air-Conditioned", "Cebu - Bantayan Island");
        boolean doorOpen = false;
        boolean wiperOn = false;
        
        motor.banking();
        motor.wheelie();
        motor.displayDetails();

        car.toggleDoor(doorOpen);
        car.toggleWiper(wiperOn);
        car.displayDetails();

        bus.pickUpPassenger();
        bus.destination();
        bus.displayDetails();
    }
}