public class Submarine extends WaterTransport {
    public Submarine(String name, int capacity, double speed, double displacement) {
        super(name, capacity, speed, displacement);
    }
    public void dive() { System.out.println(name + " is diving underwater."); }
}