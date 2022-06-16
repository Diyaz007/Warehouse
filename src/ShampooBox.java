public class ShampooBox extends ProductBox {
    private int shampooVolume;

    public ShampooBox(String tape, String name, int volume, int shampooVolume) {
        super(tape, name, volume);
        this.shampooVolume = shampooVolume;
    }

    @Override
    public String toString() {
        return getTape() + " | " + getName() + " | " + getVolume() + " | " + getShampooVolume() + " | ";
    }

    public int getShampooVolume() {
        return shampooVolume;
    }

    public void setShampooVolume(int shampooVolume) {
        this.shampooVolume = shampooVolume;
    }
}
