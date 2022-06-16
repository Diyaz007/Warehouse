public class DrinksBox extends ProductBox {
    private int bottleVolume;

    public DrinksBox(String tape, String name, int volume, int bottleVolume) {
        super(tape, name, volume);
        this.bottleVolume = bottleVolume;
    }

    @Override
    public String toString() {
        return getTape() + " | " + getName() + " | " + getVolume() + " | " + getBottleVolume() + " | ";
    }

    public int getBottleVolume() {
        return bottleVolume;
    }

    public void setBottleVolume(int bottleVolume) {
        this.bottleVolume = bottleVolume;
    }
}
