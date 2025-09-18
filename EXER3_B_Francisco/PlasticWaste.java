public class PlasticWaste extends RecyclableWaste {
    public PlasticWaste(String name, double weight) {
        super(name, weight, "Plastic");
    }

    @Override
    public void dispose() {
        System.out.println("Recycle at plastic recycling station.");
    }
}

