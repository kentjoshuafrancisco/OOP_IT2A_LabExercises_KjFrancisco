public class BiodegradableWaste extends Waste {
    protected boolean isCompostable;

    public BiodegradableWaste(String name, double weight, boolean isCompostable) {
        super(name, weight);
        this.isCompostable = isCompostable;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Compostable: " + (isCompostable ? "Yes" : "No"));
    }

    @Override
    public void dispose() {
        if (isCompostable) {
            System.out.println("Place in the compost bin.");
        } else {
            System.out.println("Place in the biodegradable waste bin.");
        }
    }
}