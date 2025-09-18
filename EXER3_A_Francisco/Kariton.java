public class Kariton extends LandTransport {
    public Kariton(String name, int capacity) {
        super(name, capacity, 3, 2); // A pushcart has low speed
    }
    @Override
    public void move() { System.out.println(name + " is being pushed."); }
}
    