public class ResidualWaste extends Waste {
    protected boolean isHazardous;

    public ResidualWaste(String name, double weight, boolean isHazardous) {
        super(name, weight);
        this.isHazardous = isHazardous;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Hazardous: " + (isHazardous ? "Yes" : "No"));
    }

    @Override
    public void dispose() {
        if (isHazardous) {
            System.out.println("Dispose at hazardous waste collection point.");
        } else {
            System.out.println("Place in residual waste bin.");
        }
    }
}