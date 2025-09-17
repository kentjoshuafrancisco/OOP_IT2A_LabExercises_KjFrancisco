public class CarTester {
    public static void main(String[] args) {
        // Create exactly 10 car objects
        Car[] cars = new Car[10];

        cars[0] = new Car("BMW", "BMW Logo", "Germany", "Black", "BMW123", "CH001", 6000000, 250, 1.7);
        cars[1] = new Car("Cadillac", "Cadillac Logo", "USA", "White", "CAD456", "CH002", 7500000, 240, 1.8);
        cars[2] = new Car("Daimler", "Daimler Logo", "Germany", "Silver", "DAI789", "CH003", 7000000, 230, 1.75);
        cars[3] = new Car("Cupra", "Cupra Logo", "Spain", "Blue", "CUP111", "CH004", 3500000, 220, 1.6);
        cars[4] = new Car("Audi", "Audi Logo", "Germany", "Gray", "AUD222", "CH005", 5000000, 240, 1.7);
        cars[5] = new Car("Daewoo", "Daewoo Logo", "Korea", "Green", "DAE333", "CH006", 1200000, 180, 1.5);
        cars[6] = new Car("Brabus", "Brabus Logo", "Germany", "Red", "BRA444", "CH007", 15000000, 260, 1.9);
        cars[7] = new Car("BYD", "BYD Logo", "China", "Orange", "BYD555", "CH008", 2000000, 200, 1.6);
        cars[8] = new Car("Tesla", "Tesla Logo", "USA", "Yellow", "TES666", "CH009", 8000000, 250, 1.7);
        cars[9] = new Car("Lamborghini", "Lambo Logo", "Italy", "Purple", "LAM777", "CH010", 20000000, 320, 1.15);

        // Display all car details
        for (Car car : cars) {
            car.displayInfo();
        }
    }
}
