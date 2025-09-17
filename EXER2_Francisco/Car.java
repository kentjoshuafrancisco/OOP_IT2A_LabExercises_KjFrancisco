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
        this.brand = "No Brand";
        this.logo = "No Logo";
        this.origin = "No Origin";
        this.color = "No Color";
        this.plateNo = "No Plate Number";
        this.chassisNo = "No Chassis Number Yet!";
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
        info += "\nPlate No: " + this.plateNo;
        info += "\nChassis No: " + this.chassisNo;
        info += "\nPrice: PHP " + this.price;
        info += "\nSpeed: " + this.speed + " km/h";
        info += "\nHeight: " + this.height + " m";

        System.out.println(info);
        System.out.println("-----------------------------");
    }
}

