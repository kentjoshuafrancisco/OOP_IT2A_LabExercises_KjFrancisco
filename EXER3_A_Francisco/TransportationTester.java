public class TransportationTester {
    public static void main(String[] args) {
        System.out.println("--- Air Transport ---");
        Helicopter heli = new Helicopter("Bell 429", 8, 287, 6096);
        heli.displayInfo();
        heli.takeOff();
        heli.hover();
        heli.land();

        System.out.println("\n--- Land Transport ---");
        Truck semiTruck = new Truck("Peterbilt 379", 3, 110, 18);
        semiTruck.displayInfo();
        semiTruck.drive();
        semiTruck.loadCargo();
        
        Kariton pushCart = new Kariton("Wooden Kariton", 200);
        pushCart.displayInfo();
        pushCart.move();
        pushCart.stop();

        System.out.println("\n--- Water Transport ---");
        Ship titanic = new Ship("RMS Titanic", 2435, 39, 52310);
        titanic.displayInfo();
        titanic.sail();
        titanic.soundHorn();
        
        Submarine nautilus = new Submarine("Nautilus", 116, 43, 4000);
        nautilus.displayInfo();
        nautilus.sail();
        nautilus.dive();
        nautilus.dock();
    }
}
