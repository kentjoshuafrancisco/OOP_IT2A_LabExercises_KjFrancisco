public class NonHazardousWaste extends ResidualWaste {
    public NonHazardousWaste(String name, double weight) {
        super(name, weight, false);
    }

    @Override
    public void dispose() {
        System.out.println("Place in general residual waste bin.");
    }
}