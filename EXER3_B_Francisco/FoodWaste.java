public class FoodWaste extends BiodegradableWaste {
    public FoodWaste(String name, double weight) {
        super(name, weight, true); // Food waste is compostable
    }

    @Override
    public void dispose() {
        System.out.println("Compost food waste properly.");
    }
}