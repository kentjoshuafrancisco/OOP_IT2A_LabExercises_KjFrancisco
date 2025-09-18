public class Ship extends WaterTransport {
    public Ship(String name, int capacity, double speed, double displacement) {
        super(name, capacity, speed, displacement);
    }
    public void soundHorn() { System.out.println(name + " sounds its horn!"); }
}
