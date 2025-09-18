public class WaterTransport extends Transportation {
    private double displacement; // in tons

    public WaterTransport(String name, int capacity, double speed, double displacement) {
        super(name, capacity, speed);
        this.displacement = displacement;
    }

    public void sail() {
        System.out.println(name + " is sailing on water.");
    }

    public void dock() {
        System.out.println(name + " is docking.");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Displacement: " + displacement + " tons");
    }
}