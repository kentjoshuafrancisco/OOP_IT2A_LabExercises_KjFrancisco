public class AirTransport extends Transportation {
    private double maxAltitude; // in meters

    public AirTransport(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed); // Call superclass constructor
        this.maxAltitude = maxAltitude;
    }

    public void takeOff() {
        System.out.println(name + " is taking off.");
    }

    public void land() {
        System.out.println(name + " is landing.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Max Altitude: " + maxAltitude + " meters");
    }
}