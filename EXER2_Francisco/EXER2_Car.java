public class Car {
    private String brand;
    private String logo;
    private String origin;
    private String color;
    private String plateNo;
    private String chassisNo;
    private double price;
    private double speed;   // newly added
    private double height;  // newly added

    // No-argument constructor
    public Car() {
        this.brand = "Unknown";
        this.logo = "Unknown";
        this.origin = "Unknown";
        this.color = "No Color";
        this.plateNo = "No PlateNumber";
        this.chassisNo = "No Chassis No Yet!";
        this.price = 0.0;
        this.speed = 0.0;
        this.height = 0.0;
    }

    // Parameterized constructor
    public Car(String brand, String logo, String origin, 
               String color, String plateNo, String chassisNo, 
               double price, double speed, double height) {
        this.brand = brand;
        this.logo = logo;
        this.origin = origin;
        this.color = color;
        this.plateNo = plateNo;
        this.chassisNo = chassisNo;
        this.price = price;
        this.speed = speed;
        this.height = height;
    }

    // Method to display car information
    public void displayInfo() {
        String info = "";
        info += "Brand: " + this.brand;
        info += "\nLogo: " + this.logo;
        info += "\nOrigin: " + this.origin;
        info += "\nColor: " + this.color;
        info += "\nPlateNo: " + this.plateNo;
        info += "\nChassisNo: " + this.chassisNo;
        info += "\nPrice: " + this.price;
        info += "\nSpeed: " + this.speed + " km/h";
        info += "\nHeight: " + this.height + " m";

        System.out.println(info);
        System.out.println("-----------------------------");
    }
}

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

OUTPUT:

Brand: BMW
Logo: BMW Logo
Origin: Germany
Color: Black
PlateNo: BMW123
ChassisNo: CH001
Price: 6000000.0
Speed: 250.0 km/h
Height: 1.7 m
-----------------------------
Brand: Cadillac
Logo: Cadillac Logo
Origin: USA
Color: White
PlateNo: CAD456
ChassisNo: CH002
Price: 7500000.0
Speed: 240.0 km/h
Height: 1.8 m
-----------------------------
Brand: Daimler
Logo: Daimler Logo
Origin: Germany
Color: Silver
PlateNo: DAI789
ChassisNo: CH003
Price: 7000000.0
Speed: 230.0 km/h
Height: 1.75 m
-----------------------------
Brand: Cupra
Logo: Cupra Logo
Origin: Spain
Color: Blue
PlateNo: CUP111
ChassisNo: CH004
Price: 3500000.0
Speed: 220.0 km/h
Height: 1.6 m
-----------------------------
Brand: Audi
Logo: Audi Logo
Origin: Germany
Color: Gray
PlateNo: AUD222
ChassisNo: CH005
Price: 5000000.0
Speed: 240.0 km/h
Height: 1.7 m
-----------------------------
Brand: Daewoo
Logo: Daewoo Logo
Origin: Korea
Color: Green
PlateNo: DAE333
ChassisNo: CH006
Price: 1200000.0
Speed: 180.0 km/h
Height: 1.5 m
-----------------------------
Brand: Brabus
Logo: Brabus Logo
Origin: Germany
Color: Red
PlateNo: BRA444
ChassisNo: CH007
Price: 1.5E7
Speed: 260.0 km/h
Height: 1.9 m
-----------------------------
Brand: BYD
Logo: BYD Logo
Origin: China
Color: Orange
PlateNo: BYD555
ChassisNo: CH008
Price: 2000000.0
Speed: 200.0 km/h
Height: 1.6 m
-----------------------------
Brand: Tesla
Logo: Tesla Logo
Origin: USA
Color: Yellow
PlateNo: TES666
ChassisNo: CH009
Price: 8000000.0
Speed: 250.0 km/h
Height: 1.7 m
-----------------------------
Brand: Lamborghini
Logo: Lambo Logo
Origin: Italy
Color: Purple
PlateNo: LAM777
ChassisNo: CH010
Price: 2.0E7
Speed: 320.0 km/h
Height: 1.15 m
-----------------------------
