public class ProjectTester {
    public static void main(String[] args) {
        System.out.println("==========================================");
        System.out.println("          Waste Management System         ");
        System.out.println("==========================================\n");

    
        System.out.println("GENERAL WASTE");
        Waste generalWaste = new Waste("Unknown Waste", 1.0);
        generalWaste.describe();
        generalWaste.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("RECYCLABLE WASTE - Plastic");
        PlasticWaste plastic = new PlasticWaste("Plastic Bottle", 0.3);
        plastic.describe();
        plastic.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("RECYCLABLE WASTE - Paper");
        PaperWaste paper = new PaperWaste("Newspaper", 0.2);
        paper.describe();
        paper.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("BIODEGRADABLE WASTE - Food");
        FoodWaste food = new FoodWaste("Banana Peel", 0.1);
        food.describe();
        food.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("➤ BIODEGRADABLE WASTE - Garden");
        GardenWaste garden = new GardenWaste("Dry Leaves", 0.5);
        garden.describe();
        garden.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("ESIDUAL WASTE - Hazardous");
        HazardousWaste battery = new HazardousWaste("Used Battery", 0.25);
        battery.describe();
        battery.dispose();
        System.out.println("------------------------------------------\n");

        
        System.out.println("RESIDUAL WASTE - Non-Hazardous");
        NonHazardousWaste wrapper = new NonHazardousWaste("Chip Wrapper", 0.05);
        wrapper.describe();
        wrapper.dispose();
        System.out.println("------------------------------------------\n");

        System.out.println("l waste items processed successfully!");
    }
}


