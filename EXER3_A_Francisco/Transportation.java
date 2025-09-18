public class Transportation {
    protected String name;
    protected int capacity;
    protected double speed; // Speed in km/h

    public Transportation(String name, int capacity, double speed) {
        this.name = name;
        this.capacity = capacity;
        this.speed = speed;
    }

    public void move() {
        System.out.println(name + " is moving at " + speed + " km/h.");
    }

    public void stop() {
        System.out.println(name + " has stopped.");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Capacity: " + capacity + " people/kg");
        System.out.println("Speed: " + speed + " km/h");
    }
}