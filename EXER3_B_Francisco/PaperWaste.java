public class PaperWaste extends RecyclableWaste {
    public PaperWaste(String name, double weight) {
        super(name, weight, "Paper");
    }

    @Override
    public void dispose() {
        System.out.println("Recycle in blue paper bin.");
    }
}
