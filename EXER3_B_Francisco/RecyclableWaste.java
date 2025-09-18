public class RecyclableWaste extends Waste {
    protected String materialType;

    public RecyclableWaste(String name, double weight, String materialType) {
        super(name, weight);
        this.materialType = materialType;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Material Type: " + materialType);
    }

    @Override
    public void dispose() {
        System.out.println("Place in recycling bin for " + materialType + ".");
    }
}