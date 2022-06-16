public class SoapBox extends ProductBox {
    private int weight;

    public SoapBox(String tape, String name, int volume, int weight) {
        super(tape, name, volume);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getTape() + " | " + getName() + " | " + getVolume() + " | " + getWeight() + " | ";
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
