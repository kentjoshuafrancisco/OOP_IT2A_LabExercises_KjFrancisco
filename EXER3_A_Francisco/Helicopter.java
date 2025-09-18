public class Helicopter extends AirTransport {
    public Helicopter(String name, int capacity, double speed, double maxAltitude) {
        super(name, capacity, speed, maxAltitude);
    }
    public void hover() { System.out.println(name + " is hovering in the air."); }
    
}
 
