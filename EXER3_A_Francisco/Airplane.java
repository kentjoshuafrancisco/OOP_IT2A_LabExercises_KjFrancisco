public class Airplane extends AirTransport {
    public Airplane(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed, maxAltitude);
    }
    public void engageAutopilot() { System.out.println(name + "'s autopilot is engaged."); }
}
 
