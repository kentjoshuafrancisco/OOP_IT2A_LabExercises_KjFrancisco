public class LandTransport extends Transportation {
    private int numWheels;

    public LandTransport(String name, int capacity, double speed, int numWheels) {
        super(name, capacity, speed);
        this.numWheels = numWheels;
    }

    public void drive() {
        System.out.println(name + " is driving on land.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Number of Wheels: " + numWheels);
    }
}