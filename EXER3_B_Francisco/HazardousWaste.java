public class HazardousWaste extends ResidualWaste {
    public HazardousWaste(String name, double weight) {
        super(name, weight, true);
    }

    @Override
    public void dispose() {
        System.out.println("Hazardous! Take to a certified hazardous waste facility.");
    }
}
