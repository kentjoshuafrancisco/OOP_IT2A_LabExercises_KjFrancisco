public class GardenWaste extends BiodegradableWaste {
    public GardenWaste(String name, double weight) {
        super(name, weight, true);
    }

    @Override
    public void dispose() {
        System.out.println("Add garden waste to compost or green waste bin.");
    }
}