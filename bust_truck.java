ava
// Superclass Vehicle
class Vehicle {
    String vehicleModel;
    String registrationNumber;
    double vehicleSpeed;
    double fuelCapacity;
    double fuelConsumption;

    // Parameterized constructor
    public Vehicle(String model, String regNum, double speed, double capacity, double consumption) {
        this.vehicleModel = model;
        this.registrationNumber = regNum;
        this.vehicleSpeed = speed;
        this.fuelCapacity = capacity;
        this.fuelConsumption = consumption;
    }

    // Getters and Setters
    // Fuel needed method
    public double fuelNeeded(double distance) {
        return distance / fuelConsumption;
    }

    // Distance covered method
    public double distanceCovered(double time) {
        return vehicleSpeed * time;
    }

    // Display method
    public void display() {
        System.out.println("Vehicle Model: " + vehicleModel);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Vehicle Speed: " + vehicleSpeed + " km/hour");
        System.out.println("Fuel Capacity: " + fuelCapacity + " liters");
        System.out.println("Fuel Consumption: " + fuelConsumption + " kilometers/liter");
    }
}

// Subclass Truck
class Truck extends Vehicle {
    double cargoWeightLimit;

    // Parameterized constructor
    public Truck(String model, String regNum, double speed, double capacity, double consumption, double weightLimit) {
        super(model, regNum, speed, capacity, consumption);
        this.cargoWeightLimit = weightLimit;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Cargo Weight Limit: " + cargoWeightLimit + " kilograms");
    }
}

// Subclass Bus
class Bus extends Vehicle {
    int numOfPassengers;

    // Parameterized constructor
    public Bus(String model, String regNum, double speed, double capacity, double consumption, int passengers) {
        super(model, regNum, speed, capacity, consumption);
        this.numOfPassengers = passengers;
    }

    // Override display method
    @Override
    public void display() {
        super.display();
        System.out.println("Number of Passengers: " + numOfPassengers);
    }
}

// Driver class Transport
public class Transport {
    public static void main(String[] args) {
        // Create an instance of class Truck
        Truck truck = new Truck("Truck Model", "TRK123", 60.0, 100.0, 10.0, 5000.0);
        // Create an instance of class Bus
        Bus bus = new Bus("Bus Model", "BUS456", 50.0, 80.0, 8.0, 30);

        // Call fuelNeeded(), distanceCovered(), and display() methods using objects of these classes
        System.out.println("Fuel needed for 100 km by Truck: " + truck.fuelNeeded(100));
        System.out.println("Distance covered by Bus in 2 hours: " + bus.distanceCovered(2));

        System.out.println("\nTruck Details:");
        truck.display();

        System.out.println("\nBus Details:");
        bus.display();
    }
}
