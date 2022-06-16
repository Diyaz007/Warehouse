public abstract class ProductBox {
    private String tape;
    private String name;
    private int volume;

    public ProductBox(String tape, String name, int volume) {
        this.tape = tape;
        this.name = name;
        this.volume = volume;
    }

    public String getTape() {
        return tape;
    }

    public void setTape(String tape) {
        this.tape = tape;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public abstract String toString();
}
