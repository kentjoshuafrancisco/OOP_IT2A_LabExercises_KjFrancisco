public class SpaceShuttle extends AirTransport {
    public SpaceShuttle(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed, maxAltitude);
    }
    public void enterOrbit() { System.out.println(name + " is entering Earth's orbit."); }
}

