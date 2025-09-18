public class Truck extends LandTransport {
    public Truck(String name, int capacity, double speed, int numWheels) {
        super(name, capacity, speed, numWheels);
    }
    public void loadCargo() { System.out.println(name + " is loading cargo."); }
}
    